package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Judiciales;
import vista.*;

public class JudicialesDAO extends Thread {
	private Judiciales judi;
	public ArrayList<Judiciales> resultadoJudiciales;

	@Override
	public void run() {
		try{
			actualizarJudiciales("");
		} catch (Exception e) {
			System.out.println("Error al generar Judiciales");
		}
		yield();
	}

	public void actualizarJudiciales(String condicion) {
		resultadoJudiciales = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  judiciales " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				judi = new Judiciales(
						rs.getInt("ju_nro"),
						rs.getString("ju_fecha"),
						rs.getString("ju_hora"),
						rs.getDouble("ju_monto"),
						rs.getInt("ju_tipoperacion"),
						rs.getInt("ju_usuario"),
						rs.getInt("ju_cuota"),
						rs.getInt("ju_borrado"),
						rs.getString("ju_cliente"),
						rs.getString("ju_observacion"),
						rs.getDouble("ju_entrega"),
						rs.getInt("ju_pagado"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(judi);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Judiciales judi) {
		String q = " insert into judiciales( ju_fecha,  ju_hora,  ju_monto,  ju_tipoperacion,  ju_usuario,  ju_cuota,  ju_borrado,  ju_cliente,  ju_observacion,  ju_entrega,  ju_pagado,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, judi.getJu_fecha());
			ps.setString(2, judi.getJu_hora());
			ps.setDouble(3, judi.getJu_monto());
			ps.setInt(4, judi.getJu_tipoperacion());
			ps.setInt(5, judi.getJu_usuario());
			ps.setInt(6, judi.getJu_cuota());
			ps.setInt(7, judi.getJu_borrado());
			ps.setString(8, judi.getJu_cliente());
			ps.setString(9, judi.getJu_observacion());
			ps.setDouble(10, judi.getJu_entrega());
			ps.setInt(11, judi.getJu_pagado());
			ps.setString(12, judi.getFechasct());
			ps.setInt(13, judi.getUsuariosct());
			ps.setString(14, judi.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Judiciales", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Judiciales judi) {
		String q = " update judiciales set  ju_fecha=?,  ju_hora=?,  ju_monto=?,  ju_tipoperacion=?,  ju_usuario=?,  ju_cuota=?,  ju_borrado=?,  ju_cliente=?,  ju_observacion=?,  ju_entrega=?,  ju_pagado=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, judi.getJu_fecha());
			ps.setString(2, judi.getJu_hora());
			ps.setDouble(3, judi.getJu_monto());
			ps.setInt(4, judi.getJu_tipoperacion());
			ps.setInt(5, judi.getJu_usuario());
			ps.setInt(6, judi.getJu_cuota());
			ps.setInt(7, judi.getJu_borrado());
			ps.setString(8, judi.getJu_cliente());
			ps.setString(9, judi.getJu_observacion());
			ps.setDouble(10, judi.getJu_entrega());
			ps.setInt(11, judi.getJu_pagado());
			ps.setString(12, judi.getFechasct());
			ps.setInt(13, judi.getUsuariosct());
			ps.setString(14, judi.getMaquinasct());
			ps.setInt(15, judi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Judiciales", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Judiciales judi) {
		String q = " delete from judiciales where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, judi.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Judiciales", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}