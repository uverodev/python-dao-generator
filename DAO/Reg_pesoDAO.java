package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Reg_peso;
import vista.*;

public class Reg_pesoDAO extends Thread {
	private Reg_peso reg_;
	public ArrayList<Reg_peso> resultadoReg_peso;

	@Override
	public void run() {
		try{
			actualizarReg_peso("");
		} catch (Exception e) {
			System.out.println("Error al generar Reg_peso");
		}
		yield();
	}

	public void actualizarReg_peso(String condicion) {
		resultadoReg_peso = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  reg_peso " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				reg_ = new Reg_peso(
						rs.getInt("pes_codigo"),
						rs.getString("pes_fecha"),
						rs.getDouble("pes_peso"),
						rs.getInt("pes_borrado"),
						rs.getString("pes_cliente")
			);
			arr.add(reg_);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Reg_peso reg_) {
		String q = " insert into reg_peso( pes_fecha,  pes_peso,  pes_borrado,  pes_cliente) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, reg_.getPes_fecha());
			ps.setDouble(2, reg_.getPes_peso());
			ps.setInt(3, reg_.getPes_borrado());
			ps.setString(4, reg_.getPes_cliente());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Reg_peso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Reg_peso reg_) {
		String q = " update reg_peso set  pes_fecha=?,  pes_peso=?,  pes_borrado=?,  pes_cliente=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, reg_.getPes_fecha());
			ps.setDouble(2, reg_.getPes_peso());
			ps.setInt(3, reg_.getPes_borrado());
			ps.setString(4, reg_.getPes_cliente());
			ps.setInt(5, reg_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Reg_peso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Reg_peso reg_) {
		String q = " delete from reg_peso where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, reg_.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Reg_peso", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}