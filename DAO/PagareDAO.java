package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pagare;
import vista.*;

public class PagareDAO extends Thread {
	private Pagare paga;
	public ArrayList<Pagare> resultadoPagare;

	@Override
	public void run() {
		try{
			actualizarPagare("");
		} catch (Exception e) {
			System.out.println("Error al generar Pagare");
		}
		yield();
	}

	public void actualizarPagare(String condicion) {
		resultadoPagare = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pagare " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				paga = new Pagare(
						rs.getInt("pa_nro"),
						rs.getString("pa_cedcodeudor"),
						rs.getInt("pa_numcredito"),
						rs.getString("pa_fechavencimiento"),
						rs.getString("pa_interes"),
						rs.getString("pa_nrofactura"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getString("pa_fecha"),
						rs.getString("pa_hora"),
						rs.getDouble("pa_monto"),
						rs.getInt("pa_moneda"),
						rs.getInt("pa_cliente"),
						rs.getInt("pa_borrado"),
						rs.getInt("pa_comprobante")
			);
			arr.add(paga);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pagare paga) {
		String q = " insert into pagare( pa_cedcodeudor,  pa_numcredito,  pa_fechavencimiento,  pa_interes,  pa_nrofactura,  fechasct,  usuariosct,  maquinasct,  pa_fecha,  pa_hora,  pa_monto,  pa_moneda,  pa_cliente,  pa_borrado,  pa_comprobante) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, paga.getPa_cedcodeudor());
			ps.setInt(2, paga.getPa_numcredito());
			ps.setString(3, paga.getPa_fechavencimiento());
			ps.setString(4, paga.getPa_interes());
			ps.setString(5, paga.getPa_nrofactura());
			ps.setString(6, paga.getFechasct());
			ps.setInt(7, paga.getUsuariosct());
			ps.setString(8, paga.getMaquinasct());
			ps.setString(9, paga.getPa_fecha());
			ps.setString(10, paga.getPa_hora());
			ps.setDouble(11, paga.getPa_monto());
			ps.setInt(12, paga.getPa_moneda());
			ps.setInt(13, paga.getPa_cliente());
			ps.setInt(14, paga.getPa_borrado());
			ps.setInt(15, paga.getPa_comprobante());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pagare", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pagare paga) {
		String q = " update pagare set  pa_cedcodeudor=?,  pa_numcredito=?,  pa_fechavencimiento=?,  pa_interes=?,  pa_nrofactura=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  pa_fecha=?,  pa_hora=?,  pa_monto=?,  pa_moneda=?,  pa_cliente=?,  pa_borrado=?,  pa_comprobante=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, paga.getPa_cedcodeudor());
			ps.setInt(2, paga.getPa_numcredito());
			ps.setString(3, paga.getPa_fechavencimiento());
			ps.setString(4, paga.getPa_interes());
			ps.setString(5, paga.getPa_nrofactura());
			ps.setString(6, paga.getFechasct());
			ps.setInt(7, paga.getUsuariosct());
			ps.setString(8, paga.getMaquinasct());
			ps.setString(9, paga.getPa_fecha());
			ps.setString(10, paga.getPa_hora());
			ps.setDouble(11, paga.getPa_monto());
			ps.setInt(12, paga.getPa_moneda());
			ps.setInt(13, paga.getPa_cliente());
			ps.setInt(14, paga.getPa_borrado());
			ps.setInt(15, paga.getPa_comprobante());
			ps.setInt(16, paga.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pagare", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pagare paga) {
		String q = " delete from pagare where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, paga.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pagare", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}