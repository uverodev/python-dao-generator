package modelo;

public class Chequeemi{
	Integer che_nro;
	Integer che_tipo;
	Integer che_usuario;
	Integer che_tipoplazo;
	Integer che_banco;
	String che_fecha;
	String che_titular;
	Integer che_numcomp;
	String che_numcheque;
	Integer che_moneda;
	Double che_monto;
	String che_numcuen;
	Double che_giro;
	Integer che_proveedor;
	Integer che_borrado;
	String che_fechaplazo;
	String che_observacion;
	Integer che_estado;
	String che_afavor;
	Integer che_deposito;

	public Chequeemi(Integer che_nro, Integer che_tipo, Integer che_usuario, Integer che_tipoplazo, Integer che_banco, String che_fecha, String che_titular, Integer che_numcomp, String che_numcheque, Integer che_moneda, Double che_monto, String che_numcuen, Double che_giro, Integer che_proveedor, Integer che_borrado, String che_fechaplazo, String che_observacion, Integer che_estado, String che_afavor, Integer che_deposito){
		this.che_nro = che_nro;
		this.che_tipo = che_tipo;
		this.che_usuario = che_usuario;
		this.che_tipoplazo = che_tipoplazo;
		this.che_banco = che_banco;
		this.che_fecha = che_fecha;
		this.che_titular = che_titular;
		this.che_numcomp = che_numcomp;
		this.che_numcheque = che_numcheque;
		this.che_moneda = che_moneda;
		this.che_monto = che_monto;
		this.che_numcuen = che_numcuen;
		this.che_giro = che_giro;
		this.che_proveedor = che_proveedor;
		this.che_borrado = che_borrado;
		this.che_fechaplazo = che_fechaplazo;
		this.che_observacion = che_observacion;
		this.che_estado = che_estado;
		this.che_afavor = che_afavor;
		this.che_deposito = che_deposito;
	}
	public Chequeemi(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Chequeemi{"+", che_nro=" + che_nro+", che_tipo=" + che_tipo+", che_usuario=" + che_usuario+", che_tipoplazo=" + che_tipoplazo+", che_banco=" + che_banco+", che_fecha=" + che_fecha+", che_titular=" + che_titular+", che_numcomp=" + che_numcomp+", che_numcheque=" + che_numcheque+", che_moneda=" + che_moneda+", che_monto=" + che_monto+", che_numcuen=" + che_numcuen+", che_giro=" + che_giro+", che_proveedor=" + che_proveedor+", che_borrado=" + che_borrado+", che_fechaplazo=" + che_fechaplazo+", che_observacion=" + che_observacion+", che_estado=" + che_estado+", che_afavor=" + che_afavor+", che_deposito=" + che_deposito+"}";

	}
	public Integer getChe_nro(){
		return che_nro;
	}
	public void setChe_nro(Integer che_nro){
		this.che_nro = che_nro;
	}
	public Integer getChe_tipo(){
		return che_tipo;
	}
	public void setChe_tipo(Integer che_tipo){
		this.che_tipo = che_tipo;
	}
	public Integer getChe_usuario(){
		return che_usuario;
	}
	public void setChe_usuario(Integer che_usuario){
		this.che_usuario = che_usuario;
	}
	public Integer getChe_tipoplazo(){
		return che_tipoplazo;
	}
	public void setChe_tipoplazo(Integer che_tipoplazo){
		this.che_tipoplazo = che_tipoplazo;
	}
	public Integer getChe_banco(){
		return che_banco;
	}
	public void setChe_banco(Integer che_banco){
		this.che_banco = che_banco;
	}
	public String getChe_fecha(){
		return che_fecha;
	}
	public void setChe_fecha(String che_fecha){
		this.che_fecha = che_fecha;
	}
	public String getChe_titular(){
		return che_titular;
	}
	public void setChe_titular(String che_titular){
		this.che_titular = che_titular;
	}
	public Integer getChe_numcomp(){
		return che_numcomp;
	}
	public void setChe_numcomp(Integer che_numcomp){
		this.che_numcomp = che_numcomp;
	}
	public String getChe_numcheque(){
		return che_numcheque;
	}
	public void setChe_numcheque(String che_numcheque){
		this.che_numcheque = che_numcheque;
	}
	public Integer getChe_moneda(){
		return che_moneda;
	}
	public void setChe_moneda(Integer che_moneda){
		this.che_moneda = che_moneda;
	}
	public Double getChe_monto(){
		return che_monto;
	}
	public void setChe_monto(Double che_monto){
		this.che_monto = che_monto;
	}
	public String getChe_numcuen(){
		return che_numcuen;
	}
	public void setChe_numcuen(String che_numcuen){
		this.che_numcuen = che_numcuen;
	}
	public Double getChe_giro(){
		return che_giro;
	}
	public void setChe_giro(Double che_giro){
		this.che_giro = che_giro;
	}
	public Integer getChe_proveedor(){
		return che_proveedor;
	}
	public void setChe_proveedor(Integer che_proveedor){
		this.che_proveedor = che_proveedor;
	}
	public Integer getChe_borrado(){
		return che_borrado;
	}
	public void setChe_borrado(Integer che_borrado){
		this.che_borrado = che_borrado;
	}
	public String getChe_fechaplazo(){
		return che_fechaplazo;
	}
	public void setChe_fechaplazo(String che_fechaplazo){
		this.che_fechaplazo = che_fechaplazo;
	}
	public String getChe_observacion(){
		return che_observacion;
	}
	public void setChe_observacion(String che_observacion){
		this.che_observacion = che_observacion;
	}
	public Integer getChe_estado(){
		return che_estado;
	}
	public void setChe_estado(Integer che_estado){
		this.che_estado = che_estado;
	}
	public String getChe_afavor(){
		return che_afavor;
	}
	public void setChe_afavor(String che_afavor){
		this.che_afavor = che_afavor;
	}
	public Integer getChe_deposito(){
		return che_deposito;
	}
	public void setChe_deposito(Integer che_deposito){
		this.che_deposito = che_deposito;
	}

}