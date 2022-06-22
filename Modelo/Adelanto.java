package modelo;

public class Adelanto{
	Integer ad_nro;
	Integer ad_nrorecibo;
	Integer ad_empleado;
	Integer ad_borrado;
	String ad_fecha;
	Double ad_monto;
	String ad_observacion;
	Integer ad_usuario;
	String ad_hora;
	Integer ad_nroliquidacion;
	Integer ad_liquidado;
	Integer ad_tipo;
	Integer ad_liqgenerado;
	Object ad_pc;
	Integer ad_cierrecajanro;
	Integer ad_cierrecajagennro;

	public Adelanto(Integer ad_nro, Integer ad_nrorecibo, Integer ad_empleado, Integer ad_borrado, String ad_fecha, Double ad_monto, String ad_observacion, Integer ad_usuario, String ad_hora, Integer ad_nroliquidacion, Integer ad_liquidado, Integer ad_tipo, Integer ad_liqgenerado, Object ad_pc, Integer ad_cierrecajanro, Integer ad_cierrecajagennro){
		this.ad_nro = ad_nro;
		this.ad_nrorecibo = ad_nrorecibo;
		this.ad_empleado = ad_empleado;
		this.ad_borrado = ad_borrado;
		this.ad_fecha = ad_fecha;
		this.ad_monto = ad_monto;
		this.ad_observacion = ad_observacion;
		this.ad_usuario = ad_usuario;
		this.ad_hora = ad_hora;
		this.ad_nroliquidacion = ad_nroliquidacion;
		this.ad_liquidado = ad_liquidado;
		this.ad_tipo = ad_tipo;
		this.ad_liqgenerado = ad_liqgenerado;
		this.ad_pc = ad_pc;
		this.ad_cierrecajanro = ad_cierrecajanro;
		this.ad_cierrecajagennro = ad_cierrecajagennro;
	}
	public Adelanto(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Adelanto{"+", ad_nro=" + ad_nro+", ad_nrorecibo=" + ad_nrorecibo+", ad_empleado=" + ad_empleado+", ad_borrado=" + ad_borrado+", ad_fecha=" + ad_fecha+", ad_monto=" + ad_monto+", ad_observacion=" + ad_observacion+", ad_usuario=" + ad_usuario+", ad_hora=" + ad_hora+", ad_nroliquidacion=" + ad_nroliquidacion+", ad_liquidado=" + ad_liquidado+", ad_tipo=" + ad_tipo+", ad_liqgenerado=" + ad_liqgenerado+", ad_pc=" + ad_pc+", ad_cierrecajanro=" + ad_cierrecajanro+", ad_cierrecajagennro=" + ad_cierrecajagennro+"}";

	}
	public Integer getAd_nro(){
		return ad_nro;
	}
	public void setAd_nro(Integer ad_nro){
		this.ad_nro = ad_nro;
	}
	public Integer getAd_nrorecibo(){
		return ad_nrorecibo;
	}
	public void setAd_nrorecibo(Integer ad_nrorecibo){
		this.ad_nrorecibo = ad_nrorecibo;
	}
	public Integer getAd_empleado(){
		return ad_empleado;
	}
	public void setAd_empleado(Integer ad_empleado){
		this.ad_empleado = ad_empleado;
	}
	public Integer getAd_borrado(){
		return ad_borrado;
	}
	public void setAd_borrado(Integer ad_borrado){
		this.ad_borrado = ad_borrado;
	}
	public String getAd_fecha(){
		return ad_fecha;
	}
	public void setAd_fecha(String ad_fecha){
		this.ad_fecha = ad_fecha;
	}
	public Double getAd_monto(){
		return ad_monto;
	}
	public void setAd_monto(Double ad_monto){
		this.ad_monto = ad_monto;
	}
	public String getAd_observacion(){
		return ad_observacion;
	}
	public void setAd_observacion(String ad_observacion){
		this.ad_observacion = ad_observacion;
	}
	public Integer getAd_usuario(){
		return ad_usuario;
	}
	public void setAd_usuario(Integer ad_usuario){
		this.ad_usuario = ad_usuario;
	}
	public String getAd_hora(){
		return ad_hora;
	}
	public void setAd_hora(String ad_hora){
		this.ad_hora = ad_hora;
	}
	public Integer getAd_nroliquidacion(){
		return ad_nroliquidacion;
	}
	public void setAd_nroliquidacion(Integer ad_nroliquidacion){
		this.ad_nroliquidacion = ad_nroliquidacion;
	}
	public Integer getAd_liquidado(){
		return ad_liquidado;
	}
	public void setAd_liquidado(Integer ad_liquidado){
		this.ad_liquidado = ad_liquidado;
	}
	public Integer getAd_tipo(){
		return ad_tipo;
	}
	public void setAd_tipo(Integer ad_tipo){
		this.ad_tipo = ad_tipo;
	}
	public Integer getAd_liqgenerado(){
		return ad_liqgenerado;
	}
	public void setAd_liqgenerado(Integer ad_liqgenerado){
		this.ad_liqgenerado = ad_liqgenerado;
	}
	public Object getAd_pc(){
		return ad_pc;
	}
	public void setAd_pc(Object ad_pc){
		this.ad_pc = ad_pc;
	}
	public Integer getAd_cierrecajanro(){
		return ad_cierrecajanro;
	}
	public void setAd_cierrecajanro(Integer ad_cierrecajanro){
		this.ad_cierrecajanro = ad_cierrecajanro;
	}
	public Integer getAd_cierrecajagennro(){
		return ad_cierrecajagennro;
	}
	public void setAd_cierrecajagennro(Integer ad_cierrecajagennro){
		this.ad_cierrecajagennro = ad_cierrecajagennro;
	}

}