package modelo;

public class Accionistas{
	Integer acc_id;
	String acc_descripcion;
	String acc_documento;
	Double acc_participacion;
	Integer acc_borrado;

	public Accionistas(Integer acc_id, String acc_descripcion, String acc_documento, Double acc_participacion, Integer acc_borrado){
		this.acc_id = acc_id;
		this.acc_descripcion = acc_descripcion;
		this.acc_documento = acc_documento;
		this.acc_participacion = acc_participacion;
		this.acc_borrado = acc_borrado;
	}
	public Accionistas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Accionistas{"+", acc_id=" + acc_id+", acc_descripcion=" + acc_descripcion+", acc_documento=" + acc_documento+", acc_participacion=" + acc_participacion+", acc_borrado=" + acc_borrado+"}";

	}
	public Integer getAcc_id(){
		return acc_id;
	}
	public void setAcc_id(Integer acc_id){
		this.acc_id = acc_id;
	}
	public String getAcc_descripcion(){
		return acc_descripcion;
	}
	public void setAcc_descripcion(String acc_descripcion){
		this.acc_descripcion = acc_descripcion;
	}
	public String getAcc_documento(){
		return acc_documento;
	}
	public void setAcc_documento(String acc_documento){
		this.acc_documento = acc_documento;
	}
	public Double getAcc_participacion(){
		return acc_participacion;
	}
	public void setAcc_participacion(Double acc_participacion){
		this.acc_participacion = acc_participacion;
	}
	public Integer getAcc_borrado(){
		return acc_borrado;
	}
	public void setAcc_borrado(Integer acc_borrado){
		this.acc_borrado = acc_borrado;
	}

}