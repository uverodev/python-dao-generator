package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ventacab_temp;
import vista.*;

public class Ventacab_tempDAO extends Thread {
	private Ventacab_temp vent;
	public ArrayList<Ventacab_temp> resultadoVentacab_temp;

	@Override
	public void run() {
		try{
			actualizarVentacab_temp("");
		} catch (Exception e) {
			System.out.println("Error al generar Ventacab_temp");
		}
		yield();
	}

	public void actualizarVentacab_temp(String condicion) {
		resultadoVentacab_temp = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ventacab_temp " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vent = new Ventacab_temp(
						rs.getInt("vent_nro"),
						rs.getString("vent_fecha"),
						rs.getString("vent_fechacarga"),
						rs.getInt("vent_usuario"),
						rs.getString("vent_hora"),
						rs.getString("vent_cliente"),
						rs.getInt("vent_tipo"),
						rs.getDouble("vent_total"),
						rs.getDouble("vent_cdolar"),
						rs.getDouble("vent_creal"),
						rs.getDouble("vent_cpeso"),
						rs.getDouble("vent_ceuro"),
						rs.getDouble("vent_vendedor"),
						rs.getDouble("vent_moneda"),
						rs.getDouble("vent_descuento"),
						rs.getDouble("vent_totalexe"),
						rs.getDouble("vent_totaliva5"),
						rs.getDouble("vent_totaliva10"),
						rs.getDouble("vent_totalitem"),
						rs.getDouble("vent_totaliva"),
						rs.getInt("vent_cierre"),
						rs.getInt("vent_regturista"),
						rs.getInt("vent_borrado"),
						rs.getInt("vent_confirmado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("vent_nrocierre"),
						rs.getDouble("vent_totanterior"),
						rs.getInt("vent_liquidacion"),
						rs.getInt("vent_nroliquidacion"),
						rs.getInt("vent_deposito"),
						rs.getInt("vent_implegal"),
						rs.getDouble("vent_saldoanterior"),
						rs.getInt("vent_transentregado"),
						rs.getInt("vent_transporte"),
						rs.getInt("vent_factura"),
						rs.getInt("vent_cierrecajagennro"),
						rs.getInt("vent_guia"),
						rs.getDouble("vent_montoguia"),
						rs.getInt("vent_mayorista"),
						rs.getObject("vent_numerofactura"),
						rs.getInt("vent_local"),
						rs.getObject("vent_numerocontrato"),
						rs.getInt("vent_tipofactura")
			);
			arr.add(vent);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ventacab_temp vent) {
		String q = " insert into ventacab_temp( vent_fecha,  vent_fechacarga,  vent_usuario,  vent_hora,  vent_cliente,  vent_tipo,  vent_total,  vent_cdolar,  vent_creal,  vent_cpeso,  vent_ceuro,  vent_vendedor,  vent_moneda,  vent_descuento,  vent_totalexe,  vent_totaliva5,  vent_totaliva10,  vent_totalitem,  vent_totaliva,  vent_cierre,  vent_regturista,  vent_borrado,  vent_confirmado,  fechasct,  usuariosct,  maquinasct,  vent_nrocierre,  vent_totanterior,  vent_liquidacion,  vent_nroliquidacion,  vent_deposito,  vent_implegal,  vent_saldoanterior,  vent_transentregado,  vent_transporte,  vent_factura,  vent_cierrecajagennro,  vent_guia,  vent_montoguia,  vent_mayorista,  vent_numerofactura,  vent_local,  vent_numerocontrato,  vent_tipofactura) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getVent_fecha());
			ps.setString(2, vent.getVent_fechacarga());
			ps.setInt(3, vent.getVent_usuario());
			ps.setString(4, vent.getVent_hora());
			ps.setString(5, vent.getVent_cliente());
			ps.setInt(6, vent.getVent_tipo());
			ps.setDouble(7, vent.getVent_total());
			ps.setDouble(8, vent.getVent_cdolar());
			ps.setDouble(9, vent.getVent_creal());
			ps.setDouble(10, vent.getVent_cpeso());
			ps.setDouble(11, vent.getVent_ceuro());
			ps.setDouble(12, vent.getVent_vendedor());
			ps.setDouble(13, vent.getVent_moneda());
			ps.setDouble(14, vent.getVent_descuento());
			ps.setDouble(15, vent.getVent_totalexe());
			ps.setDouble(16, vent.getVent_totaliva5());
			ps.setDouble(17, vent.getVent_totaliva10());
			ps.setDouble(18, vent.getVent_totalitem());
			ps.setDouble(19, vent.getVent_totaliva());
			ps.setInt(20, vent.getVent_cierre());
			ps.setInt(21, vent.getVent_regturista());
			ps.setInt(22, vent.getVent_borrado());
			ps.setInt(23, vent.getVent_confirmado());
			ps.setString(24, vent.getFechasct());
			ps.setInt(25, vent.getUsuariosct());
			ps.setString(26, vent.getMaquinasct());
			ps.setInt(27, vent.getVent_nrocierre());
			ps.setDouble(28, vent.getVent_totanterior());
			ps.setInt(29, vent.getVent_liquidacion());
			ps.setInt(30, vent.getVent_nroliquidacion());
			ps.setInt(31, vent.getVent_deposito());
			ps.setInt(32, vent.getVent_implegal());
			ps.setDouble(33, vent.getVent_saldoanterior());
			ps.setInt(34, vent.getVent_transentregado());
			ps.setInt(35, vent.getVent_transporte());
			ps.setInt(36, vent.getVent_factura());
			ps.setInt(37, vent.getVent_cierrecajagennro());
			ps.setInt(38, vent.getVent_guia());
			ps.setDouble(39, vent.getVent_montoguia());
			ps.setInt(40, vent.getVent_mayorista());
			ps.setObject(41, vent.getVent_numerofactura());
			ps.setInt(42, vent.getVent_local());
			ps.setObject(43, vent.getVent_numerocontrato());
			ps.setInt(44, vent.getVent_tipofactura());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ventacab_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ventacab_temp vent) {
		String q = " update ventacab_temp set  vent_fecha=?,  vent_fechacarga=?,  vent_usuario=?,  vent_hora=?,  vent_cliente=?,  vent_tipo=?,  vent_total=?,  vent_cdolar=?,  vent_creal=?,  vent_cpeso=?,  vent_ceuro=?,  vent_vendedor=?,  vent_moneda=?,  vent_descuento=?,  vent_totalexe=?,  vent_totaliva5=?,  vent_totaliva10=?,  vent_totalitem=?,  vent_totaliva=?,  vent_cierre=?,  vent_regturista=?,  vent_borrado=?,  vent_confirmado=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  vent_nrocierre=?,  vent_totanterior=?,  vent_liquidacion=?,  vent_nroliquidacion=?,  vent_deposito=?,  vent_implegal=?,  vent_saldoanterior=?,  vent_transentregado=?,  vent_transporte=?,  vent_factura=?,  vent_cierrecajagennro=?,  vent_guia=?,  vent_montoguia=?,  vent_mayorista=?,  vent_numerofactura=?,  vent_local=?,  vent_numerocontrato=?,  vent_tipofactura=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vent.getVent_fecha());
			ps.setString(2, vent.getVent_fechacarga());
			ps.setInt(3, vent.getVent_usuario());
			ps.setString(4, vent.getVent_hora());
			ps.setString(5, vent.getVent_cliente());
			ps.setInt(6, vent.getVent_tipo());
			ps.setDouble(7, vent.getVent_total());
			ps.setDouble(8, vent.getVent_cdolar());
			ps.setDouble(9, vent.getVent_creal());
			ps.setDouble(10, vent.getVent_cpeso());
			ps.setDouble(11, vent.getVent_ceuro());
			ps.setDouble(12, vent.getVent_vendedor());
			ps.setDouble(13, vent.getVent_moneda());
			ps.setDouble(14, vent.getVent_descuento());
			ps.setDouble(15, vent.getVent_totalexe());
			ps.setDouble(16, vent.getVent_totaliva5());
			ps.setDouble(17, vent.getVent_totaliva10());
			ps.setDouble(18, vent.getVent_totalitem());
			ps.setDouble(19, vent.getVent_totaliva());
			ps.setInt(20, vent.getVent_cierre());
			ps.setInt(21, vent.getVent_regturista());
			ps.setInt(22, vent.getVent_borrado());
			ps.setInt(23, vent.getVent_confirmado());
			ps.setString(24, vent.getFechasct());
			ps.setInt(25, vent.getUsuariosct());
			ps.setString(26, vent.getMaquinasct());
			ps.setInt(27, vent.getVent_nrocierre());
			ps.setDouble(28, vent.getVent_totanterior());
			ps.setInt(29, vent.getVent_liquidacion());
			ps.setInt(30, vent.getVent_nroliquidacion());
			ps.setInt(31, vent.getVent_deposito());
			ps.setInt(32, vent.getVent_implegal());
			ps.setDouble(33, vent.getVent_saldoanterior());
			ps.setInt(34, vent.getVent_transentregado());
			ps.setInt(35, vent.getVent_transporte());
			ps.setInt(36, vent.getVent_factura());
			ps.setInt(37, vent.getVent_cierrecajagennro());
			ps.setInt(38, vent.getVent_guia());
			ps.setDouble(39, vent.getVent_montoguia());
			ps.setInt(40, vent.getVent_mayorista());
			ps.setObject(41, vent.getVent_numerofactura());
			ps.setInt(42, vent.getVent_local());
			ps.setObject(43, vent.getVent_numerocontrato());
			ps.setInt(44, vent.getVent_tipofactura());
			ps.setInt(45, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ventacab_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ventacab_temp vent) {
		String q = " delete from ventacab_temp where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vent.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ventacab_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}