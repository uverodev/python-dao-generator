package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Demo;
import vista.*;

public class DemoDAO extends Thread {
	private Demo demo;
	public ArrayList<Demo> resultadoDemo;

	@Override
	public void run() {
		try{
			actualizarDemo("");
		} catch (Exception e) {
			System.out.println("Error al generar Demo");
		}
		yield();
	}

	public void actualizarDemo(String condicion) {
		resultadoDemo = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  demo " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				demo = new Demo(
						rs.getInt("de_nro"),
						rs.getInt("de_dias"),
						rs.getInt("de_diaspasado"),
						rs.getString("de_serial"),
						rs.getInt("de_habilitado"),
						rs.getString("de_maquina"),
						rs.getString("de_disco"),
						rs.getString("de_fecinstalacion")
			);
			arr.add(demo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Demo demo) {
		String q = " insert into demo( de_dias,  de_diaspasado,  de_serial,  de_habilitado,  de_maquina,  de_disco,  de_fecinstalacion) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, demo.getDe_dias());
			ps.setInt(2, demo.getDe_diaspasado());
			ps.setString(3, demo.getDe_serial());
			ps.setInt(4, demo.getDe_habilitado());
			ps.setString(5, demo.getDe_maquina());
			ps.setString(6, demo.getDe_disco());
			ps.setString(7, demo.getDe_fecinstalacion());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Demo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Demo demo) {
		String q = " update demo set  de_dias=?,  de_diaspasado=?,  de_serial=?,  de_habilitado=?,  de_maquina=?,  de_disco=?,  de_fecinstalacion=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, demo.getDe_dias());
			ps.setInt(2, demo.getDe_diaspasado());
			ps.setString(3, demo.getDe_serial());
			ps.setInt(4, demo.getDe_habilitado());
			ps.setString(5, demo.getDe_maquina());
			ps.setString(6, demo.getDe_disco());
			ps.setString(7, demo.getDe_fecinstalacion());
			ps.setInt(8, demo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Demo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Demo demo) {
		String q = " delete from demo where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, demo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Demo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}