package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Creditos_ventas;
import vista.*;

public class Creditos_ventasDAO extends Thread {
	private Creditos_ventas cred;
	public ArrayList<Creditos_ventas> resultadoCreditos_ventas;

	@Override
	public void run() {
		try{
			actualizarCreditos_ventas("");
		} catch (Exception e) {
			System.out.println("Error al generar Creditos_ventas");
		}
		yield();
	}

	public void actualizarCreditos_ventas(String condicion) {
		resultadoCreditos_ventas = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  creditos_ventas " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cred = new Creditos_ventas(
						rs.getInt("id"),
						rs.getString("fecha"),
						rs.getInt("idcreditos"),
						rs.getInt("idventas"),
						rs.getInt("idUsuarios")
			);
			arr.add(cred);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Creditos_ventas cred) {
		String q = " insert into creditos_ventas( fecha,  idcreditos,  idventas,  idUsuarios) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cred.getFecha());
			ps.setInt(2, cred.getIdcreditos());
			ps.setInt(3, cred.getIdventas());
			ps.setInt(4, cred.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Creditos_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Creditos_ventas cred) {
		String q = " update creditos_ventas set  fecha=?,  idcreditos=?,  idventas=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cred.getFecha());
			ps.setInt(2, cred.getIdcreditos());
			ps.setInt(3, cred.getIdventas());
			ps.setInt(4, cred.getIdusuarios());
			ps.setInt(5, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Creditos_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Creditos_ventas cred) {
		String q = " delete from creditos_ventas where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Creditos_ventas", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}