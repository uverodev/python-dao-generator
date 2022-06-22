package modelo;

public class Palteracion{
	Integer palt_nro;
	String palt_codprod;
	Double palt_cantidad;
	Integer palt_operacion;
	Integer palt_numeroperacion;
	String palt_descripcion;
	Integer palt_borrado;
	String palt_caja;
	String palt_fecha;
	Integer palt_cierre;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer palt_nrocierre;
	Integer palt_cierrecajagennro;

	public Palteracion(Integer palt_nro, String palt_codprod, Double palt_cantidad, Integer palt_operacion, Integer palt_numeroperacion, String palt_descripcion, Integer palt_borrado, String palt_caja, String palt_fecha, Integer palt_cierre, String fechasct, Integer usuariosct, String maquinasct, Integer palt_nrocierre, Integer palt_cierrecajagennro){
		this.palt_nro = palt_nro;
		this.palt_codprod = palt_codprod;
		this.palt_cantidad = palt_cantidad;
		this.palt_operacion = palt_operacion;
		this.palt_numeroperacion = palt_numeroperacion;
		this.palt_descripcion = palt_descripcion;
		this.palt_borrado = palt_borrado;
		this.palt_caja = palt_caja;
		this.palt_fecha = palt_fecha;
		this.palt_cierre = palt_cierre;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.palt_nrocierre = palt_nrocierre;
		this.palt_cierrecajagennro = palt_cierrecajagennro;
	}
	public Palteracion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Palteracion{"+", palt_nro=" + palt_nro+", palt_codprod=" + palt_codprod+", palt_cantidad=" + palt_cantidad+", palt_operacion=" + palt_operacion+", palt_numeroperacion=" + palt_numeroperacion+", palt_descripcion=" + palt_descripcion+", palt_borrado=" + palt_borrado+", palt_caja=" + palt_caja+", palt_fecha=" + palt_fecha+", palt_cierre=" + palt_cierre+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", palt_nrocierre=" + palt_nrocierre+", palt_cierrecajagennro=" + palt_cierrecajagennro+"}";

	}
	public Integer getPalt_nro(){
		return palt_nro;
	}
	public void setPalt_nro(Integer palt_nro){
		this.palt_nro = palt_nro;
	}
	public String getPalt_codprod(){
		return palt_codprod;
	}
	public void setPalt_codprod(String palt_codprod){
		this.palt_codprod = palt_codprod;
	}
	public Double getPalt_cantidad(){
		return palt_cantidad;
	}
	public void setPalt_cantidad(Double palt_cantidad){
		this.palt_cantidad = palt_cantidad;
	}
	public Integer getPalt_operacion(){
		return palt_operacion;
	}
	public void setPalt_operacion(Integer palt_operacion){
		this.palt_operacion = palt_operacion;
	}
	public Integer getPalt_numeroperacion(){
		return palt_numeroperacion;
	}
	public void setPalt_numeroperacion(Integer palt_numeroperacion){
		this.palt_numeroperacion = palt_numeroperacion;
	}
	public String getPalt_descripcion(){
		return palt_descripcion;
	}
	public void setPalt_descripcion(String palt_descripcion){
		this.palt_descripcion = palt_descripcion;
	}
	public Integer getPalt_borrado(){
		return palt_borrado;
	}
	public void setPalt_borrado(Integer palt_borrado){
		this.palt_borrado = palt_borrado;
	}
	public String getPalt_caja(){
		return palt_caja;
	}
	public void setPalt_caja(String palt_caja){
		this.palt_caja = palt_caja;
	}
	public String getPalt_fecha(){
		return palt_fecha;
	}
	public void setPalt_fecha(String palt_fecha){
		this.palt_fecha = palt_fecha;
	}
	public Integer getPalt_cierre(){
		return palt_cierre;
	}
	public void setPalt_cierre(Integer palt_cierre){
		this.palt_cierre = palt_cierre;
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
	public Integer getPalt_nrocierre(){
		return palt_nrocierre;
	}
	public void setPalt_nrocierre(Integer palt_nrocierre){
		this.palt_nrocierre = palt_nrocierre;
	}
	public Integer getPalt_cierrecajagennro(){
		return palt_cierrecajagennro;
	}
	public void setPalt_cierrecajagennro(Integer palt_cierrecajagennro){
		this.palt_cierrecajagennro = palt_cierrecajagennro;
	}

}