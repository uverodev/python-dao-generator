package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cajchica;
import vista.*;

public class CajchicaDAO extends Thread {
	private Cajchica cajc;
	public ArrayList<Cajchica> resultadoCajchica;

	@Override
	public void run() {
		try{
			actualizarCajchica("");
		} catch (Exception e) {
			System.out.println("Error al generar Cajchica");
		}
		yield();
	}

	public void actualizarCajchica(String condicion) {
		resultadoCajchica = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cajchica " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cajc = new Cajchica(
						rs.getInt("caj_nro"),
						rs.getString("caj_fecha"),
						rs.getString("caj_hora"),
						rs.getDouble("caj_total"),
						rs.getString("caj_responsable"),
						rs.getString("caj_observacion"),
						rs.getInt("caj_borrado"),
						rs.getString("caj_caja"),
						rs.getDouble("caj_totacomulado"),
						rs.getInt("caj_usuario"),
						rs.getInt("caj_cerrado"),
						rs.getInt("caj_nrocierre"),
						rs.getInt("caj_deposito"),
						rs.getInt("caj_cierrecajagennro")
			);
			arr.add(cajc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cajchica cajc) {
		String q = " insert into cajchica( caj_fecha,  caj_hora,  caj_total,  caj_responsable,  caj_observacion,  caj_borrado,  caj_caja,  caj_totacomulado,  caj_usuario,  caj_cerrado,  caj_nrocierre,  caj_deposito,  caj_cierrecajagennro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cajc.getCaj_fecha());
			ps.setString(2, cajc.getCaj_hora());
			ps.setDouble(3, cajc.getCaj_total());
			ps.setString(4, cajc.getCaj_responsable());
			ps.setString(5, cajc.getCaj_observacion());
			ps.setInt(6, cajc.getCaj_borrado());
			ps.setString(7, cajc.getCaj_caja());
			ps.setDouble(8, cajc.getCaj_totacomulado());
			ps.setInt(9, cajc.getCaj_usuario());
			ps.setInt(10, cajc.getCaj_cerrado());
			ps.setInt(11, cajc.getCaj_nrocierre());
			ps.setInt(12, cajc.getCaj_deposito());
			ps.setInt(13, cajc.getCaj_cierrecajagennro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cajchica cajc) {
		String q = " update cajchica set  caj_fecha=?,  caj_hora=?,  caj_total=?,  caj_responsable=?,  caj_observacion=?,  caj_borrado=?,  caj_caja=?,  caj_totacomulado=?,  caj_usuario=?,  caj_cerrado=?,  caj_nrocierre=?,  caj_deposito=?,  caj_cierrecajagennro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cajc.getCaj_fecha());
			ps.setString(2, cajc.getCaj_hora());
			ps.setDouble(3, cajc.getCaj_total());
			ps.setString(4, cajc.getCaj_responsable());
			ps.setString(5, cajc.getCaj_observacion());
			ps.setInt(6, cajc.getCaj_borrado());
			ps.setString(7, cajc.getCaj_caja());
			ps.setDouble(8, cajc.getCaj_totacomulado());
			ps.setInt(9, cajc.getCaj_usuario());
			ps.setInt(10, cajc.getCaj_cerrado());
			ps.setInt(11, cajc.getCaj_nrocierre());
			ps.setInt(12, cajc.getCaj_deposito());
			ps.setInt(13, cajc.getCaj_cierrecajagennro());
			ps.setInt(14, cajc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cajchica cajc) {
		String q = " delete from cajchica where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cajc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cajchica", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}