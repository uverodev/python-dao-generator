package modelo;

public class Deuinicial{
	Integer dini_nro;
	String dini_fecha;
	String dini_fecoperacion;
	String dini_fecpago;
	Double dini_totoperacion;
	Integer dini_cuorestante;
	Integer dini_usuario;
	Double dini_totpagado;
	String dini_cliente;
	String dini_producto;
	Integer dini_borrado;
	Integer dini_numcredito;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Deuinicial(Integer dini_nro, String dini_fecha, String dini_fecoperacion, String dini_fecpago, Double dini_totoperacion, Integer dini_cuorestante, Integer dini_usuario, Double dini_totpagado, String dini_cliente, String dini_producto, Integer dini_borrado, Integer dini_numcredito, String fechasct, Integer usuariosct, String maquinasct){
		this.dini_nro = dini_nro;
		this.dini_fecha = dini_fecha;
		this.dini_fecoperacion = dini_fecoperacion;
		this.dini_fecpago = dini_fecpago;
		this.dini_totoperacion = dini_totoperacion;
		this.dini_cuorestante = dini_cuorestante;
		this.dini_usuario = dini_usuario;
		this.dini_totpagado = dini_totpagado;
		this.dini_cliente = dini_cliente;
		this.dini_producto = dini_producto;
		this.dini_borrado = dini_borrado;
		this.dini_numcredito = dini_numcredito;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Deuinicial(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Deuinicial{"+", dini_nro=" + dini_nro+", dini_fecha=" + dini_fecha+", dini_fecoperacion=" + dini_fecoperacion+", dini_fecpago=" + dini_fecpago+", dini_totoperacion=" + dini_totoperacion+", dini_cuorestante=" + dini_cuorestante+", dini_usuario=" + dini_usuario+", dini_totpagado=" + dini_totpagado+", dini_cliente=" + dini_cliente+", dini_producto=" + dini_producto+", dini_borrado=" + dini_borrado+", dini_numcredito=" + dini_numcredito+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getDini_nro(){
		return dini_nro;
	}
	public void setDini_nro(Integer dini_nro){
		this.dini_nro = dini_nro;
	}
	public String getDini_fecha(){
		return dini_fecha;
	}
	public void setDini_fecha(String dini_fecha){
		this.dini_fecha = dini_fecha;
	}
	public String getDini_fecoperacion(){
		return dini_fecoperacion;
	}
	public void setDini_fecoperacion(String dini_fecoperacion){
		this.dini_fecoperacion = dini_fecoperacion;
	}
	public String getDini_fecpago(){
		return dini_fecpago;
	}
	public void setDini_fecpago(String dini_fecpago){
		this.dini_fecpago = dini_fecpago;
	}
	public Double getDini_totoperacion(){
		return dini_totoperacion;
	}
	public void setDini_totoperacion(Double dini_totoperacion){
		this.dini_totoperacion = dini_totoperacion;
	}
	public Integer getDini_cuorestante(){
		return dini_cuorestante;
	}
	public void setDini_cuorestante(Integer dini_cuorestante){
		this.dini_cuorestante = dini_cuorestante;
	}
	public Integer getDini_usuario(){
		return dini_usuario;
	}
	public void setDini_usuario(Integer dini_usuario){
		this.dini_usuario = dini_usuario;
	}
	public Double getDini_totpagado(){
		return dini_totpagado;
	}
	public void setDini_totpagado(Double dini_totpagado){
		this.dini_totpagado = dini_totpagado;
	}
	public String getDini_cliente(){
		return dini_cliente;
	}
	public void setDini_cliente(String dini_cliente){
		this.dini_cliente = dini_cliente;
	}
	public String getDini_producto(){
		return dini_producto;
	}
	public void setDini_producto(String dini_producto){
		this.dini_producto = dini_producto;
	}
	public Integer getDini_borrado(){
		return dini_borrado;
	}
	public void setDini_borrado(Integer dini_borrado){
		this.dini_borrado = dini_borrado;
	}
	public Integer getDini_numcredito(){
		return dini_numcredito;
	}
	public void setDini_numcredito(Integer dini_numcredito){
		this.dini_numcredito = dini_numcredito;
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