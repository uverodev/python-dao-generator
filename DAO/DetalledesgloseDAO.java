package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalledesglose;
import vista.*;

public class DetalledesgloseDAO extends Thread {
	private Detalledesglose deta;
	public ArrayList<Detalledesglose> resultadoDetalledesglose;

	@Override
	public void run() {
		try{
			actualizarDetalledesglose("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalledesglose");
		}
		yield();
	}

	public void actualizarDetalledesglose(String condicion) {
		resultadoDetalledesglose = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalledesglose " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalledesglose(
						rs.getInt("dg_codigo"),
						rs.getInt("dg_codigocabecera"),
						rs.getObject("dg_codprod"),
						rs.getDouble("dg_cantidaddesglosada"),
						rs.getInt("dg_borrado"),
						rs.getString("dg_fecha"),
						rs.getObject("dg_lote"),
						rs.getDouble("dg_preciocompra"),
						rs.getDouble("dg_preciobase"),
						rs.getDouble("dg_preciominimo"),
						rs.getDouble("dg_preciomayor"),
						rs.getDouble("dg_preciocredito")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalledesglose deta) {
		String q = " insert into detalledesglose( dg_codigocabecera,  dg_codprod,  dg_cantidaddesglosada,  dg_borrado,  dg_fecha,  dg_lote,  dg_preciocompra,  dg_preciobase,  dg_preciominimo,  dg_preciomayor,  dg_preciocredito) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDg_codigocabecera());
			ps.setObject(2, deta.getDg_codprod());
			ps.setDouble(3, deta.getDg_cantidaddesglosada());
			ps.setInt(4, deta.getDg_borrado());
			ps.setString(5, deta.getDg_fecha());
			ps.setObject(6, deta.getDg_lote());
			ps.setDouble(7, deta.getDg_preciocompra());
			ps.setDouble(8, deta.getDg_preciobase());
			ps.setDouble(9, deta.getDg_preciominimo());
			ps.setDouble(10, deta.getDg_preciomayor());
			ps.setDouble(11, deta.getDg_preciocredito());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalledesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalledesglose deta) {
		String q = " update detalledesglose set  dg_codigocabecera=?,  dg_codprod=?,  dg_cantidaddesglosada=?,  dg_borrado=?,  dg_fecha=?,  dg_lote=?,  dg_preciocompra=?,  dg_preciobase=?,  dg_preciominimo=?,  dg_preciomayor=?,  dg_preciocredito=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDg_codigocabecera());
			ps.setObject(2, deta.getDg_codprod());
			ps.setDouble(3, deta.getDg_cantidaddesglosada());
			ps.setInt(4, deta.getDg_borrado());
			ps.setString(5, deta.getDg_fecha());
			ps.setObject(6, deta.getDg_lote());
			ps.setDouble(7, deta.getDg_preciocompra());
			ps.setDouble(8, deta.getDg_preciobase());
			ps.setDouble(9, deta.getDg_preciominimo());
			ps.setDouble(10, deta.getDg_preciomayor());
			ps.setDouble(11, deta.getDg_preciocredito());
			ps.setInt(12, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalledesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalledesglose deta) {
		String q = " delete from detalledesglose where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalledesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}