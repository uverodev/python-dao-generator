package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ubicacion;
import vista.*;

public class UbicacionDAO extends Thread {
	private Ubicacion ubic;
	public ArrayList<Ubicacion> resultadoUbicacion;

	@Override
	public void run() {
		try{
			actualizarUbicacion("");
		} catch (Exception e) {
			System.out.println("Error al generar Ubicacion");
		}
		yield();
	}

	public void actualizarUbicacion(String condicion) {
		resultadoUbicacion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ubicacion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				ubic = new Ubicacion(
						rs.getInt("ub_cod"),
						rs.getString("ub_descri"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(ubic);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ubicacion ubic) {
		String q = " insert into ubicacion( ub_descri,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, ubic.getUb_descri());
			ps.setString(2, ubic.getFechasct());
			ps.setInt(3, ubic.getUsuariosct());
			ps.setString(4, ubic.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ubicacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ubicacion ubic) {
		String q = " update ubicacion set  ub_descri=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, ubic.getUb_descri());
			ps.setString(2, ubic.getFechasct());
			ps.setInt(3, ubic.getUsuariosct());
			ps.setString(4, ubic.getMaquinasct());
			ps.setInt(5, ubic.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ubicacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ubicacion ubic) {
		String q = " delete from ubicacion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, ubic.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ubicacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}