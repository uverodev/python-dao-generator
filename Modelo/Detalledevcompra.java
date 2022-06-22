package modelo;

public class Detalledevcompra{
	Integer dcd_codigo;
	Object dcd_codprod;
	Double dcd_cantidad;
	Object dcd_lote;
	Integer dcd_borrado;
	Integer dcd_numerocabecera;

	public Detalledevcompra(Integer dcd_codigo, Object dcd_codprod, Double dcd_cantidad, Object dcd_lote, Integer dcd_borrado, Integer dcd_numerocabecera){
		this.dcd_codigo = dcd_codigo;
		this.dcd_codprod = dcd_codprod;
		this.dcd_cantidad = dcd_cantidad;
		this.dcd_lote = dcd_lote;
		this.dcd_borrado = dcd_borrado;
		this.dcd_numerocabecera = dcd_numerocabecera;
	}
	public Detalledevcompra(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalledevcompra{"+", dcd_codigo=" + dcd_codigo+", dcd_codprod=" + dcd_codprod+", dcd_cantidad=" + dcd_cantidad+", dcd_lote=" + dcd_lote+", dcd_borrado=" + dcd_borrado+", dcd_numerocabecera=" + dcd_numerocabecera+"}";

	}
	public Integer getDcd_codigo(){
		return dcd_codigo;
	}
	public void setDcd_codigo(Integer dcd_codigo){
		this.dcd_codigo = dcd_codigo;
	}
	public Object getDcd_codprod(){
		return dcd_codprod;
	}
	public void setDcd_codprod(Object dcd_codprod){
		this.dcd_codprod = dcd_codprod;
	}
	public Double getDcd_cantidad(){
		return dcd_cantidad;
	}
	public void setDcd_cantidad(Double dcd_cantidad){
		this.dcd_cantidad = dcd_cantidad;
	}
	public Object getDcd_lote(){
		return dcd_lote;
	}
	public void setDcd_lote(Object dcd_lote){
		this.dcd_lote = dcd_lote;
	}
	public Integer getDcd_borrado(){
		return dcd_borrado;
	}
	public void setDcd_borrado(Integer dcd_borrado){
		this.dcd_borrado = dcd_borrado;
	}
	public Integer getDcd_numerocabecera(){
		return dcd_numerocabecera;
	}
	public void setDcd_numerocabecera(Integer dcd_numerocabecera){
		this.dcd_numerocabecera = dcd_numerocabecera;
	}

}