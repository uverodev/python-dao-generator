package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Tip_gasto;
import vista.*;

public class Tip_gastoDAO extends Thread {
	private Tip_gasto tip_;
	public ArrayList<Tip_gasto> resultadoTip_gasto;

	@Override
	public void run() {
		try{
			actualizarTip_gasto("");
		} catch (Exception e) {
			System.out.println("Error al generar Tip_gasto");
		}
		yield();
	}

	public void actualizarTip_gasto(String condicion) {
		resultadoTip_gasto = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  tip_gasto " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tip_ = new Tip_gasto(
						rs.getInt("tg_codigo"),
						rs.getString("tg_fecha"),
						rs.getString("tg_descripcion"),
						rs.getInt("tg_borrado")
			);
			arr.add(tip_);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Tip_gasto tip_) {
		String q = " insert into tip_gasto( tg_fecha,  tg_descripcion,  tg_borrado) values (?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tip_.getTg_fecha());
			ps.setString(2, tip_.getTg_descripcion());
			ps.setInt(3, tip_.getTg_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Tip_gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Tip_gasto tip_) {
		String q = " update tip_gasto set  tg_fecha=?,  tg_descripcion=?,  tg_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tip_.getTg_fecha());
			ps.setString(2, tip_.getTg_descripcion());
			ps.setInt(3, tip_.getTg_borrado());
			ps.setInt(4, tip_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Tip_gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Tip_gasto tip_) {
		String q = " delete from tip_gasto where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tip_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Tip_gasto", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}