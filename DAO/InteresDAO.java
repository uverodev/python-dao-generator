package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Interes;
import vista.*;

public class InteresDAO extends Thread {
	private Interes inte;
	public ArrayList<Interes> resultadoInteres;

	@Override
	public void run() {
		try{
			actualizarInteres("");
		} catch (Exception e) {
			System.out.println("Error al generar Interes");
		}
		yield();
	}

	public void actualizarInteres(String condicion) {
		resultadoInteres = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  interes " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				inte = new Interes(
						rs.getInt("int_nro"),
						rs.getString("int_fecha"),
						rs.getString("int_hora"),
						rs.getDouble("int_mora"),
						rs.getDouble("int_cobrador"),
						rs.getInt("int_tipcobro"),
						rs.getDouble("int_mcobrador"),
						rs.getDouble("int_limredondeo"),
						rs.getDouble("int_intmensual"),
						rs.getDouble("int_pventa1por"),
						rs.getDouble("int_pventa2por"),
						rs.getDouble("int_pventa3por"),
						rs.getDouble("int_pventa4por"),
						rs.getInt("int_borrado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getDouble("int_meta")
			);
			arr.add(inte);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Interes inte) {
		String q = " insert into interes( int_fecha,  int_hora,  int_mora,  int_cobrador,  int_tipcobro,  int_mcobrador,  int_limredondeo,  int_intmensual,  int_pventa1por,  int_pventa2por,  int_pventa3por,  int_pventa4por,  int_borrado,  fechasct,  usuariosct,  maquinasct,  int_meta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, inte.getInt_fecha());
			ps.setString(2, inte.getInt_hora());
			ps.setDouble(3, inte.getInt_mora());
			ps.setDouble(4, inte.getInt_cobrador());
			ps.setInt(5, inte.getInt_tipcobro());
			ps.setDouble(6, inte.getInt_mcobrador());
			ps.setDouble(7, inte.getInt_limredondeo());
			ps.setDouble(8, inte.getInt_intmensual());
			ps.setDouble(9, inte.getInt_pventa1por());
			ps.setDouble(10, inte.getInt_pventa2por());
			ps.setDouble(11, inte.getInt_pventa3por());
			ps.setDouble(12, inte.getInt_pventa4por());
			ps.setInt(13, inte.getInt_borrado());
			ps.setString(14, inte.getFechasct());
			ps.setInt(15, inte.getUsuariosct());
			ps.setString(16, inte.getMaquinasct());
			ps.setDouble(17, inte.getInt_meta());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Interes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Interes inte) {
		String q = " update interes set  int_fecha=?,  int_hora=?,  int_mora=?,  int_cobrador=?,  int_tipcobro=?,  int_mcobrador=?,  int_limredondeo=?,  int_intmensual=?,  int_pventa1por=?,  int_pventa2por=?,  int_pventa3por=?,  int_pventa4por=?,  int_borrado=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  int_meta=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, inte.getInt_fecha());
			ps.setString(2, inte.getInt_hora());
			ps.setDouble(3, inte.getInt_mora());
			ps.setDouble(4, inte.getInt_cobrador());
			ps.setInt(5, inte.getInt_tipcobro());
			ps.setDouble(6, inte.getInt_mcobrador());
			ps.setDouble(7, inte.getInt_limredondeo());
			ps.setDouble(8, inte.getInt_intmensual());
			ps.setDouble(9, inte.getInt_pventa1por());
			ps.setDouble(10, inte.getInt_pventa2por());
			ps.setDouble(11, inte.getInt_pventa3por());
			ps.setDouble(12, inte.getInt_pventa4por());
			ps.setInt(13, inte.getInt_borrado());
			ps.setString(14, inte.getFechasct());
			ps.setInt(15, inte.getUsuariosct());
			ps.setString(16, inte.getMaquinasct());
			ps.setDouble(17, inte.getInt_meta());
			ps.setInt(18, inte.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Interes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Interes inte) {
		String q = " delete from interes where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, inte.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Interes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}