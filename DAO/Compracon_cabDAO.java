package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compracon_cab;
import vista.*;

public class Compracon_cabDAO extends Thread {
	private Compracon_cab comp;
	public ArrayList<Compracon_cab> resultadoCompracon_cab;

	@Override
	public void run() {
		try{
			actualizarCompracon_cab("");
		} catch (Exception e) {
			System.out.println("Error al generar Compracon_cab");
		}
		yield();
	}

	public void actualizarCompracon_cab(String condicion) {
		resultadoCompracon_cab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compracon_cab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compracon_cab(
						rs.getInt("com_nro"),
						rs.getString("com_nrofact"),
						rs.getString("com_hora"),
						rs.getInt("com_usua"),
						rs.getString("com_movim"),
						rs.getString("com_fechac"),
						rs.getString("com_fecha"),
						rs.getInt("com_proveedor"),
						rs.getDouble("com_total"),
						rs.getDouble("com_totald"),
						rs.getDouble("com_totalp"),
						rs.getDouble("com_totalr"),
						rs.getDouble("com_totale"),
						rs.getInt("com_activo"),
						rs.getDouble("com_moneda"),
						rs.getDouble("com_monedo"),
						rs.getDouble("com_monepe"),
						rs.getDouble("com_monere"),
						rs.getDouble("com_moneeu"),
						rs.getString("com_nucaja"),
						rs.getInt("com_ubica"),
						rs.getInt("com_tip"),
						rs.getDouble("com_desc"),
						rs.getInt("com_cierre"),
						rs.getInt("com_tipoperacion"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("com_deposito"),
						rs.getInt("com_nrocierre"),
						rs.getInt("com_pagado"),
						rs.getInt("com_usuariopago"),
						rs.getObject("com_pcpago"),
						rs.getString("com_fechapago"),
						rs.getInt("com_cierrecajanro"),
						rs.getInt("com_cierrecajagennro"),
						rs.getInt("com_nro_pedido"),
						rs.getInt("com_empresa"),
						rs.getString("com_timbrado"),
						rs.getString("com_fin_vigencia")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compracon_cab comp) {
		String q = " insert into compracon_cab( com_nrofact,  com_hora,  com_usua,  com_movim,  com_fechac,  com_fecha,  com_proveedor,  com_total,  com_totald,  com_totalp,  com_totalr,  com_totale,  com_activo,  com_moneda,  com_monedo,  com_monepe,  com_monere,  com_moneeu,  com_nucaja,  com_ubica,  com_tip,  com_desc,  com_cierre,  com_tipoperacion,  fechasct,  usuariosct,  maquinasct,  com_deposito,  com_nrocierre,  com_pagado,  com_usuariopago,  com_pcpago,  com_fechapago,  com_cierrecajanro,  com_cierrecajagennro,  com_nro_pedido,  com_empresa,  com_timbrado,  com_fin_vigencia) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_nrofact());
			ps.setString(2, comp.getCom_hora());
			ps.setInt(3, comp.getCom_usua());
			ps.setString(4, comp.getCom_movim());
			ps.setString(5, comp.getCom_fechac());
			ps.setString(6, comp.getCom_fecha());
			ps.setInt(7, comp.getCom_proveedor());
			ps.setDouble(8, comp.getCom_total());
			ps.setDouble(9, comp.getCom_totald());
			ps.setDouble(10, comp.getCom_totalp());
			ps.setDouble(11, comp.getCom_totalr());
			ps.setDouble(12, comp.getCom_totale());
			ps.setInt(13, comp.getCom_activo());
			ps.setDouble(14, comp.getCom_moneda());
			ps.setDouble(15, comp.getCom_monedo());
			ps.setDouble(16, comp.getCom_monepe());
			ps.setDouble(17, comp.getCom_monere());
			ps.setDouble(18, comp.getCom_moneeu());
			ps.setString(19, comp.getCom_nucaja());
			ps.setInt(20, comp.getCom_ubica());
			ps.setInt(21, comp.getCom_tip());
			ps.setDouble(22, comp.getCom_desc());
			ps.setInt(23, comp.getCom_cierre());
			ps.setInt(24, comp.getCom_tipoperacion());
			ps.setString(25, comp.getFechasct());
			ps.setInt(26, comp.getUsuariosct());
			ps.setString(27, comp.getMaquinasct());
			ps.setInt(28, comp.getCom_deposito());
			ps.setInt(29, comp.getCom_nrocierre());
			ps.setInt(30, comp.getCom_pagado());
			ps.setInt(31, comp.getCom_usuariopago());
			ps.setObject(32, comp.getCom_pcpago());
			ps.setString(33, comp.getCom_fechapago());
			ps.setInt(34, comp.getCom_cierrecajanro());
			ps.setInt(35, comp.getCom_cierrecajagennro());
			ps.setInt(36, comp.getCom_nro_pedido());
			ps.setInt(37, comp.getCom_empresa());
			ps.setString(38, comp.getCom_timbrado());
			ps.setString(39, comp.getCom_fin_vigencia());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compracon_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compracon_cab comp) {
		String q = " update compracon_cab set  com_nrofact=?,  com_hora=?,  com_usua=?,  com_movim=?,  com_fechac=?,  com_fecha=?,  com_proveedor=?,  com_total=?,  com_totald=?,  com_totalp=?,  com_totalr=?,  com_totale=?,  com_activo=?,  com_moneda=?,  com_monedo=?,  com_monepe=?,  com_monere=?,  com_moneeu=?,  com_nucaja=?,  com_ubica=?,  com_tip=?,  com_desc=?,  com_cierre=?,  com_tipoperacion=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  com_deposito=?,  com_nrocierre=?,  com_pagado=?,  com_usuariopago=?,  com_pcpago=?,  com_fechapago=?,  com_cierrecajanro=?,  com_cierrecajagennro=?,  com_nro_pedido=?,  com_empresa=?,  com_timbrado=?,  com_fin_vigencia=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_nrofact());
			ps.setString(2, comp.getCom_hora());
			ps.setInt(3, comp.getCom_usua());
			ps.setString(4, comp.getCom_movim());
			ps.setString(5, comp.getCom_fechac());
			ps.setString(6, comp.getCom_fecha());
			ps.setInt(7, comp.getCom_proveedor());
			ps.setDouble(8, comp.getCom_total());
			ps.setDouble(9, comp.getCom_totald());
			ps.setDouble(10, comp.getCom_totalp());
			ps.setDouble(11, comp.getCom_totalr());
			ps.setDouble(12, comp.getCom_totale());
			ps.setInt(13, comp.getCom_activo());
			ps.setDouble(14, comp.getCom_moneda());
			ps.setDouble(15, comp.getCom_monedo());
			ps.setDouble(16, comp.getCom_monepe());
			ps.setDouble(17, comp.getCom_monere());
			ps.setDouble(18, comp.getCom_moneeu());
			ps.setString(19, comp.getCom_nucaja());
			ps.setInt(20, comp.getCom_ubica());
			ps.setInt(21, comp.getCom_tip());
			ps.setDouble(22, comp.getCom_desc());
			ps.setInt(23, comp.getCom_cierre());
			ps.setInt(24, comp.getCom_tipoperacion());
			ps.setString(25, comp.getFechasct());
			ps.setInt(26, comp.getUsuariosct());
			ps.setString(27, comp.getMaquinasct());
			ps.setInt(28, comp.getCom_deposito());
			ps.setInt(29, comp.getCom_nrocierre());
			ps.setInt(30, comp.getCom_pagado());
			ps.setInt(31, comp.getCom_usuariopago());
			ps.setObject(32, comp.getCom_pcpago());
			ps.setString(33, comp.getCom_fechapago());
			ps.setInt(34, comp.getCom_cierrecajanro());
			ps.setInt(35, comp.getCom_cierrecajagennro());
			ps.setInt(36, comp.getCom_nro_pedido());
			ps.setInt(37, comp.getCom_empresa());
			ps.setString(38, comp.getCom_timbrado());
			ps.setString(39, comp.getCom_fin_vigencia());
			ps.setInt(40, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compracon_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compracon_cab comp) {
		String q = " delete from compracon_cab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compracon_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}