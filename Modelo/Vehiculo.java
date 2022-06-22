package modelo;

public class Vehiculo{
	Integer ve_nro;
	String ve_detprod;
	String ve_nrochasis;
	Integer ve_marca;
	Integer ve_color;
	Integer ve_procedencia;
	Integer ve_modelo;
	Integer ve_tipvehiculo;
	Integer ve_anfabricacion;
	Integer ve_importador;
	Integer ve_cedverde;
	Integer ve_cedmarron;
	Integer ve_titulo;
	Integer ve_chapa;
	Integer ve_contrato;
	Integer ve_otros;
	String ve_nromotor;
	Integer ve_borrado;
	Integer ve_vendido;
	String ve_cliente;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Vehiculo(Integer ve_nro, String ve_detprod, String ve_nrochasis, Integer ve_marca, Integer ve_color, Integer ve_procedencia, Integer ve_modelo, Integer ve_tipvehiculo, Integer ve_anfabricacion, Integer ve_importador, Integer ve_cedverde, Integer ve_cedmarron, Integer ve_titulo, Integer ve_chapa, Integer ve_contrato, Integer ve_otros, String ve_nromotor, Integer ve_borrado, Integer ve_vendido, String ve_cliente, String fechasct, Integer usuariosct, String maquinasct){
		this.ve_nro = ve_nro;
		this.ve_detprod = ve_detprod;
		this.ve_nrochasis = ve_nrochasis;
		this.ve_marca = ve_marca;
		this.ve_color = ve_color;
		this.ve_procedencia = ve_procedencia;
		this.ve_modelo = ve_modelo;
		this.ve_tipvehiculo = ve_tipvehiculo;
		this.ve_anfabricacion = ve_anfabricacion;
		this.ve_importador = ve_importador;
		this.ve_cedverde = ve_cedverde;
		this.ve_cedmarron = ve_cedmarron;
		this.ve_titulo = ve_titulo;
		this.ve_chapa = ve_chapa;
		this.ve_contrato = ve_contrato;
		this.ve_otros = ve_otros;
		this.ve_nromotor = ve_nromotor;
		this.ve_borrado = ve_borrado;
		this.ve_vendido = ve_vendido;
		this.ve_cliente = ve_cliente;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Vehiculo(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Vehiculo{"+", ve_nro=" + ve_nro+", ve_detprod=" + ve_detprod+", ve_nrochasis=" + ve_nrochasis+", ve_marca=" + ve_marca+", ve_color=" + ve_color+", ve_procedencia=" + ve_procedencia+", ve_modelo=" + ve_modelo+", ve_tipvehiculo=" + ve_tipvehiculo+", ve_anfabricacion=" + ve_anfabricacion+", ve_importador=" + ve_importador+", ve_cedverde=" + ve_cedverde+", ve_cedmarron=" + ve_cedmarron+", ve_titulo=" + ve_titulo+", ve_chapa=" + ve_chapa+", ve_contrato=" + ve_contrato+", ve_otros=" + ve_otros+", ve_nromotor=" + ve_nromotor+", ve_borrado=" + ve_borrado+", ve_vendido=" + ve_vendido+", ve_cliente=" + ve_cliente+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getVe_nro(){
		return ve_nro;
	}
	public void setVe_nro(Integer ve_nro){
		this.ve_nro = ve_nro;
	}
	public String getVe_detprod(){
		return ve_detprod;
	}
	public void setVe_detprod(String ve_detprod){
		this.ve_detprod = ve_detprod;
	}
	public String getVe_nrochasis(){
		return ve_nrochasis;
	}
	public void setVe_nrochasis(String ve_nrochasis){
		this.ve_nrochasis = ve_nrochasis;
	}
	public Integer getVe_marca(){
		return ve_marca;
	}
	public void setVe_marca(Integer ve_marca){
		this.ve_marca = ve_marca;
	}
	public Integer getVe_color(){
		return ve_color;
	}
	public void setVe_color(Integer ve_color){
		this.ve_color = ve_color;
	}
	public Integer getVe_procedencia(){
		return ve_procedencia;
	}
	public void setVe_procedencia(Integer ve_procedencia){
		this.ve_procedencia = ve_procedencia;
	}
	public Integer getVe_modelo(){
		return ve_modelo;
	}
	public void setVe_modelo(Integer ve_modelo){
		this.ve_modelo = ve_modelo;
	}
	public Integer getVe_tipvehiculo(){
		return ve_tipvehiculo;
	}
	public void setVe_tipvehiculo(Integer ve_tipvehiculo){
		this.ve_tipvehiculo = ve_tipvehiculo;
	}
	public Integer getVe_anfabricacion(){
		return ve_anfabricacion;
	}
	public void setVe_anfabricacion(Integer ve_anfabricacion){
		this.ve_anfabricacion = ve_anfabricacion;
	}
	public Integer getVe_importador(){
		return ve_importador;
	}
	public void setVe_importador(Integer ve_importador){
		this.ve_importador = ve_importador;
	}
	public Integer getVe_cedverde(){
		return ve_cedverde;
	}
	public void setVe_cedverde(Integer ve_cedverde){
		this.ve_cedverde = ve_cedverde;
	}
	public Integer getVe_cedmarron(){
		return ve_cedmarron;
	}
	public void setVe_cedmarron(Integer ve_cedmarron){
		this.ve_cedmarron = ve_cedmarron;
	}
	public Integer getVe_titulo(){
		return ve_titulo;
	}
	public void setVe_titulo(Integer ve_titulo){
		this.ve_titulo = ve_titulo;
	}
	public Integer getVe_chapa(){
		return ve_chapa;
	}
	public void setVe_chapa(Integer ve_chapa){
		this.ve_chapa = ve_chapa;
	}
	public Integer getVe_contrato(){
		return ve_contrato;
	}
	public void setVe_contrato(Integer ve_contrato){
		this.ve_contrato = ve_contrato;
	}
	public Integer getVe_otros(){
		return ve_otros;
	}
	public void setVe_otros(Integer ve_otros){
		this.ve_otros = ve_otros;
	}
	public String getVe_nromotor(){
		return ve_nromotor;
	}
	public void setVe_nromotor(String ve_nromotor){
		this.ve_nromotor = ve_nromotor;
	}
	public Integer getVe_borrado(){
		return ve_borrado;
	}
	public void setVe_borrado(Integer ve_borrado){
		this.ve_borrado = ve_borrado;
	}
	public Integer getVe_vendido(){
		return ve_vendido;
	}
	public void setVe_vendido(Integer ve_vendido){
		this.ve_vendido = ve_vendido;
	}
	public String getVe_cliente(){
		return ve_cliente;
	}
	public void setVe_cliente(String ve_cliente){
		this.ve_cliente = ve_cliente;
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