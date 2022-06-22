package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Proveedores;
import vista.*;

public class ProveedoresDAO extends Thread {
	private Proveedores prov;
	public ArrayList<Proveedores> resultadoProveedores;

	@Override
	public void run() {
		try{
			actualizarProveedores("");
		} catch (Exception e) {
			System.out.println("Error al generar Proveedores");
		}
		yield();
	}

	public void actualizarProveedores(String condicion) {
		resultadoProveedores = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  proveedores " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prov = new Proveedores(
						rs.getInt("prov_cod"),
						rs.getString("prov_descr"),
						rs.getString("prov_telef"),
						rs.getString("prov_fax"),
						rs.getString("prov_email"),
						rs.getString("prov_ciuda"),
						rs.getString("prov_direc"),
						rs.getString("prov_conta"),
						rs.getString("prov_obs"),
						rs.getString("prov_ruc"),
						rs.getString("prov_dv"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("prov_borrado"),
						rs.getInt("prov_plazo")
			);
			arr.add(prov);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Proveedores prov) {
		String q = " insert into proveedores( prov_descr,  prov_telef,  prov_fax,  prov_email,  prov_ciuda,  prov_direc,  prov_conta,  prov_obs,  prov_ruc,  prov_dv,  fechasct,  usuariosct,  maquinasct,  prov_borrado,  prov_plazo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prov.getProv_descr());
			ps.setString(2, prov.getProv_telef());
			ps.setString(3, prov.getProv_fax());
			ps.setString(4, prov.getProv_email());
			ps.setString(5, prov.getProv_ciuda());
			ps.setString(6, prov.getProv_direc());
			ps.setString(7, prov.getProv_conta());
			ps.setString(8, prov.getProv_obs());
			ps.setString(9, prov.getProv_ruc());
			ps.setString(10, prov.getProv_dv());
			ps.setString(11, prov.getFechasct());
			ps.setInt(12, prov.getUsuariosct());
			ps.setString(13, prov.getMaquinasct());
			ps.setInt(14, prov.getProv_borrado());
			ps.setInt(15, prov.getProv_plazo());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Proveedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Proveedores prov) {
		String q = " update proveedores set  prov_descr=?,  prov_telef=?,  prov_fax=?,  prov_email=?,  prov_ciuda=?,  prov_direc=?,  prov_conta=?,  prov_obs=?,  prov_ruc=?,  prov_dv=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  prov_borrado=?,  prov_plazo=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prov.getProv_descr());
			ps.setString(2, prov.getProv_telef());
			ps.setString(3, prov.getProv_fax());
			ps.setString(4, prov.getProv_email());
			ps.setString(5, prov.getProv_ciuda());
			ps.setString(6, prov.getProv_direc());
			ps.setString(7, prov.getProv_conta());
			ps.setString(8, prov.getProv_obs());
			ps.setString(9, prov.getProv_ruc());
			ps.setString(10, prov.getProv_dv());
			ps.setString(11, prov.getFechasct());
			ps.setInt(12, prov.getUsuariosct());
			ps.setString(13, prov.getMaquinasct());
			ps.setInt(14, prov.getProv_borrado());
			ps.setInt(15, prov.getProv_plazo());
			ps.setInt(16, prov.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Proveedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Proveedores prov) {
		String q = " delete from proveedores where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prov.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Proveedores", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}