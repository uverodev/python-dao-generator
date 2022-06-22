package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Bonificacion_cab;
import vista.*;

public class Bonificacion_cabDAO extends Thread {
	private Bonificacion_cab boni;
	public ArrayList<Bonificacion_cab> resultadoBonificacion_cab;

	@Override
	public void run() {
		try{
			actualizarBonificacion_cab("");
		} catch (Exception e) {
			System.out.println("Error al generar Bonificacion_cab");
		}
		yield();
	}

	public void actualizarBonificacion_cab(String condicion) {
		resultadoBonificacion_cab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  bonificacion_cab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				boni = new Bonificacion_cab(
						rs.getInt("bn_codigo"),
						rs.getInt("bn_numcompra"),
						rs.getInt("bn_proveedor"),
						rs.getDouble("bn_totitens"),
						rs.getInt("bn_usuario"),
						rs.getInt("bn_borrado"),
						rs.getObject("bn_fehcha")
			);
			arr.add(boni);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Bonificacion_cab boni) {
		String q = " insert into bonificacion_cab( bn_numcompra,  bn_proveedor,  bn_totitens,  bn_usuario,  bn_borrado,  bn_fehcha) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getBn_numcompra());
			ps.setInt(2, boni.getBn_proveedor());
			ps.setDouble(3, boni.getBn_totitens());
			ps.setInt(4, boni.getBn_usuario());
			ps.setInt(5, boni.getBn_borrado());
			ps.setObject(6, boni.getBn_fehcha());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Bonificacion_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Bonificacion_cab boni) {
		String q = " update bonificacion_cab set  bn_numcompra=?,  bn_proveedor=?,  bn_totitens=?,  bn_usuario=?,  bn_borrado=?,  bn_fehcha=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getBn_numcompra());
			ps.setInt(2, boni.getBn_proveedor());
			ps.setDouble(3, boni.getBn_totitens());
			ps.setInt(4, boni.getBn_usuario());
			ps.setInt(5, boni.getBn_borrado());
			ps.setObject(6, boni.getBn_fehcha());
			ps.setInt(7, boni.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Bonificacion_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Bonificacion_cab boni) {
		String q = " delete from bonificacion_cab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, boni.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Bonificacion_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}