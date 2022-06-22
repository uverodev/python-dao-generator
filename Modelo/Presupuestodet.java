package modelo;

public class Presupuestodet{
	Integer prd_nro;
	String prd_codprod;
	Double prd_cantidad;
	Integer prd_unprod;
	Double prd_preciov;
	Double prd_preciovd;
	Double prd_preciovr;
	Double prd_preciovp;
	Double prd_preciove;
	Double prd_descuento;
	Integer prd_unidadv;
	String prd_unidadcantv;
	Double prd_total;
	Integer prd_iva;
	String prd_lote;

	public Presupuestodet(Integer prd_nro, String prd_codprod, Double prd_cantidad, Integer prd_unprod, Double prd_preciov, Double prd_preciovd, Double prd_preciovr, Double prd_preciovp, Double prd_preciove, Double prd_descuento, Integer prd_unidadv, String prd_unidadcantv, Double prd_total, Integer prd_iva, String prd_lote){
		this.prd_nro = prd_nro;
		this.prd_codprod = prd_codprod;
		this.prd_cantidad = prd_cantidad;
		this.prd_unprod = prd_unprod;
		this.prd_preciov = prd_preciov;
		this.prd_preciovd = prd_preciovd;
		this.prd_preciovr = prd_preciovr;
		this.prd_preciovp = prd_preciovp;
		this.prd_preciove = prd_preciove;
		this.prd_descuento = prd_descuento;
		this.prd_unidadv = prd_unidadv;
		this.prd_unidadcantv = prd_unidadcantv;
		this.prd_total = prd_total;
		this.prd_iva = prd_iva;
		this.prd_lote = prd_lote;
	}
	public Presupuestodet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Presupuestodet{"+", prd_nro=" + prd_nro+", prd_codprod=" + prd_codprod+", prd_cantidad=" + prd_cantidad+", prd_unprod=" + prd_unprod+", prd_preciov=" + prd_preciov+", prd_preciovd=" + prd_preciovd+", prd_preciovr=" + prd_preciovr+", prd_preciovp=" + prd_preciovp+", prd_preciove=" + prd_preciove+", prd_descuento=" + prd_descuento+", prd_unidadv=" + prd_unidadv+", prd_unidadcantv=" + prd_unidadcantv+", prd_total=" + prd_total+", prd_iva=" + prd_iva+", prd_lote=" + prd_lote+"}";

	}
	public Integer getPrd_nro(){
		return prd_nro;
	}
	public void setPrd_nro(Integer prd_nro){
		this.prd_nro = prd_nro;
	}
	public String getPrd_codprod(){
		return prd_codprod;
	}
	public void setPrd_codprod(String prd_codprod){
		this.prd_codprod = prd_codprod;
	}
	public Double getPrd_cantidad(){
		return prd_cantidad;
	}
	public void setPrd_cantidad(Double prd_cantidad){
		this.prd_cantidad = prd_cantidad;
	}
	public Integer getPrd_unprod(){
		return prd_unprod;
	}
	public void setPrd_unprod(Integer prd_unprod){
		this.prd_unprod = prd_unprod;
	}
	public Double getPrd_preciov(){
		return prd_preciov;
	}
	public void setPrd_preciov(Double prd_preciov){
		this.prd_preciov = prd_preciov;
	}
	public Double getPrd_preciovd(){
		return prd_preciovd;
	}
	public void setPrd_preciovd(Double prd_preciovd){
		this.prd_preciovd = prd_preciovd;
	}
	public Double getPrd_preciovr(){
		return prd_preciovr;
	}
	public void setPrd_preciovr(Double prd_preciovr){
		this.prd_preciovr = prd_preciovr;
	}
	public Double getPrd_preciovp(){
		return prd_preciovp;
	}
	public void setPrd_preciovp(Double prd_preciovp){
		this.prd_preciovp = prd_preciovp;
	}
	public Double getPrd_preciove(){
		return prd_preciove;
	}
	public void setPrd_preciove(Double prd_preciove){
		this.prd_preciove = prd_preciove;
	}
	public Double getPrd_descuento(){
		return prd_descuento;
	}
	public void setPrd_descuento(Double prd_descuento){
		this.prd_descuento = prd_descuento;
	}
	public Integer getPrd_unidadv(){
		return prd_unidadv;
	}
	public void setPrd_unidadv(Integer prd_unidadv){
		this.prd_unidadv = prd_unidadv;
	}
	public String getPrd_unidadcantv(){
		return prd_unidadcantv;
	}
	public void setPrd_unidadcantv(String prd_unidadcantv){
		this.prd_unidadcantv = prd_unidadcantv;
	}
	public Double getPrd_total(){
		return prd_total;
	}
	public void setPrd_total(Double prd_total){
		this.prd_total = prd_total;
	}
	public Integer getPrd_iva(){
		return prd_iva;
	}
	public void setPrd_iva(Integer prd_iva){
		this.prd_iva = prd_iva;
	}
	public String getPrd_lote(){
		return prd_lote;
	}
	public void setPrd_lote(String prd_lote){
		this.prd_lote = prd_lote;
	}

}