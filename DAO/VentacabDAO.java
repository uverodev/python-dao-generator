package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventacab;
import vista.*;

public class VentacabDAO extends Thread {
	private Ventacab vent;
	public ArrayList<Ventacab> resultadoVentacab;

	@Override
	public void run() {
		try{
			actualizarVentacab("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventacab");
		}
		yield();
	}

	public void actualizarVentacab(String condicion) {
		resultadoVentacab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventacab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventacab(
						rs.getInt("ven_nro"),
						rs.getString("ven_fecha"),
						rs.getString("ven_fechacarga"),
						rs.getInt("ven_usuario"),
						rs.getString("ven_hora"),
						rs.getString("ven_cliente"),
						rs.getInt("ven_tipo"),
						rs.getDouble("ven_total"),
						rs.getDouble("ven_cdolar"),
						rs.getDouble("ven_creal"),
						rs.getDouble("ven_cpeso"),
						rs.getDouble("ven_ceuro"),
						rs.getDouble("ven_vendedor"),
						rs.getDouble("ven_moneda"),
						rs.getDouble("ven_descuento"),
						rs.getDouble("ven_totalexe"),
						rs.getDouble("ven_totaliva5"),
						rs.getDouble("ven_totaliva10"),
						rs.getDouble("ven_totalitem"),
						rs.getDouble("ven_totaliva"),
						rs.getInt("ven_cierre"),
						rs.getInt("ven_regturista"),
						rs.getInt("ven_borrado"),
						rs.getInt("ven_confirmado"),
						rs.getInt("ven_nrocierre"),
						rs.getInt("ven_factura"),
						rs.getDouble("ven_saldoanterior"),
						rs.getInt("ven_transentregado"),
						rs.getInt("ven_transporte"),
						rs.getInt("ven_implegal"),
						rs.getInt("ven_deposito"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getDouble("ven_totanterior"),
						rs.getInt("ven_liquidacion"),
						rs.getInt("ven_nroliquidacion"),
						rs.getInt("ven_cierrecajagennro"),
						rs.getInt("ven_guia"),
						rs.getDouble("ven_montoguia"),
						rs.getInt("ven_mayorista"),
						rs.getObject("ven_numerofactura"),
						rs.getInt("ven_local"),
						rs.getDouble("ven_redondeo"),
						rs.getInt("ven_nro_pedido"),
						rs.getInt("ven_cierre_accionista")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventacab vent) {
		String q = " insert into ventacab( ven_fecha,  ven_fechacarga,  ven_usuario,  ven_hora,  ven_cliente,  ven_tipo,  ven_total,  ven_cdolar,  ven_creal,  ven_cpeso,  ven_ceuro,  ven_vendedor,  ven_moneda,  ven_descuento,  ven_totalexe,  ven_totaliva5,  ven_totaliva10,  ven_totalitem,  ven_totaliva,  ven_cierre,  ven_regturista,  ven_borrado,  ven_confirmado,  ven_nrocierre,  ven_factura,  ven_saldoanterior,  ven_transentregado,  ven_transporte,  ven_implegal,  ven_deposito,  fechasct,  usuariosct,  maquinasct,  ven_totanterior,  ven_liquidacion,  ven_nroliquidacion,  ven_cierrecajagennro,  ven_guia,  ven_montoguia,  ven_mayorista,  ven_numerofactura,  ven_local,  ven_redondeo,  ven_nro_pedido,  ven_cierre_accionista) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getVen_fecha());
			ps.setString(2, vent.getVen_fechacarga());
			ps.setInt(3, vent.getVen_usuario());
			ps.setString(4, vent.getVen_hora());
			ps.setString(5, vent.getVen_cliente());
			ps.setInt(6, vent.getVen_tipo());
			ps.setDouble(7, vent.getVen_total());
			ps.setDouble(8, vent.getVen_cdolar());
			ps.setDouble(9, vent.getVen_creal());
			ps.setDouble(10, vent.getVen_cpeso());
			ps.setDouble(11, vent.getVen_ceuro());
			ps.setDouble(12, vent.getVen_vendedor());
			ps.setDouble(13, vent.getVen_moneda());
			ps.setDouble(14, vent.getVen_descuento());
			ps.setDouble(15, vent.getVen_totalexe());
			ps.setDouble(16, vent.getVen_totaliva5());
			ps.setDouble(17, vent.getVen_totaliva10());
			ps.setDouble(18, vent.getVen_totalitem());
			ps.setDouble(19, vent.getVen_totaliva());
			ps.setInt(20, vent.getVen_cierre());
			ps.setInt(21, vent.getVen_regturista());
			ps.setInt(22, vent.getVen_borrado());
			ps.setInt(23, vent.getVen_confirmado());
			ps.setInt(24, vent.getVen_nrocierre());
			ps.setInt(25, vent.getVen_factura());
			ps.setDouble(26, vent.getVen_saldoanterior());
			ps.setInt(27, vent.getVen_transentregado());
			ps.setInt(28, vent.getVen_transporte());
			ps.setInt(29, vent.getVen_implegal());
			ps.setInt(30, vent.getVen_deposito());
			ps.setString(31, vent.getFechasct());
			ps.setInt(32, vent.getUsuariosct());
			ps.setString(33, vent.getMaquinasct());
			ps.setDouble(34, vent.getVen_totanterior());
			ps.setInt(35, vent.getVen_liquidacion());
			ps.setInt(36, vent.getVen_nroliquidacion());
			ps.setInt(37, vent.getVen_cierrecajagennro());
			ps.setInt(38, vent.getVen_guia());
			ps.setDouble(39, vent.getVen_montoguia());
			ps.setInt(40, vent.getVen_mayorista());
			ps.setObject(41, vent.getVen_numerofactura());
			ps.setInt(42, vent.getVen_local());
			ps.setDouble(43, vent.getVen_redondeo());
			ps.setInt(44, vent.getVen_nro_pedido());
			ps.setInt(45, vent.getVen_cierre_accionista());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventacab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventacab vent) {
		String q = " update ventacab set  ven_fecha=?,  ven_fechacarga=?,  ven_usuario=?,  ven_hora=?,  ven_cliente=?,  ven_tipo=?,  ven_total=?,  ven_cdolar=?,  ven_creal=?,  ven_cpeso=?,  ven_ceuro=?,  ven_vendedor=?,  ven_moneda=?,  ven_descuento=?,  ven_totalexe=?,  ven_totaliva5=?,  ven_totaliva10=?,  ven_totalitem=?,  ven_totaliva=?,  ven_cierre=?,  ven_regturista=?,  ven_borrado=?,  ven_confirmado=?,  ven_nrocierre=?,  ven_factura=?,  ven_saldoanterior=?,  ven_transentregado=?,  ven_transporte=?,  ven_implegal=?,  ven_deposito=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  ven_totanterior=?,  ven_liquidacion=?,  ven_nroliquidacion=?,  ven_cierrecajagennro=?,  ven_guia=?,  ven_montoguia=?,  ven_mayorista=?,  ven_numerofactura=?,  ven_local=?,  ven_redondeo=?,  ven_nro_pedido=?,  ven_cierre_accionista=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getVen_fecha());
			ps.setString(2, vent.getVen_fechacarga());
			ps.setInt(3, vent.getVen_usuario());
			ps.setString(4, vent.getVen_hora());
			ps.setString(5, vent.getVen_cliente());
			ps.setInt(6, vent.getVen_tipo());
			ps.setDouble(7, vent.getVen_total());
			ps.setDouble(8, vent.getVen_cdolar());
			ps.setDouble(9, vent.getVen_creal());
			ps.setDouble(10, vent.getVen_cpeso());
			ps.setDouble(11, vent.getVen_ceuro());
			ps.setDouble(12, vent.getVen_vendedor());
			ps.setDouble(13, vent.getVen_moneda());
			ps.setDouble(14, vent.getVen_descuento());
			ps.setDouble(15, vent.getVen_totalexe());
			ps.setDouble(16, vent.getVen_totaliva5());
			ps.setDouble(17, vent.getVen_totaliva10());
			ps.setDouble(18, vent.getVen_totalitem());
			ps.setDouble(19, vent.getVen_totaliva());
			ps.setInt(20, vent.getVen_cierre());
			ps.setInt(21, vent.getVen_regturista());
			ps.setInt(22, vent.getVen_borrado());
			ps.setInt(23, vent.getVen_confirmado());
			ps.setInt(24, vent.getVen_nrocierre());
			ps.setInt(25, vent.getVen_factura());
			ps.setDouble(26, vent.getVen_saldoanterior());
			ps.setInt(27, vent.getVen_transentregado());
			ps.setInt(28, vent.getVen_transporte());
			ps.setInt(29, vent.getVen_implegal());
			ps.setInt(30, vent.getVen_deposito());
			ps.setString(31, vent.getFechasct());
			ps.setInt(32, vent.getUsuariosct());
			ps.setString(33, vent.getMaquinasct());
			ps.setDouble(34, vent.getVen_totanterior());
			ps.setInt(35, vent.getVen_liquidacion());
			ps.setInt(36, vent.getVen_nroliquidacion());
			ps.setInt(37, vent.getVen_cierrecajagennro());
			ps.setInt(38, vent.getVen_guia());
			ps.setDouble(39, vent.getVen_montoguia());
			ps.setInt(40, vent.getVen_mayorista());
			ps.setObject(41, vent.getVen_numerofactura());
			ps.setInt(42, vent.getVen_local());
			ps.setDouble(43, vent.getVen_redondeo());
			ps.setInt(44, vent.getVen_nro_pedido());
			ps.setInt(45, vent.getVen_cierre_accionista());
			ps.setInt(46, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventacab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventacab vent) {
		String q = " delete from ventacab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventacab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}