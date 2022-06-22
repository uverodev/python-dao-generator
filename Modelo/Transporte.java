package modelo;

public class Transporte{
	Integer trans_codigo;
	String trans_descripcion;
	Integer trans_borrado;

	public Transporte(Integer trans_codigo, String trans_descripcion, Integer trans_borrado){
		this.trans_codigo = trans_codigo;
		this.trans_descripcion = trans_descripcion;
		this.trans_borrado = trans_borrado;
	}
	public Transporte(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Transporte{"+", trans_codigo=" + trans_codigo+", trans_descripcion=" + trans_descripcion+", trans_borrado=" + trans_borrado+"}";

	}
	public Integer getTrans_codigo(){
		return trans_codigo;
	}
	public void setTrans_codigo(Integer trans_codigo){
		this.trans_codigo = trans_codigo;
	}
	public String getTrans_descripcion(){
		return trans_descripcion;
	}
	public void setTrans_descripcion(String trans_descripcion){
		this.trans_descripcion = trans_descripcion;
	}
	public Integer getTrans_borrado(){
		return trans_borrado;
	}
	public void setTrans_borrado(Integer trans_borrado){
		this.trans_borrado = trans_borrado;
	}

}