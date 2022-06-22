package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Vista_productos;
import vista.*;

public class Vista_productosDAO extends Thread {
	private Vista_productos vist;
	public ArrayList<Vista_productos> resultadoVista_productos;

	@Override
	public void run() {
		try{
			actualizarVista_productos("");
		} catch (Exception e) {
			System.out.println("Error al generar Vista_productos");
		}
		yield();
	}

	public void actualizarVista_productos(String condicion) {
		resultadoVista_productos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  vista_productos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				vist = new Vista_productos(
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
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getObject("pro_imagen"),
						rs.getInt("pro_bien"),
						rs.getString("pro_area"),
						rs.getInt("pro_estado"),
						rs.getInt("pro_libre"),
						rs.getInt("pro_contstock"),
						rs.getInt("pro_marca"),
						rs.getInt("pro_tipo"),
						rs.getInt("pro_controlado"),
						rs.getInt("pro_modificarprecio"),
						rs.getDouble("prc_descuento"),
						rs.getInt("imp_id"),
						rs.getString("imp_descripcion"),
						rs.getDouble("imp_exenta"),
						rs.getDouble("imp_iva_5"),
						rs.getDouble("imp_iva_10"),
						rs.getString("contenido"),
						rs.getString("pro_senave"),
						rs.getString("pro_libre_senave")
			);
			arr.add(vist);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Vista_productos vist) {
		String q = " insert into vista_productos( pro_composicion,  pro_codori,  pro_detalle,  pro_vencimient,  pro_aplicacion,  pro_ubicacion,  pro_minimo,  pro_costomayorista,  pro_costoult,  pro_coststo,  pro_coststod,  pro_coststor,  pro_coststoe,  pro_coststop,  pro_stockult,  pro_stockfec,  pro_stock,  pro_venta1,  pro_venta1d,  pro_venta1r,  pro_venta1p,  pro_venta1e,  pro_venta2,  pro_venta2d,  pro_venta2r,  pro_venta2p,  pro_venta2e,  pro_venta4,  pro_venta3,  pro_venta3d,  pro_venta3r,  pro_venta3p,  pro_venta3e,  pro_obs,  pro_foto,  pro_categoria,  pro_procedenc,  pro_perece,  pro_codlabo,  pro_iva,  pro_coddistri,  pro_conpro,  pro_valcopro,  pro_valporce,  pro_borrado,  pro_unidad,  pro_imppro,  pro_vehiculo,  pro_porprecio,  pro_codprov,  fechasct,  usuariosct,  maquinasct,  pro_imagen,  pro_bien,  pro_area,  pro_estado,  pro_libre,  pro_contstock,  pro_marca,  pro_tipo,  pro_controlado,  pro_modificarprecio,  prc_descuento,  imp_id,  imp_descripcion,  imp_exenta,  imp_iva_5,  imp_iva_10,  contenido,  pro_senave,  pro_libre_senave) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vist.getPro_composicion());
			ps.setString(2, vist.getPro_codori());
			ps.setString(3, vist.getPro_detalle());
			ps.setString(4, vist.getPro_vencimient());
			ps.setString(5, vist.getPro_aplicacion());
			ps.setInt(6, vist.getPro_ubicacion());
			ps.setDouble(7, vist.getPro_minimo());
			ps.setDouble(8, vist.getPro_costomayorista());
			ps.setDouble(9, vist.getPro_costoult());
			ps.setDouble(10, vist.getPro_coststo());
			ps.setDouble(11, vist.getPro_coststod());
			ps.setDouble(12, vist.getPro_coststor());
			ps.setDouble(13, vist.getPro_coststoe());
			ps.setDouble(14, vist.getPro_coststop());
			ps.setDouble(15, vist.getPro_stockult());
			ps.setDouble(16, vist.getPro_stockfec());
			ps.setDouble(17, vist.getPro_stock());
			ps.setDouble(18, vist.getPro_venta1());
			ps.setDouble(19, vist.getPro_venta1d());
			ps.setDouble(20, vist.getPro_venta1r());
			ps.setDouble(21, vist.getPro_venta1p());
			ps.setDouble(22, vist.getPro_venta1e());
			ps.setDouble(23, vist.getPro_venta2());
			ps.setDouble(24, vist.getPro_venta2d());
			ps.setDouble(25, vist.getPro_venta2r());
			ps.setDouble(26, vist.getPro_venta2p());
			ps.setDouble(27, vist.getPro_venta2e());
			ps.setDouble(28, vist.getPro_venta4());
			ps.setDouble(29, vist.getPro_venta3());
			ps.setDouble(30, vist.getPro_venta3d());
			ps.setDouble(31, vist.getPro_venta3r());
			ps.setDouble(32, vist.getPro_venta3p());
			ps.setDouble(33, vist.getPro_venta3e());
			ps.setString(34, vist.getPro_obs());
			ps.setString(35, vist.getPro_foto());
			ps.setInt(36, vist.getPro_categoria());
			ps.setInt(37, vist.getPro_procedenc());
			ps.setInt(38, vist.getPro_perece());
			ps.setInt(39, vist.getPro_codlabo());
			ps.setInt(40, vist.getPro_iva());
			ps.setInt(41, vist.getPro_coddistri());
			ps.setInt(42, vist.getPro_conpro());
			ps.setInt(43, vist.getPro_valcopro());
			ps.setInt(44, vist.getPro_valporce());
			ps.setInt(45, vist.getPro_borrado());
			ps.setInt(46, vist.getPro_unidad());
			ps.setInt(47, vist.getPro_imppro());
			ps.setInt(48, vist.getPro_vehiculo());
			ps.setDouble(49, vist.getPro_porprecio());
			ps.setInt(50, vist.getPro_codprov());
			ps.setString(51, vist.getFechasct());
			ps.setInt(52, vist.getUsuariosct());
			ps.setString(53, vist.getMaquinasct());
			ps.setObject(54, vist.getPro_imagen());
			ps.setInt(55, vist.getPro_bien());
			ps.setString(56, vist.getPro_area());
			ps.setInt(57, vist.getPro_estado());
			ps.setInt(58, vist.getPro_libre());
			ps.setInt(59, vist.getPro_contstock());
			ps.setInt(60, vist.getPro_marca());
			ps.setInt(61, vist.getPro_tipo());
			ps.setInt(62, vist.getPro_controlado());
			ps.setInt(63, vist.getPro_modificarprecio());
			ps.setDouble(64, vist.getPrc_descuento());
			ps.setInt(65, vist.getImp_id());
			ps.setString(66, vist.getImp_descripcion());
			ps.setDouble(67, vist.getImp_exenta());
			ps.setDouble(68, vist.getImp_iva_5());
			ps.setDouble(69, vist.getImp_iva_10());
			ps.setString(70, vist.getContenido());
			ps.setString(71, vist.getPro_senave());
			ps.setString(72, vist.getPro_libre_senave());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Vista_productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Vista_productos vist) {
		String q = " update vista_productos set  pro_composicion=?,  pro_codori=?,  pro_detalle=?,  pro_vencimient=?,  pro_aplicacion=?,  pro_ubicacion=?,  pro_minimo=?,  pro_costomayorista=?,  pro_costoult=?,  pro_coststo=?,  pro_coststod=?,  pro_coststor=?,  pro_coststoe=?,  pro_coststop=?,  pro_stockult=?,  pro_stockfec=?,  pro_stock=?,  pro_venta1=?,  pro_venta1d=?,  pro_venta1r=?,  pro_venta1p=?,  pro_venta1e=?,  pro_venta2=?,  pro_venta2d=?,  pro_venta2r=?,  pro_venta2p=?,  pro_venta2e=?,  pro_venta4=?,  pro_venta3=?,  pro_venta3d=?,  pro_venta3r=?,  pro_venta3p=?,  pro_venta3e=?,  pro_obs=?,  pro_foto=?,  pro_categoria=?,  pro_procedenc=?,  pro_perece=?,  pro_codlabo=?,  pro_iva=?,  pro_coddistri=?,  pro_conpro=?,  pro_valcopro=?,  pro_valporce=?,  pro_borrado=?,  pro_unidad=?,  pro_imppro=?,  pro_vehiculo=?,  pro_porprecio=?,  pro_codprov=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  pro_imagen=?,  pro_bien=?,  pro_area=?,  pro_estado=?,  pro_libre=?,  pro_contstock=?,  pro_marca=?,  pro_tipo=?,  pro_controlado=?,  pro_modificarprecio=?,  prc_descuento=?,  imp_id=?,  imp_descripcion=?,  imp_exenta=?,  imp_iva_5=?,  imp_iva_10=?,  contenido=?,  pro_senave=?,  pro_libre_senave=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, vist.getPro_composicion());
			ps.setString(2, vist.getPro_codori());
			ps.setString(3, vist.getPro_detalle());
			ps.setString(4, vist.getPro_vencimient());
			ps.setString(5, vist.getPro_aplicacion());
			ps.setInt(6, vist.getPro_ubicacion());
			ps.setDouble(7, vist.getPro_minimo());
			ps.setDouble(8, vist.getPro_costomayorista());
			ps.setDouble(9, vist.getPro_costoult());
			ps.setDouble(10, vist.getPro_coststo());
			ps.setDouble(11, vist.getPro_coststod());
			ps.setDouble(12, vist.getPro_coststor());
			ps.setDouble(13, vist.getPro_coststoe());
			ps.setDouble(14, vist.getPro_coststop());
			ps.setDouble(15, vist.getPro_stockult());
			ps.setDouble(16, vist.getPro_stockfec());
			ps.setDouble(17, vist.getPro_stock());
			ps.setDouble(18, vist.getPro_venta1());
			ps.setDouble(19, vist.getPro_venta1d());
			ps.setDouble(20, vist.getPro_venta1r());
			ps.setDouble(21, vist.getPro_venta1p());
			ps.setDouble(22, vist.getPro_venta1e());
			ps.setDouble(23, vist.getPro_venta2());
			ps.setDouble(24, vist.getPro_venta2d());
			ps.setDouble(25, vist.getPro_venta2r());
			ps.setDouble(26, vist.getPro_venta2p());
			ps.setDouble(27, vist.getPro_venta2e());
			ps.setDouble(28, vist.getPro_venta4());
			ps.setDouble(29, vist.getPro_venta3());
			ps.setDouble(30, vist.getPro_venta3d());
			ps.setDouble(31, vist.getPro_venta3r());
			ps.setDouble(32, vist.getPro_venta3p());
			ps.setDouble(33, vist.getPro_venta3e());
			ps.setString(34, vist.getPro_obs());
			ps.setString(35, vist.getPro_foto());
			ps.setInt(36, vist.getPro_categoria());
			ps.setInt(37, vist.getPro_procedenc());
			ps.setInt(38, vist.getPro_perece());
			ps.setInt(39, vist.getPro_codlabo());
			ps.setInt(40, vist.getPro_iva());
			ps.setInt(41, vist.getPro_coddistri());
			ps.setInt(42, vist.getPro_conpro());
			ps.setInt(43, vist.getPro_valcopro());
			ps.setInt(44, vist.getPro_valporce());
			ps.setInt(45, vist.getPro_borrado());
			ps.setInt(46, vist.getPro_unidad());
			ps.setInt(47, vist.getPro_imppro());
			ps.setInt(48, vist.getPro_vehiculo());
			ps.setDouble(49, vist.getPro_porprecio());
			ps.setInt(50, vist.getPro_codprov());
			ps.setString(51, vist.getFechasct());
			ps.setInt(52, vist.getUsuariosct());
			ps.setString(53, vist.getMaquinasct());
			ps.setObject(54, vist.getPro_imagen());
			ps.setInt(55, vist.getPro_bien());
			ps.setString(56, vist.getPro_area());
			ps.setInt(57, vist.getPro_estado());
			ps.setInt(58, vist.getPro_libre());
			ps.setInt(59, vist.getPro_contstock());
			ps.setInt(60, vist.getPro_marca());
			ps.setInt(61, vist.getPro_tipo());
			ps.setInt(62, vist.getPro_controlado());
			ps.setInt(63, vist.getPro_modificarprecio());
			ps.setDouble(64, vist.getPrc_descuento());
			ps.setInt(65, vist.getImp_id());
			ps.setString(66, vist.getImp_descripcion());
			ps.setDouble(67, vist.getImp_exenta());
			ps.setDouble(68, vist.getImp_iva_5());
			ps.setDouble(69, vist.getImp_iva_10());
			ps.setString(70, vist.getContenido());
			ps.setString(71, vist.getPro_senave());
			ps.setString(72, vist.getPro_libre_senave());
			ps.setInt(73, vist.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Vista_productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Vista_productos vist) {
		String q = " delete from vista_productos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, vist.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Vista_productos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}