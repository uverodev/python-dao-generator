package modelo;

public class Pagare{
	Integer pa_nro;
	String pa_cedcodeudor;
	Integer pa_numcredito;
	String pa_fechavencimiento;
	String pa_interes;
	String pa_nrofactura;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	String pa_fecha;
	String pa_hora;
	Double pa_monto;
	Integer pa_moneda;
	Integer pa_cliente;
	Integer pa_borrado;
	Integer pa_comprobante;

	public Pagare(Integer pa_nro, String pa_cedcodeudor, Integer pa_numcredito, String pa_fechavencimiento, String pa_interes, String pa_nrofactura, String fechasct, Integer usuariosct, String maquinasct, String pa_fecha, String pa_hora, Double pa_monto, Integer pa_moneda, Integer pa_cliente, Integer pa_borrado, Integer pa_comprobante){
		this.pa_nro = pa_nro;
		this.pa_cedcodeudor = pa_cedcodeudor;
		this.pa_numcredito = pa_numcredito;
		this.pa_fechavencimiento = pa_fechavencimiento;
		this.pa_interes = pa_interes;
		this.pa_nrofactura = pa_nrofactura;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.pa_fecha = pa_fecha;
		this.pa_hora = pa_hora;
		this.pa_monto = pa_monto;
		this.pa_moneda = pa_moneda;
		this.pa_cliente = pa_cliente;
		this.pa_borrado = pa_borrado;
		this.pa_comprobante = pa_comprobante;
	}
	public Pagare(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pagare{"+", pa_nro=" + pa_nro+", pa_cedcodeudor=" + pa_cedcodeudor+", pa_numcredito=" + pa_numcredito+", pa_fechavencimiento=" + pa_fechavencimiento+", pa_interes=" + pa_interes+", pa_nrofactura=" + pa_nrofactura+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", pa_fecha=" + pa_fecha+", pa_hora=" + pa_hora+", pa_monto=" + pa_monto+", pa_moneda=" + pa_moneda+", pa_cliente=" + pa_cliente+", pa_borrado=" + pa_borrado+", pa_comprobante=" + pa_comprobante+"}";

	}
	public Integer getPa_nro(){
		return pa_nro;
	}
	public void setPa_nro(Integer pa_nro){
		this.pa_nro = pa_nro;
	}
	public String getPa_cedcodeudor(){
		return pa_cedcodeudor;
	}
	public void setPa_cedcodeudor(String pa_cedcodeudor){
		this.pa_cedcodeudor = pa_cedcodeudor;
	}
	public Integer getPa_numcredito(){
		return pa_numcredito;
	}
	public void setPa_numcredito(Integer pa_numcredito){
		this.pa_numcredito = pa_numcredito;
	}
	public String getPa_fechavencimiento(){
		return pa_fechavencimiento;
	}
	public void setPa_fechavencimiento(String pa_fechavencimiento){
		this.pa_fechavencimiento = pa_fechavencimiento;
	}
	public String getPa_interes(){
		return pa_interes;
	}
	public void setPa_interes(String pa_interes){
		this.pa_interes = pa_interes;
	}
	public String getPa_nrofactura(){
		return pa_nrofactura;
	}
	public void setPa_nrofactura(String pa_nrofactura){
		this.pa_nrofactura = pa_nrofactura;
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
	public String getPa_fecha(){
		return pa_fecha;
	}
	public void setPa_fecha(String pa_fecha){
		this.pa_fecha = pa_fecha;
	}
	public String getPa_hora(){
		return pa_hora;
	}
	public void setPa_hora(String pa_hora){
		this.pa_hora = pa_hora;
	}
	public Double getPa_monto(){
		return pa_monto;
	}
	public void setPa_monto(Double pa_monto){
		this.pa_monto = pa_monto;
	}
	public Integer getPa_moneda(){
		return pa_moneda;
	}
	public void setPa_moneda(Integer pa_moneda){
		this.pa_moneda = pa_moneda;
	}
	public Integer getPa_cliente(){
		return pa_cliente;
	}
	public void setPa_cliente(Integer pa_cliente){
		this.pa_cliente = pa_cliente;
	}
	public Integer getPa_borrado(){
		return pa_borrado;
	}
	public void setPa_borrado(Integer pa_borrado){
		this.pa_borrado = pa_borrado;
	}
	public Integer getPa_comprobante(){
		return pa_comprobante;
	}
	public void setPa_comprobante(Integer pa_comprobante){
		this.pa_comprobante = pa_comprobante;
	}

}