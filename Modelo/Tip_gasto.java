package modelo;

public class Tip_gasto{
	Integer tg_codigo;
	String tg_fecha;
	String tg_descripcion;
	Integer tg_borrado;

	public Tip_gasto(Integer tg_codigo, String tg_fecha, String tg_descripcion, Integer tg_borrado){
		this.tg_codigo = tg_codigo;
		this.tg_fecha = tg_fecha;
		this.tg_descripcion = tg_descripcion;
		this.tg_borrado = tg_borrado;
	}
	public Tip_gasto(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tip_gasto{"+", tg_codigo=" + tg_codigo+", tg_fecha=" + tg_fecha+", tg_descripcion=" + tg_descripcion+", tg_borrado=" + tg_borrado+"}";

	}
	public Integer getTg_codigo(){
		return tg_codigo;
	}
	public void setTg_codigo(Integer tg_codigo){
		this.tg_codigo = tg_codigo;
	}
	public String getTg_fecha(){
		return tg_fecha;
	}
	public void setTg_fecha(String tg_fecha){
		this.tg_fecha = tg_fecha;
	}
	public String getTg_descripcion(){
		return tg_descripcion;
	}
	public void setTg_descripcion(String tg_descripcion){
		this.tg_descripcion = tg_descripcion;
	}
	public Integer getTg_borrado(){
		return tg_borrado;
	}
	public void setTg_borrado(Integer tg_borrado){
		this.tg_borrado = tg_borrado;
	}

}