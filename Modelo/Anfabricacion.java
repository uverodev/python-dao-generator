package modelo;

public class Anfabricacion{
	Integer anfa_cod;
	String anfa_descripcion;
	Integer anfa_borrado;

	public Anfabricacion(Integer anfa_cod, String anfa_descripcion, Integer anfa_borrado){
		this.anfa_cod = anfa_cod;
		this.anfa_descripcion = anfa_descripcion;
		this.anfa_borrado = anfa_borrado;
	}
	public Anfabricacion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Anfabricacion{"+", anfa_cod=" + anfa_cod+", anfa_descripcion=" + anfa_descripcion+", anfa_borrado=" + anfa_borrado+"}";

	}
	public Integer getAnfa_cod(){
		return anfa_cod;
	}
	public void setAnfa_cod(Integer anfa_cod){
		this.anfa_cod = anfa_cod;
	}
	public String getAnfa_descripcion(){
		return anfa_descripcion;
	}
	public void setAnfa_descripcion(String anfa_descripcion){
		this.anfa_descripcion = anfa_descripcion;
	}
	public Integer getAnfa_borrado(){
		return anfa_borrado;
	}
	public void setAnfa_borrado(Integer anfa_borrado){
		this.anfa_borrado = anfa_borrado;
	}

}