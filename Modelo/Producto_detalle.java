package modelo;

public class Producto_detalle{
	Integer pd_nro;
	Integer pd_stock;
	Double pd_cantidad;
	Integer pd_producto;
	Object pd_codprod;

	public Producto_detalle(Integer pd_nro, Integer pd_stock, Double pd_cantidad, Integer pd_producto, Object pd_codprod){
		this.pd_nro = pd_nro;
		this.pd_stock = pd_stock;
		this.pd_cantidad = pd_cantidad;
		this.pd_producto = pd_producto;
		this.pd_codprod = pd_codprod;
	}
	public Producto_detalle(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Producto_detalle{"+", pd_nro=" + pd_nro+", pd_stock=" + pd_stock+", pd_cantidad=" + pd_cantidad+", pd_producto=" + pd_producto+", pd_codprod=" + pd_codprod+"}";

	}
	public Integer getPd_nro(){
		return pd_nro;
	}
	public void setPd_nro(Integer pd_nro){
		this.pd_nro = pd_nro;
	}
	public Integer getPd_stock(){
		return pd_stock;
	}
	public void setPd_stock(Integer pd_stock){
		this.pd_stock = pd_stock;
	}
	public Double getPd_cantidad(){
		return pd_cantidad;
	}
	public void setPd_cantidad(Double pd_cantidad){
		this.pd_cantidad = pd_cantidad;
	}
	public Integer getPd_producto(){
		return pd_producto;
	}
	public void setPd_producto(Integer pd_producto){
		this.pd_producto = pd_producto;
	}
	public Object getPd_codprod(){
		return pd_codprod;
	}
	public void setPd_codprod(Object pd_codprod){
		this.pd_codprod = pd_codprod;
	}

}