package modelo;

public class Cierre_accionistas_ventas{
	Integer cav_id;
	Integer cav_nro_venta;
	Integer cav_cierre_asociado;
	Double cav_total_venta;
	Double cav_total_compra;
	Double cav_ganancia;
	Integer cav_borrado;

	public Cierre_accionistas_ventas(Integer cav_id, Integer cav_nro_venta, Integer cav_cierre_asociado, Double cav_total_venta, Double cav_total_compra, Double cav_ganancia, Integer cav_borrado){
		this.cav_id = cav_id;
		this.cav_nro_venta = cav_nro_venta;
		this.cav_cierre_asociado = cav_cierre_asociado;
		this.cav_total_venta = cav_total_venta;
		this.cav_total_compra = cav_total_compra;
		this.cav_ganancia = cav_ganancia;
		this.cav_borrado = cav_borrado;
	}
	public Cierre_accionistas_ventas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cierre_accionistas_ventas{"+", cav_id=" + cav_id+", cav_nro_venta=" + cav_nro_venta+", cav_cierre_asociado=" + cav_cierre_asociado+", cav_total_venta=" + cav_total_venta+", cav_total_compra=" + cav_total_compra+", cav_ganancia=" + cav_ganancia+", cav_borrado=" + cav_borrado+"}";

	}
	public Integer getCav_id(){
		return cav_id;
	}
	public void setCav_id(Integer cav_id){
		this.cav_id = cav_id;
	}
	public Integer getCav_nro_venta(){
		return cav_nro_venta;
	}
	public void setCav_nro_venta(Integer cav_nro_venta){
		this.cav_nro_venta = cav_nro_venta;
	}
	public Integer getCav_cierre_asociado(){
		return cav_cierre_asociado;
	}
	public void setCav_cierre_asociado(Integer cav_cierre_asociado){
		this.cav_cierre_asociado = cav_cierre_asociado;
	}
	public Double getCav_total_venta(){
		return cav_total_venta;
	}
	public void setCav_total_venta(Double cav_total_venta){
		this.cav_total_venta = cav_total_venta;
	}
	public Double getCav_total_compra(){
		return cav_total_compra;
	}
	public void setCav_total_compra(Double cav_total_compra){
		this.cav_total_compra = cav_total_compra;
	}
	public Double getCav_ganancia(){
		return cav_ganancia;
	}
	public void setCav_ganancia(Double cav_ganancia){
		this.cav_ganancia = cav_ganancia;
	}
	public Integer getCav_borrado(){
		return cav_borrado;
	}
	public void setCav_borrado(Integer cav_borrado){
		this.cav_borrado = cav_borrado;
	}

}