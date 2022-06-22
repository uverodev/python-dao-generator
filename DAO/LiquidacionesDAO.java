package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Liquidaciones;
import vista.*;

public class LiquidacionesDAO extends Thread {
	private Liquidaciones liqu;
	public ArrayList<Liquidaciones> resultadoLiquidaciones;

	@Override
	public void run() {
		try{
			actualizarLiquidaciones("");
		} catch (Exception e) {
			System.out.println("Error al generar Liquidaciones");
		}
		yield();
	}

	public void actualizarLiquidaciones(String condicion) {
		resultadoLiquidaciones = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  liquidaciones " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				liqu = new Liquidaciones(
						rs.getInt("liq_nro"),
						rs.getString("liq_canthora"),
						rs.getString("liq_totextra"),
						rs.getString("liq_totferiado"),
						rs.getDouble("iiq_montferiado"),
						rs.getDouble("liq_monthextra"),
						rs.getDouble("liq_totventas"),
						rs.getDouble("liq_totcomision"),
						rs.getDouble("liq_sueldo"),
						rs.getDouble("liq_descuotcompra"),
						rs.getDouble("liq_adelanto"),
						rs.getDouble("liq_saldo"),
						rs.getString("liq_fecha"),
						rs.getString("liq_hora"),
						rs.getInt("liq_empleado"),
						rs.getInt("liq_usuario"),
						rs.getInt("liq_borrado"),
						rs.getDouble("liq_totdescxatraso"),
						rs.getDouble("liq_tototrosdescuentos"),
						rs.getDouble("liq_saldocomiuti"),
						rs.getDouble("liq_totcomiuti"),
						rs.getDouble("liq_totutilidad"),
						rs.getDouble("liq_totpcosto"),
						rs.getDouble("liq_totpventas"),
						rs.getString("liq_ultliquidacion"),
						rs.getInt("liq_cantdias"),
						rs.getString("liq_fechahasta"),
						rs.getString("liq_fechadesde"),
						rs.getDouble("liq_totcomicobro"),
						rs.getDouble("liq_totcomiventa"),
						rs.getInt("liq_cierrecajagennro"),
						rs.getInt("liq_pagado"),
						rs.getInt("liq_usuariopago"),
						rs.getString("liq_fechapago"),
						rs.getObject("liq_pcpago"),
						rs.getInt("liq_cierrecajanro"),
						rs.getDouble("liq_montferiado"),
						rs.getDouble("liq_monto_ips")
			);
			arr.add(liqu);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Liquidaciones liqu) {
		String q = " insert into liquidaciones( liq_canthora,  liq_totextra,  liq_totferiado,  iiq_montferiado,  liq_monthextra,  liq_totventas,  liq_totcomision,  liq_sueldo,  liq_descuotcompra,  liq_adelanto,  liq_saldo,  liq_fecha,  liq_hora,  liq_empleado,  liq_usuario,  liq_borrado,  liq_totdescxatraso,  liq_tototrosdescuentos,  liq_saldocomiuti,  liq_totcomiuti,  liq_totutilidad,  liq_totpcosto,  liq_totpventas,  liq_ultliquidacion,  liq_cantdias,  liq_fechahasta,  liq_fechadesde,  liq_totcomicobro,  liq_totcomiventa,  liq_cierrecajagennro,  liq_pagado,  liq_usuariopago,  liq_fechapago,  liq_pcpago,  liq_cierrecajanro,  liq_montferiado,  liq_monto_ips) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, liqu.getLiq_canthora());
			ps.setString(2, liqu.getLiq_totextra());
			ps.setString(3, liqu.getLiq_totferiado());
			ps.setDouble(4, liqu.getIiq_montferiado());
			ps.setDouble(5, liqu.getLiq_monthextra());
			ps.setDouble(6, liqu.getLiq_totventas());
			ps.setDouble(7, liqu.getLiq_totcomision());
			ps.setDouble(8, liqu.getLiq_sueldo());
			ps.setDouble(9, liqu.getLiq_descuotcompra());
			ps.setDouble(10, liqu.getLiq_adelanto());
			ps.setDouble(11, liqu.getLiq_saldo());
			ps.setString(12, liqu.getLiq_fecha());
			ps.setString(13, liqu.getLiq_hora());
			ps.setInt(14, liqu.getLiq_empleado());
			ps.setInt(15, liqu.getLiq_usuario());
			ps.setInt(16, liqu.getLiq_borrado());
			ps.setDouble(17, liqu.getLiq_totdescxatraso());
			ps.setDouble(18, liqu.getLiq_tototrosdescuentos());
			ps.setDouble(19, liqu.getLiq_saldocomiuti());
			ps.setDouble(20, liqu.getLiq_totcomiuti());
			ps.setDouble(21, liqu.getLiq_totutilidad());
			ps.setDouble(22, liqu.getLiq_totpcosto());
			ps.setDouble(23, liqu.getLiq_totpventas());
			ps.setString(24, liqu.getLiq_ultliquidacion());
			ps.setInt(25, liqu.getLiq_cantdias());
			ps.setString(26, liqu.getLiq_fechahasta());
			ps.setString(27, liqu.getLiq_fechadesde());
			ps.setDouble(28, liqu.getLiq_totcomicobro());
			ps.setDouble(29, liqu.getLiq_totcomiventa());
			ps.setInt(30, liqu.getLiq_cierrecajagennro());
			ps.setInt(31, liqu.getLiq_pagado());
			ps.setInt(32, liqu.getLiq_usuariopago());
			ps.setString(33, liqu.getLiq_fechapago());
			ps.setObject(34, liqu.getLiq_pcpago());
			ps.setInt(35, liqu.getLiq_cierrecajanro());
			ps.setDouble(36, liqu.getLiq_montferiado());
			ps.setDouble(37, liqu.getLiq_monto_ips());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Liquidaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Liquidaciones liqu) {
		String q = " update liquidaciones set  liq_canthora=?,  liq_totextra=?,  liq_totferiado=?,  iiq_montferiado=?,  liq_monthextra=?,  liq_totventas=?,  liq_totcomision=?,  liq_sueldo=?,  liq_descuotcompra=?,  liq_adelanto=?,  liq_saldo=?,  liq_fecha=?,  liq_hora=?,  liq_empleado=?,  liq_usuario=?,  liq_borrado=?,  liq_totdescxatraso=?,  liq_tototrosdescuentos=?,  liq_saldocomiuti=?,  liq_totcomiuti=?,  liq_totutilidad=?,  liq_totpcosto=?,  liq_totpventas=?,  liq_ultliquidacion=?,  liq_cantdias=?,  liq_fechahasta=?,  liq_fechadesde=?,  liq_totcomicobro=?,  liq_totcomiventa=?,  liq_cierrecajagennro=?,  liq_pagado=?,  liq_usuariopago=?,  liq_fechapago=?,  liq_pcpago=?,  liq_cierrecajanro=?,  liq_montferiado=?,  liq_monto_ips=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, liqu.getLiq_canthora());
			ps.setString(2, liqu.getLiq_totextra());
			ps.setString(3, liqu.getLiq_totferiado());
			ps.setDouble(4, liqu.getIiq_montferiado());
			ps.setDouble(5, liqu.getLiq_monthextra());
			ps.setDouble(6, liqu.getLiq_totventas());
			ps.setDouble(7, liqu.getLiq_totcomision());
			ps.setDouble(8, liqu.getLiq_sueldo());
			ps.setDouble(9, liqu.getLiq_descuotcompra());
			ps.setDouble(10, liqu.getLiq_adelanto());
			ps.setDouble(11, liqu.getLiq_saldo());
			ps.setString(12, liqu.getLiq_fecha());
			ps.setString(13, liqu.getLiq_hora());
			ps.setInt(14, liqu.getLiq_empleado());
			ps.setInt(15, liqu.getLiq_usuario());
			ps.setInt(16, liqu.getLiq_borrado());
			ps.setDouble(17, liqu.getLiq_totdescxatraso());
			ps.setDouble(18, liqu.getLiq_tototrosdescuentos());
			ps.setDouble(19, liqu.getLiq_saldocomiuti());
			ps.setDouble(20, liqu.getLiq_totcomiuti());
			ps.setDouble(21, liqu.getLiq_totutilidad());
			ps.setDouble(22, liqu.getLiq_totpcosto());
			ps.setDouble(23, liqu.getLiq_totpventas());
			ps.setString(24, liqu.getLiq_ultliquidacion());
			ps.setInt(25, liqu.getLiq_cantdias());
			ps.setString(26, liqu.getLiq_fechahasta());
			ps.setString(27, liqu.getLiq_fechadesde());
			ps.setDouble(28, liqu.getLiq_totcomicobro());
			ps.setDouble(29, liqu.getLiq_totcomiventa());
			ps.setInt(30, liqu.getLiq_cierrecajagennro());
			ps.setInt(31, liqu.getLiq_pagado());
			ps.setInt(32, liqu.getLiq_usuariopago());
			ps.setString(33, liqu.getLiq_fechapago());
			ps.setObject(34, liqu.getLiq_pcpago());
			ps.setInt(35, liqu.getLiq_cierrecajanro());
			ps.setDouble(36, liqu.getLiq_montferiado());
			ps.setDouble(37, liqu.getLiq_monto_ips());
			ps.setInt(38, liqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Liquidaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Liquidaciones liqu) {
		String q = " delete from liquidaciones where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, liqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Liquidaciones", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}