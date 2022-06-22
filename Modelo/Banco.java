package modelo;

public class Banco{
	Integer ban_nro;
	String ban_descripcion;
	Integer ban_borrado;

	public Banco(Integer ban_nro, String ban_descripcion, Integer ban_borrado){
		this.ban_nro = ban_nro;
		this.ban_descripcion = ban_descripcion;
		this.ban_borrado = ban_borrado;
	}
	public Banco(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Banco{"+", ban_nro=" + ban_nro+", ban_descripcion=" + ban_descripcion+", ban_borrado=" + ban_borrado+"}";

	}
	public Integer getBan_nro(){
		return ban_nro;
	}
	public void setBan_nro(Integer ban_nro){
		this.ban_nro = ban_nro;
	}
	public String getBan_descripcion(){
		return ban_descripcion;
	}
	public void setBan_descripcion(String ban_descripcion){
		this.ban_descripcion = ban_descripcion;
	}
	public Integer getBan_borrado(){
		return ban_borrado;
	}
	public void setBan_borrado(Integer ban_borrado){
		this.ban_borrado = ban_borrado;
	}

}