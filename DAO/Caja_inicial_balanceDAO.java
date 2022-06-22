package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Caja_inicial_balance;
import vista.*;

public class Caja_inicial_balanceDAO extends Thread {
	private Caja_inicial_balance caja;
	public ArrayList<Caja_inicial_balance> resultadoCaja_inicial_balance;

	@Override
	public void run() {
		try{
			actualizarCaja_inicial_balance("");
		} catch (Exception e) {
			System.out.println("Error al generar Caja_inicial_balance");
		}
		yield();
	}

	public void actualizarCaja_inicial_balance(String condicion) {
		resultadoCaja_inicial_balance = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  caja_inicial_balance " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				caja = new Caja_inicial_balance(
						rs.getInt("cib_id"),
						rs.getString("cib_fecha"),
						rs.getString("cib_hora"),
						rs.getDouble("cib_monto"),
						rs.getInt("cib_usuario"),
						rs.getString("cib_maquina"),
						rs.getString("cib_fechasct"),
						rs.getInt("cib_moneda"),
						rs.getString("cib_obs"),
						rs.getInt("cib_borrado"),
						rs.getInt("cib_deposito")
			);
			arr.add(caja);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Caja_inicial_balance caja) {
		String q = " insert into caja_inicial_balance( cib_fecha,  cib_hora,  cib_monto,  cib_usuario,  cib_maquina,  cib_fechasct,  cib_moneda,  cib_obs,  cib_borrado,  cib_deposito) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, caja.getCib_fecha());
			ps.setString(2, caja.getCib_hora());
			ps.setDouble(3, caja.getCib_monto());
			ps.setInt(4, caja.getCib_usuario());
			ps.setString(5, caja.getCib_maquina());
			ps.setString(6, caja.getCib_fechasct());
			ps.setInt(7, caja.getCib_moneda());
			ps.setString(8, caja.getCib_obs());
			ps.setInt(9, caja.getCib_borrado());
			ps.setInt(10, caja.getCib_deposito());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Caja_inicial_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Caja_inicial_balance caja) {
		String q = " update caja_inicial_balance set  cib_fecha=?,  cib_hora=?,  cib_monto=?,  cib_usuario=?,  cib_maquina=?,  cib_fechasct=?,  cib_moneda=?,  cib_obs=?,  cib_borrado=?,  cib_deposito=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, caja.getCib_fecha());
			ps.setString(2, caja.getCib_hora());
			ps.setDouble(3, caja.getCib_monto());
			ps.setInt(4, caja.getCib_usuario());
			ps.setString(5, caja.getCib_maquina());
			ps.setString(6, caja.getCib_fechasct());
			ps.setInt(7, caja.getCib_moneda());
			ps.setString(8, caja.getCib_obs());
			ps.setInt(9, caja.getCib_borrado());
			ps.setInt(10, caja.getCib_deposito());
			ps.setInt(11, caja.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Caja_inicial_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Caja_inicial_balance caja) {
		String q = " delete from caja_inicial_balance where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, caja.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Caja_inicial_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}