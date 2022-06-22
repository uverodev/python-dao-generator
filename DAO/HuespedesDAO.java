package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Huespedes;
import vista.*;

public class HuespedesDAO extends Thread {
	private Huespedes hues;
	public ArrayList<Huespedes> resultadoHuespedes;

	@Override
	public void run() {
		try{
			actualizarHuespedes("");
		} catch (Exception e) {
			System.out.println("Error al generar Huespedes");
		}
		yield();
	}

	public void actualizarHuespedes(String condicion) {
		resultadoHuespedes = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  huespedes " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				hues = new Huespedes(
						rs.getInt("h_codigo"),
						rs.getString("h_cedulahuespedes"),
						rs.getInt("h_habitacion"),
						rs.getInt("h_recepcion"),
						rs.getInt("h_estado"),
						rs.getString("h_fechasalida"),
						rs.getInt("h_alquiler")
			);
			arr.add(hues);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Huespedes hues) {
		String q = " insert into huespedes( h_cedulahuespedes,  h_habitacion,  h_recepcion,  h_estado,  h_fechasalida,  h_alquiler) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, hues.getH_cedulahuespedes());
			ps.setInt(2, hues.getH_habitacion());
			ps.setInt(3, hues.getH_recepcion());
			ps.setInt(4, hues.getH_estado());
			ps.setString(5, hues.getH_fechasalida());
			ps.setInt(6, hues.getH_alquiler());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Huespedes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Huespedes hues) {
		String q = " update huespedes set  h_cedulahuespedes=?,  h_habitacion=?,  h_recepcion=?,  h_estado=?,  h_fechasalida=?,  h_alquiler=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, hues.getH_cedulahuespedes());
			ps.setInt(2, hues.getH_habitacion());
			ps.setInt(3, hues.getH_recepcion());
			ps.setInt(4, hues.getH_estado());
			ps.setString(5, hues.getH_fechasalida());
			ps.setInt(6, hues.getH_alquiler());
			ps.setInt(7, hues.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Huespedes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Huespedes hues) {
		String q = " delete from huespedes where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, hues.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Huespedes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}