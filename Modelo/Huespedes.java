package modelo;

public class Huespedes{
	Integer h_codigo;
	String h_cedulahuespedes;
	Integer h_habitacion;
	Integer h_recepcion;
	Integer h_estado;
	String h_fechasalida;
	Integer h_alquiler;

	public Huespedes(Integer h_codigo, String h_cedulahuespedes, Integer h_habitacion, Integer h_recepcion, Integer h_estado, String h_fechasalida, Integer h_alquiler){
		this.h_codigo = h_codigo;
		this.h_cedulahuespedes = h_cedulahuespedes;
		this.h_habitacion = h_habitacion;
		this.h_recepcion = h_recepcion;
		this.h_estado = h_estado;
		this.h_fechasalida = h_fechasalida;
		this.h_alquiler = h_alquiler;
	}
	public Huespedes(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Huespedes{"+", h_codigo=" + h_codigo+", h_cedulahuespedes=" + h_cedulahuespedes+", h_habitacion=" + h_habitacion+", h_recepcion=" + h_recepcion+", h_estado=" + h_estado+", h_fechasalida=" + h_fechasalida+", h_alquiler=" + h_alquiler+"}";

	}
	public Integer getH_codigo(){
		return h_codigo;
	}
	public void setH_codigo(Integer h_codigo){
		this.h_codigo = h_codigo;
	}
	public String getH_cedulahuespedes(){
		return h_cedulahuespedes;
	}
	public void setH_cedulahuespedes(String h_cedulahuespedes){
		this.h_cedulahuespedes = h_cedulahuespedes;
	}
	public Integer getH_habitacion(){
		return h_habitacion;
	}
	public void setH_habitacion(Integer h_habitacion){
		this.h_habitacion = h_habitacion;
	}
	public Integer getH_recepcion(){
		return h_recepcion;
	}
	public void setH_recepcion(Integer h_recepcion){
		this.h_recepcion = h_recepcion;
	}
	public Integer getH_estado(){
		return h_estado;
	}
	public void setH_estado(Integer h_estado){
		this.h_estado = h_estado;
	}
	public String getH_fechasalida(){
		return h_fechasalida;
	}
	public void setH_fechasalida(String h_fechasalida){
		this.h_fechasalida = h_fechasalida;
	}
	public Integer getH_alquiler(){
		return h_alquiler;
	}
	public void setH_alquiler(Integer h_alquiler){
		this.h_alquiler = h_alquiler;
	}

}