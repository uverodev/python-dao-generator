package modelo;

public class Pedidoscompradet{
	Integer cp_codigo;
	Integer cp_orden;
	String cp_codprod;
	Double cp_cantidad;
	Double cp_costo;
	Double cp_stockant;

	public Pedidoscompradet(Integer cp_codigo, Integer cp_orden, String cp_codprod, Double cp_cantidad, Double cp_costo, Double cp_stockant){
		this.cp_codigo = cp_codigo;
		this.cp_orden = cp_orden;
		this.cp_codprod = cp_codprod;
		this.cp_cantidad = cp_cantidad;
		this.cp_costo = cp_costo;
		this.cp_stockant = cp_stockant;
	}
	public Pedidoscompradet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pedidoscompradet{"+", cp_codigo=" + cp_codigo+", cp_orden=" + cp_orden+", cp_codprod=" + cp_codprod+", cp_cantidad=" + cp_cantidad+", cp_costo=" + cp_costo+", cp_stockant=" + cp_stockant+"}";

	}
	public Integer getCp_codigo(){
		return cp_codigo;
	}
	public void setCp_codigo(Integer cp_codigo){
		this.cp_codigo = cp_codigo;
	}
	public Integer getCp_orden(){
		return cp_orden;
	}
	public void setCp_orden(Integer cp_orden){
		this.cp_orden = cp_orden;
	}
	public String getCp_codprod(){
		return cp_codprod;
	}
	public void setCp_codprod(String cp_codprod){
		this.cp_codprod = cp_codprod;
	}
	public Double getCp_cantidad(){
		return cp_cantidad;
	}
	public void setCp_cantidad(Double cp_cantidad){
		this.cp_cantidad = cp_cantidad;
	}
	public Double getCp_costo(){
		return cp_costo;
	}
	public void setCp_costo(Double cp_costo){
		this.cp_costo = cp_costo;
	}
	public Double getCp_stockant(){
		return cp_stockant;
	}
	public void setCp_stockant(Double cp_stockant){
		this.cp_stockant = cp_stockant;
	}

}