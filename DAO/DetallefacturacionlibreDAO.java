package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detallefacturacionlibre;
import vista.*;

public class DetallefacturacionlibreDAO extends Thread {
	private Detallefacturacionlibre deta;
	public ArrayList<Detallefacturacionlibre> resultadoDetallefacturacionlibre;

	@Override
	public void run() {
		try{
			actualizarDetallefacturacionlibre("");
		} catch (Exception e) {
			System.out.println("Error al generar Detallefacturacionlibre");
		}
		yield();
	}

	public void actualizarDetallefacturacionlibre(String condicion) {
		resultadoDetallefacturacionlibre = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detallefacturacionlibre " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detallefacturacionlibre(
						rs.getInt("df_codigo"),
						rs.getObject("df_codprod"),
						rs.getDouble("df_cantidad"),
						rs.getDouble("df_precio"),
						rs.getInt("df_borrado"),
						rs.getInt("df_codigocabecera"),
						rs.getDouble("df_totalexenta"),
						rs.getDouble("df_total5"),
						rs.getDouble("df_total10"),
						rs.getObject("df_detalle")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detallefacturacionlibre deta) {
		String q = " insert into detallefacturacionlibre( df_codprod,  df_cantidad,  df_precio,  df_borrado,  df_codigocabecera,  df_totalexenta,  df_total5,  df_total10,  df_detalle) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDf_codprod());
			ps.setDouble(2, deta.getDf_cantidad());
			ps.setDouble(3, deta.getDf_precio());
			ps.setInt(4, deta.getDf_borrado());
			ps.setInt(5, deta.getDf_codigocabecera());
			ps.setDouble(6, deta.getDf_totalexenta());
			ps.setDouble(7, deta.getDf_total5());
			ps.setDouble(8, deta.getDf_total10());
			ps.setObject(9, deta.getDf_detalle());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detallefacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detallefacturacionlibre deta) {
		String q = " update detallefacturacionlibre set  df_codprod=?,  df_cantidad=?,  df_precio=?,  df_borrado=?,  df_codigocabecera=?,  df_totalexenta=?,  df_total5=?,  df_total10=?,  df_detalle=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDf_codprod());
			ps.setDouble(2, deta.getDf_cantidad());
			ps.setDouble(3, deta.getDf_precio());
			ps.setInt(4, deta.getDf_borrado());
			ps.setInt(5, deta.getDf_codigocabecera());
			ps.setDouble(6, deta.getDf_totalexenta());
			ps.setDouble(7, deta.getDf_total5());
			ps.setDouble(8, deta.getDf_total10());
			ps.setObject(9, deta.getDf_detalle());
			ps.setInt(10, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detallefacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detallefacturacionlibre deta) {
		String q = " delete from detallefacturacionlibre where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detallefacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}