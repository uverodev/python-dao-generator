package modelo;

public class Pro_lote{
	Integer l_codigo;
	String l_lote;
	String l_prodcod;
	String l_fecha;
	String l_fechavencimiento;
	Integer l_borrado;
	Double l_cantidad;

	public Pro_lote(Integer l_codigo, String l_lote, String l_prodcod, String l_fecha, String l_fechavencimiento, Integer l_borrado, Double l_cantidad){
		this.l_codigo = l_codigo;
		this.l_lote = l_lote;
		this.l_prodcod = l_prodcod;
		this.l_fecha = l_fecha;
		this.l_fechavencimiento = l_fechavencimiento;
		this.l_borrado = l_borrado;
		this.l_cantidad = l_cantidad;
	}
	public Pro_lote(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pro_lote{"+", l_codigo=" + l_codigo+", l_lote=" + l_lote+", l_prodcod=" + l_prodcod+", l_fecha=" + l_fecha+", l_fechavencimiento=" + l_fechavencimiento+", l_borrado=" + l_borrado+", l_cantidad=" + l_cantidad+"}";

	}
	public Integer getL_codigo(){
		return l_codigo;
	}
	public void setL_codigo(Integer l_codigo){
		this.l_codigo = l_codigo;
	}
	public String getL_lote(){
		return l_lote;
	}
	public void setL_lote(String l_lote){
		this.l_lote = l_lote;
	}
	public String getL_prodcod(){
		return l_prodcod;
	}
	public void setL_prodcod(String l_prodcod){
		this.l_prodcod = l_prodcod;
	}
	public String getL_fecha(){
		return l_fecha;
	}
	public void setL_fecha(String l_fecha){
		this.l_fecha = l_fecha;
	}
	public String getL_fechavencimiento(){
		return l_fechavencimiento;
	}
	public void setL_fechavencimiento(String l_fechavencimiento){
		this.l_fechavencimiento = l_fechavencimiento;
	}
	public Integer getL_borrado(){
		return l_borrado;
	}
	public void setL_borrado(Integer l_borrado){
		this.l_borrado = l_borrado;
	}
	public Double getL_cantidad(){
		return l_cantidad;
	}
	public void setL_cantidad(Double l_cantidad){
		this.l_cantidad = l_cantidad;
	}

}