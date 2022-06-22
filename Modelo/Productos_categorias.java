package modelo;

public class Productos_categorias{
	Integer id;
	String nombre;

	public Productos_categorias(Integer id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	public Productos_categorias(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Productos_categorias{"+"id=" + id+"nombre=" + nombre+"}";

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