package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Transporte;
import vista.*;

public class TransporteDAO extends Thread {
	private Transporte tran;
	public ArrayList<Transporte> resultadoTransporte;

	@Override
	public void run() {
		try{
			actualizarTransporte("");
		} catch (Exception e) {
			System.out.println("Error al generar Transporte");
		}
		yield();
	}

	public void actualizarTransporte(String condicion) {
		resultadoTransporte = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  transporte " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tran = new Transporte(
						rs.getInt("trans_codigo"),
						rs.getString("trans_descripcion"),
						rs.getInt("trans_borrado")
			);
			arr.add(tran);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Transporte tran) {
		String q = " insert into transporte( trans_descripcion,  trans_borrado) values (?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTrans_descripcion());
			ps.setInt(2, tran.getTrans_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Transporte", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Transporte tran) {
		String q = " update transporte set  trans_descripcion=?,  trans_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTrans_descripcion());
			ps.setInt(2, tran.getTrans_borrado());
			ps.setInt(3, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Transporte", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Transporte tran) {
		String q = " delete from transporte where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Transporte", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}