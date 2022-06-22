package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cabecera_canje;
import vista.*;

public class Cabecera_canjeDAO extends Thread {
	private Cabecera_canje cabe;
	public ArrayList<Cabecera_canje> resultadoCabecera_canje;

	@Override
	public void run() {
		try{
			actualizarCabecera_canje("");
		} catch (Exception e) {
			System.out.println("Error al generar Cabecera_canje");
		}
		yield();
	}

	public void actualizarCabecera_canje(String condicion) {
		resultadoCabecera_canje = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cabecera_canje " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cabe = new Cabecera_canje(
						rs.getInt("cj_nro"),
						rs.getInt("cj_ppc_nro"),
						rs.getString("cj_fecha"),
						rs.getString("cj_hora"),
						rs.getString("fechasct"),
						rs.getInt("cj_usuario"),
						rs.getDouble("cj_cantidad_items"),
						rs.getDouble("cj_total_canje"),
						rs.getInt("cj_borrado"),
						rs.getString("cj_maquina")
			);
			arr.add(cabe);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cabecera_canje cabe) {
		String q = " insert into cabecera_canje( cj_ppc_nro,  cj_fecha,  cj_hora,  fechasct,  cj_usuario,  cj_cantidad_items,  cj_total_canje,  cj_borrado,  cj_maquina) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getCj_ppc_nro());
			ps.setString(2, cabe.getCj_fecha());
			ps.setString(3, cabe.getCj_hora());
			ps.setString(4, cabe.getFechasct());
			ps.setInt(5, cabe.getCj_usuario());
			ps.setDouble(6, cabe.getCj_cantidad_items());
			ps.setDouble(7, cabe.getCj_total_canje());
			ps.setInt(8, cabe.getCj_borrado());
			ps.setString(9, cabe.getCj_maquina());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cabecera_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cabecera_canje cabe) {
		String q = " update cabecera_canje set  cj_ppc_nro=?,  cj_fecha=?,  cj_hora=?,  fechasct=?,  cj_usuario=?,  cj_cantidad_items=?,  cj_total_canje=?,  cj_borrado=?,  cj_maquina=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getCj_ppc_nro());
			ps.setString(2, cabe.getCj_fecha());
			ps.setString(3, cabe.getCj_hora());
			ps.setString(4, cabe.getFechasct());
			ps.setInt(5, cabe.getCj_usuario());
			ps.setDouble(6, cabe.getCj_cantidad_items());
			ps.setDouble(7, cabe.getCj_total_canje());
			ps.setInt(8, cabe.getCj_borrado());
			ps.setString(9, cabe.getCj_maquina());
			ps.setInt(10, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cabecera_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cabecera_canje cabe) {
		String q = " delete from cabecera_canje where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cabecera_canje", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}