package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Chequeemi;
import vista.*;

public class ChequeemiDAO extends Thread {
	private Chequeemi cheq;
	public ArrayList<Chequeemi> resultadoChequeemi;

	@Override
	public void run() {
		try{
			actualizarChequeemi("");
		} catch (Exception e) {
			System.out.println("Error al generar Chequeemi");
		}
		yield();
	}

	public void actualizarChequeemi(String condicion) {
		resultadoChequeemi = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  chequeemi " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cheq = new Chequeemi(
						rs.getInt("che_nro"),
						rs.getInt("che_tipo"),
						rs.getInt("che_usuario"),
						rs.getInt("che_tipoplazo"),
						rs.getInt("che_banco"),
						rs.getString("che_fecha"),
						rs.getString("che_titular"),
						rs.getInt("che_numcomp"),
						rs.getString("che_numcheque"),
						rs.getInt("che_moneda"),
						rs.getDouble("che_monto"),
						rs.getString("che_numcuen"),
						rs.getDouble("che_giro"),
						rs.getInt("che_proveedor"),
						rs.getInt("che_borrado"),
						rs.getString("che_fechaplazo"),
						rs.getString("che_observacion"),
						rs.getInt("che_estado"),
						rs.getString("che_afavor"),
						rs.getInt("che_deposito")
			);
			arr.add(cheq);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Chequeemi cheq) {
		String q = " insert into chequeemi( che_tipo,  che_usuario,  che_tipoplazo,  che_banco,  che_fecha,  che_titular,  che_numcomp,  che_numcheque,  che_moneda,  che_monto,  che_numcuen,  che_giro,  che_proveedor,  che_borrado,  che_fechaplazo,  che_observacion,  che_estado,  che_afavor,  che_deposito) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getChe_tipo());
			ps.setInt(2, cheq.getChe_usuario());
			ps.setInt(3, cheq.getChe_tipoplazo());
			ps.setInt(4, cheq.getChe_banco());
			ps.setString(5, cheq.getChe_fecha());
			ps.setString(6, cheq.getChe_titular());
			ps.setInt(7, cheq.getChe_numcomp());
			ps.setString(8, cheq.getChe_numcheque());
			ps.setInt(9, cheq.getChe_moneda());
			ps.setDouble(10, cheq.getChe_monto());
			ps.setString(11, cheq.getChe_numcuen());
			ps.setDouble(12, cheq.getChe_giro());
			ps.setInt(13, cheq.getChe_proveedor());
			ps.setInt(14, cheq.getChe_borrado());
			ps.setString(15, cheq.getChe_fechaplazo());
			ps.setString(16, cheq.getChe_observacion());
			ps.setInt(17, cheq.getChe_estado());
			ps.setString(18, cheq.getChe_afavor());
			ps.setInt(19, cheq.getChe_deposito());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Chequeemi", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Chequeemi cheq) {
		String q = " update chequeemi set  che_tipo=?,  che_usuario=?,  che_tipoplazo=?,  che_banco=?,  che_fecha=?,  che_titular=?,  che_numcomp=?,  che_numcheque=?,  che_moneda=?,  che_monto=?,  che_numcuen=?,  che_giro=?,  che_proveedor=?,  che_borrado=?,  che_fechaplazo=?,  che_observacion=?,  che_estado=?,  che_afavor=?,  che_deposito=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getChe_tipo());
			ps.setInt(2, cheq.getChe_usuario());
			ps.setInt(3, cheq.getChe_tipoplazo());
			ps.setInt(4, cheq.getChe_banco());
			ps.setString(5, cheq.getChe_fecha());
			ps.setString(6, cheq.getChe_titular());
			ps.setInt(7, cheq.getChe_numcomp());
			ps.setString(8, cheq.getChe_numcheque());
			ps.setInt(9, cheq.getChe_moneda());
			ps.setDouble(10, cheq.getChe_monto());
			ps.setString(11, cheq.getChe_numcuen());
			ps.setDouble(12, cheq.getChe_giro());
			ps.setInt(13, cheq.getChe_proveedor());
			ps.setInt(14, cheq.getChe_borrado());
			ps.setString(15, cheq.getChe_fechaplazo());
			ps.setString(16, cheq.getChe_observacion());
			ps.setInt(17, cheq.getChe_estado());
			ps.setString(18, cheq.getChe_afavor());
			ps.setInt(19, cheq.getChe_deposito());
			ps.setInt(20, cheq.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Chequeemi", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Chequeemi cheq) {
		String q = " delete from chequeemi where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Chequeemi", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}