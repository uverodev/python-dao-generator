package modelo;

public class Costo_promedio{
	String codigo;
	Double costo_promedio;

	public Costo_promedio(String codigo, Double costo_promedio){
		this.codigo = codigo;
		this.costo_promedio = costo_promedio;
	}
	public Costo_promedio(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Costo_promedio{"+", codigo=" + codigo+", costo_promedio=" + costo_promedio+"}";

	}
	public String getCodigo(){
		return codigo;
	}
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public Double getCosto_promedio(){
		return costo_promedio;
	}
	public void setCosto_promedio(Double costo_promedio){
		this.costo_promedio = costo_promedio;
	}

}