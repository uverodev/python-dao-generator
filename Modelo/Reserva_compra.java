package modelo;

public class Reserva_compra{
	Integer rc_numeracion;
	String rc_maquina;

	public Reserva_compra(Integer rc_numeracion, String rc_maquina){
		this.rc_numeracion = rc_numeracion;
		this.rc_maquina = rc_maquina;
	}
	public Reserva_compra(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Reserva_compra{"+", rc_numeracion=" + rc_numeracion+", rc_maquina=" + rc_maquina+"}";

	}
	public Integer getRc_numeracion(){
		return rc_numeracion;
	}
	public void setRc_numeracion(Integer rc_numeracion){
		this.rc_numeracion = rc_numeracion;
	}
	public String getRc_maquina(){
		return rc_maquina;
	}
	public void setRc_maquina(String rc_maquina){
		this.rc_maquina = rc_maquina;
	}

}