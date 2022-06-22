package modelo;

public class Inventario{
	Integer inv_id;
	Integer inv_borrado;
	Integer inv_usuario;
	String inv_fecha;
	String inv_maquina;
	Integer inv_deposito;
	String inv_hora;
	String inv_fechasct;

	public Inventario(Integer inv_id, Integer inv_borrado, Integer inv_usuario, String inv_fecha, String inv_maquina, Integer inv_deposito, String inv_hora, String inv_fechasct){
		this.inv_id = inv_id;
		this.inv_borrado = inv_borrado;
		this.inv_usuario = inv_usuario;
		this.inv_fecha = inv_fecha;
		this.inv_maquina = inv_maquina;
		this.inv_deposito = inv_deposito;
		this.inv_hora = inv_hora;
		this.inv_fechasct = inv_fechasct;
	}
	public Inventario(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Inventario{"+", inv_id=" + inv_id+", inv_borrado=" + inv_borrado+", inv_usuario=" + inv_usuario+", inv_fecha=" + inv_fecha+", inv_maquina=" + inv_maquina+", inv_deposito=" + inv_deposito+", inv_hora=" + inv_hora+", inv_fechasct=" + inv_fechasct+"}";

	}
	public Integer getInv_id(){
		return inv_id;
	}
	public void setInv_id(Integer inv_id){
		this.inv_id = inv_id;
	}
	public Integer getInv_borrado(){
		return inv_borrado;
	}
	public void setInv_borrado(Integer inv_borrado){
		this.inv_borrado = inv_borrado;
	}
	public Integer getInv_usuario(){
		return inv_usuario;
	}
	public void setInv_usuario(Integer inv_usuario){
		this.inv_usuario = inv_usuario;
	}
	public String getInv_fecha(){
		return inv_fecha;
	}
	public void setInv_fecha(String inv_fecha){
		this.inv_fecha = inv_fecha;
	}
	public String getInv_maquina(){
		return inv_maquina;
	}
	public void setInv_maquina(String inv_maquina){
		this.inv_maquina = inv_maquina;
	}
	public Integer getInv_deposito(){
		return inv_deposito;
	}
	public void setInv_deposito(Integer inv_deposito){
		this.inv_deposito = inv_deposito;
	}
	public String getInv_hora(){
		return inv_hora;
	}
	public void setInv_hora(String inv_hora){
		this.inv_hora = inv_hora;
	}
	public String getInv_fechasct(){
		return inv_fechasct;
	}
	public void setInv_fechasct(String inv_fechasct){
		this.inv_fechasct = inv_fechasct;
	}

}