package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Deuinicial;
import vista.*;

public class DeuinicialDAO extends Thread {
	private Deuinicial deui;
	public ArrayList<Deuinicial> resultadoDeuinicial;

	@Override
	public void run() {
		try{
			actualizarDeuinicial("");
		} catch (Exception e) {
			System.out.println("Error al generar Deuinicial");
		}
		yield();
	}

	public void actualizarDeuinicial(String condicion) {
		resultadoDeuinicial = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  deuinicial " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deui = new Deuinicial(
						rs.getInt("dini_nro"),
						rs.getString("dini_fecha"),
						rs.getString("dini_fecoperacion"),
						rs.getString("dini_fecpago"),
						rs.getDouble("dini_totoperacion"),
						rs.getInt("dini_cuorestante"),
						rs.getInt("dini_usuario"),
						rs.getDouble("dini_totpagado"),
						rs.getString("dini_cliente"),
						rs.getString("dini_producto"),
						rs.getInt("dini_borrado"),
						rs.getInt("dini_numcredito"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(deui);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Deuinicial deui) {
		String q = " insert into deuinicial( dini_fecha,  dini_fecoperacion,  dini_fecpago,  dini_totoperacion,  dini_cuorestante,  dini_usuario,  dini_totpagado,  dini_cliente,  dini_producto,  dini_borrado,  dini_numcredito,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, deui.getDini_fecha());
			ps.setString(2, deui.getDini_fecoperacion());
			ps.setString(3, deui.getDini_fecpago());
			ps.setDouble(4, deui.getDini_totoperacion());
			ps.setInt(5, deui.getDini_cuorestante());
			ps.setInt(6, deui.getDini_usuario());
			ps.setDouble(7, deui.getDini_totpagado());
			ps.setString(8, deui.getDini_cliente());
			ps.setString(9, deui.getDini_producto());
			ps.setInt(10, deui.getDini_borrado());
			ps.setInt(11, deui.getDini_numcredito());
			ps.setString(12, deui.getFechasct());
			ps.setInt(13, deui.getUsuariosct());
			ps.setString(14, deui.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Deuinicial", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Deuinicial deui) {
		String q = " update deuinicial set  dini_fecha=?,  dini_fecoperacion=?,  dini_fecpago=?,  dini_totoperacion=?,  dini_cuorestante=?,  dini_usuario=?,  dini_totpagado=?,  dini_cliente=?,  dini_producto=?,  dini_borrado=?,  dini_numcredito=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, deui.getDini_fecha());
			ps.setString(2, deui.getDini_fecoperacion());
			ps.setString(3, deui.getDini_fecpago());
			ps.setDouble(4, deui.getDini_totoperacion());
			ps.setInt(5, deui.getDini_cuorestante());
			ps.setInt(6, deui.getDini_usuario());
			ps.setDouble(7, deui.getDini_totpagado());
			ps.setString(8, deui.getDini_cliente());
			ps.setString(9, deui.getDini_producto());
			ps.setInt(10, deui.getDini_borrado());
			ps.setInt(11, deui.getDini_numcredito());
			ps.setString(12, deui.getFechasct());
			ps.setInt(13, deui.getUsuariosct());
			ps.setString(14, deui.getMaquinasct());
			ps.setInt(15, deui.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Deuinicial", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Deuinicial deui) {
		String q = " delete from deuinicial where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deui.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Deuinicial", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}