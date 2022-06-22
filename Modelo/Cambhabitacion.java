package modelo;

public class Cambhabitacion{
	Integer cmh_codigo;
	Integer cmh_usuario;
	String cmh_motivo;
	String cmh_fecha;
	String cmh_hora;
	Integer cmh_habitacioninicio;
	Integer cmh_habitacionfinal;
	Integer cmh_registro;
	Integer cmh_borrado;

	public Cambhabitacion(Integer cmh_codigo, Integer cmh_usuario, String cmh_motivo, String cmh_fecha, String cmh_hora, Integer cmh_habitacioninicio, Integer cmh_habitacionfinal, Integer cmh_registro, Integer cmh_borrado){
		this.cmh_codigo = cmh_codigo;
		this.cmh_usuario = cmh_usuario;
		this.cmh_motivo = cmh_motivo;
		this.cmh_fecha = cmh_fecha;
		this.cmh_hora = cmh_hora;
		this.cmh_habitacioninicio = cmh_habitacioninicio;
		this.cmh_habitacionfinal = cmh_habitacionfinal;
		this.cmh_registro = cmh_registro;
		this.cmh_borrado = cmh_borrado;
	}
	public Cambhabitacion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cambhabitacion{"+", cmh_codigo=" + cmh_codigo+", cmh_usuario=" + cmh_usuario+", cmh_motivo=" + cmh_motivo+", cmh_fecha=" + cmh_fecha+", cmh_hora=" + cmh_hora+", cmh_habitacioninicio=" + cmh_habitacioninicio+", cmh_habitacionfinal=" + cmh_habitacionfinal+", cmh_registro=" + cmh_registro+", cmh_borrado=" + cmh_borrado+"}";

	}
	public Integer getCmh_codigo(){
		return cmh_codigo;
	}
	public void setCmh_codigo(Integer cmh_codigo){
		this.cmh_codigo = cmh_codigo;
	}
	public Integer getCmh_usuario(){
		return cmh_usuario;
	}
	public void setCmh_usuario(Integer cmh_usuario){
		this.cmh_usuario = cmh_usuario;
	}
	public String getCmh_motivo(){
		return cmh_motivo;
	}
	public void setCmh_motivo(String cmh_motivo){
		this.cmh_motivo = cmh_motivo;
	}
	public String getCmh_fecha(){
		return cmh_fecha;
	}
	public void setCmh_fecha(String cmh_fecha){
		this.cmh_fecha = cmh_fecha;
	}
	public String getCmh_hora(){
		return cmh_hora;
	}
	public void setCmh_hora(String cmh_hora){
		this.cmh_hora = cmh_hora;
	}
	public Integer getCmh_habitacioninicio(){
		return cmh_habitacioninicio;
	}
	public void setCmh_habitacioninicio(Integer cmh_habitacioninicio){
		this.cmh_habitacioninicio = cmh_habitacioninicio;
	}
	public Integer getCmh_habitacionfinal(){
		return cmh_habitacionfinal;
	}
	public void setCmh_habitacionfinal(Integer cmh_habitacionfinal){
		this.cmh_habitacionfinal = cmh_habitacionfinal;
	}
	public Integer getCmh_registro(){
		return cmh_registro;
	}
	public void setCmh_registro(Integer cmh_registro){
		this.cmh_registro = cmh_registro;
	}
	public Integer getCmh_borrado(){
		return cmh_borrado;
	}
	public void setCmh_borrado(Integer cmh_borrado){
		this.cmh_borrado = cmh_borrado;
	}

}