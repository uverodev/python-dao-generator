package modelo;

public class Gasto{
	Integer g_nro;
	String g_fecha;
	String g_fechacarga;
	Double g_monto;
	String g_motivo;
	Integer g_moneda;
	Integer g_borrado;
	Integer g_usuario;
	String g_caja;
	Integer g_cierre;
	String g_numfactura;
	Integer g_tipgasto;
	Integer g_deposito;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer g_nrocierre;
	Integer g_cierrecajagennro;
	Double g_valor;

	public Gasto(Integer g_nro, String g_fecha, String g_fechacarga, Double g_monto, String g_motivo, Integer g_moneda, Integer g_borrado, Integer g_usuario, String g_caja, Integer g_cierre, String g_numfactura, Integer g_tipgasto, Integer g_deposito, String fechasct, Integer usuariosct, String maquinasct, Integer g_nrocierre, Integer g_cierrecajagennro, Double g_valor){
		this.g_nro = g_nro;
		this.g_fecha = g_fecha;
		this.g_fechacarga = g_fechacarga;
		this.g_monto = g_monto;
		this.g_motivo = g_motivo;
		this.g_moneda = g_moneda;
		this.g_borrado = g_borrado;
		this.g_usuario = g_usuario;
		this.g_caja = g_caja;
		this.g_cierre = g_cierre;
		this.g_numfactura = g_numfactura;
		this.g_tipgasto = g_tipgasto;
		this.g_deposito = g_deposito;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.g_nrocierre = g_nrocierre;
		this.g_cierrecajagennro = g_cierrecajagennro;
		this.g_valor = g_valor;
	}
	public Gasto(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Gasto{"+", g_nro=" + g_nro+", g_fecha=" + g_fecha+", g_fechacarga=" + g_fechacarga+", g_monto=" + g_monto+", g_motivo=" + g_motivo+", g_moneda=" + g_moneda+", g_borrado=" + g_borrado+", g_usuario=" + g_usuario+", g_caja=" + g_caja+", g_cierre=" + g_cierre+", g_numfactura=" + g_numfactura+", g_tipgasto=" + g_tipgasto+", g_deposito=" + g_deposito+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", g_nrocierre=" + g_nrocierre+", g_cierrecajagennro=" + g_cierrecajagennro+", g_valor=" + g_valor+"}";

	}
	public Integer getG_nro(){
		return g_nro;
	}
	public void setG_nro(Integer g_nro){
		this.g_nro = g_nro;
	}
	public String getG_fecha(){
		return g_fecha;
	}
	public void setG_fecha(String g_fecha){
		this.g_fecha = g_fecha;
	}
	public String getG_fechacarga(){
		return g_fechacarga;
	}
	public void setG_fechacarga(String g_fechacarga){
		this.g_fechacarga = g_fechacarga;
	}
	public Double getG_monto(){
		return g_monto;
	}
	public void setG_monto(Double g_monto){
		this.g_monto = g_monto;
	}
	public String getG_motivo(){
		return g_motivo;
	}
	public void setG_motivo(String g_motivo){
		this.g_motivo = g_motivo;
	}
	public Integer getG_moneda(){
		return g_moneda;
	}
	public void setG_moneda(Integer g_moneda){
		this.g_moneda = g_moneda;
	}
	public Integer getG_borrado(){
		return g_borrado;
	}
	public void setG_borrado(Integer g_borrado){
		this.g_borrado = g_borrado;
	}
	public Integer getG_usuario(){
		return g_usuario;
	}
	public void setG_usuario(Integer g_usuario){
		this.g_usuario = g_usuario;
	}
	public String getG_caja(){
		return g_caja;
	}
	public void setG_caja(String g_caja){
		this.g_caja = g_caja;
	}
	public Integer getG_cierre(){
		return g_cierre;
	}
	public void setG_cierre(Integer g_cierre){
		this.g_cierre = g_cierre;
	}
	public String getG_numfactura(){
		return g_numfactura;
	}
	public void setG_numfactura(String g_numfactura){
		this.g_numfactura = g_numfactura;
	}
	public Integer getG_tipgasto(){
		return g_tipgasto;
	}
	public void setG_tipgasto(Integer g_tipgasto){
		this.g_tipgasto = g_tipgasto;
	}
	public Integer getG_deposito(){
		return g_deposito;
	}
	public void setG_deposito(Integer g_deposito){
		this.g_deposito = g_deposito;
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
	public Integer getG_nrocierre(){
		return g_nrocierre;
	}
	public void setG_nrocierre(Integer g_nrocierre){
		this.g_nrocierre = g_nrocierre;
	}
	public Integer getG_cierrecajagennro(){
		return g_cierrecajagennro;
	}
	public void setG_cierrecajagennro(Integer g_cierrecajagennro){
		this.g_cierrecajagennro = g_cierrecajagennro;
	}
	public Double getG_valor(){
		return g_valor;
	}
	public void setG_valor(Double g_valor){
		this.g_valor = g_valor;
	}

}