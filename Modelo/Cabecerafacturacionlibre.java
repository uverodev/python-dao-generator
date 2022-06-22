package modelo;

public class Cabecerafacturacionlibre{
	Integer fl_codigo;
	String fl_fecha;
	Object fl_cliente;
	Double fl_total;
	Double fl_redondeo;
	Integer fl_borrado;
	Integer fl_usuario;
	Object fl_pc;
	Integer fl_tipo;
	Double fl_totalexenta;
	Double fl_total5;
	Double fl_total10;
	Integer fl_tipodoc;
	String fl_fecha_factura;

	public Cabecerafacturacionlibre(Integer fl_codigo, String fl_fecha, Object fl_cliente, Double fl_total, Double fl_redondeo, Integer fl_borrado, Integer fl_usuario, Object fl_pc, Integer fl_tipo, Double fl_totalexenta, Double fl_total5, Double fl_total10, Integer fl_tipodoc, String fl_fecha_factura){
		this.fl_codigo = fl_codigo;
		this.fl_fecha = fl_fecha;
		this.fl_cliente = fl_cliente;
		this.fl_total = fl_total;
		this.fl_redondeo = fl_redondeo;
		this.fl_borrado = fl_borrado;
		this.fl_usuario = fl_usuario;
		this.fl_pc = fl_pc;
		this.fl_tipo = fl_tipo;
		this.fl_totalexenta = fl_totalexenta;
		this.fl_total5 = fl_total5;
		this.fl_total10 = fl_total10;
		this.fl_tipodoc = fl_tipodoc;
		this.fl_fecha_factura = fl_fecha_factura;
	}
	public Cabecerafacturacionlibre(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cabecerafacturacionlibre{"+", fl_codigo=" + fl_codigo+", fl_fecha=" + fl_fecha+", fl_cliente=" + fl_cliente+", fl_total=" + fl_total+", fl_redondeo=" + fl_redondeo+", fl_borrado=" + fl_borrado+", fl_usuario=" + fl_usuario+", fl_pc=" + fl_pc+", fl_tipo=" + fl_tipo+", fl_totalexenta=" + fl_totalexenta+", fl_total5=" + fl_total5+", fl_total10=" + fl_total10+", fl_tipodoc=" + fl_tipodoc+", fl_fecha_factura=" + fl_fecha_factura+"}";

	}
	public Integer getFl_codigo(){
		return fl_codigo;
	}
	public void setFl_codigo(Integer fl_codigo){
		this.fl_codigo = fl_codigo;
	}
	public String getFl_fecha(){
		return fl_fecha;
	}
	public void setFl_fecha(String fl_fecha){
		this.fl_fecha = fl_fecha;
	}
	public Object getFl_cliente(){
		return fl_cliente;
	}
	public void setFl_cliente(Object fl_cliente){
		this.fl_cliente = fl_cliente;
	}
	public Double getFl_total(){
		return fl_total;
	}
	public void setFl_total(Double fl_total){
		this.fl_total = fl_total;
	}
	public Double getFl_redondeo(){
		return fl_redondeo;
	}
	public void setFl_redondeo(Double fl_redondeo){
		this.fl_redondeo = fl_redondeo;
	}
	public Integer getFl_borrado(){
		return fl_borrado;
	}
	public void setFl_borrado(Integer fl_borrado){
		this.fl_borrado = fl_borrado;
	}
	public Integer getFl_usuario(){
		return fl_usuario;
	}
	public void setFl_usuario(Integer fl_usuario){
		this.fl_usuario = fl_usuario;
	}
	public Object getFl_pc(){
		return fl_pc;
	}
	public void setFl_pc(Object fl_pc){
		this.fl_pc = fl_pc;
	}
	public Integer getFl_tipo(){
		return fl_tipo;
	}
	public void setFl_tipo(Integer fl_tipo){
		this.fl_tipo = fl_tipo;
	}
	public Double getFl_totalexenta(){
		return fl_totalexenta;
	}
	public void setFl_totalexenta(Double fl_totalexenta){
		this.fl_totalexenta = fl_totalexenta;
	}
	public Double getFl_total5(){
		return fl_total5;
	}
	public void setFl_total5(Double fl_total5){
		this.fl_total5 = fl_total5;
	}
	public Double getFl_total10(){
		return fl_total10;
	}
	public void setFl_total10(Double fl_total10){
		this.fl_total10 = fl_total10;
	}
	public Integer getFl_tipodoc(){
		return fl_tipodoc;
	}
	public void setFl_tipodoc(Integer fl_tipodoc){
		this.fl_tipodoc = fl_tipodoc;
	}
	public String getFl_fecha_factura(){
		return fl_fecha_factura;
	}
	public void setFl_fecha_factura(String fl_fecha_factura){
		this.fl_fecha_factura = fl_fecha_factura;
	}

}