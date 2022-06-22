package modelo;

public class P_combustible{
	Integer pc_codigo;
	String pc_descripcion;
	Integer pc_borrado;
	String pc_referencia;
	String pc_fecha;

	public P_combustible(Integer pc_codigo, String pc_descripcion, Integer pc_borrado, String pc_referencia, String pc_fecha){
		this.pc_codigo = pc_codigo;
		this.pc_descripcion = pc_descripcion;
		this.pc_borrado = pc_borrado;
		this.pc_referencia = pc_referencia;
		this.pc_fecha = pc_fecha;
	}
	public P_combustible(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "P_combustible{"+", pc_codigo=" + pc_codigo+", pc_descripcion=" + pc_descripcion+", pc_borrado=" + pc_borrado+", pc_referencia=" + pc_referencia+", pc_fecha=" + pc_fecha+"}";

	}
	public Integer getPc_codigo(){
		return pc_codigo;
	}
	public void setPc_codigo(Integer pc_codigo){
		this.pc_codigo = pc_codigo;
	}
	public String getPc_descripcion(){
		return pc_descripcion;
	}
	public void setPc_descripcion(String pc_descripcion){
		this.pc_descripcion = pc_descripcion;
	}
	public Integer getPc_borrado(){
		return pc_borrado;
	}
	public void setPc_borrado(Integer pc_borrado){
		this.pc_borrado = pc_borrado;
	}
	public String getPc_referencia(){
		return pc_referencia;
	}
	public void setPc_referencia(String pc_referencia){
		this.pc_referencia = pc_referencia;
	}
	public String getPc_fecha(){
		return pc_fecha;
	}
	public void setPc_fecha(String pc_fecha){
		this.pc_fecha = pc_fecha;
	}

}