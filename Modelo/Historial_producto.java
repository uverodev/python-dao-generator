package modelo;

public class Historial_producto{
	Integer hp_codigo;
	String hp_fecha;
	String hp_movimiento;
	Double hp_cantidad;
	Double hp_stockant;
	Double hp_stockact;
	Double hp_pcosto;
	Double hp_pventa;
	String hp_codigocp;
	Integer hp_nrooperacion;
	Integer hp_usuario;
	String hp_maquina;
	String hp_codprod;
	String hp_obs;
	String hp_lote;
	Integer hp_tipmovimiento;
	String hp_descripcion_responsable;

	public Historial_producto(Integer hp_codigo, String hp_fecha, String hp_movimiento, Double hp_cantidad, Double hp_stockant, Double hp_stockact, Double hp_pcosto, Double hp_pventa, String hp_codigocp, Integer hp_nrooperacion, Integer hp_usuario, String hp_maquina, String hp_codprod, String hp_obs, String hp_lote, Integer hp_tipmovimiento, String hp_descripcion_responsable){
		this.hp_codigo = hp_codigo;
		this.hp_fecha = hp_fecha;
		this.hp_movimiento = hp_movimiento;
		this.hp_cantidad = hp_cantidad;
		this.hp_stockant = hp_stockant;
		this.hp_stockact = hp_stockact;
		this.hp_pcosto = hp_pcosto;
		this.hp_pventa = hp_pventa;
		this.hp_codigocp = hp_codigocp;
		this.hp_nrooperacion = hp_nrooperacion;
		this.hp_usuario = hp_usuario;
		this.hp_maquina = hp_maquina;
		this.hp_codprod = hp_codprod;
		this.hp_obs = hp_obs;
		this.hp_lote = hp_lote;
		this.hp_tipmovimiento = hp_tipmovimiento;
		this.hp_descripcion_responsable = hp_descripcion_responsable;
	}
	public Historial_producto(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Historial_producto{"+", hp_codigo=" + hp_codigo+", hp_fecha=" + hp_fecha+", hp_movimiento=" + hp_movimiento+", hp_cantidad=" + hp_cantidad+", hp_stockant=" + hp_stockant+", hp_stockact=" + hp_stockact+", hp_pcosto=" + hp_pcosto+", hp_pventa=" + hp_pventa+", hp_codigocp=" + hp_codigocp+", hp_nrooperacion=" + hp_nrooperacion+", hp_usuario=" + hp_usuario+", hp_maquina=" + hp_maquina+", hp_codprod=" + hp_codprod+", hp_obs=" + hp_obs+", hp_lote=" + hp_lote+", hp_tipmovimiento=" + hp_tipmovimiento+", hp_descripcion_responsable=" + hp_descripcion_responsable+"}";

	}
	public Integer getHp_codigo(){
		return hp_codigo;
	}
	public void setHp_codigo(Integer hp_codigo){
		this.hp_codigo = hp_codigo;
	}
	public String getHp_fecha(){
		return hp_fecha;
	}
	public void setHp_fecha(String hp_fecha){
		this.hp_fecha = hp_fecha;
	}
	public String getHp_movimiento(){
		return hp_movimiento;
	}
	public void setHp_movimiento(String hp_movimiento){
		this.hp_movimiento = hp_movimiento;
	}
	public Double getHp_cantidad(){
		return hp_cantidad;
	}
	public void setHp_cantidad(Double hp_cantidad){
		this.hp_cantidad = hp_cantidad;
	}
	public Double getHp_stockant(){
		return hp_stockant;
	}
	public void setHp_stockant(Double hp_stockant){
		this.hp_stockant = hp_stockant;
	}
	public Double getHp_stockact(){
		return hp_stockact;
	}
	public void setHp_stockact(Double hp_stockact){
		this.hp_stockact = hp_stockact;
	}
	public Double getHp_pcosto(){
		return hp_pcosto;
	}
	public void setHp_pcosto(Double hp_pcosto){
		this.hp_pcosto = hp_pcosto;
	}
	public Double getHp_pventa(){
		return hp_pventa;
	}
	public void setHp_pventa(Double hp_pventa){
		this.hp_pventa = hp_pventa;
	}
	public String getHp_codigocp(){
		return hp_codigocp;
	}
	public void setHp_codigocp(String hp_codigocp){
		this.hp_codigocp = hp_codigocp;
	}
	public Integer getHp_nrooperacion(){
		return hp_nrooperacion;
	}
	public void setHp_nrooperacion(Integer hp_nrooperacion){
		this.hp_nrooperacion = hp_nrooperacion;
	}
	public Integer getHp_usuario(){
		return hp_usuario;
	}
	public void setHp_usuario(Integer hp_usuario){
		this.hp_usuario = hp_usuario;
	}
	public String getHp_maquina(){
		return hp_maquina;
	}
	public void setHp_maquina(String hp_maquina){
		this.hp_maquina = hp_maquina;
	}
	public String getHp_codprod(){
		return hp_codprod;
	}
	public void setHp_codprod(String hp_codprod){
		this.hp_codprod = hp_codprod;
	}
	public String getHp_obs(){
		return hp_obs;
	}
	public void setHp_obs(String hp_obs){
		this.hp_obs = hp_obs;
	}
	public String getHp_lote(){
		return hp_lote;
	}
	public void setHp_lote(String hp_lote){
		this.hp_lote = hp_lote;
	}
	public Integer getHp_tipmovimiento(){
		return hp_tipmovimiento;
	}
	public void setHp_tipmovimiento(Integer hp_tipmovimiento){
		this.hp_tipmovimiento = hp_tipmovimiento;
	}
	public String getHp_descripcion_responsable(){
		return hp_descripcion_responsable;
	}
	public void setHp_descripcion_responsable(String hp_descripcion_responsable){
		this.hp_descripcion_responsable = hp_descripcion_responsable;
	}

}