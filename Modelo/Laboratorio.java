package modelo;

public class Laboratorio{
	Integer lab_cod;
	String lab_descri;
	Integer lab_procedencia;
	Integer lab_borrado;
	Double lab_porcentpublic;
	Double lab_porcentmay;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Laboratorio(Integer lab_cod, String lab_descri, Integer lab_procedencia, Integer lab_borrado, Double lab_porcentpublic, Double lab_porcentmay, String fechasct, Integer usuariosct, String maquinasct){
		this.lab_cod = lab_cod;
		this.lab_descri = lab_descri;
		this.lab_procedencia = lab_procedencia;
		this.lab_borrado = lab_borrado;
		this.lab_porcentpublic = lab_porcentpublic;
		this.lab_porcentmay = lab_porcentmay;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Laboratorio(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Laboratorio{"+", lab_cod=" + lab_cod+", lab_descri=" + lab_descri+", lab_procedencia=" + lab_procedencia+", lab_borrado=" + lab_borrado+", lab_porcentpublic=" + lab_porcentpublic+", lab_porcentmay=" + lab_porcentmay+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getLab_cod(){
		return lab_cod;
	}
	public void setLab_cod(Integer lab_cod){
		this.lab_cod = lab_cod;
	}
	public String getLab_descri(){
		return lab_descri;
	}
	public void setLab_descri(String lab_descri){
		this.lab_descri = lab_descri;
	}
	public Integer getLab_procedencia(){
		return lab_procedencia;
	}
	public void setLab_procedencia(Integer lab_procedencia){
		this.lab_procedencia = lab_procedencia;
	}
	public Integer getLab_borrado(){
		return lab_borrado;
	}
	public void setLab_borrado(Integer lab_borrado){
		this.lab_borrado = lab_borrado;
	}
	public Double getLab_porcentpublic(){
		return lab_porcentpublic;
	}
	public void setLab_porcentpublic(Double lab_porcentpublic){
		this.lab_porcentpublic = lab_porcentpublic;
	}
	public Double getLab_porcentmay(){
		return lab_porcentmay;
	}
	public void setLab_porcentmay(Double lab_porcentmay){
		this.lab_porcentmay = lab_porcentmay;
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