package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Depositobcheques;
import vista.*;

public class DepositobchequesDAO extends Thread {
	private Depositobcheques depo;
	public ArrayList<Depositobcheques> resultadoDepositobcheques;

	@Override
	public void run() {
		try{
			actualizarDepositobcheques("");
		} catch (Exception e) {
			System.out.println("Error al generar Depositobcheques");
		}
		yield();
	}

	public void actualizarDepositobcheques(String condicion) {
		resultadoDepositobcheques = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  depositobcheques " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				depo = new Depositobcheques(
						rs.getInt("dbc_codigo"),
						rs.getString("dbc_numcheque"),
						rs.getString("dbc_banco"),
						rs.getDouble("dbc_monto"),
						rs.getInt("dbc_nrodepositob"),
						rs.getString("dbc_fecha")
			);
			arr.add(depo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Depositobcheques depo) {
		String q = " insert into depositobcheques( dbc_numcheque,  dbc_banco,  dbc_monto,  dbc_nrodepositob,  dbc_fecha) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDbc_numcheque());
			ps.setString(2, depo.getDbc_banco());
			ps.setDouble(3, depo.getDbc_monto());
			ps.setInt(4, depo.getDbc_nrodepositob());
			ps.setString(5, depo.getDbc_fecha());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Depositobcheques", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Depositobcheques depo) {
		String q = " update depositobcheques set  dbc_numcheque=?,  dbc_banco=?,  dbc_monto=?,  dbc_nrodepositob=?,  dbc_fecha=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDbc_numcheque());
			ps.setString(2, depo.getDbc_banco());
			ps.setDouble(3, depo.getDbc_monto());
			ps.setInt(4, depo.getDbc_nrodepositob());
			ps.setString(5, depo.getDbc_fecha());
			ps.setInt(6, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Depositobcheques", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Depositobcheques depo) {
		String q = " delete from depositobcheques where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Depositobcheques", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}