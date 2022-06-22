package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Categorias;
import vista.*;

public class CategoriasDAO extends Thread {
	private Categorias cate;
	public ArrayList<Categorias> resultadoCategorias;

	@Override
	public void run() {
		try{
			actualizarCategorias("");
		} catch (Exception e) {
			System.out.println("Error al generar Categorias");
		}
		yield();
	}

	public void actualizarCategorias(String condicion) {
		resultadoCategorias = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  categorias " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cate = new Categorias(
						rs.getInt("cat_cod"),
						rs.getString("cat_descri"),
						rs.getDouble("cat_por1"),
						rs.getDouble("cat_por2"),
						rs.getDouble("cat_por3"),
						rs.getDouble("cat_por4"),
						rs.getDouble("cat_comisioncreex"),
						rs.getDouble("cat_pracomisioncreex"),
						rs.getDouble("cat_pracomisionex"),
						rs.getDouble("cat_comisionex"),
						rs.getDouble("cat_comisioncre"),
						rs.getDouble("cat_pracomisioncre"),
						rs.getDouble("cat_pracomision"),
						rs.getDouble("cat_comision")
			);
			arr.add(cate);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Categorias cate) {
		String q = " insert into categorias( cat_descri,  cat_por1,  cat_por2,  cat_por3,  cat_por4,  cat_comisioncreex,  cat_pracomisioncreex,  cat_pracomisionex,  cat_comisionex,  cat_comisioncre,  cat_pracomisioncre,  cat_pracomision,  cat_comision) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cate.getCat_descri());
			ps.setDouble(2, cate.getCat_por1());
			ps.setDouble(3, cate.getCat_por2());
			ps.setDouble(4, cate.getCat_por3());
			ps.setDouble(5, cate.getCat_por4());
			ps.setDouble(6, cate.getCat_comisioncreex());
			ps.setDouble(7, cate.getCat_pracomisioncreex());
			ps.setDouble(8, cate.getCat_pracomisionex());
			ps.setDouble(9, cate.getCat_comisionex());
			ps.setDouble(10, cate.getCat_comisioncre());
			ps.setDouble(11, cate.getCat_pracomisioncre());
			ps.setDouble(12, cate.getCat_pracomision());
			ps.setDouble(13, cate.getCat_comision());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Categorias cate) {
		String q = " update categorias set  cat_descri=?,  cat_por1=?,  cat_por2=?,  cat_por3=?,  cat_por4=?,  cat_comisioncreex=?,  cat_pracomisioncreex=?,  cat_pracomisionex=?,  cat_comisionex=?,  cat_comisioncre=?,  cat_pracomisioncre=?,  cat_pracomision=?,  cat_comision=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cate.getCat_descri());
			ps.setDouble(2, cate.getCat_por1());
			ps.setDouble(3, cate.getCat_por2());
			ps.setDouble(4, cate.getCat_por3());
			ps.setDouble(5, cate.getCat_por4());
			ps.setDouble(6, cate.getCat_comisioncreex());
			ps.setDouble(7, cate.getCat_pracomisioncreex());
			ps.setDouble(8, cate.getCat_pracomisionex());
			ps.setDouble(9, cate.getCat_comisionex());
			ps.setDouble(10, cate.getCat_comisioncre());
			ps.setDouble(11, cate.getCat_pracomisioncre());
			ps.setDouble(12, cate.getCat_pracomision());
			ps.setDouble(13, cate.getCat_comision());
			ps.setInt(14, cate.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Categorias cate) {
		String q = " delete from categorias where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cate.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Categorias", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}