package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalledevcompra;
import vista.*;

public class DetalledevcompraDAO extends Thread {
	private Detalledevcompra deta;
	public ArrayList<Detalledevcompra> resultadoDetalledevcompra;

	@Override
	public void run() {
		try{
			actualizarDetalledevcompra("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalledevcompra");
		}
		yield();
	}

	public void actualizarDetalledevcompra(String condicion) {
		resultadoDetalledevcompra = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalledevcompra " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalledevcompra(
						rs.getInt("dcd_codigo"),
						rs.getObject("dcd_codprod"),
						rs.getDouble("dcd_cantidad"),
						rs.getObject("dcd_lote"),
						rs.getInt("dcd_borrado"),
						rs.getInt("dcd_numerocabecera")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalledevcompra deta) {
		String q = " insert into detalledevcompra( dcd_codprod,  dcd_cantidad,  dcd_lote,  dcd_borrado,  dcd_numerocabecera) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDcd_codprod());
			ps.setDouble(2, deta.getDcd_cantidad());
			ps.setObject(3, deta.getDcd_lote());
			ps.setInt(4, deta.getDcd_borrado());
			ps.setInt(5, deta.getDcd_numerocabecera());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalledevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalledevcompra deta) {
		String q = " update detalledevcompra set  dcd_codprod=?,  dcd_cantidad=?,  dcd_lote=?,  dcd_borrado=?,  dcd_numerocabecera=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDcd_codprod());
			ps.setDouble(2, deta.getDcd_cantidad());
			ps.setObject(3, deta.getDcd_lote());
			ps.setInt(4, deta.getDcd_borrado());
			ps.setInt(5, deta.getDcd_numerocabecera());
			ps.setInt(6, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalledevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalledevcompra deta) {
		String q = " delete from detalledevcompra where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalledevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}