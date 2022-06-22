package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cambhabitacion;
import vista.*;

public class CambhabitacionDAO extends Thread {
	private Cambhabitacion camb;
	public ArrayList<Cambhabitacion> resultadoCambhabitacion;

	@Override
	public void run() {
		try{
			actualizarCambhabitacion("");
		} catch (Exception e) {
			System.out.println("Error al generar Cambhabitacion");
		}
		yield();
	}

	public void actualizarCambhabitacion(String condicion) {
		resultadoCambhabitacion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cambhabitacion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				camb = new Cambhabitacion(
						rs.getInt("cmh_codigo"),
						rs.getInt("cmh_usuario"),
						rs.getString("cmh_motivo"),
						rs.getString("cmh_fecha"),
						rs.getString("cmh_hora"),
						rs.getInt("cmh_habitacioninicio"),
						rs.getInt("cmh_habitacionfinal"),
						rs.getInt("cmh_registro"),
						rs.getInt("cmh_borrado")
			);
			arr.add(camb);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cambhabitacion camb) {
		String q = " insert into cambhabitacion( cmh_usuario,  cmh_motivo,  cmh_fecha,  cmh_hora,  cmh_habitacioninicio,  cmh_habitacionfinal,  cmh_registro,  cmh_borrado) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, camb.getCmh_usuario());
			ps.setString(2, camb.getCmh_motivo());
			ps.setString(3, camb.getCmh_fecha());
			ps.setString(4, camb.getCmh_hora());
			ps.setInt(5, camb.getCmh_habitacioninicio());
			ps.setInt(6, camb.getCmh_habitacionfinal());
			ps.setInt(7, camb.getCmh_registro());
			ps.setInt(8, camb.getCmh_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cambhabitacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cambhabitacion camb) {
		String q = " update cambhabitacion set  cmh_usuario=?,  cmh_motivo=?,  cmh_fecha=?,  cmh_hora=?,  cmh_habitacioninicio=?,  cmh_habitacionfinal=?,  cmh_registro=?,  cmh_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, camb.getCmh_usuario());
			ps.setString(2, camb.getCmh_motivo());
			ps.setString(3, camb.getCmh_fecha());
			ps.setString(4, camb.getCmh_hora());
			ps.setInt(5, camb.getCmh_habitacioninicio());
			ps.setInt(6, camb.getCmh_habitacionfinal());
			ps.setInt(7, camb.getCmh_registro());
			ps.setInt(8, camb.getCmh_borrado());
			ps.setInt(9, camb.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cambhabitacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cambhabitacion camb) {
		String q = " delete from cambhabitacion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, camb.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cambhabitacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}