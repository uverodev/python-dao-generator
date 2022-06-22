package modelo;

public class Justificacion{
	Integer jus_codigo;
	Integer jus_empleado;
	String jus_observacion;
	String jus_fecha;
	String jus_fechajustificada;
	String jus_hora;
	Integer jus_usuario;
	String jus_nombrepc;
	Integer jus_tipo;

	public Justificacion(Integer jus_codigo, Integer jus_empleado, String jus_observacion, String jus_fecha, String jus_fechajustificada, String jus_hora, Integer jus_usuario, String jus_nombrepc, Integer jus_tipo){
		this.jus_codigo = jus_codigo;
		this.jus_empleado = jus_empleado;
		this.jus_observacion = jus_observacion;
		this.jus_fecha = jus_fecha;
		this.jus_fechajustificada = jus_fechajustificada;
		this.jus_hora = jus_hora;
		this.jus_usuario = jus_usuario;
		this.jus_nombrepc = jus_nombrepc;
		this.jus_tipo = jus_tipo;
	}
	public Justificacion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Justificacion{"+", jus_codigo=" + jus_codigo+", jus_empleado=" + jus_empleado+", jus_observacion=" + jus_observacion+", jus_fecha=" + jus_fecha+", jus_fechajustificada=" + jus_fechajustificada+", jus_hora=" + jus_hora+", jus_usuario=" + jus_usuario+", jus_nombrepc=" + jus_nombrepc+", jus_tipo=" + jus_tipo+"}";

	}
	public Integer getJus_codigo(){
		return jus_codigo;
	}
	public void setJus_codigo(Integer jus_codigo){
		this.jus_codigo = jus_codigo;
	}
	public Integer getJus_empleado(){
		return jus_empleado;
	}
	public void setJus_empleado(Integer jus_empleado){
		this.jus_empleado = jus_empleado;
	}
	public String getJus_observacion(){
		return jus_observacion;
	}
	public void setJus_observacion(String jus_observacion){
		this.jus_observacion = jus_observacion;
	}
	public String getJus_fecha(){
		return jus_fecha;
	}
	public void setJus_fecha(String jus_fecha){
		this.jus_fecha = jus_fecha;
	}
	public String getJus_fechajustificada(){
		return jus_fechajustificada;
	}
	public void setJus_fechajustificada(String jus_fechajustificada){
		this.jus_fechajustificada = jus_fechajustificada;
	}
	public String getJus_hora(){
		return jus_hora;
	}
	public void setJus_hora(String jus_hora){
		this.jus_hora = jus_hora;
	}
	public Integer getJus_usuario(){
		return jus_usuario;
	}
	public void setJus_usuario(Integer jus_usuario){
		this.jus_usuario = jus_usuario;
	}
	public String getJus_nombrepc(){
		return jus_nombrepc;
	}
	public void setJus_nombrepc(String jus_nombrepc){
		this.jus_nombrepc = jus_nombrepc;
	}
	public Integer getJus_tipo(){
		return jus_tipo;
	}
	public void setJus_tipo(Integer jus_tipo){
		this.jus_tipo = jus_tipo;
	}

}