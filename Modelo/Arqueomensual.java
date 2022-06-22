package modelo;

public class Arqueomensual{
	Integer am_codigo;
	Integer am_usuario;
	String am_fecha;
	String am_hora;
	Double am_totalcomprainterna;
	Double am_totalcompraconsumicion;
	Double am_totalsueldoadelanto;
	Double am_totaldeposito;
	Double am_totalgasto;
	Double am_total;
	String am_mes;
	Integer am_borrado;
	String am_pc;
	String am_data;

	public Arqueomensual(Integer am_codigo, Integer am_usuario, String am_fecha, String am_hora, Double am_totalcomprainterna, Double am_totalcompraconsumicion, Double am_totalsueldoadelanto, Double am_totaldeposito, Double am_totalgasto, Double am_total, String am_mes, Integer am_borrado, String am_pc, String am_data){
		this.am_codigo = am_codigo;
		this.am_usuario = am_usuario;
		this.am_fecha = am_fecha;
		this.am_hora = am_hora;
		this.am_totalcomprainterna = am_totalcomprainterna;
		this.am_totalcompraconsumicion = am_totalcompraconsumicion;
		this.am_totalsueldoadelanto = am_totalsueldoadelanto;
		this.am_totaldeposito = am_totaldeposito;
		this.am_totalgasto = am_totalgasto;
		this.am_total = am_total;
		this.am_mes = am_mes;
		this.am_borrado = am_borrado;
		this.am_pc = am_pc;
		this.am_data = am_data;
	}
	public Arqueomensual(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Arqueomensual{"+", am_codigo=" + am_codigo+", am_usuario=" + am_usuario+", am_fecha=" + am_fecha+", am_hora=" + am_hora+", am_totalcomprainterna=" + am_totalcomprainterna+", am_totalcompraconsumicion=" + am_totalcompraconsumicion+", am_totalsueldoadelanto=" + am_totalsueldoadelanto+", am_totaldeposito=" + am_totaldeposito+", am_totalgasto=" + am_totalgasto+", am_total=" + am_total+", am_mes=" + am_mes+", am_borrado=" + am_borrado+", am_pc=" + am_pc+", am_data=" + am_data+"}";

	}
	public Integer getAm_codigo(){
		return am_codigo;
	}
	public void setAm_codigo(Integer am_codigo){
		this.am_codigo = am_codigo;
	}
	public Integer getAm_usuario(){
		return am_usuario;
	}
	public void setAm_usuario(Integer am_usuario){
		this.am_usuario = am_usuario;
	}
	public String getAm_fecha(){
		return am_fecha;
	}
	public void setAm_fecha(String am_fecha){
		this.am_fecha = am_fecha;
	}
	public String getAm_hora(){
		return am_hora;
	}
	public void setAm_hora(String am_hora){
		this.am_hora = am_hora;
	}
	public Double getAm_totalcomprainterna(){
		return am_totalcomprainterna;
	}
	public void setAm_totalcomprainterna(Double am_totalcomprainterna){
		this.am_totalcomprainterna = am_totalcomprainterna;
	}
	public Double getAm_totalcompraconsumicion(){
		return am_totalcompraconsumicion;
	}
	public void setAm_totalcompraconsumicion(Double am_totalcompraconsumicion){
		this.am_totalcompraconsumicion = am_totalcompraconsumicion;
	}
	public Double getAm_totalsueldoadelanto(){
		return am_totalsueldoadelanto;
	}
	public void setAm_totalsueldoadelanto(Double am_totalsueldoadelanto){
		this.am_totalsueldoadelanto = am_totalsueldoadelanto;
	}
	public Double getAm_totaldeposito(){
		return am_totaldeposito;
	}
	public void setAm_totaldeposito(Double am_totaldeposito){
		this.am_totaldeposito = am_totaldeposito;
	}
	public Double getAm_totalgasto(){
		return am_totalgasto;
	}
	public void setAm_totalgasto(Double am_totalgasto){
		this.am_totalgasto = am_totalgasto;
	}
	public Double getAm_total(){
		return am_total;
	}
	public void setAm_total(Double am_total){
		this.am_total = am_total;
	}
	public String getAm_mes(){
		return am_mes;
	}
	public void setAm_mes(String am_mes){
		this.am_mes = am_mes;
	}
	public Integer getAm_borrado(){
		return am_borrado;
	}
	public void setAm_borrado(Integer am_borrado){
		this.am_borrado = am_borrado;
	}
	public String getAm_pc(){
		return am_pc;
	}
	public void setAm_pc(String am_pc){
		this.am_pc = am_pc;
	}
	public String getAm_data(){
		return am_data;
	}
	public void setAm_data(String am_data){
		this.am_data = am_data;
	}

}