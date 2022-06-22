package modelo;

public class Modelo{
	Integer mo_cod;
	String mo_descripcion;
	Integer mo_borrado;

	public Modelo(Integer mo_cod, String mo_descripcion, Integer mo_borrado){
		this.mo_cod = mo_cod;
		this.mo_descripcion = mo_descripcion;
		this.mo_borrado = mo_borrado;
	}
	public Modelo(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Modelo{"+", mo_cod=" + mo_cod+", mo_descripcion=" + mo_descripcion+", mo_borrado=" + mo_borrado+"}";

	}
	public Integer getMo_cod(){
		return mo_cod;
	}
	public void setMo_cod(Integer mo_cod){
		this.mo_cod = mo_cod;
	}
	public String getMo_descripcion(){
		return mo_descripcion;
	}
	public void setMo_descripcion(String mo_descripcion){
		this.mo_descripcion = mo_descripcion;
	}
	public Integer getMo_borrado(){
		return mo_borrado;
	}
	public void setMo_borrado(Integer mo_borrado){
		this.mo_borrado = mo_borrado;
	}

}