package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Tipo_cant;
import vista.*;

public class Tipo_cantDAO extends Thread {
	private Tipo_cant tipo;
	public ArrayList<Tipo_cant> resultadoTipo_cant;

	@Override
	public void run() {
		try{
			actualizarTipo_cant("");
		} catch (Exception e) {
			System.out.println("Error al generar Tipo_cant");
		}
		yield();
	}

	public void actualizarTipo_cant(String condicion) {
		resultadoTipo_cant = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  tipo_cant " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tipo = new Tipo_cant(
						rs.getInt("cant_nro"),
						rs.getString("cant_prod"),
						rs.getInt("cant_codund"),
						rs.getDouble("cant_cant"),
						rs.getInt("cant_codinter")
			);
			arr.add(tipo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Tipo_cant tipo) {
		String q = " insert into tipo_cant( cant_prod,  cant_codund,  cant_cant,  cant_codinter) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tipo.getCant_prod());
			ps.setInt(2, tipo.getCant_codund());
			ps.setDouble(3, tipo.getCant_cant());
			ps.setInt(4, tipo.getCant_codinter());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Tipo_cant", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Tipo_cant tipo) {
		String q = " update tipo_cant set  cant_prod=?,  cant_codund=?,  cant_cant=?,  cant_codinter=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tipo.getCant_prod());
			ps.setInt(2, tipo.getCant_codund());
			ps.setDouble(3, tipo.getCant_cant());
			ps.setInt(4, tipo.getCant_codinter());
			ps.setInt(5, tipo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Tipo_cant", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Tipo_cant tipo) {
		String q = " delete from tipo_cant where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tipo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Tipo_cant", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}