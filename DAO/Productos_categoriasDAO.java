package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productos_categorias;
import vista.*;

public class Productos_categoriasDAO extends Thread {
	private Productos_categorias prod;
	public ArrayList<Productos_categorias> resultadoProductos_categorias;

	@Override
	public void run() {
		try{
			actualizarProductos_categorias("");
		} catch (Exception e) {
			System.out.println("Error al generar Productos_categorias");
		}
		yield();
	}

	public void actualizarProductos_categorias(String condicion) {
		resultadoProductos_categorias = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productos_categorias " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productos_categorias(
						rs.getInt("id"),
						rs.getString("nombre")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productos_categorias prod) {
		String q = " insert into productos_categorias( nombre) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getNombre());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productos_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productos_categorias prod) {
		String q = " update productos_categorias set  nombre=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getNombre());
			ps.setInt(2, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productos_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productos_categorias prod) {
		String q = " delete from productos_categorias where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productos_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}