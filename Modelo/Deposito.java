package modelo;

public class Deposito{
	Integer dep_nro;
	String dep_descripcion;
	String dep_encargado;
	String dep_telefono;
	String dep_direccion;
	Integer dep_borrado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	String dep_host;
	String dep_bd;
	Integer dep_deposito;

	public Deposito(Integer dep_nro, String dep_descripcion, String dep_encargado, String dep_telefono, String dep_direccion, Integer dep_borrado, String fechasct, Integer usuariosct, String maquinasct, String dep_host, String dep_bd, Integer dep_deposito){
		this.dep_nro = dep_nro;
		this.dep_descripcion = dep_descripcion;
		this.dep_encargado = dep_encargado;
		this.dep_telefono = dep_telefono;
		this.dep_direccion = dep_direccion;
		this.dep_borrado = dep_borrado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.dep_host = dep_host;
		this.dep_bd = dep_bd;
		this.dep_deposito = dep_deposito;
	}
	public Deposito(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Deposito{"+", dep_nro=" + dep_nro+", dep_descripcion=" + dep_descripcion+", dep_encargado=" + dep_encargado+", dep_telefono=" + dep_telefono+", dep_direccion=" + dep_direccion+", dep_borrado=" + dep_borrado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", dep_host=" + dep_host+", dep_bd=" + dep_bd+", dep_deposito=" + dep_deposito+"}";

	}
	public Integer getDep_nro(){
		return dep_nro;
	}
	public void setDep_nro(Integer dep_nro){
		this.dep_nro = dep_nro;
	}
	public String getDep_descripcion(){
		return dep_descripcion;
	}
	public void setDep_descripcion(String dep_descripcion){
		this.dep_descripcion = dep_descripcion;
	}
	public String getDep_encargado(){
		return dep_encargado;
	}
	public void setDep_encargado(String dep_encargado){
		this.dep_encargado = dep_encargado;
	}
	public String getDep_telefono(){
		return dep_telefono;
	}
	public void setDep_telefono(String dep_telefono){
		this.dep_telefono = dep_telefono;
	}
	public String getDep_direccion(){
		return dep_direccion;
	}
	public void setDep_direccion(String dep_direccion){
		this.dep_direccion = dep_direccion;
	}
	public Integer getDep_borrado(){
		return dep_borrado;
	}
	public void setDep_borrado(Integer dep_borrado){
		this.dep_borrado = dep_borrado;
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
	public String getDep_host(){
		return dep_host;
	}
	public void setDep_host(String dep_host){
		this.dep_host = dep_host;
	}
	public String getDep_bd(){
		return dep_bd;
	}
	public void setDep_bd(String dep_bd){
		this.dep_bd = dep_bd;
	}
	public Integer getDep_deposito(){
		return dep_deposito;
	}
	public void setDep_deposito(Integer dep_deposito){
		this.dep_deposito = dep_deposito;
	}

}