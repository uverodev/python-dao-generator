package modelo;

public class Precios{
	Integer pp_codigo;
	Object pp_codprod;
	Double pp_cantidad;
	Double pp_precio;
	Integer pp_proveedor;
	Integer pp_borrado;
	String pp_fecha;
	Integer pp_usuario;

	public Precios(Integer pp_codigo, Object pp_codprod, Double pp_cantidad, Double pp_precio, Integer pp_proveedor, Integer pp_borrado, String pp_fecha, Integer pp_usuario){
		this.pp_codigo = pp_codigo;
		this.pp_codprod = pp_codprod;
		this.pp_cantidad = pp_cantidad;
		this.pp_precio = pp_precio;
		this.pp_proveedor = pp_proveedor;
		this.pp_borrado = pp_borrado;
		this.pp_fecha = pp_fecha;
		this.pp_usuario = pp_usuario;
	}
	public Precios(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Precios{"+", pp_codigo=" + pp_codigo+", pp_codprod=" + pp_codprod+", pp_cantidad=" + pp_cantidad+", pp_precio=" + pp_precio+", pp_proveedor=" + pp_proveedor+", pp_borrado=" + pp_borrado+", pp_fecha=" + pp_fecha+", pp_usuario=" + pp_usuario+"}";

	}
	public Integer getPp_codigo(){
		return pp_codigo;
	}
	public void setPp_codigo(Integer pp_codigo){
		this.pp_codigo = pp_codigo;
	}
	public Object getPp_codprod(){
		return pp_codprod;
	}
	public void setPp_codprod(Object pp_codprod){
		this.pp_codprod = pp_codprod;
	}
	public Double getPp_cantidad(){
		return pp_cantidad;
	}
	public void setPp_cantidad(Double pp_cantidad){
		this.pp_cantidad = pp_cantidad;
	}
	public Double getPp_precio(){
		return pp_precio;
	}
	public void setPp_precio(Double pp_precio){
		this.pp_precio = pp_precio;
	}
	public Integer getPp_proveedor(){
		return pp_proveedor;
	}
	public void setPp_proveedor(Integer pp_proveedor){
		this.pp_proveedor = pp_proveedor;
	}
	public Integer getPp_borrado(){
		return pp_borrado;
	}
	public void setPp_borrado(Integer pp_borrado){
		this.pp_borrado = pp_borrado;
	}
	public String getPp_fecha(){
		return pp_fecha;
	}
	public void setPp_fecha(String pp_fecha){
		this.pp_fecha = pp_fecha;
	}
	public Integer getPp_usuario(){
		return pp_usuario;
	}
	public void setPp_usuario(Integer pp_usuario){
		this.pp_usuario = pp_usuario;
	}

}