package modelo;

public class Reserva_venta{
	Integer rv_codigo;
	String rv_pc;
	String rv_codprod;
	Double rv_cantidad;
	Integer rv_operacion;
	Integer rv_vendedor;
	String rv_fecha;
	Object rv_lote;

	public Reserva_venta(Integer rv_codigo, String rv_pc, String rv_codprod, Double rv_cantidad, Integer rv_operacion, Integer rv_vendedor, String rv_fecha, Object rv_lote){
		this.rv_codigo = rv_codigo;
		this.rv_pc = rv_pc;
		this.rv_codprod = rv_codprod;
		this.rv_cantidad = rv_cantidad;
		this.rv_operacion = rv_operacion;
		this.rv_vendedor = rv_vendedor;
		this.rv_fecha = rv_fecha;
		this.rv_lote = rv_lote;
	}
	public Reserva_venta(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Reserva_venta{"+", rv_codigo=" + rv_codigo+", rv_pc=" + rv_pc+", rv_codprod=" + rv_codprod+", rv_cantidad=" + rv_cantidad+", rv_operacion=" + rv_operacion+", rv_vendedor=" + rv_vendedor+", rv_fecha=" + rv_fecha+", rv_lote=" + rv_lote+"}";

	}
	public Integer getRv_codigo(){
		return rv_codigo;
	}
	public void setRv_codigo(Integer rv_codigo){
		this.rv_codigo = rv_codigo;
	}
	public String getRv_pc(){
		return rv_pc;
	}
	public void setRv_pc(String rv_pc){
		this.rv_pc = rv_pc;
	}
	public String getRv_codprod(){
		return rv_codprod;
	}
	public void setRv_codprod(String rv_codprod){
		this.rv_codprod = rv_codprod;
	}
	public Double getRv_cantidad(){
		return rv_cantidad;
	}
	public void setRv_cantidad(Double rv_cantidad){
		this.rv_cantidad = rv_cantidad;
	}
	public Integer getRv_operacion(){
		return rv_operacion;
	}
	public void setRv_operacion(Integer rv_operacion){
		this.rv_operacion = rv_operacion;
	}
	public Integer getRv_vendedor(){
		return rv_vendedor;
	}
	public void setRv_vendedor(Integer rv_vendedor){
		this.rv_vendedor = rv_vendedor;
	}
	public String getRv_fecha(){
		return rv_fecha;
	}
	public void setRv_fecha(String rv_fecha){
		this.rv_fecha = rv_fecha;
	}
	public Object getRv_lote(){
		return rv_lote;
	}
	public void setRv_lote(Object rv_lote){
		this.rv_lote = rv_lote;
	}

}