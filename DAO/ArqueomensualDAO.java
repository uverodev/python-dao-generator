package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Arqueomensual;
import vista.*;

public class ArqueomensualDAO extends Thread {
	private Arqueomensual arqu;
	public ArrayList<Arqueomensual> resultadoArqueomensual;

	@Override
	public void run() {
		try{
			actualizarArqueomensual("");
		} catch (Exception e) {
			System.out.println("Error al generar Arqueomensual");
		}
		yield();
	}

	public void actualizarArqueomensual(String condicion) {
		resultadoArqueomensual = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  arqueomensual " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				arqu = new Arqueomensual(
						rs.getInt("am_codigo"),
						rs.getInt("am_usuario"),
						rs.getString("am_fecha"),
						rs.getString("am_hora"),
						rs.getDouble("am_totalcomprainterna"),
						rs.getDouble("am_totalcompraconsumicion"),
						rs.getDouble("am_totalsueldoadelanto"),
						rs.getDouble("am_totaldeposito"),
						rs.getDouble("am_totalgasto"),
						rs.getDouble("am_total"),
						rs.getString("am_mes"),
						rs.getInt("am_borrado"),
						rs.getString("am_pc"),
						rs.getString("am_data")
			);
			arr.add(arqu);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Arqueomensual arqu) {
		String q = " insert into arqueomensual( am_usuario,  am_fecha,  am_hora,  am_totalcomprainterna,  am_totalcompraconsumicion,  am_totalsueldoadelanto,  am_totaldeposito,  am_totalgasto,  am_total,  am_mes,  am_borrado,  am_pc,  am_data) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqu.getAm_usuario());
			ps.setString(2, arqu.getAm_fecha());
			ps.setString(3, arqu.getAm_hora());
			ps.setDouble(4, arqu.getAm_totalcomprainterna());
			ps.setDouble(5, arqu.getAm_totalcompraconsumicion());
			ps.setDouble(6, arqu.getAm_totalsueldoadelanto());
			ps.setDouble(7, arqu.getAm_totaldeposito());
			ps.setDouble(8, arqu.getAm_totalgasto());
			ps.setDouble(9, arqu.getAm_total());
			ps.setString(10, arqu.getAm_mes());
			ps.setInt(11, arqu.getAm_borrado());
			ps.setString(12, arqu.getAm_pc());
			ps.setString(13, arqu.getAm_data());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Arqueomensual", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Arqueomensual arqu) {
		String q = " update arqueomensual set  am_usuario=?,  am_fecha=?,  am_hora=?,  am_totalcomprainterna=?,  am_totalcompraconsumicion=?,  am_totalsueldoadelanto=?,  am_totaldeposito=?,  am_totalgasto=?,  am_total=?,  am_mes=?,  am_borrado=?,  am_pc=?,  am_data=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqu.getAm_usuario());
			ps.setString(2, arqu.getAm_fecha());
			ps.setString(3, arqu.getAm_hora());
			ps.setDouble(4, arqu.getAm_totalcomprainterna());
			ps.setDouble(5, arqu.getAm_totalcompraconsumicion());
			ps.setDouble(6, arqu.getAm_totalsueldoadelanto());
			ps.setDouble(7, arqu.getAm_totaldeposito());
			ps.setDouble(8, arqu.getAm_totalgasto());
			ps.setDouble(9, arqu.getAm_total());
			ps.setString(10, arqu.getAm_mes());
			ps.setInt(11, arqu.getAm_borrado());
			ps.setString(12, arqu.getAm_pc());
			ps.setString(13, arqu.getAm_data());
			ps.setInt(14, arqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Arqueomensual", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Arqueomensual arqu) {
		String q = " delete from arqueomensual where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Arqueomensual", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}