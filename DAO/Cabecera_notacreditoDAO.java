package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cabecera_notacredito;
import vista.*;

public class Cabecera_notacreditoDAO extends Thread {
	private Cabecera_notacredito cabe;
	public ArrayList<Cabecera_notacredito> resultadoCabecera_notacredito;

	@Override
	public void run() {
		try{
			actualizarCabecera_notacredito("");
		} catch (Exception e) {
			System.out.println("Error al generar Cabecera_notacredito");
		}
		yield();
	}

	public void actualizarCabecera_notacredito(String condicion) {
		resultadoCabecera_notacredito = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cabecera_notacredito " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cabe = new Cabecera_notacredito(
						rs.getInt("cn_codigo"),
						rs.getString("cn_fecha"),
						rs.getInt("cn_proveedor"),
						rs.getInt("cn_usuario"),
						rs.getDouble("cn_total"),
						rs.getInt("cn_borrado"),
						rs.getInt("cn_nropago")
			);
			arr.add(cabe);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cabecera_notacredito cabe) {
		String q = " insert into cabecera_notacredito( cn_fecha,  cn_proveedor,  cn_usuario,  cn_total,  cn_borrado,  cn_nropago) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cabe.getCn_fecha());
			ps.setInt(2, cabe.getCn_proveedor());
			ps.setInt(3, cabe.getCn_usuario());
			ps.setDouble(4, cabe.getCn_total());
			ps.setInt(5, cabe.getCn_borrado());
			ps.setInt(6, cabe.getCn_nropago());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cabecera_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cabecera_notacredito cabe) {
		String q = " update cabecera_notacredito set  cn_fecha=?,  cn_proveedor=?,  cn_usuario=?,  cn_total=?,  cn_borrado=?,  cn_nropago=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cabe.getCn_fecha());
			ps.setInt(2, cabe.getCn_proveedor());
			ps.setInt(3, cabe.getCn_usuario());
			ps.setDouble(4, cabe.getCn_total());
			ps.setInt(5, cabe.getCn_borrado());
			ps.setInt(6, cabe.getCn_nropago());
			ps.setInt(7, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cabecera_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cabecera_notacredito cabe) {
		String q = " delete from cabecera_notacredito where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cabecera_notacredito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}