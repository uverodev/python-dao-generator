package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Anfabricacion;
import vista.*;

public class AnfabricacionDAO extends Thread {
	private Anfabricacion anfa;
	public ArrayList<Anfabricacion> resultadoAnfabricacion;

	@Override
	public void run() {
		try{
			actualizarAnfabricacion("");
		} catch (Exception e) {
			System.out.println("Error al generar Anfabricacion");
		}
		yield();
	}

	public void actualizarAnfabricacion(String condicion) {
		resultadoAnfabricacion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  anfabricacion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				anfa = new Anfabricacion(
						rs.getInt("anfa_cod"),
						rs.getString("anfa_descripcion"),
						rs.getInt("anfa_borrado")
			);
			arr.add(anfa);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Anfabricacion anfa) {
		String q = " insert into anfabricacion( anfa_descripcion,  anfa_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, anfa.getAnfa_descripcion());
			ps.setInt(2, anfa.getAnfa_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Anfabricacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Anfabricacion anfa) {
		String q = " update anfabricacion set  anfa_descripcion=?,  anfa_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, anfa.getAnfa_descripcion());
			ps.setInt(2, anfa.getAnfa_borrado());
			ps.setInt(3, anfa.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Anfabricacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Anfabricacion anfa) {
		String q = " delete from anfabricacion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, anfa.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Anfabricacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}