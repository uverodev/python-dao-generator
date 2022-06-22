package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cierre_balance_operaciones;
import vista.*;

public class Cierre_balance_operacionesDAO extends Thread {
	private Cierre_balance_operaciones cier;
	public ArrayList<Cierre_balance_operaciones> resultadoCierre_balance_operaciones;

	@Override
	public void run() {
		try{
			actualizarCierre_balance_operaciones("");
		} catch (Exception e) {
			System.out.println("Error al generar Cierre_balance_operaciones");
		}
		yield();
	}

	public void actualizarCierre_balance_operaciones(String condicion) {
		resultadoCierre_balance_operaciones = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cierre_balance_operaciones " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cier = new Cierre_balance_operaciones(
						rs.getInt("cbo_id"),
						rs.getInt("cbo_cierre_balance"),
						rs.getInt("cbo_tipo_operacion"),
						rs.getInt("cbo_nro_operacion"),
						rs.getDouble("cbo_ingreso"),
						rs.getDouble("cbo_egreso"),
						rs.getInt("cbo_borrado")
			);
			arr.add(cier);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cierre_balance_operaciones cier) {
		String q = " insert into cierre_balance_operaciones( cbo_cierre_balance,  cbo_tipo_operacion,  cbo_nro_operacion,  cbo_ingreso,  cbo_egreso,  cbo_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCbo_cierre_balance());
			ps.setInt(2, cier.getCbo_tipo_operacion());
			ps.setInt(3, cier.getCbo_nro_operacion());
			ps.setDouble(4, cier.getCbo_ingreso());
			ps.setDouble(5, cier.getCbo_egreso());
			ps.setInt(6, cier.getCbo_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cierre_balance_operaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cierre_balance_operaciones cier) {
		String q = " update cierre_balance_operaciones set  cbo_cierre_balance=?,  cbo_tipo_operacion=?,  cbo_nro_operacion=?,  cbo_ingreso=?,  cbo_egreso=?,  cbo_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCbo_cierre_balance());
			ps.setInt(2, cier.getCbo_tipo_operacion());
			ps.setInt(3, cier.getCbo_nro_operacion());
			ps.setDouble(4, cier.getCbo_ingreso());
			ps.setDouble(5, cier.getCbo_egreso());
			ps.setInt(6, cier.getCbo_borrado());
			ps.setInt(7, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cierre_balance_operaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cierre_balance_operaciones cier) {
		String q = " delete from cierre_balance_operaciones where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cierre_balance_operaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}