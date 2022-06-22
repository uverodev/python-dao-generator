package modelo;

public class Monedas{
	Integer id;
	String nombre;
	Double cambio;

	public Monedas(Integer id, String nombre, Double cambio){
		this.id = id;
		this.nombre = nombre;
		this.cambio = cambio;
	}
	public Monedas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Monedas{"+"id=" + id+"nombre=" + nombre+"cambio=" + cambio+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public Double getCambio(){
		return cambio;
	}
	public void setCambio(Double cambio){
		this.cambio = cambio;
	}

}