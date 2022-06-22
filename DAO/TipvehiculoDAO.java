package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Tipvehiculo;
import vista.*;

public class TipvehiculoDAO extends Thread {
	private Tipvehiculo tipv;
	public ArrayList<Tipvehiculo> resultadoTipvehiculo;

	@Override
	public void run() {
		try{
			actualizarTipvehiculo("");
		} catch (Exception e) {
			System.out.println("Error al generar Tipvehiculo");
		}
		yield();
	}

	public void actualizarTipvehiculo(String condicion) {
		resultadoTipvehiculo = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  tipvehiculo " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tipv = new Tipvehiculo(
						rs.getInt("tip_cod"),
						rs.getString("tip_descripcion"),
						rs.getInt("tip_borrado")
			);
			arr.add(tipv);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Tipvehiculo tipv) {
		String q = " insert into tipvehiculo( tip_descripcion,  tip_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tipv.getTip_descripcion());
			ps.setInt(2, tipv.getTip_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Tipvehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Tipvehiculo tipv) {
		String q = " update tipvehiculo set  tip_descripcion=?,  tip_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tipv.getTip_descripcion());
			ps.setInt(2, tipv.getTip_borrado());
			ps.setInt(3, tipv.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Tipvehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Tipvehiculo tipv) {
		String q = " delete from tipvehiculo where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tipv.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Tipvehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}