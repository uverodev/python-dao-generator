package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cabeceradesglose;
import vista.*;

public class CabeceradesgloseDAO extends Thread {
	private Cabeceradesglose cabe;
	public ArrayList<Cabeceradesglose> resultadoCabeceradesglose;

	@Override
	public void run() {
		try{
			actualizarCabeceradesglose("");
		} catch (Exception e) {
			System.out.println("Error al generar Cabeceradesglose");
		}
		yield();
	}

	public void actualizarCabeceradesglose(String condicion) {
		resultadoCabeceradesglose = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  cabeceradesglose " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cabe = new Cabeceradesglose(
						rs.getInt("dg_codigo"),
						rs.getObject("dg_codprod"),
						rs.getDouble("dg_cantidadusada"),
						rs.getInt("dg_usuario"),
						rs.getInt("dg_borrado"),
						rs.getString("dg_fecha"),
						rs.getObject("dg_pc")
			);
			arr.add(cabe);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Cabeceradesglose cabe) {
		String q = " insert into cabeceradesglose( dg_codprod,  dg_cantidadusada,  dg_usuario,  dg_borrado,  dg_fecha,  dg_pc) values (?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, cabe.getDg_codprod());
			ps.setDouble(2, cabe.getDg_cantidadusada());
			ps.setInt(3, cabe.getDg_usuario());
			ps.setInt(4, cabe.getDg_borrado());
			ps.setString(5, cabe.getDg_fecha());
			ps.setObject(6, cabe.getDg_pc());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Cabeceradesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Cabeceradesglose cabe) {
		String q = " update cabeceradesglose set  dg_codprod=?,  dg_cantidadusada=?,  dg_usuario=?,  dg_borrado=?,  dg_fecha=?,  dg_pc=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setObject(1, cabe.getDg_codprod());
			ps.setDouble(2, cabe.getDg_cantidadusada());
			ps.setInt(3, cabe.getDg_usuario());
			ps.setInt(4, cabe.getDg_borrado());
			ps.setString(5, cabe.getDg_fecha());
			ps.setObject(6, cabe.getDg_pc());
			ps.setInt(7, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Cabeceradesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Cabeceradesglose cabe) {
		String q = " delete from cabeceradesglose where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cabe.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Cabeceradesglose", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}