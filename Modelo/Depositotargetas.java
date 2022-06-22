package modelo;

public class Depositotargetas{
	Integer dt_codigo;
	Integer dt_targeta;
	Object dt_numerotargeta;
	Double dt_monto;
	Integer dt_usuario;
	Object dt_pc;
	Integer dt_borrado;
	Integer dt_numerocuenta;
	String dt_fecha;

	public Depositotargetas(Integer dt_codigo, Integer dt_targeta, Object dt_numerotargeta, Double dt_monto, Integer dt_usuario, Object dt_pc, Integer dt_borrado, Integer dt_numerocuenta, String dt_fecha){
		this.dt_codigo = dt_codigo;
		this.dt_targeta = dt_targeta;
		this.dt_numerotargeta = dt_numerotargeta;
		this.dt_monto = dt_monto;
		this.dt_usuario = dt_usuario;
		this.dt_pc = dt_pc;
		this.dt_borrado = dt_borrado;
		this.dt_numerocuenta = dt_numerocuenta;
		this.dt_fecha = dt_fecha;
	}
	public Depositotargetas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Depositotargetas{"+", dt_codigo=" + dt_codigo+", dt_targeta=" + dt_targeta+", dt_numerotargeta=" + dt_numerotargeta+", dt_monto=" + dt_monto+", dt_usuario=" + dt_usuario+", dt_pc=" + dt_pc+", dt_borrado=" + dt_borrado+", dt_numerocuenta=" + dt_numerocuenta+", dt_fecha=" + dt_fecha+"}";

	}
	public Integer getDt_codigo(){
		return dt_codigo;
	}
	public void setDt_codigo(Integer dt_codigo){
		this.dt_codigo = dt_codigo;
	}
	public Integer getDt_targeta(){
		return dt_targeta;
	}
	public void setDt_targeta(Integer dt_targeta){
		this.dt_targeta = dt_targeta;
	}
	public Object getDt_numerotargeta(){
		return dt_numerotargeta;
	}
	public void setDt_numerotargeta(Object dt_numerotargeta){
		this.dt_numerotargeta = dt_numerotargeta;
	}
	public Double getDt_monto(){
		return dt_monto;
	}
	public void setDt_monto(Double dt_monto){
		this.dt_monto = dt_monto;
	}
	public Integer getDt_usuario(){
		return dt_usuario;
	}
	public void setDt_usuario(Integer dt_usuario){
		this.dt_usuario = dt_usuario;
	}
	public Object getDt_pc(){
		return dt_pc;
	}
	public void setDt_pc(Object dt_pc){
		this.dt_pc = dt_pc;
	}
	public Integer getDt_borrado(){
		return dt_borrado;
	}
	public void setDt_borrado(Integer dt_borrado){
		this.dt_borrado = dt_borrado;
	}
	public Integer getDt_numerocuenta(){
		return dt_numerocuenta;
	}
	public void setDt_numerocuenta(Integer dt_numerocuenta){
		this.dt_numerocuenta = dt_numerocuenta;
	}
	public String getDt_fecha(){
		return dt_fecha;
	}
	public void setDt_fecha(String dt_fecha){
		this.dt_fecha = dt_fecha;
	}

}