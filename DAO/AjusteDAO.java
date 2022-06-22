package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Ajuste;
import vista.*;

public class AjusteDAO extends Thread {
	private Ajuste ajus;
	public ArrayList<Ajuste> resultadoAjuste;

	@Override
	public void run() {
		try{
			actualizarAjuste("");
		} catch (Exception e) {
			System.out.println("Error al generar Ajuste");
		}
		yield();
	}

	public void actualizarAjuste(String condicion) {
		resultadoAjuste = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  ajuste " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				ajus = new Ajuste(
						rs.getInt("aj_nro"),
						rs.getInt("aj_ubicacion"),
						rs.getString("aj_codprod"),
						rs.getInt("aj_motivo"),
						rs.getDouble("aj_pcompra"),
						rs.getDouble("aj_pventamin"),
						rs.getDouble("aj_pventabas"),
						rs.getDouble("aj_pventamay"),
						rs.getDouble("aj_pventacred"),
						rs.getString("aj_fecha"),
						rs.getDouble("aj_cantidad"),
						rs.getDouble("aj_stock"),
						rs.getInt("aj_usuario"),
						rs.getInt("aj_borrado"),
						rs.getInt("aj_deposito1"),
						rs.getInt("aj_deposito2"),
						rs.getString("aj_lote"),
						rs.getInt("aj_deposito3"),
						rs.getString("aj_observacion"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getString("aj_vencimiento"),
						rs.getInt("aj_inventario"),
						rs.getDouble("aj_costo_promedio")
			);
			arr.add(ajus);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Ajuste ajus) {
		String q = " insert into ajuste( aj_ubicacion,  aj_codprod,  aj_motivo,  aj_pcompra,  aj_pventamin,  aj_pventabas,  aj_pventamay,  aj_pventacred,  aj_fecha,  aj_cantidad,  aj_stock,  aj_usuario,  aj_borrado,  aj_deposito1,  aj_deposito2,  aj_lote,  aj_deposito3,  aj_observacion,  fechasct,  usuariosct,  maquinasct,  aj_vencimiento,  aj_inventario,  aj_costo_promedio) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, ajus.getAj_ubicacion());
			ps.setString(2, ajus.getAj_codprod());
			ps.setInt(3, ajus.getAj_motivo());
			ps.setDouble(4, ajus.getAj_pcompra());
			ps.setDouble(5, ajus.getAj_pventamin());
			ps.setDouble(6, ajus.getAj_pventabas());
			ps.setDouble(7, ajus.getAj_pventamay());
			ps.setDouble(8, ajus.getAj_pventacred());
			ps.setString(9, ajus.getAj_fecha());
			ps.setDouble(10, ajus.getAj_cantidad());
			ps.setDouble(11, ajus.getAj_stock());
			ps.setInt(12, ajus.getAj_usuario());
			ps.setInt(13, ajus.getAj_borrado());
			ps.setInt(14, ajus.getAj_deposito1());
			ps.setInt(15, ajus.getAj_deposito2());
			ps.setString(16, ajus.getAj_lote());
			ps.setInt(17, ajus.getAj_deposito3());
			ps.setString(18, ajus.getAj_observacion());
			ps.setString(19, ajus.getFechasct());
			ps.setInt(20, ajus.getUsuariosct());
			ps.setString(21, ajus.getMaquinasct());
			ps.setString(22, ajus.getAj_vencimiento());
			ps.setInt(23, ajus.getAj_inventario());
			ps.setDouble(24, ajus.getAj_costo_promedio());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Ajuste", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Ajuste ajus) {
		String q = " update ajuste set  aj_ubicacion=?,  aj_codprod=?,  aj_motivo=?,  aj_pcompra=?,  aj_pventamin=?,  aj_pventabas=?,  aj_pventamay=?,  aj_pventacred=?,  aj_fecha=?,  aj_cantidad=?,  aj_stock=?,  aj_usuario=?,  aj_borrado=?,  aj_deposito1=?,  aj_deposito2=?,  aj_lote=?,  aj_deposito3=?,  aj_observacion=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  aj_vencimiento=?,  aj_inventario=?,  aj_costo_promedio=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, ajus.getAj_ubicacion());
			ps.setString(2, ajus.getAj_codprod());
			ps.setInt(3, ajus.getAj_motivo());
			ps.setDouble(4, ajus.getAj_pcompra());
			ps.setDouble(5, ajus.getAj_pventamin());
			ps.setDouble(6, ajus.getAj_pventabas());
			ps.setDouble(7, ajus.getAj_pventamay());
			ps.setDouble(8, ajus.getAj_pventacred());
			ps.setString(9, ajus.getAj_fecha());
			ps.setDouble(10, ajus.getAj_cantidad());
			ps.setDouble(11, ajus.getAj_stock());
			ps.setInt(12, ajus.getAj_usuario());
			ps.setInt(13, ajus.getAj_borrado());
			ps.setInt(14, ajus.getAj_deposito1());
			ps.setInt(15, ajus.getAj_deposito2());
			ps.setString(16, ajus.getAj_lote());
			ps.setInt(17, ajus.getAj_deposito3());
			ps.setString(18, ajus.getAj_observacion());
			ps.setString(19, ajus.getFechasct());
			ps.setInt(20, ajus.getUsuariosct());
			ps.setString(21, ajus.getMaquinasct());
			ps.setString(22, ajus.getAj_vencimiento());
			ps.setInt(23, ajus.getAj_inventario());
			ps.setDouble(24, ajus.getAj_costo_promedio());
			ps.setInt(25, ajus.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Ajuste", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Ajuste ajus) {
		String q = " delete from ajuste where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, ajus.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Ajuste", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}