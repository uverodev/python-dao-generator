package modelo;

public class Ventadet_temp{
	Integer dett_nro;
	String dett_codprod;
	Double dett_cantidad;
	Integer dett_unprod;
	Double dett_preciov;
	Double dett_preciovd;
	Double dett_preciovr;
	Double dett_preciovp;
	Double dett_preciove;
	Double dett_descuento;
	Integer dett_unidadv;
	String dett_unidadcantv;
	Double dett_total;
	Double dett_iva;
	String dett_lote;
	Integer dett_borrado;
	Double dett_preciov1;
	Integer dett_devuelto;
	Double dett_cantdevuelto;
	String dett_area;
	Integer dett_index;
	String dett_fecha;
	Integer dett_deposito;
	Double dett_preciocompra;
	Integer dett_bonificacion;
	String dett_maquina;

	public Ventadet_temp(Integer dett_nro, String dett_codprod, Double dett_cantidad, Integer dett_unprod, Double dett_preciov, Double dett_preciovd, Double dett_preciovr, Double dett_preciovp, Double dett_preciove, Double dett_descuento, Integer dett_unidadv, String dett_unidadcantv, Double dett_total, Double dett_iva, String dett_lote, Integer dett_borrado, Double dett_preciov1, Integer dett_devuelto, Double dett_cantdevuelto, String dett_area, Integer dett_index, String dett_fecha, Integer dett_deposito, Double dett_preciocompra, Integer dett_bonificacion, String dett_maquina){
		this.dett_nro = dett_nro;
		this.dett_codprod = dett_codprod;
		this.dett_cantidad = dett_cantidad;
		this.dett_unprod = dett_unprod;
		this.dett_preciov = dett_preciov;
		this.dett_preciovd = dett_preciovd;
		this.dett_preciovr = dett_preciovr;
		this.dett_preciovp = dett_preciovp;
		this.dett_preciove = dett_preciove;
		this.dett_descuento = dett_descuento;
		this.dett_unidadv = dett_unidadv;
		this.dett_unidadcantv = dett_unidadcantv;
		this.dett_total = dett_total;
		this.dett_iva = dett_iva;
		this.dett_lote = dett_lote;
		this.dett_borrado = dett_borrado;
		this.dett_preciov1 = dett_preciov1;
		this.dett_devuelto = dett_devuelto;
		this.dett_cantdevuelto = dett_cantdevuelto;
		this.dett_area = dett_area;
		this.dett_index = dett_index;
		this.dett_fecha = dett_fecha;
		this.dett_deposito = dett_deposito;
		this.dett_preciocompra = dett_preciocompra;
		this.dett_bonificacion = dett_bonificacion;
		this.dett_maquina = dett_maquina;
	}
	public Ventadet_temp(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventadet_temp{"+", dett_nro=" + dett_nro+", dett_codprod=" + dett_codprod+", dett_cantidad=" + dett_cantidad+", dett_unprod=" + dett_unprod+", dett_preciov=" + dett_preciov+", dett_preciovd=" + dett_preciovd+", dett_preciovr=" + dett_preciovr+", dett_preciovp=" + dett_preciovp+", dett_preciove=" + dett_preciove+", dett_descuento=" + dett_descuento+", dett_unidadv=" + dett_unidadv+", dett_unidadcantv=" + dett_unidadcantv+", dett_total=" + dett_total+", dett_iva=" + dett_iva+", dett_lote=" + dett_lote+", dett_borrado=" + dett_borrado+", dett_preciov1=" + dett_preciov1+", dett_devuelto=" + dett_devuelto+", dett_cantdevuelto=" + dett_cantdevuelto+", dett_area=" + dett_area+", dett_index=" + dett_index+", dett_fecha=" + dett_fecha+", dett_deposito=" + dett_deposito+", dett_preciocompra=" + dett_preciocompra+", dett_bonificacion=" + dett_bonificacion+", dett_maquina=" + dett_maquina+"}";

	}
	public Integer getDett_nro(){
		return dett_nro;
	}
	public void setDett_nro(Integer dett_nro){
		this.dett_nro = dett_nro;
	}
	public String getDett_codprod(){
		return dett_codprod;
	}
	public void setDett_codprod(String dett_codprod){
		this.dett_codprod = dett_codprod;
	}
	public Double getDett_cantidad(){
		return dett_cantidad;
	}
	public void setDett_cantidad(Double dett_cantidad){
		this.dett_cantidad = dett_cantidad;
	}
	public Integer getDett_unprod(){
		return dett_unprod;
	}
	public void setDett_unprod(Integer dett_unprod){
		this.dett_unprod = dett_unprod;
	}
	public Double getDett_preciov(){
		return dett_preciov;
	}
	public void setDett_preciov(Double dett_preciov){
		this.dett_preciov = dett_preciov;
	}
	public Double getDett_preciovd(){
		return dett_preciovd;
	}
	public void setDett_preciovd(Double dett_preciovd){
		this.dett_preciovd = dett_preciovd;
	}
	public Double getDett_preciovr(){
		return dett_preciovr;
	}
	public void setDett_preciovr(Double dett_preciovr){
		this.dett_preciovr = dett_preciovr;
	}
	public Double getDett_preciovp(){
		return dett_preciovp;
	}
	public void setDett_preciovp(Double dett_preciovp){
		this.dett_preciovp = dett_preciovp;
	}
	public Double getDett_preciove(){
		return dett_preciove;
	}
	public void setDett_preciove(Double dett_preciove){
		this.dett_preciove = dett_preciove;
	}
	public Double getDett_descuento(){
		return dett_descuento;
	}
	public void setDett_descuento(Double dett_descuento){
		this.dett_descuento = dett_descuento;
	}
	public Integer getDett_unidadv(){
		return dett_unidadv;
	}
	public void setDett_unidadv(Integer dett_unidadv){
		this.dett_unidadv = dett_unidadv;
	}
	public String getDett_unidadcantv(){
		return dett_unidadcantv;
	}
	public void setDett_unidadcantv(String dett_unidadcantv){
		this.dett_unidadcantv = dett_unidadcantv;
	}
	public Double getDett_total(){
		return dett_total;
	}
	public void setDett_total(Double dett_total){
		this.dett_total = dett_total;
	}
	public Double getDett_iva(){
		return dett_iva;
	}
	public void setDett_iva(Double dett_iva){
		this.dett_iva = dett_iva;
	}
	public String getDett_lote(){
		return dett_lote;
	}
	public void setDett_lote(String dett_lote){
		this.dett_lote = dett_lote;
	}
	public Integer getDett_borrado(){
		return dett_borrado;
	}
	public void setDett_borrado(Integer dett_borrado){
		this.dett_borrado = dett_borrado;
	}
	public Double getDett_preciov1(){
		return dett_preciov1;
	}
	public void setDett_preciov1(Double dett_preciov1){
		this.dett_preciov1 = dett_preciov1;
	}
	public Integer getDett_devuelto(){
		return dett_devuelto;
	}
	public void setDett_devuelto(Integer dett_devuelto){
		this.dett_devuelto = dett_devuelto;
	}
	public Double getDett_cantdevuelto(){
		return dett_cantdevuelto;
	}
	public void setDett_cantdevuelto(Double dett_cantdevuelto){
		this.dett_cantdevuelto = dett_cantdevuelto;
	}
	public String getDett_area(){
		return dett_area;
	}
	public void setDett_area(String dett_area){
		this.dett_area = dett_area;
	}
	public Integer getDett_index(){
		return dett_index;
	}
	public void setDett_index(Integer dett_index){
		this.dett_index = dett_index;
	}
	public String getDett_fecha(){
		return dett_fecha;
	}
	public void setDett_fecha(String dett_fecha){
		this.dett_fecha = dett_fecha;
	}
	public Integer getDett_deposito(){
		return dett_deposito;
	}
	public void setDett_deposito(Integer dett_deposito){
		this.dett_deposito = dett_deposito;
	}
	public Double getDett_preciocompra(){
		return dett_preciocompra;
	}
	public void setDett_preciocompra(Double dett_preciocompra){
		this.dett_preciocompra = dett_preciocompra;
	}
	public Integer getDett_bonificacion(){
		return dett_bonificacion;
	}
	public void setDett_bonificacion(Integer dett_bonificacion){
		this.dett_bonificacion = dett_bonificacion;
	}
	public String getDett_maquina(){
		return dett_maquina;
	}
	public void setDett_maquina(String dett_maquina){
		this.dett_maquina = dett_maquina;
	}

}