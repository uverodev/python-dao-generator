package modelo;

public class Pagcompracontadocaja{
	Integer pcc_codigo;
	Integer pcc_proveedor;
	Double pcc_total;
	Integer pcc_usuario;
	String pcc_fecha;
	Object pcc_pc;
	Integer pcc_borrado;

	public Pagcompracontadocaja(Integer pcc_codigo, Integer pcc_proveedor, Double pcc_total, Integer pcc_usuario, String pcc_fecha, Object pcc_pc, Integer pcc_borrado){
		this.pcc_codigo = pcc_codigo;
		this.pcc_proveedor = pcc_proveedor;
		this.pcc_total = pcc_total;
		this.pcc_usuario = pcc_usuario;
		this.pcc_fecha = pcc_fecha;
		this.pcc_pc = pcc_pc;
		this.pcc_borrado = pcc_borrado;
	}
	public Pagcompracontadocaja(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pagcompracontadocaja{"+", pcc_codigo=" + pcc_codigo+", pcc_proveedor=" + pcc_proveedor+", pcc_total=" + pcc_total+", pcc_usuario=" + pcc_usuario+", pcc_fecha=" + pcc_fecha+", pcc_pc=" + pcc_pc+", pcc_borrado=" + pcc_borrado+"}";

	}
	public Integer getPcc_codigo(){
		return pcc_codigo;
	}
	public void setPcc_codigo(Integer pcc_codigo){
		this.pcc_codigo = pcc_codigo;
	}
	public Integer getPcc_proveedor(){
		return pcc_proveedor;
	}
	public void setPcc_proveedor(Integer pcc_proveedor){
		this.pcc_proveedor = pcc_proveedor;
	}
	public Double getPcc_total(){
		return pcc_total;
	}
	public void setPcc_total(Double pcc_total){
		this.pcc_total = pcc_total;
	}
	public Integer getPcc_usuario(){
		return pcc_usuario;
	}
	public void setPcc_usuario(Integer pcc_usuario){
		this.pcc_usuario = pcc_usuario;
	}
	public String getPcc_fecha(){
		return pcc_fecha;
	}
	public void setPcc_fecha(String pcc_fecha){
		this.pcc_fecha = pcc_fecha;
	}
	public Object getPcc_pc(){
		return pcc_pc;
	}
	public void setPcc_pc(Object pcc_pc){
		this.pcc_pc = pcc_pc;
	}
	public Integer getPcc_borrado(){
		return pcc_borrado;
	}
	public void setPcc_borrado(Integer pcc_borrado){
		this.pcc_borrado = pcc_borrado;
	}

}