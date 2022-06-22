package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Presupuestocab;
import vista.*;

public class PresupuestocabDAO extends Thread {
	private Presupuestocab pres;
	public ArrayList<Presupuestocab> resultadoPresupuestocab;

	@Override
	public void run() {
		try{
			actualizarPresupuestocab("");
		} catch (Exception e) {
			System.out.println("Error al generar Presupuestocab");
		}
		yield();
	}

	public void actualizarPresupuestocab(String condicion) {
		resultadoPresupuestocab = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  presupuestocab " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pres = new Presupuestocab(
						rs.getInt("pr_nro"),
						rs.getString("pr_fecha"),
						rs.getString("pr_hora"),
						rs.getString("pr_cliente"),
						rs.getDouble("pr_total"),
						rs.getDouble("pr_descuento"),
						rs.getDouble("pr_dolar"),
						rs.getDouble("pr_real"),
						rs.getDouble("pr_peso"),
						rs.getDouble("pr_euro"),
						rs.getInt("pr_vendedor"),
						rs.getInt("pr_usuario"),
						rs.getDouble("pr_totalitem"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("pr_tipo"),
						rs.getString("pr_nro_pedido"),
						rs.getString("pr_fecha_prevista"),
						rs.getInt("pr_estado")
			);
			arr.add(pres);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Presupuestocab pres) {
		String q = " insert into presupuestocab( pr_fecha,  pr_hora,  pr_cliente,  pr_total,  pr_descuento,  pr_dolar,  pr_real,  pr_peso,  pr_euro,  pr_vendedor,  pr_usuario,  pr_totalitem,  fechasct,  usuariosct,  maquinasct,  pr_tipo,  pr_nro_pedido,  pr_fecha_prevista,  pr_estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pres.getPr_fecha());
			ps.setString(2, pres.getPr_hora());
			ps.setString(3, pres.getPr_cliente());
			ps.setDouble(4, pres.getPr_total());
			ps.setDouble(5, pres.getPr_descuento());
			ps.setDouble(6, pres.getPr_dolar());
			ps.setDouble(7, pres.getPr_real());
			ps.setDouble(8, pres.getPr_peso());
			ps.setDouble(9, pres.getPr_euro());
			ps.setInt(10, pres.getPr_vendedor());
			ps.setInt(11, pres.getPr_usuario());
			ps.setDouble(12, pres.getPr_totalitem());
			ps.setString(13, pres.getFechasct());
			ps.setInt(14, pres.getUsuariosct());
			ps.setString(15, pres.getMaquinasct());
			ps.setInt(16, pres.getPr_tipo());
			ps.setString(17, pres.getPr_nro_pedido());
			ps.setString(18, pres.getPr_fecha_prevista());
			ps.setInt(19, pres.getPr_estado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Presupuestocab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Presupuestocab pres) {
		String q = " update presupuestocab set  pr_fecha=?,  pr_hora=?,  pr_cliente=?,  pr_total=?,  pr_descuento=?,  pr_dolar=?,  pr_real=?,  pr_peso=?,  pr_euro=?,  pr_vendedor=?,  pr_usuario=?,  pr_totalitem=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  pr_tipo=?,  pr_nro_pedido=?,  pr_fecha_prevista=?,  pr_estado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pres.getPr_fecha());
			ps.setString(2, pres.getPr_hora());
			ps.setString(3, pres.getPr_cliente());
			ps.setDouble(4, pres.getPr_total());
			ps.setDouble(5, pres.getPr_descuento());
			ps.setDouble(6, pres.getPr_dolar());
			ps.setDouble(7, pres.getPr_real());
			ps.setDouble(8, pres.getPr_peso());
			ps.setDouble(9, pres.getPr_euro());
			ps.setInt(10, pres.getPr_vendedor());
			ps.setInt(11, pres.getPr_usuario());
			ps.setDouble(12, pres.getPr_totalitem());
			ps.setString(13, pres.getFechasct());
			ps.setInt(14, pres.getUsuariosct());
			ps.setString(15, pres.getMaquinasct());
			ps.setInt(16, pres.getPr_tipo());
			ps.setString(17, pres.getPr_nro_pedido());
			ps.setString(18, pres.getPr_fecha_prevista());
			ps.setInt(19, pres.getPr_estado());
			ps.setInt(20, pres.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Presupuestocab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Presupuestocab pres) {
		String q = " delete from presupuestocab where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pres.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Presupuestocab", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}