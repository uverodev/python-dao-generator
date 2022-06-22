package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import vista.*;

public class UsuarioDAO extends Thread {
	private Usuario usua;
	public ArrayList<Usuario> resultadoUsuario;

	@Override
	public void run() {
		try{
			actualizarUsuario("");
		} catch (Exception e) {
			System.out.println("Error al generar Usuario");
		}
		yield();
	}

	public void actualizarUsuario(String condicion) {
		resultadoUsuario = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  usuario " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				usua = new Usuario(
						rs.getInt("us_nro"),
						rs.getString("us_nombre"),
						rs.getInt("us_nivel"),
						rs.getString("us_login"),
						rs.getString("us_sena"),
						rs.getString("us_cargo"),
						rs.getInt("us_numcaja"),
						rs.getInt("us_borrado"),
						rs.getInt("us_codemple"),
						rs.getInt("us_archivo"),
						rs.getInt("us_auditoria"),
						rs.getInt("us_parametro"),
						rs.getInt("us_apermiso"),
						rs.getInt("us_movimiento"),
						rs.getInt("us_rfventa"),
						rs.getInt("us_venta"),
						rs.getInt("us_compra"),
						rs.getInt("us_gasto"),
						rs.getInt("us_cotizacion"),
						rs.getInt("us_acaja"),
						rs.getInt("us_ajuste"),
						rs.getInt("us_cobcredito"),
						rs.getInt("us_pproveedor"),
						rs.getInt("us_afactura"),
						rs.getInt("us_depbanco"),
						rs.getInt("us_interes"),
						rs.getInt("us_registro"),
						rs.getInt("us_zcliente"),
						rs.getInt("us_ncliente"),
						rs.getInt("us_fcliente"),
						rs.getInt("us_cproducto"),
						rs.getInt("us_ubproducto"),
						rs.getInt("us_unproducto"),
						rs.getInt("us_banco"),
						rs.getInt("us_targeta"),
						rs.getInt("us_producto"),
						rs.getInt("us_proveedor"),
						rs.getInt("us_ccajchica"),
						rs.getInt("us_banco2"),
						rs.getInt("us_iconsulta"),
						rs.getInt("us_stock"),
						rs.getInt("us_stxproveedor"),
						rs.getInt("us_visstmin"),
						rs.getInt("us_xubicacion"),
						rs.getInt("us_xvencimiento"),
						rs.getInt("us_lisproveedor"),
						rs.getInt("us_licliente"),
						rs.getInt("us_compra2"),
						rs.getInt("us_ccontado"),
						rs.getInt("us_ccredito"),
						rs.getInt("us_dccompra"),
						rs.getInt("us_dvcliente"),
						rs.getInt("us_vstock"),
						rs.getInt("us_cemitido"),
						rs.getInt("us_cbanco"),
						rs.getInt("us_dbanco"),
						rs.getInt("us_cventa"),
						rs.getInt("us_empleado"),
						rs.getInt("us_rempleado"),
						rs.getInt("us_lsalario"),
						rs.getInt("us_adelanto"),
						rs.getInt("us_iadelanto"),
						rs.getInt("us_mantenimiento"),
						rs.getInt("us_cseguridad"),
						rs.getInt("us_inicializar"),
						rs.getInt("us_bmovimientos"),
						rs.getInt("us_itodo"),
						rs.getInt("us_usuario"),
						rs.getInt("us_csena"),
						rs.getInt("us_husuario"),
						rs.getInt("us_programador"),
						rs.getInt("us_administrador"),
						rs.getInt("us_dventa"),
						rs.getInt("us_vcredito"),
						rs.getInt("us_santeior"),
						rs.getInt("us_historial"),
						rs.getInt("us_producto2"),
						rs.getInt("us_cliente2"),
						rs.getInt("us_proveedor2"),
						rs.getInt("us_iccaja"),
						rs.getInt("us_cpcompra"),
						rs.getInt("us_dgasto"),
						rs.getInt("us_adstolista"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct")
			);
			arr.add(usua);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Usuario usua) {
		String q = " insert into usuario( us_nombre,  us_nivel,  us_login,  us_sena,  us_cargo,  us_numcaja,  us_borrado,  us_codemple,  us_archivo,  us_auditoria,  us_parametro,  us_apermiso,  us_movimiento,  us_rfventa,  us_venta,  us_compra,  us_gasto,  us_cotizacion,  us_acaja,  us_ajuste,  us_cobcredito,  us_pproveedor,  us_afactura,  us_depbanco,  us_interes,  us_registro,  us_zcliente,  us_ncliente,  us_fcliente,  us_cproducto,  us_ubproducto,  us_unproducto,  us_banco,  us_targeta,  us_producto,  us_proveedor,  us_ccajchica,  us_banco2,  us_iconsulta,  us_stock,  us_stxproveedor,  us_visstmin,  us_xubicacion,  us_xvencimiento,  us_lisproveedor,  us_licliente,  us_compra2,  us_ccontado,  us_ccredito,  us_dccompra,  us_dvcliente,  us_vstock,  us_cemitido,  us_cbanco,  us_dbanco,  us_cventa,  us_empleado,  us_rempleado,  us_lsalario,  us_adelanto,  us_iadelanto,  us_mantenimiento,  us_cseguridad,  us_inicializar,  us_bmovimientos,  us_itodo,  us_usuario,  us_csena,  us_husuario,  us_programador,  us_administrador,  us_dventa,  us_vcredito,  us_santeior,  us_historial,  us_producto2,  us_cliente2,  us_proveedor2,  us_iccaja,  us_cpcompra,  us_dgasto,  us_adstolista,  fechasct,  usuariosct,  maquinasct) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, usua.getUs_nombre());
			ps.setInt(2, usua.getUs_nivel());
			ps.setString(3, usua.getUs_login());
			ps.setString(4, usua.getUs_sena());
			ps.setString(5, usua.getUs_cargo());
			ps.setInt(6, usua.getUs_numcaja());
			ps.setInt(7, usua.getUs_borrado());
			ps.setInt(8, usua.getUs_codemple());
			ps.setInt(9, usua.getUs_archivo());
			ps.setInt(10, usua.getUs_auditoria());
			ps.setInt(11, usua.getUs_parametro());
			ps.setInt(12, usua.getUs_apermiso());
			ps.setInt(13, usua.getUs_movimiento());
			ps.setInt(14, usua.getUs_rfventa());
			ps.setInt(15, usua.getUs_venta());
			ps.setInt(16, usua.getUs_compra());
			ps.setInt(17, usua.getUs_gasto());
			ps.setInt(18, usua.getUs_cotizacion());
			ps.setInt(19, usua.getUs_acaja());
			ps.setInt(20, usua.getUs_ajuste());
			ps.setInt(21, usua.getUs_cobcredito());
			ps.setInt(22, usua.getUs_pproveedor());
			ps.setInt(23, usua.getUs_afactura());
			ps.setInt(24, usua.getUs_depbanco());
			ps.setInt(25, usua.getUs_interes());
			ps.setInt(26, usua.getUs_registro());
			ps.setInt(27, usua.getUs_zcliente());
			ps.setInt(28, usua.getUs_ncliente());
			ps.setInt(29, usua.getUs_fcliente());
			ps.setInt(30, usua.getUs_cproducto());
			ps.setInt(31, usua.getUs_ubproducto());
			ps.setInt(32, usua.getUs_unproducto());
			ps.setInt(33, usua.getUs_banco());
			ps.setInt(34, usua.getUs_targeta());
			ps.setInt(35, usua.getUs_producto());
			ps.setInt(36, usua.getUs_proveedor());
			ps.setInt(37, usua.getUs_ccajchica());
			ps.setInt(38, usua.getUs_banco2());
			ps.setInt(39, usua.getUs_iconsulta());
			ps.setInt(40, usua.getUs_stock());
			ps.setInt(41, usua.getUs_stxproveedor());
			ps.setInt(42, usua.getUs_visstmin());
			ps.setInt(43, usua.getUs_xubicacion());
			ps.setInt(44, usua.getUs_xvencimiento());
			ps.setInt(45, usua.getUs_lisproveedor());
			ps.setInt(46, usua.getUs_licliente());
			ps.setInt(47, usua.getUs_compra2());
			ps.setInt(48, usua.getUs_ccontado());
			ps.setInt(49, usua.getUs_ccredito());
			ps.setInt(50, usua.getUs_dccompra());
			ps.setInt(51, usua.getUs_dvcliente());
			ps.setInt(52, usua.getUs_vstock());
			ps.setInt(53, usua.getUs_cemitido());
			ps.setInt(54, usua.getUs_cbanco());
			ps.setInt(55, usua.getUs_dbanco());
			ps.setInt(56, usua.getUs_cventa());
			ps.setInt(57, usua.getUs_empleado());
			ps.setInt(58, usua.getUs_rempleado());
			ps.setInt(59, usua.getUs_lsalario());
			ps.setInt(60, usua.getUs_adelanto());
			ps.setInt(61, usua.getUs_iadelanto());
			ps.setInt(62, usua.getUs_mantenimiento());
			ps.setInt(63, usua.getUs_cseguridad());
			ps.setInt(64, usua.getUs_inicializar());
			ps.setInt(65, usua.getUs_bmovimientos());
			ps.setInt(66, usua.getUs_itodo());
			ps.setInt(67, usua.getUs_usuario());
			ps.setInt(68, usua.getUs_csena());
			ps.setInt(69, usua.getUs_husuario());
			ps.setInt(70, usua.getUs_programador());
			ps.setInt(71, usua.getUs_administrador());
			ps.setInt(72, usua.getUs_dventa());
			ps.setInt(73, usua.getUs_vcredito());
			ps.setInt(74, usua.getUs_santeior());
			ps.setInt(75, usua.getUs_historial());
			ps.setInt(76, usua.getUs_producto2());
			ps.setInt(77, usua.getUs_cliente2());
			ps.setInt(78, usua.getUs_proveedor2());
			ps.setInt(79, usua.getUs_iccaja());
			ps.setInt(80, usua.getUs_cpcompra());
			ps.setInt(81, usua.getUs_dgasto());
			ps.setInt(82, usua.getUs_adstolista());
			ps.setString(83, usua.getFechasct());
			ps.setInt(84, usua.getUsuariosct());
			ps.setString(85, usua.getMaquinasct());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Usuario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Usuario usua) {
		String q = " update usuario set  us_nombre=?,  us_nivel=?,  us_login=?,  us_sena=?,  us_cargo=?,  us_numcaja=?,  us_borrado=?,  us_codemple=?,  us_archivo=?,  us_auditoria=?,  us_parametro=?,  us_apermiso=?,  us_movimiento=?,  us_rfventa=?,  us_venta=?,  us_compra=?,  us_gasto=?,  us_cotizacion=?,  us_acaja=?,  us_ajuste=?,  us_cobcredito=?,  us_pproveedor=?,  us_afactura=?,  us_depbanco=?,  us_interes=?,  us_registro=?,  us_zcliente=?,  us_ncliente=?,  us_fcliente=?,  us_cproducto=?,  us_ubproducto=?,  us_unproducto=?,  us_banco=?,  us_targeta=?,  us_producto=?,  us_proveedor=?,  us_ccajchica=?,  us_banco2=?,  us_iconsulta=?,  us_stock=?,  us_stxproveedor=?,  us_visstmin=?,  us_xubicacion=?,  us_xvencimiento=?,  us_lisproveedor=?,  us_licliente=?,  us_compra2=?,  us_ccontado=?,  us_ccredito=?,  us_dccompra=?,  us_dvcliente=?,  us_vstock=?,  us_cemitido=?,  us_cbanco=?,  us_dbanco=?,  us_cventa=?,  us_empleado=?,  us_rempleado=?,  us_lsalario=?,  us_adelanto=?,  us_iadelanto=?,  us_mantenimiento=?,  us_cseguridad=?,  us_inicializar=?,  us_bmovimientos=?,  us_itodo=?,  us_usuario=?,  us_csena=?,  us_husuario=?,  us_programador=?,  us_administrador=?,  us_dventa=?,  us_vcredito=?,  us_santeior=?,  us_historial=?,  us_producto2=?,  us_cliente2=?,  us_proveedor2=?,  us_iccaja=?,  us_cpcompra=?,  us_dgasto=?,  us_adstolista=?,  fechasct=?,  usuariosct=?,  maquinasct=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, usua.getUs_nombre());
			ps.setInt(2, usua.getUs_nivel());
			ps.setString(3, usua.getUs_login());
			ps.setString(4, usua.getUs_sena());
			ps.setString(5, usua.getUs_cargo());
			ps.setInt(6, usua.getUs_numcaja());
			ps.setInt(7, usua.getUs_borrado());
			ps.setInt(8, usua.getUs_codemple());
			ps.setInt(9, usua.getUs_archivo());
			ps.setInt(10, usua.getUs_auditoria());
			ps.setInt(11, usua.getUs_parametro());
			ps.setInt(12, usua.getUs_apermiso());
			ps.setInt(13, usua.getUs_movimiento());
			ps.setInt(14, usua.getUs_rfventa());
			ps.setInt(15, usua.getUs_venta());
			ps.setInt(16, usua.getUs_compra());
			ps.setInt(17, usua.getUs_gasto());
			ps.setInt(18, usua.getUs_cotizacion());
			ps.setInt(19, usua.getUs_acaja());
			ps.setInt(20, usua.getUs_ajuste());
			ps.setInt(21, usua.getUs_cobcredito());
			ps.setInt(22, usua.getUs_pproveedor());
			ps.setInt(23, usua.getUs_afactura());
			ps.setInt(24, usua.getUs_depbanco());
			ps.setInt(25, usua.getUs_interes());
			ps.setInt(26, usua.getUs_registro());
			ps.setInt(27, usua.getUs_zcliente());
			ps.setInt(28, usua.getUs_ncliente());
			ps.setInt(29, usua.getUs_fcliente());
			ps.setInt(30, usua.getUs_cproducto());
			ps.setInt(31, usua.getUs_ubproducto());
			ps.setInt(32, usua.getUs_unproducto());
			ps.setInt(33, usua.getUs_banco());
			ps.setInt(34, usua.getUs_targeta());
			ps.setInt(35, usua.getUs_producto());
			ps.setInt(36, usua.getUs_proveedor());
			ps.setInt(37, usua.getUs_ccajchica());
			ps.setInt(38, usua.getUs_banco2());
			ps.setInt(39, usua.getUs_iconsulta());
			ps.setInt(40, usua.getUs_stock());
			ps.setInt(41, usua.getUs_stxproveedor());
			ps.setInt(42, usua.getUs_visstmin());
			ps.setInt(43, usua.getUs_xubicacion());
			ps.setInt(44, usua.getUs_xvencimiento());
			ps.setInt(45, usua.getUs_lisproveedor());
			ps.setInt(46, usua.getUs_licliente());
			ps.setInt(47, usua.getUs_compra2());
			ps.setInt(48, usua.getUs_ccontado());
			ps.setInt(49, usua.getUs_ccredito());
			ps.setInt(50, usua.getUs_dccompra());
			ps.setInt(51, usua.getUs_dvcliente());
			ps.setInt(52, usua.getUs_vstock());
			ps.setInt(53, usua.getUs_cemitido());
			ps.setInt(54, usua.getUs_cbanco());
			ps.setInt(55, usua.getUs_dbanco());
			ps.setInt(56, usua.getUs_cventa());
			ps.setInt(57, usua.getUs_empleado());
			ps.setInt(58, usua.getUs_rempleado());
			ps.setInt(59, usua.getUs_lsalario());
			ps.setInt(60, usua.getUs_adelanto());
			ps.setInt(61, usua.getUs_iadelanto());
			ps.setInt(62, usua.getUs_mantenimiento());
			ps.setInt(63, usua.getUs_cseguridad());
			ps.setInt(64, usua.getUs_inicializar());
			ps.setInt(65, usua.getUs_bmovimientos());
			ps.setInt(66, usua.getUs_itodo());
			ps.setInt(67, usua.getUs_usuario());
			ps.setInt(68, usua.getUs_csena());
			ps.setInt(69, usua.getUs_husuario());
			ps.setInt(70, usua.getUs_programador());
			ps.setInt(71, usua.getUs_administrador());
			ps.setInt(72, usua.getUs_dventa());
			ps.setInt(73, usua.getUs_vcredito());
			ps.setInt(74, usua.getUs_santeior());
			ps.setInt(75, usua.getUs_historial());
			ps.setInt(76, usua.getUs_producto2());
			ps.setInt(77, usua.getUs_cliente2());
			ps.setInt(78, usua.getUs_proveedor2());
			ps.setInt(79, usua.getUs_iccaja());
			ps.setInt(80, usua.getUs_cpcompra());
			ps.setInt(81, usua.getUs_dgasto());
			ps.setInt(82, usua.getUs_adstolista());
			ps.setString(83, usua.getFechasct());
			ps.setInt(84, usua.getUsuariosct());
			ps.setString(85, usua.getMaquinasct());
			ps.setInt(86, usua.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Usuario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Usuario usua) {
		String q = " delete from usuario where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, usua.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Usuario", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}