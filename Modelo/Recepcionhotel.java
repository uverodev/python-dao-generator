package modelo;

public class Recepcionhotel{
	Integer rec_codigo;
	Integer rec_estado;
	String rec_fechaingreso;
	String rec_horaingreso;
	String rec_fechasalida;
	String rec_horasalida;
	String rec_fechasalidareal;
	String rec_horasalidareal;
	Integer rec_habitaciones;
	Integer rec_cantdias;
	String rec_fecha;
	String rec_hora;
	Double rec_totalapagar;
	Double rec_entregado;
	Double rec_saldo;
	Double rec_descuento;
	Double rec_totalconsumicion;
	Double rec_totalhospedaje;
	Double rec_totalgastosvarios;
	Integer rec_resnum;
	Integer rec_borrado;
	Integer rec_facturalegal;
	Double rec_adicional;
	Integer rec_numcarrito;
	Double rec_costcarrito;
	Integer rec_usuario;

	public Recepcionhotel(Integer rec_codigo, Integer rec_estado, String rec_fechaingreso, String rec_horaingreso, String rec_fechasalida, String rec_horasalida, String rec_fechasalidareal, String rec_horasalidareal, Integer rec_habitaciones, Integer rec_cantdias, String rec_fecha, String rec_hora, Double rec_totalapagar, Double rec_entregado, Double rec_saldo, Double rec_descuento, Double rec_totalconsumicion, Double rec_totalhospedaje, Double rec_totalgastosvarios, Integer rec_resnum, Integer rec_borrado, Integer rec_facturalegal, Double rec_adicional, Integer rec_numcarrito, Double rec_costcarrito, Integer rec_usuario){
		this.rec_codigo = rec_codigo;
		this.rec_estado = rec_estado;
		this.rec_fechaingreso = rec_fechaingreso;
		this.rec_horaingreso = rec_horaingreso;
		this.rec_fechasalida = rec_fechasalida;
		this.rec_horasalida = rec_horasalida;
		this.rec_fechasalidareal = rec_fechasalidareal;
		this.rec_horasalidareal = rec_horasalidareal;
		this.rec_habitaciones = rec_habitaciones;
		this.rec_cantdias = rec_cantdias;
		this.rec_fecha = rec_fecha;
		this.rec_hora = rec_hora;
		this.rec_totalapagar = rec_totalapagar;
		this.rec_entregado = rec_entregado;
		this.rec_saldo = rec_saldo;
		this.rec_descuento = rec_descuento;
		this.rec_totalconsumicion = rec_totalconsumicion;
		this.rec_totalhospedaje = rec_totalhospedaje;
		this.rec_totalgastosvarios = rec_totalgastosvarios;
		this.rec_resnum = rec_resnum;
		this.rec_borrado = rec_borrado;
		this.rec_facturalegal = rec_facturalegal;
		this.rec_adicional = rec_adicional;
		this.rec_numcarrito = rec_numcarrito;
		this.rec_costcarrito = rec_costcarrito;
		this.rec_usuario = rec_usuario;
	}
	public Recepcionhotel(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Recepcionhotel{"+", rec_codigo=" + rec_codigo+", rec_estado=" + rec_estado+", rec_fechaingreso=" + rec_fechaingreso+", rec_horaingreso=" + rec_horaingreso+", rec_fechasalida=" + rec_fechasalida+", rec_horasalida=" + rec_horasalida+", rec_fechasalidareal=" + rec_fechasalidareal+", rec_horasalidareal=" + rec_horasalidareal+", rec_habitaciones=" + rec_habitaciones+", rec_cantdias=" + rec_cantdias+", rec_fecha=" + rec_fecha+", rec_hora=" + rec_hora+", rec_totalapagar=" + rec_totalapagar+", rec_entregado=" + rec_entregado+", rec_saldo=" + rec_saldo+", rec_descuento=" + rec_descuento+", rec_totalconsumicion=" + rec_totalconsumicion+", rec_totalhospedaje=" + rec_totalhospedaje+", rec_totalgastosvarios=" + rec_totalgastosvarios+", rec_resnum=" + rec_resnum+", rec_borrado=" + rec_borrado+", rec_facturalegal=" + rec_facturalegal+", rec_adicional=" + rec_adicional+", rec_numcarrito=" + rec_numcarrito+", rec_costcarrito=" + rec_costcarrito+", rec_usuario=" + rec_usuario+"}";

	}
	public Integer getRec_codigo(){
		return rec_codigo;
	}
	public void setRec_codigo(Integer rec_codigo){
		this.rec_codigo = rec_codigo;
	}
	public Integer getRec_estado(){
		return rec_estado;
	}
	public void setRec_estado(Integer rec_estado){
		this.rec_estado = rec_estado;
	}
	public String getRec_fechaingreso(){
		return rec_fechaingreso;
	}
	public void setRec_fechaingreso(String rec_fechaingreso){
		this.rec_fechaingreso = rec_fechaingreso;
	}
	public String getRec_horaingreso(){
		return rec_horaingreso;
	}
	public void setRec_horaingreso(String rec_horaingreso){
		this.rec_horaingreso = rec_horaingreso;
	}
	public String getRec_fechasalida(){
		return rec_fechasalida;
	}
	public void setRec_fechasalida(String rec_fechasalida){
		this.rec_fechasalida = rec_fechasalida;
	}
	public String getRec_horasalida(){
		return rec_horasalida;
	}
	public void setRec_horasalida(String rec_horasalida){
		this.rec_horasalida = rec_horasalida;
	}
	public String getRec_fechasalidareal(){
		return rec_fechasalidareal;
	}
	public void setRec_fechasalidareal(String rec_fechasalidareal){
		this.rec_fechasalidareal = rec_fechasalidareal;
	}
	public String getRec_horasalidareal(){
		return rec_horasalidareal;
	}
	public void setRec_horasalidareal(String rec_horasalidareal){
		this.rec_horasalidareal = rec_horasalidareal;
	}
	public Integer getRec_habitaciones(){
		return rec_habitaciones;
	}
	public void setRec_habitaciones(Integer rec_habitaciones){
		this.rec_habitaciones = rec_habitaciones;
	}
	public Integer getRec_cantdias(){
		return rec_cantdias;
	}
	public void setRec_cantdias(Integer rec_cantdias){
		this.rec_cantdias = rec_cantdias;
	}
	public String getRec_fecha(){
		return rec_fecha;
	}
	public void setRec_fecha(String rec_fecha){
		this.rec_fecha = rec_fecha;
	}
	public String getRec_hora(){
		return rec_hora;
	}
	public void setRec_hora(String rec_hora){
		this.rec_hora = rec_hora;
	}
	public Double getRec_totalapagar(){
		return rec_totalapagar;
	}
	public void setRec_totalapagar(Double rec_totalapagar){
		this.rec_totalapagar = rec_totalapagar;
	}
	public Double getRec_entregado(){
		return rec_entregado;
	}
	public void setRec_entregado(Double rec_entregado){
		this.rec_entregado = rec_entregado;
	}
	public Double getRec_saldo(){
		return rec_saldo;
	}
	public void setRec_saldo(Double rec_saldo){
		this.rec_saldo = rec_saldo;
	}
	public Double getRec_descuento(){
		return rec_descuento;
	}
	public void setRec_descuento(Double rec_descuento){
		this.rec_descuento = rec_descuento;
	}
	public Double getRec_totalconsumicion(){
		return rec_totalconsumicion;
	}
	public void setRec_totalconsumicion(Double rec_totalconsumicion){
		this.rec_totalconsumicion = rec_totalconsumicion;
	}
	public Double getRec_totalhospedaje(){
		return rec_totalhospedaje;
	}
	public void setRec_totalhospedaje(Double rec_totalhospedaje){
		this.rec_totalhospedaje = rec_totalhospedaje;
	}
	public Double getRec_totalgastosvarios(){
		return rec_totalgastosvarios;
	}
	public void setRec_totalgastosvarios(Double rec_totalgastosvarios){
		this.rec_totalgastosvarios = rec_totalgastosvarios;
	}
	public Integer getRec_resnum(){
		return rec_resnum;
	}
	public void setRec_resnum(Integer rec_resnum){
		this.rec_resnum = rec_resnum;
	}
	public Integer getRec_borrado(){
		return rec_borrado;
	}
	public void setRec_borrado(Integer rec_borrado){
		this.rec_borrado = rec_borrado;
	}
	public Integer getRec_facturalegal(){
		return rec_facturalegal;
	}
	public void setRec_facturalegal(Integer rec_facturalegal){
		this.rec_facturalegal = rec_facturalegal;
	}
	public Double getRec_adicional(){
		return rec_adicional;
	}
	public void setRec_adicional(Double rec_adicional){
		this.rec_adicional = rec_adicional;
	}
	public Integer getRec_numcarrito(){
		return rec_numcarrito;
	}
	public void setRec_numcarrito(Integer rec_numcarrito){
		this.rec_numcarrito = rec_numcarrito;
	}
	public Double getRec_costcarrito(){
		return rec_costcarrito;
	}
	public void setRec_costcarrito(Double rec_costcarrito){
		this.rec_costcarrito = rec_costcarrito;
	}
	public Integer getRec_usuario(){
		return rec_usuario;
	}
	public void setRec_usuario(Integer rec_usuario){
		this.rec_usuario = rec_usuario;
	}

}