package modelo;

public class Cierre_accionistas{
	Integer ca_id;
	String ca_fecha;
	String ca_hora;
	String ca_fechasct;
	Integer ca_usuario;
	Integer ca_borrado;
	String ca_maquina;
	String ca_fecha_desde;
	String ca_fecha_hasta;
	String ca_hora_desde;
	String ca_hora_hasta;

	public Cierre_accionistas(Integer ca_id, String ca_fecha, String ca_hora, String ca_fechasct, Integer ca_usuario, Integer ca_borrado, String ca_maquina, String ca_fecha_desde, String ca_fecha_hasta, String ca_hora_desde, String ca_hora_hasta){
		this.ca_id = ca_id;
		this.ca_fecha = ca_fecha;
		this.ca_hora = ca_hora;
		this.ca_fechasct = ca_fechasct;
		this.ca_usuario = ca_usuario;
		this.ca_borrado = ca_borrado;
		this.ca_maquina = ca_maquina;
		this.ca_fecha_desde = ca_fecha_desde;
		this.ca_fecha_hasta = ca_fecha_hasta;
		this.ca_hora_desde = ca_hora_desde;
		this.ca_hora_hasta = ca_hora_hasta;
	}
	public Cierre_accionistas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cierre_accionistas{"+", ca_id=" + ca_id+", ca_fecha=" + ca_fecha+", ca_hora=" + ca_hora+", ca_fechasct=" + ca_fechasct+", ca_usuario=" + ca_usuario+", ca_borrado=" + ca_borrado+", ca_maquina=" + ca_maquina+", ca_fecha_desde=" + ca_fecha_desde+", ca_fecha_hasta=" + ca_fecha_hasta+", ca_hora_desde=" + ca_hora_desde+", ca_hora_hasta=" + ca_hora_hasta+"}";

	}
	public Integer getCa_id(){
		return ca_id;
	}
	public void setCa_id(Integer ca_id){
		this.ca_id = ca_id;
	}
	public String getCa_fecha(){
		return ca_fecha;
	}
	public void setCa_fecha(String ca_fecha){
		this.ca_fecha = ca_fecha;
	}
	public String getCa_hora(){
		return ca_hora;
	}
	public void setCa_hora(String ca_hora){
		this.ca_hora = ca_hora;
	}
	public String getCa_fechasct(){
		return ca_fechasct;
	}
	public void setCa_fechasct(String ca_fechasct){
		this.ca_fechasct = ca_fechasct;
	}
	public Integer getCa_usuario(){
		return ca_usuario;
	}
	public void setCa_usuario(Integer ca_usuario){
		this.ca_usuario = ca_usuario;
	}
	public Integer getCa_borrado(){
		return ca_borrado;
	}
	public void setCa_borrado(Integer ca_borrado){
		this.ca_borrado = ca_borrado;
	}
	public String getCa_maquina(){
		return ca_maquina;
	}
	public void setCa_maquina(String ca_maquina){
		this.ca_maquina = ca_maquina;
	}
	public String getCa_fecha_desde(){
		return ca_fecha_desde;
	}
	public void setCa_fecha_desde(String ca_fecha_desde){
		this.ca_fecha_desde = ca_fecha_desde;
	}
	public String getCa_fecha_hasta(){
		return ca_fecha_hasta;
	}
	public void setCa_fecha_hasta(String ca_fecha_hasta){
		this.ca_fecha_hasta = ca_fecha_hasta;
	}
	public String getCa_hora_desde(){
		return ca_hora_desde;
	}
	public void setCa_hora_desde(String ca_hora_desde){
		this.ca_hora_desde = ca_hora_desde;
	}
	public String getCa_hora_hasta(){
		return ca_hora_hasta;
	}
	public void setCa_hora_hasta(String ca_hora_hasta){
		this.ca_hora_hasta = ca_hora_hasta;
	}

}