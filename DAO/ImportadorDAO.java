package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Importador;
import vista.*;

public class ImportadorDAO extends Thread {
	private Importador impo;
	public ArrayList<Importador> resultadoImportador;

	@Override
	public void run() {
		try{
			actualizarImportador("");
		} catch (Exception e) {
			System.out.println("Error al generar Importador");
		}
		yield();
	}

	public void actualizarImportador(String condicion) {
		resultadoImportador = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  importador " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				impo = new Importador(
						rs.getInt("imp_cod"),
						rs.getString("imp_razon"),
						rs.getString("imp_telefono"),
						rs.getString("imp_direccion"),
						rs.getInt("imp_borrado"),
						rs.getInt("usuariosct"),
						rs.getString("fechasct"),
						rs.getString("maquinasct")
			);
			arr.add(impo);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Importador impo) {
		String q = " insert into importador( imp_razon,  imp_telefono,  imp_direccion,  imp_borrado,  usuariosct,  fechasct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, impo.getImp_razon());
			ps.setString(2, impo.getImp_telefono());
			ps.setString(3, impo.getImp_direccion());
			ps.setInt(4, impo.getImp_borrado());
			ps.setInt(5, impo.getUsuariosct());
			ps.setString(6, impo.getFechasct());
			ps.setString(7, impo.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Importador", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Importador impo) {
		String q = " update importador set  imp_razon=?,  imp_telefono=?,  imp_direccion=?,  imp_borrado=?,  usuariosct=?,  fechasct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, impo.getImp_razon());
			ps.setString(2, impo.getImp_telefono());
			ps.setString(3, impo.getImp_direccion());
			ps.setInt(4, impo.getImp_borrado());
			ps.setInt(5, impo.getUsuariosct());
			ps.setString(6, impo.getFechasct());
			ps.setString(7, impo.getMaquinasct());
			ps.setInt(8, impo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Importador", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Importador impo) {
		String q = " delete from importador where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, impo.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Importador", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}