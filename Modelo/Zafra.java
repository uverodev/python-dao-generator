package modelo;

public class Zafra{
	Integer za_id;
	String za_descripcion;
	String za_inicio;
	String za_fin;
	Integer za_borrado;

	public Zafra(Integer za_id, String za_descripcion, String za_inicio, String za_fin, Integer za_borrado){
		this.za_id = za_id;
		this.za_descripcion = za_descripcion;
		this.za_inicio = za_inicio;
		this.za_fin = za_fin;
		this.za_borrado = za_borrado;
	}
	public Zafra(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Zafra{"+", za_id=" + za_id+", za_descripcion=" + za_descripcion+", za_inicio=" + za_inicio+", za_fin=" + za_fin+", za_borrado=" + za_borrado+"}";

	}
	public Integer getZa_id(){
		return za_id;
	}
	public void setZa_id(Integer za_id){
		this.za_id = za_id;
	}
	public String getZa_descripcion(){
		return za_descripcion;
	}
	public void setZa_descripcion(String za_descripcion){
		this.za_descripcion = za_descripcion;
	}
	public String getZa_inicio(){
		return za_inicio;
	}
	public void setZa_inicio(String za_inicio){
		this.za_inicio = za_inicio;
	}
	public String getZa_fin(){
		return za_fin;
	}
	public void setZa_fin(String za_fin){
		this.za_fin = za_fin;
	}
	public Integer getZa_borrado(){
		return za_borrado;
	}
	public void setZa_borrado(Integer za_borrado){
		this.za_borrado = za_borrado;
	}

}