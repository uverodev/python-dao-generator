package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Paquetes;
import vista.*;

public class PaquetesDAO extends Thread {
	private Paquetes paqu;
	public ArrayList<Paquetes> resultadoPaquetes;

	@Override
	public void run() {
		try{
			actualizarPaquetes("");
		} catch (Exception e) {
			System.out.println("Error al generar Paquetes");
		}
		yield();
	}

	public void actualizarPaquetes(String condicion) {
		resultadoPaquetes = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  paquetes " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				paqu = new Paquetes(
						rs.getInt("paq_codigo"),
						rs.getString("paq_fecha"),
						rs.getString("paq_hora"),
						rs.getDouble("paq_costadicional"),
						rs.getString("paq_descripcion"),
						rs.getInt("paq_usuario"),
						rs.getInt("paq_borrado")
			);
			arr.add(paqu);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Paquetes paqu) {
		String q = " insert into paquetes( paq_fecha,  paq_hora,  paq_costadicional,  paq_descripcion,  paq_usuario,  paq_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, paqu.getPaq_fecha());
			ps.setString(2, paqu.getPaq_hora());
			ps.setDouble(3, paqu.getPaq_costadicional());
			ps.setString(4, paqu.getPaq_descripcion());
			ps.setInt(5, paqu.getPaq_usuario());
			ps.setInt(6, paqu.getPaq_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Paquetes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Paquetes paqu) {
		String q = " update paquetes set  paq_fecha=?,  paq_hora=?,  paq_costadicional=?,  paq_descripcion=?,  paq_usuario=?,  paq_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, paqu.getPaq_fecha());
			ps.setString(2, paqu.getPaq_hora());
			ps.setDouble(3, paqu.getPaq_costadicional());
			ps.setString(4, paqu.getPaq_descripcion());
			ps.setInt(5, paqu.getPaq_usuario());
			ps.setInt(6, paqu.getPaq_borrado());
			ps.setInt(7, paqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Paquetes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Paquetes paqu) {
		String q = " delete from paquetes where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, paqu.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Paquetes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}