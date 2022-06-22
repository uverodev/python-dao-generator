package modelo;

public class Informconf{
	Integer inf_codigo;
	String inf_cliente;
	String inf_fechaingreso;
	String inf_fechasalida;
	Integer inf_usuarioingreso;
	Integer inf_usuariosalida;
	String inf_observacion;
	Integer inf_estado;

	public Informconf(Integer inf_codigo, String inf_cliente, String inf_fechaingreso, String inf_fechasalida, Integer inf_usuarioingreso, Integer inf_usuariosalida, String inf_observacion, Integer inf_estado){
		this.inf_codigo = inf_codigo;
		this.inf_cliente = inf_cliente;
		this.inf_fechaingreso = inf_fechaingreso;
		this.inf_fechasalida = inf_fechasalida;
		this.inf_usuarioingreso = inf_usuarioingreso;
		this.inf_usuariosalida = inf_usuariosalida;
		this.inf_observacion = inf_observacion;
		this.inf_estado = inf_estado;
	}
	public Informconf(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Informconf{"+", inf_codigo=" + inf_codigo+", inf_cliente=" + inf_cliente+", inf_fechaingreso=" + inf_fechaingreso+", inf_fechasalida=" + inf_fechasalida+", inf_usuarioingreso=" + inf_usuarioingreso+", inf_usuariosalida=" + inf_usuariosalida+", inf_observacion=" + inf_observacion+", inf_estado=" + inf_estado+"}";

	}
	public Integer getInf_codigo(){
		return inf_codigo;
	}
	public void setInf_codigo(Integer inf_codigo){
		this.inf_codigo = inf_codigo;
	}
	public String getInf_cliente(){
		return inf_cliente;
	}
	public void setInf_cliente(String inf_cliente){
		this.inf_cliente = inf_cliente;
	}
	public String getInf_fechaingreso(){
		return inf_fechaingreso;
	}
	public void setInf_fechaingreso(String inf_fechaingreso){
		this.inf_fechaingreso = inf_fechaingreso;
	}
	public String getInf_fechasalida(){
		return inf_fechasalida;
	}
	public void setInf_fechasalida(String inf_fechasalida){
		this.inf_fechasalida = inf_fechasalida;
	}
	public Integer getInf_usuarioingreso(){
		return inf_usuarioingreso;
	}
	public void setInf_usuarioingreso(Integer inf_usuarioingreso){
		this.inf_usuarioingreso = inf_usuarioingreso;
	}
	public Integer getInf_usuariosalida(){
		return inf_usuariosalida;
	}
	public void setInf_usuariosalida(Integer inf_usuariosalida){
		this.inf_usuariosalida = inf_usuariosalida;
	}
	public String getInf_observacion(){
		return inf_observacion;
	}
	public void setInf_observacion(String inf_observacion){
		this.inf_observacion = inf_observacion;
	}
	public Integer getInf_estado(){
		return inf_estado;
	}
	public void setInf_estado(Integer inf_estado){
		this.inf_estado = inf_estado;
	}

}