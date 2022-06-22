package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Recepcionhotel;
import vista.*;

public class RecepcionhotelDAO extends Thread {
	private Recepcionhotel rece;
	public ArrayList<Recepcionhotel> resultadoRecepcionhotel;

	@Override
	public void run() {
		try{
			actualizarRecepcionhotel("");
		} catch (Exception e) {
			System.out.println("Error al generar Recepcionhotel");
		}
		yield();
	}

	public void actualizarRecepcionhotel(String condicion) {
		resultadoRecepcionhotel = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  recepcionhotel " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				rece = new Recepcionhotel(
						rs.getInt("rec_codigo"),
						rs.getInt("rec_estado"),
						rs.getString("rec_fechaingreso"),
						rs.getString("rec_horaingreso"),
						rs.getString("rec_fechasalida"),
						rs.getString("rec_horasalida"),
						rs.getString("rec_fechasalidareal"),
						rs.getString("rec_horasalidareal"),
						rs.getInt("rec_habitaciones"),
						rs.getInt("rec_cantdias"),
						rs.getString("rec_fecha"),
						rs.getString("rec_hora"),
						rs.getDouble("rec_totalapagar"),
						rs.getDouble("rec_entregado"),
						rs.getDouble("rec_saldo"),
						rs.getDouble("rec_descuento"),
						rs.getDouble("rec_totalconsumicion"),
						rs.getDouble("rec_totalhospedaje"),
						rs.getDouble("rec_totalgastosvarios"),
						rs.getInt("rec_resnum"),
						rs.getInt("rec_borrado"),
						rs.getInt("rec_facturalegal"),
						rs.getDouble("rec_adicional"),
						rs.getInt("rec_numcarrito"),
						rs.getDouble("rec_costcarrito"),
						rs.getInt("rec_usuario")
			);
			arr.add(rece);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Recepcionhotel rece) {
		String q = " insert into recepcionhotel( rec_estado,  rec_fechaingreso,  rec_horaingreso,  rec_fechasalida,  rec_horasalida,  rec_fechasalidareal,  rec_horasalidareal,  rec_habitaciones,  rec_cantdias,  rec_fecha,  rec_hora,  rec_totalapagar,  rec_entregado,  rec_saldo,  rec_descuento,  rec_totalconsumicion,  rec_totalhospedaje,  rec_totalgastosvarios,  rec_resnum,  rec_borrado,  rec_facturalegal,  rec_adicional,  rec_numcarrito,  rec_costcarrito,  rec_usuario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rece.getRec_estado());
			ps.setString(2, rece.getRec_fechaingreso());
			ps.setString(3, rece.getRec_horaingreso());
			ps.setString(4, rece.getRec_fechasalida());
			ps.setString(5, rece.getRec_horasalida());
			ps.setString(6, rece.getRec_fechasalidareal());
			ps.setString(7, rece.getRec_horasalidareal());
			ps.setInt(8, rece.getRec_habitaciones());
			ps.setInt(9, rece.getRec_cantdias());
			ps.setString(10, rece.getRec_fecha());
			ps.setString(11, rece.getRec_hora());
			ps.setDouble(12, rece.getRec_totalapagar());
			ps.setDouble(13, rece.getRec_entregado());
			ps.setDouble(14, rece.getRec_saldo());
			ps.setDouble(15, rece.getRec_descuento());
			ps.setDouble(16, rece.getRec_totalconsumicion());
			ps.setDouble(17, rece.getRec_totalhospedaje());
			ps.setDouble(18, rece.getRec_totalgastosvarios());
			ps.setInt(19, rece.getRec_resnum());
			ps.setInt(20, rece.getRec_borrado());
			ps.setInt(21, rece.getRec_facturalegal());
			ps.setDouble(22, rece.getRec_adicional());
			ps.setInt(23, rece.getRec_numcarrito());
			ps.setDouble(24, rece.getRec_costcarrito());
			ps.setInt(25, rece.getRec_usuario());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Recepcionhotel", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Recepcionhotel rece) {
		String q = " update recepcionhotel set  rec_estado=?,  rec_fechaingreso=?,  rec_horaingreso=?,  rec_fechasalida=?,  rec_horasalida=?,  rec_fechasalidareal=?,  rec_horasalidareal=?,  rec_habitaciones=?,  rec_cantdias=?,  rec_fecha=?,  rec_hora=?,  rec_totalapagar=?,  rec_entregado=?,  rec_saldo=?,  rec_descuento=?,  rec_totalconsumicion=?,  rec_totalhospedaje=?,  rec_totalgastosvarios=?,  rec_resnum=?,  rec_borrado=?,  rec_facturalegal=?,  rec_adicional=?,  rec_numcarrito=?,  rec_costcarrito=?,  rec_usuario=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rece.getRec_estado());
			ps.setString(2, rece.getRec_fechaingreso());
			ps.setString(3, rece.getRec_horaingreso());
			ps.setString(4, rece.getRec_fechasalida());
			ps.setString(5, rece.getRec_horasalida());
			ps.setString(6, rece.getRec_fechasalidareal());
			ps.setString(7, rece.getRec_horasalidareal());
			ps.setInt(8, rece.getRec_habitaciones());
			ps.setInt(9, rece.getRec_cantdias());
			ps.setString(10, rece.getRec_fecha());
			ps.setString(11, rece.getRec_hora());
			ps.setDouble(12, rece.getRec_totalapagar());
			ps.setDouble(13, rece.getRec_entregado());
			ps.setDouble(14, rece.getRec_saldo());
			ps.setDouble(15, rece.getRec_descuento());
			ps.setDouble(16, rece.getRec_totalconsumicion());
			ps.setDouble(17, rece.getRec_totalhospedaje());
			ps.setDouble(18, rece.getRec_totalgastosvarios());
			ps.setInt(19, rece.getRec_resnum());
			ps.setInt(20, rece.getRec_borrado());
			ps.setInt(21, rece.getRec_facturalegal());
			ps.setDouble(22, rece.getRec_adicional());
			ps.setInt(23, rece.getRec_numcarrito());
			ps.setDouble(24, rece.getRec_costcarrito());
			ps.setInt(25, rece.getRec_usuario());
			ps.setInt(26, rece.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Recepcionhotel", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Recepcionhotel rece) {
		String q = " delete from recepcionhotel where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, rece.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Recepcionhotel", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}