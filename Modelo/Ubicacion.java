package modelo;

public class Ubicacion{
	Integer ub_cod;
	String ub_descri;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Ubicacion(Integer ub_cod, String ub_descri, String fechasct, Integer usuariosct, String maquinasct){
		this.ub_cod = ub_cod;
		this.ub_descri = ub_descri;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Ubicacion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ubicacion{"+", ub_cod=" + ub_cod+", ub_descri=" + ub_descri+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getUb_cod(){
		return ub_cod;
	}
	public void setUb_cod(Integer ub_cod){
		this.ub_cod = ub_cod;
	}
	public String getUb_descri(){
		return ub_descri;
	}
	public void setUb_descri(String ub_descri){
		this.ub_descri = ub_descri;
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