package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Asistencia;
import vista.*;

public class AsistenciaDAO extends Thread {
	private Asistencia asis;
	public ArrayList<Asistencia> resultadoAsistencia;

	@Override
	public void run() {
		try{
			actualizarAsistencia("");
		} catch (Exception e) {
			System.out.println("Error al generar Asistencia");
		}
		yield();
	}

	public void actualizarAsistencia(String condicion) {
		resultadoAsistencia = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  asistencia " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				asis = new Asistencia(
						rs.getInt("as_codigo"),
						rs.getInt("as_usuario"),
						rs.getObject("as_pc"),
						rs.getObject("as_observacionrecepcion"),
						rs.getString("as_fechaingreso"),
						rs.getString("as_fechasalida"),
						rs.getInt("as_entregado"),
						rs.getDouble("as_valoradicional"),
						rs.getInt("as_borrado"),
						rs.getObject("as_cliente"),
						rs.getInt("as_estado"),
						rs.getObject("as_pcentregado"),
						rs.getInt("as_usuarioentregado"),
						rs.getObject("as_observacionasistencia"),
						rs.getObject("as_observacionentrega")
			);
			arr.add(asis);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Asistencia asis) {
		String q = " insert into asistencia( as_usuario,  as_pc,  as_observacionrecepcion,  as_fechaingreso,  as_fechasalida,  as_entregado,  as_valoradicional,  as_borrado,  as_cliente,  as_estado,  as_pcentregado,  as_usuarioentregado,  as_observacionasistencia,  as_observacionentrega) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, asis.getAs_usuario());
			ps.setObject(2, asis.getAs_pc());
			ps.setObject(3, asis.getAs_observacionrecepcion());
			ps.setString(4, asis.getAs_fechaingreso());
			ps.setString(5, asis.getAs_fechasalida());
			ps.setInt(6, asis.getAs_entregado());
			ps.setDouble(7, asis.getAs_valoradicional());
			ps.setInt(8, asis.getAs_borrado());
			ps.setObject(9, asis.getAs_cliente());
			ps.setInt(10, asis.getAs_estado());
			ps.setObject(11, asis.getAs_pcentregado());
			ps.setInt(12, asis.getAs_usuarioentregado());
			ps.setObject(13, asis.getAs_observacionasistencia());
			ps.setObject(14, asis.getAs_observacionentrega());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Asistencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Asistencia asis) {
		String q = " update asistencia set  as_usuario=?,  as_pc=?,  as_observacionrecepcion=?,  as_fechaingreso=?,  as_fechasalida=?,  as_entregado=?,  as_valoradicional=?,  as_borrado=?,  as_cliente=?,  as_estado=?,  as_pcentregado=?,  as_usuarioentregado=?,  as_observacionasistencia=?,  as_observacionentrega=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, asis.getAs_usuario());
			ps.setObject(2, asis.getAs_pc());
			ps.setObject(3, asis.getAs_observacionrecepcion());
			ps.setString(4, asis.getAs_fechaingreso());
			ps.setString(5, asis.getAs_fechasalida());
			ps.setInt(6, asis.getAs_entregado());
			ps.setDouble(7, asis.getAs_valoradicional());
			ps.setInt(8, asis.getAs_borrado());
			ps.setObject(9, asis.getAs_cliente());
			ps.setInt(10, asis.getAs_estado());
			ps.setObject(11, asis.getAs_pcentregado());
			ps.setInt(12, asis.getAs_usuarioentregado());
			ps.setObject(13, asis.getAs_observacionasistencia());
			ps.setObject(14, asis.getAs_observacionentrega());
			ps.setInt(15, asis.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Asistencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Asistencia asis) {
		String q = " delete from asistencia where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, asis.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Asistencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}