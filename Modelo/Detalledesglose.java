package modelo;

public class Detalledesglose{
	Integer dg_codigo;
	Integer dg_codigocabecera;
	Object dg_codprod;
	Double dg_cantidaddesglosada;
	Integer dg_borrado;
	String dg_fecha;
	Object dg_lote;
	Double dg_preciocompra;
	Double dg_preciobase;
	Double dg_preciominimo;
	Double dg_preciomayor;
	Double dg_preciocredito;

	public Detalledesglose(Integer dg_codigo, Integer dg_codigocabecera, Object dg_codprod, Double dg_cantidaddesglosada, Integer dg_borrado, String dg_fecha, Object dg_lote, Double dg_preciocompra, Double dg_preciobase, Double dg_preciominimo, Double dg_preciomayor, Double dg_preciocredito){
		this.dg_codigo = dg_codigo;
		this.dg_codigocabecera = dg_codigocabecera;
		this.dg_codprod = dg_codprod;
		this.dg_cantidaddesglosada = dg_cantidaddesglosada;
		this.dg_borrado = dg_borrado;
		this.dg_fecha = dg_fecha;
		this.dg_lote = dg_lote;
		this.dg_preciocompra = dg_preciocompra;
		this.dg_preciobase = dg_preciobase;
		this.dg_preciominimo = dg_preciominimo;
		this.dg_preciomayor = dg_preciomayor;
		this.dg_preciocredito = dg_preciocredito;
	}
	public Detalledesglose(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalledesglose{"+", dg_codigo=" + dg_codigo+", dg_codigocabecera=" + dg_codigocabecera+", dg_codprod=" + dg_codprod+", dg_cantidaddesglosada=" + dg_cantidaddesglosada+", dg_borrado=" + dg_borrado+", dg_fecha=" + dg_fecha+", dg_lote=" + dg_lote+", dg_preciocompra=" + dg_preciocompra+", dg_preciobase=" + dg_preciobase+", dg_preciominimo=" + dg_preciominimo+", dg_preciomayor=" + dg_preciomayor+", dg_preciocredito=" + dg_preciocredito+"}";

	}
	public Integer getDg_codigo(){
		return dg_codigo;
	}
	public void setDg_codigo(Integer dg_codigo){
		this.dg_codigo = dg_codigo;
	}
	public Integer getDg_codigocabecera(){
		return dg_codigocabecera;
	}
	public void setDg_codigocabecera(Integer dg_codigocabecera){
		this.dg_codigocabecera = dg_codigocabecera;
	}
	public Object getDg_codprod(){
		return dg_codprod;
	}
	public void setDg_codprod(Object dg_codprod){
		this.dg_codprod = dg_codprod;
	}
	public Double getDg_cantidaddesglosada(){
		return dg_cantidaddesglosada;
	}
	public void setDg_cantidaddesglosada(Double dg_cantidaddesglosada){
		this.dg_cantidaddesglosada = dg_cantidaddesglosada;
	}
	public Integer getDg_borrado(){
		return dg_borrado;
	}
	public void setDg_borrado(Integer dg_borrado){
		this.dg_borrado = dg_borrado;
	}
	public String getDg_fecha(){
		return dg_fecha;
	}
	public void setDg_fecha(String dg_fecha){
		this.dg_fecha = dg_fecha;
	}
	public Object getDg_lote(){
		return dg_lote;
	}
	public void setDg_lote(Object dg_lote){
		this.dg_lote = dg_lote;
	}
	public Double getDg_preciocompra(){
		return dg_preciocompra;
	}
	public void setDg_preciocompra(Double dg_preciocompra){
		this.dg_preciocompra = dg_preciocompra;
	}
	public Double getDg_preciobase(){
		return dg_preciobase;
	}
	public void setDg_preciobase(Double dg_preciobase){
		this.dg_preciobase = dg_preciobase;
	}
	public Double getDg_preciominimo(){
		return dg_preciominimo;
	}
	public void setDg_preciominimo(Double dg_preciominimo){
		this.dg_preciominimo = dg_preciominimo;
	}
	public Double getDg_preciomayor(){
		return dg_preciomayor;
	}
	public void setDg_preciomayor(Double dg_preciomayor){
		this.dg_preciomayor = dg_preciomayor;
	}
	public Double getDg_preciocredito(){
		return dg_preciocredito;
	}
	public void setDg_preciocredito(Double dg_preciocredito){
		this.dg_preciocredito = dg_preciocredito;
	}

}