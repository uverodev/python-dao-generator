package modelo;

public class Consumicioncab{
	Integer consc_codigo;
	String consc_fecha;
	String consc_hora;
	Integer consc_habitacion;
	Integer consc_estado;
	Double consc_total;
	Integer consc_recepcion;
	Integer consc_usuario;
	Integer consc_borrado;
	Integer consc_arqueo;
	Integer consc_nroarqueo;

	public Consumicioncab(Integer consc_codigo, String consc_fecha, String consc_hora, Integer consc_habitacion, Integer consc_estado, Double consc_total, Integer consc_recepcion, Integer consc_usuario, Integer consc_borrado, Integer consc_arqueo, Integer consc_nroarqueo){
		this.consc_codigo = consc_codigo;
		this.consc_fecha = consc_fecha;
		this.consc_hora = consc_hora;
		this.consc_habitacion = consc_habitacion;
		this.consc_estado = consc_estado;
		this.consc_total = consc_total;
		this.consc_recepcion = consc_recepcion;
		this.consc_usuario = consc_usuario;
		this.consc_borrado = consc_borrado;
		this.consc_arqueo = consc_arqueo;
		this.consc_nroarqueo = consc_nroarqueo;
	}
	public Consumicioncab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Consumicioncab{"+", consc_codigo=" + consc_codigo+", consc_fecha=" + consc_fecha+", consc_hora=" + consc_hora+", consc_habitacion=" + consc_habitacion+", consc_estado=" + consc_estado+", consc_total=" + consc_total+", consc_recepcion=" + consc_recepcion+", consc_usuario=" + consc_usuario+", consc_borrado=" + consc_borrado+", consc_arqueo=" + consc_arqueo+", consc_nroarqueo=" + consc_nroarqueo+"}";

	}
	public Integer getConsc_codigo(){
		return consc_codigo;
	}
	public void setConsc_codigo(Integer consc_codigo){
		this.consc_codigo = consc_codigo;
	}
	public String getConsc_fecha(){
		return consc_fecha;
	}
	public void setConsc_fecha(String consc_fecha){
		this.consc_fecha = consc_fecha;
	}
	public String getConsc_hora(){
		return consc_hora;
	}
	public void setConsc_hora(String consc_hora){
		this.consc_hora = consc_hora;
	}
	public Integer getConsc_habitacion(){
		return consc_habitacion;
	}
	public void setConsc_habitacion(Integer consc_habitacion){
		this.consc_habitacion = consc_habitacion;
	}
	public Integer getConsc_estado(){
		return consc_estado;
	}
	public void setConsc_estado(Integer consc_estado){
		this.consc_estado = consc_estado;
	}
	public Double getConsc_total(){
		return consc_total;
	}
	public void setConsc_total(Double consc_total){
		this.consc_total = consc_total;
	}
	public Integer getConsc_recepcion(){
		return consc_recepcion;
	}
	public void setConsc_recepcion(Integer consc_recepcion){
		this.consc_recepcion = consc_recepcion;
	}
	public Integer getConsc_usuario(){
		return consc_usuario;
	}
	public void setConsc_usuario(Integer consc_usuario){
		this.consc_usuario = consc_usuario;
	}
	public Integer getConsc_borrado(){
		return consc_borrado;
	}
	public void setConsc_borrado(Integer consc_borrado){
		this.consc_borrado = consc_borrado;
	}
	public Integer getConsc_arqueo(){
		return consc_arqueo;
	}
	public void setConsc_arqueo(Integer consc_arqueo){
		this.consc_arqueo = consc_arqueo;
	}
	public Integer getConsc_nroarqueo(){
		return consc_nroarqueo;
	}
	public void setConsc_nroarqueo(Integer consc_nroarqueo){
		this.consc_nroarqueo = consc_nroarqueo;
	}

}