package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventacre;
import vista.*;

public class VentacreDAO extends Thread {
	private Ventacre vent;
	public ArrayList<Ventacre> resultadoVentacre;

	@Override
	public void run() {
		try{
			actualizarVentacre("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventacre");
		}
		yield();
	}

	public void actualizarVentacre(String condicion) {
		resultadoVentacre = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventacre " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventacre(
						rs.getInt("venc_nro"),
						rs.getInt("venc_tipoperacion"),
						rs.getInt("venc_numventa"),
						rs.getString("venc_cliente"),
						rs.getInt("venc_cobrador"),
						rs.getString("venc_fecha"),
						rs.getString("venc_fechac"),
						rs.getInt("venc_tippago"),
						rs.getInt("venc_tipcobro"),
						rs.getInt("venc_cantcuota"),
						rs.getString("venc_fechaini"),
						rs.getDouble("venc_interescre"),
						rs.getDouble("venc_montxcuot"),
						rs.getDouble("venc_totalc"),
						rs.getDouble("venc_entretot"),
						rs.getDouble("venc_saldo"),
						rs.getDouble("venc_cdolar"),
						rs.getDouble("venc_creal"),
						rs.getDouble("venc_cpeso"),
						rs.getDouble("venc_ceuro"),
						rs.getInt("venc_cancelado"),
						rs.getInt("venc_borrado"),
						rs.getString("venc_fechaentrega"),
						rs.getDouble("venc_inientrega"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getDouble("venc_devolucion"),
						rs.getInt("venc_zafra")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventacre vent) {
		String q = " insert into ventacre( venc_tipoperacion,  venc_numventa,  venc_cliente,  venc_cobrador,  venc_fecha,  venc_fechac,  venc_tippago,  venc_tipcobro,  venc_cantcuota,  venc_fechaini,  venc_interescre,  venc_montxcuot,  venc_totalc,  venc_entretot,  venc_saldo,  venc_cdolar,  venc_creal,  venc_cpeso,  venc_ceuro,  venc_cancelado,  venc_borrado,  venc_fechaentrega,  venc_inientrega,  fechasct,  usuariosct,  maquinasct,  venc_devolucion,  venc_zafra) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getVenc_tipoperacion());
			ps.setInt(2, vent.getVenc_numventa());
			ps.setString(3, vent.getVenc_cliente());
			ps.setInt(4, vent.getVenc_cobrador());
			ps.setString(5, vent.getVenc_fecha());
			ps.setString(6, vent.getVenc_fechac());
			ps.setInt(7, vent.getVenc_tippago());
			ps.setInt(8, vent.getVenc_tipcobro());
			ps.setInt(9, vent.getVenc_cantcuota());
			ps.setString(10, vent.getVenc_fechaini());
			ps.setDouble(11, vent.getVenc_interescre());
			ps.setDouble(12, vent.getVenc_montxcuot());
			ps.setDouble(13, vent.getVenc_totalc());
			ps.setDouble(14, vent.getVenc_entretot());
			ps.setDouble(15, vent.getVenc_saldo());
			ps.setDouble(16, vent.getVenc_cdolar());
			ps.setDouble(17, vent.getVenc_creal());
			ps.setDouble(18, vent.getVenc_cpeso());
			ps.setDouble(19, vent.getVenc_ceuro());
			ps.setInt(20, vent.getVenc_cancelado());
			ps.setInt(21, vent.getVenc_borrado());
			ps.setString(22, vent.getVenc_fechaentrega());
			ps.setDouble(23, vent.getVenc_inientrega());
			ps.setString(24, vent.getFechasct());
			ps.setInt(25, vent.getUsuariosct());
			ps.setString(26, vent.getMaquinasct());
			ps.setDouble(27, vent.getVenc_devolucion());
			ps.setInt(28, vent.getVenc_zafra());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventacre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventacre vent) {
		String q = " update ventacre set  venc_tipoperacion=?,  venc_numventa=?,  venc_cliente=?,  venc_cobrador=?,  venc_fecha=?,  venc_fechac=?,  venc_tippago=?,  venc_tipcobro=?,  venc_cantcuota=?,  venc_fechaini=?,  venc_interescre=?,  venc_montxcuot=?,  venc_totalc=?,  venc_entretot=?,  venc_saldo=?,  venc_cdolar=?,  venc_creal=?,  venc_cpeso=?,  venc_ceuro=?,  venc_cancelado=?,  venc_borrado=?,  venc_fechaentrega=?,  venc_inientrega=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  venc_devolucion=?,  venc_zafra=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getVenc_tipoperacion());
			ps.setInt(2, vent.getVenc_numventa());
			ps.setString(3, vent.getVenc_cliente());
			ps.setInt(4, vent.getVenc_cobrador());
			ps.setString(5, vent.getVenc_fecha());
			ps.setString(6, vent.getVenc_fechac());
			ps.setInt(7, vent.getVenc_tippago());
			ps.setInt(8, vent.getVenc_tipcobro());
			ps.setInt(9, vent.getVenc_cantcuota());
			ps.setString(10, vent.getVenc_fechaini());
			ps.setDouble(11, vent.getVenc_interescre());
			ps.setDouble(12, vent.getVenc_montxcuot());
			ps.setDouble(13, vent.getVenc_totalc());
			ps.setDouble(14, vent.getVenc_entretot());
			ps.setDouble(15, vent.getVenc_saldo());
			ps.setDouble(16, vent.getVenc_cdolar());
			ps.setDouble(17, vent.getVenc_creal());
			ps.setDouble(18, vent.getVenc_cpeso());
			ps.setDouble(19, vent.getVenc_ceuro());
			ps.setInt(20, vent.getVenc_cancelado());
			ps.setInt(21, vent.getVenc_borrado());
			ps.setString(22, vent.getVenc_fechaentrega());
			ps.setDouble(23, vent.getVenc_inientrega());
			ps.setString(24, vent.getFechasct());
			ps.setInt(25, vent.getUsuariosct());
			ps.setString(26, vent.getMaquinasct());
			ps.setDouble(27, vent.getVenc_devolucion());
			ps.setInt(28, vent.getVenc_zafra());
			ps.setInt(29, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventacre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventacre vent) {
		String q = " delete from ventacre where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventacre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}