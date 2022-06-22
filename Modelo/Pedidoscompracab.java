package modelo;

public class Pedidoscompracab{
	Integer cpc_codigo;
	String cpc_fecha;
	Integer cpc_usuario;
	Double cpc_total;
	String cpc_fechallegada;
	Integer cpc_proveedor;
	Integer cpc_borrado;
	String cpc_maquina;

	public Pedidoscompracab(Integer cpc_codigo, String cpc_fecha, Integer cpc_usuario, Double cpc_total, String cpc_fechallegada, Integer cpc_proveedor, Integer cpc_borrado, String cpc_maquina){
		this.cpc_codigo = cpc_codigo;
		this.cpc_fecha = cpc_fecha;
		this.cpc_usuario = cpc_usuario;
		this.cpc_total = cpc_total;
		this.cpc_fechallegada = cpc_fechallegada;
		this.cpc_proveedor = cpc_proveedor;
		this.cpc_borrado = cpc_borrado;
		this.cpc_maquina = cpc_maquina;
	}
	public Pedidoscompracab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pedidoscompracab{"+", cpc_codigo=" + cpc_codigo+", cpc_fecha=" + cpc_fecha+", cpc_usuario=" + cpc_usuario+", cpc_total=" + cpc_total+", cpc_fechallegada=" + cpc_fechallegada+", cpc_proveedor=" + cpc_proveedor+", cpc_borrado=" + cpc_borrado+", cpc_maquina=" + cpc_maquina+"}";

	}
	public Integer getCpc_codigo(){
		return cpc_codigo;
	}
	public void setCpc_codigo(Integer cpc_codigo){
		this.cpc_codigo = cpc_codigo;
	}
	public String getCpc_fecha(){
		return cpc_fecha;
	}
	public void setCpc_fecha(String cpc_fecha){
		this.cpc_fecha = cpc_fecha;
	}
	public Integer getCpc_usuario(){
		return cpc_usuario;
	}
	public void setCpc_usuario(Integer cpc_usuario){
		this.cpc_usuario = cpc_usuario;
	}
	public Double getCpc_total(){
		return cpc_total;
	}
	public void setCpc_total(Double cpc_total){
		this.cpc_total = cpc_total;
	}
	public String getCpc_fechallegada(){
		return cpc_fechallegada;
	}
	public void setCpc_fechallegada(String cpc_fechallegada){
		this.cpc_fechallegada = cpc_fechallegada;
	}
	public Integer getCpc_proveedor(){
		return cpc_proveedor;
	}
	public void setCpc_proveedor(Integer cpc_proveedor){
		this.cpc_proveedor = cpc_proveedor;
	}
	public Integer getCpc_borrado(){
		return cpc_borrado;
	}
	public void setCpc_borrado(Integer cpc_borrado){
		this.cpc_borrado = cpc_borrado;
	}
	public String getCpc_maquina(){
		return cpc_maquina;
	}
	public void setCpc_maquina(String cpc_maquina){
		this.cpc_maquina = cpc_maquina;
	}

}