package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Laboratorio;
import vista.*;

public class LaboratorioDAO extends Thread {
	private Laboratorio labo;
	public ArrayList<Laboratorio> resultadoLaboratorio;

	@Override
	public void run() {
		try{
			actualizarLaboratorio("");
		} catch (Exception e) {
			System.out.println("Error al generar Laboratorio");
		}
		yield();
	}

	public void actualizarLaboratorio(String condicion) {
		resultadoLaboratorio = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  laboratorio " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				labo = new Laboratorio(
						rs.getInt("lab_cod"),
						rs.getString("lab_descri"),
						rs.getInt("lab_procedencia"),
						rs.getInt("lab_borrado"),
						rs.getDouble("lab_porcentpublic"),
						rs.getDouble("lab_porcentmay"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(labo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Laboratorio labo) {
		String q = " insert into laboratorio( lab_descri,  lab_procedencia,  lab_borrado,  lab_porcentpublic,  lab_porcentmay,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, labo.getLab_descri());
			ps.setInt(2, labo.getLab_procedencia());
			ps.setInt(3, labo.getLab_borrado());
			ps.setDouble(4, labo.getLab_porcentpublic());
			ps.setDouble(5, labo.getLab_porcentmay());
			ps.setString(6, labo.getFechasct());
			ps.setInt(7, labo.getUsuariosct());
			ps.setString(8, labo.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Laboratorio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Laboratorio labo) {
		String q = " update laboratorio set  lab_descri=?,  lab_procedencia=?,  lab_borrado=?,  lab_porcentpublic=?,  lab_porcentmay=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, labo.getLab_descri());
			ps.setInt(2, labo.getLab_procedencia());
			ps.setInt(3, labo.getLab_borrado());
			ps.setDouble(4, labo.getLab_porcentpublic());
			ps.setDouble(5, labo.getLab_porcentmay());
			ps.setString(6, labo.getFechasct());
			ps.setInt(7, labo.getUsuariosct());
			ps.setString(8, labo.getMaquinasct());
			ps.setInt(9, labo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Laboratorio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Laboratorio labo) {
		String q = " delete from laboratorio where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, labo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Laboratorio", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}