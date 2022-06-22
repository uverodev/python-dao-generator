package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pro_lote;
import vista.*;

public class Pro_loteDAO extends Thread {
	private Pro_lote pro_;
	public ArrayList<Pro_lote> resultadoPro_lote;

	@Override
	public void run() {
		try{
			actualizarPro_lote("");
		} catch (Exception e) {
			System.out.println("Error al generar Pro_lote");
		}
		yield();
	}

	public void actualizarPro_lote(String condicion) {
		resultadoPro_lote = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pro_lote " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pro_ = new Pro_lote(
						rs.getInt("l_codigo"),
						rs.getString("l_lote"),
						rs.getString("l_prodcod"),
						rs.getString("l_fecha"),
						rs.getString("l_fechavencimiento"),
						rs.getInt("l_borrado"),
						rs.getDouble("l_cantidad")
			);
			arr.add(pro_);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pro_lote pro_) {
		String q = " insert into pro_lote( l_lote,  l_prodcod,  l_fecha,  l_fechavencimiento,  l_borrado,  l_cantidad) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pro_.getL_lote());
			ps.setString(2, pro_.getL_prodcod());
			ps.setString(3, pro_.getL_fecha());
			ps.setString(4, pro_.getL_fechavencimiento());
			ps.setInt(5, pro_.getL_borrado());
			ps.setDouble(6, pro_.getL_cantidad());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pro_lote", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pro_lote pro_) {
		String q = " update pro_lote set  l_lote=?,  l_prodcod=?,  l_fecha=?,  l_fechavencimiento=?,  l_borrado=?,  l_cantidad=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pro_.getL_lote());
			ps.setString(2, pro_.getL_prodcod());
			ps.setString(3, pro_.getL_fecha());
			ps.setString(4, pro_.getL_fechavencimiento());
			ps.setInt(5, pro_.getL_borrado());
			ps.setDouble(6, pro_.getL_cantidad());
			ps.setInt(7, pro_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pro_lote", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pro_lote pro_) {
		String q = " delete from pro_lote where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pro_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pro_lote", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}