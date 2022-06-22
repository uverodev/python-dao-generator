package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cierre_accionistas;
import vista.*;

public class Cierre_accionistasDAO extends Thread {
	private Cierre_accionistas cier;
	public ArrayList<Cierre_accionistas> resultadoCierre_accionistas;

	@Override
	public void run() {
		try{
			actualizarCierre_accionistas("");
		} catch (Exception e) {
			System.out.println("Error al generar Cierre_accionistas");
		}
		yield();
	}

	public void actualizarCierre_accionistas(String condicion) {
		resultadoCierre_accionistas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cierre_accionistas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cier = new Cierre_accionistas(
						rs.getInt("ca_id"),
						rs.getString("ca_fecha"),
						rs.getString("ca_hora"),
						rs.getString("ca_fechasct"),
						rs.getInt("ca_usuario"),
						rs.getInt("ca_borrado"),
						rs.getString("ca_maquina"),
						rs.getString("ca_fecha_desde"),
						rs.getString("ca_fecha_hasta"),
						rs.getString("ca_hora_desde"),
						rs.getString("ca_hora_hasta")
			);
			arr.add(cier);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cierre_accionistas cier) {
		String q = " insert into cierre_accionistas( ca_fecha,  ca_hora,  ca_fechasct,  ca_usuario,  ca_borrado,  ca_maquina,  ca_fecha_desde,  ca_fecha_hasta,  ca_hora_desde,  ca_hora_hasta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cier.getCa_fecha());
			ps.setString(2, cier.getCa_hora());
			ps.setString(3, cier.getCa_fechasct());
			ps.setInt(4, cier.getCa_usuario());
			ps.setInt(5, cier.getCa_borrado());
			ps.setString(6, cier.getCa_maquina());
			ps.setString(7, cier.getCa_fecha_desde());
			ps.setString(8, cier.getCa_fecha_hasta());
			ps.setString(9, cier.getCa_hora_desde());
			ps.setString(10, cier.getCa_hora_hasta());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cierre_accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cierre_accionistas cier) {
		String q = " update cierre_accionistas set  ca_fecha=?,  ca_hora=?,  ca_fechasct=?,  ca_usuario=?,  ca_borrado=?,  ca_maquina=?,  ca_fecha_desde=?,  ca_fecha_hasta=?,  ca_hora_desde=?,  ca_hora_hasta=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cier.getCa_fecha());
			ps.setString(2, cier.getCa_hora());
			ps.setString(3, cier.getCa_fechasct());
			ps.setInt(4, cier.getCa_usuario());
			ps.setInt(5, cier.getCa_borrado());
			ps.setString(6, cier.getCa_maquina());
			ps.setString(7, cier.getCa_fecha_desde());
			ps.setString(8, cier.getCa_fecha_hasta());
			ps.setString(9, cier.getCa_hora_desde());
			ps.setString(10, cier.getCa_hora_hasta());
			ps.setInt(11, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cierre_accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cierre_accionistas cier) {
		String q = " delete from cierre_accionistas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cierre_accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}