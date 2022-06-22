package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Acreedores;
import vista.*;

public class AcreedoresDAO extends Thread {
	private Acreedores acre;
	public ArrayList<Acreedores> resultadoAcreedores;

	@Override
	public void run() {
		try{
			actualizarAcreedores("");
		} catch (Exception e) {
			System.out.println("Error al generar Acreedores");
		}
		yield();
	}

	public void actualizarAcreedores(String condicion) {
		resultadoAcreedores = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  acreedores " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				acre = new Acreedores(
						rs.getInt("id"),
						rs.getString("descripcion"),
						rs.getDouble("monto"),
						rs.getString("fecha"),
						rs.getString("estado"),
						rs.getInt("idUsuarios")
			);
			arr.add(acre);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Acreedores acre) {
		String q = " insert into acreedores( descripcion,  monto,  fecha,  estado,  idUsuarios) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, acre.getDescripcion());
			ps.setDouble(2, acre.getMonto());
			ps.setString(3, acre.getFecha());
			ps.setString(4, acre.getEstado());
			ps.setInt(5, acre.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Acreedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Acreedores acre) {
		String q = " update acreedores set  descripcion=?,  monto=?,  fecha=?,  estado=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, acre.getDescripcion());
			ps.setDouble(2, acre.getMonto());
			ps.setString(3, acre.getFecha());
			ps.setString(4, acre.getEstado());
			ps.setInt(5, acre.getIdusuarios());
			ps.setInt(6, acre.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Acreedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Acreedores acre) {
		String q = " delete from acreedores where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, acre.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Acreedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}