package modelo;

public class Tipo_cant{
	Integer cant_nro;
	String cant_prod;
	Integer cant_codund;
	Double cant_cant;
	Integer cant_codinter;

	public Tipo_cant(Integer cant_nro, String cant_prod, Integer cant_codund, Double cant_cant, Integer cant_codinter){
		this.cant_nro = cant_nro;
		this.cant_prod = cant_prod;
		this.cant_codund = cant_codund;
		this.cant_cant = cant_cant;
		this.cant_codinter = cant_codinter;
	}
	public Tipo_cant(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tipo_cant{"+", cant_nro=" + cant_nro+", cant_prod=" + cant_prod+", cant_codund=" + cant_codund+", cant_cant=" + cant_cant+", cant_codinter=" + cant_codinter+"}";

	}
	public Integer getCant_nro(){
		return cant_nro;
	}
	public void setCant_nro(Integer cant_nro){
		this.cant_nro = cant_nro;
	}
	public String getCant_prod(){
		return cant_prod;
	}
	public void setCant_prod(String cant_prod){
		this.cant_prod = cant_prod;
	}
	public Integer getCant_codund(){
		return cant_codund;
	}
	public void setCant_codund(Integer cant_codund){
		this.cant_codund = cant_codund;
	}
	public Double getCant_cant(){
		return cant_cant;
	}
	public void setCant_cant(Double cant_cant){
		this.cant_cant = cant_cant;
	}
	public Integer getCant_codinter(){
		return cant_codinter;
	}
	public void setCant_codinter(Integer cant_codinter){
		this.cant_codinter = cant_codinter;
	}

}