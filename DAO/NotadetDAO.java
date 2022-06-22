package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Notadet;
import vista.*;

public class NotadetDAO extends Thread {
	private Notadet nota;
	public ArrayList<Notadet> resultadoNotadet;

	@Override
	public void run() {
		try{
			actualizarNotadet("");
		} catch (Exception e) {
			System.out.println("Error al generar Notadet");
		}
		yield();
	}

	public void actualizarNotadet(String condicion) {
		resultadoNotadet = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  notadet " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				nota = new Notadet(
						rs.getInt("nd_nro"),
						rs.getInt("nd_nronota"),
						rs.getString("nd_codprod"),
						rs.getDouble("nd_cantanterior"),
						rs.getDouble("nd_cantactual"),
						rs.getDouble("nd_cantdevuelto"),
						rs.getString("nd_lote"),
						rs.getDouble("nd_precio"),
						rs.getInt("nd_cierre"),
						rs.getInt("nd_nrocierre")
			);
			arr.add(nota);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Notadet nota) {
		String q = " insert into notadet( nd_nronota,  nd_codprod,  nd_cantanterior,  nd_cantactual,  nd_cantdevuelto,  nd_lote,  nd_precio,  nd_cierre,  nd_nrocierre) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, nota.getNd_nronota());
			ps.setString(2, nota.getNd_codprod());
			ps.setDouble(3, nota.getNd_cantanterior());
			ps.setDouble(4, nota.getNd_cantactual());
			ps.setDouble(5, nota.getNd_cantdevuelto());
			ps.setString(6, nota.getNd_lote());
			ps.setDouble(7, nota.getNd_precio());
			ps.setInt(8, nota.getNd_cierre());
			ps.setInt(9, nota.getNd_nrocierre());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Notadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Notadet nota) {
		String q = " update notadet set  nd_nronota=?,  nd_codprod=?,  nd_cantanterior=?,  nd_cantactual=?,  nd_cantdevuelto=?,  nd_lote=?,  nd_precio=?,  nd_cierre=?,  nd_nrocierre=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, nota.getNd_nronota());
			ps.setString(2, nota.getNd_codprod());
			ps.setDouble(3, nota.getNd_cantanterior());
			ps.setDouble(4, nota.getNd_cantactual());
			ps.setDouble(5, nota.getNd_cantdevuelto());
			ps.setString(6, nota.getNd_lote());
			ps.setDouble(7, nota.getNd_precio());
			ps.setInt(8, nota.getNd_cierre());
			ps.setInt(9, nota.getNd_nrocierre());
			ps.setInt(10, nota.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Notadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Notadet nota) {
		String q = " delete from notadet where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, nota.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Notadet", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}