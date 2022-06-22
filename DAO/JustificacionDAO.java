package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Justificacion;
import vista.*;

public class JustificacionDAO extends Thread {
	private Justificacion just;
	public ArrayList<Justificacion> resultadoJustificacion;

	@Override
	public void run() {
		try{
			actualizarJustificacion("");
		} catch (Exception e) {
			System.out.println("Error al generar Justificacion");
		}
		yield();
	}

	public void actualizarJustificacion(String condicion) {
		resultadoJustificacion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  justificacion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				just = new Justificacion(
						rs.getInt("jus_codigo"),
						rs.getInt("jus_empleado"),
						rs.getString("jus_observacion"),
						rs.getString("jus_fecha"),
						rs.getString("jus_fechajustificada"),
						rs.getString("jus_hora"),
						rs.getInt("jus_usuario"),
						rs.getString("jus_nombrepc"),
						rs.getInt("jus_tipo")
			);
			arr.add(just);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Justificacion just) {
		String q = " insert into justificacion( jus_empleado,  jus_observacion,  jus_fecha,  jus_fechajustificada,  jus_hora,  jus_usuario,  jus_nombrepc,  jus_tipo) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, just.getJus_empleado());
			ps.setString(2, just.getJus_observacion());
			ps.setString(3, just.getJus_fecha());
			ps.setString(4, just.getJus_fechajustificada());
			ps.setString(5, just.getJus_hora());
			ps.setInt(6, just.getJus_usuario());
			ps.setString(7, just.getJus_nombrepc());
			ps.setInt(8, just.getJus_tipo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Justificacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Justificacion just) {
		String q = " update justificacion set  jus_empleado=?,  jus_observacion=?,  jus_fecha=?,  jus_fechajustificada=?,  jus_hora=?,  jus_usuario=?,  jus_nombrepc=?,  jus_tipo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, just.getJus_empleado());
			ps.setString(2, just.getJus_observacion());
			ps.setString(3, just.getJus_fecha());
			ps.setString(4, just.getJus_fechajustificada());
			ps.setString(5, just.getJus_hora());
			ps.setInt(6, just.getJus_usuario());
			ps.setString(7, just.getJus_nombrepc());
			ps.setInt(8, just.getJus_tipo());
			ps.setInt(9, just.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Justificacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Justificacion just) {
		String q = " delete from justificacion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, just.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Justificacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}