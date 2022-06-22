package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedidos;
import vista.*;

public class PedidosDAO extends Thread {
	private Pedidos pedi;
	public ArrayList<Pedidos> resultadoPedidos;

	@Override
	public void run() {
		try{
			actualizarPedidos("");
		} catch (Exception e) {
			System.out.println("Error al generar Pedidos");
		}
		yield();
	}

	public void actualizarPedidos(String condicion) {
		resultadoPedidos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pedidos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pedi = new Pedidos(
						rs.getInt("id"),
						rs.getString("pedido"),
						rs.getString("detalles"),
						rs.getString("estado"),
						rs.getString("fecha"),
						rs.getInt("idUsuarios")
			);
			arr.add(pedi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pedidos pedi) {
		String q = " insert into pedidos( pedido,  detalles,  estado,  fecha,  idUsuarios) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pedi.getPedido());
			ps.setString(2, pedi.getDetalles());
			ps.setString(3, pedi.getEstado());
			ps.setString(4, pedi.getFecha());
			ps.setInt(5, pedi.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pedidos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pedidos pedi) {
		String q = " update pedidos set  pedido=?,  detalles=?,  estado=?,  fecha=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pedi.getPedido());
			ps.setString(2, pedi.getDetalles());
			ps.setString(3, pedi.getEstado());
			ps.setString(4, pedi.getFecha());
			ps.setInt(5, pedi.getIdusuarios());
			ps.setInt(6, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pedidos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pedidos pedi) {
		String q = " delete from pedidos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pedi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pedidos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}