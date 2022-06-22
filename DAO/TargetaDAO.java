package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Targeta;
import vista.*;

public class TargetaDAO extends Thread {
	private Targeta targ;
	public ArrayList<Targeta> resultadoTargeta;

	@Override
	public void run() {
		try{
			actualizarTargeta("");
		} catch (Exception e) {
			System.out.println("Error al generar Targeta");
		}
		yield();
	}

	public void actualizarTargeta(String condicion) {
		resultadoTargeta = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  targeta " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				targ = new Targeta(
						rs.getInt("tar_nro"),
						rs.getString("tar_descripcion"),
						rs.getInt("tar_tipo"),
						rs.getInt("tar_borrado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(targ);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Targeta targ) {
		String q = " insert into targeta( tar_descripcion,  tar_tipo,  tar_borrado,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, targ.getTar_descripcion());
			ps.setInt(2, targ.getTar_tipo());
			ps.setInt(3, targ.getTar_borrado());
			ps.setString(4, targ.getFechasct());
			ps.setInt(5, targ.getUsuariosct());
			ps.setString(6, targ.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Targeta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Targeta targ) {
		String q = " update targeta set  tar_descripcion=?,  tar_tipo=?,  tar_borrado=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, targ.getTar_descripcion());
			ps.setInt(2, targ.getTar_tipo());
			ps.setInt(3, targ.getTar_borrado());
			ps.setString(4, targ.getFechasct());
			ps.setInt(5, targ.getUsuariosct());
			ps.setString(6, targ.getMaquinasct());
			ps.setInt(7, targ.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Targeta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Targeta targ) {
		String q = " delete from targeta where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, targ.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Targeta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}