package modelo;

public class Bajasproductos{
	Integer id;
	String fecha;
	String motivo;
	Integer cantidad;
	Integer idProducto;
	Integer idLote;
	Integer idUsuarios;

	public Bajasproductos(Integer id, String fecha, String motivo, Integer cantidad, Integer idProducto, Integer idLote, Integer idUsuarios){
		this.id = id;
		this.fecha = fecha;
		this.motivo = motivo;
		this.cantidad = cantidad;
		this.idProducto = idProducto;
		this.idLote = idLote;
		this.idUsuarios = idUsuarios;
	}
	public Bajasproductos(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Bajasproductos{"+"id=" + id+"fecha=" + fecha+"motivo=" + motivo+"cantidad=" + cantidad+"idProducto=" + idProducto+"idLote=" + idLote+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public String getMotivo(){
		return motivo;
	}
	public void setMotivo(String motivo){
		this.motivo = motivo;
	}
	public Integer getCantidad(){
		return cantidad;
	}
	public void setCantidad(Integer cantidad){
		this.cantidad = cantidad;
	}
	public Integer getIdproducto(){
		return idProducto;
	}
	public void setIdproducto(Integer idProducto){
		this.idProducto = idProducto;
	}
	public Integer getIdlote(){
		return idLote;
	}
	public void setIdlote(Integer idLote){
		this.idLote = idLote;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}