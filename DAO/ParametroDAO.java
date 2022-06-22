package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Parametro;
import vista.*;

public class ParametroDAO extends Thread {
	private Parametro para;
	public ArrayList<Parametro> resultadoParametro;

	@Override
	public void run() {
		try{
			actualizarParametro("");
		} catch (Exception e) {
			System.out.println("Error al generar Parametro");
		}
		yield();
	}

	public void actualizarParametro(String condicion) {
		resultadoParametro = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  parametro " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				para = new Parametro(
						rs.getString("par_razon"),
						rs.getString("par_ruc"),
						rs.getString("par_direc"),
						rs.getString("par_tel"),
						rs.getString("par_mem1"),
						rs.getString("par_mem2"),
						rs.getString("par_mem3"),
						rs.getString("par_memp"),
						rs.getString("par_memcb"),
						rs.getString("par_messa"),
						rs.getString("par_ciudad"),
						rs.getString("par_finfactura"),
						rs.getString("par_iniciofactura"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getString("par_ultmant"),
						rs.getString("par_base_transferencia"),
						rs.getInt("par_cod")
			);
			arr.add(para);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Parametro para) {
		String q = " insert into parametro( par_ruc,  par_direc,  par_tel,  par_mem1,  par_mem2,  par_mem3,  par_memp,  par_memcb,  par_messa,  par_ciudad,  par_finfactura,  par_iniciofactura,  fechasct,  usuariosct,  maquinasct,  par_ultmant,  par_base_transferencia,  par_cod) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, para.getPar_ruc());
			ps.setString(2, para.getPar_direc());
			ps.setString(3, para.getPar_tel());
			ps.setString(4, para.getPar_mem1());
			ps.setString(5, para.getPar_mem2());
			ps.setString(6, para.getPar_mem3());
			ps.setString(7, para.getPar_memp());
			ps.setString(8, para.getPar_memcb());
			ps.setString(9, para.getPar_messa());
			ps.setString(10, para.getPar_ciudad());
			ps.setString(11, para.getPar_finfactura());
			ps.setString(12, para.getPar_iniciofactura());
			ps.setString(13, para.getFechasct());
			ps.setInt(14, para.getUsuariosct());
			ps.setString(15, para.getMaquinasct());
			ps.setString(16, para.getPar_ultmant());
			ps.setString(17, para.getPar_base_transferencia());
			ps.setInt(18, para.getPar_cod());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Parametro", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Parametro para) {
		String q = " update parametro set  par_ruc=?,  par_direc=?,  par_tel=?,  par_mem1=?,  par_mem2=?,  par_mem3=?,  par_memp=?,  par_memcb=?,  par_messa=?,  par_ciudad=?,  par_finfactura=?,  par_iniciofactura=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  par_ultmant=?,  par_base_transferencia=?,  par_cod=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, para.getPar_ruc());
			ps.setString(2, para.getPar_direc());
			ps.setString(3, para.getPar_tel());
			ps.setString(4, para.getPar_mem1());
			ps.setString(5, para.getPar_mem2());
			ps.setString(6, para.getPar_mem3());
			ps.setString(7, para.getPar_memp());
			ps.setString(8, para.getPar_memcb());
			ps.setString(9, para.getPar_messa());
			ps.setString(10, para.getPar_ciudad());
			ps.setString(11, para.getPar_finfactura());
			ps.setString(12, para.getPar_iniciofactura());
			ps.setString(13, para.getFechasct());
			ps.setInt(14, para.getUsuariosct());
			ps.setString(15, para.getMaquinasct());
			ps.setString(16, para.getPar_ultmant());
			ps.setString(17, para.getPar_base_transferencia());
			ps.setInt(18, para.getPar_cod());
			ps.setInt(19, para.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Parametro", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Parametro para) {
		String q = " delete from parametro where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, para.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Parametro", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}