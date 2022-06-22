package modelo;

public class Productos_baja{
	Integer pb_nro;
	Double pb_cantidad;
	String pb_fecha;
	String pb_hora;
	String fechasct;
	Integer pb_borrado;
	String pb_codigo_producto;
	Integer pb_deposito_producto;
	String pb_lote_producto;
	String pb_vencimiento_producto;
	Integer pb_usuario;
	String pb_maquina;
	String pb_motivo;
	Double pb_precio_compra;
	Double pb_precio_venta;

	public Productos_baja(Integer pb_nro, Double pb_cantidad, String pb_fecha, String pb_hora, String fechasct, Integer pb_borrado, String pb_codigo_producto, Integer pb_deposito_producto, String pb_lote_producto, String pb_vencimiento_producto, Integer pb_usuario, String pb_maquina, String pb_motivo, Double pb_precio_compra, Double pb_precio_venta){
		this.pb_nro = pb_nro;
		this.pb_cantidad = pb_cantidad;
		this.pb_fecha = pb_fecha;
		this.pb_hora = pb_hora;
		this.fechasct = fechasct;
		this.pb_borrado = pb_borrado;
		this.pb_codigo_producto = pb_codigo_producto;
		this.pb_deposito_producto = pb_deposito_producto;
		this.pb_lote_producto = pb_lote_producto;
		this.pb_vencimiento_producto = pb_vencimiento_producto;
		this.pb_usuario = pb_usuario;
		this.pb_maquina = pb_maquina;
		this.pb_motivo = pb_motivo;
		this.pb_precio_compra = pb_precio_compra;
		this.pb_precio_venta = pb_precio_venta;
	}
	public Productos_baja(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Productos_baja{"+", pb_nro=" + pb_nro+", pb_cantidad=" + pb_cantidad+", pb_fecha=" + pb_fecha+", pb_hora=" + pb_hora+", fechasct=" + fechasct+", pb_borrado=" + pb_borrado+", pb_codigo_producto=" + pb_codigo_producto+", pb_deposito_producto=" + pb_deposito_producto+", pb_lote_producto=" + pb_lote_producto+", pb_vencimiento_producto=" + pb_vencimiento_producto+", pb_usuario=" + pb_usuario+", pb_maquina=" + pb_maquina+", pb_motivo=" + pb_motivo+", pb_precio_compra=" + pb_precio_compra+", pb_precio_venta=" + pb_precio_venta+"}";

	}
	public Integer getPb_nro(){
		return pb_nro;
	}
	public void setPb_nro(Integer pb_nro){
		this.pb_nro = pb_nro;
	}
	public Double getPb_cantidad(){
		return pb_cantidad;
	}
	public void setPb_cantidad(Double pb_cantidad){
		this.pb_cantidad = pb_cantidad;
	}
	public String getPb_fecha(){
		return pb_fecha;
	}
	public void setPb_fecha(String pb_fecha){
		this.pb_fecha = pb_fecha;
	}
	public String getPb_hora(){
		return pb_hora;
	}
	public void setPb_hora(String pb_hora){
		this.pb_hora = pb_hora;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getPb_borrado(){
		return pb_borrado;
	}
	public void setPb_borrado(Integer pb_borrado){
		this.pb_borrado = pb_borrado;
	}
	public String getPb_codigo_producto(){
		return pb_codigo_producto;
	}
	public void setPb_codigo_producto(String pb_codigo_producto){
		this.pb_codigo_producto = pb_codigo_producto;
	}
	public Integer getPb_deposito_producto(){
		return pb_deposito_producto;
	}
	public void setPb_deposito_producto(Integer pb_deposito_producto){
		this.pb_deposito_producto = pb_deposito_producto;
	}
	public String getPb_lote_producto(){
		return pb_lote_producto;
	}
	public void setPb_lote_producto(String pb_lote_producto){
		this.pb_lote_producto = pb_lote_producto;
	}
	public String getPb_vencimiento_producto(){
		return pb_vencimiento_producto;
	}
	public void setPb_vencimiento_producto(String pb_vencimiento_producto){
		this.pb_vencimiento_producto = pb_vencimiento_producto;
	}
	public Integer getPb_usuario(){
		return pb_usuario;
	}
	public void setPb_usuario(Integer pb_usuario){
		this.pb_usuario = pb_usuario;
	}
	public String getPb_maquina(){
		return pb_maquina;
	}
	public void setPb_maquina(String pb_maquina){
		this.pb_maquina = pb_maquina;
	}
	public String getPb_motivo(){
		return pb_motivo;
	}
	public void setPb_motivo(String pb_motivo){
		this.pb_motivo = pb_motivo;
	}
	public Double getPb_precio_compra(){
		return pb_precio_compra;
	}
	public void setPb_precio_compra(Double pb_precio_compra){
		this.pb_precio_compra = pb_precio_compra;
	}
	public Double getPb_precio_venta(){
		return pb_precio_venta;
	}
	public void setPb_precio_venta(Double pb_precio_venta){
		this.pb_precio_venta = pb_precio_venta;
	}

}