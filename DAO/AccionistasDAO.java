package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Accionistas;
import vista.*;

public class AccionistasDAO extends Thread {
	private Accionistas acci;
	public ArrayList<Accionistas> resultadoAccionistas;

	@Override
	public void run() {
		try{
			actualizarAccionistas("");
		} catch (Exception e) {
			System.out.println("Error al generar Accionistas");
		}
		yield();
	}

	public void actualizarAccionistas(String condicion) {
		resultadoAccionistas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  accionistas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				acci = new Accionistas(
						rs.getInt("acc_id"),
						rs.getString("acc_descripcion"),
						rs.getString("acc_documento"),
						rs.getDouble("acc_participacion"),
						rs.getInt("acc_borrado")
			);
			arr.add(acci);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Accionistas acci) {
		String q = " insert into accionistas( acc_descripcion,  acc_documento,  acc_participacion,  acc_borrado) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, acci.getAcc_descripcion());
			ps.setString(2, acci.getAcc_documento());
			ps.setDouble(3, acci.getAcc_participacion());
			ps.setInt(4, acci.getAcc_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Accionistas acci) {
		String q = " update accionistas set  acc_descripcion=?,  acc_documento=?,  acc_participacion=?,  acc_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, acci.getAcc_descripcion());
			ps.setString(2, acci.getAcc_documento());
			ps.setDouble(3, acci.getAcc_participacion());
			ps.setInt(4, acci.getAcc_borrado());
			ps.setInt(5, acci.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Accionistas acci) {
		String q = " delete from accionistas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, acci.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Accionistas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}