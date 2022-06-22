package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Zafra;
import vista.*;

public class ZafraDAO extends Thread {
	private Zafra zafr;
	public ArrayList<Zafra> resultadoZafra;

	@Override
	public void run() {
		try{
			actualizarZafra("");
		} catch (Exception e) {
			System.out.println("Error al generar Zafra");
		}
		yield();
	}

	public void actualizarZafra(String condicion) {
		resultadoZafra = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  zafra " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				zafr = new Zafra(
						rs.getInt("za_id"),
						rs.getString("za_descripcion"),
						rs.getString("za_inicio"),
						rs.getString("za_fin"),
						rs.getInt("za_borrado")
			);
			arr.add(zafr);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Zafra zafr) {
		String q = " insert into zafra( za_descripcion,  za_inicio,  za_fin,  za_borrado) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, zafr.getZa_descripcion());
			ps.setString(2, zafr.getZa_inicio());
			ps.setString(3, zafr.getZa_fin());
			ps.setInt(4, zafr.getZa_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Zafra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Zafra zafr) {
		String q = " update zafra set  za_descripcion=?,  za_inicio=?,  za_fin=?,  za_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, zafr.getZa_descripcion());
			ps.setString(2, zafr.getZa_inicio());
			ps.setString(3, zafr.getZa_fin());
			ps.setInt(4, zafr.getZa_borrado());
			ps.setInt(5, zafr.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Zafra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Zafra zafr) {
		String q = " delete from zafra where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, zafr.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Zafra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}