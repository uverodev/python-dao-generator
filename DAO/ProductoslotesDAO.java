package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productoslotes;
import vista.*;

public class ProductoslotesDAO extends Thread {
	private Productoslotes prod;
	public ArrayList<Productoslotes> resultadoProductoslotes;

	@Override
	public void run() {
		try{
			actualizarProductoslotes("");
		} catch (Exception e) {
			System.out.println("Error al generar Productoslotes");
		}
		yield();
	}

	public void actualizarProductoslotes(String condicion) {
		resultadoProductoslotes = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productoslotes " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productoslotes(
						rs.getInt("id"),
						rs.getString("fecha"),
						rs.getString("facturanum"),
						rs.getString("estado"),
						rs.getInt("gastototal"),
						rs.getInt("ivacredito"),
						rs.getInt("idProveedor"),
						rs.getInt("idUsuarios")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productoslotes prod) {
		String q = " insert into productoslotes( fecha,  facturanum,  estado,  gastototal,  ivacredito,  idProveedor,  idUsuarios) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getFecha());
			ps.setString(2, prod.getFacturanum());
			ps.setString(3, prod.getEstado());
			ps.setInt(4, prod.getGastototal());
			ps.setInt(5, prod.getIvacredito());
			ps.setInt(6, prod.getIdproveedor());
			ps.setInt(7, prod.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productoslotes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productoslotes prod) {
		String q = " update productoslotes set  fecha=?,  facturanum=?,  estado=?,  gastototal=?,  ivacredito=?,  idProveedor=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getFecha());
			ps.setString(2, prod.getFacturanum());
			ps.setString(3, prod.getEstado());
			ps.setInt(4, prod.getGastototal());
			ps.setInt(5, prod.getIvacredito());
			ps.setInt(6, prod.getIdproveedor());
			ps.setInt(7, prod.getIdusuarios());
			ps.setInt(8, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productoslotes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productoslotes prod) {
		String q = " delete from productoslotes where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productoslotes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}