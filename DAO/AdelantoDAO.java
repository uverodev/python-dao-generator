package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Adelanto;
import vista.*;

public class AdelantoDAO extends Thread {
	private Adelanto adel;
	public ArrayList<Adelanto> resultadoAdelanto;

	@Override
	public void run() {
		try{
			actualizarAdelanto("");
		} catch (Exception e) {
			System.out.println("Error al generar Adelanto");
		}
		yield();
	}

	public void actualizarAdelanto(String condicion) {
		resultadoAdelanto = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  adelanto " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				adel = new Adelanto(
						rs.getInt("ad_nro"),
						rs.getInt("ad_nrorecibo"),
						rs.getInt("ad_empleado"),
						rs.getInt("ad_borrado"),
						rs.getString("ad_fecha"),
						rs.getDouble("ad_monto"),
						rs.getString("ad_observacion"),
						rs.getInt("ad_usuario"),
						rs.getString("ad_hora"),
						rs.getInt("ad_nroliquidacion"),
						rs.getInt("ad_liquidado"),
						rs.getInt("ad_tipo"),
						rs.getInt("ad_liqgenerado"),
						rs.getObject("ad_pc"),
						rs.getInt("ad_cierrecajanro"),
						rs.getInt("ad_cierrecajagennro")
			);
			arr.add(adel);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Adelanto adel) {
		String q = " insert into adelanto( ad_nrorecibo,  ad_empleado,  ad_borrado,  ad_fecha,  ad_monto,  ad_observacion,  ad_usuario,  ad_hora,  ad_nroliquidacion,  ad_liquidado,  ad_tipo,  ad_liqgenerado,  ad_pc,  ad_cierrecajanro,  ad_cierrecajagennro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, adel.getAd_nrorecibo());
			ps.setInt(2, adel.getAd_empleado());
			ps.setInt(3, adel.getAd_borrado());
			ps.setString(4, adel.getAd_fecha());
			ps.setDouble(5, adel.getAd_monto());
			ps.setString(6, adel.getAd_observacion());
			ps.setInt(7, adel.getAd_usuario());
			ps.setString(8, adel.getAd_hora());
			ps.setInt(9, adel.getAd_nroliquidacion());
			ps.setInt(10, adel.getAd_liquidado());
			ps.setInt(11, adel.getAd_tipo());
			ps.setInt(12, adel.getAd_liqgenerado());
			ps.setObject(13, adel.getAd_pc());
			ps.setInt(14, adel.getAd_cierrecajanro());
			ps.setInt(15, adel.getAd_cierrecajagennro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Adelanto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Adelanto adel) {
		String q = " update adelanto set  ad_nrorecibo=?,  ad_empleado=?,  ad_borrado=?,  ad_fecha=?,  ad_monto=?,  ad_observacion=?,  ad_usuario=?,  ad_hora=?,  ad_nroliquidacion=?,  ad_liquidado=?,  ad_tipo=?,  ad_liqgenerado=?,  ad_pc=?,  ad_cierrecajanro=?,  ad_cierrecajagennro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, adel.getAd_nrorecibo());
			ps.setInt(2, adel.getAd_empleado());
			ps.setInt(3, adel.getAd_borrado());
			ps.setString(4, adel.getAd_fecha());
			ps.setDouble(5, adel.getAd_monto());
			ps.setString(6, adel.getAd_observacion());
			ps.setInt(7, adel.getAd_usuario());
			ps.setString(8, adel.getAd_hora());
			ps.setInt(9, adel.getAd_nroliquidacion());
			ps.setInt(10, adel.getAd_liquidado());
			ps.setInt(11, adel.getAd_tipo());
			ps.setInt(12, adel.getAd_liqgenerado());
			ps.setObject(13, adel.getAd_pc());
			ps.setInt(14, adel.getAd_cierrecajanro());
			ps.setInt(15, adel.getAd_cierrecajagennro());
			ps.setInt(16, adel.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Adelanto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Adelanto adel) {
		String q = " delete from adelanto where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, adel.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Adelanto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}