package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalle_notacredito;
import vista.*;

public class Detalle_notacreditoDAO extends Thread {
	private Detalle_notacredito deta;
	public ArrayList<Detalle_notacredito> resultadoDetalle_notacredito;

	@Override
	public void run() {
		try{
			actualizarDetalle_notacredito("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalle_notacredito");
		}
		yield();
	}

	public void actualizarDetalle_notacredito(String condicion) {
		resultadoDetalle_notacredito = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalle_notacredito " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalle_notacredito(
						rs.getInt("dn_codigo"),
						rs.getObject("dn_codprod"),
						rs.getInt("dn_numero"),
						rs.getObject("dn_lote"),
						rs.getInt("dn_borrado"),
						rs.getDouble("dn_cantidad"),
						rs.getDouble("dn_precio")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalle_notacredito deta) {
		String q = " insert into detalle_notacredito( dn_codprod,  dn_numero,  dn_lote,  dn_borrado,  dn_cantidad,  dn_precio) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDn_codprod());
			ps.setInt(2, deta.getDn_numero());
			ps.setObject(3, deta.getDn_lote());
			ps.setInt(4, deta.getDn_borrado());
			ps.setDouble(5, deta.getDn_cantidad());
			ps.setDouble(6, deta.getDn_precio());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalle_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalle_notacredito deta) {
		String q = " update detalle_notacredito set  dn_codprod=?,  dn_numero=?,  dn_lote=?,  dn_borrado=?,  dn_cantidad=?,  dn_precio=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, deta.getDn_codprod());
			ps.setInt(2, deta.getDn_numero());
			ps.setObject(3, deta.getDn_lote());
			ps.setInt(4, deta.getDn_borrado());
			ps.setDouble(5, deta.getDn_cantidad());
			ps.setDouble(6, deta.getDn_precio());
			ps.setInt(7, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalle_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalle_notacredito deta) {
		String q = " delete from detalle_notacredito where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalle_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}