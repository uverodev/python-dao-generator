package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Unidad;
import vista.*;

public class UnidadDAO extends Thread {
	private Unidad unid;
	public ArrayList<Unidad> resultadoUnidad;

	@Override
	public void run() {
		try{
			actualizarUnidad("");
		} catch (Exception e) {
			System.out.println("Error al generar Unidad");
		}
		yield();
	}

	public void actualizarUnidad(String condicion) {
		resultadoUnidad = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  unidad " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				unid = new Unidad(
						rs.getInt("und_nro"),
						rs.getString("und_descripcion"),
						rs.getInt("und_borrado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(unid);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Unidad unid) {
		String q = " insert into unidad( und_descripcion,  und_borrado,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, unid.getUnd_descripcion());
			ps.setInt(2, unid.getUnd_borrado());
			ps.setString(3, unid.getFechasct());
			ps.setInt(4, unid.getUsuariosct());
			ps.setString(5, unid.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Unidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Unidad unid) {
		String q = " update unidad set  und_descripcion=?,  und_borrado=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, unid.getUnd_descripcion());
			ps.setInt(2, unid.getUnd_borrado());
			ps.setString(3, unid.getFechasct());
			ps.setInt(4, unid.getUsuariosct());
			ps.setString(5, unid.getMaquinasct());
			ps.setInt(6, unid.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Unidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Unidad unid) {
		String q = " delete from unidad where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, unid.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Unidad", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}