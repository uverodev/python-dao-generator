package modelo;

public class Caja_inicial_balance{
	Integer cib_id;
	String cib_fecha;
	String cib_hora;
	Double cib_monto;
	Integer cib_usuario;
	String cib_maquina;
	String cib_fechasct;
	Integer cib_moneda;
	String cib_obs;
	Integer cib_borrado;
	Integer cib_deposito;

	public Caja_inicial_balance(Integer cib_id, String cib_fecha, String cib_hora, Double cib_monto, Integer cib_usuario, String cib_maquina, String cib_fechasct, Integer cib_moneda, String cib_obs, Integer cib_borrado, Integer cib_deposito){
		this.cib_id = cib_id;
		this.cib_fecha = cib_fecha;
		this.cib_hora = cib_hora;
		this.cib_monto = cib_monto;
		this.cib_usuario = cib_usuario;
		this.cib_maquina = cib_maquina;
		this.cib_fechasct = cib_fechasct;
		this.cib_moneda = cib_moneda;
		this.cib_obs = cib_obs;
		this.cib_borrado = cib_borrado;
		this.cib_deposito = cib_deposito;
	}
	public Caja_inicial_balance(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Caja_inicial_balance{"+", cib_id=" + cib_id+", cib_fecha=" + cib_fecha+", cib_hora=" + cib_hora+", cib_monto=" + cib_monto+", cib_usuario=" + cib_usuario+", cib_maquina=" + cib_maquina+", cib_fechasct=" + cib_fechasct+", cib_moneda=" + cib_moneda+", cib_obs=" + cib_obs+", cib_borrado=" + cib_borrado+", cib_deposito=" + cib_deposito+"}";

	}
	public Integer getCib_id(){
		return cib_id;
	}
	public void setCib_id(Integer cib_id){
		this.cib_id = cib_id;
	}
	public String getCib_fecha(){
		return cib_fecha;
	}
	public void setCib_fecha(String cib_fecha){
		this.cib_fecha = cib_fecha;
	}
	public String getCib_hora(){
		return cib_hora;
	}
	public void setCib_hora(String cib_hora){
		this.cib_hora = cib_hora;
	}
	public Double getCib_monto(){
		return cib_monto;
	}
	public void setCib_monto(Double cib_monto){
		this.cib_monto = cib_monto;
	}
	public Integer getCib_usuario(){
		return cib_usuario;
	}
	public void setCib_usuario(Integer cib_usuario){
		this.cib_usuario = cib_usuario;
	}
	public String getCib_maquina(){
		return cib_maquina;
	}
	public void setCib_maquina(String cib_maquina){
		this.cib_maquina = cib_maquina;
	}
	public String getCib_fechasct(){
		return cib_fechasct;
	}
	public void setCib_fechasct(String cib_fechasct){
		this.cib_fechasct = cib_fechasct;
	}
	public Integer getCib_moneda(){
		return cib_moneda;
	}
	public void setCib_moneda(Integer cib_moneda){
		this.cib_moneda = cib_moneda;
	}
	public String getCib_obs(){
		return cib_obs;
	}
	public void setCib_obs(String cib_obs){
		this.cib_obs = cib_obs;
	}
	public Integer getCib_borrado(){
		return cib_borrado;
	}
	public void setCib_borrado(Integer cib_borrado){
		this.cib_borrado = cib_borrado;
	}
	public Integer getCib_deposito(){
		return cib_deposito;
	}
	public void setCib_deposito(Integer cib_deposito){
		this.cib_deposito = cib_deposito;
	}

}