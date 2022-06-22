package modelo;

public class Zona{
	Integer zon_cod;
	String zon_descri;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Zona(Integer zon_cod, String zon_descri, String fechasct, Integer usuariosct, String maquinasct){
		this.zon_cod = zon_cod;
		this.zon_descri = zon_descri;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Zona(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Zona{"+", zon_cod=" + zon_cod+", zon_descri=" + zon_descri+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getZon_cod(){
		return zon_cod;
	}
	public void setZon_cod(Integer zon_cod){
		this.zon_cod = zon_cod;
	}
	public String getZon_descri(){
		return zon_descri;
	}
	public void setZon_descri(String zon_descri){
		this.zon_descri = zon_descri;
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