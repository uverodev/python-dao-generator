package modelo;

public class Registro_f{
	Integer rf_codigo;
	String rf_nrof;
	Integer rf_nroventa;
	Integer rf_estado;
	String rf_fecha;
	Integer rf_borrado;
	Integer rf_nrohoja;
	Double rf_monto;
	Integer rf_id_timbrado;
	Integer rf_deposito;
	Integer rf_nro_factura;
	Integer rf_tipo_venta;
	Integer rf_moneda;
	String rf_cliente;
	Double rf_iva_5;
	Double rf_iva_10;
	Double rf_exenta;
	String rf_fecha_string;
	String rf_hora_string;
	String rf_maquina;
	Integer rf_usuario;

	public Registro_f(Integer rf_codigo, String rf_nrof, Integer rf_nroventa, Integer rf_estado, String rf_fecha, Integer rf_borrado, Integer rf_nrohoja, Double rf_monto, Integer rf_id_timbrado, Integer rf_deposito, Integer rf_nro_factura, Integer rf_tipo_venta, Integer rf_moneda, String rf_cliente, Double rf_iva_5, Double rf_iva_10, Double rf_exenta, String rf_fecha_string, String rf_hora_string, String rf_maquina, Integer rf_usuario){
		this.rf_codigo = rf_codigo;
		this.rf_nrof = rf_nrof;
		this.rf_nroventa = rf_nroventa;
		this.rf_estado = rf_estado;
		this.rf_fecha = rf_fecha;
		this.rf_borrado = rf_borrado;
		this.rf_nrohoja = rf_nrohoja;
		this.rf_monto = rf_monto;
		this.rf_id_timbrado = rf_id_timbrado;
		this.rf_deposito = rf_deposito;
		this.rf_nro_factura = rf_nro_factura;
		this.rf_tipo_venta = rf_tipo_venta;
		this.rf_moneda = rf_moneda;
		this.rf_cliente = rf_cliente;
		this.rf_iva_5 = rf_iva_5;
		this.rf_iva_10 = rf_iva_10;
		this.rf_exenta = rf_exenta;
		this.rf_fecha_string = rf_fecha_string;
		this.rf_hora_string = rf_hora_string;
		this.rf_maquina = rf_maquina;
		this.rf_usuario = rf_usuario;
	}
	public Registro_f(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Registro_f{"+", rf_codigo=" + rf_codigo+", rf_nrof=" + rf_nrof+", rf_nroventa=" + rf_nroventa+", rf_estado=" + rf_estado+", rf_fecha=" + rf_fecha+", rf_borrado=" + rf_borrado+", rf_nrohoja=" + rf_nrohoja+", rf_monto=" + rf_monto+", rf_id_timbrado=" + rf_id_timbrado+", rf_deposito=" + rf_deposito+", rf_nro_factura=" + rf_nro_factura+", rf_tipo_venta=" + rf_tipo_venta+", rf_moneda=" + rf_moneda+", rf_cliente=" + rf_cliente+", rf_iva_5=" + rf_iva_5+", rf_iva_10=" + rf_iva_10+", rf_exenta=" + rf_exenta+", rf_fecha_string=" + rf_fecha_string+", rf_hora_string=" + rf_hora_string+", rf_maquina=" + rf_maquina+", rf_usuario=" + rf_usuario+"}";

	}
	public Integer getRf_codigo(){
		return rf_codigo;
	}
	public void setRf_codigo(Integer rf_codigo){
		this.rf_codigo = rf_codigo;
	}
	public String getRf_nrof(){
		return rf_nrof;
	}
	public void setRf_nrof(String rf_nrof){
		this.rf_nrof = rf_nrof;
	}
	public Integer getRf_nroventa(){
		return rf_nroventa;
	}
	public void setRf_nroventa(Integer rf_nroventa){
		this.rf_nroventa = rf_nroventa;
	}
	public Integer getRf_estado(){
		return rf_estado;
	}
	public void setRf_estado(Integer rf_estado){
		this.rf_estado = rf_estado;
	}
	public String getRf_fecha(){
		return rf_fecha;
	}
	public void setRf_fecha(String rf_fecha){
		this.rf_fecha = rf_fecha;
	}
	public Integer getRf_borrado(){
		return rf_borrado;
	}
	public void setRf_borrado(Integer rf_borrado){
		this.rf_borrado = rf_borrado;
	}
	public Integer getRf_nrohoja(){
		return rf_nrohoja;
	}
	public void setRf_nrohoja(Integer rf_nrohoja){
		this.rf_nrohoja = rf_nrohoja;
	}
	public Double getRf_monto(){
		return rf_monto;
	}
	public void setRf_monto(Double rf_monto){
		this.rf_monto = rf_monto;
	}
	public Integer getRf_id_timbrado(){
		return rf_id_timbrado;
	}
	public void setRf_id_timbrado(Integer rf_id_timbrado){
		this.rf_id_timbrado = rf_id_timbrado;
	}
	public Integer getRf_deposito(){
		return rf_deposito;
	}
	public void setRf_deposito(Integer rf_deposito){
		this.rf_deposito = rf_deposito;
	}
	public Integer getRf_nro_factura(){
		return rf_nro_factura;
	}
	public void setRf_nro_factura(Integer rf_nro_factura){
		this.rf_nro_factura = rf_nro_factura;
	}
	public Integer getRf_tipo_venta(){
		return rf_tipo_venta;
	}
	public void setRf_tipo_venta(Integer rf_tipo_venta){
		this.rf_tipo_venta = rf_tipo_venta;
	}
	public Integer getRf_moneda(){
		return rf_moneda;
	}
	public void setRf_moneda(Integer rf_moneda){
		this.rf_moneda = rf_moneda;
	}
	public String getRf_cliente(){
		return rf_cliente;
	}
	public void setRf_cliente(String rf_cliente){
		this.rf_cliente = rf_cliente;
	}
	public Double getRf_iva_5(){
		return rf_iva_5;
	}
	public void setRf_iva_5(Double rf_iva_5){
		this.rf_iva_5 = rf_iva_5;
	}
	public Double getRf_iva_10(){
		return rf_iva_10;
	}
	public void setRf_iva_10(Double rf_iva_10){
		this.rf_iva_10 = rf_iva_10;
	}
	public Double getRf_exenta(){
		return rf_exenta;
	}
	public void setRf_exenta(Double rf_exenta){
		this.rf_exenta = rf_exenta;
	}
	public String getRf_fecha_string(){
		return rf_fecha_string;
	}
	public void setRf_fecha_string(String rf_fecha_string){
		this.rf_fecha_string = rf_fecha_string;
	}
	public String getRf_hora_string(){
		return rf_hora_string;
	}
	public void setRf_hora_string(String rf_hora_string){
		this.rf_hora_string = rf_hora_string;
	}
	public String getRf_maquina(){
		return rf_maquina;
	}
	public void setRf_maquina(String rf_maquina){
		this.rf_maquina = rf_maquina;
	}
	public Integer getRf_usuario(){
		return rf_usuario;
	}
	public void setRf_usuario(Integer rf_usuario){
		this.rf_usuario = rf_usuario;
	}

}