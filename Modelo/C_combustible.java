package modelo;

public class C_combustible{
	Integer cc_codigo;
	Double cc_numeroin;
	Double cc_numeroout;
	Integer cc_numeroelemento;
	Integer cc_usuario;
	Integer cc_borrado;
	Integer cc_estado;
	String cc_fecha;

	public C_combustible(Integer cc_codigo, Double cc_numeroin, Double cc_numeroout, Integer cc_numeroelemento, Integer cc_usuario, Integer cc_borrado, Integer cc_estado, String cc_fecha){
		this.cc_codigo = cc_codigo;
		this.cc_numeroin = cc_numeroin;
		this.cc_numeroout = cc_numeroout;
		this.cc_numeroelemento = cc_numeroelemento;
		this.cc_usuario = cc_usuario;
		this.cc_borrado = cc_borrado;
		this.cc_estado = cc_estado;
		this.cc_fecha = cc_fecha;
	}
	public C_combustible(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "C_combustible{"+", cc_codigo=" + cc_codigo+", cc_numeroin=" + cc_numeroin+", cc_numeroout=" + cc_numeroout+", cc_numeroelemento=" + cc_numeroelemento+", cc_usuario=" + cc_usuario+", cc_borrado=" + cc_borrado+", cc_estado=" + cc_estado+", cc_fecha=" + cc_fecha+"}";

	}
	public Integer getCc_codigo(){
		return cc_codigo;
	}
	public void setCc_codigo(Integer cc_codigo){
		this.cc_codigo = cc_codigo;
	}
	public Double getCc_numeroin(){
		return cc_numeroin;
	}
	public void setCc_numeroin(Double cc_numeroin){
		this.cc_numeroin = cc_numeroin;
	}
	public Double getCc_numeroout(){
		return cc_numeroout;
	}
	public void setCc_numeroout(Double cc_numeroout){
		this.cc_numeroout = cc_numeroout;
	}
	public Integer getCc_numeroelemento(){
		return cc_numeroelemento;
	}
	public void setCc_numeroelemento(Integer cc_numeroelemento){
		this.cc_numeroelemento = cc_numeroelemento;
	}
	public Integer getCc_usuario(){
		return cc_usuario;
	}
	public void setCc_usuario(Integer cc_usuario){
		this.cc_usuario = cc_usuario;
	}
	public Integer getCc_borrado(){
		return cc_borrado;
	}
	public void setCc_borrado(Integer cc_borrado){
		this.cc_borrado = cc_borrado;
	}
	public Integer getCc_estado(){
		return cc_estado;
	}
	public void setCc_estado(Integer cc_estado){
		this.cc_estado = cc_estado;
	}
	public String getCc_fecha(){
		return cc_fecha;
	}
	public void setCc_fecha(String cc_fecha){
		this.cc_fecha = cc_fecha;
	}

}