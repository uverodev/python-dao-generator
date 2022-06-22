package modelo;

public class Cajchica{
	Integer caj_nro;
	String caj_fecha;
	String caj_hora;
	Double caj_total;
	String caj_responsable;
	String caj_observacion;
	Integer caj_borrado;
	String caj_caja;
	Double caj_totacomulado;
	Integer caj_usuario;
	Integer caj_cerrado;
	Integer caj_nrocierre;
	Integer caj_deposito;
	Integer caj_cierrecajagennro;

	public Cajchica(Integer caj_nro, String caj_fecha, String caj_hora, Double caj_total, String caj_responsable, String caj_observacion, Integer caj_borrado, String caj_caja, Double caj_totacomulado, Integer caj_usuario, Integer caj_cerrado, Integer caj_nrocierre, Integer caj_deposito, Integer caj_cierrecajagennro){
		this.caj_nro = caj_nro;
		this.caj_fecha = caj_fecha;
		this.caj_hora = caj_hora;
		this.caj_total = caj_total;
		this.caj_responsable = caj_responsable;
		this.caj_observacion = caj_observacion;
		this.caj_borrado = caj_borrado;
		this.caj_caja = caj_caja;
		this.caj_totacomulado = caj_totacomulado;
		this.caj_usuario = caj_usuario;
		this.caj_cerrado = caj_cerrado;
		this.caj_nrocierre = caj_nrocierre;
		this.caj_deposito = caj_deposito;
		this.caj_cierrecajagennro = caj_cierrecajagennro;
	}
	public Cajchica(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cajchica{"+", caj_nro=" + caj_nro+", caj_fecha=" + caj_fecha+", caj_hora=" + caj_hora+", caj_total=" + caj_total+", caj_responsable=" + caj_responsable+", caj_observacion=" + caj_observacion+", caj_borrado=" + caj_borrado+", caj_caja=" + caj_caja+", caj_totacomulado=" + caj_totacomulado+", caj_usuario=" + caj_usuario+", caj_cerrado=" + caj_cerrado+", caj_nrocierre=" + caj_nrocierre+", caj_deposito=" + caj_deposito+", caj_cierrecajagennro=" + caj_cierrecajagennro+"}";

	}
	public Integer getCaj_nro(){
		return caj_nro;
	}
	public void setCaj_nro(Integer caj_nro){
		this.caj_nro = caj_nro;
	}
	public String getCaj_fecha(){
		return caj_fecha;
	}
	public void setCaj_fecha(String caj_fecha){
		this.caj_fecha = caj_fecha;
	}
	public String getCaj_hora(){
		return caj_hora;
	}
	public void setCaj_hora(String caj_hora){
		this.caj_hora = caj_hora;
	}
	public Double getCaj_total(){
		return caj_total;
	}
	public void setCaj_total(Double caj_total){
		this.caj_total = caj_total;
	}
	public String getCaj_responsable(){
		return caj_responsable;
	}
	public void setCaj_responsable(String caj_responsable){
		this.caj_responsable = caj_responsable;
	}
	public String getCaj_observacion(){
		return caj_observacion;
	}
	public void setCaj_observacion(String caj_observacion){
		this.caj_observacion = caj_observacion;
	}
	public Integer getCaj_borrado(){
		return caj_borrado;
	}
	public void setCaj_borrado(Integer caj_borrado){
		this.caj_borrado = caj_borrado;
	}
	public String getCaj_caja(){
		return caj_caja;
	}
	public void setCaj_caja(String caj_caja){
		this.caj_caja = caj_caja;
	}
	public Double getCaj_totacomulado(){
		return caj_totacomulado;
	}
	public void setCaj_totacomulado(Double caj_totacomulado){
		this.caj_totacomulado = caj_totacomulado;
	}
	public Integer getCaj_usuario(){
		return caj_usuario;
	}
	public void setCaj_usuario(Integer caj_usuario){
		this.caj_usuario = caj_usuario;
	}
	public Integer getCaj_cerrado(){
		return caj_cerrado;
	}
	public void setCaj_cerrado(Integer caj_cerrado){
		this.caj_cerrado = caj_cerrado;
	}
	public Integer getCaj_nrocierre(){
		return caj_nrocierre;
	}
	public void setCaj_nrocierre(Integer caj_nrocierre){
		this.caj_nrocierre = caj_nrocierre;
	}
	public Integer getCaj_deposito(){
		return caj_deposito;
	}
	public void setCaj_deposito(Integer caj_deposito){
		this.caj_deposito = caj_deposito;
	}
	public Integer getCaj_cierrecajagennro(){
		return caj_cierrecajagennro;
	}
	public void setCaj_cierrecajagennro(Integer caj_cierrecajagennro){
		this.caj_cierrecajagennro = caj_cierrecajagennro;
	}

}