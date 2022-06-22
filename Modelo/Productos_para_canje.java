package modelo;

public class Productos_para_canje{
	Integer ppc_nro;
	Double ppc_cantidad;
	String ppc_fecha;
	String ppc_hora;
	String fechasct;
	Integer ppc_borrado;
	Integer ppc_canjedo;
	String ppc_codigo_producto;
	Integer ppc_deposito_producto;
	String ppc_lote_producto;
	String ppc_vencimiento_producto;
	Integer ppc_usuario;
	String ppc_maquina;
	String ppc_motivo;
	Double ppc_precio_compra;
	Double ppc_precio_venta;

	public Productos_para_canje(Integer ppc_nro, Double ppc_cantidad, String ppc_fecha, String ppc_hora, String fechasct, Integer ppc_borrado, Integer ppc_canjedo, String ppc_codigo_producto, Integer ppc_deposito_producto, String ppc_lote_producto, String ppc_vencimiento_producto, Integer ppc_usuario, String ppc_maquina, String ppc_motivo, Double ppc_precio_compra, Double ppc_precio_venta){
		this.ppc_nro = ppc_nro;
		this.ppc_cantidad = ppc_cantidad;
		this.ppc_fecha = ppc_fecha;
		this.ppc_hora = ppc_hora;
		this.fechasct = fechasct;
		this.ppc_borrado = ppc_borrado;
		this.ppc_canjedo = ppc_canjedo;
		this.ppc_codigo_producto = ppc_codigo_producto;
		this.ppc_deposito_producto = ppc_deposito_producto;
		this.ppc_lote_producto = ppc_lote_producto;
		this.ppc_vencimiento_producto = ppc_vencimiento_producto;
		this.ppc_usuario = ppc_usuario;
		this.ppc_maquina = ppc_maquina;
		this.ppc_motivo = ppc_motivo;
		this.ppc_precio_compra = ppc_precio_compra;
		this.ppc_precio_venta = ppc_precio_venta;
	}
	public Productos_para_canje(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Productos_para_canje{"+", ppc_nro=" + ppc_nro+", ppc_cantidad=" + ppc_cantidad+", ppc_fecha=" + ppc_fecha+", ppc_hora=" + ppc_hora+", fechasct=" + fechasct+", ppc_borrado=" + ppc_borrado+", ppc_canjedo=" + ppc_canjedo+", ppc_codigo_producto=" + ppc_codigo_producto+", ppc_deposito_producto=" + ppc_deposito_producto+", ppc_lote_producto=" + ppc_lote_producto+", ppc_vencimiento_producto=" + ppc_vencimiento_producto+", ppc_usuario=" + ppc_usuario+", ppc_maquina=" + ppc_maquina+", ppc_motivo=" + ppc_motivo+", ppc_precio_compra=" + ppc_precio_compra+", ppc_precio_venta=" + ppc_precio_venta+"}";

	}
	public Integer getPpc_nro(){
		return ppc_nro;
	}
	public void setPpc_nro(Integer ppc_nro){
		this.ppc_nro = ppc_nro;
	}
	public Double getPpc_cantidad(){
		return ppc_cantidad;
	}
	public void setPpc_cantidad(Double ppc_cantidad){
		this.ppc_cantidad = ppc_cantidad;
	}
	public String getPpc_fecha(){
		return ppc_fecha;
	}
	public void setPpc_fecha(String ppc_fecha){
		this.ppc_fecha = ppc_fecha;
	}
	public String getPpc_hora(){
		return ppc_hora;
	}
	public void setPpc_hora(String ppc_hora){
		this.ppc_hora = ppc_hora;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getPpc_borrado(){
		return ppc_borrado;
	}
	public void setPpc_borrado(Integer ppc_borrado){
		this.ppc_borrado = ppc_borrado;
	}
	public Integer getPpc_canjedo(){
		return ppc_canjedo;
	}
	public void setPpc_canjedo(Integer ppc_canjedo){
		this.ppc_canjedo = ppc_canjedo;
	}
	public String getPpc_codigo_producto(){
		return ppc_codigo_producto;
	}
	public void setPpc_codigo_producto(String ppc_codigo_producto){
		this.ppc_codigo_producto = ppc_codigo_producto;
	}
	public Integer getPpc_deposito_producto(){
		return ppc_deposito_producto;
	}
	public void setPpc_deposito_producto(Integer ppc_deposito_producto){
		this.ppc_deposito_producto = ppc_deposito_producto;
	}
	public String getPpc_lote_producto(){
		return ppc_lote_producto;
	}
	public void setPpc_lote_producto(String ppc_lote_producto){
		this.ppc_lote_producto = ppc_lote_producto;
	}
	public String getPpc_vencimiento_producto(){
		return ppc_vencimiento_producto;
	}
	public void setPpc_vencimiento_producto(String ppc_vencimiento_producto){
		this.ppc_vencimiento_producto = ppc_vencimiento_producto;
	}
	public Integer getPpc_usuario(){
		return ppc_usuario;
	}
	public void setPpc_usuario(Integer ppc_usuario){
		this.ppc_usuario = ppc_usuario;
	}
	public String getPpc_maquina(){
		return ppc_maquina;
	}
	public void setPpc_maquina(String ppc_maquina){
		this.ppc_maquina = ppc_maquina;
	}
	public String getPpc_motivo(){
		return ppc_motivo;
	}
	public void setPpc_motivo(String ppc_motivo){
		this.ppc_motivo = ppc_motivo;
	}
	public Double getPpc_precio_compra(){
		return ppc_precio_compra;
	}
	public void setPpc_precio_compra(Double ppc_precio_compra){
		this.ppc_precio_compra = ppc_precio_compra;
	}
	public Double getPpc_precio_venta(){
		return ppc_precio_venta;
	}
	public void setPpc_precio_venta(Double ppc_precio_venta){
		this.ppc_precio_venta = ppc_precio_venta;
	}

}