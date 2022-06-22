package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Transfcab;
import vista.*;

public class TransfcabDAO extends Thread {
	private Transfcab tran;
	public ArrayList<Transfcab> resultadoTransfcab;

	@Override
	public void run() {
		try{
			actualizarTransfcab("");
		} catch (Exception e) {
			System.out.println("Error al generar Transfcab");
		}
		yield();
	}

	public void actualizarTransfcab(String condicion) {
		resultadoTransfcab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  transfcab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tran = new Transfcab(
						rs.getInt("tr_nro"),
						rs.getString("tr_fecha"),
						rs.getString("tr_fechacarga"),
						rs.getString("tr_hora"),
						rs.getDouble("tr_total"),
						rs.getDouble("tr_descuento"),
						rs.getDouble("tr_totalexe"),
						rs.getDouble("tr_totaliva5"),
						rs.getDouble("tr_totaliva10"),
						rs.getDouble("tr_totalitem"),
						rs.getDouble("tr_totaliva"),
						rs.getInt("tr_usuario"),
						rs.getInt("tr_confirmado"),
						rs.getInt("tr_borrado"),
						rs.getInt("tr_deporigen"),
						rs.getInt("tr_depdestino"),
						rs.getString("tr_vehiculo"),
						rs.getInt("tr_responsable"),
						rs.getString("fechasct"),
						rs.getInt("tr_tiptransferencia"),
						rs.getInt("tr_tipo"),
						rs.getInt("tr_transferencia_local"),
						rs.getInt("tr_recepcion_local"),
						rs.getInt("tr_cabecera_origen"),
						rs.getInt("tr_id_deposito_destino")
			);
			arr.add(tran);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Transfcab tran) {
		String q = " insert into transfcab( tr_fecha,  tr_fechacarga,  tr_hora,  tr_total,  tr_descuento,  tr_totalexe,  tr_totaliva5,  tr_totaliva10,  tr_totalitem,  tr_totaliva,  tr_usuario,  tr_confirmado,  tr_borrado,  tr_deporigen,  tr_depdestino,  tr_vehiculo,  tr_responsable,  fechasct,  tr_tiptransferencia,  tr_tipo,  tr_transferencia_local,  tr_recepcion_local,  tr_cabecera_origen,  tr_id_deposito_destino) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTr_fecha());
			ps.setString(2, tran.getTr_fechacarga());
			ps.setString(3, tran.getTr_hora());
			ps.setDouble(4, tran.getTr_total());
			ps.setDouble(5, tran.getTr_descuento());
			ps.setDouble(6, tran.getTr_totalexe());
			ps.setDouble(7, tran.getTr_totaliva5());
			ps.setDouble(8, tran.getTr_totaliva10());
			ps.setDouble(9, tran.getTr_totalitem());
			ps.setDouble(10, tran.getTr_totaliva());
			ps.setInt(11, tran.getTr_usuario());
			ps.setInt(12, tran.getTr_confirmado());
			ps.setInt(13, tran.getTr_borrado());
			ps.setInt(14, tran.getTr_deporigen());
			ps.setInt(15, tran.getTr_depdestino());
			ps.setString(16, tran.getTr_vehiculo());
			ps.setInt(17, tran.getTr_responsable());
			ps.setString(18, tran.getFechasct());
			ps.setInt(19, tran.getTr_tiptransferencia());
			ps.setInt(20, tran.getTr_tipo());
			ps.setInt(21, tran.getTr_transferencia_local());
			ps.setInt(22, tran.getTr_recepcion_local());
			ps.setInt(23, tran.getTr_cabecera_origen());
			ps.setInt(24, tran.getTr_id_deposito_destino());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Transfcab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Transfcab tran) {
		String q = " update transfcab set  tr_fecha=?,  tr_fechacarga=?,  tr_hora=?,  tr_total=?,  tr_descuento=?,  tr_totalexe=?,  tr_totaliva5=?,  tr_totaliva10=?,  tr_totalitem=?,  tr_totaliva=?,  tr_usuario=?,  tr_confirmado=?,  tr_borrado=?,  tr_deporigen=?,  tr_depdestino=?,  tr_vehiculo=?,  tr_responsable=?,  fechasct=?,  tr_tiptransferencia=?,  tr_tipo=?,  tr_transferencia_local=?,  tr_recepcion_local=?,  tr_cabecera_origen=?,  tr_id_deposito_destino=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTr_fecha());
			ps.setString(2, tran.getTr_fechacarga());
			ps.setString(3, tran.getTr_hora());
			ps.setDouble(4, tran.getTr_total());
			ps.setDouble(5, tran.getTr_descuento());
			ps.setDouble(6, tran.getTr_totalexe());
			ps.setDouble(7, tran.getTr_totaliva5());
			ps.setDouble(8, tran.getTr_totaliva10());
			ps.setDouble(9, tran.getTr_totalitem());
			ps.setDouble(10, tran.getTr_totaliva());
			ps.setInt(11, tran.getTr_usuario());
			ps.setInt(12, tran.getTr_confirmado());
			ps.setInt(13, tran.getTr_borrado());
			ps.setInt(14, tran.getTr_deporigen());
			ps.setInt(15, tran.getTr_depdestino());
			ps.setString(16, tran.getTr_vehiculo());
			ps.setInt(17, tran.getTr_responsable());
			ps.setString(18, tran.getFechasct());
			ps.setInt(19, tran.getTr_tiptransferencia());
			ps.setInt(20, tran.getTr_tipo());
			ps.setInt(21, tran.getTr_transferencia_local());
			ps.setInt(22, tran.getTr_recepcion_local());
			ps.setInt(23, tran.getTr_cabecera_origen());
			ps.setInt(24, tran.getTr_id_deposito_destino());
			ps.setInt(25, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Transfcab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Transfcab tran) {
		String q = " delete from transfcab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Transfcab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}