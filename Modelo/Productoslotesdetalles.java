package modelo;

public class Productoslotesdetalles{
	Integer id;
	Integer cantidad;
	Integer costo;
	Integer idLote;
	String vencimiento;
	Integer idProducto;
	Integer idUsuarios;

	public Productoslotesdetalles(Integer id, Integer cantidad, Integer costo, Integer idLote, String vencimiento, Integer idProducto, Integer idUsuarios){
		this.id = id;
		this.cantidad = cantidad;
		this.costo = costo;
		this.idLote = idLote;
		this.vencimiento = vencimiento;
		this.idProducto = idProducto;
		this.idUsuarios = idUsuarios;
	}
	public Productoslotesdetalles(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Productoslotesdetalles{"+"id=" + id+"cantidad=" + cantidad+"costo=" + costo+"idLote=" + idLote+"vencimiento=" + vencimiento+"idProducto=" + idProducto+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
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
	public Integer getIdlote(){
		return idLote;
	}
	public void setIdlote(Integer idLote){
		this.idLote = idLote;
	}
	public String getVencimiento(){
		return vencimiento;
	}
	public void setVencimiento(String vencimiento){
		this.vencimiento = vencimiento;
	}
	public Integer getIdproducto(){
		return idProducto;
	}
	public void setIdproducto(Integer idProducto){
		this.idProducto = idProducto;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}