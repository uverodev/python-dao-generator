package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Limitec;
import vista.*;

public class LimitecDAO extends Thread {
	private Limitec limi;
	public ArrayList<Limitec> resultadoLimitec;

	@Override
	public void run() {
		try{
			actualizarLimitec("");
		} catch (Exception e) {
			System.out.println("Error al generar Limitec");
		}
		yield();
	}

	public void actualizarLimitec(String condicion) {
		resultadoLimitec = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  limitec " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				limi = new Limitec(
						rs.getInt("lim_codigo"),
						rs.getString("lim_fecha"),
						rs.getString("lim_hora"),
						rs.getDouble("lim_montolimite"),
						rs.getString("lim_observacion"),
						rs.getString("lim_cliente"),
						rs.getInt("lim_usuario"),
						rs.getInt("lim_borrado")
			);
			arr.add(limi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Limitec limi) {
		String q = " insert into limitec( lim_fecha,  lim_hora,  lim_montolimite,  lim_observacion,  lim_cliente,  lim_usuario,  lim_borrado) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, limi.getLim_fecha());
			ps.setString(2, limi.getLim_hora());
			ps.setDouble(3, limi.getLim_montolimite());
			ps.setString(4, limi.getLim_observacion());
			ps.setString(5, limi.getLim_cliente());
			ps.setInt(6, limi.getLim_usuario());
			ps.setInt(7, limi.getLim_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Limitec", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Limitec limi) {
		String q = " update limitec set  lim_fecha=?,  lim_hora=?,  lim_montolimite=?,  lim_observacion=?,  lim_cliente=?,  lim_usuario=?,  lim_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, limi.getLim_fecha());
			ps.setString(2, limi.getLim_hora());
			ps.setDouble(3, limi.getLim_montolimite());
			ps.setString(4, limi.getLim_observacion());
			ps.setString(5, limi.getLim_cliente());
			ps.setInt(6, limi.getLim_usuario());
			ps.setInt(7, limi.getLim_borrado());
			ps.setInt(8, limi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Limitec", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Limitec limi) {
		String q = " delete from limitec where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, limi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Limitec", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}