package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.P_combustible;
import vista.*;

public class P_combustibleDAO extends Thread {
	private P_combustible p_co;
	public ArrayList<P_combustible> resultadoP_combustible;

	@Override
	public void run() {
		try{
			actualizarP_combustible("");
		} catch (Exception e) {
			System.out.println("Error al generar P_combustible");
		}
		yield();
	}

	public void actualizarP_combustible(String condicion) {
		resultadoP_combustible = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  p_combustible " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				p_co = new P_combustible(
						rs.getInt("pc_codigo"),
						rs.getString("pc_descripcion"),
						rs.getInt("pc_borrado"),
						rs.getString("pc_referencia"),
						rs.getString("pc_fecha")
			);
			arr.add(p_co);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(P_combustible p_co) {
		String q = " insert into p_combustible( pc_descripcion,  pc_borrado,  pc_referencia,  pc_fecha) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, p_co.getPc_descripcion());
			ps.setInt(2, p_co.getPc_borrado());
			ps.setString(3, p_co.getPc_referencia());
			ps.setString(4, p_co.getPc_fecha());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar P_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(P_combustible p_co) {
		String q = " update p_combustible set  pc_descripcion=?,  pc_borrado=?,  pc_referencia=?,  pc_fecha=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, p_co.getPc_descripcion());
			ps.setInt(2, p_co.getPc_borrado());
			ps.setString(3, p_co.getPc_referencia());
			ps.setString(4, p_co.getPc_fecha());
			ps.setInt(5, p_co.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar P_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(P_combustible p_co) {
		String q = " delete from p_combustible where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, p_co.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar P_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}