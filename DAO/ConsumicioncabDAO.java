package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Consumicioncab;
import vista.*;

public class ConsumicioncabDAO extends Thread {
	private Consumicioncab cons;
	public ArrayList<Consumicioncab> resultadoConsumicioncab;

	@Override
	public void run() {
		try{
			actualizarConsumicioncab("");
		} catch (Exception e) {
			System.out.println("Error al generar Consumicioncab");
		}
		yield();
	}

	public void actualizarConsumicioncab(String condicion) {
		resultadoConsumicioncab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  consumicioncab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cons = new Consumicioncab(
						rs.getInt("consc_codigo"),
						rs.getString("consc_fecha"),
						rs.getString("consc_hora"),
						rs.getInt("consc_habitacion"),
						rs.getInt("consc_estado"),
						rs.getDouble("consc_total"),
						rs.getInt("consc_recepcion"),
						rs.getInt("consc_usuario"),
						rs.getInt("consc_borrado"),
						rs.getInt("consc_arqueo"),
						rs.getInt("consc_nroarqueo")
			);
			arr.add(cons);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Consumicioncab cons) {
		String q = " insert into consumicioncab( consc_fecha,  consc_hora,  consc_habitacion,  consc_estado,  consc_total,  consc_recepcion,  consc_usuario,  consc_borrado,  consc_arqueo,  consc_nroarqueo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cons.getConsc_fecha());
			ps.setString(2, cons.getConsc_hora());
			ps.setInt(3, cons.getConsc_habitacion());
			ps.setInt(4, cons.getConsc_estado());
			ps.setDouble(5, cons.getConsc_total());
			ps.setInt(6, cons.getConsc_recepcion());
			ps.setInt(7, cons.getConsc_usuario());
			ps.setInt(8, cons.getConsc_borrado());
			ps.setInt(9, cons.getConsc_arqueo());
			ps.setInt(10, cons.getConsc_nroarqueo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Consumicioncab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Consumicioncab cons) {
		String q = " update consumicioncab set  consc_fecha=?,  consc_hora=?,  consc_habitacion=?,  consc_estado=?,  consc_total=?,  consc_recepcion=?,  consc_usuario=?,  consc_borrado=?,  consc_arqueo=?,  consc_nroarqueo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cons.getConsc_fecha());
			ps.setString(2, cons.getConsc_hora());
			ps.setInt(3, cons.getConsc_habitacion());
			ps.setInt(4, cons.getConsc_estado());
			ps.setDouble(5, cons.getConsc_total());
			ps.setInt(6, cons.getConsc_recepcion());
			ps.setInt(7, cons.getConsc_usuario());
			ps.setInt(8, cons.getConsc_borrado());
			ps.setInt(9, cons.getConsc_arqueo());
			ps.setInt(10, cons.getConsc_nroarqueo());
			ps.setInt(11, cons.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Consumicioncab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Consumicioncab cons) {
		String q = " delete from consumicioncab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cons.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Consumicioncab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}