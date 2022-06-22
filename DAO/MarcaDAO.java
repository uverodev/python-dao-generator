package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Marca;
import vista.*;

public class MarcaDAO extends Thread {
	private Marca marc;
	public ArrayList<Marca> resultadoMarca;

	@Override
	public void run() {
		try{
			actualizarMarca("");
		} catch (Exception e) {
			System.out.println("Error al generar Marca");
		}
		yield();
	}

	public void actualizarMarca(String condicion) {
		resultadoMarca = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  marca " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				marc = new Marca(
						rs.getInt("mar_cod"),
						rs.getString("mar_descripcion"),
						rs.getInt("mar_borrado")
			);
			arr.add(marc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Marca marc) {
		String q = " insert into marca( mar_descripcion,  mar_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, marc.getMar_descripcion());
			ps.setInt(2, marc.getMar_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Marca marc) {
		String q = " update marca set  mar_descripcion=?,  mar_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, marc.getMar_descripcion());
			ps.setInt(2, marc.getMar_borrado());
			ps.setInt(3, marc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Marca marc) {
		String q = " delete from marca where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, marc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Marca", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}