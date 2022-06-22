package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pagcompracontadocaja;
import vista.*;

public class PagcompracontadocajaDAO extends Thread {
	private Pagcompracontadocaja pagc;
	public ArrayList<Pagcompracontadocaja> resultadoPagcompracontadocaja;

	@Override
	public void run() {
		try{
			actualizarPagcompracontadocaja("");
		} catch (Exception e) {
			System.out.println("Error al generar Pagcompracontadocaja");
		}
		yield();
	}

	public void actualizarPagcompracontadocaja(String condicion) {
		resultadoPagcompracontadocaja = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pagcompracontadocaja " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pagc = new Pagcompracontadocaja(
						rs.getInt("pcc_codigo"),
						rs.getInt("pcc_proveedor"),
						rs.getDouble("pcc_total"),
						rs.getInt("pcc_usuario"),
						rs.getString("pcc_fecha"),
						rs.getObject("pcc_pc"),
						rs.getInt("pcc_borrado")
			);
			arr.add(pagc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pagcompracontadocaja pagc) {
		String q = " insert into pagcompracontadocaja( pcc_proveedor,  pcc_total,  pcc_usuario,  pcc_fecha,  pcc_pc,  pcc_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pagc.getPcc_proveedor());
			ps.setDouble(2, pagc.getPcc_total());
			ps.setInt(3, pagc.getPcc_usuario());
			ps.setString(4, pagc.getPcc_fecha());
			ps.setObject(5, pagc.getPcc_pc());
			ps.setInt(6, pagc.getPcc_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pagcompracontadocaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pagcompracontadocaja pagc) {
		String q = " update pagcompracontadocaja set  pcc_proveedor=?,  pcc_total=?,  pcc_usuario=?,  pcc_fecha=?,  pcc_pc=?,  pcc_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pagc.getPcc_proveedor());
			ps.setDouble(2, pagc.getPcc_total());
			ps.setInt(3, pagc.getPcc_usuario());
			ps.setString(4, pagc.getPcc_fecha());
			ps.setObject(5, pagc.getPcc_pc());
			ps.setInt(6, pagc.getPcc_borrado());
			ps.setInt(7, pagc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pagcompracontadocaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pagcompracontadocaja pagc) {
		String q = " delete from pagcompracontadocaja where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pagc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pagcompracontadocaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}