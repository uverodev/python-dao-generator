package modelo;

public class Ventas{
	Integer id;
	String fecha;
	String fechapago;
	String horapago;
	Integer idClientes;
	Integer total;
	String estado;
	String facturanum;
	String tipo;
	Integer descuento;
	Integer idVendedor;
	Integer idCobrador;

	public Ventas(Integer id, String fecha, String fechapago, String horapago, Integer idClientes, Integer total, String estado, String facturanum, String tipo, Integer descuento, Integer idVendedor, Integer idCobrador){
		this.id = id;
		this.fecha = fecha;
		this.fechapago = fechapago;
		this.horapago = horapago;
		this.idClientes = idClientes;
		this.total = total;
		this.estado = estado;
		this.facturanum = facturanum;
		this.tipo = tipo;
		this.descuento = descuento;
		this.idVendedor = idVendedor;
		this.idCobrador = idCobrador;
	}
	public Ventas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventas{"+"id=" + id+"fecha=" + fecha+"fechapago=" + fechapago+"horapago=" + horapago+"idClientes=" + idClientes+"total=" + total+"estado=" + estado+"facturanum=" + facturanum+"tipo=" + tipo+"descuento=" + descuento+"idVendedor=" + idVendedor+"idCobrador=" + idCobrador+"}";

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
	public String getFechapago(){
		return fechapago;
	}
	public void setFechapago(String fechapago){
		this.fechapago = fechapago;
	}
	public String getHorapago(){
		return horapago;
	}
	public void setHorapago(String horapago){
		this.horapago = horapago;
	}
	public Integer getIdclientes(){
		return idClientes;
	}
	public void setIdclientes(Integer idClientes){
		this.idClientes = idClientes;
	}
	public Integer getTotal(){
		return total;
	}
	public void setTotal(Integer total){
		this.total = total;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getFacturanum(){
		return facturanum;
	}
	public void setFacturanum(String facturanum){
		this.facturanum = facturanum;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public Integer getDescuento(){
		return descuento;
	}
	public void setDescuento(Integer descuento){
		this.descuento = descuento;
	}
	public Integer getIdvendedor(){
		return idVendedor;
	}
	public void setIdvendedor(Integer idVendedor){
		this.idVendedor = idVendedor;
	}
	public Integer getIdcobrador(){
		return idCobrador;
	}
	public void setIdcobrador(Integer idCobrador){
		this.idCobrador = idCobrador;
	}

}