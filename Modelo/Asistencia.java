package modelo;

public class Asistencia{
	Integer as_codigo;
	Integer as_usuario;
	Object as_pc;
	Object as_observacionrecepcion;
	String as_fechaingreso;
	String as_fechasalida;
	Integer as_entregado;
	Double as_valoradicional;
	Integer as_borrado;
	Object as_cliente;
	Integer as_estado;
	Object as_pcentregado;
	Integer as_usuarioentregado;
	Object as_observacionasistencia;
	Object as_observacionentrega;

	public Asistencia(Integer as_codigo, Integer as_usuario, Object as_pc, Object as_observacionrecepcion, String as_fechaingreso, String as_fechasalida, Integer as_entregado, Double as_valoradicional, Integer as_borrado, Object as_cliente, Integer as_estado, Object as_pcentregado, Integer as_usuarioentregado, Object as_observacionasistencia, Object as_observacionentrega){
		this.as_codigo = as_codigo;
		this.as_usuario = as_usuario;
		this.as_pc = as_pc;
		this.as_observacionrecepcion = as_observacionrecepcion;
		this.as_fechaingreso = as_fechaingreso;
		this.as_fechasalida = as_fechasalida;
		this.as_entregado = as_entregado;
		this.as_valoradicional = as_valoradicional;
		this.as_borrado = as_borrado;
		this.as_cliente = as_cliente;
		this.as_estado = as_estado;
		this.as_pcentregado = as_pcentregado;
		this.as_usuarioentregado = as_usuarioentregado;
		this.as_observacionasistencia = as_observacionasistencia;
		this.as_observacionentrega = as_observacionentrega;
	}
	public Asistencia(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Asistencia{"+", as_codigo=" + as_codigo+", as_usuario=" + as_usuario+", as_pc=" + as_pc+", as_observacionrecepcion=" + as_observacionrecepcion+", as_fechaingreso=" + as_fechaingreso+", as_fechasalida=" + as_fechasalida+", as_entregado=" + as_entregado+", as_valoradicional=" + as_valoradicional+", as_borrado=" + as_borrado+", as_cliente=" + as_cliente+", as_estado=" + as_estado+", as_pcentregado=" + as_pcentregado+", as_usuarioentregado=" + as_usuarioentregado+", as_observacionasistencia=" + as_observacionasistencia+", as_observacionentrega=" + as_observacionentrega+"}";

	}
	public Integer getAs_codigo(){
		return as_codigo;
	}
	public void setAs_codigo(Integer as_codigo){
		this.as_codigo = as_codigo;
	}
	public Integer getAs_usuario(){
		return as_usuario;
	}
	public void setAs_usuario(Integer as_usuario){
		this.as_usuario = as_usuario;
	}
	public Object getAs_pc(){
		return as_pc;
	}
	public void setAs_pc(Object as_pc){
		this.as_pc = as_pc;
	}
	public Object getAs_observacionrecepcion(){
		return as_observacionrecepcion;
	}
	public void setAs_observacionrecepcion(Object as_observacionrecepcion){
		this.as_observacionrecepcion = as_observacionrecepcion;
	}
	public String getAs_fechaingreso(){
		return as_fechaingreso;
	}
	public void setAs_fechaingreso(String as_fechaingreso){
		this.as_fechaingreso = as_fechaingreso;
	}
	public String getAs_fechasalida(){
		return as_fechasalida;
	}
	public void setAs_fechasalida(String as_fechasalida){
		this.as_fechasalida = as_fechasalida;
	}
	public Integer getAs_entregado(){
		return as_entregado;
	}
	public void setAs_entregado(Integer as_entregado){
		this.as_entregado = as_entregado;
	}
	public Double getAs_valoradicional(){
		return as_valoradicional;
	}
	public void setAs_valoradicional(Double as_valoradicional){
		this.as_valoradicional = as_valoradicional;
	}
	public Integer getAs_borrado(){
		return as_borrado;
	}
	public void setAs_borrado(Integer as_borrado){
		this.as_borrado = as_borrado;
	}
	public Object getAs_cliente(){
		return as_cliente;
	}
	public void setAs_cliente(Object as_cliente){
		this.as_cliente = as_cliente;
	}
	public Integer getAs_estado(){
		return as_estado;
	}
	public void setAs_estado(Integer as_estado){
		this.as_estado = as_estado;
	}
	public Object getAs_pcentregado(){
		return as_pcentregado;
	}
	public void setAs_pcentregado(Object as_pcentregado){
		this.as_pcentregado = as_pcentregado;
	}
	public Integer getAs_usuarioentregado(){
		return as_usuarioentregado;
	}
	public void setAs_usuarioentregado(Integer as_usuarioentregado){
		this.as_usuarioentregado = as_usuarioentregado;
	}
	public Object getAs_observacionasistencia(){
		return as_observacionasistencia;
	}
	public void setAs_observacionasistencia(Object as_observacionasistencia){
		this.as_observacionasistencia = as_observacionasistencia;
	}
	public Object getAs_observacionentrega(){
		return as_observacionentrega;
	}
	public void setAs_observacionentrega(Object as_observacionentrega){
		this.as_observacionentrega = as_observacionentrega;
	}

}