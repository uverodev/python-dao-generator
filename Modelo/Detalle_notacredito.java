package modelo;

public class Detalle_notacredito{
	Integer dn_codigo;
	Object dn_codprod;
	Integer dn_numero;
	Object dn_lote;
	Integer dn_borrado;
	Double dn_cantidad;
	Double dn_precio;

	public Detalle_notacredito(Integer dn_codigo, Object dn_codprod, Integer dn_numero, Object dn_lote, Integer dn_borrado, Double dn_cantidad, Double dn_precio){
		this.dn_codigo = dn_codigo;
		this.dn_codprod = dn_codprod;
		this.dn_numero = dn_numero;
		this.dn_lote = dn_lote;
		this.dn_borrado = dn_borrado;
		this.dn_cantidad = dn_cantidad;
		this.dn_precio = dn_precio;
	}
	public Detalle_notacredito(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalle_notacredito{"+", dn_codigo=" + dn_codigo+", dn_codprod=" + dn_codprod+", dn_numero=" + dn_numero+", dn_lote=" + dn_lote+", dn_borrado=" + dn_borrado+", dn_cantidad=" + dn_cantidad+", dn_precio=" + dn_precio+"}";

	}
	public Integer getDn_codigo(){
		return dn_codigo;
	}
	public void setDn_codigo(Integer dn_codigo){
		this.dn_codigo = dn_codigo;
	}
	public Object getDn_codprod(){
		return dn_codprod;
	}
	public void setDn_codprod(Object dn_codprod){
		this.dn_codprod = dn_codprod;
	}
	public Integer getDn_numero(){
		return dn_numero;
	}
	public void setDn_numero(Integer dn_numero){
		this.dn_numero = dn_numero;
	}
	public Object getDn_lote(){
		return dn_lote;
	}
	public void setDn_lote(Object dn_lote){
		this.dn_lote = dn_lote;
	}
	public Integer getDn_borrado(){
		return dn_borrado;
	}
	public void setDn_borrado(Integer dn_borrado){
		this.dn_borrado = dn_borrado;
	}
	public Double getDn_cantidad(){
		return dn_cantidad;
	}
	public void setDn_cantidad(Double dn_cantidad){
		this.dn_cantidad = dn_cantidad;
	}
	public Double getDn_precio(){
		return dn_precio;
	}
	public void setDn_precio(Double dn_precio){
		this.dn_precio = dn_precio;
	}

}