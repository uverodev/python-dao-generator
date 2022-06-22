package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detcajchica;
import vista.*;

public class DetcajchicaDAO extends Thread {
	private Detcajchica detc;
	public ArrayList<Detcajchica> resultadoDetcajchica;

	@Override
	public void run() {
		try{
			actualizarDetcajchica("");
		} catch (Exception e) {
			System.out.println("Error al generar Detcajchica");
		}
		yield();
	}

	public void actualizarDetcajchica(String condicion) {
		resultadoDetcajchica = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detcajchica " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				detc = new Detcajchica(
						rs.getInt("dcaj_nro"),
						rs.getInt("dcaj_moneda"),
						rs.getDouble("dcaj_billete"),
						rs.getDouble("dcaj_cantidad"),
						rs.getDouble("dcaj_monto"),
						rs.getInt("dcaj_borrado")
			);
			arr.add(detc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detcajchica detc) {
		String q = " insert into detcajchica( dcaj_moneda,  dcaj_billete,  dcaj_cantidad,  dcaj_monto,  dcaj_borrado) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, detc.getDcaj_moneda());
			ps.setDouble(2, detc.getDcaj_billete());
			ps.setDouble(3, detc.getDcaj_cantidad());
			ps.setDouble(4, detc.getDcaj_monto());
			ps.setInt(5, detc.getDcaj_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detcajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detcajchica detc) {
		String q = " update detcajchica set  dcaj_moneda=?,  dcaj_billete=?,  dcaj_cantidad=?,  dcaj_monto=?,  dcaj_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, detc.getDcaj_moneda());
			ps.setDouble(2, detc.getDcaj_billete());
			ps.setDouble(3, detc.getDcaj_cantidad());
			ps.setDouble(4, detc.getDcaj_monto());
			ps.setInt(5, detc.getDcaj_borrado());
			ps.setInt(6, detc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detcajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detcajchica detc) {
		String q = " delete from detcajchica where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, detc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detcajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}