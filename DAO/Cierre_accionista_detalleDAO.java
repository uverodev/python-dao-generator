package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cierre_accionista_detalle;
import vista.*;

public class Cierre_accionista_detalleDAO extends Thread {
	private Cierre_accionista_detalle cier;
	public ArrayList<Cierre_accionista_detalle> resultadoCierre_accionista_detalle;

	@Override
	public void run() {
		try{
			actualizarCierre_accionista_detalle("");
		} catch (Exception e) {
			System.out.println("Error al generar Cierre_accionista_detalle");
		}
		yield();
	}

	public void actualizarCierre_accionista_detalle(String condicion) {
		resultadoCierre_accionista_detalle = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cierre_accionista_detalle " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cier = new Cierre_accionista_detalle(
						rs.getInt("cad_id"),
						rs.getInt("cad_accionista"),
						rs.getInt("cad_cierre_accionista"),
						rs.getInt("cad_borrado"),
						rs.getDouble("cad_valor")
			);
			arr.add(cier);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cierre_accionista_detalle cier) {
		String q = " insert into cierre_accionista_detalle( cad_accionista,  cad_cierre_accionista,  cad_borrado,  cad_valor) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCad_accionista());
			ps.setInt(2, cier.getCad_cierre_accionista());
			ps.setInt(3, cier.getCad_borrado());
			ps.setDouble(4, cier.getCad_valor());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cierre_accionista_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cierre_accionista_detalle cier) {
		String q = " update cierre_accionista_detalle set  cad_accionista=?,  cad_cierre_accionista=?,  cad_borrado=?,  cad_valor=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getCad_accionista());
			ps.setInt(2, cier.getCad_cierre_accionista());
			ps.setInt(3, cier.getCad_borrado());
			ps.setDouble(4, cier.getCad_valor());
			ps.setInt(5, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cierre_accionista_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cierre_accionista_detalle cier) {
		String q = " delete from cierre_accionista_detalle where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cierre_accionista_detalle", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}