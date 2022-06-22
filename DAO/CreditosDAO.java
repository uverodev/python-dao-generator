package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Creditos;
import vista.*;

public class CreditosDAO extends Thread {
	private Creditos cred;
	public ArrayList<Creditos> resultadoCreditos;

	@Override
	public void run() {
		try{
			actualizarCreditos("");
		} catch (Exception e) {
			System.out.println("Error al generar Creditos");
		}
		yield();
	}

	public void actualizarCreditos(String condicion) {
		resultadoCreditos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  creditos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cred = new Creditos(
						rs.getInt("id"),
						rs.getInt("idClientes"),
						rs.getString("estado"),
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

	public boolean insertar(Creditos cred) {
		String q = " insert into creditos( idClientes,  estado,  idUsuarios) values (?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cred.getIdclientes());
			ps.setString(2, cred.getEstado());
			ps.setInt(3, cred.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Creditos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Creditos cred) {
		String q = " update creditos set  idClientes=?,  estado=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cred.getIdclientes());
			ps.setString(2, cred.getEstado());
			ps.setInt(3, cred.getIdusuarios());
			ps.setInt(4, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Creditos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Creditos cred) {
		String q = " delete from creditos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Creditos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}