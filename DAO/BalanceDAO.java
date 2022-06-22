package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Balance;
import vista.*;

public class BalanceDAO extends Thread {
	private Balance bala;
	public ArrayList<Balance> resultadoBalance;

	@Override
	public void run() {
		try{
			actualizarBalance("");
		} catch (Exception e) {
			System.out.println("Error al generar Balance");
		}
		yield();
	}

	public void actualizarBalance(String condicion) {
		resultadoBalance = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  balance " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				bala = new Balance(
						rs.getInt("id"),
						rs.getString("concepto"),
						rs.getDouble("ingreso"),
						rs.getDouble("egreso"),
						rs.getString("fecha"),
						rs.getString("tipo"),
						rs.getInt("idMonedas"),
						rs.getInt("idUsuarios")
			);
			arr.add(bala);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Balance bala) {
		String q = " insert into balance( concepto,  ingreso,  egreso,  fecha,  tipo,  idMonedas,  idUsuarios) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, bala.getConcepto());
			ps.setDouble(2, bala.getIngreso());
			ps.setDouble(3, bala.getEgreso());
			ps.setString(4, bala.getFecha());
			ps.setString(5, bala.getTipo());
			ps.setInt(6, bala.getIdmonedas());
			ps.setInt(7, bala.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Balance bala) {
		String q = " update balance set  concepto=?,  ingreso=?,  egreso=?,  fecha=?,  tipo=?,  idMonedas=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, bala.getConcepto());
			ps.setDouble(2, bala.getIngreso());
			ps.setDouble(3, bala.getEgreso());
			ps.setString(4, bala.getFecha());
			ps.setString(5, bala.getTipo());
			ps.setInt(6, bala.getIdmonedas());
			ps.setInt(7, bala.getIdusuarios());
			ps.setInt(8, bala.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Balance bala) {
		String q = " delete from balance where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, bala.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}