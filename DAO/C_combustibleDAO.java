package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.C_combustible;
import vista.*;

public class C_combustibleDAO extends Thread {
	private C_combustible c_co;
	public ArrayList<C_combustible> resultadoC_combustible;

	@Override
	public void run() {
		try{
			actualizarC_combustible("");
		} catch (Exception e) {
			System.out.println("Error al generar C_combustible");
		}
		yield();
	}

	public void actualizarC_combustible(String condicion) {
		resultadoC_combustible = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  c_combustible " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				c_co = new C_combustible(
						rs.getInt("cc_codigo"),
						rs.getDouble("cc_numeroin"),
						rs.getDouble("cc_numeroout"),
						rs.getInt("cc_numeroelemento"),
						rs.getInt("cc_usuario"),
						rs.getInt("cc_borrado"),
						rs.getInt("cc_estado"),
						rs.getString("cc_fecha")
			);
			arr.add(c_co);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(C_combustible c_co) {
		String q = " insert into c_combustible( cc_numeroin,  cc_numeroout,  cc_numeroelemento,  cc_usuario,  cc_borrado,  cc_estado,  cc_fecha) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, c_co.getCc_numeroin());
			ps.setDouble(2, c_co.getCc_numeroout());
			ps.setInt(3, c_co.getCc_numeroelemento());
			ps.setInt(4, c_co.getCc_usuario());
			ps.setInt(5, c_co.getCc_borrado());
			ps.setInt(6, c_co.getCc_estado());
			ps.setString(7, c_co.getCc_fecha());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar C_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(C_combustible c_co) {
		String q = " update c_combustible set  cc_numeroin=?,  cc_numeroout=?,  cc_numeroelemento=?,  cc_usuario=?,  cc_borrado=?,  cc_estado=?,  cc_fecha=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setDouble(1, c_co.getCc_numeroin());
			ps.setDouble(2, c_co.getCc_numeroout());
			ps.setInt(3, c_co.getCc_numeroelemento());
			ps.setInt(4, c_co.getCc_usuario());
			ps.setInt(5, c_co.getCc_borrado());
			ps.setInt(6, c_co.getCc_estado());
			ps.setString(7, c_co.getCc_fecha());
			ps.setInt(8, c_co.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar C_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(C_combustible c_co) {
		String q = " delete from c_combustible where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, c_co.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar C_combustible", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}