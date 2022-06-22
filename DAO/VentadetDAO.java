package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventadet;
import vista.*;

public class VentadetDAO extends Thread {
	private Ventadet vent;
	public ArrayList<Ventadet> resultadoVentadet;

	@Override
	public void run() {
		try{
			actualizarVentadet("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventadet");
		}
		yield();
	}

	public void actualizarVentadet(String condicion) {
		resultadoVentadet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventadet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventadet(
						rs.getInt("det_nro"),
						rs.getString("det_codprod"),
						rs.getDouble("det_cantidad"),
						rs.getInt("det_unprod"),
						rs.getDouble("det_preciov"),
						rs.getDouble("det_preciov1"),
						rs.getDouble("det_preciovd"),
						rs.getDouble("det_preciovr"),
						rs.getDouble("det_preciovp"),
						rs.getDouble("det_preciove"),
						rs.getDouble("det_descuento"),
						rs.getInt("det_unidadv"),
						rs.getString("det_unidadcantv"),
						rs.getDouble("det_total"),
						rs.getDouble("det_iva"),
						rs.getString("det_lote"),
						rs.getInt("det_devuelto"),
						rs.getDouble("det_cantdevuelto"),
						rs.getInt("det_borrado"),
						rs.getString("det_fecha"),
						rs.getInt("det_deposito"),
						rs.getString("det_area"),
						rs.getDouble("det_preciocompra"),
						rs.getInt("det_id"),
						rs.getString("det_vencimiento")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventadet vent) {
		String q = " insert into ventadet( det_codprod,  det_cantidad,  det_unprod,  det_preciov,  det_preciov1,  det_preciovd,  det_preciovr,  det_preciovp,  det_preciove,  det_descuento,  det_unidadv,  det_unidadcantv,  det_total,  det_iva,  det_lote,  det_devuelto,  det_cantdevuelto,  det_borrado,  det_fecha,  det_deposito,  det_area,  det_preciocompra,  det_id,  det_vencimiento) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getDet_codprod());
			ps.setDouble(2, vent.getDet_cantidad());
			ps.setInt(3, vent.getDet_unprod());
			ps.setDouble(4, vent.getDet_preciov());
			ps.setDouble(5, vent.getDet_preciov1());
			ps.setDouble(6, vent.getDet_preciovd());
			ps.setDouble(7, vent.getDet_preciovr());
			ps.setDouble(8, vent.getDet_preciovp());
			ps.setDouble(9, vent.getDet_preciove());
			ps.setDouble(10, vent.getDet_descuento());
			ps.setInt(11, vent.getDet_unidadv());
			ps.setString(12, vent.getDet_unidadcantv());
			ps.setDouble(13, vent.getDet_total());
			ps.setDouble(14, vent.getDet_iva());
			ps.setString(15, vent.getDet_lote());
			ps.setInt(16, vent.getDet_devuelto());
			ps.setDouble(17, vent.getDet_cantdevuelto());
			ps.setInt(18, vent.getDet_borrado());
			ps.setString(19, vent.getDet_fecha());
			ps.setInt(20, vent.getDet_deposito());
			ps.setString(21, vent.getDet_area());
			ps.setDouble(22, vent.getDet_preciocompra());
			ps.setInt(23, vent.getDet_id());
			ps.setString(24, vent.getDet_vencimiento());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventadet vent) {
		String q = " update ventadet set  det_codprod=?,  det_cantidad=?,  det_unprod=?,  det_preciov=?,  det_preciov1=?,  det_preciovd=?,  det_preciovr=?,  det_preciovp=?,  det_preciove=?,  det_descuento=?,  det_unidadv=?,  det_unidadcantv=?,  det_total=?,  det_iva=?,  det_lote=?,  det_devuelto=?,  det_cantdevuelto=?,  det_borrado=?,  det_fecha=?,  det_deposito=?,  det_area=?,  det_preciocompra=?,  det_id=?,  det_vencimiento=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getDet_codprod());
			ps.setDouble(2, vent.getDet_cantidad());
			ps.setInt(3, vent.getDet_unprod());
			ps.setDouble(4, vent.getDet_preciov());
			ps.setDouble(5, vent.getDet_preciov1());
			ps.setDouble(6, vent.getDet_preciovd());
			ps.setDouble(7, vent.getDet_preciovr());
			ps.setDouble(8, vent.getDet_preciovp());
			ps.setDouble(9, vent.getDet_preciove());
			ps.setDouble(10, vent.getDet_descuento());
			ps.setInt(11, vent.getDet_unidadv());
			ps.setString(12, vent.getDet_unidadcantv());
			ps.setDouble(13, vent.getDet_total());
			ps.setDouble(14, vent.getDet_iva());
			ps.setString(15, vent.getDet_lote());
			ps.setInt(16, vent.getDet_devuelto());
			ps.setDouble(17, vent.getDet_cantdevuelto());
			ps.setInt(18, vent.getDet_borrado());
			ps.setString(19, vent.getDet_fecha());
			ps.setInt(20, vent.getDet_deposito());
			ps.setString(21, vent.getDet_area());
			ps.setDouble(22, vent.getDet_preciocompra());
			ps.setInt(23, vent.getDet_id());
			ps.setString(24, vent.getDet_vencimiento());
			ps.setInt(25, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventadet vent) {
		String q = " delete from ventadet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}