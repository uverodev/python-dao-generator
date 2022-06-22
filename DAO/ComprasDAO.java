package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Compras;
import vista.*;

public class ComprasDAO extends Thread {
	private Compras comp;
	public ArrayList<Compras> resultadoCompras;

	@Override
	public void run() {
		try{
			actualizarCompras("");
		} catch (Exception e) {
			System.out.println("Error al generar Compras");
		}
		yield();
	}

	public void actualizarCompras(String condicion) {
		resultadoCompras = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  compras " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				comp = new Compras(
						rs.getInt("id"),
						rs.getString("facturanum"),
						rs.getString("fecha"),
						rs.getInt("total"),
						rs.getInt("iva"),
						rs.getString("estado"),
						rs.getInt("idcategorias"),
						rs.getInt("idProveedor"),
						rs.getInt("idUsuarios")
			);
			arr.add(comp);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Compras comp) {
		String q = " insert into compras( facturanum,  fecha,  total,  iva,  estado,  idcategorias,  idProveedor,  idUsuarios) values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getFacturanum());
			ps.setString(2, comp.getFecha());
			ps.setInt(3, comp.getTotal());
			ps.setInt(4, comp.getIva());
			ps.setString(5, comp.getEstado());
			ps.setInt(6, comp.getIdcategorias());
			ps.setInt(7, comp.getIdproveedor());
			ps.setInt(8, comp.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Compras", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Compras comp) {
		String q = " update compras set  facturanum=?,  fecha=?,  total=?,  iva=?,  estado=?,  idcategorias=?,  idProveedor=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, comp.getFacturanum());
			ps.setString(2, comp.getFecha());
			ps.setInt(3, comp.getTotal());
			ps.setInt(4, comp.getIva());
			ps.setString(5, comp.getEstado());
			ps.setInt(6, comp.getIdcategorias());
			ps.setInt(7, comp.getIdproveedor());
			ps.setInt(8, comp.getIdusuarios());
			ps.setInt(9, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Compras", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Compras comp) {
		String q = " delete from compras where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, comp.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Compras", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}