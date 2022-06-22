package modelo;

public class Depstock{
	Integer sto_nro;
	String sto_codprod;
	Double sto_cantidad;
	Double sto_precompra;
	String sto_lote;
	String sto_vencimiento;
	Integer sto_deposito;
	Integer sto_borrado;
	String sto_fecha;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer sto_verifica;

	public Depstock(Integer sto_nro, String sto_codprod, Double sto_cantidad, Double sto_precompra, String sto_lote, String sto_vencimiento, Integer sto_deposito, Integer sto_borrado, String sto_fecha, String fechasct, Integer usuariosct, String maquinasct, Integer sto_verifica){
		this.sto_nro = sto_nro;
		this.sto_codprod = sto_codprod;
		this.sto_cantidad = sto_cantidad;
		this.sto_precompra = sto_precompra;
		this.sto_lote = sto_lote;
		this.sto_vencimiento = sto_vencimiento;
		this.sto_deposito = sto_deposito;
		this.sto_borrado = sto_borrado;
		this.sto_fecha = sto_fecha;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.sto_verifica = sto_verifica;
	}
	public Depstock(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Depstock{"+", sto_nro=" + sto_nro+", sto_codprod=" + sto_codprod+", sto_cantidad=" + sto_cantidad+", sto_precompra=" + sto_precompra+", sto_lote=" + sto_lote+", sto_vencimiento=" + sto_vencimiento+", sto_deposito=" + sto_deposito+", sto_borrado=" + sto_borrado+", sto_fecha=" + sto_fecha+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", sto_verifica=" + sto_verifica+"}";

	}
	public Integer getSto_nro(){
		return sto_nro;
	}
	public void setSto_nro(Integer sto_nro){
		this.sto_nro = sto_nro;
	}
	public String getSto_codprod(){
		return sto_codprod;
	}
	public void setSto_codprod(String sto_codprod){
		this.sto_codprod = sto_codprod;
	}
	public Double getSto_cantidad(){
		return sto_cantidad;
	}
	public void setSto_cantidad(Double sto_cantidad){
		this.sto_cantidad = sto_cantidad;
	}
	public Double getSto_precompra(){
		return sto_precompra;
	}
	public void setSto_precompra(Double sto_precompra){
		this.sto_precompra = sto_precompra;
	}
	public String getSto_lote(){
		return sto_lote;
	}
	public void setSto_lote(String sto_lote){
		this.sto_lote = sto_lote;
	}
	public String getSto_vencimiento(){
		return sto_vencimiento;
	}
	public void setSto_vencimiento(String sto_vencimiento){
		this.sto_vencimiento = sto_vencimiento;
	}
	public Integer getSto_deposito(){
		return sto_deposito;
	}
	public void setSto_deposito(Integer sto_deposito){
		this.sto_deposito = sto_deposito;
	}
	public Integer getSto_borrado(){
		return sto_borrado;
	}
	public void setSto_borrado(Integer sto_borrado){
		this.sto_borrado = sto_borrado;
	}
	public String getSto_fecha(){
		return sto_fecha;
	}
	public void setSto_fecha(String sto_fecha){
		this.sto_fecha = sto_fecha;
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
	public Integer getSto_verifica(){
		return sto_verifica;
	}
	public void setSto_verifica(Integer sto_verifica){
		this.sto_verifica = sto_verifica;
	}

}