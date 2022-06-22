package modelo;

public class Areas{
	Integer ar_codigo;
	String ar_registro;
	String ar_detalle;
	Integer ar_borrado;

	public Areas(Integer ar_codigo, String ar_registro, String ar_detalle, Integer ar_borrado){
		this.ar_codigo = ar_codigo;
		this.ar_registro = ar_registro;
		this.ar_detalle = ar_detalle;
		this.ar_borrado = ar_borrado;
	}
	public Areas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Areas{"+", ar_codigo=" + ar_codigo+", ar_registro=" + ar_registro+", ar_detalle=" + ar_detalle+", ar_borrado=" + ar_borrado+"}";

	}
	public Integer getAr_codigo(){
		return ar_codigo;
	}
	public void setAr_codigo(Integer ar_codigo){
		this.ar_codigo = ar_codigo;
	}
	public String getAr_registro(){
		return ar_registro;
	}
	public void setAr_registro(String ar_registro){
		this.ar_registro = ar_registro;
	}
	public String getAr_detalle(){
		return ar_detalle;
	}
	public void setAr_detalle(String ar_detalle){
		this.ar_detalle = ar_detalle;
	}
	public Integer getAr_borrado(){
		return ar_borrado;
	}
	public void setAr_borrado(Integer ar_borrado){
		this.ar_borrado = ar_borrado;
	}

}