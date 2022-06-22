package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cierre_balance;
import vista.*;

public class Cierre_balanceDAO extends Thread {
	private Cierre_balance cier;
	public ArrayList<Cierre_balance> resultadoCierre_balance;

	@Override
	public void run() {
		try{
			actualizarCierre_balance("");
		} catch (Exception e) {
			System.out.println("Error al generar Cierre_balance");
		}
		yield();
	}

	public void actualizarCierre_balance(String condicion) {
		resultadoCierre_balance = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cierre_balance " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cier = new Cierre_balance(
						rs.getInt("cb_id"),
						rs.getString("cb_fecha"),
						rs.getString("cb_hora"),
						rs.getString("cb_fechasct"),
						rs.getInt("cb_usuario"),
						rs.getInt("cb_borrado"),
						rs.getString("cb_maquina"),
						rs.getString("cb_fecha_desde"),
						rs.getString("cb_fecha_hasta"),
						rs.getString("cb_hora_desde"),
						rs.getString("cb_hora_hasta"),
						rs.getDouble("cb_caja_inicial"),
						rs.getDouble("cb_ventas"),
						rs.getDouble("cb_cobranzas"),
						rs.getDouble("cb_total_ingresos"),
						rs.getDouble("cb_compras"),
						rs.getDouble("cb_pagos_a_proveedores"),
						rs.getDouble("cb_otros_gastos"),
						rs.getDouble("cb_total_egresos"),
						rs.getDouble("cb_total_ingresos_menos_total_egresos"),
						rs.getDouble("cb_caja"),
						rs.getInt("cb_sucursal")
			);
			arr.add(cier);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cierre_balance cier) {
		String q = " insert into cierre_balance( cb_fecha,  cb_hora,  cb_fechasct,  cb_usuario,  cb_borrado,  cb_maquina,  cb_fecha_desde,  cb_fecha_hasta,  cb_hora_desde,  cb_hora_hasta,  cb_caja_inicial,  cb_ventas,  cb_cobranzas,  cb_total_ingresos,  cb_compras,  cb_pagos_a_proveedores,  cb_otros_gastos,  cb_total_egresos,  cb_total_ingresos_menos_total_egresos,  cb_caja,  cb_sucursal) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cier.getCb_fecha());
			ps.setString(2, cier.getCb_hora());
			ps.setString(3, cier.getCb_fechasct());
			ps.setInt(4, cier.getCb_usuario());
			ps.setInt(5, cier.getCb_borrado());
			ps.setString(6, cier.getCb_maquina());
			ps.setString(7, cier.getCb_fecha_desde());
			ps.setString(8, cier.getCb_fecha_hasta());
			ps.setString(9, cier.getCb_hora_desde());
			ps.setString(10, cier.getCb_hora_hasta());
			ps.setDouble(11, cier.getCb_caja_inicial());
			ps.setDouble(12, cier.getCb_ventas());
			ps.setDouble(13, cier.getCb_cobranzas());
			ps.setDouble(14, cier.getCb_total_ingresos());
			ps.setDouble(15, cier.getCb_compras());
			ps.setDouble(16, cier.getCb_pagos_a_proveedores());
			ps.setDouble(17, cier.getCb_otros_gastos());
			ps.setDouble(18, cier.getCb_total_egresos());
			ps.setDouble(19, cier.getCb_total_ingresos_menos_total_egresos());
			ps.setDouble(20, cier.getCb_caja());
			ps.setInt(21, cier.getCb_sucursal());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cierre_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cierre_balance cier) {
		String q = " update cierre_balance set  cb_fecha=?,  cb_hora=?,  cb_fechasct=?,  cb_usuario=?,  cb_borrado=?,  cb_maquina=?,  cb_fecha_desde=?,  cb_fecha_hasta=?,  cb_hora_desde=?,  cb_hora_hasta=?,  cb_caja_inicial=?,  cb_ventas=?,  cb_cobranzas=?,  cb_total_ingresos=?,  cb_compras=?,  cb_pagos_a_proveedores=?,  cb_otros_gastos=?,  cb_total_egresos=?,  cb_total_ingresos_menos_total_egresos=?,  cb_caja=?,  cb_sucursal=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cier.getCb_fecha());
			ps.setString(2, cier.getCb_hora());
			ps.setString(3, cier.getCb_fechasct());
			ps.setInt(4, cier.getCb_usuario());
			ps.setInt(5, cier.getCb_borrado());
			ps.setString(6, cier.getCb_maquina());
			ps.setString(7, cier.getCb_fecha_desde());
			ps.setString(8, cier.getCb_fecha_hasta());
			ps.setString(9, cier.getCb_hora_desde());
			ps.setString(10, cier.getCb_hora_hasta());
			ps.setDouble(11, cier.getCb_caja_inicial());
			ps.setDouble(12, cier.getCb_ventas());
			ps.setDouble(13, cier.getCb_cobranzas());
			ps.setDouble(14, cier.getCb_total_ingresos());
			ps.setDouble(15, cier.getCb_compras());
			ps.setDouble(16, cier.getCb_pagos_a_proveedores());
			ps.setDouble(17, cier.getCb_otros_gastos());
			ps.setDouble(18, cier.getCb_total_egresos());
			ps.setDouble(19, cier.getCb_total_ingresos_menos_total_egresos());
			ps.setDouble(20, cier.getCb_caja());
			ps.setInt(21, cier.getCb_sucursal());
			ps.setInt(22, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cierre_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cierre_balance cier) {
		String q = " delete from cierre_balance where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cier.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cierre_balance", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}