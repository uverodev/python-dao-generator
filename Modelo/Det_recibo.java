package modelo;

public class Det_recibo{
	Integer dr_nro;
	Integer dr_nropago;
	Integer dr_nrocuota;
	Double dr_monto;
	String dr_fecha;
	Integer dr_borrado;
	Integer dr_numcredito;
	Double dr_montointeres;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Det_recibo(Integer dr_nro, Integer dr_nropago, Integer dr_nrocuota, Double dr_monto, String dr_fecha, Integer dr_borrado, Integer dr_numcredito, Double dr_montointeres, String fechasct, Integer usuariosct, String maquinasct){
		this.dr_nro = dr_nro;
		this.dr_nropago = dr_nropago;
		this.dr_nrocuota = dr_nrocuota;
		this.dr_monto = dr_monto;
		this.dr_fecha = dr_fecha;
		this.dr_borrado = dr_borrado;
		this.dr_numcredito = dr_numcredito;
		this.dr_montointeres = dr_montointeres;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Det_recibo(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Det_recibo{"+", dr_nro=" + dr_nro+", dr_nropago=" + dr_nropago+", dr_nrocuota=" + dr_nrocuota+", dr_monto=" + dr_monto+", dr_fecha=" + dr_fecha+", dr_borrado=" + dr_borrado+", dr_numcredito=" + dr_numcredito+", dr_montointeres=" + dr_montointeres+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getDr_nro(){
		return dr_nro;
	}
	public void setDr_nro(Integer dr_nro){
		this.dr_nro = dr_nro;
	}
	public Integer getDr_nropago(){
		return dr_nropago;
	}
	public void setDr_nropago(Integer dr_nropago){
		this.dr_nropago = dr_nropago;
	}
	public Integer getDr_nrocuota(){
		return dr_nrocuota;
	}
	public void setDr_nrocuota(Integer dr_nrocuota){
		this.dr_nrocuota = dr_nrocuota;
	}
	public Double getDr_monto(){
		return dr_monto;
	}
	public void setDr_monto(Double dr_monto){
		this.dr_monto = dr_monto;
	}
	public String getDr_fecha(){
		return dr_fecha;
	}
	public void setDr_fecha(String dr_fecha){
		this.dr_fecha = dr_fecha;
	}
	public Integer getDr_borrado(){
		return dr_borrado;
	}
	public void setDr_borrado(Integer dr_borrado){
		this.dr_borrado = dr_borrado;
	}
	public Integer getDr_numcredito(){
		return dr_numcredito;
	}
	public void setDr_numcredito(Integer dr_numcredito){
		this.dr_numcredito = dr_numcredito;
	}
	public Double getDr_montointeres(){
		return dr_montointeres;
	}
	public void setDr_montointeres(Double dr_montointeres){
		this.dr_montointeres = dr_montointeres;
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