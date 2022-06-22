package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Inventario;
import vista.*;

public class InventarioDAO extends Thread {
	private Inventario inve;
	public ArrayList<Inventario> resultadoInventario;

	@Override
	public void run() {
		try{
			actualizarInventario("");
		} catch (Exception e) {
			System.out.println("Error al generar Inventario");
		}
		yield();
	}

	public void actualizarInventario(String condicion) {
		resultadoInventario = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  inventario " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				inve = new Inventario(
						rs.getInt("inv_id"),
						rs.getInt("inv_borrado"),
						rs.getInt("inv_usuario"),
						rs.getString("inv_fecha"),
						rs.getString("inv_maquina"),
						rs.getInt("inv_deposito"),
						rs.getString("inv_hora"),
						rs.getString("inv_fechasct")
			);
			arr.add(inve);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Inventario inve) {
		String q = " insert into inventario( inv_borrado,  inv_usuario,  inv_fecha,  inv_maquina,  inv_deposito,  inv_hora,  inv_fechasct) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, inve.getInv_borrado());
			ps.setInt(2, inve.getInv_usuario());
			ps.setString(3, inve.getInv_fecha());
			ps.setString(4, inve.getInv_maquina());
			ps.setInt(5, inve.getInv_deposito());
			ps.setString(6, inve.getInv_hora());
			ps.setString(7, inve.getInv_fechasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Inventario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Inventario inve) {
		String q = " update inventario set  inv_borrado=?,  inv_usuario=?,  inv_fecha=?,  inv_maquina=?,  inv_deposito=?,  inv_hora=?,  inv_fechasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, inve.getInv_borrado());
			ps.setInt(2, inve.getInv_usuario());
			ps.setString(3, inve.getInv_fecha());
			ps.setString(4, inve.getInv_maquina());
			ps.setInt(5, inve.getInv_deposito());
			ps.setString(6, inve.getInv_hora());
			ps.setString(7, inve.getInv_fechasct());
			ps.setInt(8, inve.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Inventario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Inventario inve) {
		String q = " delete from inventario where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, inve.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Inventario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}