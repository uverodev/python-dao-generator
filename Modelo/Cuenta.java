package modelo;

public class Cuenta{
	Integer cuen_nro;
	String cuen_descripcion;
	String cuen_numcuenta;
	Integer cuen_banco;
	Double cuen_sobregiro;
	Double cuen_sobregirod;
	Double cuen_sobregiror;
	Double cuen_sobregirop;
	Double cuen_sobregiroe;
	Double cuen_fondo;
	Double cuen_fondod;
	Double cuen_fondor;
	Double cuen_fondop;
	Double cuen_fondoe;
	Integer cuen_borrado;
	String cuen_titular;
	Integer cuen_cuentatargetas;

	public Cuenta(Integer cuen_nro, String cuen_descripcion, String cuen_numcuenta, Integer cuen_banco, Double cuen_sobregiro, Double cuen_sobregirod, Double cuen_sobregiror, Double cuen_sobregirop, Double cuen_sobregiroe, Double cuen_fondo, Double cuen_fondod, Double cuen_fondor, Double cuen_fondop, Double cuen_fondoe, Integer cuen_borrado, String cuen_titular, Integer cuen_cuentatargetas){
		this.cuen_nro = cuen_nro;
		this.cuen_descripcion = cuen_descripcion;
		this.cuen_numcuenta = cuen_numcuenta;
		this.cuen_banco = cuen_banco;
		this.cuen_sobregiro = cuen_sobregiro;
		this.cuen_sobregirod = cuen_sobregirod;
		this.cuen_sobregiror = cuen_sobregiror;
		this.cuen_sobregirop = cuen_sobregirop;
		this.cuen_sobregiroe = cuen_sobregiroe;
		this.cuen_fondo = cuen_fondo;
		this.cuen_fondod = cuen_fondod;
		this.cuen_fondor = cuen_fondor;
		this.cuen_fondop = cuen_fondop;
		this.cuen_fondoe = cuen_fondoe;
		this.cuen_borrado = cuen_borrado;
		this.cuen_titular = cuen_titular;
		this.cuen_cuentatargetas = cuen_cuentatargetas;
	}
	public Cuenta(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cuenta{"+", cuen_nro=" + cuen_nro+", cuen_descripcion=" + cuen_descripcion+", cuen_numcuenta=" + cuen_numcuenta+", cuen_banco=" + cuen_banco+", cuen_sobregiro=" + cuen_sobregiro+", cuen_sobregirod=" + cuen_sobregirod+", cuen_sobregiror=" + cuen_sobregiror+", cuen_sobregirop=" + cuen_sobregirop+", cuen_sobregiroe=" + cuen_sobregiroe+", cuen_fondo=" + cuen_fondo+", cuen_fondod=" + cuen_fondod+", cuen_fondor=" + cuen_fondor+", cuen_fondop=" + cuen_fondop+", cuen_fondoe=" + cuen_fondoe+", cuen_borrado=" + cuen_borrado+", cuen_titular=" + cuen_titular+", cuen_cuentatargetas=" + cuen_cuentatargetas+"}";

	}
	public Integer getCuen_nro(){
		return cuen_nro;
	}
	public void setCuen_nro(Integer cuen_nro){
		this.cuen_nro = cuen_nro;
	}
	public String getCuen_descripcion(){
		return cuen_descripcion;
	}
	public void setCuen_descripcion(String cuen_descripcion){
		this.cuen_descripcion = cuen_descripcion;
	}
	public String getCuen_numcuenta(){
		return cuen_numcuenta;
	}
	public void setCuen_numcuenta(String cuen_numcuenta){
		this.cuen_numcuenta = cuen_numcuenta;
	}
	public Integer getCuen_banco(){
		return cuen_banco;
	}
	public void setCuen_banco(Integer cuen_banco){
		this.cuen_banco = cuen_banco;
	}
	public Double getCuen_sobregiro(){
		return cuen_sobregiro;
	}
	public void setCuen_sobregiro(Double cuen_sobregiro){
		this.cuen_sobregiro = cuen_sobregiro;
	}
	public Double getCuen_sobregirod(){
		return cuen_sobregirod;
	}
	public void setCuen_sobregirod(Double cuen_sobregirod){
		this.cuen_sobregirod = cuen_sobregirod;
	}
	public Double getCuen_sobregiror(){
		return cuen_sobregiror;
	}
	public void setCuen_sobregiror(Double cuen_sobregiror){
		this.cuen_sobregiror = cuen_sobregiror;
	}
	public Double getCuen_sobregirop(){
		return cuen_sobregirop;
	}
	public void setCuen_sobregirop(Double cuen_sobregirop){
		this.cuen_sobregirop = cuen_sobregirop;
	}
	public Double getCuen_sobregiroe(){
		return cuen_sobregiroe;
	}
	public void setCuen_sobregiroe(Double cuen_sobregiroe){
		this.cuen_sobregiroe = cuen_sobregiroe;
	}
	public Double getCuen_fondo(){
		return cuen_fondo;
	}
	public void setCuen_fondo(Double cuen_fondo){
		this.cuen_fondo = cuen_fondo;
	}
	public Double getCuen_fondod(){
		return cuen_fondod;
	}
	public void setCuen_fondod(Double cuen_fondod){
		this.cuen_fondod = cuen_fondod;
	}
	public Double getCuen_fondor(){
		return cuen_fondor;
	}
	public void setCuen_fondor(Double cuen_fondor){
		this.cuen_fondor = cuen_fondor;
	}
	public Double getCuen_fondop(){
		return cuen_fondop;
	}
	public void setCuen_fondop(Double cuen_fondop){
		this.cuen_fondop = cuen_fondop;
	}
	public Double getCuen_fondoe(){
		return cuen_fondoe;
	}
	public void setCuen_fondoe(Double cuen_fondoe){
		this.cuen_fondoe = cuen_fondoe;
	}
	public Integer getCuen_borrado(){
		return cuen_borrado;
	}
	public void setCuen_borrado(Integer cuen_borrado){
		this.cuen_borrado = cuen_borrado;
	}
	public String getCuen_titular(){
		return cuen_titular;
	}
	public void setCuen_titular(String cuen_titular){
		this.cuen_titular = cuen_titular;
	}
	public Integer getCuen_cuentatargetas(){
		return cuen_cuentatargetas;
	}
	public void setCuen_cuentatargetas(Integer cuen_cuentatargetas){
		this.cuen_cuentatargetas = cuen_cuentatargetas;
	}

}