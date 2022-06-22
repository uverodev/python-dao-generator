package modelo;

public class Balance{
	Integer id;
	String concepto;
	Double ingreso;
	Double egreso;
	String fecha;
	String tipo;
	Integer idMonedas;
	Integer idUsuarios;

	public Balance(Integer id, String concepto, Double ingreso, Double egreso, String fecha, String tipo, Integer idMonedas, Integer idUsuarios){
		this.id = id;
		this.concepto = concepto;
		this.ingreso = ingreso;
		this.egreso = egreso;
		this.fecha = fecha;
		this.tipo = tipo;
		this.idMonedas = idMonedas;
		this.idUsuarios = idUsuarios;
	}
	public Balance(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Balance{"+"id=" + id+"concepto=" + concepto+"ingreso=" + ingreso+"egreso=" + egreso+"fecha=" + fecha+"tipo=" + tipo+"idMonedas=" + idMonedas+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getConcepto(){
		return concepto;
	}
	public void setConcepto(String concepto){
		this.concepto = concepto;
	}
	public Double getIngreso(){
		return ingreso;
	}
	public void setIngreso(Double ingreso){
		this.ingreso = ingreso;
	}
	public Double getEgreso(){
		return egreso;
	}
	public void setEgreso(Double egreso){
		this.egreso = egreso;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public String getTipo(){
		return tipo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public Integer getIdmonedas(){
		return idMonedas;
	}
	public void setIdmonedas(Integer idMonedas){
		this.idMonedas = idMonedas;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}