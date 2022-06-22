package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Habitaciones;
import vista.*;

public class HabitacionesDAO extends Thread {
	private Habitaciones habi;
	public ArrayList<Habitaciones> resultadoHabitaciones;

	@Override
	public void run() {
		try{
			actualizarHabitaciones("");
		} catch (Exception e) {
			System.out.println("Error al generar Habitaciones");
		}
		yield();
	}

	public void actualizarHabitaciones(String condicion) {
		resultadoHabitaciones = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  habitaciones " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				habi = new Habitaciones(
						rs.getInt("h_codigo"),
						rs.getInt("h_estado"),
						rs.getString("h_descripcion"),
						rs.getInt("h_cantcuartos"),
						rs.getInt("h_tipohabitacion"),
						rs.getString("h_especificacionhabitacion"),
						rs.getObject("h_imghabitacion"),
						rs.getDouble("h_costoxhora"),
						rs.getDouble("h_costoxdia"),
						rs.getDouble("h_costoadicional"),
						rs.getDouble("h_costoxsemana"),
						rs.getDouble("h_costoespecial"),
						rs.getString("h_ubicacion"),
						rs.getInt("h_numerohabitacion"),
						rs.getInt("h_borrado"),
						rs.getObject("h_area"),
						rs.getObject("h_imagen6"),
						rs.getObject("h_imagen5"),
						rs.getObject("h_imagen4"),
						rs.getObject("h_imagen3"),
						rs.getObject("h_imagen2"),
						rs.getObject("h_imagen1"),
						rs.getInt("h_tipo")
			);
			arr.add(habi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Habitaciones habi) {
		String q = " insert into habitaciones( h_estado,  h_descripcion,  h_cantcuartos,  h_tipohabitacion,  h_especificacionhabitacion,  h_imghabitacion,  h_costoxhora,  h_costoxdia,  h_costoadicional,  h_costoxsemana,  h_costoespecial,  h_ubicacion,  h_numerohabitacion,  h_borrado,  h_area,  h_imagen6,  h_imagen5,  h_imagen4,  h_imagen3,  h_imagen2,  h_imagen1,  h_tipo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, habi.getH_estado());
			ps.setString(2, habi.getH_descripcion());
			ps.setInt(3, habi.getH_cantcuartos());
			ps.setInt(4, habi.getH_tipohabitacion());
			ps.setString(5, habi.getH_especificacionhabitacion());
			ps.setObject(6, habi.getH_imghabitacion());
			ps.setDouble(7, habi.getH_costoxhora());
			ps.setDouble(8, habi.getH_costoxdia());
			ps.setDouble(9, habi.getH_costoadicional());
			ps.setDouble(10, habi.getH_costoxsemana());
			ps.setDouble(11, habi.getH_costoespecial());
			ps.setString(12, habi.getH_ubicacion());
			ps.setInt(13, habi.getH_numerohabitacion());
			ps.setInt(14, habi.getH_borrado());
			ps.setObject(15, habi.getH_area());
			ps.setObject(16, habi.getH_imagen6());
			ps.setObject(17, habi.getH_imagen5());
			ps.setObject(18, habi.getH_imagen4());
			ps.setObject(19, habi.getH_imagen3());
			ps.setObject(20, habi.getH_imagen2());
			ps.setObject(21, habi.getH_imagen1());
			ps.setInt(22, habi.getH_tipo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Habitaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Habitaciones habi) {
		String q = " update habitaciones set  h_estado=?,  h_descripcion=?,  h_cantcuartos=?,  h_tipohabitacion=?,  h_especificacionhabitacion=?,  h_imghabitacion=?,  h_costoxhora=?,  h_costoxdia=?,  h_costoadicional=?,  h_costoxsemana=?,  h_costoespecial=?,  h_ubicacion=?,  h_numerohabitacion=?,  h_borrado=?,  h_area=?,  h_imagen6=?,  h_imagen5=?,  h_imagen4=?,  h_imagen3=?,  h_imagen2=?,  h_imagen1=?,  h_tipo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, habi.getH_estado());
			ps.setString(2, habi.getH_descripcion());
			ps.setInt(3, habi.getH_cantcuartos());
			ps.setInt(4, habi.getH_tipohabitacion());
			ps.setString(5, habi.getH_especificacionhabitacion());
			ps.setObject(6, habi.getH_imghabitacion());
			ps.setDouble(7, habi.getH_costoxhora());
			ps.setDouble(8, habi.getH_costoxdia());
			ps.setDouble(9, habi.getH_costoadicional());
			ps.setDouble(10, habi.getH_costoxsemana());
			ps.setDouble(11, habi.getH_costoespecial());
			ps.setString(12, habi.getH_ubicacion());
			ps.setInt(13, habi.getH_numerohabitacion());
			ps.setInt(14, habi.getH_borrado());
			ps.setObject(15, habi.getH_area());
			ps.setObject(16, habi.getH_imagen6());
			ps.setObject(17, habi.getH_imagen5());
			ps.setObject(18, habi.getH_imagen4());
			ps.setObject(19, habi.getH_imagen3());
			ps.setObject(20, habi.getH_imagen2());
			ps.setObject(21, habi.getH_imagen1());
			ps.setInt(22, habi.getH_tipo());
			ps.setInt(23, habi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Habitaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Habitaciones habi) {
		String q = " delete from habitaciones where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, habi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Habitaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}