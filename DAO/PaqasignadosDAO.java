package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Paqasignados;
import vista.*;

public class PaqasignadosDAO extends Thread {
	private Paqasignados paqa;
	public ArrayList<Paqasignados> resultadoPaqasignados;

	@Override
	public void run() {
		try{
			actualizarPaqasignados("");
		} catch (Exception e) {
			System.out.println("Error al generar Paqasignados");
		}
		yield();
	}

	public void actualizarPaqasignados(String condicion) {
		resultadoPaqasignados = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  paqasignados " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				paqa = new Paqasignados(
						rs.getInt("pa_codigo"),
						rs.getInt("pa_reserva"),
						rs.getInt("pa_habitacion"),
						rs.getInt("pa_recepcion"),
						rs.getInt("pa_paquete"),
						rs.getInt("pa_borrado")
			);
			arr.add(paqa);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Paqasignados paqa) {
		String q = " insert into paqasignados( pa_reserva,  pa_habitacion,  pa_recepcion,  pa_paquete,  pa_borrado) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, paqa.getPa_reserva());
			ps.setInt(2, paqa.getPa_habitacion());
			ps.setInt(3, paqa.getPa_recepcion());
			ps.setInt(4, paqa.getPa_paquete());
			ps.setInt(5, paqa.getPa_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Paqasignados", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Paqasignados paqa) {
		String q = " update paqasignados set  pa_reserva=?,  pa_habitacion=?,  pa_recepcion=?,  pa_paquete=?,  pa_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, paqa.getPa_reserva());
			ps.setInt(2, paqa.getPa_habitacion());
			ps.setInt(3, paqa.getPa_recepcion());
			ps.setInt(4, paqa.getPa_paquete());
			ps.setInt(5, paqa.getPa_borrado());
			ps.setInt(6, paqa.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Paqasignados", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Paqasignados paqa) {
		String q = " delete from paqasignados where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, paqa.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Paqasignados", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}