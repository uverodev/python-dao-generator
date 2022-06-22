package modelo;

public class Cierre_accionista_detalle{
	Integer cad_id;
	Integer cad_accionista;
	Integer cad_cierre_accionista;
	Integer cad_borrado;
	Double cad_valor;

	public Cierre_accionista_detalle(Integer cad_id, Integer cad_accionista, Integer cad_cierre_accionista, Integer cad_borrado, Double cad_valor){
		this.cad_id = cad_id;
		this.cad_accionista = cad_accionista;
		this.cad_cierre_accionista = cad_cierre_accionista;
		this.cad_borrado = cad_borrado;
		this.cad_valor = cad_valor;
	}
	public Cierre_accionista_detalle(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cierre_accionista_detalle{"+", cad_id=" + cad_id+", cad_accionista=" + cad_accionista+", cad_cierre_accionista=" + cad_cierre_accionista+", cad_borrado=" + cad_borrado+", cad_valor=" + cad_valor+"}";

	}
	public Integer getCad_id(){
		return cad_id;
	}
	public void setCad_id(Integer cad_id){
		this.cad_id = cad_id;
	}
	public Integer getCad_accionista(){
		return cad_accionista;
	}
	public void setCad_accionista(Integer cad_accionista){
		this.cad_accionista = cad_accionista;
	}
	public Integer getCad_cierre_accionista(){
		return cad_cierre_accionista;
	}
	public void setCad_cierre_accionista(Integer cad_cierre_accionista){
		this.cad_cierre_accionista = cad_cierre_accionista;
	}
	public Integer getCad_borrado(){
		return cad_borrado;
	}
	public void setCad_borrado(Integer cad_borrado){
		this.cad_borrado = cad_borrado;
	}
	public Double getCad_valor(){
		return cad_valor;
	}
	public void setCad_valor(Double cad_valor){
		this.cad_valor = cad_valor;
	}

}