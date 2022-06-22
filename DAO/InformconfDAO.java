package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Informconf;
import vista.*;

public class InformconfDAO extends Thread {
	private Informconf info;
	public ArrayList<Informconf> resultadoInformconf;

	@Override
	public void run() {
		try{
			actualizarInformconf("");
		} catch (Exception e) {
			System.out.println("Error al generar Informconf");
		}
		yield();
	}

	public void actualizarInformconf(String condicion) {
		resultadoInformconf = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  informconf " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				info = new Informconf(
						rs.getInt("inf_codigo"),
						rs.getString("inf_cliente"),
						rs.getString("inf_fechaingreso"),
						rs.getString("inf_fechasalida"),
						rs.getInt("inf_usuarioingreso"),
						rs.getInt("inf_usuariosalida"),
						rs.getString("inf_observacion"),
						rs.getInt("inf_estado")
			);
			arr.add(info);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Informconf info) {
		String q = " insert into informconf( inf_cliente,  inf_fechaingreso,  inf_fechasalida,  inf_usuarioingreso,  inf_usuariosalida,  inf_observacion,  inf_estado) values (?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, info.getInf_cliente());
			ps.setString(2, info.getInf_fechaingreso());
			ps.setString(3, info.getInf_fechasalida());
			ps.setInt(4, info.getInf_usuarioingreso());
			ps.setInt(5, info.getInf_usuariosalida());
			ps.setString(6, info.getInf_observacion());
			ps.setInt(7, info.getInf_estado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Informconf", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Informconf info) {
		String q = " update informconf set  inf_cliente=?,  inf_fechaingreso=?,  inf_fechasalida=?,  inf_usuarioingreso=?,  inf_usuariosalida=?,  inf_observacion=?,  inf_estado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, info.getInf_cliente());
			ps.setString(2, info.getInf_fechaingreso());
			ps.setString(3, info.getInf_fechasalida());
			ps.setInt(4, info.getInf_usuarioingreso());
			ps.setInt(5, info.getInf_usuariosalida());
			ps.setString(6, info.getInf_observacion());
			ps.setInt(7, info.getInf_estado());
			ps.setInt(8, info.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Informconf", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Informconf info) {
		String q = " delete from informconf where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, info.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Informconf", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}