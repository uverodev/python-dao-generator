package modelo;

public class Configuracionxusua{
	Integer uc_index;
	Integer uc_codigo;
	String uc_descripcion;
	Integer uc_estadovisible;
	Integer uc_estadoactivo;
	Integer uc_usuario;

	public Configuracionxusua(Integer uc_index, Integer uc_codigo, String uc_descripcion, Integer uc_estadovisible, Integer uc_estadoactivo, Integer uc_usuario){
		this.uc_index = uc_index;
		this.uc_codigo = uc_codigo;
		this.uc_descripcion = uc_descripcion;
		this.uc_estadovisible = uc_estadovisible;
		this.uc_estadoactivo = uc_estadoactivo;
		this.uc_usuario = uc_usuario;
	}
	public Configuracionxusua(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Configuracionxusua{"+", uc_index=" + uc_index+", uc_codigo=" + uc_codigo+", uc_descripcion=" + uc_descripcion+", uc_estadovisible=" + uc_estadovisible+", uc_estadoactivo=" + uc_estadoactivo+", uc_usuario=" + uc_usuario+"}";

	}
	public Integer getUc_index(){
		return uc_index;
	}
	public void setUc_index(Integer uc_index){
		this.uc_index = uc_index;
	}
	public Integer getUc_codigo(){
		return uc_codigo;
	}
	public void setUc_codigo(Integer uc_codigo){
		this.uc_codigo = uc_codigo;
	}
	public String getUc_descripcion(){
		return uc_descripcion;
	}
	public void setUc_descripcion(String uc_descripcion){
		this.uc_descripcion = uc_descripcion;
	}
	public Integer getUc_estadovisible(){
		return uc_estadovisible;
	}
	public void setUc_estadovisible(Integer uc_estadovisible){
		this.uc_estadovisible = uc_estadovisible;
	}
	public Integer getUc_estadoactivo(){
		return uc_estadoactivo;
	}
	public void setUc_estadoactivo(Integer uc_estadoactivo){
		this.uc_estadoactivo = uc_estadoactivo;
	}
	public Integer getUc_usuario(){
		return uc_usuario;
	}
	public void setUc_usuario(Integer uc_usuario){
		this.uc_usuario = uc_usuario;
	}

}