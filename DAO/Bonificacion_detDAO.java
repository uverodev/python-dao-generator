package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Bonificacion_det;
import vista.*;

public class Bonificacion_detDAO extends Thread {
	private Bonificacion_det boni;
	public ArrayList<Bonificacion_det> resultadoBonificacion_det;

	@Override
	public void run() {
		try{
			actualizarBonificacion_det("");
		} catch (Exception e) {
			System.out.println("Error al generar Bonificacion_det");
		}
		yield();
	}

	public void actualizarBonificacion_det(String condicion) {
		resultadoBonificacion_det = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  bonificacion_det " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				boni = new Bonificacion_det(
						rs.getInt("bd_codigo"),
						rs.getInt("bd_codcab"),
						rs.getString("bd_codprod"),
						rs.getDouble("bd_cantidad"),
						rs.getInt("bd_borrado"),
						rs.getObject("bd_lote")
			);
			arr.add(boni);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Bonificacion_det boni) {
		String q = " insert into bonificacion_det( bd_codcab,  bd_codprod,  bd_cantidad,  bd_borrado,  bd_lote) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getBd_codcab());
			ps.setString(2, boni.getBd_codprod());
			ps.setDouble(3, boni.getBd_cantidad());
			ps.setInt(4, boni.getBd_borrado());
			ps.setObject(5, boni.getBd_lote());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Bonificacion_det", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Bonificacion_det boni) {
		String q = " update bonificacion_det set  bd_codcab=?,  bd_codprod=?,  bd_cantidad=?,  bd_borrado=?,  bd_lote=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getBd_codcab());
			ps.setString(2, boni.getBd_codprod());
			ps.setDouble(3, boni.getBd_cantidad());
			ps.setInt(4, boni.getBd_borrado());
			ps.setObject(5, boni.getBd_lote());
			ps.setInt(6, boni.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Bonificacion_det", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Bonificacion_det boni) {
		String q = " delete from bonificacion_det where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Bonificacion_det", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}