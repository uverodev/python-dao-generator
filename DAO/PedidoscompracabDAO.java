package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedidoscompracab;
import vista.*;

public class PedidoscompracabDAO extends Thread {
	private Pedidoscompracab pedi;
	public ArrayList<Pedidoscompracab> resultadoPedidoscompracab;

	@Override
	public void run() {
		try{
			actualizarPedidoscompracab("");
		} catch (Exception e) {
			System.out.println("Error al generar Pedidoscompracab");
		}
		yield();
	}

	public void actualizarPedidoscompracab(String condicion) {
		resultadoPedidoscompracab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pedidoscompracab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pedi = new Pedidoscompracab(
						rs.getInt("cpc_codigo"),
						rs.getString("cpc_fecha"),
						rs.getInt("cpc_usuario"),
						rs.getDouble("cpc_total"),
						rs.getString("cpc_fechallegada"),
						rs.getInt("cpc_proveedor"),
						rs.getInt("cpc_borrado"),
						rs.getString("cpc_maquina")
			);
			arr.add(pedi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pedidoscompracab pedi) {
		String q = " insert into pedidoscompracab( cpc_fecha,  cpc_usuario,  cpc_total,  cpc_fechallegada,  cpc_proveedor,  cpc_borrado,  cpc_maquina) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pedi.getCpc_fecha());
			ps.setInt(2, pedi.getCpc_usuario());
			ps.setDouble(3, pedi.getCpc_total());
			ps.setString(4, pedi.getCpc_fechallegada());
			ps.setInt(5, pedi.getCpc_proveedor());
			ps.setInt(6, pedi.getCpc_borrado());
			ps.setString(7, pedi.getCpc_maquina());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pedidoscompracab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pedidoscompracab pedi) {
		String q = " update pedidoscompracab set  cpc_fecha=?,  cpc_usuario=?,  cpc_total=?,  cpc_fechallegada=?,  cpc_proveedor=?,  cpc_borrado=?,  cpc_maquina=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pedi.getCpc_fecha());
			ps.setInt(2, pedi.getCpc_usuario());
			ps.setDouble(3, pedi.getCpc_total());
			ps.setString(4, pedi.getCpc_fechallegada());
			ps.setInt(5, pedi.getCpc_proveedor());
			ps.setInt(6, pedi.getCpc_borrado());
			ps.setString(7, pedi.getCpc_maquina());
			ps.setInt(8, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pedidoscompracab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pedidoscompracab pedi) {
		String q = " delete from pedidoscompracab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pedidoscompracab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}