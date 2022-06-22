package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Vencuota;
import vista.*;

public class VencuotaDAO extends Thread {
	private Vencuota venc;
	public ArrayList<Vencuota> resultadoVencuota;

	@Override
	public void run() {
		try{
			actualizarVencuota("");
		} catch (Exception e) {
			System.out.println("Error al generar Vencuota");
		}
		yield();
	}

	public void actualizarVencuota(String condicion) {
		resultadoVencuota = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  vencuota " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				venc = new Vencuota(
						rs.getInt("vcta_nro"),
						rs.getInt("vcta_numcuota"),
						rs.getInt("vcta_cobrador"),
						rs.getInt("vcta_numventa"),
						rs.getInt("vcta_tipcobro"),
						rs.getString("vcta_cliente"),
						rs.getString("vcta_fechapago"),
						rs.getString("vcta_fechavenci"),
						rs.getDouble("vcta_totcuota"),
						rs.getDouble("vcta_interescre"),
						rs.getDouble("vcta_cdolar"),
						rs.getDouble("vcta_creal"),
						rs.getDouble("vcta_cpeso"),
						rs.getDouble("vcta_ceuro"),
						rs.getDouble("vcta_entrega"),
						rs.getInt("vcta_nrocredito"),
						rs.getInt("vcta_pagado"),
						rs.getInt("vcta_borrado"),
						rs.getDouble("vcta_interes"),
						rs.getDouble("vcta_entinteres"),
						rs.getString("vcta_fechaultpago"),
						rs.getInt("vcta_nroliquidacion"),
						rs.getInt("vcta_liquidado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(venc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Vencuota venc) {
		String q = " insert into vencuota( vcta_numcuota,  vcta_cobrador,  vcta_numventa,  vcta_tipcobro,  vcta_cliente,  vcta_fechapago,  vcta_fechavenci,  vcta_totcuota,  vcta_interescre,  vcta_cdolar,  vcta_creal,  vcta_cpeso,  vcta_ceuro,  vcta_entrega,  vcta_nrocredito,  vcta_pagado,  vcta_borrado,  vcta_interes,  vcta_entinteres,  vcta_fechaultpago,  vcta_nroliquidacion,  vcta_liquidado,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, venc.getVcta_numcuota());
			ps.setInt(2, venc.getVcta_cobrador());
			ps.setInt(3, venc.getVcta_numventa());
			ps.setInt(4, venc.getVcta_tipcobro());
			ps.setString(5, venc.getVcta_cliente());
			ps.setString(6, venc.getVcta_fechapago());
			ps.setString(7, venc.getVcta_fechavenci());
			ps.setDouble(8, venc.getVcta_totcuota());
			ps.setDouble(9, venc.getVcta_interescre());
			ps.setDouble(10, venc.getVcta_cdolar());
			ps.setDouble(11, venc.getVcta_creal());
			ps.setDouble(12, venc.getVcta_cpeso());
			ps.setDouble(13, venc.getVcta_ceuro());
			ps.setDouble(14, venc.getVcta_entrega());
			ps.setInt(15, venc.getVcta_nrocredito());
			ps.setInt(16, venc.getVcta_pagado());
			ps.setInt(17, venc.getVcta_borrado());
			ps.setDouble(18, venc.getVcta_interes());
			ps.setDouble(19, venc.getVcta_entinteres());
			ps.setString(20, venc.getVcta_fechaultpago());
			ps.setInt(21, venc.getVcta_nroliquidacion());
			ps.setInt(22, venc.getVcta_liquidado());
			ps.setString(23, venc.getFechasct());
			ps.setInt(24, venc.getUsuariosct());
			ps.setString(25, venc.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Vencuota", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Vencuota venc) {
		String q = " update vencuota set  vcta_numcuota=?,  vcta_cobrador=?,  vcta_numventa=?,  vcta_tipcobro=?,  vcta_cliente=?,  vcta_fechapago=?,  vcta_fechavenci=?,  vcta_totcuota=?,  vcta_interescre=?,  vcta_cdolar=?,  vcta_creal=?,  vcta_cpeso=?,  vcta_ceuro=?,  vcta_entrega=?,  vcta_nrocredito=?,  vcta_pagado=?,  vcta_borrado=?,  vcta_interes=?,  vcta_entinteres=?,  vcta_fechaultpago=?,  vcta_nroliquidacion=?,  vcta_liquidado=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, venc.getVcta_numcuota());
			ps.setInt(2, venc.getVcta_cobrador());
			ps.setInt(3, venc.getVcta_numventa());
			ps.setInt(4, venc.getVcta_tipcobro());
			ps.setString(5, venc.getVcta_cliente());
			ps.setString(6, venc.getVcta_fechapago());
			ps.setString(7, venc.getVcta_fechavenci());
			ps.setDouble(8, venc.getVcta_totcuota());
			ps.setDouble(9, venc.getVcta_interescre());
			ps.setDouble(10, venc.getVcta_cdolar());
			ps.setDouble(11, venc.getVcta_creal());
			ps.setDouble(12, venc.getVcta_cpeso());
			ps.setDouble(13, venc.getVcta_ceuro());
			ps.setDouble(14, venc.getVcta_entrega());
			ps.setInt(15, venc.getVcta_nrocredito());
			ps.setInt(16, venc.getVcta_pagado());
			ps.setInt(17, venc.getVcta_borrado());
			ps.setDouble(18, venc.getVcta_interes());
			ps.setDouble(19, venc.getVcta_entinteres());
			ps.setString(20, venc.getVcta_fechaultpago());
			ps.setInt(21, venc.getVcta_nroliquidacion());
			ps.setInt(22, venc.getVcta_liquidado());
			ps.setString(23, venc.getFechasct());
			ps.setInt(24, venc.getUsuariosct());
			ps.setString(25, venc.getMaquinasct());
			ps.setInt(26, venc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Vencuota", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Vencuota venc) {
		String q = " delete from vencuota where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, venc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Vencuota", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}