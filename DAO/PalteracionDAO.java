package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Palteracion;
import vista.*;

public class PalteracionDAO extends Thread {
	private Palteracion palt;
	public ArrayList<Palteracion> resultadoPalteracion;

	@Override
	public void run() {
		try{
			actualizarPalteracion("");
		} catch (Exception e) {
			System.out.println("Error al generar Palteracion");
		}
		yield();
	}

	public void actualizarPalteracion(String condicion) {
		resultadoPalteracion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  palteracion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				palt = new Palteracion(
						rs.getInt("palt_nro"),
						rs.getString("palt_codprod"),
						rs.getDouble("palt_cantidad"),
						rs.getInt("palt_operacion"),
						rs.getInt("palt_numeroperacion"),
						rs.getString("palt_descripcion"),
						rs.getInt("palt_borrado"),
						rs.getString("palt_caja"),
						rs.getString("palt_fecha"),
						rs.getInt("palt_cierre"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("palt_nrocierre"),
						rs.getInt("palt_cierrecajagennro")
			);
			arr.add(palt);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Palteracion palt) {
		String q = " insert into palteracion( palt_codprod,  palt_cantidad,  palt_operacion,  palt_numeroperacion,  palt_descripcion,  palt_borrado,  palt_caja,  palt_fecha,  palt_cierre,  fechasct,  usuariosct,  maquinasct,  palt_nrocierre,  palt_cierrecajagennro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, palt.getPalt_codprod());
			ps.setDouble(2, palt.getPalt_cantidad());
			ps.setInt(3, palt.getPalt_operacion());
			ps.setInt(4, palt.getPalt_numeroperacion());
			ps.setString(5, palt.getPalt_descripcion());
			ps.setInt(6, palt.getPalt_borrado());
			ps.setString(7, palt.getPalt_caja());
			ps.setString(8, palt.getPalt_fecha());
			ps.setInt(9, palt.getPalt_cierre());
			ps.setString(10, palt.getFechasct());
			ps.setInt(11, palt.getUsuariosct());
			ps.setString(12, palt.getMaquinasct());
			ps.setInt(13, palt.getPalt_nrocierre());
			ps.setInt(14, palt.getPalt_cierrecajagennro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Palteracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Palteracion palt) {
		String q = " update palteracion set  palt_codprod=?,  palt_cantidad=?,  palt_operacion=?,  palt_numeroperacion=?,  palt_descripcion=?,  palt_borrado=?,  palt_caja=?,  palt_fecha=?,  palt_cierre=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  palt_nrocierre=?,  palt_cierrecajagennro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, palt.getPalt_codprod());
			ps.setDouble(2, palt.getPalt_cantidad());
			ps.setInt(3, palt.getPalt_operacion());
			ps.setInt(4, palt.getPalt_numeroperacion());
			ps.setString(5, palt.getPalt_descripcion());
			ps.setInt(6, palt.getPalt_borrado());
			ps.setString(7, palt.getPalt_caja());
			ps.setString(8, palt.getPalt_fecha());
			ps.setInt(9, palt.getPalt_cierre());
			ps.setString(10, palt.getFechasct());
			ps.setInt(11, palt.getUsuariosct());
			ps.setString(12, palt.getMaquinasct());
			ps.setInt(13, palt.getPalt_nrocierre());
			ps.setInt(14, palt.getPalt_cierrecajagennro());
			ps.setInt(15, palt.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Palteracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Palteracion palt) {
		String q = " delete from palteracion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, palt.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Palteracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}