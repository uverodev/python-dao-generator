package modelo;

public class Paqasignados{
	Integer pa_codigo;
	Integer pa_reserva;
	Integer pa_habitacion;
	Integer pa_recepcion;
	Integer pa_paquete;
	Integer pa_borrado;

	public Paqasignados(Integer pa_codigo, Integer pa_reserva, Integer pa_habitacion, Integer pa_recepcion, Integer pa_paquete, Integer pa_borrado){
		this.pa_codigo = pa_codigo;
		this.pa_reserva = pa_reserva;
		this.pa_habitacion = pa_habitacion;
		this.pa_recepcion = pa_recepcion;
		this.pa_paquete = pa_paquete;
		this.pa_borrado = pa_borrado;
	}
	public Paqasignados(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Paqasignados{"+", pa_codigo=" + pa_codigo+", pa_reserva=" + pa_reserva+", pa_habitacion=" + pa_habitacion+", pa_recepcion=" + pa_recepcion+", pa_paquete=" + pa_paquete+", pa_borrado=" + pa_borrado+"}";

	}
	public Integer getPa_codigo(){
		return pa_codigo;
	}
	public void setPa_codigo(Integer pa_codigo){
		this.pa_codigo = pa_codigo;
	}
	public Integer getPa_reserva(){
		return pa_reserva;
	}
	public void setPa_reserva(Integer pa_reserva){
		this.pa_reserva = pa_reserva;
	}
	public Integer getPa_habitacion(){
		return pa_habitacion;
	}
	public void setPa_habitacion(Integer pa_habitacion){
		this.pa_habitacion = pa_habitacion;
	}
	public Integer getPa_recepcion(){
		return pa_recepcion;
	}
	public void setPa_recepcion(Integer pa_recepcion){
		this.pa_recepcion = pa_recepcion;
	}
	public Integer getPa_paquete(){
		return pa_paquete;
	}
	public void setPa_paquete(Integer pa_paquete){
		this.pa_paquete = pa_paquete;
	}
	public Integer getPa_borrado(){
		return pa_borrado;
	}
	public void setPa_borrado(Integer pa_borrado){
		this.pa_borrado = pa_borrado;
	}

}