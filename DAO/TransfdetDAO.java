package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Transfdet;
import vista.*;

public class TransfdetDAO extends Thread {
	private Transfdet tran;
	public ArrayList<Transfdet> resultadoTransfdet;

	@Override
	public void run() {
		try{
			actualizarTransfdet("");
		} catch (Exception e) {
			System.out.println("Error al generar Transfdet");
		}
		yield();
	}

	public void actualizarTransfdet(String condicion) {
		resultadoTransfdet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  transfdet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				tran = new Transfdet(
						rs.getInt("trd_nro"),
						rs.getString("trd_codprod"),
						rs.getDouble("trd_cantidad"),
						rs.getInt("trd_unprod"),
						rs.getDouble("trd_preciov"),
						rs.getDouble("trd_total"),
						rs.getInt("trd_iva"),
						rs.getString("trd_lote"),
						rs.getInt("trd_borrado"),
						rs.getInt("trd_deposito"),
						rs.getInt("trd_id"),
						rs.getObject("trd_vencimiento"),
						rs.getInt("trd_antesderecibir")
			);
			arr.add(tran);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Transfdet tran) {
		String q = " insert into transfdet( trd_codprod,  trd_cantidad,  trd_unprod,  trd_preciov,  trd_total,  trd_iva,  trd_lote,  trd_borrado,  trd_deposito,  trd_id,  trd_vencimiento,  trd_antesderecibir) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTrd_codprod());
			ps.setDouble(2, tran.getTrd_cantidad());
			ps.setInt(3, tran.getTrd_unprod());
			ps.setDouble(4, tran.getTrd_preciov());
			ps.setDouble(5, tran.getTrd_total());
			ps.setInt(6, tran.getTrd_iva());
			ps.setString(7, tran.getTrd_lote());
			ps.setInt(8, tran.getTrd_borrado());
			ps.setInt(9, tran.getTrd_deposito());
			ps.setInt(10, tran.getTrd_id());
			ps.setObject(11, tran.getTrd_vencimiento());
			ps.setInt(12, tran.getTrd_antesderecibir());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Transfdet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Transfdet tran) {
		String q = " update transfdet set  trd_codprod=?,  trd_cantidad=?,  trd_unprod=?,  trd_preciov=?,  trd_total=?,  trd_iva=?,  trd_lote=?,  trd_borrado=?,  trd_deposito=?,  trd_id=?,  trd_vencimiento=?,  trd_antesderecibir=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, tran.getTrd_codprod());
			ps.setDouble(2, tran.getTrd_cantidad());
			ps.setInt(3, tran.getTrd_unprod());
			ps.setDouble(4, tran.getTrd_preciov());
			ps.setDouble(5, tran.getTrd_total());
			ps.setInt(6, tran.getTrd_iva());
			ps.setString(7, tran.getTrd_lote());
			ps.setInt(8, tran.getTrd_borrado());
			ps.setInt(9, tran.getTrd_deposito());
			ps.setInt(10, tran.getTrd_id());
			ps.setObject(11, tran.getTrd_vencimiento());
			ps.setInt(12, tran.getTrd_antesderecibir());
			ps.setInt(13, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Transfdet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Transfdet tran) {
		String q = " delete from transfdet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, tran.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Transfdet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}