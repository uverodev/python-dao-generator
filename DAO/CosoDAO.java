package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Coso;
import vista.*;

public class CosoDAO extends Thread {
	private Coso coso;
	public ArrayList<Coso> resultadoCoso;

	@Override
	public void run() {
		try{
			actualizarCoso("");
		} catch (Exception e) {
			System.out.println("Error al generar Coso");
		}
		yield();
	}

	public void actualizarCoso(String condicion) {
		resultadoCoso = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  coso " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				coso = new Coso(
						rs.getDouble("coso"),
						rs.getString("coso2")
			);
			arr.add(coso);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Coso coso) {
		String q = " insert into coso( coso2) values (?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, coso.getCoso2());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Coso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Coso coso) {
		String q = " update coso set  coso2=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, coso.getCoso2());
			ps.setInt(2, coso.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Coso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Coso coso) {
		String q = " delete from coso where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, coso.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Coso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}