package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pagofacturas;
import vista.*;

public class PagofacturasDAO extends Thread {
	private Pagofacturas pago;
	public ArrayList<Pagofacturas> resultadoPagofacturas;

	@Override
	public void run() {
		try{
			actualizarPagofacturas("");
		} catch (Exception e) {
			System.out.println("Error al generar Pagofacturas");
		}
		yield();
	}

	public void actualizarPagofacturas(String condicion) {
		resultadoPagofacturas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pagofacturas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pago = new Pagofacturas(
						rs.getInt("pf_nro"),
						rs.getString("pf_descripcion"),
						rs.getString("pf_fecha"),
						rs.getDouble("pf_monto"),
						rs.getString("pf_numfact"),
						rs.getInt("pf_borrado"),
						rs.getInt("pf_deposito")
			);
			arr.add(pago);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pagofacturas pago) {
		String q = " insert into pagofacturas( pf_descripcion,  pf_fecha,  pf_monto,  pf_numfact,  pf_borrado,  pf_deposito) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pago.getPf_descripcion());
			ps.setString(2, pago.getPf_fecha());
			ps.setDouble(3, pago.getPf_monto());
			ps.setString(4, pago.getPf_numfact());
			ps.setInt(5, pago.getPf_borrado());
			ps.setInt(6, pago.getPf_deposito());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pagofacturas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pagofacturas pago) {
		String q = " update pagofacturas set  pf_descripcion=?,  pf_fecha=?,  pf_monto=?,  pf_numfact=?,  pf_borrado=?,  pf_deposito=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pago.getPf_descripcion());
			ps.setString(2, pago.getPf_fecha());
			ps.setDouble(3, pago.getPf_monto());
			ps.setString(4, pago.getPf_numfact());
			ps.setInt(5, pago.getPf_borrado());
			ps.setInt(6, pago.getPf_deposito());
			ps.setInt(7, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pagofacturas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pagofacturas pago) {
		String q = " delete from pagofacturas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pagofacturas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}