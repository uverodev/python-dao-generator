package modelo;

public class Usuario{
	Integer us_nro;
	String us_nombre;
	Integer us_nivel;
	String us_login;
	String us_sena;
	String us_cargo;
	Integer us_numcaja;
	Integer us_borrado;
	Integer us_codemple;
	Integer us_archivo;
	Integer us_auditoria;
	Integer us_parametro;
	Integer us_apermiso;
	Integer us_movimiento;
	Integer us_rfventa;
	Integer us_venta;
	Integer us_compra;
	Integer us_gasto;
	Integer us_cotizacion;
	Integer us_acaja;
	Integer us_ajuste;
	Integer us_cobcredito;
	Integer us_pproveedor;
	Integer us_afactura;
	Integer us_depbanco;
	Integer us_interes;
	Integer us_registro;
	Integer us_zcliente;
	Integer us_ncliente;
	Integer us_fcliente;
	Integer us_cproducto;
	Integer us_ubproducto;
	Integer us_unproducto;
	Integer us_banco;
	Integer us_targeta;
	Integer us_producto;
	Integer us_proveedor;
	Integer us_ccajchica;
	Integer us_banco2;
	Integer us_iconsulta;
	Integer us_stock;
	Integer us_stxproveedor;
	Integer us_visstmin;
	Integer us_xubicacion;
	Integer us_xvencimiento;
	Integer us_lisproveedor;
	Integer us_licliente;
	Integer us_compra2;
	Integer us_ccontado;
	Integer us_ccredito;
	Integer us_dccompra;
	Integer us_dvcliente;
	Integer us_vstock;
	Integer us_cemitido;
	Integer us_cbanco;
	Integer us_dbanco;
	Integer us_cventa;
	Integer us_empleado;
	Integer us_rempleado;
	Integer us_lsalario;
	Integer us_adelanto;
	Integer us_iadelanto;
	Integer us_mantenimiento;
	Integer us_cseguridad;
	Integer us_inicializar;
	Integer us_bmovimientos;
	Integer us_itodo;
	Integer us_usuario;
	Integer us_csena;
	Integer us_husuario;
	Integer us_programador;
	Integer us_administrador;
	Integer us_dventa;
	Integer us_vcredito;
	Integer us_santeior;
	Integer us_historial;
	Integer us_producto2;
	Integer us_cliente2;
	Integer us_proveedor2;
	Integer us_iccaja;
	Integer us_cpcompra;
	Integer us_dgasto;
	Integer us_adstolista;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Usuario(Integer us_nro, String us_nombre, Integer us_nivel, String us_login, String us_sena, String us_cargo, Integer us_numcaja, Integer us_borrado, Integer us_codemple, Integer us_archivo, Integer us_auditoria, Integer us_parametro, Integer us_apermiso, Integer us_movimiento, Integer us_rfventa, Integer us_venta, Integer us_compra, Integer us_gasto, Integer us_cotizacion, Integer us_acaja, Integer us_ajuste, Integer us_cobcredito, Integer us_pproveedor, Integer us_afactura, Integer us_depbanco, Integer us_interes, Integer us_registro, Integer us_zcliente, Integer us_ncliente, Integer us_fcliente, Integer us_cproducto, Integer us_ubproducto, Integer us_unproducto, Integer us_banco, Integer us_targeta, Integer us_producto, Integer us_proveedor, Integer us_ccajchica, Integer us_banco2, Integer us_iconsulta, Integer us_stock, Integer us_stxproveedor, Integer us_visstmin, Integer us_xubicacion, Integer us_xvencimiento, Integer us_lisproveedor, Integer us_licliente, Integer us_compra2, Integer us_ccontado, Integer us_ccredito, Integer us_dccompra, Integer us_dvcliente, Integer us_vstock, Integer us_cemitido, Integer us_cbanco, Integer us_dbanco, Integer us_cventa, Integer us_empleado, Integer us_rempleado, Integer us_lsalario, Integer us_adelanto, Integer us_iadelanto, Integer us_mantenimiento, Integer us_cseguridad, Integer us_inicializar, Integer us_bmovimientos, Integer us_itodo, Integer us_usuario, Integer us_csena, Integer us_husuario, Integer us_programador, Integer us_administrador, Integer us_dventa, Integer us_vcredito, Integer us_santeior, Integer us_historial, Integer us_producto2, Integer us_cliente2, Integer us_proveedor2, Integer us_iccaja, Integer us_cpcompra, Integer us_dgasto, Integer us_adstolista, String fechasct, Integer usuariosct, String maquinasct){
		this.us_nro = us_nro;
		this.us_nombre = us_nombre;
		this.us_nivel = us_nivel;
		this.us_login = us_login;
		this.us_sena = us_sena;
		this.us_cargo = us_cargo;
		this.us_numcaja = us_numcaja;
		this.us_borrado = us_borrado;
		this.us_codemple = us_codemple;
		this.us_archivo = us_archivo;
		this.us_auditoria = us_auditoria;
		this.us_parametro = us_parametro;
		this.us_apermiso = us_apermiso;
		this.us_movimiento = us_movimiento;
		this.us_rfventa = us_rfventa;
		this.us_venta = us_venta;
		this.us_compra = us_compra;
		this.us_gasto = us_gasto;
		this.us_cotizacion = us_cotizacion;
		this.us_acaja = us_acaja;
		this.us_ajuste = us_ajuste;
		this.us_cobcredito = us_cobcredito;
		this.us_pproveedor = us_pproveedor;
		this.us_afactura = us_afactura;
		this.us_depbanco = us_depbanco;
		this.us_interes = us_interes;
		this.us_registro = us_registro;
		this.us_zcliente = us_zcliente;
		this.us_ncliente = us_ncliente;
		this.us_fcliente = us_fcliente;
		this.us_cproducto = us_cproducto;
		this.us_ubproducto = us_ubproducto;
		this.us_unproducto = us_unproducto;
		this.us_banco = us_banco;
		this.us_targeta = us_targeta;
		this.us_producto = us_producto;
		this.us_proveedor = us_proveedor;
		this.us_ccajchica = us_ccajchica;
		this.us_banco2 = us_banco2;
		this.us_iconsulta = us_iconsulta;
		this.us_stock = us_stock;
		this.us_stxproveedor = us_stxproveedor;
		this.us_visstmin = us_visstmin;
		this.us_xubicacion = us_xubicacion;
		this.us_xvencimiento = us_xvencimiento;
		this.us_lisproveedor = us_lisproveedor;
		this.us_licliente = us_licliente;
		this.us_compra2 = us_compra2;
		this.us_ccontado = us_ccontado;
		this.us_ccredito = us_ccredito;
		this.us_dccompra = us_dccompra;
		this.us_dvcliente = us_dvcliente;
		this.us_vstock = us_vstock;
		this.us_cemitido = us_cemitido;
		this.us_cbanco = us_cbanco;
		this.us_dbanco = us_dbanco;
		this.us_cventa = us_cventa;
		this.us_empleado = us_empleado;
		this.us_rempleado = us_rempleado;
		this.us_lsalario = us_lsalario;
		this.us_adelanto = us_adelanto;
		this.us_iadelanto = us_iadelanto;
		this.us_mantenimiento = us_mantenimiento;
		this.us_cseguridad = us_cseguridad;
		this.us_inicializar = us_inicializar;
		this.us_bmovimientos = us_bmovimientos;
		this.us_itodo = us_itodo;
		this.us_usuario = us_usuario;
		this.us_csena = us_csena;
		this.us_husuario = us_husuario;
		this.us_programador = us_programador;
		this.us_administrador = us_administrador;
		this.us_dventa = us_dventa;
		this.us_vcredito = us_vcredito;
		this.us_santeior = us_santeior;
		this.us_historial = us_historial;
		this.us_producto2 = us_producto2;
		this.us_cliente2 = us_cliente2;
		this.us_proveedor2 = us_proveedor2;
		this.us_iccaja = us_iccaja;
		this.us_cpcompra = us_cpcompra;
		this.us_dgasto = us_dgasto;
		this.us_adstolista = us_adstolista;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Usuario(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Usuario{"+", us_nro=" + us_nro+", us_nombre=" + us_nombre+", us_nivel=" + us_nivel+", us_login=" + us_login+", us_sena=" + us_sena+", us_cargo=" + us_cargo+", us_numcaja=" + us_numcaja+", us_borrado=" + us_borrado+", us_codemple=" + us_codemple+", us_archivo=" + us_archivo+", us_auditoria=" + us_auditoria+", us_parametro=" + us_parametro+", us_apermiso=" + us_apermiso+", us_movimiento=" + us_movimiento+", us_rfventa=" + us_rfventa+", us_venta=" + us_venta+", us_compra=" + us_compra+", us_gasto=" + us_gasto+", us_cotizacion=" + us_cotizacion+", us_acaja=" + us_acaja+", us_ajuste=" + us_ajuste+", us_cobcredito=" + us_cobcredito+", us_pproveedor=" + us_pproveedor+", us_afactura=" + us_afactura+", us_depbanco=" + us_depbanco+", us_interes=" + us_interes+", us_registro=" + us_registro+", us_zcliente=" + us_zcliente+", us_ncliente=" + us_ncliente+", us_fcliente=" + us_fcliente+", us_cproducto=" + us_cproducto+", us_ubproducto=" + us_ubproducto+", us_unproducto=" + us_unproducto+", us_banco=" + us_banco+", us_targeta=" + us_targeta+", us_producto=" + us_producto+", us_proveedor=" + us_proveedor+", us_ccajchica=" + us_ccajchica+", us_banco2=" + us_banco2+", us_iconsulta=" + us_iconsulta+", us_stock=" + us_stock+", us_stxproveedor=" + us_stxproveedor+", us_visstmin=" + us_visstmin+", us_xubicacion=" + us_xubicacion+", us_xvencimiento=" + us_xvencimiento+", us_lisproveedor=" + us_lisproveedor+", us_licliente=" + us_licliente+", us_compra2=" + us_compra2+", us_ccontado=" + us_ccontado+", us_ccredito=" + us_ccredito+", us_dccompra=" + us_dccompra+", us_dvcliente=" + us_dvcliente+", us_vstock=" + us_vstock+", us_cemitido=" + us_cemitido+", us_cbanco=" + us_cbanco+", us_dbanco=" + us_dbanco+", us_cventa=" + us_cventa+", us_empleado=" + us_empleado+", us_rempleado=" + us_rempleado+", us_lsalario=" + us_lsalario+", us_adelanto=" + us_adelanto+", us_iadelanto=" + us_iadelanto+", us_mantenimiento=" + us_mantenimiento+", us_cseguridad=" + us_cseguridad+", us_inicializar=" + us_inicializar+", us_bmovimientos=" + us_bmovimientos+", us_itodo=" + us_itodo+", us_usuario=" + us_usuario+", us_csena=" + us_csena+", us_husuario=" + us_husuario+", us_programador=" + us_programador+", us_administrador=" + us_administrador+", us_dventa=" + us_dventa+", us_vcredito=" + us_vcredito+", us_santeior=" + us_santeior+", us_historial=" + us_historial+", us_producto2=" + us_producto2+", us_cliente2=" + us_cliente2+", us_proveedor2=" + us_proveedor2+", us_iccaja=" + us_iccaja+", us_cpcompra=" + us_cpcompra+", us_dgasto=" + us_dgasto+", us_adstolista=" + us_adstolista+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getUs_nro(){
		return us_nro;
	}
	public void setUs_nro(Integer us_nro){
		this.us_nro = us_nro;
	}
	public String getUs_nombre(){
		return us_nombre;
	}
	public void setUs_nombre(String us_nombre){
		this.us_nombre = us_nombre;
	}
	public Integer getUs_nivel(){
		return us_nivel;
	}
	public void setUs_nivel(Integer us_nivel){
		this.us_nivel = us_nivel;
	}
	public String getUs_login(){
		return us_login;
	}
	public void setUs_login(String us_login){
		this.us_login = us_login;
	}
	public String getUs_sena(){
		return us_sena;
	}
	public void setUs_sena(String us_sena){
		this.us_sena = us_sena;
	}
	public String getUs_cargo(){
		return us_cargo;
	}
	public void setUs_cargo(String us_cargo){
		this.us_cargo = us_cargo;
	}
	public Integer getUs_numcaja(){
		return us_numcaja;
	}
	public void setUs_numcaja(Integer us_numcaja){
		this.us_numcaja = us_numcaja;
	}
	public Integer getUs_borrado(){
		return us_borrado;
	}
	public void setUs_borrado(Integer us_borrado){
		this.us_borrado = us_borrado;
	}
	public Integer getUs_codemple(){
		return us_codemple;
	}
	public void setUs_codemple(Integer us_codemple){
		this.us_codemple = us_codemple;
	}
	public Integer getUs_archivo(){
		return us_archivo;
	}
	public void setUs_archivo(Integer us_archivo){
		this.us_archivo = us_archivo;
	}
	public Integer getUs_auditoria(){
		return us_auditoria;
	}
	public void setUs_auditoria(Integer us_auditoria){
		this.us_auditoria = us_auditoria;
	}
	public Integer getUs_parametro(){
		return us_parametro;
	}
	public void setUs_parametro(Integer us_parametro){
		this.us_parametro = us_parametro;
	}
	public Integer getUs_apermiso(){
		return us_apermiso;
	}
	public void setUs_apermiso(Integer us_apermiso){
		this.us_apermiso = us_apermiso;
	}
	public Integer getUs_movimiento(){
		return us_movimiento;
	}
	public void setUs_movimiento(Integer us_movimiento){
		this.us_movimiento = us_movimiento;
	}
	public Integer getUs_rfventa(){
		return us_rfventa;
	}
	public void setUs_rfventa(Integer us_rfventa){
		this.us_rfventa = us_rfventa;
	}
	public Integer getUs_venta(){
		return us_venta;
	}
	public void setUs_venta(Integer us_venta){
		this.us_venta = us_venta;
	}
	public Integer getUs_compra(){
		return us_compra;
	}
	public void setUs_compra(Integer us_compra){
		this.us_compra = us_compra;
	}
	public Integer getUs_gasto(){
		return us_gasto;
	}
	public void setUs_gasto(Integer us_gasto){
		this.us_gasto = us_gasto;
	}
	public Integer getUs_cotizacion(){
		return us_cotizacion;
	}
	public void setUs_cotizacion(Integer us_cotizacion){
		this.us_cotizacion = us_cotizacion;
	}
	public Integer getUs_acaja(){
		return us_acaja;
	}
	public void setUs_acaja(Integer us_acaja){
		this.us_acaja = us_acaja;
	}
	public Integer getUs_ajuste(){
		return us_ajuste;
	}
	public void setUs_ajuste(Integer us_ajuste){
		this.us_ajuste = us_ajuste;
	}
	public Integer getUs_cobcredito(){
		return us_cobcredito;
	}
	public void setUs_cobcredito(Integer us_cobcredito){
		this.us_cobcredito = us_cobcredito;
	}
	public Integer getUs_pproveedor(){
		return us_pproveedor;
	}
	public void setUs_pproveedor(Integer us_pproveedor){
		this.us_pproveedor = us_pproveedor;
	}
	public Integer getUs_afactura(){
		return us_afactura;
	}
	public void setUs_afactura(Integer us_afactura){
		this.us_afactura = us_afactura;
	}
	public Integer getUs_depbanco(){
		return us_depbanco;
	}
	public void setUs_depbanco(Integer us_depbanco){
		this.us_depbanco = us_depbanco;
	}
	public Integer getUs_interes(){
		return us_interes;
	}
	public void setUs_interes(Integer us_interes){
		this.us_interes = us_interes;
	}
	public Integer getUs_registro(){
		return us_registro;
	}
	public void setUs_registro(Integer us_registro){
		this.us_registro = us_registro;
	}
	public Integer getUs_zcliente(){
		return us_zcliente;
	}
	public void setUs_zcliente(Integer us_zcliente){
		this.us_zcliente = us_zcliente;
	}
	public Integer getUs_ncliente(){
		return us_ncliente;
	}
	public void setUs_ncliente(Integer us_ncliente){
		this.us_ncliente = us_ncliente;
	}
	public Integer getUs_fcliente(){
		return us_fcliente;
	}
	public void setUs_fcliente(Integer us_fcliente){
		this.us_fcliente = us_fcliente;
	}
	public Integer getUs_cproducto(){
		return us_cproducto;
	}
	public void setUs_cproducto(Integer us_cproducto){
		this.us_cproducto = us_cproducto;
	}
	public Integer getUs_ubproducto(){
		return us_ubproducto;
	}
	public void setUs_ubproducto(Integer us_ubproducto){
		this.us_ubproducto = us_ubproducto;
	}
	public Integer getUs_unproducto(){
		return us_unproducto;
	}
	public void setUs_unproducto(Integer us_unproducto){
		this.us_unproducto = us_unproducto;
	}
	public Integer getUs_banco(){
		return us_banco;
	}
	public void setUs_banco(Integer us_banco){
		this.us_banco = us_banco;
	}
	public Integer getUs_targeta(){
		return us_targeta;
	}
	public void setUs_targeta(Integer us_targeta){
		this.us_targeta = us_targeta;
	}
	public Integer getUs_producto(){
		return us_producto;
	}
	public void setUs_producto(Integer us_producto){
		this.us_producto = us_producto;
	}
	public Integer getUs_proveedor(){
		return us_proveedor;
	}
	public void setUs_proveedor(Integer us_proveedor){
		this.us_proveedor = us_proveedor;
	}
	public Integer getUs_ccajchica(){
		return us_ccajchica;
	}
	public void setUs_ccajchica(Integer us_ccajchica){
		this.us_ccajchica = us_ccajchica;
	}
	public Integer getUs_banco2(){
		return us_banco2;
	}
	public void setUs_banco2(Integer us_banco2){
		this.us_banco2 = us_banco2;
	}
	public Integer getUs_iconsulta(){
		return us_iconsulta;
	}
	public void setUs_iconsulta(Integer us_iconsulta){
		this.us_iconsulta = us_iconsulta;
	}
	public Integer getUs_stock(){
		return us_stock;
	}
	public void setUs_stock(Integer us_stock){
		this.us_stock = us_stock;
	}
	public Integer getUs_stxproveedor(){
		return us_stxproveedor;
	}
	public void setUs_stxproveedor(Integer us_stxproveedor){
		this.us_stxproveedor = us_stxproveedor;
	}
	public Integer getUs_visstmin(){
		return us_visstmin;
	}
	public void setUs_visstmin(Integer us_visstmin){
		this.us_visstmin = us_visstmin;
	}
	public Integer getUs_xubicacion(){
		return us_xubicacion;
	}
	public void setUs_xubicacion(Integer us_xubicacion){
		this.us_xubicacion = us_xubicacion;
	}
	public Integer getUs_xvencimiento(){
		return us_xvencimiento;
	}
	public void setUs_xvencimiento(Integer us_xvencimiento){
		this.us_xvencimiento = us_xvencimiento;
	}
	public Integer getUs_lisproveedor(){
		return us_lisproveedor;
	}
	public void setUs_lisproveedor(Integer us_lisproveedor){
		this.us_lisproveedor = us_lisproveedor;
	}
	public Integer getUs_licliente(){
		return us_licliente;
	}
	public void setUs_licliente(Integer us_licliente){
		this.us_licliente = us_licliente;
	}
	public Integer getUs_compra2(){
		return us_compra2;
	}
	public void setUs_compra2(Integer us_compra2){
		this.us_compra2 = us_compra2;
	}
	public Integer getUs_ccontado(){
		return us_ccontado;
	}
	public void setUs_ccontado(Integer us_ccontado){
		this.us_ccontado = us_ccontado;
	}
	public Integer getUs_ccredito(){
		return us_ccredito;
	}
	public void setUs_ccredito(Integer us_ccredito){
		this.us_ccredito = us_ccredito;
	}
	public Integer getUs_dccompra(){
		return us_dccompra;
	}
	public void setUs_dccompra(Integer us_dccompra){
		this.us_dccompra = us_dccompra;
	}
	public Integer getUs_dvcliente(){
		return us_dvcliente;
	}
	public void setUs_dvcliente(Integer us_dvcliente){
		this.us_dvcliente = us_dvcliente;
	}
	public Integer getUs_vstock(){
		return us_vstock;
	}
	public void setUs_vstock(Integer us_vstock){
		this.us_vstock = us_vstock;
	}
	public Integer getUs_cemitido(){
		return us_cemitido;
	}
	public void setUs_cemitido(Integer us_cemitido){
		this.us_cemitido = us_cemitido;
	}
	public Integer getUs_cbanco(){
		return us_cbanco;
	}
	public void setUs_cbanco(Integer us_cbanco){
		this.us_cbanco = us_cbanco;
	}
	public Integer getUs_dbanco(){
		return us_dbanco;
	}
	public void setUs_dbanco(Integer us_dbanco){
		this.us_dbanco = us_dbanco;
	}
	public Integer getUs_cventa(){
		return us_cventa;
	}
	public void setUs_cventa(Integer us_cventa){
		this.us_cventa = us_cventa;
	}
	public Integer getUs_empleado(){
		return us_empleado;
	}
	public void setUs_empleado(Integer us_empleado){
		this.us_empleado = us_empleado;
	}
	public Integer getUs_rempleado(){
		return us_rempleado;
	}
	public void setUs_rempleado(Integer us_rempleado){
		this.us_rempleado = us_rempleado;
	}
	public Integer getUs_lsalario(){
		return us_lsalario;
	}
	public void setUs_lsalario(Integer us_lsalario){
		this.us_lsalario = us_lsalario;
	}
	public Integer getUs_adelanto(){
		return us_adelanto;
	}
	public void setUs_adelanto(Integer us_adelanto){
		this.us_adelanto = us_adelanto;
	}
	public Integer getUs_iadelanto(){
		return us_iadelanto;
	}
	public void setUs_iadelanto(Integer us_iadelanto){
		this.us_iadelanto = us_iadelanto;
	}
	public Integer getUs_mantenimiento(){
		return us_mantenimiento;
	}
	public void setUs_mantenimiento(Integer us_mantenimiento){
		this.us_mantenimiento = us_mantenimiento;
	}
	public Integer getUs_cseguridad(){
		return us_cseguridad;
	}
	public void setUs_cseguridad(Integer us_cseguridad){
		this.us_cseguridad = us_cseguridad;
	}
	public Integer getUs_inicializar(){
		return us_inicializar;
	}
	public void setUs_inicializar(Integer us_inicializar){
		this.us_inicializar = us_inicializar;
	}
	public Integer getUs_bmovimientos(){
		return us_bmovimientos;
	}
	public void setUs_bmovimientos(Integer us_bmovimientos){
		this.us_bmovimientos = us_bmovimientos;
	}
	public Integer getUs_itodo(){
		return us_itodo;
	}
	public void setUs_itodo(Integer us_itodo){
		this.us_itodo = us_itodo;
	}
	public Integer getUs_usuario(){
		return us_usuario;
	}
	public void setUs_usuario(Integer us_usuario){
		this.us_usuario = us_usuario;
	}
	public Integer getUs_csena(){
		return us_csena;
	}
	public void setUs_csena(Integer us_csena){
		this.us_csena = us_csena;
	}
	public Integer getUs_husuario(){
		return us_husuario;
	}
	public void setUs_husuario(Integer us_husuario){
		this.us_husuario = us_husuario;
	}
	public Integer getUs_programador(){
		return us_programador;
	}
	public void setUs_programador(Integer us_programador){
		this.us_programador = us_programador;
	}
	public Integer getUs_administrador(){
		return us_administrador;
	}
	public void setUs_administrador(Integer us_administrador){
		this.us_administrador = us_administrador;
	}
	public Integer getUs_dventa(){
		return us_dventa;
	}
	public void setUs_dventa(Integer us_dventa){
		this.us_dventa = us_dventa;
	}
	public Integer getUs_vcredito(){
		return us_vcredito;
	}
	public void setUs_vcredito(Integer us_vcredito){
		this.us_vcredito = us_vcredito;
	}
	public Integer getUs_santeior(){
		return us_santeior;
	}
	public void setUs_santeior(Integer us_santeior){
		this.us_santeior = us_santeior;
	}
	public Integer getUs_historial(){
		return us_historial;
	}
	public void setUs_historial(Integer us_historial){
		this.us_historial = us_historial;
	}
	public Integer getUs_producto2(){
		return us_producto2;
	}
	public void setUs_producto2(Integer us_producto2){
		this.us_producto2 = us_producto2;
	}
	public Integer getUs_cliente2(){
		return us_cliente2;
	}
	public void setUs_cliente2(Integer us_cliente2){
		this.us_cliente2 = us_cliente2;
	}
	public Integer getUs_proveedor2(){
		return us_proveedor2;
	}
	public void setUs_proveedor2(Integer us_proveedor2){
		this.us_proveedor2 = us_proveedor2;
	}
	public Integer getUs_iccaja(){
		return us_iccaja;
	}
	public void setUs_iccaja(Integer us_iccaja){
		this.us_iccaja = us_iccaja;
	}
	public Integer getUs_cpcompra(){
		return us_cpcompra;
	}
	public void setUs_cpcompra(Integer us_cpcompra){
		this.us_cpcompra = us_cpcompra;
	}
	public Integer getUs_dgasto(){
		return us_dgasto;
	}
	public void setUs_dgasto(Integer us_dgasto){
		this.us_dgasto = us_dgasto;
	}
	public Integer getUs_adstolista(){
		return us_adstolista;
	}
	public void setUs_adstolista(Integer us_adstolista){
		this.us_adstolista = us_adstolista;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getUsuariosct(){
		return usuariosct;
	}
	public void setUsuariosct(Integer usuariosct){
		this.usuariosct = usuariosct;
	}
	public String getMaquinasct(){
		return maquinasct;
	}
	public void setMaquinasct(String maquinasct){
		this.maquinasct = maquinasct;
	}

}