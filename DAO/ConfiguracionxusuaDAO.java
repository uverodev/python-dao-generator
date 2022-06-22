package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Configuracionxusua;
import vista.*;

public class ConfiguracionxusuaDAO extends Thread {
	private Configuracionxusua conf;
	public ArrayList<Configuracionxusua> resultadoConfiguracionxusua;

	@Override
	public void run() {
		try{
			actualizarConfiguracionxusua("");
		} catch (Exception e) {
			System.out.println("Error al generar Configuracionxusua");
		}
		yield();
	}

	public void actualizarConfiguracionxusua(String condicion) {
		resultadoConfiguracionxusua = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  configuracionxusua " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				conf = new Configuracionxusua(
						rs.getInt("uc_index"),
						rs.getInt("uc_codigo"),
						rs.getString("uc_descripcion"),
						rs.getInt("uc_estadovisible"),
						rs.getInt("uc_estadoactivo"),
						rs.getInt("uc_usuario")
			);
			arr.add(conf);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Configuracionxusua conf) {
		String q = " insert into configuracionxusua( uc_codigo,  uc_descripcion,  uc_estadovisible,  uc_estadoactivo,  uc_usuario) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getUc_codigo());
			ps.setString(2, conf.getUc_descripcion());
			ps.setInt(3, conf.getUc_estadovisible());
			ps.setInt(4, conf.getUc_estadoactivo());
			ps.setInt(5, conf.getUc_usuario());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Configuracionxusua", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Configuracionxusua conf) {
		String q = " update configuracionxusua set  uc_codigo=?,  uc_descripcion=?,  uc_estadovisible=?,  uc_estadoactivo=?,  uc_usuario=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getUc_codigo());
			ps.setString(2, conf.getUc_descripcion());
			ps.setInt(3, conf.getUc_estadovisible());
			ps.setInt(4, conf.getUc_estadoactivo());
			ps.setInt(5, conf.getUc_usuario());
			ps.setInt(6, conf.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Configuracionxusua", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Configuracionxusua conf) {
		String q = " delete from configuracionxusua where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, conf.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Configuracionxusua", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}