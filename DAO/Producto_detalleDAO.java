package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto_detalle;
import vista.*;

public class Producto_detalleDAO extends Thread {
	private Producto_detalle prod;
	public ArrayList<Producto_detalle> resultadoProducto_detalle;

	@Override
	public void run() {
		try{
			actualizarProducto_detalle("");
		} catch (Exception e) {
			System.out.println("Error al generar Producto_detalle");
		}
		yield();
	}

	public void actualizarProducto_detalle(String condicion) {
		resultadoProducto_detalle = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  producto_detalle " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Producto_detalle(
						rs.getInt("pd_nro"),
						rs.getInt("pd_stock"),
						rs.getDouble("pd_cantidad"),
						rs.getInt("pd_producto"),
						rs.getObject("pd_codprod")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Producto_detalle prod) {
		String q = " insert into producto_detalle( pd_stock,  pd_cantidad,  pd_producto,  pd_codprod) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getPd_stock());
			ps.setDouble(2, prod.getPd_cantidad());
			ps.setInt(3, prod.getPd_producto());
			ps.setObject(4, prod.getPd_codprod());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Producto_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Producto_detalle prod) {
		String q = " update producto_detalle set  pd_stock=?,  pd_cantidad=?,  pd_producto=?,  pd_codprod=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getPd_stock());
			ps.setDouble(2, prod.getPd_cantidad());
			ps.setInt(3, prod.getPd_producto());
			ps.setObject(4, prod.getPd_codprod());
			ps.setInt(5, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Producto_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Producto_detalle prod) {
		String q = " delete from producto_detalle where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Producto_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}