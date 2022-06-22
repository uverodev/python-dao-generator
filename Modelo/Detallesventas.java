package modelo;

public class Detallesventas{
	Integer id;
	Integer idVentas;
	Integer idProductos;
	Integer idLote;
	Integer cantidad;
	Integer iva5;
	Integer iva10;
	Integer precio;
	Integer subtotal;

	public Detallesventas(Integer id, Integer idVentas, Integer idProductos, Integer idLote, Integer cantidad, Integer iva5, Integer iva10, Integer precio, Integer subtotal){
		this.id = id;
		this.idVentas = idVentas;
		this.idProductos = idProductos;
		this.idLote = idLote;
		this.cantidad = cantidad;
		this.iva5 = iva5;
		this.iva10 = iva10;
		this.precio = precio;
		this.subtotal = subtotal;
	}
	public Detallesventas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detallesventas{"+"id=" + id+"idVentas=" + idVentas+"idProductos=" + idProductos+"idLote=" + idLote+"cantidad=" + cantidad+"iva5=" + iva5+"iva10=" + iva10+"precio=" + precio+"subtotal=" + subtotal+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getIdventas(){
		return idVentas;
	}
	public void setIdventas(Integer idVentas){
		this.idVentas = idVentas;
	}
	public Integer getIdproductos(){
		return idProductos;
	}
	public void setIdproductos(Integer idProductos){
		this.idProductos = idProductos;
	}
	public Integer getIdlote(){
		return idLote;
	}
	public void setIdlote(Integer idLote){
		this.idLote = idLote;
	}
	public Integer getCantidad(){
		return cantidad;
	}
	public void setCantidad(Integer cantidad){
		this.cantidad = cantidad;
	}
	public Integer getIva5(){
		return iva5;
	}
	public void setIva5(Integer iva5){
		this.iva5 = iva5;
	}
	public Integer getIva10(){
		return iva10;
	}
	public void setIva10(Integer iva10){
		this.iva10 = iva10;
	}
	public Integer getPrecio(){
		return precio;
	}
	public void setPrecio(Integer precio){
		this.precio = precio;
	}
	public Integer getSubtotal(){
		return subtotal;
	}
	public void setSubtotal(Integer subtotal){
		this.subtotal = subtotal;
	}

}