package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Zona;
import vista.*;

public class ZonaDAO extends Thread {
	private Zona zona;
	public ArrayList<Zona> resultadoZona;

	@Override
	public void run() {
		try{
			actualizarZona("");
		} catch (Exception e) {
			System.out.println("Error al generar Zona");
		}
		yield();
	}

	public void actualizarZona(String condicion) {
		resultadoZona = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  zona " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				zona = new Zona(
						rs.getInt("zon_cod"),
						rs.getString("zon_descri"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(zona);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Zona zona) {
		String q = " insert into zona( zon_descri,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, zona.getZon_descri());
			ps.setString(2, zona.getFechasct());
			ps.setInt(3, zona.getUsuariosct());
			ps.setString(4, zona.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Zona", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Zona zona) {
		String q = " update zona set  zon_descri=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, zona.getZon_descri());
			ps.setString(2, zona.getFechasct());
			ps.setInt(3, zona.getUsuariosct());
			ps.setString(4, zona.getMaquinasct());
			ps.setInt(5, zona.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Zona", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Zona zona) {
		String q = " delete from zona where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, zona.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Zona", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}