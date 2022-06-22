package modelo;

public class Tipvehiculo{
	Integer tip_cod;
	String tip_descripcion;
	Integer tip_borrado;

	public Tipvehiculo(Integer tip_cod, String tip_descripcion, Integer tip_borrado){
		this.tip_cod = tip_cod;
		this.tip_descripcion = tip_descripcion;
		this.tip_borrado = tip_borrado;
	}
	public Tipvehiculo(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tipvehiculo{"+", tip_cod=" + tip_cod+", tip_descripcion=" + tip_descripcion+", tip_borrado=" + tip_borrado+"}";

	}
	public Integer getTip_cod(){
		return tip_cod;
	}
	public void setTip_cod(Integer tip_cod){
		this.tip_cod = tip_cod;
	}
	public String getTip_descripcion(){
		return tip_descripcion;
	}
	public void setTip_descripcion(String tip_descripcion){
		this.tip_descripcion = tip_descripcion;
	}
	public Integer getTip_borrado(){
		return tip_borrado;
	}
	public void setTip_borrado(Integer tip_borrado){
		this.tip_borrado = tip_borrado;
	}

}