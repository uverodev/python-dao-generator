package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compracre_cab;
import vista.*;

public class Compracre_cabDAO extends Thread {
	private Compracre_cab comp;
	public ArrayList<Compracre_cab> resultadoCompracre_cab;

	@Override
	public void run() {
		try{
			actualizarCompracre_cab("");
		} catch (Exception e) {
			System.out.println("Error al generar Compracre_cab");
		}
		yield();
	}

	public void actualizarCompracre_cab(String condicion) {
		resultadoCompracre_cab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compracre_cab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compracre_cab(
						rs.getInt("com_nro"),
						rs.getString("com_hora"),
						rs.getInt("com_usua"),
						rs.getString("com_movim"),
						rs.getString("com_fechac"),
						rs.getString("com_fecha"),
						rs.getString("com_nrofact"),
						rs.getInt("com_prove"),
						rs.getDouble("com_total"),
						rs.getDouble("com_totald"),
						rs.getDouble("com_totalr"),
						rs.getDouble("com_totalp"),
						rs.getDouble("com_totale"),
						rs.getInt("com_activo"),
						rs.getInt("com_cance"),
						rs.getString("com_venci"),
						rs.getString("com_fpago"),
						rs.getInt("com_moneda"),
						rs.getDouble("com_monedo"),
						rs.getDouble("com_monere"),
						rs.getDouble("com_monepe"),
						rs.getDouble("com_moneeu"),
						rs.getString("com_nucaja"),
						rs.getInt("com_ubica"),
						rs.getInt("com_tip"),
						rs.getDouble("com_desc"),
						rs.getDouble("com_descd"),
						rs.getDouble("com_descr"),
						rs.getDouble("com_descp"),
						rs.getDouble("com_desce"),
						rs.getDouble("com_entr"),
						rs.getDouble("com_entrd"),
						rs.getDouble("com_entrr"),
						rs.getDouble("com_entrp"),
						rs.getDouble("com_entre"),
						rs.getInt("com_cierre"),
						rs.getDouble("com_entrpar"),
						rs.getInt("com_tipoperacion"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("com_deposito"),
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

	public boolean insertar(Compracre_cab comp) {
		String q = " insert into compracre_cab( com_hora,  com_usua,  com_movim,  com_fechac,  com_fecha,  com_nrofact,  com_prove,  com_total,  com_totald,  com_totalr,  com_totalp,  com_totale,  com_activo,  com_cance,  com_venci,  com_fpago,  com_moneda,  com_monedo,  com_monere,  com_monepe,  com_moneeu,  com_nucaja,  com_ubica,  com_tip,  com_desc,  com_descd,  com_descr,  com_descp,  com_desce,  com_entr,  com_entrd,  com_entrr,  com_entrp,  com_entre,  com_cierre,  com_entrpar,  com_tipoperacion,  fechasct,  usuariosct,  maquinasct,  com_deposito,  com_nro_pedido,  com_empresa,  com_timbrado,  com_fin_vigencia) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_hora());
			ps.setInt(2, comp.getCom_usua());
			ps.setString(3, comp.getCom_movim());
			ps.setString(4, comp.getCom_fechac());
			ps.setString(5, comp.getCom_fecha());
			ps.setString(6, comp.getCom_nrofact());
			ps.setInt(7, comp.getCom_prove());
			ps.setDouble(8, comp.getCom_total());
			ps.setDouble(9, comp.getCom_totald());
			ps.setDouble(10, comp.getCom_totalr());
			ps.setDouble(11, comp.getCom_totalp());
			ps.setDouble(12, comp.getCom_totale());
			ps.setInt(13, comp.getCom_activo());
			ps.setInt(14, comp.getCom_cance());
			ps.setString(15, comp.getCom_venci());
			ps.setString(16, comp.getCom_fpago());
			ps.setInt(17, comp.getCom_moneda());
			ps.setDouble(18, comp.getCom_monedo());
			ps.setDouble(19, comp.getCom_monere());
			ps.setDouble(20, comp.getCom_monepe());
			ps.setDouble(21, comp.getCom_moneeu());
			ps.setString(22, comp.getCom_nucaja());
			ps.setInt(23, comp.getCom_ubica());
			ps.setInt(24, comp.getCom_tip());
			ps.setDouble(25, comp.getCom_desc());
			ps.setDouble(26, comp.getCom_descd());
			ps.setDouble(27, comp.getCom_descr());
			ps.setDouble(28, comp.getCom_descp());
			ps.setDouble(29, comp.getCom_desce());
			ps.setDouble(30, comp.getCom_entr());
			ps.setDouble(31, comp.getCom_entrd());
			ps.setDouble(32, comp.getCom_entrr());
			ps.setDouble(33, comp.getCom_entrp());
			ps.setDouble(34, comp.getCom_entre());
			ps.setInt(35, comp.getCom_cierre());
			ps.setDouble(36, comp.getCom_entrpar());
			ps.setInt(37, comp.getCom_tipoperacion());
			ps.setString(38, comp.getFechasct());
			ps.setInt(39, comp.getUsuariosct());
			ps.setString(40, comp.getMaquinasct());
			ps.setInt(41, comp.getCom_deposito());
			ps.setInt(42, comp.getCom_nro_pedido());
			ps.setInt(43, comp.getCom_empresa());
			ps.setString(44, comp.getCom_timbrado());
			ps.setString(45, comp.getCom_fin_vigencia());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compracre_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compracre_cab comp) {
		String q = " update compracre_cab set  com_hora=?,  com_usua=?,  com_movim=?,  com_fechac=?,  com_fecha=?,  com_nrofact=?,  com_prove=?,  com_total=?,  com_totald=?,  com_totalr=?,  com_totalp=?,  com_totale=?,  com_activo=?,  com_cance=?,  com_venci=?,  com_fpago=?,  com_moneda=?,  com_monedo=?,  com_monere=?,  com_monepe=?,  com_moneeu=?,  com_nucaja=?,  com_ubica=?,  com_tip=?,  com_desc=?,  com_descd=?,  com_descr=?,  com_descp=?,  com_desce=?,  com_entr=?,  com_entrd=?,  com_entrr=?,  com_entrp=?,  com_entre=?,  com_cierre=?,  com_entrpar=?,  com_tipoperacion=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  com_deposito=?,  com_nro_pedido=?,  com_empresa=?,  com_timbrado=?,  com_fin_vigencia=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_hora());
			ps.setInt(2, comp.getCom_usua());
			ps.setString(3, comp.getCom_movim());
			ps.setString(4, comp.getCom_fechac());
			ps.setString(5, comp.getCom_fecha());
			ps.setString(6, comp.getCom_nrofact());
			ps.setInt(7, comp.getCom_prove());
			ps.setDouble(8, comp.getCom_total());
			ps.setDouble(9, comp.getCom_totald());
			ps.setDouble(10, comp.getCom_totalr());
			ps.setDouble(11, comp.getCom_totalp());
			ps.setDouble(12, comp.getCom_totale());
			ps.setInt(13, comp.getCom_activo());
			ps.setInt(14, comp.getCom_cance());
			ps.setString(15, comp.getCom_venci());
			ps.setString(16, comp.getCom_fpago());
			ps.setInt(17, comp.getCom_moneda());
			ps.setDouble(18, comp.getCom_monedo());
			ps.setDouble(19, comp.getCom_monere());
			ps.setDouble(20, comp.getCom_monepe());
			ps.setDouble(21, comp.getCom_moneeu());
			ps.setString(22, comp.getCom_nucaja());
			ps.setInt(23, comp.getCom_ubica());
			ps.setInt(24, comp.getCom_tip());
			ps.setDouble(25, comp.getCom_desc());
			ps.setDouble(26, comp.getCom_descd());
			ps.setDouble(27, comp.getCom_descr());
			ps.setDouble(28, comp.getCom_descp());
			ps.setDouble(29, comp.getCom_desce());
			ps.setDouble(30, comp.getCom_entr());
			ps.setDouble(31, comp.getCom_entrd());
			ps.setDouble(32, comp.getCom_entrr());
			ps.setDouble(33, comp.getCom_entrp());
			ps.setDouble(34, comp.getCom_entre());
			ps.setInt(35, comp.getCom_cierre());
			ps.setDouble(36, comp.getCom_entrpar());
			ps.setInt(37, comp.getCom_tipoperacion());
			ps.setString(38, comp.getFechasct());
			ps.setInt(39, comp.getUsuariosct());
			ps.setString(40, comp.getMaquinasct());
			ps.setInt(41, comp.getCom_deposito());
			ps.setInt(42, comp.getCom_nro_pedido());
			ps.setInt(43, comp.getCom_empresa());
			ps.setString(44, comp.getCom_timbrado());
			ps.setString(45, comp.getCom_fin_vigencia());
			ps.setInt(46, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compracre_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compracre_cab comp) {
		String q = " delete from compracre_cab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compracre_cab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}