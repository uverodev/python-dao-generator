package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Timbrado;
import vista.*;

public class TimbradoDAO extends Thread {
	private Timbrado timb;
	public ArrayList<Timbrado> resultadoTimbrado;

	@Override
	public void run() {
		try{
			actualizarTimbrado("");
		} catch (Exception e) {
			System.out.println("Error al generar Timbrado");
		}
		yield();
	}

	public void actualizarTimbrado(String condicion) {
		resultadoTimbrado = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  timbrado " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				timb = new Timbrado(
						rs.getInt("tim_id"),
						rs.getObject("tim_timbrado"),
						rs.getObject("tim_sucursal"),
						rs.getInt("tim_numero"),
						rs.getInt("tim_activo"),
						rs.getObject("tim_desde"),
						rs.getObject("tim_hasta"),
						rs.getObject("tim_pc"),
						rs.getInt("tim_usuario"),
						rs.getObject("tim_sucursalfin"),
						rs.getInt("tim_numerofin"),
						rs.getInt("tim_local"),
						rs.getObject("tim_tipo")
			);
			arr.add(timb);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Timbrado timb) {
		String q = " insert into timbrado( tim_timbrado,  tim_sucursal,  tim_numero,  tim_activo,  tim_desde,  tim_hasta,  tim_pc,  tim_usuario,  tim_sucursalfin,  tim_numerofin,  tim_local,  tim_tipo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, timb.getTim_timbrado());
			ps.setObject(2, timb.getTim_sucursal());
			ps.setInt(3, timb.getTim_numero());
			ps.setInt(4, timb.getTim_activo());
			ps.setObject(5, timb.getTim_desde());
			ps.setObject(6, timb.getTim_hasta());
			ps.setObject(7, timb.getTim_pc());
			ps.setInt(8, timb.getTim_usuario());
			ps.setObject(9, timb.getTim_sucursalfin());
			ps.setInt(10, timb.getTim_numerofin());
			ps.setInt(11, timb.getTim_local());
			ps.setObject(12, timb.getTim_tipo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Timbrado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Timbrado timb) {
		String q = " update timbrado set  tim_timbrado=?,  tim_sucursal=?,  tim_numero=?,  tim_activo=?,  tim_desde=?,  tim_hasta=?,  tim_pc=?,  tim_usuario=?,  tim_sucursalfin=?,  tim_numerofin=?,  tim_local=?,  tim_tipo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, timb.getTim_timbrado());
			ps.setObject(2, timb.getTim_sucursal());
			ps.setInt(3, timb.getTim_numero());
			ps.setInt(4, timb.getTim_activo());
			ps.setObject(5, timb.getTim_desde());
			ps.setObject(6, timb.getTim_hasta());
			ps.setObject(7, timb.getTim_pc());
			ps.setInt(8, timb.getTim_usuario());
			ps.setObject(9, timb.getTim_sucursalfin());
			ps.setInt(10, timb.getTim_numerofin());
			ps.setInt(11, timb.getTim_local());
			ps.setObject(12, timb.getTim_tipo());
			ps.setInt(13, timb.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Timbrado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Timbrado timb) {
		String q = " delete from timbrado where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, timb.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Timbrado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}