package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Datos;
import vista.*;

public class DatosDAO extends Thread {
	private Datos dato;
	public ArrayList<Datos> resultadoDatos;

	@Override
	public void run() {
		try{
			actualizarDatos("");
		} catch (Exception e) {
			System.out.println("Error al generar Datos");
		}
		yield();
	}

	public void actualizarDatos(String condicion) {
		resultadoDatos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  datos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				dato = new Datos(
						rs.getInt("id"),
						rs.getString("atributo"),
						rs.getString("valor")
			);
			arr.add(dato);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Datos dato) {
		String q = " insert into datos( atributo,  valor) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, dato.getAtributo());
			ps.setString(2, dato.getValor());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Datos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Datos dato) {
		String q = " update datos set  atributo=?,  valor=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, dato.getAtributo());
			ps.setString(2, dato.getValor());
			ps.setInt(3, dato.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Datos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Datos dato) {
		String q = " delete from datos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, dato.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Datos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}