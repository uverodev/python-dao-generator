package modelo;

public class Productoslotes{
	Integer id;
	String fecha;
	String facturanum;
	String estado;
	Integer gastototal;
	Integer ivacredito;
	Integer idProveedor;
	Integer idUsuarios;

	public Productoslotes(Integer id, String fecha, String facturanum, String estado, Integer gastototal, Integer ivacredito, Integer idProveedor, Integer idUsuarios){
		this.id = id;
		this.fecha = fecha;
		this.facturanum = facturanum;
		this.estado = estado;
		this.gastototal = gastototal;
		this.ivacredito = ivacredito;
		this.idProveedor = idProveedor;
		this.idUsuarios = idUsuarios;
	}
	public Productoslotes(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Productoslotes{"+"id=" + id+"fecha=" + fecha+"facturanum=" + facturanum+"estado=" + estado+"gastototal=" + gastototal+"ivacredito=" + ivacredito+"idProveedor=" + idProveedor+"idUsuarios=" + idUsuarios+"}";

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
	public String getFacturanum(){
		return facturanum;
	}
	public void setFacturanum(String facturanum){
		this.facturanum = facturanum;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public Integer getGastototal(){
		return gastototal;
	}
	public void setGastototal(Integer gastototal){
		this.gastototal = gastototal;
	}
	public Integer getIvacredito(){
		return ivacredito;
	}
	public void setIvacredito(Integer ivacredito){
		this.ivacredito = ivacredito;
	}
	public Integer getIdproveedor(){
		return idProveedor;
	}
	public void setIdproveedor(Integer idProveedor){
		this.idProveedor = idProveedor;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}