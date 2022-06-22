package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Monedas;
import vista.*;

public class MonedasDAO extends Thread {
	private Monedas mone;
	public ArrayList<Monedas> resultadoMonedas;

	@Override
	public void run() {
		try{
			actualizarMonedas("");
		} catch (Exception e) {
			System.out.println("Error al generar Monedas");
		}
		yield();
	}

	public void actualizarMonedas(String condicion) {
		resultadoMonedas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  monedas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				mone = new Monedas(
						rs.getInt("id"),
						rs.getString("nombre"),
						rs.getDouble("cambio")
			);
			arr.add(mone);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Monedas mone) {
		String q = " insert into monedas( nombre,  cambio) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mone.getNombre());
			ps.setDouble(2, mone.getCambio());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Monedas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Monedas mone) {
		String q = " update monedas set  nombre=?,  cambio=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, mone.getNombre());
			ps.setDouble(2, mone.getCambio());
			ps.setInt(3, mone.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Monedas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Monedas mone) {
		String q = " delete from monedas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, mone.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Monedas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}