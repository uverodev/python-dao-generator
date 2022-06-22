package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Moneda;
import vista.*;

public class MonedaDAO extends Thread {
	private Moneda mone;
	public ArrayList<Moneda> resultadoMoneda;

	@Override
	public void run() {
		try{
			actualizarMoneda("");
		} catch (Exception e) {
			System.out.println("Error al generar Moneda");
		}
		yield();
	}

	public void actualizarMoneda(String condicion) {
		resultadoMoneda = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  moneda " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				mone = new Moneda(
						rs.getInt("nro"),
						rs.getString("fecha"),
						rs.getDouble("docom"),
						rs.getDouble("doven"),
						rs.getDouble("pecom"),
						rs.getDouble("peven"),
						rs.getDouble("recom"),
						rs.getDouble("reven"),
						rs.getDouble("eucom"),
						rs.getDouble("euven"),
						rs.getString("maquinasct")
			);
			arr.add(mone);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Moneda mone) {
		String q = " insert into moneda( fecha,  docom,  doven,  pecom,  peven,  recom,  reven,  eucom,  euven,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mone.getFecha());
			ps.setDouble(2, mone.getDocom());
			ps.setDouble(3, mone.getDoven());
			ps.setDouble(4, mone.getPecom());
			ps.setDouble(5, mone.getPeven());
			ps.setDouble(6, mone.getRecom());
			ps.setDouble(7, mone.getReven());
			ps.setDouble(8, mone.getEucom());
			ps.setDouble(9, mone.getEuven());
			ps.setString(10, mone.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Moneda", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Moneda mone) {
		String q = " update moneda set  fecha=?,  docom=?,  doven=?,  pecom=?,  peven=?,  recom=?,  reven=?,  eucom=?,  euven=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mone.getFecha());
			ps.setDouble(2, mone.getDocom());
			ps.setDouble(3, mone.getDoven());
			ps.setDouble(4, mone.getPecom());
			ps.setDouble(5, mone.getPeven());
			ps.setDouble(6, mone.getRecom());
			ps.setDouble(7, mone.getReven());
			ps.setDouble(8, mone.getEucom());
			ps.setDouble(9, mone.getEuven());
			ps.setString(10, mone.getMaquinasct());
			ps.setInt(11, mone.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Moneda", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Moneda mone) {
		String q = " delete from moneda where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, mone.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Moneda", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}