package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ciudades;
import vista.*;

public class CiudadesDAO extends Thread {
	private Ciudades ciud;
	public ArrayList<Ciudades> resultadoCiudades;

	@Override
	public void run() {
		try{
			actualizarCiudades("");
		} catch (Exception e) {
			System.out.println("Error al generar Ciudades");
		}
		yield();
	}

	public void actualizarCiudades(String condicion) {
		resultadoCiudades = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ciudades " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				ciud = new Ciudades(
						rs.getInt("ciu_nro"),
						rs.getString("ciu_nombre"),
						rs.getInt("ciu_borrado")
			);
			arr.add(ciud);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ciudades ciud) {
		String q = " insert into ciudades( ciu_nombre,  ciu_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, ciud.getCiu_nombre());
			ps.setInt(2, ciud.getCiu_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ciudades", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ciudades ciud) {
		String q = " update ciudades set  ciu_nombre=?,  ciu_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, ciud.getCiu_nombre());
			ps.setInt(2, ciud.getCiu_borrado());
			ps.setInt(3, ciud.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ciudades", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ciudades ciud) {
		String q = " delete from ciudades where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, ciud.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ciudades", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}