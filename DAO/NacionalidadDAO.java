package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Nacionalidad;
import vista.*;

public class NacionalidadDAO extends Thread {
	private Nacionalidad naci;
	public ArrayList<Nacionalidad> resultadoNacionalidad;

	@Override
	public void run() {
		try{
			actualizarNacionalidad("");
		} catch (Exception e) {
			System.out.println("Error al generar Nacionalidad");
		}
		yield();
	}

	public void actualizarNacionalidad(String condicion) {
		resultadoNacionalidad = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  nacionalidad " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				naci = new Nacionalidad(
						rs.getInt("nac_cod"),
						rs.getString("nac_descri"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(naci);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Nacionalidad naci) {
		String q = " insert into nacionalidad( nac_descri,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, naci.getNac_descri());
			ps.setString(2, naci.getFechasct());
			ps.setInt(3, naci.getUsuariosct());
			ps.setString(4, naci.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Nacionalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Nacionalidad naci) {
		String q = " update nacionalidad set  nac_descri=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, naci.getNac_descri());
			ps.setString(2, naci.getFechasct());
			ps.setInt(3, naci.getUsuariosct());
			ps.setString(4, naci.getMaquinasct());
			ps.setInt(5, naci.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Nacionalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Nacionalidad naci) {
		String q = " delete from nacionalidad where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, naci.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Nacionalidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}