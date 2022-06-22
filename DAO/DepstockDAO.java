package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Depstock;
import vista.*;

public class DepstockDAO extends Thread {
	private Depstock deps;
	public ArrayList<Depstock> resultadoDepstock;

	@Override
	public void run() {
		try{
			actualizarDepstock("");
		} catch (Exception e) {
			System.out.println("Error al generar Depstock");
		}
		yield();
	}

	public void actualizarDepstock(String condicion) {
		resultadoDepstock = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  depstock " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				deps = new Depstock(
						rs.getInt("sto_nro"),
						rs.getString("sto_codprod"),
						rs.getDouble("sto_cantidad"),
						rs.getDouble("sto_precompra"),
						rs.getString("sto_lote"),
						rs.getString("sto_vencimiento"),
						rs.getInt("sto_deposito"),
						rs.getInt("sto_borrado"),
						rs.getString("sto_fecha"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("sto_verifica")
			);
			arr.add(deps);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Depstock deps) {
		String q = " insert into depstock( sto_codprod,  sto_cantidad,  sto_precompra,  sto_lote,  sto_vencimiento,  sto_deposito,  sto_borrado,  sto_fecha,  fechasct,  usuariosct,  maquinasct,  sto_verifica) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, deps.getSto_codprod());
			ps.setDouble(2, deps.getSto_cantidad());
			ps.setDouble(3, deps.getSto_precompra());
			ps.setString(4, deps.getSto_lote());
			ps.setString(5, deps.getSto_vencimiento());
			ps.setInt(6, deps.getSto_deposito());
			ps.setInt(7, deps.getSto_borrado());
			ps.setString(8, deps.getSto_fecha());
			ps.setString(9, deps.getFechasct());
			ps.setInt(10, deps.getUsuariosct());
			ps.setString(11, deps.getMaquinasct());
			ps.setInt(12, deps.getSto_verifica());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Depstock", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Depstock deps) {
		String q = " update depstock set  sto_codprod=?,  sto_cantidad=?,  sto_precompra=?,  sto_lote=?,  sto_vencimiento=?,  sto_deposito=?,  sto_borrado=?,  sto_fecha=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  sto_verifica=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, deps.getSto_codprod());
			ps.setDouble(2, deps.getSto_cantidad());
			ps.setDouble(3, deps.getSto_precompra());
			ps.setString(4, deps.getSto_lote());
			ps.setString(5, deps.getSto_vencimiento());
			ps.setInt(6, deps.getSto_deposito());
			ps.setInt(7, deps.getSto_borrado());
			ps.setString(8, deps.getSto_fecha());
			ps.setString(9, deps.getFechasct());
			ps.setInt(10, deps.getUsuariosct());
			ps.setString(11, deps.getMaquinasct());
			ps.setInt(12, deps.getSto_verifica());
			ps.setInt(13, deps.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Depstock", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Depstock deps) {
		String q = " delete from depstock where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, deps.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Depstock", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}