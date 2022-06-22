package modelo;

public class Cabecera_canje{
	Integer cj_nro;
	Integer cj_ppc_nro;
	String cj_fecha;
	String cj_hora;
	String fechasct;
	Integer cj_usuario;
	Double cj_cantidad_items;
	Double cj_total_canje;
	Integer cj_borrado;
	String cj_maquina;

	public Cabecera_canje(Integer cj_nro, Integer cj_ppc_nro, String cj_fecha, String cj_hora, String fechasct, Integer cj_usuario, Double cj_cantidad_items, Double cj_total_canje, Integer cj_borrado, String cj_maquina){
		this.cj_nro = cj_nro;
		this.cj_ppc_nro = cj_ppc_nro;
		this.cj_fecha = cj_fecha;
		this.cj_hora = cj_hora;
		this.fechasct = fechasct;
		this.cj_usuario = cj_usuario;
		this.cj_cantidad_items = cj_cantidad_items;
		this.cj_total_canje = cj_total_canje;
		this.cj_borrado = cj_borrado;
		this.cj_maquina = cj_maquina;
	}
	public Cabecera_canje(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cabecera_canje{"+", cj_nro=" + cj_nro+", cj_ppc_nro=" + cj_ppc_nro+", cj_fecha=" + cj_fecha+", cj_hora=" + cj_hora+", fechasct=" + fechasct+", cj_usuario=" + cj_usuario+", cj_cantidad_items=" + cj_cantidad_items+", cj_total_canje=" + cj_total_canje+", cj_borrado=" + cj_borrado+", cj_maquina=" + cj_maquina+"}";

	}
	public Integer getCj_nro(){
		return cj_nro;
	}
	public void setCj_nro(Integer cj_nro){
		this.cj_nro = cj_nro;
	}
	public Integer getCj_ppc_nro(){
		return cj_ppc_nro;
	}
	public void setCj_ppc_nro(Integer cj_ppc_nro){
		this.cj_ppc_nro = cj_ppc_nro;
	}
	public String getCj_fecha(){
		return cj_fecha;
	}
	public void setCj_fecha(String cj_fecha){
		this.cj_fecha = cj_fecha;
	}
	public String getCj_hora(){
		return cj_hora;
	}
	public void setCj_hora(String cj_hora){
		this.cj_hora = cj_hora;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getCj_usuario(){
		return cj_usuario;
	}
	public void setCj_usuario(Integer cj_usuario){
		this.cj_usuario = cj_usuario;
	}
	public Double getCj_cantidad_items(){
		return cj_cantidad_items;
	}
	public void setCj_cantidad_items(Double cj_cantidad_items){
		this.cj_cantidad_items = cj_cantidad_items;
	}
	public Double getCj_total_canje(){
		return cj_total_canje;
	}
	public void setCj_total_canje(Double cj_total_canje){
		this.cj_total_canje = cj_total_canje;
	}
	public Integer getCj_borrado(){
		return cj_borrado;
	}
	public void setCj_borrado(Integer cj_borrado){
		this.cj_borrado = cj_borrado;
	}
	public String getCj_maquina(){
		return cj_maquina;
	}
	public void setCj_maquina(String cj_maquina){
		this.cj_maquina = cj_maquina;
	}

}