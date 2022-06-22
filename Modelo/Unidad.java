package modelo;

public class Unidad{
	Integer und_nro;
	String und_descripcion;
	Integer und_borrado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Unidad(Integer und_nro, String und_descripcion, Integer und_borrado, String fechasct, Integer usuariosct, String maquinasct){
		this.und_nro = und_nro;
		this.und_descripcion = und_descripcion;
		this.und_borrado = und_borrado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Unidad(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Unidad{"+", und_nro=" + und_nro+", und_descripcion=" + und_descripcion+", und_borrado=" + und_borrado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getUnd_nro(){
		return und_nro;
	}
	public void setUnd_nro(Integer und_nro){
		this.und_nro = und_nro;
	}
	public String getUnd_descripcion(){
		return und_descripcion;
	}
	public void setUnd_descripcion(String und_descripcion){
		this.und_descripcion = und_descripcion;
	}
	public Integer getUnd_borrado(){
		return und_borrado;
	}
	public void setUnd_borrado(Integer und_borrado){
		this.und_borrado = und_borrado;
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