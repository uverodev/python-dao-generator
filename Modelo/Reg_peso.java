package modelo;

public class Reg_peso{
	Integer pes_codigo;
	String pes_fecha;
	Double pes_peso;
	Integer pes_borrado;
	String pes_cliente;

	public Reg_peso(Integer pes_codigo, String pes_fecha, Double pes_peso, Integer pes_borrado, String pes_cliente){
		this.pes_codigo = pes_codigo;
		this.pes_fecha = pes_fecha;
		this.pes_peso = pes_peso;
		this.pes_borrado = pes_borrado;
		this.pes_cliente = pes_cliente;
	}
	public Reg_peso(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Reg_peso{"+", pes_codigo=" + pes_codigo+", pes_fecha=" + pes_fecha+", pes_peso=" + pes_peso+", pes_borrado=" + pes_borrado+", pes_cliente=" + pes_cliente+"}";

	}
	public Integer getPes_codigo(){
		return pes_codigo;
	}
	public void setPes_codigo(Integer pes_codigo){
		this.pes_codigo = pes_codigo;
	}
	public String getPes_fecha(){
		return pes_fecha;
	}
	public void setPes_fecha(String pes_fecha){
		this.pes_fecha = pes_fecha;
	}
	public Double getPes_peso(){
		return pes_peso;
	}
	public void setPes_peso(Double pes_peso){
		this.pes_peso = pes_peso;
	}
	public Integer getPes_borrado(){
		return pes_borrado;
	}
	public void setPes_borrado(Integer pes_borrado){
		this.pes_borrado = pes_borrado;
	}
	public String getPes_cliente(){
		return pes_cliente;
	}
	public void setPes_cliente(String pes_cliente){
		this.pes_cliente = pes_cliente;
	}

}