package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cabecerafacturacionlibre;
import vista.*;

public class CabecerafacturacionlibreDAO extends Thread {
	private Cabecerafacturacionlibre cabe;
	public ArrayList<Cabecerafacturacionlibre> resultadoCabecerafacturacionlibre;

	@Override
	public void run() {
		try{
			actualizarCabecerafacturacionlibre("");
		} catch (Exception e) {
			System.out.println("Error al generar Cabecerafacturacionlibre");
		}
		yield();
	}

	public void actualizarCabecerafacturacionlibre(String condicion) {
		resultadoCabecerafacturacionlibre = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cabecerafacturacionlibre " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cabe = new Cabecerafacturacionlibre(
						rs.getInt("fl_codigo"),
						rs.getString("fl_fecha"),
						rs.getObject("fl_cliente"),
						rs.getDouble("fl_total"),
						rs.getDouble("fl_redondeo"),
						rs.getInt("fl_borrado"),
						rs.getInt("fl_usuario"),
						rs.getObject("fl_pc"),
						rs.getInt("fl_tipo"),
						rs.getDouble("fl_totalexenta"),
						rs.getDouble("fl_total5"),
						rs.getDouble("fl_total10"),
						rs.getInt("fl_tipodoc"),
						rs.getString("fl_fecha_factura")
			);
			arr.add(cabe);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cabecerafacturacionlibre cabe) {
		String q = " insert into cabecerafacturacionlibre( fl_fecha,  fl_cliente,  fl_total,  fl_redondeo,  fl_borrado,  fl_usuario,  fl_pc,  fl_tipo,  fl_totalexenta,  fl_total5,  fl_total10,  fl_tipodoc,  fl_fecha_factura) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cabe.getFl_fecha());
			ps.setObject(2, cabe.getFl_cliente());
			ps.setDouble(3, cabe.getFl_total());
			ps.setDouble(4, cabe.getFl_redondeo());
			ps.setInt(5, cabe.getFl_borrado());
			ps.setInt(6, cabe.getFl_usuario());
			ps.setObject(7, cabe.getFl_pc());
			ps.setInt(8, cabe.getFl_tipo());
			ps.setDouble(9, cabe.getFl_totalexenta());
			ps.setDouble(10, cabe.getFl_total5());
			ps.setDouble(11, cabe.getFl_total10());
			ps.setInt(12, cabe.getFl_tipodoc());
			ps.setString(13, cabe.getFl_fecha_factura());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cabecerafacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cabecerafacturacionlibre cabe) {
		String q = " update cabecerafacturacionlibre set  fl_fecha=?,  fl_cliente=?,  fl_total=?,  fl_redondeo=?,  fl_borrado=?,  fl_usuario=?,  fl_pc=?,  fl_tipo=?,  fl_totalexenta=?,  fl_total5=?,  fl_total10=?,  fl_tipodoc=?,  fl_fecha_factura=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cabe.getFl_fecha());
			ps.setObject(2, cabe.getFl_cliente());
			ps.setDouble(3, cabe.getFl_total());
			ps.setDouble(4, cabe.getFl_redondeo());
			ps.setInt(5, cabe.getFl_borrado());
			ps.setInt(6, cabe.getFl_usuario());
			ps.setObject(7, cabe.getFl_pc());
			ps.setInt(8, cabe.getFl_tipo());
			ps.setDouble(9, cabe.getFl_totalexenta());
			ps.setDouble(10, cabe.getFl_total5());
			ps.setDouble(11, cabe.getFl_total10());
			ps.setInt(12, cabe.getFl_tipodoc());
			ps.setString(13, cabe.getFl_fecha_factura());
			ps.setInt(14, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cabecerafacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cabecerafacturacionlibre cabe) {
		String q = " delete from cabecerafacturacionlibre where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cabecerafacturacionlibre", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}