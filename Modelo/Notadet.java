package modelo;

public class Notadet{
	Integer nd_nro;
	Integer nd_nronota;
	String nd_codprod;
	Double nd_cantanterior;
	Double nd_cantactual;
	Double nd_cantdevuelto;
	String nd_lote;
	Double nd_precio;
	Integer nd_cierre;
	Integer nd_nrocierre;

	public Notadet(Integer nd_nro, Integer nd_nronota, String nd_codprod, Double nd_cantanterior, Double nd_cantactual, Double nd_cantdevuelto, String nd_lote, Double nd_precio, Integer nd_cierre, Integer nd_nrocierre){
		this.nd_nro = nd_nro;
		this.nd_nronota = nd_nronota;
		this.nd_codprod = nd_codprod;
		this.nd_cantanterior = nd_cantanterior;
		this.nd_cantactual = nd_cantactual;
		this.nd_cantdevuelto = nd_cantdevuelto;
		this.nd_lote = nd_lote;
		this.nd_precio = nd_precio;
		this.nd_cierre = nd_cierre;
		this.nd_nrocierre = nd_nrocierre;
	}
	public Notadet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Notadet{"+", nd_nro=" + nd_nro+", nd_nronota=" + nd_nronota+", nd_codprod=" + nd_codprod+", nd_cantanterior=" + nd_cantanterior+", nd_cantactual=" + nd_cantactual+", nd_cantdevuelto=" + nd_cantdevuelto+", nd_lote=" + nd_lote+", nd_precio=" + nd_precio+", nd_cierre=" + nd_cierre+", nd_nrocierre=" + nd_nrocierre+"}";

	}
	public Integer getNd_nro(){
		return nd_nro;
	}
	public void setNd_nro(Integer nd_nro){
		this.nd_nro = nd_nro;
	}
	public Integer getNd_nronota(){
		return nd_nronota;
	}
	public void setNd_nronota(Integer nd_nronota){
		this.nd_nronota = nd_nronota;
	}
	public String getNd_codprod(){
		return nd_codprod;
	}
	public void setNd_codprod(String nd_codprod){
		this.nd_codprod = nd_codprod;
	}
	public Double getNd_cantanterior(){
		return nd_cantanterior;
	}
	public void setNd_cantanterior(Double nd_cantanterior){
		this.nd_cantanterior = nd_cantanterior;
	}
	public Double getNd_cantactual(){
		return nd_cantactual;
	}
	public void setNd_cantactual(Double nd_cantactual){
		this.nd_cantactual = nd_cantactual;
	}
	public Double getNd_cantdevuelto(){
		return nd_cantdevuelto;
	}
	public void setNd_cantdevuelto(Double nd_cantdevuelto){
		this.nd_cantdevuelto = nd_cantdevuelto;
	}
	public String getNd_lote(){
		return nd_lote;
	}
	public void setNd_lote(String nd_lote){
		this.nd_lote = nd_lote;
	}
	public Double getNd_precio(){
		return nd_precio;
	}
	public void setNd_precio(Double nd_precio){
		this.nd_precio = nd_precio;
	}
	public Integer getNd_cierre(){
		return nd_cierre;
	}
	public void setNd_cierre(Integer nd_cierre){
		this.nd_cierre = nd_cierre;
	}
	public Integer getNd_nrocierre(){
		return nd_nrocierre;
	}
	public void setNd_nrocierre(Integer nd_nrocierre){
		this.nd_nrocierre = nd_nrocierre;
	}

}