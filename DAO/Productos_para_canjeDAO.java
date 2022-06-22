package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productos_para_canje;
import vista.*;

public class Productos_para_canjeDAO extends Thread {
	private Productos_para_canje prod;
	public ArrayList<Productos_para_canje> resultadoProductos_para_canje;

	@Override
	public void run() {
		try{
			actualizarProductos_para_canje("");
		} catch (Exception e) {
			System.out.println("Error al generar Productos_para_canje");
		}
		yield();
	}

	public void actualizarProductos_para_canje(String condicion) {
		resultadoProductos_para_canje = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productos_para_canje " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productos_para_canje(
						rs.getInt("ppc_nro"),
						rs.getDouble("ppc_cantidad"),
						rs.getString("ppc_fecha"),
						rs.getString("ppc_hora"),
						rs.getString("fechasct"),
						rs.getInt("ppc_borrado"),
						rs.getInt("ppc_canjedo"),
						rs.getString("ppc_codigo_producto"),
						rs.getInt("ppc_deposito_producto"),
						rs.getString("ppc_lote_producto"),
						rs.getString("ppc_vencimiento_producto"),
						rs.getInt("ppc_usuario"),
						rs.getString("ppc_maquina"),
						rs.getString("ppc_motivo"),
						rs.getDouble("ppc_precio_compra"),
						rs.getDouble("ppc_precio_venta")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productos_para_canje prod) {
		String q = " insert into productos_para_canje( ppc_cantidad,  ppc_fecha,  ppc_hora,  fechasct,  ppc_borrado,  ppc_canjedo,  ppc_codigo_producto,  ppc_deposito_producto,  ppc_lote_producto,  ppc_vencimiento_producto,  ppc_usuario,  ppc_maquina,  ppc_motivo,  ppc_precio_compra,  ppc_precio_venta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, prod.getPpc_cantidad());
			ps.setString(2, prod.getPpc_fecha());
			ps.setString(3, prod.getPpc_hora());
			ps.setString(4, prod.getFechasct());
			ps.setInt(5, prod.getPpc_borrado());
			ps.setInt(6, prod.getPpc_canjedo());
			ps.setString(7, prod.getPpc_codigo_producto());
			ps.setInt(8, prod.getPpc_deposito_producto());
			ps.setString(9, prod.getPpc_lote_producto());
			ps.setString(10, prod.getPpc_vencimiento_producto());
			ps.setInt(11, prod.getPpc_usuario());
			ps.setString(12, prod.getPpc_maquina());
			ps.setString(13, prod.getPpc_motivo());
			ps.setDouble(14, prod.getPpc_precio_compra());
			ps.setDouble(15, prod.getPpc_precio_venta());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productos_para_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productos_para_canje prod) {
		String q = " update productos_para_canje set  ppc_cantidad=?,  ppc_fecha=?,  ppc_hora=?,  fechasct=?,  ppc_borrado=?,  ppc_canjedo=?,  ppc_codigo_producto=?,  ppc_deposito_producto=?,  ppc_lote_producto=?,  ppc_vencimiento_producto=?,  ppc_usuario=?,  ppc_maquina=?,  ppc_motivo=?,  ppc_precio_compra=?,  ppc_precio_venta=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, prod.getPpc_cantidad());
			ps.setString(2, prod.getPpc_fecha());
			ps.setString(3, prod.getPpc_hora());
			ps.setString(4, prod.getFechasct());
			ps.setInt(5, prod.getPpc_borrado());
			ps.setInt(6, prod.getPpc_canjedo());
			ps.setString(7, prod.getPpc_codigo_producto());
			ps.setInt(8, prod.getPpc_deposito_producto());
			ps.setString(9, prod.getPpc_lote_producto());
			ps.setString(10, prod.getPpc_vencimiento_producto());
			ps.setInt(11, prod.getPpc_usuario());
			ps.setString(12, prod.getPpc_maquina());
			ps.setString(13, prod.getPpc_motivo());
			ps.setDouble(14, prod.getPpc_precio_compra());
			ps.setDouble(15, prod.getPpc_precio_venta());
			ps.setInt(16, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productos_para_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productos_para_canje prod) {
		String q = " delete from productos_para_canje where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productos_para_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}