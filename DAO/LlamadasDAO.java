package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Llamadas;
import vista.*;

public class LlamadasDAO extends Thread {
	private Llamadas llam;
	public ArrayList<Llamadas> resultadoLlamadas;

	@Override
	public void run() {
		try{
			actualizarLlamadas("");
		} catch (Exception e) {
			System.out.println("Error al generar Llamadas");
		}
		yield();
	}

	public void actualizarLlamadas(String condicion) {
		resultadoLlamadas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  llamadas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				llam = new Llamadas(
						rs.getInt("l_nro"),
						rs.getString("l_fecha"),
						rs.getString("l_hora"),
						rs.getString("l_cliente"),
						rs.getInt("l_usuario"),
						rs.getString("l_observacion"),
						rs.getString("l_duracion"),
						rs.getInt("l_borrado"),
						rs.getString("l_fecfijada"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct")
			);
			arr.add(llam);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Llamadas llam) {
		String q = " insert into llamadas( l_fecha,  l_hora,  l_cliente,  l_usuario,  l_observacion,  l_duracion,  l_borrado,  l_fecfijada,  fechasct,  usuariosct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, llam.getL_fecha());
			ps.setString(2, llam.getL_hora());
			ps.setString(3, llam.getL_cliente());
			ps.setInt(4, llam.getL_usuario());
			ps.setString(5, llam.getL_observacion());
			ps.setString(6, llam.getL_duracion());
			ps.setInt(7, llam.getL_borrado());
			ps.setString(8, llam.getL_fecfijada());
			ps.setString(9, llam.getFechasct());
			ps.setInt(10, llam.getUsuariosct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Llamadas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Llamadas llam) {
		String q = " update llamadas set  l_fecha=?,  l_hora=?,  l_cliente=?,  l_usuario=?,  l_observacion=?,  l_duracion=?,  l_borrado=?,  l_fecfijada=?,  fechasct=?,  usuariosct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, llam.getL_fecha());
			ps.setString(2, llam.getL_hora());
			ps.setString(3, llam.getL_cliente());
			ps.setInt(4, llam.getL_usuario());
			ps.setString(5, llam.getL_observacion());
			ps.setString(6, llam.getL_duracion());
			ps.setInt(7, llam.getL_borrado());
			ps.setString(8, llam.getL_fecfijada());
			ps.setString(9, llam.getFechasct());
			ps.setInt(10, llam.getUsuariosct());
			ps.setInt(11, llam.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Llamadas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Llamadas llam) {
		String q = " delete from llamadas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, llam.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Llamadas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}