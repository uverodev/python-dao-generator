package modelo;

public class Limitec{
	Integer lim_codigo;
	String lim_fecha;
	String lim_hora;
	Double lim_montolimite;
	String lim_observacion;
	String lim_cliente;
	Integer lim_usuario;
	Integer lim_borrado;

	public Limitec(Integer lim_codigo, String lim_fecha, String lim_hora, Double lim_montolimite, String lim_observacion, String lim_cliente, Integer lim_usuario, Integer lim_borrado){
		this.lim_codigo = lim_codigo;
		this.lim_fecha = lim_fecha;
		this.lim_hora = lim_hora;
		this.lim_montolimite = lim_montolimite;
		this.lim_observacion = lim_observacion;
		this.lim_cliente = lim_cliente;
		this.lim_usuario = lim_usuario;
		this.lim_borrado = lim_borrado;
	}
	public Limitec(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Limitec{"+", lim_codigo=" + lim_codigo+", lim_fecha=" + lim_fecha+", lim_hora=" + lim_hora+", lim_montolimite=" + lim_montolimite+", lim_observacion=" + lim_observacion+", lim_cliente=" + lim_cliente+", lim_usuario=" + lim_usuario+", lim_borrado=" + lim_borrado+"}";

	}
	public Integer getLim_codigo(){
		return lim_codigo;
	}
	public void setLim_codigo(Integer lim_codigo){
		this.lim_codigo = lim_codigo;
	}
	public String getLim_fecha(){
		return lim_fecha;
	}
	public void setLim_fecha(String lim_fecha){
		this.lim_fecha = lim_fecha;
	}
	public String getLim_hora(){
		return lim_hora;
	}
	public void setLim_hora(String lim_hora){
		this.lim_hora = lim_hora;
	}
	public Double getLim_montolimite(){
		return lim_montolimite;
	}
	public void setLim_montolimite(Double lim_montolimite){
		this.lim_montolimite = lim_montolimite;
	}
	public String getLim_observacion(){
		return lim_observacion;
	}
	public void setLim_observacion(String lim_observacion){
		this.lim_observacion = lim_observacion;
	}
	public String getLim_cliente(){
		return lim_cliente;
	}
	public void setLim_cliente(String lim_cliente){
		this.lim_cliente = lim_cliente;
	}
	public Integer getLim_usuario(){
		return lim_usuario;
	}
	public void setLim_usuario(Integer lim_usuario){
		this.lim_usuario = lim_usuario;
	}
	public Integer getLim_borrado(){
		return lim_borrado;
	}
	public void setLim_borrado(Integer lim_borrado){
		this.lim_borrado = lim_borrado;
	}

}