package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productoslotesdetalles;
import vista.*;

public class ProductoslotesdetallesDAO extends Thread {
	private Productoslotesdetalles prod;
	public ArrayList<Productoslotesdetalles> resultadoProductoslotesdetalles;

	@Override
	public void run() {
		try{
			actualizarProductoslotesdetalles("");
		} catch (Exception e) {
			System.out.println("Error al generar Productoslotesdetalles");
		}
		yield();
	}

	public void actualizarProductoslotesdetalles(String condicion) {
		resultadoProductoslotesdetalles = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productoslotesdetalles " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productoslotesdetalles(
						rs.getInt("id"),
						rs.getInt("cantidad"),
						rs.getInt("costo"),
						rs.getInt("idLote"),
						rs.getString("vencimiento"),
						rs.getInt("idProducto"),
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

	public boolean insertar(Productoslotesdetalles prod) {
		String q = " insert into productoslotesdetalles( cantidad,  costo,  idLote,  vencimiento,  idProducto,  idUsuarios) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getCantidad());
			ps.setInt(2, prod.getCosto());
			ps.setInt(3, prod.getIdlote());
			ps.setString(4, prod.getVencimiento());
			ps.setInt(5, prod.getIdproducto());
			ps.setInt(6, prod.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productoslotesdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productoslotesdetalles prod) {
		String q = " update productoslotesdetalles set  cantidad=?,  costo=?,  idLote=?,  vencimiento=?,  idProducto=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getCantidad());
			ps.setInt(2, prod.getCosto());
			ps.setInt(3, prod.getIdlote());
			ps.setString(4, prod.getVencimiento());
			ps.setInt(5, prod.getIdproducto());
			ps.setInt(6, prod.getIdusuarios());
			ps.setInt(7, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productoslotesdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productoslotesdetalles prod) {
		String q = " delete from productoslotesdetalles where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productoslotesdetalles", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}