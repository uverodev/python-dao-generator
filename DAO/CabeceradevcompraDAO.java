package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cabeceradevcompra;
import vista.*;

public class CabeceradevcompraDAO extends Thread {
	private Cabeceradevcompra cabe;
	public ArrayList<Cabeceradevcompra> resultadoCabeceradevcompra;

	@Override
	public void run() {
		try{
			actualizarCabeceradevcompra("");
		} catch (Exception e) {
			System.out.println("Error al generar Cabeceradevcompra");
		}
		yield();
	}

	public void actualizarCabeceradevcompra(String condicion) {
		resultadoCabeceradevcompra = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cabeceradevcompra " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cabe = new Cabeceradevcompra(
						rs.getInt("cd_codigo"),
						rs.getInt("cd_proveedor"),
						rs.getString("cd_fecharegistro"),
						rs.getString("cd_fecha"),
						rs.getDouble("cd_total"),
						rs.getObject("cd_numerofactura"),
						rs.getInt("cd_usuario"),
						rs.getObject("cd_pc"),
						rs.getInt("cd_borrado")
			);
			arr.add(cabe);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cabeceradevcompra cabe) {
		String q = " insert into cabeceradevcompra( cd_proveedor,  cd_fecharegistro,  cd_fecha,  cd_total,  cd_numerofactura,  cd_usuario,  cd_pc,  cd_borrado) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getCd_proveedor());
			ps.setString(2, cabe.getCd_fecharegistro());
			ps.setString(3, cabe.getCd_fecha());
			ps.setDouble(4, cabe.getCd_total());
			ps.setObject(5, cabe.getCd_numerofactura());
			ps.setInt(6, cabe.getCd_usuario());
			ps.setObject(7, cabe.getCd_pc());
			ps.setInt(8, cabe.getCd_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cabeceradevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cabeceradevcompra cabe) {
		String q = " update cabeceradevcompra set  cd_proveedor=?,  cd_fecharegistro=?,  cd_fecha=?,  cd_total=?,  cd_numerofactura=?,  cd_usuario=?,  cd_pc=?,  cd_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getCd_proveedor());
			ps.setString(2, cabe.getCd_fecharegistro());
			ps.setString(3, cabe.getCd_fecha());
			ps.setDouble(4, cabe.getCd_total());
			ps.setObject(5, cabe.getCd_numerofactura());
			ps.setInt(6, cabe.getCd_usuario());
			ps.setObject(7, cabe.getCd_pc());
			ps.setInt(8, cabe.getCd_borrado());
			ps.setInt(9, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cabeceradevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cabeceradevcompra cabe) {
		String q = " delete from cabeceradevcompra where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cabeceradevcompra", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}