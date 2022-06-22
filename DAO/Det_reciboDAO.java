package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Det_recibo;
import vista.*;

public class Det_reciboDAO extends Thread {
	private Det_recibo det_;
	public ArrayList<Det_recibo> resultadoDet_recibo;

	@Override
	public void run() {
		try{
			actualizarDet_recibo("");
		} catch (Exception e) {
			System.out.println("Error al generar Det_recibo");
		}
		yield();
	}

	public void actualizarDet_recibo(String condicion) {
		resultadoDet_recibo = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  det_recibo " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				det_ = new Det_recibo(
						rs.getInt("dr_nro"),
						rs.getInt("dr_nropago"),
						rs.getInt("dr_nrocuota"),
						rs.getDouble("dr_monto"),
						rs.getString("dr_fecha"),
						rs.getInt("dr_borrado"),
						rs.getInt("dr_numcredito"),
						rs.getDouble("dr_montointeres"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(det_);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Det_recibo det_) {
		String q = " insert into det_recibo( dr_nropago,  dr_nrocuota,  dr_monto,  dr_fecha,  dr_borrado,  dr_numcredito,  dr_montointeres,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, det_.getDr_nropago());
			ps.setInt(2, det_.getDr_nrocuota());
			ps.setDouble(3, det_.getDr_monto());
			ps.setString(4, det_.getDr_fecha());
			ps.setInt(5, det_.getDr_borrado());
			ps.setInt(6, det_.getDr_numcredito());
			ps.setDouble(7, det_.getDr_montointeres());
			ps.setString(8, det_.getFechasct());
			ps.setInt(9, det_.getUsuariosct());
			ps.setString(10, det_.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Det_recibo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Det_recibo det_) {
		String q = " update det_recibo set  dr_nropago=?,  dr_nrocuota=?,  dr_monto=?,  dr_fecha=?,  dr_borrado=?,  dr_numcredito=?,  dr_montointeres=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, det_.getDr_nropago());
			ps.setInt(2, det_.getDr_nrocuota());
			ps.setDouble(3, det_.getDr_monto());
			ps.setString(4, det_.getDr_fecha());
			ps.setInt(5, det_.getDr_borrado());
			ps.setInt(6, det_.getDr_numcredito());
			ps.setDouble(7, det_.getDr_montointeres());
			ps.setString(8, det_.getFechasct());
			ps.setInt(9, det_.getUsuariosct());
			ps.setString(10, det_.getMaquinasct());
			ps.setInt(11, det_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Det_recibo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Det_recibo det_) {
		String q = " delete from det_recibo where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, det_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Det_recibo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}