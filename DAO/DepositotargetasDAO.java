package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Depositotargetas;
import vista.*;

public class DepositotargetasDAO extends Thread {
	private Depositotargetas depo;
	public ArrayList<Depositotargetas> resultadoDepositotargetas;

	@Override
	public void run() {
		try{
			actualizarDepositotargetas("");
		} catch (Exception e) {
			System.out.println("Error al generar Depositotargetas");
		}
		yield();
	}

	public void actualizarDepositotargetas(String condicion) {
		resultadoDepositotargetas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  depositotargetas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				depo = new Depositotargetas(
						rs.getInt("dt_codigo"),
						rs.getInt("dt_targeta"),
						rs.getObject("dt_numerotargeta"),
						rs.getDouble("dt_monto"),
						rs.getInt("dt_usuario"),
						rs.getObject("dt_pc"),
						rs.getInt("dt_borrado"),
						rs.getInt("dt_numerocuenta"),
						rs.getString("dt_fecha")
			);
			arr.add(depo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Depositotargetas depo) {
		String q = " insert into depositotargetas( dt_targeta,  dt_numerotargeta,  dt_monto,  dt_usuario,  dt_pc,  dt_borrado,  dt_numerocuenta,  dt_fecha) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getDt_targeta());
			ps.setObject(2, depo.getDt_numerotargeta());
			ps.setDouble(3, depo.getDt_monto());
			ps.setInt(4, depo.getDt_usuario());
			ps.setObject(5, depo.getDt_pc());
			ps.setInt(6, depo.getDt_borrado());
			ps.setInt(7, depo.getDt_numerocuenta());
			ps.setString(8, depo.getDt_fecha());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Depositotargetas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Depositotargetas depo) {
		String q = " update depositotargetas set  dt_targeta=?,  dt_numerotargeta=?,  dt_monto=?,  dt_usuario=?,  dt_pc=?,  dt_borrado=?,  dt_numerocuenta=?,  dt_fecha=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getDt_targeta());
			ps.setObject(2, depo.getDt_numerotargeta());
			ps.setDouble(3, depo.getDt_monto());
			ps.setInt(4, depo.getDt_usuario());
			ps.setObject(5, depo.getDt_pc());
			ps.setInt(6, depo.getDt_borrado());
			ps.setInt(7, depo.getDt_numerocuenta());
			ps.setString(8, depo.getDt_fecha());
			ps.setInt(9, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Depositotargetas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Depositotargetas depo) {
		String q = " delete from depositotargetas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Depositotargetas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}