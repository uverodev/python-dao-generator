package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Reserva_compra;
import vista.*;

public class Reserva_compraDAO extends Thread {
	private Reserva_compra rese;
	public ArrayList<Reserva_compra> resultadoReserva_compra;

	@Override
	public void run() {
		try{
			actualizarReserva_compra("");
		} catch (Exception e) {
			System.out.println("Error al generar Reserva_compra");
		}
		yield();
	}

	public void actualizarReserva_compra(String condicion) {
		resultadoReserva_compra = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  reserva_compra " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				rese = new Reserva_compra(
						rs.getInt("rc_numeracion"),
						rs.getString("rc_maquina")
			);
			arr.add(rese);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Reserva_compra rese) {
		String q = " insert into reserva_compra( rc_maquina) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRc_maquina());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Reserva_compra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Reserva_compra rese) {
		String q = " update reserva_compra set  rc_maquina=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRc_maquina());
			ps.setInt(2, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Reserva_compra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Reserva_compra rese) {
		String q = " delete from reserva_compra where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Reserva_compra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}