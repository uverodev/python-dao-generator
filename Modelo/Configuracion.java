package modelo;

public class Configuracion{
	Integer c_index;
	Integer c_codigo;
	String c_descripcion;
	Integer c_estadovisible;
	Integer c_estadoactivo;
	String c_nombrepc;

	public Configuracion(Integer c_index, Integer c_codigo, String c_descripcion, Integer c_estadovisible, Integer c_estadoactivo, String c_nombrepc){
		this.c_index = c_index;
		this.c_codigo = c_codigo;
		this.c_descripcion = c_descripcion;
		this.c_estadovisible = c_estadovisible;
		this.c_estadoactivo = c_estadoactivo;
		this.c_nombrepc = c_nombrepc;
	}
	public Configuracion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Configuracion{"+", c_index=" + c_index+", c_codigo=" + c_codigo+", c_descripcion=" + c_descripcion+", c_estadovisible=" + c_estadovisible+", c_estadoactivo=" + c_estadoactivo+", c_nombrepc=" + c_nombrepc+"}";

	}
	public Integer getC_index(){
		return c_index;
	}
	public void setC_index(Integer c_index){
		this.c_index = c_index;
	}
	public Integer getC_codigo(){
		return c_codigo;
	}
	public void setC_codigo(Integer c_codigo){
		this.c_codigo = c_codigo;
	}
	public String getC_descripcion(){
		return c_descripcion;
	}
	public void setC_descripcion(String c_descripcion){
		this.c_descripcion = c_descripcion;
	}
	public Integer getC_estadovisible(){
		return c_estadovisible;
	}
	public void setC_estadovisible(Integer c_estadovisible){
		this.c_estadovisible = c_estadovisible;
	}
	public Integer getC_estadoactivo(){
		return c_estadoactivo;
	}
	public void setC_estadoactivo(Integer c_estadoactivo){
		this.c_estadoactivo = c_estadoactivo;
	}
	public String getC_nombrepc(){
		return c_nombrepc;
	}
	public void setC_nombrepc(String c_nombrepc){
		this.c_nombrepc = c_nombrepc;
	}

}