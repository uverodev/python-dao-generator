package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compras_categorias;
import vista.*;

public class Compras_categoriasDAO extends Thread {
	private Compras_categorias comp;
	public ArrayList<Compras_categorias> resultadoCompras_categorias;

	@Override
	public void run() {
		try{
			actualizarCompras_categorias("");
		} catch (Exception e) {
			System.out.println("Error al generar Compras_categorias");
		}
		yield();
	}

	public void actualizarCompras_categorias(String condicion) {
		resultadoCompras_categorias = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compras_categorias " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compras_categorias(
						rs.getInt("id"),
						rs.getString("nombre")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compras_categorias comp) {
		String q = " insert into compras_categorias( nombre) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getNombre());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compras_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compras_categorias comp) {
		String q = " update compras_categorias set  nombre=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getNombre());
			ps.setInt(2, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compras_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compras_categorias comp) {
		String q = " delete from compras_categorias where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compras_categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}