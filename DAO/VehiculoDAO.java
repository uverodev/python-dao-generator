package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import vista.*;

public class VehiculoDAO extends Thread {
	private Vehiculo vehi;
	public ArrayList<Vehiculo> resultadoVehiculo;

	@Override
	public void run() {
		try{
			actualizarVehiculo("");
		} catch (Exception e) {
			System.out.println("Error al generar Vehiculo");
		}
		yield();
	}

	public void actualizarVehiculo(String condicion) {
		resultadoVehiculo = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  vehiculo " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vehi = new Vehiculo(
						rs.getInt("ve_nro"),
						rs.getString("ve_detprod"),
						rs.getString("ve_nrochasis"),
						rs.getInt("ve_marca"),
						rs.getInt("ve_color"),
						rs.getInt("ve_procedencia"),
						rs.getInt("ve_modelo"),
						rs.getInt("ve_tipvehiculo"),
						rs.getInt("ve_anfabricacion"),
						rs.getInt("ve_importador"),
						rs.getInt("ve_cedverde"),
						rs.getInt("ve_cedmarron"),
						rs.getInt("ve_titulo"),
						rs.getInt("ve_chapa"),
						rs.getInt("ve_contrato"),
						rs.getInt("ve_otros"),
						rs.getString("ve_nromotor"),
						rs.getInt("ve_borrado"),
						rs.getInt("ve_vendido"),
						rs.getString("ve_cliente"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(vehi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Vehiculo vehi) {
		String q = " insert into vehiculo( ve_detprod,  ve_nrochasis,  ve_marca,  ve_color,  ve_procedencia,  ve_modelo,  ve_tipvehiculo,  ve_anfabricacion,  ve_importador,  ve_cedverde,  ve_cedmarron,  ve_titulo,  ve_chapa,  ve_contrato,  ve_otros,  ve_nromotor,  ve_borrado,  ve_vendido,  ve_cliente,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vehi.getVe_detprod());
			ps.setString(2, vehi.getVe_nrochasis());
			ps.setInt(3, vehi.getVe_marca());
			ps.setInt(4, vehi.getVe_color());
			ps.setInt(5, vehi.getVe_procedencia());
			ps.setInt(6, vehi.getVe_modelo());
			ps.setInt(7, vehi.getVe_tipvehiculo());
			ps.setInt(8, vehi.getVe_anfabricacion());
			ps.setInt(9, vehi.getVe_importador());
			ps.setInt(10, vehi.getVe_cedverde());
			ps.setInt(11, vehi.getVe_cedmarron());
			ps.setInt(12, vehi.getVe_titulo());
			ps.setInt(13, vehi.getVe_chapa());
			ps.setInt(14, vehi.getVe_contrato());
			ps.setInt(15, vehi.getVe_otros());
			ps.setString(16, vehi.getVe_nromotor());
			ps.setInt(17, vehi.getVe_borrado());
			ps.setInt(18, vehi.getVe_vendido());
			ps.setString(19, vehi.getVe_cliente());
			ps.setString(20, vehi.getFechasct());
			ps.setInt(21, vehi.getUsuariosct());
			ps.setString(22, vehi.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Vehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Vehiculo vehi) {
		String q = " update vehiculo set  ve_detprod=?,  ve_nrochasis=?,  ve_marca=?,  ve_color=?,  ve_procedencia=?,  ve_modelo=?,  ve_tipvehiculo=?,  ve_anfabricacion=?,  ve_importador=?,  ve_cedverde=?,  ve_cedmarron=?,  ve_titulo=?,  ve_chapa=?,  ve_contrato=?,  ve_otros=?,  ve_nromotor=?,  ve_borrado=?,  ve_vendido=?,  ve_cliente=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vehi.getVe_detprod());
			ps.setString(2, vehi.getVe_nrochasis());
			ps.setInt(3, vehi.getVe_marca());
			ps.setInt(4, vehi.getVe_color());
			ps.setInt(5, vehi.getVe_procedencia());
			ps.setInt(6, vehi.getVe_modelo());
			ps.setInt(7, vehi.getVe_tipvehiculo());
			ps.setInt(8, vehi.getVe_anfabricacion());
			ps.setInt(9, vehi.getVe_importador());
			ps.setInt(10, vehi.getVe_cedverde());
			ps.setInt(11, vehi.getVe_cedmarron());
			ps.setInt(12, vehi.getVe_titulo());
			ps.setInt(13, vehi.getVe_chapa());
			ps.setInt(14, vehi.getVe_contrato());
			ps.setInt(15, vehi.getVe_otros());
			ps.setString(16, vehi.getVe_nromotor());
			ps.setInt(17, vehi.getVe_borrado());
			ps.setInt(18, vehi.getVe_vendido());
			ps.setString(19, vehi.getVe_cliente());
			ps.setString(20, vehi.getFechasct());
			ps.setInt(21, vehi.getUsuariosct());
			ps.setString(22, vehi.getMaquinasct());
			ps.setInt(23, vehi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Vehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Vehiculo vehi) {
		String q = " delete from vehiculo where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vehi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Vehiculo", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}