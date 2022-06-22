package modelo;

public class Depositob{
	Integer dep_nro;
	String dep_nrocomprovante;
	Integer dep_moneda;
	String dep_numcuenta;
	Integer dep_banco;
	String dep_fecha;
	String dep_fechacarga;
	String dep_encargado;
	Double dep_monto;
	Integer dep_borrado;
	Double dep_montocheque;
	Double dep_montoefectivo;

	public Depositob(Integer dep_nro, String dep_nrocomprovante, Integer dep_moneda, String dep_numcuenta, Integer dep_banco, String dep_fecha, String dep_fechacarga, String dep_encargado, Double dep_monto, Integer dep_borrado, Double dep_montocheque, Double dep_montoefectivo){
		this.dep_nro = dep_nro;
		this.dep_nrocomprovante = dep_nrocomprovante;
		this.dep_moneda = dep_moneda;
		this.dep_numcuenta = dep_numcuenta;
		this.dep_banco = dep_banco;
		this.dep_fecha = dep_fecha;
		this.dep_fechacarga = dep_fechacarga;
		this.dep_encargado = dep_encargado;
		this.dep_monto = dep_monto;
		this.dep_borrado = dep_borrado;
		this.dep_montocheque = dep_montocheque;
		this.dep_montoefectivo = dep_montoefectivo;
	}
	public Depositob(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Depositob{"+", dep_nro=" + dep_nro+", dep_nrocomprovante=" + dep_nrocomprovante+", dep_moneda=" + dep_moneda+", dep_numcuenta=" + dep_numcuenta+", dep_banco=" + dep_banco+", dep_fecha=" + dep_fecha+", dep_fechacarga=" + dep_fechacarga+", dep_encargado=" + dep_encargado+", dep_monto=" + dep_monto+", dep_borrado=" + dep_borrado+", dep_montocheque=" + dep_montocheque+", dep_montoefectivo=" + dep_montoefectivo+"}";

	}
	public Integer getDep_nro(){
		return dep_nro;
	}
	public void setDep_nro(Integer dep_nro){
		this.dep_nro = dep_nro;
	}
	public String getDep_nrocomprovante(){
		return dep_nrocomprovante;
	}
	public void setDep_nrocomprovante(String dep_nrocomprovante){
		this.dep_nrocomprovante = dep_nrocomprovante;
	}
	public Integer getDep_moneda(){
		return dep_moneda;
	}
	public void setDep_moneda(Integer dep_moneda){
		this.dep_moneda = dep_moneda;
	}
	public String getDep_numcuenta(){
		return dep_numcuenta;
	}
	public void setDep_numcuenta(String dep_numcuenta){
		this.dep_numcuenta = dep_numcuenta;
	}
	public Integer getDep_banco(){
		return dep_banco;
	}
	public void setDep_banco(Integer dep_banco){
		this.dep_banco = dep_banco;
	}
	public String getDep_fecha(){
		return dep_fecha;
	}
	public void setDep_fecha(String dep_fecha){
		this.dep_fecha = dep_fecha;
	}
	public String getDep_fechacarga(){
		return dep_fechacarga;
	}
	public void setDep_fechacarga(String dep_fechacarga){
		this.dep_fechacarga = dep_fechacarga;
	}
	public String getDep_encargado(){
		return dep_encargado;
	}
	public void setDep_encargado(String dep_encargado){
		this.dep_encargado = dep_encargado;
	}
	public Double getDep_monto(){
		return dep_monto;
	}
	public void setDep_monto(Double dep_monto){
		this.dep_monto = dep_monto;
	}
	public Integer getDep_borrado(){
		return dep_borrado;
	}
	public void setDep_borrado(Integer dep_borrado){
		this.dep_borrado = dep_borrado;
	}
	public Double getDep_montocheque(){
		return dep_montocheque;
	}
	public void setDep_montocheque(Double dep_montocheque){
		this.dep_montocheque = dep_montocheque;
	}
	public Double getDep_montoefectivo(){
		return dep_montoefectivo;
	}
	public void setDep_montoefectivo(Double dep_montoefectivo){
		this.dep_montoefectivo = dep_montoefectivo;
	}

}