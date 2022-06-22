package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Datoshechauka;
import vista.*;

public class DatoshechaukaDAO extends Thread {
	private Datoshechauka dato;
	public ArrayList<Datoshechauka> resultadoDatoshechauka;

	@Override
	public void run() {
		try{
			actualizarDatoshechauka("");
		} catch (Exception e) {
			System.out.println("Error al generar Datoshechauka");
		}
		yield();
	}

	public void actualizarDatoshechauka(String condicion) {
		resultadoDatoshechauka = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  datoshechauka " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				dato = new Datoshechauka(
						rs.getInt("dth_id"),
						rs.getObject("dth_ruccontribuyente"),
						rs.getInt("dth_dvcontribuyente"),
						rs.getObject("dth_nombrecontribuyente"),
						rs.getObject("dth_ruclegal"),
						rs.getInt("dth_dvlegal"),
						rs.getObject("dth_nombrelegal")
			);
			arr.add(dato);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Datoshechauka dato) {
		String q = " insert into datoshechauka( dth_ruccontribuyente,  dth_dvcontribuyente,  dth_nombrecontribuyente,  dth_ruclegal,  dth_dvlegal,  dth_nombrelegal) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, dato.getDth_ruccontribuyente());
			ps.setInt(2, dato.getDth_dvcontribuyente());
			ps.setObject(3, dato.getDth_nombrecontribuyente());
			ps.setObject(4, dato.getDth_ruclegal());
			ps.setInt(5, dato.getDth_dvlegal());
			ps.setObject(6, dato.getDth_nombrelegal());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Datoshechauka", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Datoshechauka dato) {
		String q = " update datoshechauka set  dth_ruccontribuyente=?,  dth_dvcontribuyente=?,  dth_nombrecontribuyente=?,  dth_ruclegal=?,  dth_dvlegal=?,  dth_nombrelegal=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, dato.getDth_ruccontribuyente());
			ps.setInt(2, dato.getDth_dvcontribuyente());
			ps.setObject(3, dato.getDth_nombrecontribuyente());
			ps.setObject(4, dato.getDth_ruclegal());
			ps.setInt(5, dato.getDth_dvlegal());
			ps.setObject(6, dato.getDth_nombrelegal());
			ps.setInt(7, dato.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Datoshechauka", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Datoshechauka dato) {
		String q = " delete from datoshechauka where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, dato.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Datoshechauka", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}