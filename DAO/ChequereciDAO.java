package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Chequereci;
import vista.*;

public class ChequereciDAO extends Thread {
	private Chequereci cheq;
	public ArrayList<Chequereci> resultadoChequereci;

	@Override
	public void run() {
		try{
			actualizarChequereci("");
		} catch (Exception e) {
			System.out.println("Error al generar Chequereci");
		}
		yield();
	}

	public void actualizarChequereci(String condicion) {
		resultadoChequereci = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  chequereci " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cheq = new Chequereci(
						rs.getInt("che_nro"),
						rs.getInt("che_tipo"),
						rs.getInt("che_usuario"),
						rs.getInt("che_tipoplazo"),
						rs.getInt("che_banco"),
						rs.getString("che_numcheque"),
						rs.getInt("che_numventa"),
						rs.getString("che_titular"),
						rs.getString("che_fecha"),
						rs.getDouble("che_monto"),
						rs.getInt("che_moneda"),
						rs.getString("che_cliente"),
						rs.getString("che_fechaplazo"),
						rs.getInt("che_borrado"),
						rs.getInt("che_cierre"),
						rs.getString("che_entrego"),
						rs.getString("che_observacion"),
						rs.getInt("che_estado"),
						rs.getInt("che_deposito"),
						rs.getInt("che_nrocierre"),
						rs.getInt("che_cierrecajagennro")
			);
			arr.add(cheq);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Chequereci cheq) {
		String q = " insert into chequereci( che_tipo,  che_usuario,  che_tipoplazo,  che_banco,  che_numcheque,  che_numventa,  che_titular,  che_fecha,  che_monto,  che_moneda,  che_cliente,  che_fechaplazo,  che_borrado,  che_cierre,  che_entrego,  che_observacion,  che_estado,  che_deposito,  che_nrocierre,  che_cierrecajagennro) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getChe_tipo());
			ps.setInt(2, cheq.getChe_usuario());
			ps.setInt(3, cheq.getChe_tipoplazo());
			ps.setInt(4, cheq.getChe_banco());
			ps.setString(5, cheq.getChe_numcheque());
			ps.setInt(6, cheq.getChe_numventa());
			ps.setString(7, cheq.getChe_titular());
			ps.setString(8, cheq.getChe_fecha());
			ps.setDouble(9, cheq.getChe_monto());
			ps.setInt(10, cheq.getChe_moneda());
			ps.setString(11, cheq.getChe_cliente());
			ps.setString(12, cheq.getChe_fechaplazo());
			ps.setInt(13, cheq.getChe_borrado());
			ps.setInt(14, cheq.getChe_cierre());
			ps.setString(15, cheq.getChe_entrego());
			ps.setString(16, cheq.getChe_observacion());
			ps.setInt(17, cheq.getChe_estado());
			ps.setInt(18, cheq.getChe_deposito());
			ps.setInt(19, cheq.getChe_nrocierre());
			ps.setInt(20, cheq.getChe_cierrecajagennro());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Chequereci", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Chequereci cheq) {
		String q = " update chequereci set  che_tipo=?,  che_usuario=?,  che_tipoplazo=?,  che_banco=?,  che_numcheque=?,  che_numventa=?,  che_titular=?,  che_fecha=?,  che_monto=?,  che_moneda=?,  che_cliente=?,  che_fechaplazo=?,  che_borrado=?,  che_cierre=?,  che_entrego=?,  che_observacion=?,  che_estado=?,  che_deposito=?,  che_nrocierre=?,  che_cierrecajagennro=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getChe_tipo());
			ps.setInt(2, cheq.getChe_usuario());
			ps.setInt(3, cheq.getChe_tipoplazo());
			ps.setInt(4, cheq.getChe_banco());
			ps.setString(5, cheq.getChe_numcheque());
			ps.setInt(6, cheq.getChe_numventa());
			ps.setString(7, cheq.getChe_titular());
			ps.setString(8, cheq.getChe_fecha());
			ps.setDouble(9, cheq.getChe_monto());
			ps.setInt(10, cheq.getChe_moneda());
			ps.setString(11, cheq.getChe_cliente());
			ps.setString(12, cheq.getChe_fechaplazo());
			ps.setInt(13, cheq.getChe_borrado());
			ps.setInt(14, cheq.getChe_cierre());
			ps.setString(15, cheq.getChe_entrego());
			ps.setString(16, cheq.getChe_observacion());
			ps.setInt(17, cheq.getChe_estado());
			ps.setInt(18, cheq.getChe_deposito());
			ps.setInt(19, cheq.getChe_nrocierre());
			ps.setInt(20, cheq.getChe_cierrecajagennro());
			ps.setInt(21, cheq.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Chequereci", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Chequereci cheq) {
		String q = " delete from chequereci where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cheq.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Chequereci", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}