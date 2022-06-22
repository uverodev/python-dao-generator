package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Procedencia;
import vista.*;

public class ProcedenciaDAO extends Thread {
	private Procedencia proc;
	public ArrayList<Procedencia> resultadoProcedencia;

	@Override
	public void run() {
		try{
			actualizarProcedencia("");
		} catch (Exception e) {
			System.out.println("Error al generar Procedencia");
		}
		yield();
	}

	public void actualizarProcedencia(String condicion) {
		resultadoProcedencia = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  procedencia " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				proc = new Procedencia(
						rs.getInt("prc_cod"),
						rs.getString("prc_descri"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getDouble("prc_descuento")
			);
			arr.add(proc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Procedencia proc) {
		String q = " insert into procedencia( prc_descri,  fechasct,  usuariosct,  maquinasct,  prc_descuento) values (?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, proc.getPrc_descri());
			ps.setString(2, proc.getFechasct());
			ps.setInt(3, proc.getUsuariosct());
			ps.setString(4, proc.getMaquinasct());
			ps.setDouble(5, proc.getPrc_descuento());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Procedencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Procedencia proc) {
		String q = " update procedencia set  prc_descri=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  prc_descuento=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, proc.getPrc_descri());
			ps.setString(2, proc.getFechasct());
			ps.setInt(3, proc.getUsuariosct());
			ps.setString(4, proc.getMaquinasct());
			ps.setDouble(5, proc.getPrc_descuento());
			ps.setInt(6, proc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Procedencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Procedencia proc) {
		String q = " delete from procedencia where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, proc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Procedencia", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}