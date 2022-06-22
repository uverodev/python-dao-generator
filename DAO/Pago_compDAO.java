package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pago_comp;
import vista.*;

public class Pago_compDAO extends Thread {
	private Pago_comp pago;
	public ArrayList<Pago_comp> resultadoPago_comp;

	@Override
	public void run() {
		try{
			actualizarPago_comp("");
		} catch (Exception e) {
			System.out.println("Error al generar Pago_comp");
		}
		yield();
	}

	public void actualizarPago_comp(String condicion) {
		resultadoPago_comp = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pago_comp " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pago = new Pago_comp(
						rs.getInt("pag_nro"),
						rs.getInt("pag_nrocomp"),
						rs.getInt("pag_tipo"),
						rs.getString("pag_fecha"),
						rs.getString("pag_hora"),
						rs.getInt("pag_usuario"),
						rs.getString("pag_tipmovi"),
						rs.getDouble("pag_totalgs"),
						rs.getDouble("pag_totald"),
						rs.getDouble("pag_totalr"),
						rs.getDouble("pag_totalp"),
						rs.getDouble("pag_totale"),
						rs.getInt("pag_proveedor"),
						rs.getDouble("pag_montorec"),
						rs.getDouble("pag_montorecd"),
						rs.getDouble("pag_montorecr"),
						rs.getDouble("pag_montorecp"),
						rs.getDouble("pag_montorece"),
						rs.getDouble("pag_montofalt"),
						rs.getDouble("pag_vuelto"),
						rs.getDouble("pag_moneda"),
						rs.getDouble("pag_dolar"),
						rs.getDouble("pag_real"),
						rs.getDouble("pag_peso"),
						rs.getDouble("pag_euro"),
						rs.getInt("pag_efectivo"),
						rs.getDouble("pag_eguarani"),
						rs.getDouble("pag_edolar"),
						rs.getDouble("pag_ereal"),
						rs.getDouble("pag_epeso"),
						rs.getDouble("pag_eeuro"),
						rs.getInt("pag_cheque"),
						rs.getDouble("pag_cguarani"),
						rs.getDouble("pag_cdolar"),
						rs.getDouble("pag_creal"),
						rs.getDouble("pag_cpeso"),
						rs.getDouble("pag_ceuro"),
						rs.getInt("pag_tcre"),
						rs.getDouble("pag_tcguarani"),
						rs.getDouble("pag_tcdolar"),
						rs.getDouble("pag_tcreal"),
						rs.getDouble("pag_tcpeso"),
						rs.getDouble("pag_tceuro"),
						rs.getInt("pag_tdeb"),
						rs.getDouble("pag_tdguarani"),
						rs.getDouble("pag_tddolar"),
						rs.getDouble("pag_tdreal"),
						rs.getDouble("pag_tdpeso"),
						rs.getDouble("pag_tdeuro"),
						rs.getInt("pag_nota"),
						rs.getDouble("pag_nguarani"),
						rs.getDouble("pag_ndolar"),
						rs.getDouble("pag_nreal"),
						rs.getDouble("pag_npeso"),
						rs.getDouble("pag_neuro"),
						rs.getDouble("pag_exoneracion"),
						rs.getInt("pag_tiptcredito"),
						rs.getString("pag_numtcredito"),
						rs.getInt("pag_tiptdebito"),
						rs.getString("pag_numtdebito"),
						rs.getString("pag_caja"),
						rs.getDouble("pag_totvueguarani"),
						rs.getDouble("pag_totvuedolar"),
						rs.getDouble("pag_totvuereal"),
						rs.getDouble("pag_totvuepeso"),
						rs.getDouble("pag_totvueeuro"),
						rs.getInt("pag_borrado"),
						rs.getInt("pag_cierre"),
						rs.getInt("pag_nrorecibo"),
						rs.getInt("pag_deposito"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("pag_nrocierre"),
						rs.getInt("pag_cierrecajagennro"),
						rs.getObject("pag_pc")
			);
			arr.add(pago);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pago_comp pago) {
		String q = " insert into pago_comp( pag_nrocomp,  pag_tipo,  pag_fecha,  pag_hora,  pag_usuario,  pag_tipmovi,  pag_totalgs,  pag_totald,  pag_totalr,  pag_totalp,  pag_totale,  pag_proveedor,  pag_montorec,  pag_montorecd,  pag_montorecr,  pag_montorecp,  pag_montorece,  pag_montofalt,  pag_vuelto,  pag_moneda,  pag_dolar,  pag_real,  pag_peso,  pag_euro,  pag_efectivo,  pag_eguarani,  pag_edolar,  pag_ereal,  pag_epeso,  pag_eeuro,  pag_cheque,  pag_cguarani,  pag_cdolar,  pag_creal,  pag_cpeso,  pag_ceuro,  pag_tcre,  pag_tcguarani,  pag_tcdolar,  pag_tcreal,  pag_tcpeso,  pag_tceuro,  pag_tdeb,  pag_tdguarani,  pag_tddolar,  pag_tdreal,  pag_tdpeso,  pag_tdeuro,  pag_nota,  pag_nguarani,  pag_ndolar,  pag_nreal,  pag_npeso,  pag_neuro,  pag_exoneracion,  pag_tiptcredito,  pag_numtcredito,  pag_tiptdebito,  pag_numtdebito,  pag_caja,  pag_totvueguarani,  pag_totvuedolar,  pag_totvuereal,  pag_totvuepeso,  pag_totvueeuro,  pag_borrado,  pag_cierre,  pag_nrorecibo,  pag_deposito,  fechasct,  usuariosct,  maquinasct,  pag_nrocierre,  pag_cierrecajagennro,  pag_pc) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getPag_nrocomp());
			ps.setInt(2, pago.getPag_tipo());
			ps.setString(3, pago.getPag_fecha());
			ps.setString(4, pago.getPag_hora());
			ps.setInt(5, pago.getPag_usuario());
			ps.setString(6, pago.getPag_tipmovi());
			ps.setDouble(7, pago.getPag_totalgs());
			ps.setDouble(8, pago.getPag_totald());
			ps.setDouble(9, pago.getPag_totalr());
			ps.setDouble(10, pago.getPag_totalp());
			ps.setDouble(11, pago.getPag_totale());
			ps.setInt(12, pago.getPag_proveedor());
			ps.setDouble(13, pago.getPag_montorec());
			ps.setDouble(14, pago.getPag_montorecd());
			ps.setDouble(15, pago.getPag_montorecr());
			ps.setDouble(16, pago.getPag_montorecp());
			ps.setDouble(17, pago.getPag_montorece());
			ps.setDouble(18, pago.getPag_montofalt());
			ps.setDouble(19, pago.getPag_vuelto());
			ps.setDouble(20, pago.getPag_moneda());
			ps.setDouble(21, pago.getPag_dolar());
			ps.setDouble(22, pago.getPag_real());
			ps.setDouble(23, pago.getPag_peso());
			ps.setDouble(24, pago.getPag_euro());
			ps.setInt(25, pago.getPag_efectivo());
			ps.setDouble(26, pago.getPag_eguarani());
			ps.setDouble(27, pago.getPag_edolar());
			ps.setDouble(28, pago.getPag_ereal());
			ps.setDouble(29, pago.getPag_epeso());
			ps.setDouble(30, pago.getPag_eeuro());
			ps.setInt(31, pago.getPag_cheque());
			ps.setDouble(32, pago.getPag_cguarani());
			ps.setDouble(33, pago.getPag_cdolar());
			ps.setDouble(34, pago.getPag_creal());
			ps.setDouble(35, pago.getPag_cpeso());
			ps.setDouble(36, pago.getPag_ceuro());
			ps.setInt(37, pago.getPag_tcre());
			ps.setDouble(38, pago.getPag_tcguarani());
			ps.setDouble(39, pago.getPag_tcdolar());
			ps.setDouble(40, pago.getPag_tcreal());
			ps.setDouble(41, pago.getPag_tcpeso());
			ps.setDouble(42, pago.getPag_tceuro());
			ps.setInt(43, pago.getPag_tdeb());
			ps.setDouble(44, pago.getPag_tdguarani());
			ps.setDouble(45, pago.getPag_tddolar());
			ps.setDouble(46, pago.getPag_tdreal());
			ps.setDouble(47, pago.getPag_tdpeso());
			ps.setDouble(48, pago.getPag_tdeuro());
			ps.setInt(49, pago.getPag_nota());
			ps.setDouble(50, pago.getPag_nguarani());
			ps.setDouble(51, pago.getPag_ndolar());
			ps.setDouble(52, pago.getPag_nreal());
			ps.setDouble(53, pago.getPag_npeso());
			ps.setDouble(54, pago.getPag_neuro());
			ps.setDouble(55, pago.getPag_exoneracion());
			ps.setInt(56, pago.getPag_tiptcredito());
			ps.setString(57, pago.getPag_numtcredito());
			ps.setInt(58, pago.getPag_tiptdebito());
			ps.setString(59, pago.getPag_numtdebito());
			ps.setString(60, pago.getPag_caja());
			ps.setDouble(61, pago.getPag_totvueguarani());
			ps.setDouble(62, pago.getPag_totvuedolar());
			ps.setDouble(63, pago.getPag_totvuereal());
			ps.setDouble(64, pago.getPag_totvuepeso());
			ps.setDouble(65, pago.getPag_totvueeuro());
			ps.setInt(66, pago.getPag_borrado());
			ps.setInt(67, pago.getPag_cierre());
			ps.setInt(68, pago.getPag_nrorecibo());
			ps.setInt(69, pago.getPag_deposito());
			ps.setString(70, pago.getFechasct());
			ps.setInt(71, pago.getUsuariosct());
			ps.setString(72, pago.getMaquinasct());
			ps.setInt(73, pago.getPag_nrocierre());
			ps.setInt(74, pago.getPag_cierrecajagennro());
			ps.setObject(75, pago.getPag_pc());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pago_comp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pago_comp pago) {
		String q = " update pago_comp set  pag_nrocomp=?,  pag_tipo=?,  pag_fecha=?,  pag_hora=?,  pag_usuario=?,  pag_tipmovi=?,  pag_totalgs=?,  pag_totald=?,  pag_totalr=?,  pag_totalp=?,  pag_totale=?,  pag_proveedor=?,  pag_montorec=?,  pag_montorecd=?,  pag_montorecr=?,  pag_montorecp=?,  pag_montorece=?,  pag_montofalt=?,  pag_vuelto=?,  pag_moneda=?,  pag_dolar=?,  pag_real=?,  pag_peso=?,  pag_euro=?,  pag_efectivo=?,  pag_eguarani=?,  pag_edolar=?,  pag_ereal=?,  pag_epeso=?,  pag_eeuro=?,  pag_cheque=?,  pag_cguarani=?,  pag_cdolar=?,  pag_creal=?,  pag_cpeso=?,  pag_ceuro=?,  pag_tcre=?,  pag_tcguarani=?,  pag_tcdolar=?,  pag_tcreal=?,  pag_tcpeso=?,  pag_tceuro=?,  pag_tdeb=?,  pag_tdguarani=?,  pag_tddolar=?,  pag_tdreal=?,  pag_tdpeso=?,  pag_tdeuro=?,  pag_nota=?,  pag_nguarani=?,  pag_ndolar=?,  pag_nreal=?,  pag_npeso=?,  pag_neuro=?,  pag_exoneracion=?,  pag_tiptcredito=?,  pag_numtcredito=?,  pag_tiptdebito=?,  pag_numtdebito=?,  pag_caja=?,  pag_totvueguarani=?,  pag_totvuedolar=?,  pag_totvuereal=?,  pag_totvuepeso=?,  pag_totvueeuro=?,  pag_borrado=?,  pag_cierre=?,  pag_nrorecibo=?,  pag_deposito=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  pag_nrocierre=?,  pag_cierrecajagennro=?,  pag_pc=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getPag_nrocomp());
			ps.setInt(2, pago.getPag_tipo());
			ps.setString(3, pago.getPag_fecha());
			ps.setString(4, pago.getPag_hora());
			ps.setInt(5, pago.getPag_usuario());
			ps.setString(6, pago.getPag_tipmovi());
			ps.setDouble(7, pago.getPag_totalgs());
			ps.setDouble(8, pago.getPag_totald());
			ps.setDouble(9, pago.getPag_totalr());
			ps.setDouble(10, pago.getPag_totalp());
			ps.setDouble(11, pago.getPag_totale());
			ps.setInt(12, pago.getPag_proveedor());
			ps.setDouble(13, pago.getPag_montorec());
			ps.setDouble(14, pago.getPag_montorecd());
			ps.setDouble(15, pago.getPag_montorecr());
			ps.setDouble(16, pago.getPag_montorecp());
			ps.setDouble(17, pago.getPag_montorece());
			ps.setDouble(18, pago.getPag_montofalt());
			ps.setDouble(19, pago.getPag_vuelto());
			ps.setDouble(20, pago.getPag_moneda());
			ps.setDouble(21, pago.getPag_dolar());
			ps.setDouble(22, pago.getPag_real());
			ps.setDouble(23, pago.getPag_peso());
			ps.setDouble(24, pago.getPag_euro());
			ps.setInt(25, pago.getPag_efectivo());
			ps.setDouble(26, pago.getPag_eguarani());
			ps.setDouble(27, pago.getPag_edolar());
			ps.setDouble(28, pago.getPag_ereal());
			ps.setDouble(29, pago.getPag_epeso());
			ps.setDouble(30, pago.getPag_eeuro());
			ps.setInt(31, pago.getPag_cheque());
			ps.setDouble(32, pago.getPag_cguarani());
			ps.setDouble(33, pago.getPag_cdolar());
			ps.setDouble(34, pago.getPag_creal());
			ps.setDouble(35, pago.getPag_cpeso());
			ps.setDouble(36, pago.getPag_ceuro());
			ps.setInt(37, pago.getPag_tcre());
			ps.setDouble(38, pago.getPag_tcguarani());
			ps.setDouble(39, pago.getPag_tcdolar());
			ps.setDouble(40, pago.getPag_tcreal());
			ps.setDouble(41, pago.getPag_tcpeso());
			ps.setDouble(42, pago.getPag_tceuro());
			ps.setInt(43, pago.getPag_tdeb());
			ps.setDouble(44, pago.getPag_tdguarani());
			ps.setDouble(45, pago.getPag_tddolar());
			ps.setDouble(46, pago.getPag_tdreal());
			ps.setDouble(47, pago.getPag_tdpeso());
			ps.setDouble(48, pago.getPag_tdeuro());
			ps.setInt(49, pago.getPag_nota());
			ps.setDouble(50, pago.getPag_nguarani());
			ps.setDouble(51, pago.getPag_ndolar());
			ps.setDouble(52, pago.getPag_nreal());
			ps.setDouble(53, pago.getPag_npeso());
			ps.setDouble(54, pago.getPag_neuro());
			ps.setDouble(55, pago.getPag_exoneracion());
			ps.setInt(56, pago.getPag_tiptcredito());
			ps.setString(57, pago.getPag_numtcredito());
			ps.setInt(58, pago.getPag_tiptdebito());
			ps.setString(59, pago.getPag_numtdebito());
			ps.setString(60, pago.getPag_caja());
			ps.setDouble(61, pago.getPag_totvueguarani());
			ps.setDouble(62, pago.getPag_totvuedolar());
			ps.setDouble(63, pago.getPag_totvuereal());
			ps.setDouble(64, pago.getPag_totvuepeso());
			ps.setDouble(65, pago.getPag_totvueeuro());
			ps.setInt(66, pago.getPag_borrado());
			ps.setInt(67, pago.getPag_cierre());
			ps.setInt(68, pago.getPag_nrorecibo());
			ps.setInt(69, pago.getPag_deposito());
			ps.setString(70, pago.getFechasct());
			ps.setInt(71, pago.getUsuariosct());
			ps.setString(72, pago.getMaquinasct());
			ps.setInt(73, pago.getPag_nrocierre());
			ps.setInt(74, pago.getPag_cierrecajagennro());
			ps.setObject(75, pago.getPag_pc());
			ps.setInt(76, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pago_comp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pago_comp pago) {
		String q = " delete from pago_comp where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pago.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pago_comp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}