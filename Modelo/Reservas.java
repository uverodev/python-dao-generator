package modelo;

public class Reservas{
	Integer res_codigo;
	String res_diaingreso;
	String res_diasalida;
	String res_horaingreso;
	String res_horasalida;
	Integer res_habitacion;
	String res_clienteencargado;
	Integer res_usuario;
	Double res_total;
	Double res_entregado;
	Integer res_estado;
	Integer res_borrado;
	String res_fecha;
	String res_hora;
	Integer res_cantpersonas;
	Integer res_cantdias;

	public Reservas(Integer res_codigo, String res_diaingreso, String res_diasalida, String res_horaingreso, String res_horasalida, Integer res_habitacion, String res_clienteencargado, Integer res_usuario, Double res_total, Double res_entregado, Integer res_estado, Integer res_borrado, String res_fecha, String res_hora, Integer res_cantpersonas, Integer res_cantdias){
		this.res_codigo = res_codigo;
		this.res_diaingreso = res_diaingreso;
		this.res_diasalida = res_diasalida;
		this.res_horaingreso = res_horaingreso;
		this.res_horasalida = res_horasalida;
		this.res_habitacion = res_habitacion;
		this.res_clienteencargado = res_clienteencargado;
		this.res_usuario = res_usuario;
		this.res_total = res_total;
		this.res_entregado = res_entregado;
		this.res_estado = res_estado;
		this.res_borrado = res_borrado;
		this.res_fecha = res_fecha;
		this.res_hora = res_hora;
		this.res_cantpersonas = res_cantpersonas;
		this.res_cantdias = res_cantdias;
	}
	public Reservas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Reservas{"+", res_codigo=" + res_codigo+", res_diaingreso=" + res_diaingreso+", res_diasalida=" + res_diasalida+", res_horaingreso=" + res_horaingreso+", res_horasalida=" + res_horasalida+", res_habitacion=" + res_habitacion+", res_clienteencargado=" + res_clienteencargado+", res_usuario=" + res_usuario+", res_total=" + res_total+", res_entregado=" + res_entregado+", res_estado=" + res_estado+", res_borrado=" + res_borrado+", res_fecha=" + res_fecha+", res_hora=" + res_hora+", res_cantpersonas=" + res_cantpersonas+", res_cantdias=" + res_cantdias+"}";

	}
	public Integer getRes_codigo(){
		return res_codigo;
	}
	public void setRes_codigo(Integer res_codigo){
		this.res_codigo = res_codigo;
	}
	public String getRes_diaingreso(){
		return res_diaingreso;
	}
	public void setRes_diaingreso(String res_diaingreso){
		this.res_diaingreso = res_diaingreso;
	}
	public String getRes_diasalida(){
		return res_diasalida;
	}
	public void setRes_diasalida(String res_diasalida){
		this.res_diasalida = res_diasalida;
	}
	public String getRes_horaingreso(){
		return res_horaingreso;
	}
	public void setRes_horaingreso(String res_horaingreso){
		this.res_horaingreso = res_horaingreso;
	}
	public String getRes_horasalida(){
		return res_horasalida;
	}
	public void setRes_horasalida(String res_horasalida){
		this.res_horasalida = res_horasalida;
	}
	public Integer getRes_habitacion(){
		return res_habitacion;
	}
	public void setRes_habitacion(Integer res_habitacion){
		this.res_habitacion = res_habitacion;
	}
	public String getRes_clienteencargado(){
		return res_clienteencargado;
	}
	public void setRes_clienteencargado(String res_clienteencargado){
		this.res_clienteencargado = res_clienteencargado;
	}
	public Integer getRes_usuario(){
		return res_usuario;
	}
	public void setRes_usuario(Integer res_usuario){
		this.res_usuario = res_usuario;
	}
	public Double getRes_total(){
		return res_total;
	}
	public void setRes_total(Double res_total){
		this.res_total = res_total;
	}
	public Double getRes_entregado(){
		return res_entregado;
	}
	public void setRes_entregado(Double res_entregado){
		this.res_entregado = res_entregado;
	}
	public Integer getRes_estado(){
		return res_estado;
	}
	public void setRes_estado(Integer res_estado){
		this.res_estado = res_estado;
	}
	public Integer getRes_borrado(){
		return res_borrado;
	}
	public void setRes_borrado(Integer res_borrado){
		this.res_borrado = res_borrado;
	}
	public String getRes_fecha(){
		return res_fecha;
	}
	public void setRes_fecha(String res_fecha){
		this.res_fecha = res_fecha;
	}
	public String getRes_hora(){
		return res_hora;
	}
	public void setRes_hora(String res_hora){
		this.res_hora = res_hora;
	}
	public Integer getRes_cantpersonas(){
		return res_cantpersonas;
	}
	public void setRes_cantpersonas(Integer res_cantpersonas){
		this.res_cantpersonas = res_cantpersonas;
	}
	public Integer getRes_cantdias(){
		return res_cantdias;
	}
	public void setRes_cantdias(Integer res_cantdias){
		this.res_cantdias = res_cantdias;
	}

}