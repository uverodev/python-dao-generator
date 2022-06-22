package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Marcaciones;
import vista.*;

public class MarcacionesDAO extends Thread {
	private Marcaciones marc;
	public ArrayList<Marcaciones> resultadoMarcaciones;

	@Override
	public void run() {
		try{
			actualizarMarcaciones("");
		} catch (Exception e) {
			System.out.println("Error al generar Marcaciones");
		}
		yield();
	}

	public void actualizarMarcaciones(String condicion) {
		resultadoMarcaciones = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  marcaciones " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				marc = new Marcaciones(
						rs.getInt("mc_nro"),
						rs.getInt("mc_empleado"),
						rs.getString("mc_inghora1"),
						rs.getString("mc_salhora1"),
						rs.getInt("mc_turfinalizado"),
						rs.getString("mc_fecha"),
						rs.getObject("mc_entfoto1"),
						rs.getObject("mc_salfoto1"),
						rs.getInt("mc_borrado"),
						rs.getInt("mc_nroliquidacion"),
						rs.getInt("mc_liquidado"),
						rs.getInt("mc_feriado"),
						rs.getString("mc_horaextra"),
						rs.getString("mc_salmin"),
						rs.getString("mc_ingmin")
			);
			arr.add(marc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Marcaciones marc) {
		String q = " insert into marcaciones( mc_empleado,  mc_inghora1,  mc_salhora1,  mc_turfinalizado,  mc_fecha,  mc_entfoto1,  mc_salfoto1,  mc_borrado,  mc_nroliquidacion,  mc_liquidado,  mc_feriado,  mc_horaextra,  mc_salmin,  mc_ingmin) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, marc.getMc_empleado());
			ps.setString(2, marc.getMc_inghora1());
			ps.setString(3, marc.getMc_salhora1());
			ps.setInt(4, marc.getMc_turfinalizado());
			ps.setString(5, marc.getMc_fecha());
			ps.setObject(6, marc.getMc_entfoto1());
			ps.setObject(7, marc.getMc_salfoto1());
			ps.setInt(8, marc.getMc_borrado());
			ps.setInt(9, marc.getMc_nroliquidacion());
			ps.setInt(10, marc.getMc_liquidado());
			ps.setInt(11, marc.getMc_feriado());
			ps.setString(12, marc.getMc_horaextra());
			ps.setString(13, marc.getMc_salmin());
			ps.setString(14, marc.getMc_ingmin());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Marcaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Marcaciones marc) {
		String q = " update marcaciones set  mc_empleado=?,  mc_inghora1=?,  mc_salhora1=?,  mc_turfinalizado=?,  mc_fecha=?,  mc_entfoto1=?,  mc_salfoto1=?,  mc_borrado=?,  mc_nroliquidacion=?,  mc_liquidado=?,  mc_feriado=?,  mc_horaextra=?,  mc_salmin=?,  mc_ingmin=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, marc.getMc_empleado());
			ps.setString(2, marc.getMc_inghora1());
			ps.setString(3, marc.getMc_salhora1());
			ps.setInt(4, marc.getMc_turfinalizado());
			ps.setString(5, marc.getMc_fecha());
			ps.setObject(6, marc.getMc_entfoto1());
			ps.setObject(7, marc.getMc_salfoto1());
			ps.setInt(8, marc.getMc_borrado());
			ps.setInt(9, marc.getMc_nroliquidacion());
			ps.setInt(10, marc.getMc_liquidado());
			ps.setInt(11, marc.getMc_feriado());
			ps.setString(12, marc.getMc_horaextra());
			ps.setString(13, marc.getMc_salmin());
			ps.setString(14, marc.getMc_ingmin());
			ps.setInt(15, marc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Marcaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Marcaciones marc) {
		String q = " delete from marcaciones where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, marc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Marcaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}