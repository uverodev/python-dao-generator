package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Arqueos;
import vista.*;

public class ArqueosDAO extends Thread {
	private Arqueos arqu;
	public ArrayList<Arqueos> resultadoArqueos;

	@Override
	public void run() {
		try{
			actualizarArqueos("");
		} catch (Exception e) {
			System.out.println("Error al generar Arqueos");
		}
		yield();
	}

	public void actualizarArqueos(String condicion) {
		resultadoArqueos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  arqueos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				arqu = new Arqueos(
						rs.getInt("id"),
						rs.getString("fechaapertura"),
						rs.getDouble("aperturatotal"),
						rs.getString("horaapertura"),
						rs.getString("fechacierre"),
						rs.getDouble("cierretotal"),
						rs.getString("horacierre"),
						rs.getDouble("redondeo"),
						rs.getInt("idUsuarios")
			);
			arr.add(arqu);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Arqueos arqu) {
		String q = " insert into arqueos( fechaapertura,  aperturatotal,  horaapertura,  fechacierre,  cierretotal,  horacierre,  redondeo,  idUsuarios) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, arqu.getFechaapertura());
			ps.setDouble(2, arqu.getAperturatotal());
			ps.setString(3, arqu.getHoraapertura());
			ps.setString(4, arqu.getFechacierre());
			ps.setDouble(5, arqu.getCierretotal());
			ps.setString(6, arqu.getHoracierre());
			ps.setDouble(7, arqu.getRedondeo());
			ps.setInt(8, arqu.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Arqueos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Arqueos arqu) {
		String q = " update arqueos set  fechaapertura=?,  aperturatotal=?,  horaapertura=?,  fechacierre=?,  cierretotal=?,  horacierre=?,  redondeo=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, arqu.getFechaapertura());
			ps.setDouble(2, arqu.getAperturatotal());
			ps.setString(3, arqu.getHoraapertura());
			ps.setString(4, arqu.getFechacierre());
			ps.setDouble(5, arqu.getCierretotal());
			ps.setString(6, arqu.getHoracierre());
			ps.setDouble(7, arqu.getRedondeo());
			ps.setInt(8, arqu.getIdusuarios());
			ps.setInt(9, arqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Arqueos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Arqueos arqu) {
		String q = " delete from arqueos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Arqueos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}