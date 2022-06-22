package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalledesgloseusado;
import vista.*;

public class DetalledesgloseusadoDAO extends Thread {
	private Detalledesgloseusado deta;
	public ArrayList<Detalledesgloseusado> resultadoDetalledesgloseusado;

	@Override
	public void run() {
		try{
			actualizarDetalledesgloseusado("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalledesgloseusado");
		}
		yield();
	}

	public void actualizarDetalledesgloseusado(String condicion) {
		resultadoDetalledesgloseusado = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalledesgloseusado " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalledesgloseusado(
						rs.getInt("dgu_codigo"),
						rs.getInt("dgu_codigocabecera"),
						rs.getObject("dgu_codprod"),
						rs.getDouble("dgu_cantidaddesglosada"),
						rs.getInt("dgu_borrado"),
						rs.getString("dgu_fecha"),
						rs.getObject("dgu_lote")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalledesgloseusado deta) {
		String q = " insert into detalledesgloseusado( dgu_codigocabecera,  dgu_codprod,  dgu_cantidaddesglosada,  dgu_borrado,  dgu_fecha,  dgu_lote) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDgu_codigocabecera());
			ps.setObject(2, deta.getDgu_codprod());
			ps.setDouble(3, deta.getDgu_cantidaddesglosada());
			ps.setInt(4, deta.getDgu_borrado());
			ps.setString(5, deta.getDgu_fecha());
			ps.setObject(6, deta.getDgu_lote());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalledesgloseusado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalledesgloseusado deta) {
		String q = " update detalledesgloseusado set  dgu_codigocabecera=?,  dgu_codprod=?,  dgu_cantidaddesglosada=?,  dgu_borrado=?,  dgu_fecha=?,  dgu_lote=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getDgu_codigocabecera());
			ps.setObject(2, deta.getDgu_codprod());
			ps.setDouble(3, deta.getDgu_cantidaddesglosada());
			ps.setInt(4, deta.getDgu_borrado());
			ps.setString(5, deta.getDgu_fecha());
			ps.setObject(6, deta.getDgu_lote());
			ps.setInt(7, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalledesgloseusado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalledesgloseusado deta) {
		String q = " delete from detalledesgloseusado where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalledesgloseusado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}