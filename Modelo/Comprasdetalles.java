package modelo;

public class Comprasdetalles{
	Integer id;
	String concepto;
	Integer cantidad;
	Integer costo;
	Integer idCompras;

	public Comprasdetalles(Integer id, String concepto, Integer cantidad, Integer costo, Integer idCompras){
		this.id = id;
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.costo = costo;
		this.idCompras = idCompras;
	}
	public Comprasdetalles(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Comprasdetalles{"+"id=" + id+"concepto=" + concepto+"cantidad=" + cantidad+"costo=" + costo+"idCompras=" + idCompras+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getConcepto(){
		return concepto;
	}
	public void setConcepto(String concepto){
		this.concepto = concepto;
	}
	public Integer getCantidad(){
		return cantidad;
	}
	public void setCantidad(Integer cantidad){
		this.cantidad = cantidad;
	}
	public Integer getCosto(){
		return costo;
	}
	public void setCosto(Integer costo){
		this.costo = costo;
	}
	public Integer getIdcompras(){
		return idCompras;
	}
	public void setIdcompras(Integer idCompras){
		this.idCompras = idCompras;
	}

}