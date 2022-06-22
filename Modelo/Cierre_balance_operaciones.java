package modelo;

public class Cierre_balance_operaciones{
	Integer cbo_id;
	Integer cbo_cierre_balance;
	Integer cbo_tipo_operacion;
	Integer cbo_nro_operacion;
	Double cbo_ingreso;
	Double cbo_egreso;
	Integer cbo_borrado;

	public Cierre_balance_operaciones(Integer cbo_id, Integer cbo_cierre_balance, Integer cbo_tipo_operacion, Integer cbo_nro_operacion, Double cbo_ingreso, Double cbo_egreso, Integer cbo_borrado){
		this.cbo_id = cbo_id;
		this.cbo_cierre_balance = cbo_cierre_balance;
		this.cbo_tipo_operacion = cbo_tipo_operacion;
		this.cbo_nro_operacion = cbo_nro_operacion;
		this.cbo_ingreso = cbo_ingreso;
		this.cbo_egreso = cbo_egreso;
		this.cbo_borrado = cbo_borrado;
	}
	public Cierre_balance_operaciones(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cierre_balance_operaciones{"+", cbo_id=" + cbo_id+", cbo_cierre_balance=" + cbo_cierre_balance+", cbo_tipo_operacion=" + cbo_tipo_operacion+", cbo_nro_operacion=" + cbo_nro_operacion+", cbo_ingreso=" + cbo_ingreso+", cbo_egreso=" + cbo_egreso+", cbo_borrado=" + cbo_borrado+"}";

	}
	public Integer getCbo_id(){
		return cbo_id;
	}
	public void setCbo_id(Integer cbo_id){
		this.cbo_id = cbo_id;
	}
	public Integer getCbo_cierre_balance(){
		return cbo_cierre_balance;
	}
	public void setCbo_cierre_balance(Integer cbo_cierre_balance){
		this.cbo_cierre_balance = cbo_cierre_balance;
	}
	public Integer getCbo_tipo_operacion(){
		return cbo_tipo_operacion;
	}
	public void setCbo_tipo_operacion(Integer cbo_tipo_operacion){
		this.cbo_tipo_operacion = cbo_tipo_operacion;
	}
	public Integer getCbo_nro_operacion(){
		return cbo_nro_operacion;
	}
	public void setCbo_nro_operacion(Integer cbo_nro_operacion){
		this.cbo_nro_operacion = cbo_nro_operacion;
	}
	public Double getCbo_ingreso(){
		return cbo_ingreso;
	}
	public void setCbo_ingreso(Double cbo_ingreso){
		this.cbo_ingreso = cbo_ingreso;
	}
	public Double getCbo_egreso(){
		return cbo_egreso;
	}
	public void setCbo_egreso(Double cbo_egreso){
		this.cbo_egreso = cbo_egreso;
	}
	public Integer getCbo_borrado(){
		return cbo_borrado;
	}
	public void setCbo_borrado(Integer cbo_borrado){
		this.cbo_borrado = cbo_borrado;
	}

}