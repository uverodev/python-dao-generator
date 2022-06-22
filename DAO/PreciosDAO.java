package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Precios;
import vista.*;

public class PreciosDAO extends Thread {
	private Precios prec;
	public ArrayList<Precios> resultadoPrecios;

	@Override
	public void run() {
		try{
			actualizarPrecios("");
		} catch (Exception e) {
			System.out.println("Error al generar Precios");
		}
		yield();
	}

	public void actualizarPrecios(String condicion) {
		resultadoPrecios = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  precios " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prec = new Precios(
						rs.getInt("pp_codigo"),
						rs.getObject("pp_codprod"),
						rs.getDouble("pp_cantidad"),
						rs.getDouble("pp_precio"),
						rs.getInt("pp_proveedor"),
						rs.getInt("pp_borrado"),
						rs.getString("pp_fecha"),
						rs.getInt("pp_usuario")
			);
			arr.add(prec);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Precios prec) {
		String q = " insert into precios( pp_codprod,  pp_cantidad,  pp_precio,  pp_proveedor,  pp_borrado,  pp_fecha,  pp_usuario) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, prec.getPp_codprod());
			ps.setDouble(2, prec.getPp_cantidad());
			ps.setDouble(3, prec.getPp_precio());
			ps.setInt(4, prec.getPp_proveedor());
			ps.setInt(5, prec.getPp_borrado());
			ps.setString(6, prec.getPp_fecha());
			ps.setInt(7, prec.getPp_usuario());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Precios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Precios prec) {
		String q = " update precios set  pp_codprod=?,  pp_cantidad=?,  pp_precio=?,  pp_proveedor=?,  pp_borrado=?,  pp_fecha=?,  pp_usuario=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, prec.getPp_codprod());
			ps.setDouble(2, prec.getPp_cantidad());
			ps.setDouble(3, prec.getPp_precio());
			ps.setInt(4, prec.getPp_proveedor());
			ps.setInt(5, prec.getPp_borrado());
			ps.setString(6, prec.getPp_fecha());
			ps.setInt(7, prec.getPp_usuario());
			ps.setInt(8, prec.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Precios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Precios prec) {
		String q = " delete from precios where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prec.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Precios", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}