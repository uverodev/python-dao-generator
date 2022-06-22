package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Nota_cab;
import vista.*;

public class Nota_cabDAO extends Thread {
	private Nota_cab nota;
	public ArrayList<Nota_cab> resultadoNota_cab;

	@Override
	public void run() {
		try{
			actualizarNota_cab("");
		} catch (Exception e) {
			System.out.println("Error al generar Nota_cab");
		}
		yield();
	}

	public void actualizarNota_cab(String condicion) {
		resultadoNota_cab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  nota_cab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				nota = new Nota_cab(
						rs.getInt("n_nro"),
						rs.getString("n_fecha"),
						rs.getString("n_hora"),
						rs.getDouble("n_montodnota"),
						rs.getDouble("n_montototalventa"),
						rs.getDouble("n_montoventarestante"),
						rs.getInt("n_numventa"),
						rs.getInt("n_usuario"),
						rs.getInt("n_borrado"),
						rs.getInt("n_cierre"),
						rs.getInt("n_nrocierre"),
						rs.getInt("n_cierrecajagennro")
			);
			arr.add(nota);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Nota_cab nota) {
		String q = " insert into nota_cab( n_fecha,  n_hora,  n_montodnota,  n_montototalventa,  n_montoventarestante,  n_numventa,  n_usuario,  n_borrado,  n_cierre,  n_nrocierre,  n_cierrecajagennro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, nota.getN_fecha());
			ps.setString(2, nota.getN_hora());
			ps.setDouble(3, nota.getN_montodnota());
			ps.setDouble(4, nota.getN_montototalventa());
			ps.setDouble(5, nota.getN_montoventarestante());
			ps.setInt(6, nota.getN_numventa());
			ps.setInt(7, nota.getN_usuario());
			ps.setInt(8, nota.getN_borrado());
			ps.setInt(9, nota.getN_cierre());
			ps.setInt(10, nota.getN_nrocierre());
			ps.setInt(11, nota.getN_cierrecajagennro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Nota_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Nota_cab nota) {
		String q = " update nota_cab set  n_fecha=?,  n_hora=?,  n_montodnota=?,  n_montototalventa=?,  n_montoventarestante=?,  n_numventa=?,  n_usuario=?,  n_borrado=?,  n_cierre=?,  n_nrocierre=?,  n_cierrecajagennro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, nota.getN_fecha());
			ps.setString(2, nota.getN_hora());
			ps.setDouble(3, nota.getN_montodnota());
			ps.setDouble(4, nota.getN_montototalventa());
			ps.setDouble(5, nota.getN_montoventarestante());
			ps.setInt(6, nota.getN_numventa());
			ps.setInt(7, nota.getN_usuario());
			ps.setInt(8, nota.getN_borrado());
			ps.setInt(9, nota.getN_cierre());
			ps.setInt(10, nota.getN_nrocierre());
			ps.setInt(11, nota.getN_cierrecajagennro());
			ps.setInt(12, nota.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Nota_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Nota_cab nota) {
		String q = " delete from nota_cab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, nota.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Nota_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}