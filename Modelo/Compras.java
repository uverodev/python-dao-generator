package modelo;

public class Compras{
	Integer id;
	String facturanum;
	String fecha;
	Integer total;
	Integer iva;
	String estado;
	Integer idcategorias;
	Integer idProveedor;
	Integer idUsuarios;

	public Compras(Integer id, String facturanum, String fecha, Integer total, Integer iva, String estado, Integer idcategorias, Integer idProveedor, Integer idUsuarios){
		this.id = id;
		this.facturanum = facturanum;
		this.fecha = fecha;
		this.total = total;
		this.iva = iva;
		this.estado = estado;
		this.idcategorias = idcategorias;
		this.idProveedor = idProveedor;
		this.idUsuarios = idUsuarios;
	}
	public Compras(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compras{"+"id=" + id+"facturanum=" + facturanum+"fecha=" + fecha+"total=" + total+"iva=" + iva+"estado=" + estado+"idcategorias=" + idcategorias+"idProveedor=" + idProveedor+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getFacturanum(){
		return facturanum;
	}
	public void setFacturanum(String facturanum){
		this.facturanum = facturanum;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public Integer getTotal(){
		return total;
	}
	public void setTotal(Integer total){
		this.total = total;
	}
	public Integer getIva(){
		return iva;
	}
	public void setIva(Integer iva){
		this.iva = iva;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public Integer getIdcategorias(){
		return idcategorias;
	}
	public void setIdcategorias(Integer idcategorias){
		this.idcategorias = idcategorias;
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