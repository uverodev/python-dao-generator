package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedidoscompradet;
import vista.*;

public class PedidoscompradetDAO extends Thread {
	private Pedidoscompradet pedi;
	public ArrayList<Pedidoscompradet> resultadoPedidoscompradet;

	@Override
	public void run() {
		try{
			actualizarPedidoscompradet("");
		} catch (Exception e) {
			System.out.println("Error al generar Pedidoscompradet");
		}
		yield();
	}

	public void actualizarPedidoscompradet(String condicion) {
		resultadoPedidoscompradet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pedidoscompradet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pedi = new Pedidoscompradet(
						rs.getInt("cp_codigo"),
						rs.getInt("cp_orden"),
						rs.getString("cp_codprod"),
						rs.getDouble("cp_cantidad"),
						rs.getDouble("cp_costo"),
						rs.getDouble("cp_stockant")
			);
			arr.add(pedi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pedidoscompradet pedi) {
		String q = " insert into pedidoscompradet( cp_orden,  cp_codprod,  cp_cantidad,  cp_costo,  cp_stockant) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pedi.getCp_orden());
			ps.setString(2, pedi.getCp_codprod());
			ps.setDouble(3, pedi.getCp_cantidad());
			ps.setDouble(4, pedi.getCp_costo());
			ps.setDouble(5, pedi.getCp_stockant());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pedidoscompradet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pedidoscompradet pedi) {
		String q = " update pedidoscompradet set  cp_orden=?,  cp_codprod=?,  cp_cantidad=?,  cp_costo=?,  cp_stockant=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pedi.getCp_orden());
			ps.setString(2, pedi.getCp_codprod());
			ps.setDouble(3, pedi.getCp_cantidad());
			ps.setDouble(4, pedi.getCp_costo());
			ps.setDouble(5, pedi.getCp_stockant());
			ps.setInt(6, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pedidoscompradet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pedidoscompradet pedi) {
		String q = " delete from pedidoscompradet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pedidoscompradet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}