package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Depositob;
import vista.*;

public class DepositobDAO extends Thread {
	private Depositob depo;
	public ArrayList<Depositob> resultadoDepositob;

	@Override
	public void run() {
		try{
			actualizarDepositob("");
		} catch (Exception e) {
			System.out.println("Error al generar Depositob");
		}
		yield();
	}

	public void actualizarDepositob(String condicion) {
		resultadoDepositob = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  depositob " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				depo = new Depositob(
						rs.getInt("dep_nro"),
						rs.getString("dep_nrocomprovante"),
						rs.getInt("dep_moneda"),
						rs.getString("dep_numcuenta"),
						rs.getInt("dep_banco"),
						rs.getString("dep_fecha"),
						rs.getString("dep_fechacarga"),
						rs.getString("dep_encargado"),
						rs.getDouble("dep_monto"),
						rs.getInt("dep_borrado"),
						rs.getDouble("dep_montocheque"),
						rs.getDouble("dep_montoefectivo")
			);
			arr.add(depo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Depositob depo) {
		String q = " insert into depositob( dep_nrocomprovante,  dep_moneda,  dep_numcuenta,  dep_banco,  dep_fecha,  dep_fechacarga,  dep_encargado,  dep_monto,  dep_borrado,  dep_montocheque,  dep_montoefectivo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDep_nrocomprovante());
			ps.setInt(2, depo.getDep_moneda());
			ps.setString(3, depo.getDep_numcuenta());
			ps.setInt(4, depo.getDep_banco());
			ps.setString(5, depo.getDep_fecha());
			ps.setString(6, depo.getDep_fechacarga());
			ps.setString(7, depo.getDep_encargado());
			ps.setDouble(8, depo.getDep_monto());
			ps.setInt(9, depo.getDep_borrado());
			ps.setDouble(10, depo.getDep_montocheque());
			ps.setDouble(11, depo.getDep_montoefectivo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Depositob", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Depositob depo) {
		String q = " update depositob set  dep_nrocomprovante=?,  dep_moneda=?,  dep_numcuenta=?,  dep_banco=?,  dep_fecha=?,  dep_fechacarga=?,  dep_encargado=?,  dep_monto=?,  dep_borrado=?,  dep_montocheque=?,  dep_montoefectivo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDep_nrocomprovante());
			ps.setInt(2, depo.getDep_moneda());
			ps.setString(3, depo.getDep_numcuenta());
			ps.setInt(4, depo.getDep_banco());
			ps.setString(5, depo.getDep_fecha());
			ps.setString(6, depo.getDep_fechacarga());
			ps.setString(7, depo.getDep_encargado());
			ps.setDouble(8, depo.getDep_monto());
			ps.setInt(9, depo.getDep_borrado());
			ps.setDouble(10, depo.getDep_montocheque());
			ps.setDouble(11, depo.getDep_montoefectivo());
			ps.setInt(12, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Depositob", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Depositob depo) {
		String q = " delete from depositob where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Depositob", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}