package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Tip_modalidad;
import vista.*;

public class Tip_modalidadDAO extends Thread {
	private Tip_modalidad tip_;
	public ArrayList<Tip_modalidad> resultadoTip_modalidad;

	@Override
	public void run() {
		try{
			actualizarTip_modalidad("");
		} catch (Exception e) {
			System.out.println("Error al generar Tip_modalidad");
		}
		yield();
	}

	public void actualizarTip_modalidad(String condicion) {
		resultadoTip_modalidad = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  tip_modalidad " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tip_ = new Tip_modalidad(
						rs.getInt("tm_codigo"),
						rs.getString("tm_fecha"),
						rs.getString("tm_descripcion"),
						rs.getInt("tm_borrado")
			);
			arr.add(tip_);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Tip_modalidad tip_) {
		String q = " insert into tip_modalidad( tm_fecha,  tm_descripcion,  tm_borrado) values (?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tip_.getTm_fecha());
			ps.setString(2, tip_.getTm_descripcion());
			ps.setInt(3, tip_.getTm_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Tip_modalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Tip_modalidad tip_) {
		String q = " update tip_modalidad set  tm_fecha=?,  tm_descripcion=?,  tm_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tip_.getTm_fecha());
			ps.setString(2, tip_.getTm_descripcion());
			ps.setInt(3, tip_.getTm_borrado());
			ps.setInt(4, tip_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Tip_modalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Tip_modalidad tip_) {
		String q = " delete from tip_modalidad where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tip_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Tip_modalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}