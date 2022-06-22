package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventas;
import vista.*;

public class VentasDAO extends Thread {
	private Ventas vent;
	public ArrayList<Ventas> resultadoVentas;

	@Override
	public void run() {
		try{
			actualizarVentas("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventas");
		}
		yield();
	}

	public void actualizarVentas(String condicion) {
		resultadoVentas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventas(
						rs.getInt("id"),
						rs.getString("fecha"),
						rs.getString("fechapago"),
						rs.getString("horapago"),
						rs.getInt("idClientes"),
						rs.getInt("total"),
						rs.getString("estado"),
						rs.getString("facturanum"),
						rs.getString("tipo"),
						rs.getInt("descuento"),
						rs.getInt("idVendedor"),
						rs.getInt("idCobrador")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventas vent) {
		String q = " insert into ventas( fecha,  fechapago,  horapago,  idClientes,  total,  estado,  facturanum,  tipo,  descuento,  idVendedor,  idCobrador) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getFecha());
			ps.setString(2, vent.getFechapago());
			ps.setString(3, vent.getHorapago());
			ps.setInt(4, vent.getIdclientes());
			ps.setInt(5, vent.getTotal());
			ps.setString(6, vent.getEstado());
			ps.setString(7, vent.getFacturanum());
			ps.setString(8, vent.getTipo());
			ps.setInt(9, vent.getDescuento());
			ps.setInt(10, vent.getIdvendedor());
			ps.setInt(11, vent.getIdcobrador());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventas vent) {
		String q = " update ventas set  fecha=?,  fechapago=?,  horapago=?,  idClientes=?,  total=?,  estado=?,  facturanum=?,  tipo=?,  descuento=?,  idVendedor=?,  idCobrador=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getFecha());
			ps.setString(2, vent.getFechapago());
			ps.setString(3, vent.getHorapago());
			ps.setInt(4, vent.getIdclientes());
			ps.setInt(5, vent.getTotal());
			ps.setString(6, vent.getEstado());
			ps.setString(7, vent.getFacturanum());
			ps.setString(8, vent.getTipo());
			ps.setInt(9, vent.getDescuento());
			ps.setInt(10, vent.getIdvendedor());
			ps.setInt(11, vent.getIdcobrador());
			ps.setInt(12, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventas vent) {
		String q = " delete from ventas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}