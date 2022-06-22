package modelo;

public class Color{
	Integer co_cod;
	String co_descripcion;
	Integer co_borrado;

	public Color(Integer co_cod, String co_descripcion, Integer co_borrado){
		this.co_cod = co_cod;
		this.co_descripcion = co_descripcion;
		this.co_borrado = co_borrado;
	}
	public Color(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Color{"+", co_cod=" + co_cod+", co_descripcion=" + co_descripcion+", co_borrado=" + co_borrado+"}";

	}
	public Integer getCo_cod(){
		return co_cod;
	}
	public void setCo_cod(Integer co_cod){
		this.co_cod = co_cod;
	}
	public String getCo_descripcion(){
		return co_descripcion;
	}
	public void setCo_descripcion(String co_descripcion){
		this.co_descripcion = co_descripcion;
	}
	public Integer getCo_borrado(){
		return co_borrado;
	}
	public void setCo_borrado(Integer co_borrado){
		this.co_borrado = co_borrado;
	}

}