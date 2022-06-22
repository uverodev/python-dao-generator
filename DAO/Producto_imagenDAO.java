package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto_imagen;
import vista.*;

public class Producto_imagenDAO extends Thread {
	private Producto_imagen prod;
	public ArrayList<Producto_imagen> resultadoProducto_imagen;

	@Override
	public void run() {
		try{
			actualizarProducto_imagen("");
		} catch (Exception e) {
			System.out.println("Error al generar Producto_imagen");
		}
		yield();
	}

	public void actualizarProducto_imagen(String condicion) {
		resultadoProducto_imagen = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  producto_imagen " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Producto_imagen(
						rs.getInt("pri_id"),
						rs.getObject("pri_codproducto"),
						rs.getObject("pri_archivo"),
						rs.getObject("pri_nombre"),
						rs.getObject("pri_nro")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Producto_imagen prod) {
		String q = " insert into producto_imagen( pri_codproducto,  pri_archivo,  pri_nombre,  pri_nro) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, prod.getPri_codproducto());
			ps.setObject(2, prod.getPri_archivo());
			ps.setObject(3, prod.getPri_nombre());
			ps.setObject(4, prod.getPri_nro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Producto_imagen", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Producto_imagen prod) {
		String q = " update producto_imagen set  pri_codproducto=?,  pri_archivo=?,  pri_nombre=?,  pri_nro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, prod.getPri_codproducto());
			ps.setObject(2, prod.getPri_archivo());
			ps.setObject(3, prod.getPri_nombre());
			ps.setObject(4, prod.getPri_nro());
			ps.setInt(5, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Producto_imagen", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Producto_imagen prod) {
		String q = " delete from producto_imagen where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Producto_imagen", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}