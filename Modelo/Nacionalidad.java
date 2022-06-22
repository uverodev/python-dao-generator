package modelo;

public class Nacionalidad{
	Integer nac_cod;
	String nac_descri;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Nacionalidad(Integer nac_cod, String nac_descri, String fechasct, Integer usuariosct, String maquinasct){
		this.nac_cod = nac_cod;
		this.nac_descri = nac_descri;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Nacionalidad(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nacionalidad{"+", nac_cod=" + nac_cod+", nac_descri=" + nac_descri+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getNac_cod(){
		return nac_cod;
	}
	public void setNac_cod(Integer nac_cod){
		this.nac_cod = nac_cod;
	}
	public String getNac_descri(){
		return nac_descri;
	}
	public void setNac_descri(String nac_descri){
		this.nac_descri = nac_descri;
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

}