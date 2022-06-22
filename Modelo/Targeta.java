package modelo;

public class Targeta{
	Integer tar_nro;
	String tar_descripcion;
	Integer tar_tipo;
	Integer tar_borrado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Targeta(Integer tar_nro, String tar_descripcion, Integer tar_tipo, Integer tar_borrado, String fechasct, Integer usuariosct, String maquinasct){
		this.tar_nro = tar_nro;
		this.tar_descripcion = tar_descripcion;
		this.tar_tipo = tar_tipo;
		this.tar_borrado = tar_borrado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Targeta(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Targeta{"+", tar_nro=" + tar_nro+", tar_descripcion=" + tar_descripcion+", tar_tipo=" + tar_tipo+", tar_borrado=" + tar_borrado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getTar_nro(){
		return tar_nro;
	}
	public void setTar_nro(Integer tar_nro){
		this.tar_nro = tar_nro;
	}
	public String getTar_descripcion(){
		return tar_descripcion;
	}
	public void setTar_descripcion(String tar_descripcion){
		this.tar_descripcion = tar_descripcion;
	}
	public Integer getTar_tipo(){
		return tar_tipo;
	}
	public void setTar_tipo(Integer tar_tipo){
		this.tar_tipo = tar_tipo;
	}
	public Integer getTar_borrado(){
		return tar_borrado;
	}
	public void setTar_borrado(Integer tar_borrado){
		this.tar_borrado = tar_borrado;
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