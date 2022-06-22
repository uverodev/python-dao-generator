package modelo;

public class Tip_modalidad{
	Integer tm_codigo;
	String tm_fecha;
	String tm_descripcion;
	Integer tm_borrado;

	public Tip_modalidad(Integer tm_codigo, String tm_fecha, String tm_descripcion, Integer tm_borrado){
		this.tm_codigo = tm_codigo;
		this.tm_fecha = tm_fecha;
		this.tm_descripcion = tm_descripcion;
		this.tm_borrado = tm_borrado;
	}
	public Tip_modalidad(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tip_modalidad{"+", tm_codigo=" + tm_codigo+", tm_fecha=" + tm_fecha+", tm_descripcion=" + tm_descripcion+", tm_borrado=" + tm_borrado+"}";

	}
	public Integer getTm_codigo(){
		return tm_codigo;
	}
	public void setTm_codigo(Integer tm_codigo){
		this.tm_codigo = tm_codigo;
	}
	public String getTm_fecha(){
		return tm_fecha;
	}
	public void setTm_fecha(String tm_fecha){
		this.tm_fecha = tm_fecha;
	}
	public String getTm_descripcion(){
		return tm_descripcion;
	}
	public void setTm_descripcion(String tm_descripcion){
		this.tm_descripcion = tm_descripcion;
	}
	public Integer getTm_borrado(){
		return tm_borrado;
	}
	public void setTm_borrado(Integer tm_borrado){
		this.tm_borrado = tm_borrado;
	}

}