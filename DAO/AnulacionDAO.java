package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Anulacion;
import vista.*;

public class AnulacionDAO extends Thread {
	private Anulacion anul;
	public ArrayList<Anulacion> resultadoAnulacion;

	@Override
	public void run() {
		try{
			actualizarAnulacion("");
		} catch (Exception e) {
			System.out.println("Error al generar Anulacion");
		}
		yield();
	}

	public void actualizarAnulacion(String condicion) {
		resultadoAnulacion = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  anulacion " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				anul = new Anulacion(
						rs.getInt("an_nro"),
						rs.getString("an_motivo"),
						rs.getInt("an_operacion"),
						rs.getInt("an_numoperacio"),
						rs.getInt("an_usuario"),
						rs.getString("an_fecha"),
						rs.getString("an_hora"),
						rs.getInt("an_borrado"),
						rs.getObject("an_pc")
			);
			arr.add(anul);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Anulacion anul) {
		String q = " insert into anulacion( an_motivo,  an_operacion,  an_numoperacio,  an_usuario,  an_fecha,  an_hora,  an_borrado,  an_pc) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, anul.getAn_motivo());
			ps.setInt(2, anul.getAn_operacion());
			ps.setInt(3, anul.getAn_numoperacio());
			ps.setInt(4, anul.getAn_usuario());
			ps.setString(5, anul.getAn_fecha());
			ps.setString(6, anul.getAn_hora());
			ps.setInt(7, anul.getAn_borrado());
			ps.setObject(8, anul.getAn_pc());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Anulacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Anulacion anul) {
		String q = " update anulacion set  an_motivo=?,  an_operacion=?,  an_numoperacio=?,  an_usuario=?,  an_fecha=?,  an_hora=?,  an_borrado=?,  an_pc=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, anul.getAn_motivo());
			ps.setInt(2, anul.getAn_operacion());
			ps.setInt(3, anul.getAn_numoperacio());
			ps.setInt(4, anul.getAn_usuario());
			ps.setString(5, anul.getAn_fecha());
			ps.setString(6, anul.getAn_hora());
			ps.setInt(7, anul.getAn_borrado());
			ps.setObject(8, anul.getAn_pc());
			ps.setInt(9, anul.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Anulacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Anulacion anul) {
		String q = " delete from anulacion where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, anul.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Anulacion", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}