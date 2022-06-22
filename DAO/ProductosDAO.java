package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Productos;
import vista.*;

public class ProductosDAO extends Thread {
	private Productos prod;
	public ArrayList<Productos> resultadoProductos;

	@Override
	public void run() {
		try{
			actualizarProductos("");
		} catch (Exception e) {
			System.out.println("Error al generar Productos");
		}
		yield();
	}

	public void actualizarProductos(String condicion) {
		resultadoProductos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  productos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				prod = new Productos(
						rs.getInt("pro_codigo"),
						rs.getString("pro_composicion"),
						rs.getString("pro_codori"),
						rs.getString("pro_detalle"),
						rs.getString("pro_vencimient"),
						rs.getString("pro_aplicacion"),
						rs.getInt("pro_ubicacion"),
						rs.getDouble("pro_minimo"),
						rs.getDouble("pro_costomayorista"),
						rs.getDouble("pro_costoult"),
						rs.getDouble("pro_coststo"),
						rs.getDouble("pro_coststod"),
						rs.getDouble("pro_coststor"),
						rs.getDouble("pro_coststoe"),
						rs.getDouble("pro_coststop"),
						rs.getDouble("pro_stockult"),
						rs.getDouble("pro_stockfec"),
						rs.getDouble("pro_stock"),
						rs.getDouble("pro_venta1"),
						rs.getDouble("pro_venta1d"),
						rs.getDouble("pro_venta1r"),
						rs.getDouble("pro_venta1p"),
						rs.getDouble("pro_venta1e"),
						rs.getDouble("pro_venta2"),
						rs.getDouble("pro_venta2d"),
						rs.getDouble("pro_venta2r"),
						rs.getDouble("pro_venta2p"),
						rs.getDouble("pro_venta2e"),
						rs.getDouble("pro_venta4"),
						rs.getDouble("pro_venta3"),
						rs.getDouble("pro_venta3d"),
						rs.getDouble("pro_venta3r"),
						rs.getDouble("pro_venta3p"),
						rs.getDouble("pro_venta3e"),
						rs.getString("pro_obs"),
						rs.getString("pro_foto"),
						rs.getInt("pro_categoria"),
						rs.getInt("pro_procedenc"),
						rs.getInt("pro_perece"),
						rs.getInt("pro_codlabo"),
						rs.getInt("pro_iva"),
						rs.getInt("pro_coddistri"),
						rs.getInt("pro_conpro"),
						rs.getInt("pro_valcopro"),
						rs.getInt("pro_valporce"),
						rs.getInt("pro_borrado"),
						rs.getInt("pro_unidad"),
						rs.getInt("pro_imppro"),
						rs.getInt("pro_vehiculo"),
						rs.getDouble("pro_porprecio"),
						rs.getInt("pro_codprov"),
						rs.getObject("pro_imagen"),
						rs.getInt("pro_marca"),
						rs.getInt("pro_tipo"),
						rs.getInt("pro_bien"),
						rs.getString("pro_area"),
						rs.getInt("pro_estado"),
						rs.getInt("pro_libre"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getInt("pro_contstock"),
						rs.getInt("pro_controlado"),
						rs.getInt("pro_modificarprecio"),
						rs.getInt("pro_insercantidad"),
						rs.getObject("pro_codsubproducto"),
						rs.getString("pro_senave"),
						rs.getString("pro_libre_senave")
			);
			arr.add(prod);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Productos prod) {
		String q = " insert into productos( pro_composicion,  pro_codori,  pro_detalle,  pro_vencimient,  pro_aplicacion,  pro_ubicacion,  pro_minimo,  pro_costomayorista,  pro_costoult,  pro_coststo,  pro_coststod,  pro_coststor,  pro_coststoe,  pro_coststop,  pro_stockult,  pro_stockfec,  pro_stock,  pro_venta1,  pro_venta1d,  pro_venta1r,  pro_venta1p,  pro_venta1e,  pro_venta2,  pro_venta2d,  pro_venta2r,  pro_venta2p,  pro_venta2e,  pro_venta4,  pro_venta3,  pro_venta3d,  pro_venta3r,  pro_venta3p,  pro_venta3e,  pro_obs,  pro_foto,  pro_categoria,  pro_procedenc,  pro_perece,  pro_codlabo,  pro_iva,  pro_coddistri,  pro_conpro,  pro_valcopro,  pro_valporce,  pro_borrado,  pro_unidad,  pro_imppro,  pro_vehiculo,  pro_porprecio,  pro_codprov,  pro_imagen,  pro_marca,  pro_tipo,  pro_bien,  pro_area,  pro_estado,  pro_libre,  fechasct,  usuariosct,  maquinasct,  pro_contstock,  pro_controlado,  pro_modificarprecio,  pro_insercantidad,  pro_codsubproducto,  pro_senave,  pro_libre_senave) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getPro_composicion());
			ps.setString(2, prod.getPro_codori());
			ps.setString(3, prod.getPro_detalle());
			ps.setString(4, prod.getPro_vencimient());
			ps.setString(5, prod.getPro_aplicacion());
			ps.setInt(6, prod.getPro_ubicacion());
			ps.setDouble(7, prod.getPro_minimo());
			ps.setDouble(8, prod.getPro_costomayorista());
			ps.setDouble(9, prod.getPro_costoult());
			ps.setDouble(10, prod.getPro_coststo());
			ps.setDouble(11, prod.getPro_coststod());
			ps.setDouble(12, prod.getPro_coststor());
			ps.setDouble(13, prod.getPro_coststoe());
			ps.setDouble(14, prod.getPro_coststop());
			ps.setDouble(15, prod.getPro_stockult());
			ps.setDouble(16, prod.getPro_stockfec());
			ps.setDouble(17, prod.getPro_stock());
			ps.setDouble(18, prod.getPro_venta1());
			ps.setDouble(19, prod.getPro_venta1d());
			ps.setDouble(20, prod.getPro_venta1r());
			ps.setDouble(21, prod.getPro_venta1p());
			ps.setDouble(22, prod.getPro_venta1e());
			ps.setDouble(23, prod.getPro_venta2());
			ps.setDouble(24, prod.getPro_venta2d());
			ps.setDouble(25, prod.getPro_venta2r());
			ps.setDouble(26, prod.getPro_venta2p());
			ps.setDouble(27, prod.getPro_venta2e());
			ps.setDouble(28, prod.getPro_venta4());
			ps.setDouble(29, prod.getPro_venta3());
			ps.setDouble(30, prod.getPro_venta3d());
			ps.setDouble(31, prod.getPro_venta3r());
			ps.setDouble(32, prod.getPro_venta3p());
			ps.setDouble(33, prod.getPro_venta3e());
			ps.setString(34, prod.getPro_obs());
			ps.setString(35, prod.getPro_foto());
			ps.setInt(36, prod.getPro_categoria());
			ps.setInt(37, prod.getPro_procedenc());
			ps.setInt(38, prod.getPro_perece());
			ps.setInt(39, prod.getPro_codlabo());
			ps.setInt(40, prod.getPro_iva());
			ps.setInt(41, prod.getPro_coddistri());
			ps.setInt(42, prod.getPro_conpro());
			ps.setInt(43, prod.getPro_valcopro());
			ps.setInt(44, prod.getPro_valporce());
			ps.setInt(45, prod.getPro_borrado());
			ps.setInt(46, prod.getPro_unidad());
			ps.setInt(47, prod.getPro_imppro());
			ps.setInt(48, prod.getPro_vehiculo());
			ps.setDouble(49, prod.getPro_porprecio());
			ps.setInt(50, prod.getPro_codprov());
			ps.setObject(51, prod.getPro_imagen());
			ps.setInt(52, prod.getPro_marca());
			ps.setInt(53, prod.getPro_tipo());
			ps.setInt(54, prod.getPro_bien());
			ps.setString(55, prod.getPro_area());
			ps.setInt(56, prod.getPro_estado());
			ps.setInt(57, prod.getPro_libre());
			ps.setString(58, prod.getFechasct());
			ps.setInt(59, prod.getUsuariosct());
			ps.setString(60, prod.getMaquinasct());
			ps.setInt(61, prod.getPro_contstock());
			ps.setInt(62, prod.getPro_controlado());
			ps.setInt(63, prod.getPro_modificarprecio());
			ps.setInt(64, prod.getPro_insercantidad());
			ps.setObject(65, prod.getPro_codsubproducto());
			ps.setString(66, prod.getPro_senave());
			ps.setString(67, prod.getPro_libre_senave());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Productos prod) {
		String q = " update productos set  pro_composicion=?,  pro_codori=?,  pro_detalle=?,  pro_vencimient=?,  pro_aplicacion=?,  pro_ubicacion=?,  pro_minimo=?,  pro_costomayorista=?,  pro_costoult=?,  pro_coststo=?,  pro_coststod=?,  pro_coststor=?,  pro_coststoe=?,  pro_coststop=?,  pro_stockult=?,  pro_stockfec=?,  pro_stock=?,  pro_venta1=?,  pro_venta1d=?,  pro_venta1r=?,  pro_venta1p=?,  pro_venta1e=?,  pro_venta2=?,  pro_venta2d=?,  pro_venta2r=?,  pro_venta2p=?,  pro_venta2e=?,  pro_venta4=?,  pro_venta3=?,  pro_venta3d=?,  pro_venta3r=?,  pro_venta3p=?,  pro_venta3e=?,  pro_obs=?,  pro_foto=?,  pro_categoria=?,  pro_procedenc=?,  pro_perece=?,  pro_codlabo=?,  pro_iva=?,  pro_coddistri=?,  pro_conpro=?,  pro_valcopro=?,  pro_valporce=?,  pro_borrado=?,  pro_unidad=?,  pro_imppro=?,  pro_vehiculo=?,  pro_porprecio=?,  pro_codprov=?,  pro_imagen=?,  pro_marca=?,  pro_tipo=?,  pro_bien=?,  pro_area=?,  pro_estado=?,  pro_libre=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  pro_contstock=?,  pro_controlado=?,  pro_modificarprecio=?,  pro_insercantidad=?,  pro_codsubproducto=?,  pro_senave=?,  pro_libre_senave=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, prod.getPro_composicion());
			ps.setString(2, prod.getPro_codori());
			ps.setString(3, prod.getPro_detalle());
			ps.setString(4, prod.getPro_vencimient());
			ps.setString(5, prod.getPro_aplicacion());
			ps.setInt(6, prod.getPro_ubicacion());
			ps.setDouble(7, prod.getPro_minimo());
			ps.setDouble(8, prod.getPro_costomayorista());
			ps.setDouble(9, prod.getPro_costoult());
			ps.setDouble(10, prod.getPro_coststo());
			ps.setDouble(11, prod.getPro_coststod());
			ps.setDouble(12, prod.getPro_coststor());
			ps.setDouble(13, prod.getPro_coststoe());
			ps.setDouble(14, prod.getPro_coststop());
			ps.setDouble(15, prod.getPro_stockult());
			ps.setDouble(16, prod.getPro_stockfec());
			ps.setDouble(17, prod.getPro_stock());
			ps.setDouble(18, prod.getPro_venta1());
			ps.setDouble(19, prod.getPro_venta1d());
			ps.setDouble(20, prod.getPro_venta1r());
			ps.setDouble(21, prod.getPro_venta1p());
			ps.setDouble(22, prod.getPro_venta1e());
			ps.setDouble(23, prod.getPro_venta2());
			ps.setDouble(24, prod.getPro_venta2d());
			ps.setDouble(25, prod.getPro_venta2r());
			ps.setDouble(26, prod.getPro_venta2p());
			ps.setDouble(27, prod.getPro_venta2e());
			ps.setDouble(28, prod.getPro_venta4());
			ps.setDouble(29, prod.getPro_venta3());
			ps.setDouble(30, prod.getPro_venta3d());
			ps.setDouble(31, prod.getPro_venta3r());
			ps.setDouble(32, prod.getPro_venta3p());
			ps.setDouble(33, prod.getPro_venta3e());
			ps.setString(34, prod.getPro_obs());
			ps.setString(35, prod.getPro_foto());
			ps.setInt(36, prod.getPro_categoria());
			ps.setInt(37, prod.getPro_procedenc());
			ps.setInt(38, prod.getPro_perece());
			ps.setInt(39, prod.getPro_codlabo());
			ps.setInt(40, prod.getPro_iva());
			ps.setInt(41, prod.getPro_coddistri());
			ps.setInt(42, prod.getPro_conpro());
			ps.setInt(43, prod.getPro_valcopro());
			ps.setInt(44, prod.getPro_valporce());
			ps.setInt(45, prod.getPro_borrado());
			ps.setInt(46, prod.getPro_unidad());
			ps.setInt(47, prod.getPro_imppro());
			ps.setInt(48, prod.getPro_vehiculo());
			ps.setDouble(49, prod.getPro_porprecio());
			ps.setInt(50, prod.getPro_codprov());
			ps.setObject(51, prod.getPro_imagen());
			ps.setInt(52, prod.getPro_marca());
			ps.setInt(53, prod.getPro_tipo());
			ps.setInt(54, prod.getPro_bien());
			ps.setString(55, prod.getPro_area());
			ps.setInt(56, prod.getPro_estado());
			ps.setInt(57, prod.getPro_libre());
			ps.setString(58, prod.getFechasct());
			ps.setInt(59, prod.getUsuariosct());
			ps.setString(60, prod.getMaquinasct());
			ps.setInt(61, prod.getPro_contstock());
			ps.setInt(62, prod.getPro_controlado());
			ps.setInt(63, prod.getPro_modificarprecio());
			ps.setInt(64, prod.getPro_insercantidad());
			ps.setObject(65, prod.getPro_codsubproducto());
			ps.setString(66, prod.getPro_senave());
			ps.setString(67, prod.getPro_libre_senave());
			ps.setInt(68, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Productos prod) {
		String q = " delete from productos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, prod.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}