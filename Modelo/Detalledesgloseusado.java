package modelo;

public class Detalledesgloseusado{
	Integer dgu_codigo;
	Integer dgu_codigocabecera;
	Object dgu_codprod;
	Double dgu_cantidaddesglosada;
	Integer dgu_borrado;
	String dgu_fecha;
	Object dgu_lote;

	public Detalledesgloseusado(Integer dgu_codigo, Integer dgu_codigocabecera, Object dgu_codprod, Double dgu_cantidaddesglosada, Integer dgu_borrado, String dgu_fecha, Object dgu_lote){
		this.dgu_codigo = dgu_codigo;
		this.dgu_codigocabecera = dgu_codigocabecera;
		this.dgu_codprod = dgu_codprod;
		this.dgu_cantidaddesglosada = dgu_cantidaddesglosada;
		this.dgu_borrado = dgu_borrado;
		this.dgu_fecha = dgu_fecha;
		this.dgu_lote = dgu_lote;
	}
	public Detalledesgloseusado(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalledesgloseusado{"+", dgu_codigo=" + dgu_codigo+", dgu_codigocabecera=" + dgu_codigocabecera+", dgu_codprod=" + dgu_codprod+", dgu_cantidaddesglosada=" + dgu_cantidaddesglosada+", dgu_borrado=" + dgu_borrado+", dgu_fecha=" + dgu_fecha+", dgu_lote=" + dgu_lote+"}";

	}
	public Integer getDgu_codigo(){
		return dgu_codigo;
	}
	public void setDgu_codigo(Integer dgu_codigo){
		this.dgu_codigo = dgu_codigo;
	}
	public Integer getDgu_codigocabecera(){
		return dgu_codigocabecera;
	}
	public void setDgu_codigocabecera(Integer dgu_codigocabecera){
		this.dgu_codigocabecera = dgu_codigocabecera;
	}
	public Object getDgu_codprod(){
		return dgu_codprod;
	}
	public void setDgu_codprod(Object dgu_codprod){
		this.dgu_codprod = dgu_codprod;
	}
	public Double getDgu_cantidaddesglosada(){
		return dgu_cantidaddesglosada;
	}
	public void setDgu_cantidaddesglosada(Double dgu_cantidaddesglosada){
		this.dgu_cantidaddesglosada = dgu_cantidaddesglosada;
	}
	public Integer getDgu_borrado(){
		return dgu_borrado;
	}
	public void setDgu_borrado(Integer dgu_borrado){
		this.dgu_borrado = dgu_borrado;
	}
	public String getDgu_fecha(){
		return dgu_fecha;
	}
	public void setDgu_fecha(String dgu_fecha){
		this.dgu_fecha = dgu_fecha;
	}
	public Object getDgu_lote(){
		return dgu_lote;
	}
	public void setDgu_lote(Object dgu_lote){
		this.dgu_lote = dgu_lote;
	}

}