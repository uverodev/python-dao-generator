package modelo;

public class Marca{
	Integer mar_cod;
	String mar_descripcion;
	Integer mar_borrado;

	public Marca(Integer mar_cod, String mar_descripcion, Integer mar_borrado){
		this.mar_cod = mar_cod;
		this.mar_descripcion = mar_descripcion;
		this.mar_borrado = mar_borrado;
	}
	public Marca(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Marca{"+", mar_cod=" + mar_cod+", mar_descripcion=" + mar_descripcion+", mar_borrado=" + mar_borrado+"}";

	}
	public Integer getMar_cod(){
		return mar_cod;
	}
	public void setMar_cod(Integer mar_cod){
		this.mar_cod = mar_cod;
	}
	public String getMar_descripcion(){
		return mar_descripcion;
	}
	public void setMar_descripcion(String mar_descripcion){
		this.mar_descripcion = mar_descripcion;
	}
	public Integer getMar_borrado(){
		return mar_borrado;
	}
	public void setMar_borrado(Integer mar_borrado){
		this.mar_borrado = mar_borrado;
	}

}