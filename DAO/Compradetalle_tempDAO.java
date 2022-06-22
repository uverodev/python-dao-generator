package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compradetalle_temp;
import vista.*;

public class Compradetalle_tempDAO extends Thread {
	private Compradetalle_temp comp;
	public ArrayList<Compradetalle_temp> resultadoCompradetalle_temp;

	@Override
	public void run() {
		try{
			actualizarCompradetalle_temp("");
		} catch (Exception e) {
			System.out.println("Error al generar Compradetalle_temp");
		}
		yield();
	}

	public void actualizarCompradetalle_temp(String condicion) {
		resultadoCompradetalle_temp = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compradetalle_temp " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compradetalle_temp(
						rs.getInt("comt_nro"),
						rs.getString("comt_codpro"),
						rs.getDouble("comt_cant"),
						rs.getInt("cod_tipcan"),
						rs.getDouble("comt_costo"),
						rs.getDouble("comt_pventa1"),
						rs.getDouble("comt_pventa2"),
						rs.getDouble("comt_pventa3"),
						rs.getDouble("comt_pventa4"),
						rs.getString("comt_vencimiento"),
						rs.getInt("comt_activo"),
						rs.getDouble("comt_stact"),
						rs.getDouble("comt_stant"),
						rs.getInt("comt_iva"),
						rs.getDouble("comt_iva5"),
						rs.getDouble("comt_iva10"),
						rs.getDouble("comt_excen"),
						rs.getString("comt_lote"),
						rs.getDouble("comt_moneda"),
						rs.getDouble("comt_monedo"),
						rs.getDouble("comt_monere"),
						rs.getDouble("comt_monepe"),
						rs.getDouble("comt_moneeu"),
						rs.getInt("comt_nucaja"),
						rs.getDouble("comt_desc"),
						rs.getInt("comt_borrado"),
						rs.getInt("comt_usuariosct"),
						rs.getString("comt_maquinasct"),
						rs.getInt("comt_deposito"),
						rs.getDouble("comt_costomayorista"),
						rs.getString("comt_maquina"),
						rs.getDouble("comt_cantbonificacion")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compradetalle_temp comp) {
		String q = " insert into compradetalle_temp( comt_codpro,  comt_cant,  cod_tipcan,  comt_costo,  comt_pventa1,  comt_pventa2,  comt_pventa3,  comt_pventa4,  comt_vencimiento,  comt_activo,  comt_stact,  comt_stant,  comt_iva,  comt_iva5,  comt_iva10,  comt_excen,  comt_lote,  comt_moneda,  comt_monedo,  comt_monere,  comt_monepe,  comt_moneeu,  comt_nucaja,  comt_desc,  comt_borrado,  comt_usuariosct,  comt_maquinasct,  comt_deposito,  comt_costomayorista,  comt_maquina,  comt_cantbonificacion) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getComt_codpro());
			ps.setDouble(2, comp.getComt_cant());
			ps.setInt(3, comp.getCod_tipcan());
			ps.setDouble(4, comp.getComt_costo());
			ps.setDouble(5, comp.getComt_pventa1());
			ps.setDouble(6, comp.getComt_pventa2());
			ps.setDouble(7, comp.getComt_pventa3());
			ps.setDouble(8, comp.getComt_pventa4());
			ps.setString(9, comp.getComt_vencimiento());
			ps.setInt(10, comp.getComt_activo());
			ps.setDouble(11, comp.getComt_stact());
			ps.setDouble(12, comp.getComt_stant());
			ps.setInt(13, comp.getComt_iva());
			ps.setDouble(14, comp.getComt_iva5());
			ps.setDouble(15, comp.getComt_iva10());
			ps.setDouble(16, comp.getComt_excen());
			ps.setString(17, comp.getComt_lote());
			ps.setDouble(18, comp.getComt_moneda());
			ps.setDouble(19, comp.getComt_monedo());
			ps.setDouble(20, comp.getComt_monere());
			ps.setDouble(21, comp.getComt_monepe());
			ps.setDouble(22, comp.getComt_moneeu());
			ps.setInt(23, comp.getComt_nucaja());
			ps.setDouble(24, comp.getComt_desc());
			ps.setInt(25, comp.getComt_borrado());
			ps.setInt(26, comp.getComt_usuariosct());
			ps.setString(27, comp.getComt_maquinasct());
			ps.setInt(28, comp.getComt_deposito());
			ps.setDouble(29, comp.getComt_costomayorista());
			ps.setString(30, comp.getComt_maquina());
			ps.setDouble(31, comp.getComt_cantbonificacion());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compradetalle_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compradetalle_temp comp) {
		String q = " update compradetalle_temp set  comt_codpro=?,  comt_cant=?,  cod_tipcan=?,  comt_costo=?,  comt_pventa1=?,  comt_pventa2=?,  comt_pventa3=?,  comt_pventa4=?,  comt_vencimiento=?,  comt_activo=?,  comt_stact=?,  comt_stant=?,  comt_iva=?,  comt_iva5=?,  comt_iva10=?,  comt_excen=?,  comt_lote=?,  comt_moneda=?,  comt_monedo=?,  comt_monere=?,  comt_monepe=?,  comt_moneeu=?,  comt_nucaja=?,  comt_desc=?,  comt_borrado=?,  comt_usuariosct=?,  comt_maquinasct=?,  comt_deposito=?,  comt_costomayorista=?,  comt_maquina=?,  comt_cantbonificacion=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getComt_codpro());
			ps.setDouble(2, comp.getComt_cant());
			ps.setInt(3, comp.getCod_tipcan());
			ps.setDouble(4, comp.getComt_costo());
			ps.setDouble(5, comp.getComt_pventa1());
			ps.setDouble(6, comp.getComt_pventa2());
			ps.setDouble(7, comp.getComt_pventa3());
			ps.setDouble(8, comp.getComt_pventa4());
			ps.setString(9, comp.getComt_vencimiento());
			ps.setInt(10, comp.getComt_activo());
			ps.setDouble(11, comp.getComt_stact());
			ps.setDouble(12, comp.getComt_stant());
			ps.setInt(13, comp.getComt_iva());
			ps.setDouble(14, comp.getComt_iva5());
			ps.setDouble(15, comp.getComt_iva10());
			ps.setDouble(16, comp.getComt_excen());
			ps.setString(17, comp.getComt_lote());
			ps.setDouble(18, comp.getComt_moneda());
			ps.setDouble(19, comp.getComt_monedo());
			ps.setDouble(20, comp.getComt_monere());
			ps.setDouble(21, comp.getComt_monepe());
			ps.setDouble(22, comp.getComt_moneeu());
			ps.setInt(23, comp.getComt_nucaja());
			ps.setDouble(24, comp.getComt_desc());
			ps.setInt(25, comp.getComt_borrado());
			ps.setInt(26, comp.getComt_usuariosct());
			ps.setString(27, comp.getComt_maquinasct());
			ps.setInt(28, comp.getComt_deposito());
			ps.setDouble(29, comp.getComt_costomayorista());
			ps.setString(30, comp.getComt_maquina());
			ps.setDouble(31, comp.getComt_cantbonificacion());
			ps.setInt(32, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compradetalle_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compradetalle_temp comp) {
		String q = " delete from compradetalle_temp where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compradetalle_temp", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}