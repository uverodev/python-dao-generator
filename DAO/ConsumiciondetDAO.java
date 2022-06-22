package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Consumiciondet;
import vista.*;

public class ConsumiciondetDAO extends Thread {
	private Consumiciondet cons;
	public ArrayList<Consumiciondet> resultadoConsumiciondet;

	@Override
	public void run() {
		try{
			actualizarConsumiciondet("");
		} catch (Exception e) {
			System.out.println("Error al generar Consumiciondet");
		}
		yield();
	}

	public void actualizarConsumiciondet(String condicion) {
		resultadoConsumiciondet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  consumiciondet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cons = new Consumiciondet(
						rs.getInt("cons_codigo"),
						rs.getString("cons_codprod"),
						rs.getDouble("cons_precio"),
						rs.getString("cons_lote"),
						rs.getDouble("cons_cantidad"),
						rs.getDouble("cons_total"),
						rs.getInt("cons_borrado")
			);
			arr.add(cons);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Consumiciondet cons) {
		String q = " insert into consumiciondet( cons_codprod,  cons_precio,  cons_lote,  cons_cantidad,  cons_total,  cons_borrado) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cons.getCons_codprod());
			ps.setDouble(2, cons.getCons_precio());
			ps.setString(3, cons.getCons_lote());
			ps.setDouble(4, cons.getCons_cantidad());
			ps.setDouble(5, cons.getCons_total());
			ps.setInt(6, cons.getCons_borrado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Consumiciondet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Consumiciondet cons) {
		String q = " update consumiciondet set  cons_codprod=?,  cons_precio=?,  cons_lote=?,  cons_cantidad=?,  cons_total=?,  cons_borrado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cons.getCons_codprod());
			ps.setDouble(2, cons.getCons_precio());
			ps.setString(3, cons.getCons_lote());
			ps.setDouble(4, cons.getCons_cantidad());
			ps.setDouble(5, cons.getCons_total());
			ps.setInt(6, cons.getCons_borrado());
			ps.setInt(7, cons.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Consumiciondet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Consumiciondet cons) {
		String q = " delete from consumiciondet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cons.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Consumiciondet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}