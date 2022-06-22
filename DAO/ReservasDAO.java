package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Reservas;
import vista.*;

public class ReservasDAO extends Thread {
	private Reservas rese;
	public ArrayList<Reservas> resultadoReservas;

	@Override
	public void run() {
		try{
			actualizarReservas("");
		} catch (Exception e) {
			System.out.println("Error al generar Reservas");
		}
		yield();
	}

	public void actualizarReservas(String condicion) {
		resultadoReservas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  reservas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				rese = new Reservas(
						rs.getInt("res_codigo"),
						rs.getString("res_diaingreso"),
						rs.getString("res_diasalida"),
						rs.getString("res_horaingreso"),
						rs.getString("res_horasalida"),
						rs.getInt("res_habitacion"),
						rs.getString("res_clienteencargado"),
						rs.getInt("res_usuario"),
						rs.getDouble("res_total"),
						rs.getDouble("res_entregado"),
						rs.getInt("res_estado"),
						rs.getInt("res_borrado"),
						rs.getString("res_fecha"),
						rs.getString("res_hora"),
						rs.getInt("res_cantpersonas"),
						rs.getInt("res_cantdias")
			);
			arr.add(rese);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Reservas rese) {
		String q = " insert into reservas( res_diaingreso,  res_diasalida,  res_horaingreso,  res_horasalida,  res_habitacion,  res_clienteencargado,  res_usuario,  res_total,  res_entregado,  res_estado,  res_borrado,  res_fecha,  res_hora,  res_cantpersonas,  res_cantdias) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRes_diaingreso());
			ps.setString(2, rese.getRes_diasalida());
			ps.setString(3, rese.getRes_horaingreso());
			ps.setString(4, rese.getRes_horasalida());
			ps.setInt(5, rese.getRes_habitacion());
			ps.setString(6, rese.getRes_clienteencargado());
			ps.setInt(7, rese.getRes_usuario());
			ps.setDouble(8, rese.getRes_total());
			ps.setDouble(9, rese.getRes_entregado());
			ps.setInt(10, rese.getRes_estado());
			ps.setInt(11, rese.getRes_borrado());
			ps.setString(12, rese.getRes_fecha());
			ps.setString(13, rese.getRes_hora());
			ps.setInt(14, rese.getRes_cantpersonas());
			ps.setInt(15, rese.getRes_cantdias());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Reservas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Reservas rese) {
		String q = " update reservas set  res_diaingreso=?,  res_diasalida=?,  res_horaingreso=?,  res_horasalida=?,  res_habitacion=?,  res_clienteencargado=?,  res_usuario=?,  res_total=?,  res_entregado=?,  res_estado=?,  res_borrado=?,  res_fecha=?,  res_hora=?,  res_cantpersonas=?,  res_cantdias=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, rese.getRes_diaingreso());
			ps.setString(2, rese.getRes_diasalida());
			ps.setString(3, rese.getRes_horaingreso());
			ps.setString(4, rese.getRes_horasalida());
			ps.setInt(5, rese.getRes_habitacion());
			ps.setString(6, rese.getRes_clienteencargado());
			ps.setInt(7, rese.getRes_usuario());
			ps.setDouble(8, rese.getRes_total());
			ps.setDouble(9, rese.getRes_entregado());
			ps.setInt(10, rese.getRes_estado());
			ps.setInt(11, rese.getRes_borrado());
			ps.setString(12, rese.getRes_fecha());
			ps.setString(13, rese.getRes_hora());
			ps.setInt(14, rese.getRes_cantpersonas());
			ps.setInt(15, rese.getRes_cantdias());
			ps.setInt(16, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Reservas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Reservas rese) {
		String q = " delete from reservas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rese.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Reservas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}