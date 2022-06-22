package modelo;

public class Consumiciondet{
	Integer cons_codigo;
	String cons_codprod;
	Double cons_precio;
	String cons_lote;
	Double cons_cantidad;
	Double cons_total;
	Integer cons_borrado;

	public Consumiciondet(Integer cons_codigo, String cons_codprod, Double cons_precio, String cons_lote, Double cons_cantidad, Double cons_total, Integer cons_borrado){
		this.cons_codigo = cons_codigo;
		this.cons_codprod = cons_codprod;
		this.cons_precio = cons_precio;
		this.cons_lote = cons_lote;
		this.cons_cantidad = cons_cantidad;
		this.cons_total = cons_total;
		this.cons_borrado = cons_borrado;
	}
	public Consumiciondet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Consumiciondet{"+", cons_codigo=" + cons_codigo+", cons_codprod=" + cons_codprod+", cons_precio=" + cons_precio+", cons_lote=" + cons_lote+", cons_cantidad=" + cons_cantidad+", cons_total=" + cons_total+", cons_borrado=" + cons_borrado+"}";

	}
	public Integer getCons_codigo(){
		return cons_codigo;
	}
	public void setCons_codigo(Integer cons_codigo){
		this.cons_codigo = cons_codigo;
	}
	public String getCons_codprod(){
		return cons_codprod;
	}
	public void setCons_codprod(String cons_codprod){
		this.cons_codprod = cons_codprod;
	}
	public Double getCons_precio(){
		return cons_precio;
	}
	public void setCons_precio(Double cons_precio){
		this.cons_precio = cons_precio;
	}
	public String getCons_lote(){
		return cons_lote;
	}
	public void setCons_lote(String cons_lote){
		this.cons_lote = cons_lote;
	}
	public Double getCons_cantidad(){
		return cons_cantidad;
	}
	public void setCons_cantidad(Double cons_cantidad){
		this.cons_cantidad = cons_cantidad;
	}
	public Double getCons_total(){
		return cons_total;
	}
	public void setCons_total(Double cons_total){
		this.cons_total = cons_total;
	}
	public Integer getCons_borrado(){
		return cons_borrado;
	}
	public void setCons_borrado(Integer cons_borrado){
		this.cons_borrado = cons_borrado;
	}

}