package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Banco;
import vista.*;

public class BancoDAO extends Thread {
	private Banco banc;
	public ArrayList<Banco> resultadoBanco;

	@Override
	public void run() {
		try{
			actualizarBanco("");
		} catch (Exception e) {
			System.out.println("Error al generar Banco");
		}
		yield();
	}

	public void actualizarBanco(String condicion) {
		resultadoBanco = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  banco " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				banc = new Banco(
						rs.getInt("ban_nro"),
						rs.getString("ban_descripcion"),
						rs.getInt("ban_borrado")
			);
			arr.add(banc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Banco banc) {
		String q = " insert into banco( ban_descripcion,  ban_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, banc.getBan_descripcion());
			ps.setInt(2, banc.getBan_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Banco", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Banco banc) {
		String q = " update banco set  ban_descripcion=?,  ban_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, banc.getBan_descripcion());
			ps.setInt(2, banc.getBan_borrado());
			ps.setInt(3, banc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Banco", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Banco banc) {
		String q = " delete from banco where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, banc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Banco", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}