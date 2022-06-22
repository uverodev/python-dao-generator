package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compra_con;
import vista.*;

public class Compra_conDAO extends Thread {
	private Compra_con comp;
	public ArrayList<Compra_con> resultadoCompra_con;

	@Override
	public void run() {
		try{
			actualizarCompra_con("");
		} catch (Exception e) {
			System.out.println("Error al generar Compra_con");
		}
		yield();
	}

	public void actualizarCompra_con(String condicion) {
		resultadoCompra_con = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compra_con " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compra_con(
						rs.getInt("com_nro"),
						rs.getString("com_codpro"),
						rs.getDouble("com_cant"),
						rs.getInt("cod_tipcan"),
						rs.getDouble("com_costo"),
						rs.getDouble("com_pventa1"),
						rs.getDouble("com_pventa2"),
						rs.getDouble("com_pventa3"),
						rs.getDouble("com_pventa4"),
						rs.getString("com_vencimiento"),
						rs.getInt("com_activo"),
						rs.getDouble("com_stact"),
						rs.getDouble("com_stant"),
						rs.getInt("com_iva"),
						rs.getDouble("com_iva5"),
						rs.getDouble("com_iva10"),
						rs.getDouble("com_excen"),
						rs.getString("com_lote"),
						rs.getDouble("com_moneda"),
						rs.getDouble("com_monedo"),
						rs.getDouble("com_monere"),
						rs.getDouble("com_monepe"),
						rs.getDouble("com_moneeu"),
						rs.getInt("com_nucaja"),
						rs.getDouble("com_desc"),
						rs.getInt("com_borrado"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("com_deposito"),
						rs.getDouble("com_costomayorista"),
						rs.getDouble("com_cantbonificacion"),
						rs.getDouble("com_bonificado"),
						rs.getInt("com_id"),
						rs.getInt("com_rubro"),
						rs.getString("com_detalle")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compra_con comp) {
		String q = " insert into compra_con( com_codpro,  com_cant,  cod_tipcan,  com_costo,  com_pventa1,  com_pventa2,  com_pventa3,  com_pventa4,  com_vencimiento,  com_activo,  com_stact,  com_stant,  com_iva,  com_iva5,  com_iva10,  com_excen,  com_lote,  com_moneda,  com_monedo,  com_monere,  com_monepe,  com_moneeu,  com_nucaja,  com_desc,  com_borrado,  usuariosct,  maquinasct,  com_deposito,  com_costomayorista,  com_cantbonificacion,  com_bonificado,  com_id,  com_rubro,  com_detalle) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_codpro());
			ps.setDouble(2, comp.getCom_cant());
			ps.setInt(3, comp.getCod_tipcan());
			ps.setDouble(4, comp.getCom_costo());
			ps.setDouble(5, comp.getCom_pventa1());
			ps.setDouble(6, comp.getCom_pventa2());
			ps.setDouble(7, comp.getCom_pventa3());
			ps.setDouble(8, comp.getCom_pventa4());
			ps.setString(9, comp.getCom_vencimiento());
			ps.setInt(10, comp.getCom_activo());
			ps.setDouble(11, comp.getCom_stact());
			ps.setDouble(12, comp.getCom_stant());
			ps.setInt(13, comp.getCom_iva());
			ps.setDouble(14, comp.getCom_iva5());
			ps.setDouble(15, comp.getCom_iva10());
			ps.setDouble(16, comp.getCom_excen());
			ps.setString(17, comp.getCom_lote());
			ps.setDouble(18, comp.getCom_moneda());
			ps.setDouble(19, comp.getCom_monedo());
			ps.setDouble(20, comp.getCom_monere());
			ps.setDouble(21, comp.getCom_monepe());
			ps.setDouble(22, comp.getCom_moneeu());
			ps.setInt(23, comp.getCom_nucaja());
			ps.setDouble(24, comp.getCom_desc());
			ps.setInt(25, comp.getCom_borrado());
			ps.setInt(26, comp.getUsuariosct());
			ps.setString(27, comp.getMaquinasct());
			ps.setInt(28, comp.getCom_deposito());
			ps.setDouble(29, comp.getCom_costomayorista());
			ps.setDouble(30, comp.getCom_cantbonificacion());
			ps.setDouble(31, comp.getCom_bonificado());
			ps.setInt(32, comp.getCom_id());
			ps.setInt(33, comp.getCom_rubro());
			ps.setString(34, comp.getCom_detalle());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compra_con", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compra_con comp) {
		String q = " update compra_con set  com_codpro=?,  com_cant=?,  cod_tipcan=?,  com_costo=?,  com_pventa1=?,  com_pventa2=?,  com_pventa3=?,  com_pventa4=?,  com_vencimiento=?,  com_activo=?,  com_stact=?,  com_stant=?,  com_iva=?,  com_iva5=?,  com_iva10=?,  com_excen=?,  com_lote=?,  com_moneda=?,  com_monedo=?,  com_monere=?,  com_monepe=?,  com_moneeu=?,  com_nucaja=?,  com_desc=?,  com_borrado=?,  usuariosct=?,  maquinasct=?,  com_deposito=?,  com_costomayorista=?,  com_cantbonificacion=?,  com_bonificado=?,  com_id=?,  com_rubro=?,  com_detalle=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getCom_codpro());
			ps.setDouble(2, comp.getCom_cant());
			ps.setInt(3, comp.getCod_tipcan());
			ps.setDouble(4, comp.getCom_costo());
			ps.setDouble(5, comp.getCom_pventa1());
			ps.setDouble(6, comp.getCom_pventa2());
			ps.setDouble(7, comp.getCom_pventa3());
			ps.setDouble(8, comp.getCom_pventa4());
			ps.setString(9, comp.getCom_vencimiento());
			ps.setInt(10, comp.getCom_activo());
			ps.setDouble(11, comp.getCom_stact());
			ps.setDouble(12, comp.getCom_stant());
			ps.setInt(13, comp.getCom_iva());
			ps.setDouble(14, comp.getCom_iva5());
			ps.setDouble(15, comp.getCom_iva10());
			ps.setDouble(16, comp.getCom_excen());
			ps.setString(17, comp.getCom_lote());
			ps.setDouble(18, comp.getCom_moneda());
			ps.setDouble(19, comp.getCom_monedo());
			ps.setDouble(20, comp.getCom_monere());
			ps.setDouble(21, comp.getCom_monepe());
			ps.setDouble(22, comp.getCom_moneeu());
			ps.setInt(23, comp.getCom_nucaja());
			ps.setDouble(24, comp.getCom_desc());
			ps.setInt(25, comp.getCom_borrado());
			ps.setInt(26, comp.getUsuariosct());
			ps.setString(27, comp.getMaquinasct());
			ps.setInt(28, comp.getCom_deposito());
			ps.setDouble(29, comp.getCom_costomayorista());
			ps.setDouble(30, comp.getCom_cantbonificacion());
			ps.setDouble(31, comp.getCom_bonificado());
			ps.setInt(32, comp.getCom_id());
			ps.setInt(33, comp.getCom_rubro());
			ps.setString(34, comp.getCom_detalle());
			ps.setInt(35, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compra_con", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compra_con comp) {
		String q = " delete from compra_con where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compra_con", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}