package modelo;

public class Cabeceradevcompra{
	Integer cd_codigo;
	Integer cd_proveedor;
	String cd_fecharegistro;
	String cd_fecha;
	Double cd_total;
	Object cd_numerofactura;
	Integer cd_usuario;
	Object cd_pc;
	Integer cd_borrado;

	public Cabeceradevcompra(Integer cd_codigo, Integer cd_proveedor, String cd_fecharegistro, String cd_fecha, Double cd_total, Object cd_numerofactura, Integer cd_usuario, Object cd_pc, Integer cd_borrado){
		this.cd_codigo = cd_codigo;
		this.cd_proveedor = cd_proveedor;
		this.cd_fecharegistro = cd_fecharegistro;
		this.cd_fecha = cd_fecha;
		this.cd_total = cd_total;
		this.cd_numerofactura = cd_numerofactura;
		this.cd_usuario = cd_usuario;
		this.cd_pc = cd_pc;
		this.cd_borrado = cd_borrado;
	}
	public Cabeceradevcompra(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cabeceradevcompra{"+", cd_codigo=" + cd_codigo+", cd_proveedor=" + cd_proveedor+", cd_fecharegistro=" + cd_fecharegistro+", cd_fecha=" + cd_fecha+", cd_total=" + cd_total+", cd_numerofactura=" + cd_numerofactura+", cd_usuario=" + cd_usuario+", cd_pc=" + cd_pc+", cd_borrado=" + cd_borrado+"}";

	}
	public Integer getCd_codigo(){
		return cd_codigo;
	}
	public void setCd_codigo(Integer cd_codigo){
		this.cd_codigo = cd_codigo;
	}
	public Integer getCd_proveedor(){
		return cd_proveedor;
	}
	public void setCd_proveedor(Integer cd_proveedor){
		this.cd_proveedor = cd_proveedor;
	}
	public String getCd_fecharegistro(){
		return cd_fecharegistro;
	}
	public void setCd_fecharegistro(String cd_fecharegistro){
		this.cd_fecharegistro = cd_fecharegistro;
	}
	public String getCd_fecha(){
		return cd_fecha;
	}
	public void setCd_fecha(String cd_fecha){
		this.cd_fecha = cd_fecha;
	}
	public Double getCd_total(){
		return cd_total;
	}
	public void setCd_total(Double cd_total){
		this.cd_total = cd_total;
	}
	public Object getCd_numerofactura(){
		return cd_numerofactura;
	}
	public void setCd_numerofactura(Object cd_numerofactura){
		this.cd_numerofactura = cd_numerofactura;
	}
	public Integer getCd_usuario(){
		return cd_usuario;
	}
	public void setCd_usuario(Integer cd_usuario){
		this.cd_usuario = cd_usuario;
	}
	public Object getCd_pc(){
		return cd_pc;
	}
	public void setCd_pc(Object cd_pc){
		this.cd_pc = cd_pc;
	}
	public Integer getCd_borrado(){
		return cd_borrado;
	}
	public void setCd_borrado(Integer cd_borrado){
		this.cd_borrado = cd_borrado;
	}

}