package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Areas;
import vista.*;

public class AreasDAO extends Thread {
	private Areas area;
	public ArrayList<Areas> resultadoAreas;

	@Override
	public void run() {
		try{
			actualizarAreas("");
		} catch (Exception e) {
			System.out.println("Error al generar Areas");
		}
		yield();
	}

	public void actualizarAreas(String condicion) {
		resultadoAreas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  areas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				area = new Areas(
						rs.getInt("ar_codigo"),
						rs.getString("ar_registro"),
						rs.getString("ar_detalle"),
						rs.getInt("ar_borrado")
			);
			arr.add(area);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Areas area) {
		String q = " insert into areas( ar_registro,  ar_detalle,  ar_borrado) values (?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, area.getAr_registro());
			ps.setString(2, area.getAr_detalle());
			ps.setInt(3, area.getAr_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Areas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Areas area) {
		String q = " update areas set  ar_registro=?,  ar_detalle=?,  ar_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, area.getAr_registro());
			ps.setString(2, area.getAr_detalle());
			ps.setInt(3, area.getAr_borrado());
			ps.setInt(4, area.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Areas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Areas area) {
		String q = " delete from areas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, area.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Areas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}