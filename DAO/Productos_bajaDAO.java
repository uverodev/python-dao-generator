package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productos_baja;
import vista.*;

public class Productos_bajaDAO extends Thread {
	private Productos_baja prod;
	public ArrayList<Productos_baja> resultadoProductos_baja;

	@Override
	public void run() {
		try{
			actualizarProductos_baja("");
		} catch (Exception e) {
			System.out.println("Error al generar Productos_baja");
		}
		yield();
	}

	public void actualizarProductos_baja(String condicion) {
		resultadoProductos_baja = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productos_baja " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productos_baja(
						rs.getInt("pb_nro"),
						rs.getDouble("pb_cantidad"),
						rs.getString("pb_fecha"),
						rs.getString("pb_hora"),
						rs.getString("fechasct"),
						rs.getInt("pb_borrado"),
						rs.getString("pb_codigo_producto"),
						rs.getInt("pb_deposito_producto"),
						rs.getString("pb_lote_producto"),
						rs.getString("pb_vencimiento_producto"),
						rs.getInt("pb_usuario"),
						rs.getString("pb_maquina"),
						rs.getString("pb_motivo"),
						rs.getDouble("pb_precio_compra"),
						rs.getDouble("pb_precio_venta")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productos_baja prod) {
		String q = " insert into productos_baja( pb_cantidad,  pb_fecha,  pb_hora,  fechasct,  pb_borrado,  pb_codigo_producto,  pb_deposito_producto,  pb_lote_producto,  pb_vencimiento_producto,  pb_usuario,  pb_maquina,  pb_motivo,  pb_precio_compra,  pb_precio_venta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, prod.getPb_cantidad());
			ps.setString(2, prod.getPb_fecha());
			ps.setString(3, prod.getPb_hora());
			ps.setString(4, prod.getFechasct());
			ps.setInt(5, prod.getPb_borrado());
			ps.setString(6, prod.getPb_codigo_producto());
			ps.setInt(7, prod.getPb_deposito_producto());
			ps.setString(8, prod.getPb_lote_producto());
			ps.setString(9, prod.getPb_vencimiento_producto());
			ps.setInt(10, prod.getPb_usuario());
			ps.setString(11, prod.getPb_maquina());
			ps.setString(12, prod.getPb_motivo());
			ps.setDouble(13, prod.getPb_precio_compra());
			ps.setDouble(14, prod.getPb_precio_venta());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productos_baja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productos_baja prod) {
		String q = " update productos_baja set  pb_cantidad=?,  pb_fecha=?,  pb_hora=?,  fechasct=?,  pb_borrado=?,  pb_codigo_producto=?,  pb_deposito_producto=?,  pb_lote_producto=?,  pb_vencimiento_producto=?,  pb_usuario=?,  pb_maquina=?,  pb_motivo=?,  pb_precio_compra=?,  pb_precio_venta=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, prod.getPb_cantidad());
			ps.setString(2, prod.getPb_fecha());
			ps.setString(3, prod.getPb_hora());
			ps.setString(4, prod.getFechasct());
			ps.setInt(5, prod.getPb_borrado());
			ps.setString(6, prod.getPb_codigo_producto());
			ps.setInt(7, prod.getPb_deposito_producto());
			ps.setString(8, prod.getPb_lote_producto());
			ps.setString(9, prod.getPb_vencimiento_producto());
			ps.setInt(10, prod.getPb_usuario());
			ps.setString(11, prod.getPb_maquina());
			ps.setString(12, prod.getPb_motivo());
			ps.setDouble(13, prod.getPb_precio_compra());
			ps.setDouble(14, prod.getPb_precio_venta());
			ps.setInt(15, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productos_baja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productos_baja prod) {
		String q = " delete from productos_baja where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productos_baja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}