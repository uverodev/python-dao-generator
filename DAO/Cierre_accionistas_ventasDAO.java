package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cierre_accionistas_ventas;
import vista.*;

public class Cierre_accionistas_ventasDAO extends Thread {
	private Cierre_accionistas_ventas cier;
	public ArrayList<Cierre_accionistas_ventas> resultadoCierre_accionistas_ventas;

	@Override
	public void run() {
		try{
			actualizarCierre_accionistas_ventas("");
		} catch (Exception e) {
			System.out.println("Error al generar Cierre_accionistas_ventas");
		}
		yield();
	}

	public void actualizarCierre_accionistas_ventas(String condicion) {
		resultadoCierre_accionistas_ventas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cierre_accionistas_ventas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cier = new Cierre_accionistas_ventas(
						rs.getInt("cav_id"),
						rs.getInt("cav_nro_venta"),
						rs.getInt("cav_cierre_asociado"),
						rs.getDouble("cav_total_venta"),
						rs.getDouble("cav_total_compra"),
						rs.getDouble("cav_ganancia"),
						rs.getInt("cav_borrado")
			);
			arr.add(cier);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cierre_accionistas_ventas cier) {
		String q = " insert into cierre_accionistas_ventas( cav_nro_venta,  cav_cierre_asociado,  cav_total_venta,  cav_total_compra,  cav_ganancia,  cav_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCav_nro_venta());
			ps.setInt(2, cier.getCav_cierre_asociado());
			ps.setDouble(3, cier.getCav_total_venta());
			ps.setDouble(4, cier.getCav_total_compra());
			ps.setDouble(5, cier.getCav_ganancia());
			ps.setInt(6, cier.getCav_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cierre_accionistas_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cierre_accionistas_ventas cier) {
		String q = " update cierre_accionistas_ventas set  cav_nro_venta=?,  cav_cierre_asociado=?,  cav_total_venta=?,  cav_total_compra=?,  cav_ganancia=?,  cav_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCav_nro_venta());
			ps.setInt(2, cier.getCav_cierre_asociado());
			ps.setDouble(3, cier.getCav_total_venta());
			ps.setDouble(4, cier.getCav_total_compra());
			ps.setDouble(5, cier.getCav_ganancia());
			ps.setInt(6, cier.getCav_borrado());
			ps.setInt(7, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cierre_accionistas_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cierre_accionistas_ventas cier) {
		String q = " delete from cierre_accionistas_ventas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cierre_accionistas_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}