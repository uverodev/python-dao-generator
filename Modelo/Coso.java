package modelo;

public class Coso{
	Double coso;
	String coso2;

	public Coso(Double coso, String coso2){
		this.coso = coso;
		this.coso2 = coso2;
	}
	public Coso(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Coso{"+"coso=" + coso+"coso2=" + coso2+"}";

	}
	public Double getCoso(){
		return coso;
	}
	public void setCoso(Double coso){
		this.coso = coso;
	}
	public String getCoso2(){
		return coso2;
	}
	public void setCoso2(String coso2){
		this.coso2 = coso2;
	}

}