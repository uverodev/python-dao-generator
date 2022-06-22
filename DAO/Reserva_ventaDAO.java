package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Reserva_venta;
import vista.*;

public class Reserva_ventaDAO extends Thread {
	private Reserva_venta rese;
	public ArrayList<Reserva_venta> resultadoReserva_venta;

	@Override
	public void run() {
		try{
			actualizarReserva_venta("");
		} catch (Exception e) {
			System.out.println("Error al generar Reserva_venta");
		}
		yield();
	}

	public void actualizarReserva_venta(String condicion) {
		resultadoReserva_venta = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  reserva_venta " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				rese = new Reserva_venta(
						rs.getInt("rv_codigo"),
						rs.getString("rv_pc"),
						rs.getString("rv_codprod"),
						rs.getDouble("rv_cantidad"),
						rs.getInt("rv_operacion"),
						rs.getInt("rv_vendedor"),
						rs.getString("rv_fecha"),
						rs.getObject("rv_lote")
			);
			arr.add(rese);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Reserva_venta rese) {
		String q = " insert into reserva_venta( rv_pc,  rv_codprod,  rv_cantidad,  rv_operacion,  rv_vendedor,  rv_fecha,  rv_lote) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRv_pc());
			ps.setString(2, rese.getRv_codprod());
			ps.setDouble(3, rese.getRv_cantidad());
			ps.setInt(4, rese.getRv_operacion());
			ps.setInt(5, rese.getRv_vendedor());
			ps.setString(6, rese.getRv_fecha());
			ps.setObject(7, rese.getRv_lote());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Reserva_venta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Reserva_venta rese) {
		String q = " update reserva_venta set  rv_pc=?,  rv_codprod=?,  rv_cantidad=?,  rv_operacion=?,  rv_vendedor=?,  rv_fecha=?,  rv_lote=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRv_pc());
			ps.setString(2, rese.getRv_codprod());
			ps.setDouble(3, rese.getRv_cantidad());
			ps.setInt(4, rese.getRv_operacion());
			ps.setInt(5, rese.getRv_vendedor());
			ps.setString(6, rese.getRv_fecha());
			ps.setObject(7, rese.getRv_lote());
			ps.setInt(8, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Reserva_venta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Reserva_venta rese) {
		String q = " delete from reserva_venta where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Reserva_venta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}