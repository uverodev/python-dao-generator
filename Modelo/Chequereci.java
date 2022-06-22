package modelo;

public class Chequereci{
	Integer che_nro;
	Integer che_tipo;
	Integer che_usuario;
	Integer che_tipoplazo;
	Integer che_banco;
	String che_numcheque;
	Integer che_numventa;
	String che_titular;
	String che_fecha;
	Double che_monto;
	Integer che_moneda;
	String che_cliente;
	String che_fechaplazo;
	Integer che_borrado;
	Integer che_cierre;
	String che_entrego;
	String che_observacion;
	Integer che_estado;
	Integer che_deposito;
	Integer che_nrocierre;
	Integer che_cierrecajagennro;

	public Chequereci(Integer che_nro, Integer che_tipo, Integer che_usuario, Integer che_tipoplazo, Integer che_banco, String che_numcheque, Integer che_numventa, String che_titular, String che_fecha, Double che_monto, Integer che_moneda, String che_cliente, String che_fechaplazo, Integer che_borrado, Integer che_cierre, String che_entrego, String che_observacion, Integer che_estado, Integer che_deposito, Integer che_nrocierre, Integer che_cierrecajagennro){
		this.che_nro = che_nro;
		this.che_tipo = che_tipo;
		this.che_usuario = che_usuario;
		this.che_tipoplazo = che_tipoplazo;
		this.che_banco = che_banco;
		this.che_numcheque = che_numcheque;
		this.che_numventa = che_numventa;
		this.che_titular = che_titular;
		this.che_fecha = che_fecha;
		this.che_monto = che_monto;
		this.che_moneda = che_moneda;
		this.che_cliente = che_cliente;
		this.che_fechaplazo = che_fechaplazo;
		this.che_borrado = che_borrado;
		this.che_cierre = che_cierre;
		this.che_entrego = che_entrego;
		this.che_observacion = che_observacion;
		this.che_estado = che_estado;
		this.che_deposito = che_deposito;
		this.che_nrocierre = che_nrocierre;
		this.che_cierrecajagennro = che_cierrecajagennro;
	}
	public Chequereci(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Chequereci{"+", che_nro=" + che_nro+", che_tipo=" + che_tipo+", che_usuario=" + che_usuario+", che_tipoplazo=" + che_tipoplazo+", che_banco=" + che_banco+", che_numcheque=" + che_numcheque+", che_numventa=" + che_numventa+", che_titular=" + che_titular+", che_fecha=" + che_fecha+", che_monto=" + che_monto+", che_moneda=" + che_moneda+", che_cliente=" + che_cliente+", che_fechaplazo=" + che_fechaplazo+", che_borrado=" + che_borrado+", che_cierre=" + che_cierre+", che_entrego=" + che_entrego+", che_observacion=" + che_observacion+", che_estado=" + che_estado+", che_deposito=" + che_deposito+", che_nrocierre=" + che_nrocierre+", che_cierrecajagennro=" + che_cierrecajagennro+"}";

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
	public String getChe_numcheque(){
		return che_numcheque;
	}
	public void setChe_numcheque(String che_numcheque){
		this.che_numcheque = che_numcheque;
	}
	public Integer getChe_numventa(){
		return che_numventa;
	}
	public void setChe_numventa(Integer che_numventa){
		this.che_numventa = che_numventa;
	}
	public String getChe_titular(){
		return che_titular;
	}
	public void setChe_titular(String che_titular){
		this.che_titular = che_titular;
	}
	public String getChe_fecha(){
		return che_fecha;
	}
	public void setChe_fecha(String che_fecha){
		this.che_fecha = che_fecha;
	}
	public Double getChe_monto(){
		return che_monto;
	}
	public void setChe_monto(Double che_monto){
		this.che_monto = che_monto;
	}
	public Integer getChe_moneda(){
		return che_moneda;
	}
	public void setChe_moneda(Integer che_moneda){
		this.che_moneda = che_moneda;
	}
	public String getChe_cliente(){
		return che_cliente;
	}
	public void setChe_cliente(String che_cliente){
		this.che_cliente = che_cliente;
	}
	public String getChe_fechaplazo(){
		return che_fechaplazo;
	}
	public void setChe_fechaplazo(String che_fechaplazo){
		this.che_fechaplazo = che_fechaplazo;
	}
	public Integer getChe_borrado(){
		return che_borrado;
	}
	public void setChe_borrado(Integer che_borrado){
		this.che_borrado = che_borrado;
	}
	public Integer getChe_cierre(){
		return che_cierre;
	}
	public void setChe_cierre(Integer che_cierre){
		this.che_cierre = che_cierre;
	}
	public String getChe_entrego(){
		return che_entrego;
	}
	public void setChe_entrego(String che_entrego){
		this.che_entrego = che_entrego;
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
	public Integer getChe_deposito(){
		return che_deposito;
	}
	public void setChe_deposito(Integer che_deposito){
		this.che_deposito = che_deposito;
	}
	public Integer getChe_nrocierre(){
		return che_nrocierre;
	}
	public void setChe_nrocierre(Integer che_nrocierre){
		this.che_nrocierre = che_nrocierre;
	}
	public Integer getChe_cierrecajagennro(){
		return che_cierrecajagennro;
	}
	public void setChe_cierrecajagennro(Integer che_cierrecajagennro){
		this.che_cierrecajagennro = che_cierrecajagennro;
	}

}