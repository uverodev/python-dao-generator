package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuarios;
import vista.*;

public class UsuariosDAO extends Thread {
	private Usuarios usua;
	public ArrayList<Usuarios> resultadoUsuarios;

	@Override
	public void run() {
		try{
			actualizarUsuarios("");
		} catch (Exception e) {
			System.out.println("Error al generar Usuarios");
		}
		yield();
	}

	public void actualizarUsuarios(String condicion) {
		resultadoUsuarios = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  usuarios " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				usua = new Usuarios(
						rs.getInt("id"),
						rs.getString("usuario"),
						rs.getString("pass"),
						rs.getString("rango"),
						rs.getString("cinruc"),
						rs.getString("nombres"),
						rs.getString("apellidos"),
						rs.getString("direccion"),
						rs.getString("fecha"),
						rs.getString("celtel"),
						rs.getString("correo"),
						rs.getString("ciudad"),
						rs.getString("ultimoinicio"),
						rs.getString("ultimoip"),
						rs.getString("ultimopc"),
						rs.getBoolean("activo")
			);
			arr.add(usua);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Usuarios usua) {
		String q = " insert into usuarios( usuario,  pass,  rango,  cinruc,  nombres,  apellidos,  direccion,  fecha,  celtel,  correo,  ciudad,  ultimoinicio,  ultimoip,  ultimopc,  activo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, usua.getUsuario());
			ps.setString(2, usua.getPass());
			ps.setString(3, usua.getRango());
			ps.setString(4, usua.getCinruc());
			ps.setString(5, usua.getNombres());
			ps.setString(6, usua.getApellidos());
			ps.setString(7, usua.getDireccion());
			ps.setString(8, usua.getFecha());
			ps.setString(9, usua.getCeltel());
			ps.setString(10, usua.getCorreo());
			ps.setString(11, usua.getCiudad());
			ps.setString(12, usua.getUltimoinicio());
			ps.setString(13, usua.getUltimoip());
			ps.setString(14, usua.getUltimopc());
			ps.setBoolean(15, usua.getActivo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Usuarios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Usuarios usua) {
		String q = " update usuarios set  usuario=?,  pass=?,  rango=?,  cinruc=?,  nombres=?,  apellidos=?,  direccion=?,  fecha=?,  celtel=?,  correo=?,  ciudad=?,  ultimoinicio=?,  ultimoip=?,  ultimopc=?,  activo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, usua.getUsuario());
			ps.setString(2, usua.getPass());
			ps.setString(3, usua.getRango());
			ps.setString(4, usua.getCinruc());
			ps.setString(5, usua.getNombres());
			ps.setString(6, usua.getApellidos());
			ps.setString(7, usua.getDireccion());
			ps.setString(8, usua.getFecha());
			ps.setString(9, usua.getCeltel());
			ps.setString(10, usua.getCorreo());
			ps.setString(11, usua.getCiudad());
			ps.setString(12, usua.getUltimoinicio());
			ps.setString(13, usua.getUltimoip());
			ps.setString(14, usua.getUltimopc());
			ps.setBoolean(15, usua.getActivo());
			ps.setInt(16, usua.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Usuarios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Usuarios usua) {
		String q = " delete from usuarios where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, usua.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Usuarios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}