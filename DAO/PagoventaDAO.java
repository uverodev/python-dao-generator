package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pagoventa;
import vista.*;

public class PagoventaDAO extends Thread {
	private Pagoventa pago;
	public ArrayList<Pagoventa> resultadoPagoventa;

	@Override
	public void run() {
		try{
			actualizarPagoventa("");
		} catch (Exception e) {
			System.out.println("Error al generar Pagoventa");
		}
		yield();
	}

	public void actualizarPagoventa(String condicion) {
		resultadoPagoventa = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pagoventa " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pago = new Pagoventa(
						rs.getInt("pven_nro"),
						rs.getInt("pven_numventa"),
						rs.getInt("pven_tipventa"),
						rs.getString("pven_fecha"),
						rs.getInt("pven_usuario"),
						rs.getString("pven_hora"),
						rs.getDouble("pven_exoneracion"),
						rs.getInt("pven_tiptcre"),
						rs.getString("pven_numtcre"),
						rs.getInt("pven_cobrador"),
						rs.getInt("pven_tiptdeb"),
						rs.getString("pven_numtdeb"),
						rs.getString("pven_cliente"),
						rs.getInt("pven_vendedor"),
						rs.getDouble("pven_totalgs"),
						rs.getDouble("pven_totald"),
						rs.getDouble("pven_totalr"),
						rs.getDouble("pven_totalp"),
						rs.getDouble("pven_totale"),
						rs.getDouble("pven_montorgs"),
						rs.getDouble("pven_montord"),
						rs.getDouble("pven_montorr"),
						rs.getDouble("pven_montorp"),
						rs.getDouble("pven_montore"),
						rs.getDouble("pven_vuelto"),
						rs.getInt("pven_moneda"),
						rs.getDouble("pven_cdolar"),
						rs.getDouble("pven_creal"),
						rs.getDouble("pven_cpeso"),
						rs.getDouble("pven_ceuro"),
						rs.getInt("pven_efectivo"),
						rs.getDouble("pven_totalefectivo"),
						rs.getDouble("pven_toteguarani"),
						rs.getDouble("pven_totedolar"),
						rs.getDouble("pven_totereal"),
						rs.getDouble("pven_totepeso"),
						rs.getDouble("pven_toteeuro"),
						rs.getInt("pven_cheque"),
						rs.getDouble("pven_totalcheque"),
						rs.getDouble("pven_totcguaranies"),
						rs.getDouble("pven_totcdolar"),
						rs.getDouble("pven_totcreal"),
						rs.getDouble("pven_totcpeso"),
						rs.getDouble("pven_totceuro"),
						rs.getInt("pven_tcredito"),
						rs.getDouble("pven_totaltcredito"),
						rs.getDouble("pven_tottcguarani"),
						rs.getDouble("pven_tottcdolar"),
						rs.getDouble("pven_tottcreal"),
						rs.getDouble("pven_tottcpeso"),
						rs.getDouble("pven_tottceuro"),
						rs.getInt("pven_tdebito"),
						rs.getDouble("pven_totaltdebito"),
						rs.getDouble("pven_tottdguarani"),
						rs.getDouble("pven_tottddolar"),
						rs.getDouble("pven_tottdreal"),
						rs.getDouble("pven_tottdpeso"),
						rs.getDouble("pven_tottdeuro"),
						rs.getInt("pven_nota"),
						rs.getDouble("pven_totalnota"),
						rs.getDouble("pven_totnguarani"),
						rs.getDouble("pven_totndolar"),
						rs.getDouble("pven_totnreal"),
						rs.getDouble("pven_totnpeso"),
						rs.getDouble("pven_totneuro"),
						rs.getString("pven_caja"),
						rs.getDouble("pven_totvueguarani"),
						rs.getDouble("pven_totvuedolar"),
						rs.getDouble("pven_totvuereal"),
						rs.getDouble("pven_totvuepeso"),
						rs.getDouble("pven_totvueeuro"),
						rs.getInt("pven_cierre"),
						rs.getInt("pven_borrado"),
						rs.getInt("pven_nrosuboperacion"),
						rs.getInt("pven_nrorecibo"),
						rs.getString("pven_numdeposito"),
						rs.getInt("pven_banco"),
						rs.getDouble("pven_totdbeuro"),
						rs.getDouble("pven_totdbreal"),
						rs.getDouble("pven_totdbpeso"),
						rs.getDouble("pven_totdbdolar"),
						rs.getDouble("pven_totdbguarani"),
						rs.getDouble("pven_totaldepbancario"),
						rs.getInt("pven_depbancario"),
						rs.getString("pven_numgiro"),
						rs.getString("pven_giromedio"),
						rs.getDouble("pven_totgeuro"),
						rs.getDouble("pven_totgreal"),
						rs.getDouble("pven_totgpeso"),
						rs.getDouble("pven_totgdolar"),
						rs.getDouble("pven_totgguarani"),
						rs.getDouble("pven_totalgiro"),
						rs.getInt("pven_giro"),
						rs.getDouble("pven_interes"),
						rs.getInt("pven_deposito"),
						rs.getInt("pag_nrocierre"),
						rs.getInt("pven_nroliquidacion"),
						rs.getInt("pven_liquidacion"),
						rs.getInt("pven_cierrecajagennro"),
						rs.getObject("pven_numerorecibointerno")
			);
			arr.add(pago);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pagoventa pago) {
		String q = " insert into pagoventa( pven_numventa,  pven_tipventa,  pven_fecha,  pven_usuario,  pven_hora,  pven_exoneracion,  pven_tiptcre,  pven_numtcre,  pven_cobrador,  pven_tiptdeb,  pven_numtdeb,  pven_cliente,  pven_vendedor,  pven_totalgs,  pven_totald,  pven_totalr,  pven_totalp,  pven_totale,  pven_montorgs,  pven_montord,  pven_montorr,  pven_montorp,  pven_montore,  pven_vuelto,  pven_moneda,  pven_cdolar,  pven_creal,  pven_cpeso,  pven_ceuro,  pven_efectivo,  pven_totalefectivo,  pven_toteguarani,  pven_totedolar,  pven_totereal,  pven_totepeso,  pven_toteeuro,  pven_cheque,  pven_totalcheque,  pven_totcguaranies,  pven_totcdolar,  pven_totcreal,  pven_totcpeso,  pven_totceuro,  pven_tcredito,  pven_totaltcredito,  pven_tottcguarani,  pven_tottcdolar,  pven_tottcreal,  pven_tottcpeso,  pven_tottceuro,  pven_tdebito,  pven_totaltdebito,  pven_tottdguarani,  pven_tottddolar,  pven_tottdreal,  pven_tottdpeso,  pven_tottdeuro,  pven_nota,  pven_totalnota,  pven_totnguarani,  pven_totndolar,  pven_totnreal,  pven_totnpeso,  pven_totneuro,  pven_caja,  pven_totvueguarani,  pven_totvuedolar,  pven_totvuereal,  pven_totvuepeso,  pven_totvueeuro,  pven_cierre,  pven_borrado,  pven_nrosuboperacion,  pven_nrorecibo,  pven_numdeposito,  pven_banco,  pven_totdbeuro,  pven_totdbreal,  pven_totdbpeso,  pven_totdbdolar,  pven_totdbguarani,  pven_totaldepbancario,  pven_depbancario,  pven_numgiro,  pven_giromedio,  pven_totgeuro,  pven_totgreal,  pven_totgpeso,  pven_totgdolar,  pven_totgguarani,  pven_totalgiro,  pven_giro,  pven_interes,  pven_deposito,  pag_nrocierre,  pven_nroliquidacion,  pven_liquidacion,  pven_cierrecajagennro,  pven_numerorecibointerno) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getPven_numventa());
			ps.setInt(2, pago.getPven_tipventa());
			ps.setString(3, pago.getPven_fecha());
			ps.setInt(4, pago.getPven_usuario());
			ps.setString(5, pago.getPven_hora());
			ps.setDouble(6, pago.getPven_exoneracion());
			ps.setInt(7, pago.getPven_tiptcre());
			ps.setString(8, pago.getPven_numtcre());
			ps.setInt(9, pago.getPven_cobrador());
			ps.setInt(10, pago.getPven_tiptdeb());
			ps.setString(11, pago.getPven_numtdeb());
			ps.setString(12, pago.getPven_cliente());
			ps.setInt(13, pago.getPven_vendedor());
			ps.setDouble(14, pago.getPven_totalgs());
			ps.setDouble(15, pago.getPven_totald());
			ps.setDouble(16, pago.getPven_totalr());
			ps.setDouble(17, pago.getPven_totalp());
			ps.setDouble(18, pago.getPven_totale());
			ps.setDouble(19, pago.getPven_montorgs());
			ps.setDouble(20, pago.getPven_montord());
			ps.setDouble(21, pago.getPven_montorr());
			ps.setDouble(22, pago.getPven_montorp());
			ps.setDouble(23, pago.getPven_montore());
			ps.setDouble(24, pago.getPven_vuelto());
			ps.setInt(25, pago.getPven_moneda());
			ps.setDouble(26, pago.getPven_cdolar());
			ps.setDouble(27, pago.getPven_creal());
			ps.setDouble(28, pago.getPven_cpeso());
			ps.setDouble(29, pago.getPven_ceuro());
			ps.setInt(30, pago.getPven_efectivo());
			ps.setDouble(31, pago.getPven_totalefectivo());
			ps.setDouble(32, pago.getPven_toteguarani());
			ps.setDouble(33, pago.getPven_totedolar());
			ps.setDouble(34, pago.getPven_totereal());
			ps.setDouble(35, pago.getPven_totepeso());
			ps.setDouble(36, pago.getPven_toteeuro());
			ps.setInt(37, pago.getPven_cheque());
			ps.setDouble(38, pago.getPven_totalcheque());
			ps.setDouble(39, pago.getPven_totcguaranies());
			ps.setDouble(40, pago.getPven_totcdolar());
			ps.setDouble(41, pago.getPven_totcreal());
			ps.setDouble(42, pago.getPven_totcpeso());
			ps.setDouble(43, pago.getPven_totceuro());
			ps.setInt(44, pago.getPven_tcredito());
			ps.setDouble(45, pago.getPven_totaltcredito());
			ps.setDouble(46, pago.getPven_tottcguarani());
			ps.setDouble(47, pago.getPven_tottcdolar());
			ps.setDouble(48, pago.getPven_tottcreal());
			ps.setDouble(49, pago.getPven_tottcpeso());
			ps.setDouble(50, pago.getPven_tottceuro());
			ps.setInt(51, pago.getPven_tdebito());
			ps.setDouble(52, pago.getPven_totaltdebito());
			ps.setDouble(53, pago.getPven_tottdguarani());
			ps.setDouble(54, pago.getPven_tottddolar());
			ps.setDouble(55, pago.getPven_tottdreal());
			ps.setDouble(56, pago.getPven_tottdpeso());
			ps.setDouble(57, pago.getPven_tottdeuro());
			ps.setInt(58, pago.getPven_nota());
			ps.setDouble(59, pago.getPven_totalnota());
			ps.setDouble(60, pago.getPven_totnguarani());
			ps.setDouble(61, pago.getPven_totndolar());
			ps.setDouble(62, pago.getPven_totnreal());
			ps.setDouble(63, pago.getPven_totnpeso());
			ps.setDouble(64, pago.getPven_totneuro());
			ps.setString(65, pago.getPven_caja());
			ps.setDouble(66, pago.getPven_totvueguarani());
			ps.setDouble(67, pago.getPven_totvuedolar());
			ps.setDouble(68, pago.getPven_totvuereal());
			ps.setDouble(69, pago.getPven_totvuepeso());
			ps.setDouble(70, pago.getPven_totvueeuro());
			ps.setInt(71, pago.getPven_cierre());
			ps.setInt(72, pago.getPven_borrado());
			ps.setInt(73, pago.getPven_nrosuboperacion());
			ps.setInt(74, pago.getPven_nrorecibo());
			ps.setString(75, pago.getPven_numdeposito());
			ps.setInt(76, pago.getPven_banco());
			ps.setDouble(77, pago.getPven_totdbeuro());
			ps.setDouble(78, pago.getPven_totdbreal());
			ps.setDouble(79, pago.getPven_totdbpeso());
			ps.setDouble(80, pago.getPven_totdbdolar());
			ps.setDouble(81, pago.getPven_totdbguarani());
			ps.setDouble(82, pago.getPven_totaldepbancario());
			ps.setInt(83, pago.getPven_depbancario());
			ps.setString(84, pago.getPven_numgiro());
			ps.setString(85, pago.getPven_giromedio());
			ps.setDouble(86, pago.getPven_totgeuro());
			ps.setDouble(87, pago.getPven_totgreal());
			ps.setDouble(88, pago.getPven_totgpeso());
			ps.setDouble(89, pago.getPven_totgdolar());
			ps.setDouble(90, pago.getPven_totgguarani());
			ps.setDouble(91, pago.getPven_totalgiro());
			ps.setInt(92, pago.getPven_giro());
			ps.setDouble(93, pago.getPven_interes());
			ps.setInt(94, pago.getPven_deposito());
			ps.setInt(95, pago.getPag_nrocierre());
			ps.setInt(96, pago.getPven_nroliquidacion());
			ps.setInt(97, pago.getPven_liquidacion());
			ps.setInt(98, pago.getPven_cierrecajagennro());
			ps.setObject(99, pago.getPven_numerorecibointerno());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pagoventa", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pagoventa pago) {
		String q = " update pagoventa set  pven_numventa=?,  pven_tipventa=?,  pven_fecha=?,  pven_usuario=?,  pven_hora=?,  pven_exoneracion=?,  pven_tiptcre=?,  pven_numtcre=?,  pven_cobrador=?,  pven_tiptdeb=?,  pven_numtdeb=?,  pven_cliente=?,  pven_vendedor=?,  pven_totalgs=?,  pven_totald=?,  pven_totalr=?,  pven_totalp=?,  pven_totale=?,  pven_montorgs=?,  pven_montord=?,  pven_montorr=?,  pven_montorp=?,  pven_montore=?,  pven_vuelto=?,  pven_moneda=?,  pven_cdolar=?,  pven_creal=?,  pven_cpeso=?,  pven_ceuro=?,  pven_efectivo=?,  pven_totalefectivo=?,  pven_toteguarani=?,  pven_totedolar=?,  pven_totereal=?,  pven_totepeso=?,  pven_toteeuro=?,  pven_cheque=?,  pven_totalcheque=?,  pven_totcguaranies=?,  pven_totcdolar=?,  pven_totcreal=?,  pven_totcpeso=?,  pven_totceuro=?,  pven_tcredito=?,  pven_totaltcredito=?,  pven_tottcguarani=?,  pven_tottcdolar=?,  pven_tottcreal=?,  pven_tottcpeso=?,  pven_tottceuro=?,  pven_tdebito=?,  pven_totaltdebito=?,  pven_tottdguarani=?,  pven_tottddolar=?,  pven_tottdreal=?,  pven_tottdpeso=?,  pven_tottdeuro=?,  pven_nota=?,  pven_totalnota=?,  pven_totnguarani=?,  pven_totndolar=?,  pven_totnreal=?,  pven_totnpeso=?,  pven_totneuro=?,  pven_caja=?,  pven_totvueguarani=?,  pven_totvuedolar=?,  pven_totvuereal=?,  pven_totvuepeso=?,  pven_totvueeuro=?,  pven_cierre=?,  pven_borrado=?,  pven_nrosuboperacion=?,  pven_nrorecibo=?,  pven_numdeposito=?,  pven_banco=?,  pven_totdbeuro=?,  pven_totdbreal=?,  pven_totdbpeso=?,  pven_totdbdolar=?,  pven_totdbguarani=?,  pven_totaldepbancario=?,  pven_depbancario=?,  pven_numgiro=?,  pven_giromedio=?,  pven_totgeuro=?,  pven_totgreal=?,  pven_totgpeso=?,  pven_totgdolar=?,  pven_totgguarani=?,  pven_totalgiro=?,  pven_giro=?,  pven_interes=?,  pven_deposito=?,  pag_nrocierre=?,  pven_nroliquidacion=?,  pven_liquidacion=?,  pven_cierrecajagennro=?,  pven_numerorecibointerno=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getPven_numventa());
			ps.setInt(2, pago.getPven_tipventa());
			ps.setString(3, pago.getPven_fecha());
			ps.setInt(4, pago.getPven_usuario());
			ps.setString(5, pago.getPven_hora());
			ps.setDouble(6, pago.getPven_exoneracion());
			ps.setInt(7, pago.getPven_tiptcre());
			ps.setString(8, pago.getPven_numtcre());
			ps.setInt(9, pago.getPven_cobrador());
			ps.setInt(10, pago.getPven_tiptdeb());
			ps.setString(11, pago.getPven_numtdeb());
			ps.setString(12, pago.getPven_cliente());
			ps.setInt(13, pago.getPven_vendedor());
			ps.setDouble(14, pago.getPven_totalgs());
			ps.setDouble(15, pago.getPven_totald());
			ps.setDouble(16, pago.getPven_totalr());
			ps.setDouble(17, pago.getPven_totalp());
			ps.setDouble(18, pago.getPven_totale());
			ps.setDouble(19, pago.getPven_montorgs());
			ps.setDouble(20, pago.getPven_montord());
			ps.setDouble(21, pago.getPven_montorr());
			ps.setDouble(22, pago.getPven_montorp());
			ps.setDouble(23, pago.getPven_montore());
			ps.setDouble(24, pago.getPven_vuelto());
			ps.setInt(25, pago.getPven_moneda());
			ps.setDouble(26, pago.getPven_cdolar());
			ps.setDouble(27, pago.getPven_creal());
			ps.setDouble(28, pago.getPven_cpeso());
			ps.setDouble(29, pago.getPven_ceuro());
			ps.setInt(30, pago.getPven_efectivo());
			ps.setDouble(31, pago.getPven_totalefectivo());
			ps.setDouble(32, pago.getPven_toteguarani());
			ps.setDouble(33, pago.getPven_totedolar());
			ps.setDouble(34, pago.getPven_totereal());
			ps.setDouble(35, pago.getPven_totepeso());
			ps.setDouble(36, pago.getPven_toteeuro());
			ps.setInt(37, pago.getPven_cheque());
			ps.setDouble(38, pago.getPven_totalcheque());
			ps.setDouble(39, pago.getPven_totcguaranies());
			ps.setDouble(40, pago.getPven_totcdolar());
			ps.setDouble(41, pago.getPven_totcreal());
			ps.setDouble(42, pago.getPven_totcpeso());
			ps.setDouble(43, pago.getPven_totceuro());
			ps.setInt(44, pago.getPven_tcredito());
			ps.setDouble(45, pago.getPven_totaltcredito());
			ps.setDouble(46, pago.getPven_tottcguarani());
			ps.setDouble(47, pago.getPven_tottcdolar());
			ps.setDouble(48, pago.getPven_tottcreal());
			ps.setDouble(49, pago.getPven_tottcpeso());
			ps.setDouble(50, pago.getPven_tottceuro());
			ps.setInt(51, pago.getPven_tdebito());
			ps.setDouble(52, pago.getPven_totaltdebito());
			ps.setDouble(53, pago.getPven_tottdguarani());
			ps.setDouble(54, pago.getPven_tottddolar());
			ps.setDouble(55, pago.getPven_tottdreal());
			ps.setDouble(56, pago.getPven_tottdpeso());
			ps.setDouble(57, pago.getPven_tottdeuro());
			ps.setInt(58, pago.getPven_nota());
			ps.setDouble(59, pago.getPven_totalnota());
			ps.setDouble(60, pago.getPven_totnguarani());
			ps.setDouble(61, pago.getPven_totndolar());
			ps.setDouble(62, pago.getPven_totnreal());
			ps.setDouble(63, pago.getPven_totnpeso());
			ps.setDouble(64, pago.getPven_totneuro());
			ps.setString(65, pago.getPven_caja());
			ps.setDouble(66, pago.getPven_totvueguarani());
			ps.setDouble(67, pago.getPven_totvuedolar());
			ps.setDouble(68, pago.getPven_totvuereal());
			ps.setDouble(69, pago.getPven_totvuepeso());
			ps.setDouble(70, pago.getPven_totvueeuro());
			ps.setInt(71, pago.getPven_cierre());
			ps.setInt(72, pago.getPven_borrado());
			ps.setInt(73, pago.getPven_nrosuboperacion());
			ps.setInt(74, pago.getPven_nrorecibo());
			ps.setString(75, pago.getPven_numdeposito());
			ps.setInt(76, pago.getPven_banco());
			ps.setDouble(77, pago.getPven_totdbeuro());
			ps.setDouble(78, pago.getPven_totdbreal());
			ps.setDouble(79, pago.getPven_totdbpeso());
			ps.setDouble(80, pago.getPven_totdbdolar());
			ps.setDouble(81, pago.getPven_totdbguarani());
			ps.setDouble(82, pago.getPven_totaldepbancario());
			ps.setInt(83, pago.getPven_depbancario());
			ps.setString(84, pago.getPven_numgiro());
			ps.setString(85, pago.getPven_giromedio());
			ps.setDouble(86, pago.getPven_totgeuro());
			ps.setDouble(87, pago.getPven_totgreal());
			ps.setDouble(88, pago.getPven_totgpeso());
			ps.setDouble(89, pago.getPven_totgdolar());
			ps.setDouble(90, pago.getPven_totgguarani());
			ps.setDouble(91, pago.getPven_totalgiro());
			ps.setInt(92, pago.getPven_giro());
			ps.setDouble(93, pago.getPven_interes());
			ps.setInt(94, pago.getPven_deposito());
			ps.setInt(95, pago.getPag_nrocierre());
			ps.setInt(96, pago.getPven_nroliquidacion());
			ps.setInt(97, pago.getPven_liquidacion());
			ps.setInt(98, pago.getPven_cierrecajagennro());
			ps.setObject(99, pago.getPven_numerorecibointerno());
			ps.setInt(100, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pagoventa", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pagoventa pago) {
		String q = " delete from pagoventa where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pagoventa", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}