package modelo;

public class Procedencia{
	Integer prc_cod;
	String prc_descri;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Double prc_descuento;

	public Procedencia(Integer prc_cod, String prc_descri, String fechasct, Integer usuariosct, String maquinasct, Double prc_descuento){
		this.prc_cod = prc_cod;
		this.prc_descri = prc_descri;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.prc_descuento = prc_descuento;
	}
	public Procedencia(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Procedencia{"+", prc_cod=" + prc_cod+", prc_descri=" + prc_descri+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", prc_descuento=" + prc_descuento+"}";

	}
	public Integer getPrc_cod(){
		return prc_cod;
	}
	public void setPrc_cod(Integer prc_cod){
		this.prc_cod = prc_cod;
	}
	public String getPrc_descri(){
		return prc_descri;
	}
	public void setPrc_descri(String prc_descri){
		this.prc_descri = prc_descri;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getUsuariosct(){
		return usuariosct;
	}
	public void setUsuariosct(Integer usuariosct){
		this.usuariosct = usuariosct;
	}
	public String getMaquinasct(){
		return maquinasct;
	}
	public void setMaquinasct(String maquinasct){
		this.maquinasct = maquinasct;
	}
	public Double getPrc_descuento(){
		return prc_descuento;
	}
	public void setPrc_descuento(Double prc_descuento){
		this.prc_descuento = prc_descuento;
	}

}