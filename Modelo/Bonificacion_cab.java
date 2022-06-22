package modelo;

public class Bonificacion_cab{
	Integer bn_codigo;
	Integer bn_numcompra;
	Integer bn_proveedor;
	Double bn_totitens;
	Integer bn_usuario;
	Integer bn_borrado;
	Object bn_fehcha;

	public Bonificacion_cab(Integer bn_codigo, Integer bn_numcompra, Integer bn_proveedor, Double bn_totitens, Integer bn_usuario, Integer bn_borrado, Object bn_fehcha){
		this.bn_codigo = bn_codigo;
		this.bn_numcompra = bn_numcompra;
		this.bn_proveedor = bn_proveedor;
		this.bn_totitens = bn_totitens;
		this.bn_usuario = bn_usuario;
		this.bn_borrado = bn_borrado;
		this.bn_fehcha = bn_fehcha;
	}
	public Bonificacion_cab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Bonificacion_cab{"+", bn_codigo=" + bn_codigo+", bn_numcompra=" + bn_numcompra+", bn_proveedor=" + bn_proveedor+", bn_totitens=" + bn_totitens+", bn_usuario=" + bn_usuario+", bn_borrado=" + bn_borrado+", bn_fehcha=" + bn_fehcha+"}";

	}
	public Integer getBn_codigo(){
		return bn_codigo;
	}
	public void setBn_codigo(Integer bn_codigo){
		this.bn_codigo = bn_codigo;
	}
	public Integer getBn_numcompra(){
		return bn_numcompra;
	}
	public void setBn_numcompra(Integer bn_numcompra){
		this.bn_numcompra = bn_numcompra;
	}
	public Integer getBn_proveedor(){
		return bn_proveedor;
	}
	public void setBn_proveedor(Integer bn_proveedor){
		this.bn_proveedor = bn_proveedor;
	}
	public Double getBn_totitens(){
		return bn_totitens;
	}
	public void setBn_totitens(Double bn_totitens){
		this.bn_totitens = bn_totitens;
	}
	public Integer getBn_usuario(){
		return bn_usuario;
	}
	public void setBn_usuario(Integer bn_usuario){
		this.bn_usuario = bn_usuario;
	}
	public Integer getBn_borrado(){
		return bn_borrado;
	}
	public void setBn_borrado(Integer bn_borrado){
		this.bn_borrado = bn_borrado;
	}
	public Object getBn_fehcha(){
		return bn_fehcha;
	}
	public void setBn_fehcha(Object bn_fehcha){
		this.bn_fehcha = bn_fehcha;
	}

}