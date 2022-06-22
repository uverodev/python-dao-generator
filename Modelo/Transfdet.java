package modelo;

public class Transfdet{
	Integer trd_nro;
	String trd_codprod;
	Double trd_cantidad;
	Integer trd_unprod;
	Double trd_preciov;
	Double trd_total;
	Integer trd_iva;
	String trd_lote;
	Integer trd_borrado;
	Integer trd_deposito;
	Integer trd_id;
	Object trd_vencimiento;
	Integer trd_antesderecibir;

	public Transfdet(Integer trd_nro, String trd_codprod, Double trd_cantidad, Integer trd_unprod, Double trd_preciov, Double trd_total, Integer trd_iva, String trd_lote, Integer trd_borrado, Integer trd_deposito, Integer trd_id, Object trd_vencimiento, Integer trd_antesderecibir){
		this.trd_nro = trd_nro;
		this.trd_codprod = trd_codprod;
		this.trd_cantidad = trd_cantidad;
		this.trd_unprod = trd_unprod;
		this.trd_preciov = trd_preciov;
		this.trd_total = trd_total;
		this.trd_iva = trd_iva;
		this.trd_lote = trd_lote;
		this.trd_borrado = trd_borrado;
		this.trd_deposito = trd_deposito;
		this.trd_id = trd_id;
		this.trd_vencimiento = trd_vencimiento;
		this.trd_antesderecibir = trd_antesderecibir;
	}
	public Transfdet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Transfdet{"+", trd_nro=" + trd_nro+", trd_codprod=" + trd_codprod+", trd_cantidad=" + trd_cantidad+", trd_unprod=" + trd_unprod+", trd_preciov=" + trd_preciov+", trd_total=" + trd_total+", trd_iva=" + trd_iva+", trd_lote=" + trd_lote+", trd_borrado=" + trd_borrado+", trd_deposito=" + trd_deposito+", trd_id=" + trd_id+", trd_vencimiento=" + trd_vencimiento+", trd_antesderecibir=" + trd_antesderecibir+"}";

	}
	public Integer getTrd_nro(){
		return trd_nro;
	}
	public void setTrd_nro(Integer trd_nro){
		this.trd_nro = trd_nro;
	}
	public String getTrd_codprod(){
		return trd_codprod;
	}
	public void setTrd_codprod(String trd_codprod){
		this.trd_codprod = trd_codprod;
	}
	public Double getTrd_cantidad(){
		return trd_cantidad;
	}
	public void setTrd_cantidad(Double trd_cantidad){
		this.trd_cantidad = trd_cantidad;
	}
	public Integer getTrd_unprod(){
		return trd_unprod;
	}
	public void setTrd_unprod(Integer trd_unprod){
		this.trd_unprod = trd_unprod;
	}
	public Double getTrd_preciov(){
		return trd_preciov;
	}
	public void setTrd_preciov(Double trd_preciov){
		this.trd_preciov = trd_preciov;
	}
	public Double getTrd_total(){
		return trd_total;
	}
	public void setTrd_total(Double trd_total){
		this.trd_total = trd_total;
	}
	public Integer getTrd_iva(){
		return trd_iva;
	}
	public void setTrd_iva(Integer trd_iva){
		this.trd_iva = trd_iva;
	}
	public String getTrd_lote(){
		return trd_lote;
	}
	public void setTrd_lote(String trd_lote){
		this.trd_lote = trd_lote;
	}
	public Integer getTrd_borrado(){
		return trd_borrado;
	}
	public void setTrd_borrado(Integer trd_borrado){
		this.trd_borrado = trd_borrado;
	}
	public Integer getTrd_deposito(){
		return trd_deposito;
	}
	public void setTrd_deposito(Integer trd_deposito){
		this.trd_deposito = trd_deposito;
	}
	public Integer getTrd_id(){
		return trd_id;
	}
	public void setTrd_id(Integer trd_id){
		this.trd_id = trd_id;
	}
	public Object getTrd_vencimiento(){
		return trd_vencimiento;
	}
	public void setTrd_vencimiento(Object trd_vencimiento){
		this.trd_vencimiento = trd_vencimiento;
	}
	public Integer getTrd_antesderecibir(){
		return trd_antesderecibir;
	}
	public void setTrd_antesderecibir(Integer trd_antesderecibir){
		this.trd_antesderecibir = trd_antesderecibir;
	}

}