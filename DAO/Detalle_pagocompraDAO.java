package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Detalle_pagocompra;
import vista.*;

public class Detalle_pagocompraDAO extends Thread {
	private Detalle_pagocompra deta;
	public ArrayList<Detalle_pagocompra> resultadoDetalle_pagocompra;

	@Override
	public void run() {
		try{
			actualizarDetalle_pagocompra("");
		} catch (Exception e) {
			System.out.println("Error al generar Detalle_pagocompra");
		}
		yield();
	}

	public void actualizarDetalle_pagocompra(String condicion) {
		resultadoDetalle_pagocompra = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  detalle_pagocompra " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deta = new Detalle_pagocompra(
						rs.getInt("pagc_nro"),
						rs.getInt("pagc_nrocompra"),
						rs.getDouble("pagc_montoabonado"),
						rs.getDouble("pagc_cargosextras"),
						rs.getInt("pagc_nropago"),
						rs.getString("pagc_fecha"),
						rs.getInt("pagc_borrado"),
						rs.getInt("pagc_tipooperacion")
			);
			arr.add(deta);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Detalle_pagocompra deta) {
		String q = " insert into detalle_pagocompra( pagc_nrocompra,  pagc_montoabonado,  pagc_cargosextras,  pagc_nropago,  pagc_fecha,  pagc_borrado,  pagc_tipooperacion) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getPagc_nrocompra());
			ps.setDouble(2, deta.getPagc_montoabonado());
			ps.setDouble(3, deta.getPagc_cargosextras());
			ps.setInt(4, deta.getPagc_nropago());
			ps.setString(5, deta.getPagc_fecha());
			ps.setInt(6, deta.getPagc_borrado());
			ps.setInt(7, deta.getPagc_tipooperacion());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Detalle_pagocompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Detalle_pagocompra deta) {
		String q = " update detalle_pagocompra set  pagc_nrocompra=?,  pagc_montoabonado=?,  pagc_cargosextras=?,  pagc_nropago=?,  pagc_fecha=?,  pagc_borrado=?,  pagc_tipooperacion=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getPagc_nrocompra());
			ps.setDouble(2, deta.getPagc_montoabonado());
			ps.setDouble(3, deta.getPagc_cargosextras());
			ps.setInt(4, deta.getPagc_nropago());
			ps.setString(5, deta.getPagc_fecha());
			ps.setInt(6, deta.getPagc_borrado());
			ps.setInt(7, deta.getPagc_tipooperacion());
			ps.setInt(8, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Detalle_pagocompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Detalle_pagocompra deta) {
		String q = " delete from detalle_pagocompra where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deta.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Detalle_pagocompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}