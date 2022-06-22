package modelo;

public class Llamadas{
	Integer l_nro;
	String l_fecha;
	String l_hora;
	String l_cliente;
	Integer l_usuario;
	String l_observacion;
	String l_duracion;
	Integer l_borrado;
	String l_fecfijada;
	String fechasct;
	Integer usuariosct;

	public Llamadas(Integer l_nro, String l_fecha, String l_hora, String l_cliente, Integer l_usuario, String l_observacion, String l_duracion, Integer l_borrado, String l_fecfijada, String fechasct, Integer usuariosct){
		this.l_nro = l_nro;
		this.l_fecha = l_fecha;
		this.l_hora = l_hora;
		this.l_cliente = l_cliente;
		this.l_usuario = l_usuario;
		this.l_observacion = l_observacion;
		this.l_duracion = l_duracion;
		this.l_borrado = l_borrado;
		this.l_fecfijada = l_fecfijada;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
	}
	public Llamadas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Llamadas{"+", l_nro=" + l_nro+", l_fecha=" + l_fecha+", l_hora=" + l_hora+", l_cliente=" + l_cliente+", l_usuario=" + l_usuario+", l_observacion=" + l_observacion+", l_duracion=" + l_duracion+", l_borrado=" + l_borrado+", l_fecfijada=" + l_fecfijada+", fechasct=" + fechasct+", usuariosct=" + usuariosct+"}";

	}
	public Integer getL_nro(){
		return l_nro;
	}
	public void setL_nro(Integer l_nro){
		this.l_nro = l_nro;
	}
	public String getL_fecha(){
		return l_fecha;
	}
	public void setL_fecha(String l_fecha){
		this.l_fecha = l_fecha;
	}
	public String getL_hora(){
		return l_hora;
	}
	public void setL_hora(String l_hora){
		this.l_hora = l_hora;
	}
	public String getL_cliente(){
		return l_cliente;
	}
	public void setL_cliente(String l_cliente){
		this.l_cliente = l_cliente;
	}
	public Integer getL_usuario(){
		return l_usuario;
	}
	public void setL_usuario(Integer l_usuario){
		this.l_usuario = l_usuario;
	}
	public String getL_observacion(){
		return l_observacion;
	}
	public void setL_observacion(String l_observacion){
		this.l_observacion = l_observacion;
	}
	public String getL_duracion(){
		return l_duracion;
	}
	public void setL_duracion(String l_duracion){
		this.l_duracion = l_duracion;
	}
	public Integer getL_borrado(){
		return l_borrado;
	}
	public void setL_borrado(Integer l_borrado){
		this.l_borrado = l_borrado;
	}
	public String getL_fecfijada(){
		return l_fecfijada;
	}
	public void setL_fecfijada(String l_fecfijada){
		this.l_fecfijada = l_fecfijada;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getUsuariosct(){
		return usuariosct;
	}
	public void setUsuariosct(Integer usuariosct){
		this.usuariosct = usuariosct;
	}

}