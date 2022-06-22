package modelo;

public class Impuesto{
	Integer imp_id;
	String imp_descripcion;
	Double imp_exenta;
	Double imp_iva_5;
	Double imp_iva_10;
	Integer imp_orden;
	Integer imp_borrado;

	public Impuesto(Integer imp_id, String imp_descripcion, Double imp_exenta, Double imp_iva_5, Double imp_iva_10, Integer imp_orden, Integer imp_borrado){
		this.imp_id = imp_id;
		this.imp_descripcion = imp_descripcion;
		this.imp_exenta = imp_exenta;
		this.imp_iva_5 = imp_iva_5;
		this.imp_iva_10 = imp_iva_10;
		this.imp_orden = imp_orden;
		this.imp_borrado = imp_borrado;
	}
	public Impuesto(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Impuesto{"+", imp_id=" + imp_id+", imp_descripcion=" + imp_descripcion+", imp_exenta=" + imp_exenta+", imp_iva_5=" + imp_iva_5+", imp_iva_10=" + imp_iva_10+", imp_orden=" + imp_orden+", imp_borrado=" + imp_borrado+"}";

	}
	public Integer getImp_id(){
		return imp_id;
	}
	public void setImp_id(Integer imp_id){
		this.imp_id = imp_id;
	}
	public String getImp_descripcion(){
		return imp_descripcion;
	}
	public void setImp_descripcion(String imp_descripcion){
		this.imp_descripcion = imp_descripcion;
	}
	public Double getImp_exenta(){
		return imp_exenta;
	}
	public void setImp_exenta(Double imp_exenta){
		this.imp_exenta = imp_exenta;
	}
	public Double getImp_iva_5(){
		return imp_iva_5;
	}
	public void setImp_iva_5(Double imp_iva_5){
		this.imp_iva_5 = imp_iva_5;
	}
	public Double getImp_iva_10(){
		return imp_iva_10;
	}
	public void setImp_iva_10(Double imp_iva_10){
		this.imp_iva_10 = imp_iva_10;
	}
	public Integer getImp_orden(){
		return imp_orden;
	}
	public void setImp_orden(Integer imp_orden){
		this.imp_orden = imp_orden;
	}
	public Integer getImp_borrado(){
		return imp_borrado;
	}
	public void setImp_borrado(Integer imp_borrado){
		this.imp_borrado = imp_borrado;
	}

}