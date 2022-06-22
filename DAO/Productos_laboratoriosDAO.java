package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productos_laboratorios;
import vista.*;

public class Productos_laboratoriosDAO extends Thread {
	private Productos_laboratorios prod;
	public ArrayList<Productos_laboratorios> resultadoProductos_laboratorios;

	@Override
	public void run() {
		try{
			actualizarProductos_laboratorios("");
		} catch (Exception e) {
			System.out.println("Error al generar Productos_laboratorios");
		}
		yield();
	}

	public void actualizarProductos_laboratorios(String condicion) {
		resultadoProductos_laboratorios = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productos_laboratorios " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productos_laboratorios(
						rs.getInt("id"),
						rs.getString("nombre")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productos_laboratorios prod) {
		String q = " insert into productos_laboratorios( nombre) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getNombre());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productos_laboratorios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productos_laboratorios prod) {
		String q = " update productos_laboratorios set  nombre=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getNombre());
			ps.setInt(2, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productos_laboratorios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productos_laboratorios prod) {
		String q = " delete from productos_laboratorios where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productos_laboratorios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}