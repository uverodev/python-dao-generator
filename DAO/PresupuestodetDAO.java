package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Presupuestodet;
import vista.*;

public class PresupuestodetDAO extends Thread {
	private Presupuestodet pres;
	public ArrayList<Presupuestodet> resultadoPresupuestodet;

	@Override
	public void run() {
		try{
			actualizarPresupuestodet("");
		} catch (Exception e) {
			System.out.println("Error al generar Presupuestodet");
		}
		yield();
	}

	public void actualizarPresupuestodet(String condicion) {
		resultadoPresupuestodet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  presupuestodet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				pres = new Presupuestodet(
						rs.getInt("prd_nro"),
						rs.getString("prd_codprod"),
						rs.getDouble("prd_cantidad"),
						rs.getInt("prd_unprod"),
						rs.getDouble("prd_preciov"),
						rs.getDouble("prd_preciovd"),
						rs.getDouble("prd_preciovr"),
						rs.getDouble("prd_preciovp"),
						rs.getDouble("prd_preciove"),
						rs.getDouble("prd_descuento"),
						rs.getInt("prd_unidadv"),
						rs.getString("prd_unidadcantv"),
						rs.getDouble("prd_total"),
						rs.getInt("prd_iva"),
						rs.getString("prd_lote")
			);
			arr.add(pres);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Presupuestodet pres) {
		String q = " insert into presupuestodet( prd_codprod,  prd_cantidad,  prd_unprod,  prd_preciov,  prd_preciovd,  prd_preciovr,  prd_preciovp,  prd_preciove,  prd_descuento,  prd_unidadv,  prd_unidadcantv,  prd_total,  prd_iva,  prd_lote) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pres.getPrd_codprod());
			ps.setDouble(2, pres.getPrd_cantidad());
			ps.setInt(3, pres.getPrd_unprod());
			ps.setDouble(4, pres.getPrd_preciov());
			ps.setDouble(5, pres.getPrd_preciovd());
			ps.setDouble(6, pres.getPrd_preciovr());
			ps.setDouble(7, pres.getPrd_preciovp());
			ps.setDouble(8, pres.getPrd_preciove());
			ps.setDouble(9, pres.getPrd_descuento());
			ps.setInt(10, pres.getPrd_unidadv());
			ps.setString(11, pres.getPrd_unidadcantv());
			ps.setDouble(12, pres.getPrd_total());
			ps.setInt(13, pres.getPrd_iva());
			ps.setString(14, pres.getPrd_lote());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Presupuestodet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Presupuestodet pres) {
		String q = " update presupuestodet set  prd_codprod=?,  prd_cantidad=?,  prd_unprod=?,  prd_preciov=?,  prd_preciovd=?,  prd_preciovr=?,  prd_preciovp=?,  prd_preciove=?,  prd_descuento=?,  prd_unidadv=?,  prd_unidadcantv=?,  prd_total=?,  prd_iva=?,  prd_lote=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, pres.getPrd_codprod());
			ps.setDouble(2, pres.getPrd_cantidad());
			ps.setInt(3, pres.getPrd_unprod());
			ps.setDouble(4, pres.getPrd_preciov());
			ps.setDouble(5, pres.getPrd_preciovd());
			ps.setDouble(6, pres.getPrd_preciovr());
			ps.setDouble(7, pres.getPrd_preciovp());
			ps.setDouble(8, pres.getPrd_preciove());
			ps.setDouble(9, pres.getPrd_descuento());
			ps.setInt(10, pres.getPrd_unidadv());
			ps.setString(11, pres.getPrd_unidadcantv());
			ps.setDouble(12, pres.getPrd_total());
			ps.setInt(13, pres.getPrd_iva());
			ps.setString(14, pres.getPrd_lote());
			ps.setInt(15, pres.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Presupuestodet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Presupuestodet pres) {
		String q = " delete from presupuestodet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, pres.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Presupuestodet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}