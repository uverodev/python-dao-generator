package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventadet_temp;
import vista.*;

public class Ventadet_tempDAO extends Thread {
	private Ventadet_temp vent;
	public ArrayList<Ventadet_temp> resultadoVentadet_temp;

	@Override
	public void run() {
		try{
			actualizarVentadet_temp("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventadet_temp");
		}
		yield();
	}

	public void actualizarVentadet_temp(String condicion) {
		resultadoVentadet_temp = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventadet_temp " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventadet_temp(
						rs.getInt("dett_nro"),
						rs.getString("dett_codprod"),
						rs.getDouble("dett_cantidad"),
						rs.getInt("dett_unprod"),
						rs.getDouble("dett_preciov"),
						rs.getDouble("dett_preciovd"),
						rs.getDouble("dett_preciovr"),
						rs.getDouble("dett_preciovp"),
						rs.getDouble("dett_preciove"),
						rs.getDouble("dett_descuento"),
						rs.getInt("dett_unidadv"),
						rs.getString("dett_unidadcantv"),
						rs.getDouble("dett_total"),
						rs.getDouble("dett_iva"),
						rs.getString("dett_lote"),
						rs.getInt("dett_borrado"),
						rs.getDouble("dett_preciov1"),
						rs.getInt("dett_devuelto"),
						rs.getDouble("dett_cantdevuelto"),
						rs.getString("dett_area"),
						rs.getInt("dett_index"),
						rs.getString("dett_fecha"),
						rs.getInt("dett_deposito"),
						rs.getDouble("dett_preciocompra"),
						rs.getInt("dett_bonificacion"),
						rs.getString("dett_maquina")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventadet_temp vent) {
		String q = " insert into ventadet_temp( dett_codprod,  dett_cantidad,  dett_unprod,  dett_preciov,  dett_preciovd,  dett_preciovr,  dett_preciovp,  dett_preciove,  dett_descuento,  dett_unidadv,  dett_unidadcantv,  dett_total,  dett_iva,  dett_lote,  dett_borrado,  dett_preciov1,  dett_devuelto,  dett_cantdevuelto,  dett_area,  dett_index,  dett_fecha,  dett_deposito,  dett_preciocompra,  dett_bonificacion,  dett_maquina) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getDett_codprod());
			ps.setDouble(2, vent.getDett_cantidad());
			ps.setInt(3, vent.getDett_unprod());
			ps.setDouble(4, vent.getDett_preciov());
			ps.setDouble(5, vent.getDett_preciovd());
			ps.setDouble(6, vent.getDett_preciovr());
			ps.setDouble(7, vent.getDett_preciovp());
			ps.setDouble(8, vent.getDett_preciove());
			ps.setDouble(9, vent.getDett_descuento());
			ps.setInt(10, vent.getDett_unidadv());
			ps.setString(11, vent.getDett_unidadcantv());
			ps.setDouble(12, vent.getDett_total());
			ps.setDouble(13, vent.getDett_iva());
			ps.setString(14, vent.getDett_lote());
			ps.setInt(15, vent.getDett_borrado());
			ps.setDouble(16, vent.getDett_preciov1());
			ps.setInt(17, vent.getDett_devuelto());
			ps.setDouble(18, vent.getDett_cantdevuelto());
			ps.setString(19, vent.getDett_area());
			ps.setInt(20, vent.getDett_index());
			ps.setString(21, vent.getDett_fecha());
			ps.setInt(22, vent.getDett_deposito());
			ps.setDouble(23, vent.getDett_preciocompra());
			ps.setInt(24, vent.getDett_bonificacion());
			ps.setString(25, vent.getDett_maquina());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventadet_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventadet_temp vent) {
		String q = " update ventadet_temp set  dett_codprod=?,  dett_cantidad=?,  dett_unprod=?,  dett_preciov=?,  dett_preciovd=?,  dett_preciovr=?,  dett_preciovp=?,  dett_preciove=?,  dett_descuento=?,  dett_unidadv=?,  dett_unidadcantv=?,  dett_total=?,  dett_iva=?,  dett_lote=?,  dett_borrado=?,  dett_preciov1=?,  dett_devuelto=?,  dett_cantdevuelto=?,  dett_area=?,  dett_index=?,  dett_fecha=?,  dett_deposito=?,  dett_preciocompra=?,  dett_bonificacion=?,  dett_maquina=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getDett_codprod());
			ps.setDouble(2, vent.getDett_cantidad());
			ps.setInt(3, vent.getDett_unprod());
			ps.setDouble(4, vent.getDett_preciov());
			ps.setDouble(5, vent.getDett_preciovd());
			ps.setDouble(6, vent.getDett_preciovr());
			ps.setDouble(7, vent.getDett_preciovp());
			ps.setDouble(8, vent.getDett_preciove());
			ps.setDouble(9, vent.getDett_descuento());
			ps.setInt(10, vent.getDett_unidadv());
			ps.setString(11, vent.getDett_unidadcantv());
			ps.setDouble(12, vent.getDett_total());
			ps.setDouble(13, vent.getDett_iva());
			ps.setString(14, vent.getDett_lote());
			ps.setInt(15, vent.getDett_borrado());
			ps.setDouble(16, vent.getDett_preciov1());
			ps.setInt(17, vent.getDett_devuelto());
			ps.setDouble(18, vent.getDett_cantdevuelto());
			ps.setString(19, vent.getDett_area());
			ps.setInt(20, vent.getDett_index());
			ps.setString(21, vent.getDett_fecha());
			ps.setInt(22, vent.getDett_deposito());
			ps.setDouble(23, vent.getDett_preciocompra());
			ps.setInt(24, vent.getDett_bonificacion());
			ps.setString(25, vent.getDett_maquina());
			ps.setInt(26, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventadet_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventadet_temp vent) {
		String q = " delete from ventadet_temp where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventadet_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}