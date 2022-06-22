package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Permisos;
import vista.*;

public class PermisosDAO extends Thread {
	private Permisos perm;
	public ArrayList<Permisos> resultadoPermisos;

	@Override
	public void run() {
		try{
			actualizarPermisos("");
		} catch (Exception e) {
			System.out.println("Error al generar Permisos");
		}
		yield();
	}

	public void actualizarPermisos(String condicion) {
		resultadoPermisos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  permisos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				perm = new Permisos(
						rs.getInt("id"),
						rs.getInt("idUsuarios"),
						rs.getString("permisos_json")
			);
			arr.add(perm);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Permisos perm) {
		String q = " insert into permisos( idUsuarios,  permisos_json) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, perm.getIdusuarios());
			ps.setString(2, perm.getPermisos_json());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Permisos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Permisos perm) {
		String q = " update permisos set  idUsuarios=?,  permisos_json=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, perm.getIdusuarios());
			ps.setString(2, perm.getPermisos_json());
			ps.setInt(3, perm.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Permisos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Permisos perm) {
		String q = " delete from permisos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, perm.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Permisos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}