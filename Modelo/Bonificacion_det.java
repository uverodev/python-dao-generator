package modelo;

public class Bonificacion_det{
	Integer bd_codigo;
	Integer bd_codcab;
	String bd_codprod;
	Double bd_cantidad;
	Integer bd_borrado;
	Object bd_lote;

	public Bonificacion_det(Integer bd_codigo, Integer bd_codcab, String bd_codprod, Double bd_cantidad, Integer bd_borrado, Object bd_lote){
		this.bd_codigo = bd_codigo;
		this.bd_codcab = bd_codcab;
		this.bd_codprod = bd_codprod;
		this.bd_cantidad = bd_cantidad;
		this.bd_borrado = bd_borrado;
		this.bd_lote = bd_lote;
	}
	public Bonificacion_det(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Bonificacion_det{"+", bd_codigo=" + bd_codigo+", bd_codcab=" + bd_codcab+", bd_codprod=" + bd_codprod+", bd_cantidad=" + bd_cantidad+", bd_borrado=" + bd_borrado+", bd_lote=" + bd_lote+"}";

	}
	public Integer getBd_codigo(){
		return bd_codigo;
	}
	public void setBd_codigo(Integer bd_codigo){
		this.bd_codigo = bd_codigo;
	}
	public Integer getBd_codcab(){
		return bd_codcab;
	}
	public void setBd_codcab(Integer bd_codcab){
		this.bd_codcab = bd_codcab;
	}
	public String getBd_codprod(){
		return bd_codprod;
	}
	public void setBd_codprod(String bd_codprod){
		this.bd_codprod = bd_codprod;
	}
	public Double getBd_cantidad(){
		return bd_cantidad;
	}
	public void setBd_cantidad(Double bd_cantidad){
		this.bd_cantidad = bd_cantidad;
	}
	public Integer getBd_borrado(){
		return bd_borrado;
	}
	public void setBd_borrado(Integer bd_borrado){
		this.bd_borrado = bd_borrado;
	}
	public Object getBd_lote(){
		return bd_lote;
	}
	public void setBd_lote(Object bd_lote){
		this.bd_lote = bd_lote;
	}

}