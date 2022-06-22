package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Color;
import vista.*;

public class ColorDAO extends Thread {
	private Color colo;
	public ArrayList<Color> resultadoColor;

	@Override
	public void run() {
		try{
			actualizarColor("");
		} catch (Exception e) {
			System.out.println("Error al generar Color");
		}
		yield();
	}

	public void actualizarColor(String condicion) {
		resultadoColor = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  color " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				colo = new Color(
						rs.getInt("co_cod"),
						rs.getString("co_descripcion"),
						rs.getInt("co_borrado")
			);
			arr.add(colo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Color colo) {
		String q = " insert into color( co_descripcion,  co_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, colo.getCo_descripcion());
			ps.setInt(2, colo.getCo_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Color", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Color colo) {
		String q = " update color set  co_descripcion=?,  co_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, colo.getCo_descripcion());
			ps.setInt(2, colo.getCo_borrado());
			ps.setInt(3, colo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Color", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Color colo) {
		String q = " delete from color where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, colo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Color", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}