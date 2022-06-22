package modelo;

public class Pagofacturas{
	Integer pf_nro;
	String pf_descripcion;
	String pf_fecha;
	Double pf_monto;
	String pf_numfact;
	Integer pf_borrado;
	Integer pf_deposito;

	public Pagofacturas(Integer pf_nro, String pf_descripcion, String pf_fecha, Double pf_monto, String pf_numfact, Integer pf_borrado, Integer pf_deposito){
		this.pf_nro = pf_nro;
		this.pf_descripcion = pf_descripcion;
		this.pf_fecha = pf_fecha;
		this.pf_monto = pf_monto;
		this.pf_numfact = pf_numfact;
		this.pf_borrado = pf_borrado;
		this.pf_deposito = pf_deposito;
	}
	public Pagofacturas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pagofacturas{"+", pf_nro=" + pf_nro+", pf_descripcion=" + pf_descripcion+", pf_fecha=" + pf_fecha+", pf_monto=" + pf_monto+", pf_numfact=" + pf_numfact+", pf_borrado=" + pf_borrado+", pf_deposito=" + pf_deposito+"}";

	}
	public Integer getPf_nro(){
		return pf_nro;
	}
	public void setPf_nro(Integer pf_nro){
		this.pf_nro = pf_nro;
	}
	public String getPf_descripcion(){
		return pf_descripcion;
	}
	public void setPf_descripcion(String pf_descripcion){
		this.pf_descripcion = pf_descripcion;
	}
	public String getPf_fecha(){
		return pf_fecha;
	}
	public void setPf_fecha(String pf_fecha){
		this.pf_fecha = pf_fecha;
	}
	public Double getPf_monto(){
		return pf_monto;
	}
	public void setPf_monto(Double pf_monto){
		this.pf_monto = pf_monto;
	}
	public String getPf_numfact(){
		return pf_numfact;
	}
	public void setPf_numfact(String pf_numfact){
		this.pf_numfact = pf_numfact;
	}
	public Integer getPf_borrado(){
		return pf_borrado;
	}
	public void setPf_borrado(Integer pf_borrado){
		this.pf_borrado = pf_borrado;
	}
	public Integer getPf_deposito(){
		return pf_deposito;
	}
	public void setPf_deposito(Integer pf_deposito){
		this.pf_deposito = pf_deposito;
	}

}