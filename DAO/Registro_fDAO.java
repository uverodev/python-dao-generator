package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Registro_f;
import vista.*;

public class Registro_fDAO extends Thread {
	private Registro_f regi;
	public ArrayList<Registro_f> resultadoRegistro_f;

	@Override
	public void run() {
		try{
			actualizarRegistro_f("");
		} catch (Exception e) {
			System.out.println("Error al generar Registro_f");
		}
		yield();
	}

	public void actualizarRegistro_f(String condicion) {
		resultadoRegistro_f = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  registro_f " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				regi = new Registro_f(
						rs.getInt("rf_codigo"),
						rs.getString("rf_nrof"),
						rs.getInt("rf_nroventa"),
						rs.getInt("rf_estado"),
						rs.getString("rf_fecha"),
						rs.getInt("rf_borrado"),
						rs.getInt("rf_nrohoja"),
						rs.getDouble("rf_monto"),
						rs.getInt("rf_id_timbrado"),
						rs.getInt("rf_deposito"),
						rs.getInt("rf_nro_factura"),
						rs.getInt("rf_tipo_venta"),
						rs.getInt("rf_moneda"),
						rs.getString("rf_cliente"),
						rs.getDouble("rf_iva_5"),
						rs.getDouble("rf_iva_10"),
						rs.getDouble("rf_exenta"),
						rs.getString("rf_fecha_string"),
						rs.getString("rf_hora_string"),
						rs.getString("rf_maquina"),
						rs.getInt("rf_usuario")
			);
			arr.add(regi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Registro_f regi) {
		String q = " insert into registro_f( rf_nrof,  rf_nroventa,  rf_estado,  rf_fecha,  rf_borrado,  rf_nrohoja,  rf_monto,  rf_id_timbrado,  rf_deposito,  rf_nro_factura,  rf_tipo_venta,  rf_moneda,  rf_cliente,  rf_iva_5,  rf_iva_10,  rf_exenta,  rf_fecha_string,  rf_hora_string,  rf_maquina,  rf_usuario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, regi.getRf_nrof());
			ps.setInt(2, regi.getRf_nroventa());
			ps.setInt(3, regi.getRf_estado());
			ps.setString(4, regi.getRf_fecha());
			ps.setInt(5, regi.getRf_borrado());
			ps.setInt(6, regi.getRf_nrohoja());
			ps.setDouble(7, regi.getRf_monto());
			ps.setInt(8, regi.getRf_id_timbrado());
			ps.setInt(9, regi.getRf_deposito());
			ps.setInt(10, regi.getRf_nro_factura());
			ps.setInt(11, regi.getRf_tipo_venta());
			ps.setInt(12, regi.getRf_moneda());
			ps.setString(13, regi.getRf_cliente());
			ps.setDouble(14, regi.getRf_iva_5());
			ps.setDouble(15, regi.getRf_iva_10());
			ps.setDouble(16, regi.getRf_exenta());
			ps.setString(17, regi.getRf_fecha_string());
			ps.setString(18, regi.getRf_hora_string());
			ps.setString(19, regi.getRf_maquina());
			ps.setInt(20, regi.getRf_usuario());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Registro_f", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Registro_f regi) {
		String q = " update registro_f set  rf_nrof=?,  rf_nroventa=?,  rf_estado=?,  rf_fecha=?,  rf_borrado=?,  rf_nrohoja=?,  rf_monto=?,  rf_id_timbrado=?,  rf_deposito=?,  rf_nro_factura=?,  rf_tipo_venta=?,  rf_moneda=?,  rf_cliente=?,  rf_iva_5=?,  rf_iva_10=?,  rf_exenta=?,  rf_fecha_string=?,  rf_hora_string=?,  rf_maquina=?,  rf_usuario=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, regi.getRf_nrof());
			ps.setInt(2, regi.getRf_nroventa());
			ps.setInt(3, regi.getRf_estado());
			ps.setString(4, regi.getRf_fecha());
			ps.setInt(5, regi.getRf_borrado());
			ps.setInt(6, regi.getRf_nrohoja());
			ps.setDouble(7, regi.getRf_monto());
			ps.setInt(8, regi.getRf_id_timbrado());
			ps.setInt(9, regi.getRf_deposito());
			ps.setInt(10, regi.getRf_nro_factura());
			ps.setInt(11, regi.getRf_tipo_venta());
			ps.setInt(12, regi.getRf_moneda());
			ps.setString(13, regi.getRf_cliente());
			ps.setDouble(14, regi.getRf_iva_5());
			ps.setDouble(15, regi.getRf_iva_10());
			ps.setDouble(16, regi.getRf_exenta());
			ps.setString(17, regi.getRf_fecha_string());
			ps.setString(18, regi.getRf_hora_string());
			ps.setString(19, regi.getRf_maquina());
			ps.setInt(20, regi.getRf_usuario());
			ps.setInt(21, regi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Registro_f", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Registro_f regi) {
		String q = " delete from registro_f where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, regi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Registro_f", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}