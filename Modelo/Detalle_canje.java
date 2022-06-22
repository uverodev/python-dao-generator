package modelo;

public class Detalle_canje{
	Integer dcj_id;
	Integer dcj_nro_cabecera;
	String dcj_codigo_producto;
	String dcj_lote;
	Integer dcj_deposito;
	Double dcj_cantidad;
	Double dcj_precio_compra;
	String dcj_vencimiento;
	Integer dcj_borrado;

	public Detalle_canje(Integer dcj_id, Integer dcj_nro_cabecera, String dcj_codigo_producto, String dcj_lote, Integer dcj_deposito, Double dcj_cantidad, Double dcj_precio_compra, String dcj_vencimiento, Integer dcj_borrado){
		this.dcj_id = dcj_id;
		this.dcj_nro_cabecera = dcj_nro_cabecera;
		this.dcj_codigo_producto = dcj_codigo_producto;
		this.dcj_lote = dcj_lote;
		this.dcj_deposito = dcj_deposito;
		this.dcj_cantidad = dcj_cantidad;
		this.dcj_precio_compra = dcj_precio_compra;
		this.dcj_vencimiento = dcj_vencimiento;
		this.dcj_borrado = dcj_borrado;
	}
	public Detalle_canje(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalle_canje{"+", dcj_id=" + dcj_id+", dcj_nro_cabecera=" + dcj_nro_cabecera+", dcj_codigo_producto=" + dcj_codigo_producto+", dcj_lote=" + dcj_lote+", dcj_deposito=" + dcj_deposito+", dcj_cantidad=" + dcj_cantidad+", dcj_precio_compra=" + dcj_precio_compra+", dcj_vencimiento=" + dcj_vencimiento+", dcj_borrado=" + dcj_borrado+"}";

	}
	public Integer getDcj_id(){
		return dcj_id;
	}
	public void setDcj_id(Integer dcj_id){
		this.dcj_id = dcj_id;
	}
	public Integer getDcj_nro_cabecera(){
		return dcj_nro_cabecera;
	}
	public void setDcj_nro_cabecera(Integer dcj_nro_cabecera){
		this.dcj_nro_cabecera = dcj_nro_cabecera;
	}
	public String getDcj_codigo_producto(){
		return dcj_codigo_producto;
	}
	public void setDcj_codigo_producto(String dcj_codigo_producto){
		this.dcj_codigo_producto = dcj_codigo_producto;
	}
	public String getDcj_lote(){
		return dcj_lote;
	}
	public void setDcj_lote(String dcj_lote){
		this.dcj_lote = dcj_lote;
	}
	public Integer getDcj_deposito(){
		return dcj_deposito;
	}
	public void setDcj_deposito(Integer dcj_deposito){
		this.dcj_deposito = dcj_deposito;
	}
	public Double getDcj_cantidad(){
		return dcj_cantidad;
	}
	public void setDcj_cantidad(Double dcj_cantidad){
		this.dcj_cantidad = dcj_cantidad;
	}
	public Double getDcj_precio_compra(){
		return dcj_precio_compra;
	}
	public void setDcj_precio_compra(Double dcj_precio_compra){
		this.dcj_precio_compra = dcj_precio_compra;
	}
	public String getDcj_vencimiento(){
		return dcj_vencimiento;
	}
	public void setDcj_vencimiento(String dcj_vencimiento){
		this.dcj_vencimiento = dcj_vencimiento;
	}
	public Integer getDcj_borrado(){
		return dcj_borrado;
	}
	public void setDcj_borrado(Integer dcj_borrado){
		this.dcj_borrado = dcj_borrado;
	}

}