package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Deposito;
import vista.*;

public class DepositoDAO extends Thread {
	private Deposito depo;
	public ArrayList<Deposito> resultadoDeposito;

	@Override
	public void run() {
		try{
			actualizarDeposito("");
		} catch (Exception e) {
			System.out.println("Error al generar Deposito");
		}
		yield();
	}

	public void actualizarDeposito(String condicion) {
		resultadoDeposito = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  deposito " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				depo = new Deposito(
						rs.getInt("dep_nro"),
						rs.getString("dep_descripcion"),
						rs.getString("dep_encargado"),
						rs.getString("dep_telefono"),
						rs.getString("dep_direccion"),
						rs.getInt("dep_borrado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getString("dep_host"),
						rs.getString("dep_bd"),
						rs.getInt("dep_deposito")
			);
			arr.add(depo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Deposito depo) {
		String q = " insert into deposito( dep_descripcion,  dep_encargado,  dep_telefono,  dep_direccion,  dep_borrado,  fechasct,  usuariosct,  maquinasct,  dep_host,  dep_bd,  dep_deposito) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDep_descripcion());
			ps.setString(2, depo.getDep_encargado());
			ps.setString(3, depo.getDep_telefono());
			ps.setString(4, depo.getDep_direccion());
			ps.setInt(5, depo.getDep_borrado());
			ps.setString(6, depo.getFechasct());
			ps.setInt(7, depo.getUsuariosct());
			ps.setString(8, depo.getMaquinasct());
			ps.setString(9, depo.getDep_host());
			ps.setString(10, depo.getDep_bd());
			ps.setInt(11, depo.getDep_deposito());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Deposito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Deposito depo) {
		String q = " update deposito set  dep_descripcion=?,  dep_encargado=?,  dep_telefono=?,  dep_direccion=?,  dep_borrado=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  dep_host=?,  dep_bd=?,  dep_deposito=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, depo.getDep_descripcion());
			ps.setString(2, depo.getDep_encargado());
			ps.setString(3, depo.getDep_telefono());
			ps.setString(4, depo.getDep_direccion());
			ps.setInt(5, depo.getDep_borrado());
			ps.setString(6, depo.getFechasct());
			ps.setInt(7, depo.getUsuariosct());
			ps.setString(8, depo.getMaquinasct());
			ps.setString(9, depo.getDep_host());
			ps.setString(10, depo.getDep_bd());
			ps.setInt(11, depo.getDep_deposito());
			ps.setInt(12, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Deposito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Deposito depo) {
		String q = " delete from deposito where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, depo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Deposito", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}