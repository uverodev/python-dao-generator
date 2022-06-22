package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import vista.*;

public class CuentaDAO extends Thread {
	private Cuenta cuen;
	public ArrayList<Cuenta> resultadoCuenta;

	@Override
	public void run() {
		try{
			actualizarCuenta("");
		} catch (Exception e) {
			System.out.println("Error al generar Cuenta");
		}
		yield();
	}

	public void actualizarCuenta(String condicion) {
		resultadoCuenta = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cuenta " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cuen = new Cuenta(
						rs.getInt("cuen_nro"),
						rs.getString("cuen_descripcion"),
						rs.getString("cuen_numcuenta"),
						rs.getInt("cuen_banco"),
						rs.getDouble("cuen_sobregiro"),
						rs.getDouble("cuen_sobregirod"),
						rs.getDouble("cuen_sobregiror"),
						rs.getDouble("cuen_sobregirop"),
						rs.getDouble("cuen_sobregiroe"),
						rs.getDouble("cuen_fondo"),
						rs.getDouble("cuen_fondod"),
						rs.getDouble("cuen_fondor"),
						rs.getDouble("cuen_fondop"),
						rs.getDouble("cuen_fondoe"),
						rs.getInt("cuen_borrado"),
						rs.getString("cuen_titular"),
						rs.getInt("cuen_cuentatargetas")
			);
			arr.add(cuen);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cuenta cuen) {
		String q = " insert into cuenta( cuen_descripcion,  cuen_numcuenta,  cuen_banco,  cuen_sobregiro,  cuen_sobregirod,  cuen_sobregiror,  cuen_sobregirop,  cuen_sobregiroe,  cuen_fondo,  cuen_fondod,  cuen_fondor,  cuen_fondop,  cuen_fondoe,  cuen_borrado,  cuen_titular,  cuen_cuentatargetas) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cuen.getCuen_descripcion());
			ps.setString(2, cuen.getCuen_numcuenta());
			ps.setInt(3, cuen.getCuen_banco());
			ps.setDouble(4, cuen.getCuen_sobregiro());
			ps.setDouble(5, cuen.getCuen_sobregirod());
			ps.setDouble(6, cuen.getCuen_sobregiror());
			ps.setDouble(7, cuen.getCuen_sobregirop());
			ps.setDouble(8, cuen.getCuen_sobregiroe());
			ps.setDouble(9, cuen.getCuen_fondo());
			ps.setDouble(10, cuen.getCuen_fondod());
			ps.setDouble(11, cuen.getCuen_fondor());
			ps.setDouble(12, cuen.getCuen_fondop());
			ps.setDouble(13, cuen.getCuen_fondoe());
			ps.setInt(14, cuen.getCuen_borrado());
			ps.setString(15, cuen.getCuen_titular());
			ps.setInt(16, cuen.getCuen_cuentatargetas());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cuenta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cuenta cuen) {
		String q = " update cuenta set  cuen_descripcion=?,  cuen_numcuenta=?,  cuen_banco=?,  cuen_sobregiro=?,  cuen_sobregirod=?,  cuen_sobregiror=?,  cuen_sobregirop=?,  cuen_sobregiroe=?,  cuen_fondo=?,  cuen_fondod=?,  cuen_fondor=?,  cuen_fondop=?,  cuen_fondoe=?,  cuen_borrado=?,  cuen_titular=?,  cuen_cuentatargetas=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cuen.getCuen_descripcion());
			ps.setString(2, cuen.getCuen_numcuenta());
			ps.setInt(3, cuen.getCuen_banco());
			ps.setDouble(4, cuen.getCuen_sobregiro());
			ps.setDouble(5, cuen.getCuen_sobregirod());
			ps.setDouble(6, cuen.getCuen_sobregiror());
			ps.setDouble(7, cuen.getCuen_sobregirop());
			ps.setDouble(8, cuen.getCuen_sobregiroe());
			ps.setDouble(9, cuen.getCuen_fondo());
			ps.setDouble(10, cuen.getCuen_fondod());
			ps.setDouble(11, cuen.getCuen_fondor());
			ps.setDouble(12, cuen.getCuen_fondop());
			ps.setDouble(13, cuen.getCuen_fondoe());
			ps.setInt(14, cuen.getCuen_borrado());
			ps.setString(15, cuen.getCuen_titular());
			ps.setInt(16, cuen.getCuen_cuentatargetas());
			ps.setInt(17, cuen.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cuenta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cuenta cuen) {
		String q = " delete from cuenta where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cuen.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cuenta", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}