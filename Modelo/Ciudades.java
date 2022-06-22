package modelo;

public class Ciudades{
	Integer ciu_nro;
	String ciu_nombre;
	Integer ciu_borrado;

	public Ciudades(Integer ciu_nro, String ciu_nombre, Integer ciu_borrado){
		this.ciu_nro = ciu_nro;
		this.ciu_nombre = ciu_nombre;
		this.ciu_borrado = ciu_borrado;
	}
	public Ciudades(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ciudades{"+", ciu_nro=" + ciu_nro+", ciu_nombre=" + ciu_nombre+", ciu_borrado=" + ciu_borrado+"}";

	}
	public Integer getCiu_nro(){
		return ciu_nro;
	}
	public void setCiu_nro(Integer ciu_nro){
		this.ciu_nro = ciu_nro;
	}
	public String getCiu_nombre(){
		return ciu_nombre;
	}
	public void setCiu_nombre(String ciu_nombre){
		this.ciu_nombre = ciu_nombre;
	}
	public Integer getCiu_borrado(){
		return ciu_borrado;
	}
	public void setCiu_borrado(Integer ciu_borrado){
		this.ciu_borrado = ciu_borrado;
	}

}