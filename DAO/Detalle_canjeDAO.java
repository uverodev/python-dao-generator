package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalle_canje;
import vista.*;

public class Detalle_canjeDAO extends Thread {
	private Detalle_canje deta;
	public ArrayList<Detalle_canje> resultadoDetalle_canje;

	@Override
	public void run() {
		try{
			actualizarDetalle_canje("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalle_canje");
		}
		yield();
	}

	public void actualizarDetalle_canje(String condicion) {
		resultadoDetalle_canje = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalle_canje " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalle_canje(
						rs.getInt("dcj_id"),
						rs.getInt("dcj_nro_cabecera"),
						rs.getString("dcj_codigo_producto"),
						rs.getString("dcj_lote"),
						rs.getInt("dcj_deposito"),
						rs.getDouble("dcj_cantidad"),
						rs.getDouble("dcj_precio_compra"),
						rs.getString("dcj_vencimiento"),
						rs.getInt("dcj_borrado")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalle_canje deta) {
		String q = " insert into detalle_canje( dcj_nro_cabecera,  dcj_codigo_producto,  dcj_lote,  dcj_deposito,  dcj_cantidad,  dcj_precio_compra,  dcj_vencimiento,  dcj_borrado) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDcj_nro_cabecera());
			ps.setString(2, deta.getDcj_codigo_producto());
			ps.setString(3, deta.getDcj_lote());
			ps.setInt(4, deta.getDcj_deposito());
			ps.setDouble(5, deta.getDcj_cantidad());
			ps.setDouble(6, deta.getDcj_precio_compra());
			ps.setString(7, deta.getDcj_vencimiento());
			ps.setInt(8, deta.getDcj_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalle_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalle_canje deta) {
		String q = " update detalle_canje set  dcj_nro_cabecera=?,  dcj_codigo_producto=?,  dcj_lote=?,  dcj_deposito=?,  dcj_cantidad=?,  dcj_precio_compra=?,  dcj_vencimiento=?,  dcj_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDcj_nro_cabecera());
			ps.setString(2, deta.getDcj_codigo_producto());
			ps.setString(3, deta.getDcj_lote());
			ps.setInt(4, deta.getDcj_deposito());
			ps.setDouble(5, deta.getDcj_cantidad());
			ps.setDouble(6, deta.getDcj_precio_compra());
			ps.setString(7, deta.getDcj_vencimiento());
			ps.setInt(8, deta.getDcj_borrado());
			ps.setInt(9, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalle_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalle_canje deta) {
		String q = " delete from detalle_canje where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalle_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}