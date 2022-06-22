package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Costo_promedio;
import vista.*;

public class Costo_promedioDAO extends Thread {
	private Costo_promedio cost;
	public ArrayList<Costo_promedio> resultadoCosto_promedio;

	@Override
	public void run() {
		try{
			actualizarCosto_promedio("");
		} catch (Exception e) {
			System.out.println("Error al generar Costo_promedio");
		}
		yield();
	}

	public void actualizarCosto_promedio(String condicion) {
		resultadoCosto_promedio = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  costo_promedio " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cost = new Costo_promedio(
						rs.getString("codigo"),
						rs.getDouble("costo_promedio")
			);
			arr.add(cost);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Costo_promedio cost) {
		String q = " insert into costo_promedio( costo_promedio) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, cost.getCosto_promedio());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Costo_promedio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Costo_promedio cost) {
		String q = " update costo_promedio set  costo_promedio=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, cost.getCosto_promedio());
			ps.setInt(2, cost.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Costo_promedio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Costo_promedio cost) {
		String q = " delete from costo_promedio where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cost.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Costo_promedio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}