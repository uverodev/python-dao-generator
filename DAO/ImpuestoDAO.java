package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Impuesto;
import vista.*;

public class ImpuestoDAO extends Thread {
	private Impuesto impu;
	public ArrayList<Impuesto> resultadoImpuesto;

	@Override
	public void run() {
		try{
			actualizarImpuesto("");
		} catch (Exception e) {
			System.out.println("Error al generar Impuesto");
		}
		yield();
	}

	public void actualizarImpuesto(String condicion) {
		resultadoImpuesto = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  impuesto " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				impu = new Impuesto(
						rs.getInt("imp_id"),
						rs.getString("imp_descripcion"),
						rs.getDouble("imp_exenta"),
						rs.getDouble("imp_iva_5"),
						rs.getDouble("imp_iva_10"),
						rs.getInt("imp_orden"),
						rs.getInt("imp_borrado")
			);
			arr.add(impu);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Impuesto impu) {
		String q = " insert into impuesto( imp_descripcion,  imp_exenta,  imp_iva_5,  imp_iva_10,  imp_orden,  imp_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, impu.getImp_descripcion());
			ps.setDouble(2, impu.getImp_exenta());
			ps.setDouble(3, impu.getImp_iva_5());
			ps.setDouble(4, impu.getImp_iva_10());
			ps.setInt(5, impu.getImp_orden());
			ps.setInt(6, impu.getImp_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Impuesto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Impuesto impu) {
		String q = " update impuesto set  imp_descripcion=?,  imp_exenta=?,  imp_iva_5=?,  imp_iva_10=?,  imp_orden=?,  imp_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, impu.getImp_descripcion());
			ps.setDouble(2, impu.getImp_exenta());
			ps.setDouble(3, impu.getImp_iva_5());
			ps.setDouble(4, impu.getImp_iva_10());
			ps.setInt(5, impu.getImp_orden());
			ps.setInt(6, impu.getImp_borrado());
			ps.setInt(7, impu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Impuesto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Impuesto impu) {
		String q = " delete from impuesto where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, impu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Impuesto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}