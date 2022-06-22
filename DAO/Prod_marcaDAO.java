package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Prod_marca;
import vista.*;

public class Prod_marcaDAO extends Thread {
	private Prod_marca prod;
	public ArrayList<Prod_marca> resultadoProd_marca;

	@Override
	public void run() {
		try{
			actualizarProd_marca("");
		} catch (Exception e) {
			System.out.println("Error al generar Prod_marca");
		}
		yield();
	}

	public void actualizarProd_marca(String condicion) {
		resultadoProd_marca = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  prod_marca " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Prod_marca(
						rs.getInt("m_codigo"),
						rs.getString("m_fecha"),
						rs.getString("m_descripcion"),
						rs.getInt("m_borrado")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Prod_marca prod) {
		String q = " insert into prod_marca( m_fecha,  m_descripcion,  m_borrado) values (?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getM_fecha());
			ps.setString(2, prod.getM_descripcion());
			ps.setInt(3, prod.getM_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Prod_marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Prod_marca prod) {
		String q = " update prod_marca set  m_fecha=?,  m_descripcion=?,  m_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getM_fecha());
			ps.setString(2, prod.getM_descripcion());
			ps.setInt(3, prod.getM_borrado());
			ps.setInt(4, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Prod_marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Prod_marca prod) {
		String q = " delete from prod_marca where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Prod_marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}