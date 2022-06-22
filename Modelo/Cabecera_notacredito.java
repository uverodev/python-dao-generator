package modelo;

public class Cabecera_notacredito{
	Integer cn_codigo;
	String cn_fecha;
	Integer cn_proveedor;
	Integer cn_usuario;
	Double cn_total;
	Integer cn_borrado;
	Integer cn_nropago;

	public Cabecera_notacredito(Integer cn_codigo, String cn_fecha, Integer cn_proveedor, Integer cn_usuario, Double cn_total, Integer cn_borrado, Integer cn_nropago){
		this.cn_codigo = cn_codigo;
		this.cn_fecha = cn_fecha;
		this.cn_proveedor = cn_proveedor;
		this.cn_usuario = cn_usuario;
		this.cn_total = cn_total;
		this.cn_borrado = cn_borrado;
		this.cn_nropago = cn_nropago;
	}
	public Cabecera_notacredito(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cabecera_notacredito{"+", cn_codigo=" + cn_codigo+", cn_fecha=" + cn_fecha+", cn_proveedor=" + cn_proveedor+", cn_usuario=" + cn_usuario+", cn_total=" + cn_total+", cn_borrado=" + cn_borrado+", cn_nropago=" + cn_nropago+"}";

	}
	public Integer getCn_codigo(){
		return cn_codigo;
	}
	public void setCn_codigo(Integer cn_codigo){
		this.cn_codigo = cn_codigo;
	}
	public String getCn_fecha(){
		return cn_fecha;
	}
	public void setCn_fecha(String cn_fecha){
		this.cn_fecha = cn_fecha;
	}
	public Integer getCn_proveedor(){
		return cn_proveedor;
	}
	public void setCn_proveedor(Integer cn_proveedor){
		this.cn_proveedor = cn_proveedor;
	}
	public Integer getCn_usuario(){
		return cn_usuario;
	}
	public void setCn_usuario(Integer cn_usuario){
		this.cn_usuario = cn_usuario;
	}
	public Double getCn_total(){
		return cn_total;
	}
	public void setCn_total(Double cn_total){
		this.cn_total = cn_total;
	}
	public Integer getCn_borrado(){
		return cn_borrado;
	}
	public void setCn_borrado(Integer cn_borrado){
		this.cn_borrado = cn_borrado;
	}
	public Integer getCn_nropago(){
		return cn_nropago;
	}
	public void setCn_nropago(Integer cn_nropago){
		this.cn_nropago = cn_nropago;
	}

}