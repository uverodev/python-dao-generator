package modelo;

public class Cabeceradesglose{
	Integer dg_codigo;
	Object dg_codprod;
	Double dg_cantidadusada;
	Integer dg_usuario;
	Integer dg_borrado;
	String dg_fecha;
	Object dg_pc;

	public Cabeceradesglose(Integer dg_codigo, Object dg_codprod, Double dg_cantidadusada, Integer dg_usuario, Integer dg_borrado, String dg_fecha, Object dg_pc){
		this.dg_codigo = dg_codigo;
		this.dg_codprod = dg_codprod;
		this.dg_cantidadusada = dg_cantidadusada;
		this.dg_usuario = dg_usuario;
		this.dg_borrado = dg_borrado;
		this.dg_fecha = dg_fecha;
		this.dg_pc = dg_pc;
	}
	public Cabeceradesglose(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cabeceradesglose{"+", dg_codigo=" + dg_codigo+", dg_codprod=" + dg_codprod+", dg_cantidadusada=" + dg_cantidadusada+", dg_usuario=" + dg_usuario+", dg_borrado=" + dg_borrado+", dg_fecha=" + dg_fecha+", dg_pc=" + dg_pc+"}";

	}
	public Integer getDg_codigo(){
		return dg_codigo;
	}
	public void setDg_codigo(Integer dg_codigo){
		this.dg_codigo = dg_codigo;
	}
	public Object getDg_codprod(){
		return dg_codprod;
	}
	public void setDg_codprod(Object dg_codprod){
		this.dg_codprod = dg_codprod;
	}
	public Double getDg_cantidadusada(){
		return dg_cantidadusada;
	}
	public void setDg_cantidadusada(Double dg_cantidadusada){
		this.dg_cantidadusada = dg_cantidadusada;
	}
	public Integer getDg_usuario(){
		return dg_usuario;
	}
	public void setDg_usuario(Integer dg_usuario){
		this.dg_usuario = dg_usuario;
	}
	public Integer getDg_borrado(){
		return dg_borrado;
	}
	public void setDg_borrado(Integer dg_borrado){
		this.dg_borrado = dg_borrado;
	}
	public String getDg_fecha(){
		return dg_fecha;
	}
	public void setDg_fecha(String dg_fecha){
		this.dg_fecha = dg_fecha;
	}
	public Object getDg_pc(){
		return dg_pc;
	}
	public void setDg_pc(Object dg_pc){
		this.dg_pc = dg_pc;
	}

}