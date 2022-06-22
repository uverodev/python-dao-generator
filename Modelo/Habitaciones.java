package modelo;

public class Habitaciones{
	Integer h_codigo;
	Integer h_estado;
	String h_descripcion;
	Integer h_cantcuartos;
	Integer h_tipohabitacion;
	String h_especificacionhabitacion;
	Object h_imghabitacion;
	Double h_costoxhora;
	Double h_costoxdia;
	Double h_costoadicional;
	Double h_costoxsemana;
	Double h_costoespecial;
	String h_ubicacion;
	Integer h_numerohabitacion;
	Integer h_borrado;
	Object h_area;
	Object h_imagen6;
	Object h_imagen5;
	Object h_imagen4;
	Object h_imagen3;
	Object h_imagen2;
	Object h_imagen1;
	Integer h_tipo;

	public Habitaciones(Integer h_codigo, Integer h_estado, String h_descripcion, Integer h_cantcuartos, Integer h_tipohabitacion, String h_especificacionhabitacion, Object h_imghabitacion, Double h_costoxhora, Double h_costoxdia, Double h_costoadicional, Double h_costoxsemana, Double h_costoespecial, String h_ubicacion, Integer h_numerohabitacion, Integer h_borrado, Object h_area, Object h_imagen6, Object h_imagen5, Object h_imagen4, Object h_imagen3, Object h_imagen2, Object h_imagen1, Integer h_tipo){
		this.h_codigo = h_codigo;
		this.h_estado = h_estado;
		this.h_descripcion = h_descripcion;
		this.h_cantcuartos = h_cantcuartos;
		this.h_tipohabitacion = h_tipohabitacion;
		this.h_especificacionhabitacion = h_especificacionhabitacion;
		this.h_imghabitacion = h_imghabitacion;
		this.h_costoxhora = h_costoxhora;
		this.h_costoxdia = h_costoxdia;
		this.h_costoadicional = h_costoadicional;
		this.h_costoxsemana = h_costoxsemana;
		this.h_costoespecial = h_costoespecial;
		this.h_ubicacion = h_ubicacion;
		this.h_numerohabitacion = h_numerohabitacion;
		this.h_borrado = h_borrado;
		this.h_area = h_area;
		this.h_imagen6 = h_imagen6;
		this.h_imagen5 = h_imagen5;
		this.h_imagen4 = h_imagen4;
		this.h_imagen3 = h_imagen3;
		this.h_imagen2 = h_imagen2;
		this.h_imagen1 = h_imagen1;
		this.h_tipo = h_tipo;
	}
	public Habitaciones(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Habitaciones{"+", h_codigo=" + h_codigo+", h_estado=" + h_estado+", h_descripcion=" + h_descripcion+", h_cantcuartos=" + h_cantcuartos+", h_tipohabitacion=" + h_tipohabitacion+", h_especificacionhabitacion=" + h_especificacionhabitacion+", h_imghabitacion=" + h_imghabitacion+", h_costoxhora=" + h_costoxhora+", h_costoxdia=" + h_costoxdia+", h_costoadicional=" + h_costoadicional+", h_costoxsemana=" + h_costoxsemana+", h_costoespecial=" + h_costoespecial+", h_ubicacion=" + h_ubicacion+", h_numerohabitacion=" + h_numerohabitacion+", h_borrado=" + h_borrado+", h_area=" + h_area+", h_imagen6=" + h_imagen6+", h_imagen5=" + h_imagen5+", h_imagen4=" + h_imagen4+", h_imagen3=" + h_imagen3+", h_imagen2=" + h_imagen2+", h_imagen1=" + h_imagen1+", h_tipo=" + h_tipo+"}";

	}
	public Integer getH_codigo(){
		return h_codigo;
	}
	public void setH_codigo(Integer h_codigo){
		this.h_codigo = h_codigo;
	}
	public Integer getH_estado(){
		return h_estado;
	}
	public void setH_estado(Integer h_estado){
		this.h_estado = h_estado;
	}
	public String getH_descripcion(){
		return h_descripcion;
	}
	public void setH_descripcion(String h_descripcion){
		this.h_descripcion = h_descripcion;
	}
	public Integer getH_cantcuartos(){
		return h_cantcuartos;
	}
	public void setH_cantcuartos(Integer h_cantcuartos){
		this.h_cantcuartos = h_cantcuartos;
	}
	public Integer getH_tipohabitacion(){
		return h_tipohabitacion;
	}
	public void setH_tipohabitacion(Integer h_tipohabitacion){
		this.h_tipohabitacion = h_tipohabitacion;
	}
	public String getH_especificacionhabitacion(){
		return h_especificacionhabitacion;
	}
	public void setH_especificacionhabitacion(String h_especificacionhabitacion){
		this.h_especificacionhabitacion = h_especificacionhabitacion;
	}
	public Object getH_imghabitacion(){
		return h_imghabitacion;
	}
	public void setH_imghabitacion(Object h_imghabitacion){
		this.h_imghabitacion = h_imghabitacion;
	}
	public Double getH_costoxhora(){
		return h_costoxhora;
	}
	public void setH_costoxhora(Double h_costoxhora){
		this.h_costoxhora = h_costoxhora;
	}
	public Double getH_costoxdia(){
		return h_costoxdia;
	}
	public void setH_costoxdia(Double h_costoxdia){
		this.h_costoxdia = h_costoxdia;
	}
	public Double getH_costoadicional(){
		return h_costoadicional;
	}
	public void setH_costoadicional(Double h_costoadicional){
		this.h_costoadicional = h_costoadicional;
	}
	public Double getH_costoxsemana(){
		return h_costoxsemana;
	}
	public void setH_costoxsemana(Double h_costoxsemana){
		this.h_costoxsemana = h_costoxsemana;
	}
	public Double getH_costoespecial(){
		return h_costoespecial;
	}
	public void setH_costoespecial(Double h_costoespecial){
		this.h_costoespecial = h_costoespecial;
	}
	public String getH_ubicacion(){
		return h_ubicacion;
	}
	public void setH_ubicacion(String h_ubicacion){
		this.h_ubicacion = h_ubicacion;
	}
	public Integer getH_numerohabitacion(){
		return h_numerohabitacion;
	}
	public void setH_numerohabitacion(Integer h_numerohabitacion){
		this.h_numerohabitacion = h_numerohabitacion;
	}
	public Integer getH_borrado(){
		return h_borrado;
	}
	public void setH_borrado(Integer h_borrado){
		this.h_borrado = h_borrado;
	}
	public Object getH_area(){
		return h_area;
	}
	public void setH_area(Object h_area){
		this.h_area = h_area;
	}
	public Object getH_imagen6(){
		return h_imagen6;
	}
	public void setH_imagen6(Object h_imagen6){
		this.h_imagen6 = h_imagen6;
	}
	public Object getH_imagen5(){
		return h_imagen5;
	}
	public void setH_imagen5(Object h_imagen5){
		this.h_imagen5 = h_imagen5;
	}
	public Object getH_imagen4(){
		return h_imagen4;
	}
	public void setH_imagen4(Object h_imagen4){
		this.h_imagen4 = h_imagen4;
	}
	public Object getH_imagen3(){
		return h_imagen3;
	}
	public void setH_imagen3(Object h_imagen3){
		this.h_imagen3 = h_imagen3;
	}
	public Object getH_imagen2(){
		return h_imagen2;
	}
	public void setH_imagen2(Object h_imagen2){
		this.h_imagen2 = h_imagen2;
	}
	public Object getH_imagen1(){
		return h_imagen1;
	}
	public void setH_imagen1(Object h_imagen1){
		this.h_imagen1 = h_imagen1;
	}
	public Integer getH_tipo(){
		return h_tipo;
	}
	public void setH_tipo(Integer h_tipo){
		this.h_tipo = h_tipo;
	}

}