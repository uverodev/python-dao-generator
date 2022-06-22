package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Gasto;
import vista.*;

public class GastoDAO extends Thread {
	private Gasto gast;
	public ArrayList<Gasto> resultadoGasto;

	@Override
	public void run() {
		try{
			actualizarGasto("");
		} catch (Exception e) {
			System.out.println("Error al generar Gasto");
		}
		yield();
	}

	public void actualizarGasto(String condicion) {
		resultadoGasto = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  gasto " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				gast = new Gasto(
						rs.getInt("g_nro"),
						rs.getString("g_fecha"),
						rs.getString("g_fechacarga"),
						rs.getDouble("g_monto"),
						rs.getString("g_motivo"),
						rs.getInt("g_moneda"),
						rs.getInt("g_borrado"),
						rs.getInt("g_usuario"),
						rs.getString("g_caja"),
						rs.getInt("g_cierre"),
						rs.getString("g_numfactura"),
						rs.getInt("g_tipgasto"),
						rs.getInt("g_deposito"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("g_nrocierre"),
						rs.getInt("g_cierrecajagennro"),
						rs.getDouble("g_valor")
			);
			arr.add(gast);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Gasto gast) {
		String q = " insert into gasto( g_fecha,  g_fechacarga,  g_monto,  g_motivo,  g_moneda,  g_borrado,  g_usuario,  g_caja,  g_cierre,  g_numfactura,  g_tipgasto,  g_deposito,  fechasct,  usuariosct,  maquinasct,  g_nrocierre,  g_cierrecajagennro,  g_valor) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, gast.getG_fecha());
			ps.setString(2, gast.getG_fechacarga());
			ps.setDouble(3, gast.getG_monto());
			ps.setString(4, gast.getG_motivo());
			ps.setInt(5, gast.getG_moneda());
			ps.setInt(6, gast.getG_borrado());
			ps.setInt(7, gast.getG_usuario());
			ps.setString(8, gast.getG_caja());
			ps.setInt(9, gast.getG_cierre());
			ps.setString(10, gast.getG_numfactura());
			ps.setInt(11, gast.getG_tipgasto());
			ps.setInt(12, gast.getG_deposito());
			ps.setString(13, gast.getFechasct());
			ps.setInt(14, gast.getUsuariosct());
			ps.setString(15, gast.getMaquinasct());
			ps.setInt(16, gast.getG_nrocierre());
			ps.setInt(17, gast.getG_cierrecajagennro());
			ps.setDouble(18, gast.getG_valor());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Gasto gast) {
		String q = " update gasto set  g_fecha=?,  g_fechacarga=?,  g_monto=?,  g_motivo=?,  g_moneda=?,  g_borrado=?,  g_usuario=?,  g_caja=?,  g_cierre=?,  g_numfactura=?,  g_tipgasto=?,  g_deposito=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  g_nrocierre=?,  g_cierrecajagennro=?,  g_valor=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, gast.getG_fecha());
			ps.setString(2, gast.getG_fechacarga());
			ps.setDouble(3, gast.getG_monto());
			ps.setString(4, gast.getG_motivo());
			ps.setInt(5, gast.getG_moneda());
			ps.setInt(6, gast.getG_borrado());
			ps.setInt(7, gast.getG_usuario());
			ps.setString(8, gast.getG_caja());
			ps.setInt(9, gast.getG_cierre());
			ps.setString(10, gast.getG_numfactura());
			ps.setInt(11, gast.getG_tipgasto());
			ps.setInt(12, gast.getG_deposito());
			ps.setString(13, gast.getFechasct());
			ps.setInt(14, gast.getUsuariosct());
			ps.setString(15, gast.getMaquinasct());
			ps.setInt(16, gast.getG_nrocierre());
			ps.setInt(17, gast.getG_cierrecajagennro());
			ps.setDouble(18, gast.getG_valor());
			ps.setInt(19, gast.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Gasto gast) {
		String q = " delete from gasto where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, gast.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}