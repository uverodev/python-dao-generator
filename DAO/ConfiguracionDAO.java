package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Configuracion;
import vista.*;

public class ConfiguracionDAO extends Thread {
	private Configuracion conf;
	public ArrayList<Configuracion> resultadoConfiguracion;

	@Override
	public void run() {
		try{
			actualizarConfiguracion("");
		} catch (Exception e) {
			System.out.println("Error al generar Configuracion");
		}
		yield();
	}

	public void actualizarConfiguracion(String condicion) {
		resultadoConfiguracion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  configuracion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				conf = new Configuracion(
						rs.getInt("c_index"),
						rs.getInt("c_codigo"),
						rs.getString("c_descripcion"),
						rs.getInt("c_estadovisible"),
						rs.getInt("c_estadoactivo"),
						rs.getString("c_nombrepc")
			);
			arr.add(conf);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Configuracion conf) {
		String q = " insert into configuracion( c_codigo,  c_descripcion,  c_estadovisible,  c_estadoactivo,  c_nombrepc) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getC_codigo());
			ps.setString(2, conf.getC_descripcion());
			ps.setInt(3, conf.getC_estadovisible());
			ps.setInt(4, conf.getC_estadoactivo());
			ps.setString(5, conf.getC_nombrepc());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Configuracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Configuracion conf) {
		String q = " update configuracion set  c_codigo=?,  c_descripcion=?,  c_estadovisible=?,  c_estadoactivo=?,  c_nombrepc=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getC_codigo());
			ps.setString(2, conf.getC_descripcion());
			ps.setInt(3, conf.getC_estadovisible());
			ps.setInt(4, conf.getC_estadoactivo());
			ps.setString(5, conf.getC_nombrepc());
			ps.setInt(6, conf.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Configuracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Configuracion conf) {
		String q = " delete from configuracion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Configuracion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}