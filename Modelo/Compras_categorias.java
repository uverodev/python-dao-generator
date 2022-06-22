package modelo;

public class Compras_categorias{
	Integer id;
	String nombre;

	public Compras_categorias(Integer id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	public Compras_categorias(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compras_categorias{"+"id=" + id+"nombre=" + nombre+"}";

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

}