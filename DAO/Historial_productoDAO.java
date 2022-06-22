package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Historial_producto;
import vista.*;

public class Historial_productoDAO extends Thread {
	private Historial_producto hist;
	public ArrayList<Historial_producto> resultadoHistorial_producto;

	@Override
	public void run() {
		try{
			actualizarHistorial_producto("");
		} catch (Exception e) {
			System.out.println("Error al generar Historial_producto");
		}
		yield();
	}

	public void actualizarHistorial_producto(String condicion) {
		resultadoHistorial_producto = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  historial_producto " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				hist = new Historial_producto(
						rs.getInt("hp_codigo"),
						rs.getString("hp_fecha"),
						rs.getString("hp_movimiento"),
						rs.getDouble("hp_cantidad"),
						rs.getDouble("hp_stockant"),
						rs.getDouble("hp_stockact"),
						rs.getDouble("hp_pcosto"),
						rs.getDouble("hp_pventa"),
						rs.getString("hp_codigocp"),
						rs.getInt("hp_nrooperacion"),
						rs.getInt("hp_usuario"),
						rs.getString("hp_maquina"),
						rs.getString("hp_codprod"),
						rs.getString("hp_obs"),
						rs.getString("hp_lote"),
						rs.getInt("hp_tipmovimiento"),
						rs.getString("hp_descripcion_responsable")
			);
			arr.add(hist);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Historial_producto hist) {
		String q = " insert into historial_producto( hp_fecha,  hp_movimiento,  hp_cantidad,  hp_stockant,  hp_stockact,  hp_pcosto,  hp_pventa,  hp_codigocp,  hp_nrooperacion,  hp_usuario,  hp_maquina,  hp_codprod,  hp_obs,  hp_lote,  hp_tipmovimiento,  hp_descripcion_responsable) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, hist.getHp_fecha());
			ps.setString(2, hist.getHp_movimiento());
			ps.setDouble(3, hist.getHp_cantidad());
			ps.setDouble(4, hist.getHp_stockant());
			ps.setDouble(5, hist.getHp_stockact());
			ps.setDouble(6, hist.getHp_pcosto());
			ps.setDouble(7, hist.getHp_pventa());
			ps.setString(8, hist.getHp_codigocp());
			ps.setInt(9, hist.getHp_nrooperacion());
			ps.setInt(10, hist.getHp_usuario());
			ps.setString(11, hist.getHp_maquina());
			ps.setString(12, hist.getHp_codprod());
			ps.setString(13, hist.getHp_obs());
			ps.setString(14, hist.getHp_lote());
			ps.setInt(15, hist.getHp_tipmovimiento());
			ps.setString(16, hist.getHp_descripcion_responsable());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Historial_producto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Historial_producto hist) {
		String q = " update historial_producto set  hp_fecha=?,  hp_movimiento=?,  hp_cantidad=?,  hp_stockant=?,  hp_stockact=?,  hp_pcosto=?,  hp_pventa=?,  hp_codigocp=?,  hp_nrooperacion=?,  hp_usuario=?,  hp_maquina=?,  hp_codprod=?,  hp_obs=?,  hp_lote=?,  hp_tipmovimiento=?,  hp_descripcion_responsable=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, hist.getHp_fecha());
			ps.setString(2, hist.getHp_movimiento());
			ps.setDouble(3, hist.getHp_cantidad());
			ps.setDouble(4, hist.getHp_stockant());
			ps.setDouble(5, hist.getHp_stockact());
			ps.setDouble(6, hist.getHp_pcosto());
			ps.setDouble(7, hist.getHp_pventa());
			ps.setString(8, hist.getHp_codigocp());
			ps.setInt(9, hist.getHp_nrooperacion());
			ps.setInt(10, hist.getHp_usuario());
			ps.setString(11, hist.getHp_maquina());
			ps.setString(12, hist.getHp_codprod());
			ps.setString(13, hist.getHp_obs());
			ps.setString(14, hist.getHp_lote());
			ps.setInt(15, hist.getHp_tipmovimiento());
			ps.setString(16, hist.getHp_descripcion_responsable());
			ps.setInt(17, hist.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Historial_producto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Historial_producto hist) {
		String q = " delete from historial_producto where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, hist.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Historial_producto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}