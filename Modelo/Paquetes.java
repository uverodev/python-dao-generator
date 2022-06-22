package modelo;

public class Paquetes{
	Integer paq_codigo;
	String paq_fecha;
	String paq_hora;
	Double paq_costadicional;
	String paq_descripcion;
	Integer paq_usuario;
	Integer paq_borrado;

	public Paquetes(Integer paq_codigo, String paq_fecha, String paq_hora, Double paq_costadicional, String paq_descripcion, Integer paq_usuario, Integer paq_borrado){
		this.paq_codigo = paq_codigo;
		this.paq_fecha = paq_fecha;
		this.paq_hora = paq_hora;
		this.paq_costadicional = paq_costadicional;
		this.paq_descripcion = paq_descripcion;
		this.paq_usuario = paq_usuario;
		this.paq_borrado = paq_borrado;
	}
	public Paquetes(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Paquetes{"+", paq_codigo=" + paq_codigo+", paq_fecha=" + paq_fecha+", paq_hora=" + paq_hora+", paq_costadicional=" + paq_costadicional+", paq_descripcion=" + paq_descripcion+", paq_usuario=" + paq_usuario+", paq_borrado=" + paq_borrado+"}";

	}
	public Integer getPaq_codigo(){
		return paq_codigo;
	}
	public void setPaq_codigo(Integer paq_codigo){
		this.paq_codigo = paq_codigo;
	}
	public String getPaq_fecha(){
		return paq_fecha;
	}
	public void setPaq_fecha(String paq_fecha){
		this.paq_fecha = paq_fecha;
	}
	public String getPaq_hora(){
		return paq_hora;
	}
	public void setPaq_hora(String paq_hora){
		this.paq_hora = paq_hora;
	}
	public Double getPaq_costadicional(){
		return paq_costadicional;
	}
	public void setPaq_costadicional(Double paq_costadicional){
		this.paq_costadicional = paq_costadicional;
	}
	public String getPaq_descripcion(){
		return paq_descripcion;
	}
	public void setPaq_descripcion(String paq_descripcion){
		this.paq_descripcion = paq_descripcion;
	}
	public Integer getPaq_usuario(){
		return paq_usuario;
	}
	public void setPaq_usuario(Integer paq_usuario){
		this.paq_usuario = paq_usuario;
	}
	public Integer getPaq_borrado(){
		return paq_borrado;
	}
	public void setPaq_borrado(Integer paq_borrado){
		this.paq_borrado = paq_borrado;
	}

}