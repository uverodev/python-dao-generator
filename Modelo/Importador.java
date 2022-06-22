package modelo;

public class Importador{
	Integer imp_cod;
	String imp_razon;
	String imp_telefono;
	String imp_direccion;
	Integer imp_borrado;
	Integer usuariosct;
	String fechasct;
	String maquinasct;

	public Importador(Integer imp_cod, String imp_razon, String imp_telefono, String imp_direccion, Integer imp_borrado, Integer usuariosct, String fechasct, String maquinasct){
		this.imp_cod = imp_cod;
		this.imp_razon = imp_razon;
		this.imp_telefono = imp_telefono;
		this.imp_direccion = imp_direccion;
		this.imp_borrado = imp_borrado;
		this.usuariosct = usuariosct;
		this.fechasct = fechasct;
		this.maquinasct = maquinasct;
	}
	public Importador(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Importador{"+", imp_cod=" + imp_cod+", imp_razon=" + imp_razon+", imp_telefono=" + imp_telefono+", imp_direccion=" + imp_direccion+", imp_borrado=" + imp_borrado+", usuariosct=" + usuariosct+", fechasct=" + fechasct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getImp_cod(){
		return imp_cod;
	}
	public void setImp_cod(Integer imp_cod){
		this.imp_cod = imp_cod;
	}
	public String getImp_razon(){
		return imp_razon;
	}
	public void setImp_razon(String imp_razon){
		this.imp_razon = imp_razon;
	}
	public String getImp_telefono(){
		return imp_telefono;
	}
	public void setImp_telefono(String imp_telefono){
		this.imp_telefono = imp_telefono;
	}
	public String getImp_direccion(){
		return imp_direccion;
	}
	public void setImp_direccion(String imp_direccion){
		this.imp_direccion = imp_direccion;
	}
	public Integer getImp_borrado(){
		return imp_borrado;
	}
	public void setImp_borrado(Integer imp_borrado){
		this.imp_borrado = imp_borrado;
	}
	public Integer getUsuariosct(){
		return usuariosct;
	}
	public void setUsuariosct(Integer usuariosct){
		this.usuariosct = usuariosct;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public String getMaquinasct(){
		return maquinasct;
	}
	public void setMaquinasct(String maquinasct){
		this.maquinasct = maquinasct;
	}

}