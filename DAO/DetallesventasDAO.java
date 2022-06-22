package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detallesventas;
import vista.*;

public class DetallesventasDAO extends Thread {
	private Detallesventas deta;
	public ArrayList<Detallesventas> resultadoDetallesventas;

	@Override
	public void run() {
		try{
			actualizarDetallesventas("");
		} catch (Exception e) {
			System.out.println("Error al generar Detallesventas");
		}
		yield();
	}

	public void actualizarDetallesventas(String condicion) {
		resultadoDetallesventas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detallesventas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detallesventas(
						rs.getInt("id"),
						rs.getInt("idVentas"),
						rs.getInt("idProductos"),
						rs.getInt("idLote"),
						rs.getInt("cantidad"),
						rs.getInt("iva5"),
						rs.getInt("iva10"),
						rs.getInt("precio"),
						rs.getInt("subtotal")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detallesventas deta) {
		String q = " insert into detallesventas( idVentas,  idProductos,  idLote,  cantidad,  iva5,  iva10,  precio,  subtotal) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getIdventas());
			ps.setInt(2, deta.getIdproductos());
			ps.setInt(3, deta.getIdlote());
			ps.setInt(4, deta.getCantidad());
			ps.setInt(5, deta.getIva5());
			ps.setInt(6, deta.getIva10());
			ps.setInt(7, deta.getPrecio());
			ps.setInt(8, deta.getSubtotal());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detallesventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detallesventas deta) {
		String q = " update detallesventas set  idVentas=?,  idProductos=?,  idLote=?,  cantidad=?,  iva5=?,  iva10=?,  precio=?,  subtotal=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getIdventas());
			ps.setInt(2, deta.getIdproductos());
			ps.setInt(3, deta.getIdlote());
			ps.setInt(4, deta.getCantidad());
			ps.setInt(5, deta.getIva5());
			ps.setInt(6, deta.getIva10());
			ps.setInt(7, deta.getPrecio());
			ps.setInt(8, deta.getSubtotal());
			ps.setInt(9, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detallesventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detallesventas deta) {
		String q = " delete from detallesventas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detallesventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}