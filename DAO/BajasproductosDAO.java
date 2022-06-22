package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Bajasproductos;
import vista.*;

public class BajasproductosDAO extends Thread {
	private Bajasproductos baja;
	public ArrayList<Bajasproductos> resultadoBajasproductos;

	@Override
	public void run() {
		try{
			actualizarBajasproductos("");
		} catch (Exception e) {
			System.out.println("Error al generar Bajasproductos");
		}
		yield();
	}

	public void actualizarBajasproductos(String condicion) {
		resultadoBajasproductos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  bajasproductos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				baja = new Bajasproductos(
						rs.getInt("id"),
						rs.getString("fecha"),
						rs.getString("motivo"),
						rs.getInt("cantidad"),
						rs.getInt("idProducto"),
						rs.getInt("idLote"),
						rs.getInt("idUsuarios")
			);
			arr.add(baja);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Bajasproductos baja) {
		String q = " insert into bajasproductos( fecha,  motivo,  cantidad,  idProducto,  idLote,  idUsuarios) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, baja.getFecha());
			ps.setString(2, baja.getMotivo());
			ps.setInt(3, baja.getCantidad());
			ps.setInt(4, baja.getIdproducto());
			ps.setInt(5, baja.getIdlote());
			ps.setInt(6, baja.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Bajasproductos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Bajasproductos baja) {
		String q = " update bajasproductos set  fecha=?,  motivo=?,  cantidad=?,  idProducto=?,  idLote=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, baja.getFecha());
			ps.setString(2, baja.getMotivo());
			ps.setInt(3, baja.getCantidad());
			ps.setInt(4, baja.getIdproducto());
			ps.setInt(5, baja.getIdlote());
			ps.setInt(6, baja.getIdusuarios());
			ps.setInt(7, baja.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Bajasproductos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Bajasproductos baja) {
		String q = " delete from bajasproductos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, baja.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Bajasproductos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}