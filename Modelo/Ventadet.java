package modelo;

public class Ventadet{
	Integer det_nro;
	String det_codprod;
	Double det_cantidad;
	Integer det_unprod;
	Double det_preciov;
	Double det_preciov1;
	Double det_preciovd;
	Double det_preciovr;
	Double det_preciovp;
	Double det_preciove;
	Double det_descuento;
	Integer det_unidadv;
	String det_unidadcantv;
	Double det_total;
	Double det_iva;
	String det_lote;
	Integer det_devuelto;
	Double det_cantdevuelto;
	Integer det_borrado;
	String det_fecha;
	Integer det_deposito;
	String det_area;
	Double det_preciocompra;
	Integer det_id;
	String det_vencimiento;

	public Ventadet(Integer det_nro, String det_codprod, Double det_cantidad, Integer det_unprod, Double det_preciov, Double det_preciov1, Double det_preciovd, Double det_preciovr, Double det_preciovp, Double det_preciove, Double det_descuento, Integer det_unidadv, String det_unidadcantv, Double det_total, Double det_iva, String det_lote, Integer det_devuelto, Double det_cantdevuelto, Integer det_borrado, String det_fecha, Integer det_deposito, String det_area, Double det_preciocompra, Integer det_id, String det_vencimiento){
		this.det_nro = det_nro;
		this.det_codprod = det_codprod;
		this.det_cantidad = det_cantidad;
		this.det_unprod = det_unprod;
		this.det_preciov = det_preciov;
		this.det_preciov1 = det_preciov1;
		this.det_preciovd = det_preciovd;
		this.det_preciovr = det_preciovr;
		this.det_preciovp = det_preciovp;
		this.det_preciove = det_preciove;
		this.det_descuento = det_descuento;
		this.det_unidadv = det_unidadv;
		this.det_unidadcantv = det_unidadcantv;
		this.det_total = det_total;
		this.det_iva = det_iva;
		this.det_lote = det_lote;
		this.det_devuelto = det_devuelto;
		this.det_cantdevuelto = det_cantdevuelto;
		this.det_borrado = det_borrado;
		this.det_fecha = det_fecha;
		this.det_deposito = det_deposito;
		this.det_area = det_area;
		this.det_preciocompra = det_preciocompra;
		this.det_id = det_id;
		this.det_vencimiento = det_vencimiento;
	}
	public Ventadet(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventadet{"+", det_nro=" + det_nro+", det_codprod=" + det_codprod+", det_cantidad=" + det_cantidad+", det_unprod=" + det_unprod+", det_preciov=" + det_preciov+", det_preciov1=" + det_preciov1+", det_preciovd=" + det_preciovd+", det_preciovr=" + det_preciovr+", det_preciovp=" + det_preciovp+", det_preciove=" + det_preciove+", det_descuento=" + det_descuento+", det_unidadv=" + det_unidadv+", det_unidadcantv=" + det_unidadcantv+", det_total=" + det_total+", det_iva=" + det_iva+", det_lote=" + det_lote+", det_devuelto=" + det_devuelto+", det_cantdevuelto=" + det_cantdevuelto+", det_borrado=" + det_borrado+", det_fecha=" + det_fecha+", det_deposito=" + det_deposito+", det_area=" + det_area+", det_preciocompra=" + det_preciocompra+", det_id=" + det_id+", det_vencimiento=" + det_vencimiento+"}";

	}
	public Integer getDet_nro(){
		return det_nro;
	}
	public void setDet_nro(Integer det_nro){
		this.det_nro = det_nro;
	}
	public String getDet_codprod(){
		return det_codprod;
	}
	public void setDet_codprod(String det_codprod){
		this.det_codprod = det_codprod;
	}
	public Double getDet_cantidad(){
		return det_cantidad;
	}
	public void setDet_cantidad(Double det_cantidad){
		this.det_cantidad = det_cantidad;
	}
	public Integer getDet_unprod(){
		return det_unprod;
	}
	public void setDet_unprod(Integer det_unprod){
		this.det_unprod = det_unprod;
	}
	public Double getDet_preciov(){
		return det_preciov;
	}
	public void setDet_preciov(Double det_preciov){
		this.det_preciov = det_preciov;
	}
	public Double getDet_preciov1(){
		return det_preciov1;
	}
	public void setDet_preciov1(Double det_preciov1){
		this.det_preciov1 = det_preciov1;
	}
	public Double getDet_preciovd(){
		return det_preciovd;
	}
	public void setDet_preciovd(Double det_preciovd){
		this.det_preciovd = det_preciovd;
	}
	public Double getDet_preciovr(){
		return det_preciovr;
	}
	public void setDet_preciovr(Double det_preciovr){
		this.det_preciovr = det_preciovr;
	}
	public Double getDet_preciovp(){
		return det_preciovp;
	}
	public void setDet_preciovp(Double det_preciovp){
		this.det_preciovp = det_preciovp;
	}
	public Double getDet_preciove(){
		return det_preciove;
	}
	public void setDet_preciove(Double det_preciove){
		this.det_preciove = det_preciove;
	}
	public Double getDet_descuento(){
		return det_descuento;
	}
	public void setDet_descuento(Double det_descuento){
		this.det_descuento = det_descuento;
	}
	public Integer getDet_unidadv(){
		return det_unidadv;
	}
	public void setDet_unidadv(Integer det_unidadv){
		this.det_unidadv = det_unidadv;
	}
	public String getDet_unidadcantv(){
		return det_unidadcantv;
	}
	public void setDet_unidadcantv(String det_unidadcantv){
		this.det_unidadcantv = det_unidadcantv;
	}
	public Double getDet_total(){
		return det_total;
	}
	public void setDet_total(Double det_total){
		this.det_total = det_total;
	}
	public Double getDet_iva(){
		return det_iva;
	}
	public void setDet_iva(Double det_iva){
		this.det_iva = det_iva;
	}
	public String getDet_lote(){
		return det_lote;
	}
	public void setDet_lote(String det_lote){
		this.det_lote = det_lote;
	}
	public Integer getDet_devuelto(){
		return det_devuelto;
	}
	public void setDet_devuelto(Integer det_devuelto){
		this.det_devuelto = det_devuelto;
	}
	public Double getDet_cantdevuelto(){
		return det_cantdevuelto;
	}
	public void setDet_cantdevuelto(Double det_cantdevuelto){
		this.det_cantdevuelto = det_cantdevuelto;
	}
	public Integer getDet_borrado(){
		return det_borrado;
	}
	public void setDet_borrado(Integer det_borrado){
		this.det_borrado = det_borrado;
	}
	public String getDet_fecha(){
		return det_fecha;
	}
	public void setDet_fecha(String det_fecha){
		this.det_fecha = det_fecha;
	}
	public Integer getDet_deposito(){
		return det_deposito;
	}
	public void setDet_deposito(Integer det_deposito){
		this.det_deposito = det_deposito;
	}
	public String getDet_area(){
		return det_area;
	}
	public void setDet_area(String det_area){
		this.det_area = det_area;
	}
	public Double getDet_preciocompra(){
		return det_preciocompra;
	}
	public void setDet_preciocompra(Double det_preciocompra){
		this.det_preciocompra = det_preciocompra;
	}
	public Integer getDet_id(){
		return det_id;
	}
	public void setDet_id(Integer det_id){
		this.det_id = det_id;
	}
	public String getDet_vencimiento(){
		return det_vencimiento;
	}
	public void setDet_vencimiento(String det_vencimiento){
		this.det_vencimiento = det_vencimiento;
	}

}