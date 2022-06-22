package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compracon_temp;
import vista.*;

public class Compracon_tempDAO extends Thread {
	private Compracon_temp comp;
	public ArrayList<Compracon_temp> resultadoCompracon_temp;

	@Override
	public void run() {
		try{
			actualizarCompracon_temp("");
		} catch (Exception e) {
			System.out.println("Error al generar Compracon_temp");
		}
		yield();
	}

	public void actualizarCompracon_temp(String condicion) {
		resultadoCompracon_temp = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compracon_temp " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compracon_temp(
						rs.getInt("comt_nro"),
						rs.getObject("comt_nrofact"),
						rs.getString("comt_hora"),
						rs.getInt("comt_usua"),
						rs.getString("comt_movim"),
						rs.getString("comt_fechac"),
						rs.getString("comt_fecha"),
						rs.getInt("comt_proveedor"),
						rs.getDouble("comt_total"),
						rs.getDouble("comt_totald"),
						rs.getDouble("comt_totalp"),
						rs.getDouble("comt_totalr"),
						rs.getDouble("comt_totale"),
						rs.getInt("comt_activo"),
						rs.getDouble("comt_moneda"),
						rs.getDouble("comt_monedo"),
						rs.getDouble("comt_monepe"),
						rs.getDouble("comt_monere"),
						rs.getDouble("comt_moneeu"),
						rs.getString("comt_nucaja"),
						rs.getInt("comt_ubica"),
						rs.getInt("comt_tip"),
						rs.getDouble("comt_desc"),
						rs.getInt("comt_cierre"),
						rs.getInt("comt_nrocierre"),
						rs.getInt("comt_deposito"),
						rs.getInt("comt_tipoperacion"),
						rs.getString("comt_fechasct"),
						rs.getInt("comt_usuariosct"),
						rs.getString("comt_maquinasct")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compracon_temp comp) {
		String q = " insert into compracon_temp( comt_nrofact,  comt_hora,  comt_usua,  comt_movim,  comt_fechac,  comt_fecha,  comt_proveedor,  comt_total,  comt_totald,  comt_totalp,  comt_totalr,  comt_totale,  comt_activo,  comt_moneda,  comt_monedo,  comt_monepe,  comt_monere,  comt_moneeu,  comt_nucaja,  comt_ubica,  comt_tip,  comt_desc,  comt_cierre,  comt_nrocierre,  comt_deposito,  comt_tipoperacion,  comt_fechasct,  comt_usuariosct,  comt_maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, comp.getComt_nrofact());
			ps.setString(2, comp.getComt_hora());
			ps.setInt(3, comp.getComt_usua());
			ps.setString(4, comp.getComt_movim());
			ps.setString(5, comp.getComt_fechac());
			ps.setString(6, comp.getComt_fecha());
			ps.setInt(7, comp.getComt_proveedor());
			ps.setDouble(8, comp.getComt_total());
			ps.setDouble(9, comp.getComt_totald());
			ps.setDouble(10, comp.getComt_totalp());
			ps.setDouble(11, comp.getComt_totalr());
			ps.setDouble(12, comp.getComt_totale());
			ps.setInt(13, comp.getComt_activo());
			ps.setDouble(14, comp.getComt_moneda());
			ps.setDouble(15, comp.getComt_monedo());
			ps.setDouble(16, comp.getComt_monepe());
			ps.setDouble(17, comp.getComt_monere());
			ps.setDouble(18, comp.getComt_moneeu());
			ps.setString(19, comp.getComt_nucaja());
			ps.setInt(20, comp.getComt_ubica());
			ps.setInt(21, comp.getComt_tip());
			ps.setDouble(22, comp.getComt_desc());
			ps.setInt(23, comp.getComt_cierre());
			ps.setInt(24, comp.getComt_nrocierre());
			ps.setInt(25, comp.getComt_deposito());
			ps.setInt(26, comp.getComt_tipoperacion());
			ps.setString(27, comp.getComt_fechasct());
			ps.setInt(28, comp.getComt_usuariosct());
			ps.setString(29, comp.getComt_maquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compracon_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compracon_temp comp) {
		String q = " update compracon_temp set  comt_nrofact=?,  comt_hora=?,  comt_usua=?,  comt_movim=?,  comt_fechac=?,  comt_fecha=?,  comt_proveedor=?,  comt_total=?,  comt_totald=?,  comt_totalp=?,  comt_totalr=?,  comt_totale=?,  comt_activo=?,  comt_moneda=?,  comt_monedo=?,  comt_monepe=?,  comt_monere=?,  comt_moneeu=?,  comt_nucaja=?,  comt_ubica=?,  comt_tip=?,  comt_desc=?,  comt_cierre=?,  comt_nrocierre=?,  comt_deposito=?,  comt_tipoperacion=?,  comt_fechasct=?,  comt_usuariosct=?,  comt_maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, comp.getComt_nrofact());
			ps.setString(2, comp.getComt_hora());
			ps.setInt(3, comp.getComt_usua());
			ps.setString(4, comp.getComt_movim());
			ps.setString(5, comp.getComt_fechac());
			ps.setString(6, comp.getComt_fecha());
			ps.setInt(7, comp.getComt_proveedor());
			ps.setDouble(8, comp.getComt_total());
			ps.setDouble(9, comp.getComt_totald());
			ps.setDouble(10, comp.getComt_totalp());
			ps.setDouble(11, comp.getComt_totalr());
			ps.setDouble(12, comp.getComt_totale());
			ps.setInt(13, comp.getComt_activo());
			ps.setDouble(14, comp.getComt_moneda());
			ps.setDouble(15, comp.getComt_monedo());
			ps.setDouble(16, comp.getComt_monepe());
			ps.setDouble(17, comp.getComt_monere());
			ps.setDouble(18, comp.getComt_moneeu());
			ps.setString(19, comp.getComt_nucaja());
			ps.setInt(20, comp.getComt_ubica());
			ps.setInt(21, comp.getComt_tip());
			ps.setDouble(22, comp.getComt_desc());
			ps.setInt(23, comp.getComt_cierre());
			ps.setInt(24, comp.getComt_nrocierre());
			ps.setInt(25, comp.getComt_deposito());
			ps.setInt(26, comp.getComt_tipoperacion());
			ps.setString(27, comp.getComt_fechasct());
			ps.setInt(28, comp.getComt_usuariosct());
			ps.setString(29, comp.getComt_maquinasct());
			ps.setInt(30, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compracon_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compracon_temp comp) {
		String q = " delete from compracon_temp where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compracon_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}