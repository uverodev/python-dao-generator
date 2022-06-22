package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Comprasdetalles;
import vista.*;

public class ComprasdetallesDAO extends Thread {
	private Comprasdetalles comp;
	public ArrayList<Comprasdetalles> resultadoComprasdetalles;

	@Override
	public void run() {
		try{
			actualizarComprasdetalles("");
		} catch (Exception e) {
			System.out.println("Error al generar Comprasdetalles");
		}
		yield();
	}

	public void actualizarComprasdetalles(String condicion) {
		resultadoComprasdetalles = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  comprasdetalles " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Comprasdetalles(
						rs.getInt("id"),
						rs.getString("concepto"),
						rs.getInt("cantidad"),
						rs.getInt("costo"),
						rs.getInt("idCompras")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Comprasdetalles comp) {
		String q = " insert into comprasdetalles( concepto,  cantidad,  costo,  idCompras) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getConcepto());
			ps.setInt(2, comp.getCantidad());
			ps.setInt(3, comp.getCosto());
			ps.setInt(4, comp.getIdcompras());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Comprasdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Comprasdetalles comp) {
		String q = " update comprasdetalles set  concepto=?,  cantidad=?,  costo=?,  idCompras=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getConcepto());
			ps.setInt(2, comp.getCantidad());
			ps.setInt(3, comp.getCosto());
			ps.setInt(4, comp.getIdcompras());
			ps.setInt(5, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Comprasdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Comprasdetalles comp) {
		String q = " delete from comprasdetalles where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Comprasdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}