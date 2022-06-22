package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.*;

public class ModeloDAO extends Thread {
	private Modelo mode;
	public ArrayList<Modelo> resultadoModelo;

	@Override
	public void run() {
		try{
			actualizarModelo("");
		} catch (Exception e) {
			System.out.println("Error al generar Modelo");
		}
		yield();
	}

	public void actualizarModelo(String condicion) {
		resultadoModelo = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  modelo " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				mode = new Modelo(
						rs.getInt("mo_cod"),
						rs.getString("mo_descripcion"),
						rs.getInt("mo_borrado")
			);
			arr.add(mode);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Modelo mode) {
		String q = " insert into modelo( mo_descripcion,  mo_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mode.getMo_descripcion());
			ps.setInt(2, mode.getMo_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Modelo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Modelo mode) {
		String q = " update modelo set  mo_descripcion=?,  mo_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mode.getMo_descripcion());
			ps.setInt(2, mode.getMo_borrado());
			ps.setInt(3, mode.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Modelo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Modelo mode) {
		String q = " delete from modelo where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, mode.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Modelo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}