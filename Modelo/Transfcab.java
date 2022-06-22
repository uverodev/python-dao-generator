package modelo;

public class Transfcab{
	Integer tr_nro;
	String tr_fecha;
	String tr_fechacarga;
	String tr_hora;
	Double tr_total;
	Double tr_descuento;
	Double tr_totalexe;
	Double tr_totaliva5;
	Double tr_totaliva10;
	Double tr_totalitem;
	Double tr_totaliva;
	Integer tr_usuario;
	Integer tr_confirmado;
	Integer tr_borrado;
	Integer tr_deporigen;
	Integer tr_depdestino;
	String tr_vehiculo;
	Integer tr_responsable;
	String fechasct;
	Integer tr_tiptransferencia;
	Integer tr_tipo;
	Integer tr_transferencia_local;
	Integer tr_recepcion_local;
	Integer tr_cabecera_origen;
	Integer tr_id_deposito_destino;

	public Transfcab(Integer tr_nro, String tr_fecha, String tr_fechacarga, String tr_hora, Double tr_total, Double tr_descuento, Double tr_totalexe, Double tr_totaliva5, Double tr_totaliva10, Double tr_totalitem, Double tr_totaliva, Integer tr_usuario, Integer tr_confirmado, Integer tr_borrado, Integer tr_deporigen, Integer tr_depdestino, String tr_vehiculo, Integer tr_responsable, String fechasct, Integer tr_tiptransferencia, Integer tr_tipo, Integer tr_transferencia_local, Integer tr_recepcion_local, Integer tr_cabecera_origen, Integer tr_id_deposito_destino){
		this.tr_nro = tr_nro;
		this.tr_fecha = tr_fecha;
		this.tr_fechacarga = tr_fechacarga;
		this.tr_hora = tr_hora;
		this.tr_total = tr_total;
		this.tr_descuento = tr_descuento;
		this.tr_totalexe = tr_totalexe;
		this.tr_totaliva5 = tr_totaliva5;
		this.tr_totaliva10 = tr_totaliva10;
		this.tr_totalitem = tr_totalitem;
		this.tr_totaliva = tr_totaliva;
		this.tr_usuario = tr_usuario;
		this.tr_confirmado = tr_confirmado;
		this.tr_borrado = tr_borrado;
		this.tr_deporigen = tr_deporigen;
		this.tr_depdestino = tr_depdestino;
		this.tr_vehiculo = tr_vehiculo;
		this.tr_responsable = tr_responsable;
		this.fechasct = fechasct;
		this.tr_tiptransferencia = tr_tiptransferencia;
		this.tr_tipo = tr_tipo;
		this.tr_transferencia_local = tr_transferencia_local;
		this.tr_recepcion_local = tr_recepcion_local;
		this.tr_cabecera_origen = tr_cabecera_origen;
		this.tr_id_deposito_destino = tr_id_deposito_destino;
	}
	public Transfcab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Transfcab{"+", tr_nro=" + tr_nro+", tr_fecha=" + tr_fecha+", tr_fechacarga=" + tr_fechacarga+", tr_hora=" + tr_hora+", tr_total=" + tr_total+", tr_descuento=" + tr_descuento+", tr_totalexe=" + tr_totalexe+", tr_totaliva5=" + tr_totaliva5+", tr_totaliva10=" + tr_totaliva10+", tr_totalitem=" + tr_totalitem+", tr_totaliva=" + tr_totaliva+", tr_usuario=" + tr_usuario+", tr_confirmado=" + tr_confirmado+", tr_borrado=" + tr_borrado+", tr_deporigen=" + tr_deporigen+", tr_depdestino=" + tr_depdestino+", tr_vehiculo=" + tr_vehiculo+", tr_responsable=" + tr_responsable+", fechasct=" + fechasct+", tr_tiptransferencia=" + tr_tiptransferencia+", tr_tipo=" + tr_tipo+", tr_transferencia_local=" + tr_transferencia_local+", tr_recepcion_local=" + tr_recepcion_local+", tr_cabecera_origen=" + tr_cabecera_origen+", tr_id_deposito_destino=" + tr_id_deposito_destino+"}";

	}
	public Integer getTr_nro(){
		return tr_nro;
	}
	public void setTr_nro(Integer tr_nro){
		this.tr_nro = tr_nro;
	}
	public String getTr_fecha(){
		return tr_fecha;
	}
	public void setTr_fecha(String tr_fecha){
		this.tr_fecha = tr_fecha;
	}
	public String getTr_fechacarga(){
		return tr_fechacarga;
	}
	public void setTr_fechacarga(String tr_fechacarga){
		this.tr_fechacarga = tr_fechacarga;
	}
	public String getTr_hora(){
		return tr_hora;
	}
	public void setTr_hora(String tr_hora){
		this.tr_hora = tr_hora;
	}
	public Double getTr_total(){
		return tr_total;
	}
	public void setTr_total(Double tr_total){
		this.tr_total = tr_total;
	}
	public Double getTr_descuento(){
		return tr_descuento;
	}
	public void setTr_descuento(Double tr_descuento){
		this.tr_descuento = tr_descuento;
	}
	public Double getTr_totalexe(){
		return tr_totalexe;
	}
	public void setTr_totalexe(Double tr_totalexe){
		this.tr_totalexe = tr_totalexe;
	}
	public Double getTr_totaliva5(){
		return tr_totaliva5;
	}
	public void setTr_totaliva5(Double tr_totaliva5){
		this.tr_totaliva5 = tr_totaliva5;
	}
	public Double getTr_totaliva10(){
		return tr_totaliva10;
	}
	public void setTr_totaliva10(Double tr_totaliva10){
		this.tr_totaliva10 = tr_totaliva10;
	}
	public Double getTr_totalitem(){
		return tr_totalitem;
	}
	public void setTr_totalitem(Double tr_totalitem){
		this.tr_totalitem = tr_totalitem;
	}
	public Double getTr_totaliva(){
		return tr_totaliva;
	}
	public void setTr_totaliva(Double tr_totaliva){
		this.tr_totaliva = tr_totaliva;
	}
	public Integer getTr_usuario(){
		return tr_usuario;
	}
	public void setTr_usuario(Integer tr_usuario){
		this.tr_usuario = tr_usuario;
	}
	public Integer getTr_confirmado(){
		return tr_confirmado;
	}
	public void setTr_confirmado(Integer tr_confirmado){
		this.tr_confirmado = tr_confirmado;
	}
	public Integer getTr_borrado(){
		return tr_borrado;
	}
	public void setTr_borrado(Integer tr_borrado){
		this.tr_borrado = tr_borrado;
	}
	public Integer getTr_deporigen(){
		return tr_deporigen;
	}
	public void setTr_deporigen(Integer tr_deporigen){
		this.tr_deporigen = tr_deporigen;
	}
	public Integer getTr_depdestino(){
		return tr_depdestino;
	}
	public void setTr_depdestino(Integer tr_depdestino){
		this.tr_depdestino = tr_depdestino;
	}
	public String getTr_vehiculo(){
		return tr_vehiculo;
	}
	public void setTr_vehiculo(String tr_vehiculo){
		this.tr_vehiculo = tr_vehiculo;
	}
	public Integer getTr_responsable(){
		return tr_responsable;
	}
	public void setTr_responsable(Integer tr_responsable){
		this.tr_responsable = tr_responsable;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getTr_tiptransferencia(){
		return tr_tiptransferencia;
	}
	public void setTr_tiptransferencia(Integer tr_tiptransferencia){
		this.tr_tiptransferencia = tr_tiptransferencia;
	}
	public Integer getTr_tipo(){
		return tr_tipo;
	}
	public void setTr_tipo(Integer tr_tipo){
		this.tr_tipo = tr_tipo;
	}
	public Integer getTr_transferencia_local(){
		return tr_transferencia_local;
	}
	public void setTr_transferencia_local(Integer tr_transferencia_local){
		this.tr_transferencia_local = tr_transferencia_local;
	}
	public Integer getTr_recepcion_local(){
		return tr_recepcion_local;
	}
	public void setTr_recepcion_local(Integer tr_recepcion_local){
		this.tr_recepcion_local = tr_recepcion_local;
	}
	public Integer getTr_cabecera_origen(){
		return tr_cabecera_origen;
	}
	public void setTr_cabecera_origen(Integer tr_cabecera_origen){
		this.tr_cabecera_origen = tr_cabecera_origen;
	}
	public Integer getTr_id_deposito_destino(){
		return tr_id_deposito_destino;
	}
	public void setTr_id_deposito_destino(Integer tr_id_deposito_destino){
		this.tr_id_deposito_destino = tr_id_deposito_destino;
	}

}