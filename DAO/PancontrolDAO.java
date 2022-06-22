package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pancontrol;
import vista.*;

public class PancontrolDAO extends Thread {
	private Pancontrol panc;
	public ArrayList<Pancontrol> resultadoPancontrol;

	@Override
	public void run() {
		try{
			actualizarPancontrol("");
		} catch (Exception e) {
			System.out.println("Error al generar Pancontrol");
		}
		yield();
	}

	public void actualizarPancontrol(String condicion) {
		resultadoPancontrol = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  pancontrol " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				panc = new Pancontrol(
						rs.getInt("pc_nro"),
						rs.getInt("pc_sendevolucion"),
						rs.getInt("pc_seneliminar"),
						rs.getString("pc_devsena"),
						rs.getString("pc_elisena"),
						rs.getString("pc_maquina"),
						rs.getString("pc_impresora"),
						rs.getInt("pc_imppro"),
						rs.getInt("pc_tipcieimp"),
						rs.getInt("pc_fecventa"),
						rs.getInt("pc_tipnegocio"),
						rs.getInt("pc_tinventario"),
						rs.getInt("pc_cstock"),
						rs.getInt("pc_legimp"),
						rs.getString("pc_implegal"),
						rs.getString("pc_logo"),
						rs.getInt("pc_imppagaremat"),
						rs.getInt("pc_empresa"),
						rs.getInt("pc_feccobro"),
						rs.getInt("pc_moneda"),
						rs.getInt("pc_soperativo"),
						rs.getInt("pc_deposito"),
						rs.getInt("pc_cjxusuario"),
						rs.getInt("pc_cjxfecha"),
						rs.getInt("pc_mensjconfventa"),
						rs.getInt("pc_preventa"),
						rs.getDouble("pc_5vehiculo"),
						rs.getDouble("pc_exevehiculo"),
						rs.getDouble("pc_10vehiculo"),
						rs.getInt("pc_certificado"),
						rs.getInt("pc_tiprecadelanto"),
						rs.getInt("pc_venta2"),
						rs.getInt("pc_tipnota"),
						rs.getObject("pc_directoriocopiaseguridad"),
						rs.getInt("pc_porcentajeprecios"),
						rs.getInt("pc_tipoprevisualizacion"),
						rs.getInt("pc_ventamayorista"),
						rs.getInt("pc_tipimpdevolucion"),
						rs.getInt("pc_crecobrototal"),
						rs.getInt("pc_cresolomensual"),
						rs.getInt("pc_controlalimite"),
						rs.getInt("pc_mintolerancia"),
						rs.getDouble("pc_multxmin"),
						rs.getInt("pc_actualiza"),
						rs.getInt("pc_servidor"),
						rs.getObject("pc_fondo"),
						rs.getInt("pc_skin"),
						rs.getInt("pc_cobentrega"),
						rs.getString("pc_area"),
						rs.getInt("pc_ventadirecta"),
						rs.getInt("pc_tickettipo"),
						rs.getInt("pc_cajaabierta"),
						rs.getObject("pc_directorioprogpg"),
						rs.getInt("pc_stockceroventa"),
						rs.getInt("pc_bloquearcierrecaja"),
						rs.getInt("pc_bloqueacierrecaja"),
						rs.getInt("pc_ingresonumerofactura"),
						rs.getInt("pc_ventacobropago"),
						rs.getInt("pc_local"),
						rs.getInt("pc_tipoimpresionventa"),
						rs.getInt("pc_tipoimpresionpresupuesto"),
						rs.getInt("pc_modificaprecioventa"),
						rs.getInt("pc_facturaventa"),
						rs.getInt("pc_habilitarcobrar"),
						rs.getInt("pc_descuentoventa"),
						rs.getInt("pc_dividircompra"),
						rs.getInt("pc_tipotransferencia"),
						rs.getInt("pc_abrircomboprecioventa"),
						rs.getInt("pc_ventaseguido"),
						rs.getInt("pc_preguntardondeimprimir"),
						rs.getInt("pc_comprasbonificacion"),
						rs.getInt("pc_eliminar_lote"),
						rs.getInt("pc_aviso_controlado"),
						rs.getInt("pc_cierre_directo"),
						rs.getInt("pc_actualizacionpreciodirecto"),
						rs.getObject("pc_seniapcompra"),
						rs.getInt("pc_tipo_impresion_transferencia"),
						rs.getInt("pc_tipo_impresion_devolucion"),
						rs.getInt("pc_sumar_adelanto"),
						rs.getInt("pc_iva_por_defecto"),
						rs.getInt("pc_vendedor_obligatorio"),
						rs.getInt("pc_tipliquidacion"),
						rs.getInt("pc_origen_transferencia_habilitada"),
						rs.getInt("pc_tipo_descuento_por_item"),
						rs.getInt("pc_limitar_venta"),
						rs.getInt("pc_cantidad_items_factura"),
						rs.getInt("pc_inhabilitar_deposito"),
						rs.getInt("pc_inhabilitar_moneda")
			);
			arr.add(panc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Pancontrol panc) {
		String q = " insert into pancontrol( pc_sendevolucion,  pc_seneliminar,  pc_devsena,  pc_elisena,  pc_maquina,  pc_impresora,  pc_imppro,  pc_tipcieimp,  pc_fecventa,  pc_tipnegocio,  pc_tinventario,  pc_cstock,  pc_legimp,  pc_implegal,  pc_logo,  pc_imppagaremat,  pc_empresa,  pc_feccobro,  pc_moneda,  pc_soperativo,  pc_deposito,  pc_cjxusuario,  pc_cjxfecha,  pc_mensjconfventa,  pc_preventa,  pc_5vehiculo,  pc_exevehiculo,  pc_10vehiculo,  pc_certificado,  pc_tiprecadelanto,  pc_venta2,  pc_tipnota,  pc_directoriocopiaseguridad,  pc_porcentajeprecios,  pc_tipoprevisualizacion,  pc_ventamayorista,  pc_tipimpdevolucion,  pc_crecobrototal,  pc_cresolomensual,  pc_controlalimite,  pc_mintolerancia,  pc_multxmin,  pc_actualiza,  pc_servidor,  pc_fondo,  pc_skin,  pc_cobentrega,  pc_area,  pc_ventadirecta,  pc_tickettipo,  pc_cajaabierta,  pc_directorioprogpg,  pc_stockceroventa,  pc_bloquearcierrecaja,  pc_bloqueacierrecaja,  pc_ingresonumerofactura,  pc_ventacobropago,  pc_local,  pc_tipoimpresionventa,  pc_tipoimpresionpresupuesto,  pc_modificaprecioventa,  pc_facturaventa,  pc_habilitarcobrar,  pc_descuentoventa,  pc_dividircompra,  pc_tipotransferencia,  pc_abrircomboprecioventa,  pc_ventaseguido,  pc_preguntardondeimprimir,  pc_comprasbonificacion,  pc_eliminar_lote,  pc_aviso_controlado,  pc_cierre_directo,  pc_actualizacionpreciodirecto,  pc_seniapcompra,  pc_tipo_impresion_transferencia,  pc_tipo_impresion_devolucion,  pc_sumar_adelanto,  pc_iva_por_defecto,  pc_vendedor_obligatorio,  pc_tipliquidacion,  pc_origen_transferencia_habilitada,  pc_tipo_descuento_por_item,  pc_limitar_venta,  pc_cantidad_items_factura,  pc_inhabilitar_deposito,  pc_inhabilitar_moneda) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, panc.getPc_sendevolucion());
			ps.setInt(2, panc.getPc_seneliminar());
			ps.setString(3, panc.getPc_devsena());
			ps.setString(4, panc.getPc_elisena());
			ps.setString(5, panc.getPc_maquina());
			ps.setString(6, panc.getPc_impresora());
			ps.setInt(7, panc.getPc_imppro());
			ps.setInt(8, panc.getPc_tipcieimp());
			ps.setInt(9, panc.getPc_fecventa());
			ps.setInt(10, panc.getPc_tipnegocio());
			ps.setInt(11, panc.getPc_tinventario());
			ps.setInt(12, panc.getPc_cstock());
			ps.setInt(13, panc.getPc_legimp());
			ps.setString(14, panc.getPc_implegal());
			ps.setString(15, panc.getPc_logo());
			ps.setInt(16, panc.getPc_imppagaremat());
			ps.setInt(17, panc.getPc_empresa());
			ps.setInt(18, panc.getPc_feccobro());
			ps.setInt(19, panc.getPc_moneda());
			ps.setInt(20, panc.getPc_soperativo());
			ps.setInt(21, panc.getPc_deposito());
			ps.setInt(22, panc.getPc_cjxusuario());
			ps.setInt(23, panc.getPc_cjxfecha());
			ps.setInt(24, panc.getPc_mensjconfventa());
			ps.setInt(25, panc.getPc_preventa());
			ps.setDouble(26, panc.getPc_5vehiculo());
			ps.setDouble(27, panc.getPc_exevehiculo());
			ps.setDouble(28, panc.getPc_10vehiculo());
			ps.setInt(29, panc.getPc_certificado());
			ps.setInt(30, panc.getPc_tiprecadelanto());
			ps.setInt(31, panc.getPc_venta2());
			ps.setInt(32, panc.getPc_tipnota());
			ps.setObject(33, panc.getPc_directoriocopiaseguridad());
			ps.setInt(34, panc.getPc_porcentajeprecios());
			ps.setInt(35, panc.getPc_tipoprevisualizacion());
			ps.setInt(36, panc.getPc_ventamayorista());
			ps.setInt(37, panc.getPc_tipimpdevolucion());
			ps.setInt(38, panc.getPc_crecobrototal());
			ps.setInt(39, panc.getPc_cresolomensual());
			ps.setInt(40, panc.getPc_controlalimite());
			ps.setInt(41, panc.getPc_mintolerancia());
			ps.setDouble(42, panc.getPc_multxmin());
			ps.setInt(43, panc.getPc_actualiza());
			ps.setInt(44, panc.getPc_servidor());
			ps.setObject(45, panc.getPc_fondo());
			ps.setInt(46, panc.getPc_skin());
			ps.setInt(47, panc.getPc_cobentrega());
			ps.setString(48, panc.getPc_area());
			ps.setInt(49, panc.getPc_ventadirecta());
			ps.setInt(50, panc.getPc_tickettipo());
			ps.setInt(51, panc.getPc_cajaabierta());
			ps.setObject(52, panc.getPc_directorioprogpg());
			ps.setInt(53, panc.getPc_stockceroventa());
			ps.setInt(54, panc.getPc_bloquearcierrecaja());
			ps.setInt(55, panc.getPc_bloqueacierrecaja());
			ps.setInt(56, panc.getPc_ingresonumerofactura());
			ps.setInt(57, panc.getPc_ventacobropago());
			ps.setInt(58, panc.getPc_local());
			ps.setInt(59, panc.getPc_tipoimpresionventa());
			ps.setInt(60, panc.getPc_tipoimpresionpresupuesto());
			ps.setInt(61, panc.getPc_modificaprecioventa());
			ps.setInt(62, panc.getPc_facturaventa());
			ps.setInt(63, panc.getPc_habilitarcobrar());
			ps.setInt(64, panc.getPc_descuentoventa());
			ps.setInt(65, panc.getPc_dividircompra());
			ps.setInt(66, panc.getPc_tipotransferencia());
			ps.setInt(67, panc.getPc_abrircomboprecioventa());
			ps.setInt(68, panc.getPc_ventaseguido());
			ps.setInt(69, panc.getPc_preguntardondeimprimir());
			ps.setInt(70, panc.getPc_comprasbonificacion());
			ps.setInt(71, panc.getPc_eliminar_lote());
			ps.setInt(72, panc.getPc_aviso_controlado());
			ps.setInt(73, panc.getPc_cierre_directo());
			ps.setInt(74, panc.getPc_actualizacionpreciodirecto());
			ps.setObject(75, panc.getPc_seniapcompra());
			ps.setInt(76, panc.getPc_tipo_impresion_transferencia());
			ps.setInt(77, panc.getPc_tipo_impresion_devolucion());
			ps.setInt(78, panc.getPc_sumar_adelanto());
			ps.setInt(79, panc.getPc_iva_por_defecto());
			ps.setInt(80, panc.getPc_vendedor_obligatorio());
			ps.setInt(81, panc.getPc_tipliquidacion());
			ps.setInt(82, panc.getPc_origen_transferencia_habilitada());
			ps.setInt(83, panc.getPc_tipo_descuento_por_item());
			ps.setInt(84, panc.getPc_limitar_venta());
			ps.setInt(85, panc.getPc_cantidad_items_factura());
			ps.setInt(86, panc.getPc_inhabilitar_deposito());
			ps.setInt(87, panc.getPc_inhabilitar_moneda());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Pancontrol", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Pancontrol panc) {
		String q = " update pancontrol set  pc_sendevolucion=?,  pc_seneliminar=?,  pc_devsena=?,  pc_elisena=?,  pc_maquina=?,  pc_impresora=?,  pc_imppro=?,  pc_tipcieimp=?,  pc_fecventa=?,  pc_tipnegocio=?,  pc_tinventario=?,  pc_cstock=?,  pc_legimp=?,  pc_implegal=?,  pc_logo=?,  pc_imppagaremat=?,  pc_empresa=?,  pc_feccobro=?,  pc_moneda=?,  pc_soperativo=?,  pc_deposito=?,  pc_cjxusuario=?,  pc_cjxfecha=?,  pc_mensjconfventa=?,  pc_preventa=?,  pc_5vehiculo=?,  pc_exevehiculo=?,  pc_10vehiculo=?,  pc_certificado=?,  pc_tiprecadelanto=?,  pc_venta2=?,  pc_tipnota=?,  pc_directoriocopiaseguridad=?,  pc_porcentajeprecios=?,  pc_tipoprevisualizacion=?,  pc_ventamayorista=?,  pc_tipimpdevolucion=?,  pc_crecobrototal=?,  pc_cresolomensual=?,  pc_controlalimite=?,  pc_mintolerancia=?,  pc_multxmin=?,  pc_actualiza=?,  pc_servidor=?,  pc_fondo=?,  pc_skin=?,  pc_cobentrega=?,  pc_area=?,  pc_ventadirecta=?,  pc_tickettipo=?,  pc_cajaabierta=?,  pc_directorioprogpg=?,  pc_stockceroventa=?,  pc_bloquearcierrecaja=?,  pc_bloqueacierrecaja=?,  pc_ingresonumerofactura=?,  pc_ventacobropago=?,  pc_local=?,  pc_tipoimpresionventa=?,  pc_tipoimpresionpresupuesto=?,  pc_modificaprecioventa=?,  pc_facturaventa=?,  pc_habilitarcobrar=?,  pc_descuentoventa=?,  pc_dividircompra=?,  pc_tipotransferencia=?,  pc_abrircomboprecioventa=?,  pc_ventaseguido=?,  pc_preguntardondeimprimir=?,  pc_comprasbonificacion=?,  pc_eliminar_lote=?,  pc_aviso_controlado=?,  pc_cierre_directo=?,  pc_actualizacionpreciodirecto=?,  pc_seniapcompra=?,  pc_tipo_impresion_transferencia=?,  pc_tipo_impresion_devolucion=?,  pc_sumar_adelanto=?,  pc_iva_por_defecto=?,  pc_vendedor_obligatorio=?,  pc_tipliquidacion=?,  pc_origen_transferencia_habilitada=?,  pc_tipo_descuento_por_item=?,  pc_limitar_venta=?,  pc_cantidad_items_factura=?,  pc_inhabilitar_deposito=?,  pc_inhabilitar_moneda=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, panc.getPc_sendevolucion());
			ps.setInt(2, panc.getPc_seneliminar());
			ps.setString(3, panc.getPc_devsena());
			ps.setString(4, panc.getPc_elisena());
			ps.setString(5, panc.getPc_maquina());
			ps.setString(6, panc.getPc_impresora());
			ps.setInt(7, panc.getPc_imppro());
			ps.setInt(8, panc.getPc_tipcieimp());
			ps.setInt(9, panc.getPc_fecventa());
			ps.setInt(10, panc.getPc_tipnegocio());
			ps.setInt(11, panc.getPc_tinventario());
			ps.setInt(12, panc.getPc_cstock());
			ps.setInt(13, panc.getPc_legimp());
			ps.setString(14, panc.getPc_implegal());
			ps.setString(15, panc.getPc_logo());
			ps.setInt(16, panc.getPc_imppagaremat());
			ps.setInt(17, panc.getPc_empresa());
			ps.setInt(18, panc.getPc_feccobro());
			ps.setInt(19, panc.getPc_moneda());
			ps.setInt(20, panc.getPc_soperativo());
			ps.setInt(21, panc.getPc_deposito());
			ps.setInt(22, panc.getPc_cjxusuario());
			ps.setInt(23, panc.getPc_cjxfecha());
			ps.setInt(24, panc.getPc_mensjconfventa());
			ps.setInt(25, panc.getPc_preventa());
			ps.setDouble(26, panc.getPc_5vehiculo());
			ps.setDouble(27, panc.getPc_exevehiculo());
			ps.setDouble(28, panc.getPc_10vehiculo());
			ps.setInt(29, panc.getPc_certificado());
			ps.setInt(30, panc.getPc_tiprecadelanto());
			ps.setInt(31, panc.getPc_venta2());
			ps.setInt(32, panc.getPc_tipnota());
			ps.setObject(33, panc.getPc_directoriocopiaseguridad());
			ps.setInt(34, panc.getPc_porcentajeprecios());
			ps.setInt(35, panc.getPc_tipoprevisualizacion());
			ps.setInt(36, panc.getPc_ventamayorista());
			ps.setInt(37, panc.getPc_tipimpdevolucion());
			ps.setInt(38, panc.getPc_crecobrototal());
			ps.setInt(39, panc.getPc_cresolomensual());
			ps.setInt(40, panc.getPc_controlalimite());
			ps.setInt(41, panc.getPc_mintolerancia());
			ps.setDouble(42, panc.getPc_multxmin());
			ps.setInt(43, panc.getPc_actualiza());
			ps.setInt(44, panc.getPc_servidor());
			ps.setObject(45, panc.getPc_fondo());
			ps.setInt(46, panc.getPc_skin());
			ps.setInt(47, panc.getPc_cobentrega());
			ps.setString(48, panc.getPc_area());
			ps.setInt(49, panc.getPc_ventadirecta());
			ps.setInt(50, panc.getPc_tickettipo());
			ps.setInt(51, panc.getPc_cajaabierta());
			ps.setObject(52, panc.getPc_directorioprogpg());
			ps.setInt(53, panc.getPc_stockceroventa());
			ps.setInt(54, panc.getPc_bloquearcierrecaja());
			ps.setInt(55, panc.getPc_bloqueacierrecaja());
			ps.setInt(56, panc.getPc_ingresonumerofactura());
			ps.setInt(57, panc.getPc_ventacobropago());
			ps.setInt(58, panc.getPc_local());
			ps.setInt(59, panc.getPc_tipoimpresionventa());
			ps.setInt(60, panc.getPc_tipoimpresionpresupuesto());
			ps.setInt(61, panc.getPc_modificaprecioventa());
			ps.setInt(62, panc.getPc_facturaventa());
			ps.setInt(63, panc.getPc_habilitarcobrar());
			ps.setInt(64, panc.getPc_descuentoventa());
			ps.setInt(65, panc.getPc_dividircompra());
			ps.setInt(66, panc.getPc_tipotransferencia());
			ps.setInt(67, panc.getPc_abrircomboprecioventa());
			ps.setInt(68, panc.getPc_ventaseguido());
			ps.setInt(69, panc.getPc_preguntardondeimprimir());
			ps.setInt(70, panc.getPc_comprasbonificacion());
			ps.setInt(71, panc.getPc_eliminar_lote());
			ps.setInt(72, panc.getPc_aviso_controlado());
			ps.setInt(73, panc.getPc_cierre_directo());
			ps.setInt(74, panc.getPc_actualizacionpreciodirecto());
			ps.setObject(75, panc.getPc_seniapcompra());
			ps.setInt(76, panc.getPc_tipo_impresion_transferencia());
			ps.setInt(77, panc.getPc_tipo_impresion_devolucion());
			ps.setInt(78, panc.getPc_sumar_adelanto());
			ps.setInt(79, panc.getPc_iva_por_defecto());
			ps.setInt(80, panc.getPc_vendedor_obligatorio());
			ps.setInt(81, panc.getPc_tipliquidacion());
			ps.setInt(82, panc.getPc_origen_transferencia_habilitada());
			ps.setInt(83, panc.getPc_tipo_descuento_por_item());
			ps.setInt(84, panc.getPc_limitar_venta());
			ps.setInt(85, panc.getPc_cantidad_items_factura());
			ps.setInt(86, panc.getPc_inhabilitar_deposito());
			ps.setInt(87, panc.getPc_inhabilitar_moneda());
			ps.setInt(88, panc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Pancontrol", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Pancontrol panc) {
		String q = " delete from pancontrol where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, panc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Pancontrol", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}