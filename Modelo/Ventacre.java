package modelo;

public class Ventacre{
	Integer venc_nro;
	Integer venc_tipoperacion;
	Integer venc_numventa;
	String venc_cliente;
	Integer venc_cobrador;
	String venc_fecha;
	String venc_fechac;
	Integer venc_tippago;
	Integer venc_tipcobro;
	Integer venc_cantcuota;
	String venc_fechaini;
	Double venc_interescre;
	Double venc_montxcuot;
	Double venc_totalc;
	Double venc_entretot;
	Double venc_saldo;
	Double venc_cdolar;
	Double venc_creal;
	Double venc_cpeso;
	Double venc_ceuro;
	Integer venc_cancelado;
	Integer venc_borrado;
	String venc_fechaentrega;
	Double venc_inientrega;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Double venc_devolucion;
	Integer venc_zafra;

	public Ventacre(Integer venc_nro, Integer venc_tipoperacion, Integer venc_numventa, String venc_cliente, Integer venc_cobrador, String venc_fecha, String venc_fechac, Integer venc_tippago, Integer venc_tipcobro, Integer venc_cantcuota, String venc_fechaini, Double venc_interescre, Double venc_montxcuot, Double venc_totalc, Double venc_entretot, Double venc_saldo, Double venc_cdolar, Double venc_creal, Double venc_cpeso, Double venc_ceuro, Integer venc_cancelado, Integer venc_borrado, String venc_fechaentrega, Double venc_inientrega, String fechasct, Integer usuariosct, String maquinasct, Double venc_devolucion, Integer venc_zafra){
		this.venc_nro = venc_nro;
		this.venc_tipoperacion = venc_tipoperacion;
		this.venc_numventa = venc_numventa;
		this.venc_cliente = venc_cliente;
		this.venc_cobrador = venc_cobrador;
		this.venc_fecha = venc_fecha;
		this.venc_fechac = venc_fechac;
		this.venc_tippago = venc_tippago;
		this.venc_tipcobro = venc_tipcobro;
		this.venc_cantcuota = venc_cantcuota;
		this.venc_fechaini = venc_fechaini;
		this.venc_interescre = venc_interescre;
		this.venc_montxcuot = venc_montxcuot;
		this.venc_totalc = venc_totalc;
		this.venc_entretot = venc_entretot;
		this.venc_saldo = venc_saldo;
		this.venc_cdolar = venc_cdolar;
		this.venc_creal = venc_creal;
		this.venc_cpeso = venc_cpeso;
		this.venc_ceuro = venc_ceuro;
		this.venc_cancelado = venc_cancelado;
		this.venc_borrado = venc_borrado;
		this.venc_fechaentrega = venc_fechaentrega;
		this.venc_inientrega = venc_inientrega;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.venc_devolucion = venc_devolucion;
		this.venc_zafra = venc_zafra;
	}
	public Ventacre(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventacre{"+", venc_nro=" + venc_nro+", venc_tipoperacion=" + venc_tipoperacion+", venc_numventa=" + venc_numventa+", venc_cliente=" + venc_cliente+", venc_cobrador=" + venc_cobrador+", venc_fecha=" + venc_fecha+", venc_fechac=" + venc_fechac+", venc_tippago=" + venc_tippago+", venc_tipcobro=" + venc_tipcobro+", venc_cantcuota=" + venc_cantcuota+", venc_fechaini=" + venc_fechaini+", venc_interescre=" + venc_interescre+", venc_montxcuot=" + venc_montxcuot+", venc_totalc=" + venc_totalc+", venc_entretot=" + venc_entretot+", venc_saldo=" + venc_saldo+", venc_cdolar=" + venc_cdolar+", venc_creal=" + venc_creal+", venc_cpeso=" + venc_cpeso+", venc_ceuro=" + venc_ceuro+", venc_cancelado=" + venc_cancelado+", venc_borrado=" + venc_borrado+", venc_fechaentrega=" + venc_fechaentrega+", venc_inientrega=" + venc_inientrega+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", venc_devolucion=" + venc_devolucion+", venc_zafra=" + venc_zafra+"}";

	}
	public Integer getVenc_nro(){
		return venc_nro;
	}
	public void setVenc_nro(Integer venc_nro){
		this.venc_nro = venc_nro;
	}
	public Integer getVenc_tipoperacion(){
		return venc_tipoperacion;
	}
	public void setVenc_tipoperacion(Integer venc_tipoperacion){
		this.venc_tipoperacion = venc_tipoperacion;
	}
	public Integer getVenc_numventa(){
		return venc_numventa;
	}
	public void setVenc_numventa(Integer venc_numventa){
		this.venc_numventa = venc_numventa;
	}
	public String getVenc_cliente(){
		return venc_cliente;
	}
	public void setVenc_cliente(String venc_cliente){
		this.venc_cliente = venc_cliente;
	}
	public Integer getVenc_cobrador(){
		return venc_cobrador;
	}
	public void setVenc_cobrador(Integer venc_cobrador){
		this.venc_cobrador = venc_cobrador;
	}
	public String getVenc_fecha(){
		return venc_fecha;
	}
	public void setVenc_fecha(String venc_fecha){
		this.venc_fecha = venc_fecha;
	}
	public String getVenc_fechac(){
		return venc_fechac;
	}
	public void setVenc_fechac(String venc_fechac){
		this.venc_fechac = venc_fechac;
	}
	public Integer getVenc_tippago(){
		return venc_tippago;
	}
	public void setVenc_tippago(Integer venc_tippago){
		this.venc_tippago = venc_tippago;
	}
	public Integer getVenc_tipcobro(){
		return venc_tipcobro;
	}
	public void setVenc_tipcobro(Integer venc_tipcobro){
		this.venc_tipcobro = venc_tipcobro;
	}
	public Integer getVenc_cantcuota(){
		return venc_cantcuota;
	}
	public void setVenc_cantcuota(Integer venc_cantcuota){
		this.venc_cantcuota = venc_cantcuota;
	}
	public String getVenc_fechaini(){
		return venc_fechaini;
	}
	public void setVenc_fechaini(String venc_fechaini){
		this.venc_fechaini = venc_fechaini;
	}
	public Double getVenc_interescre(){
		return venc_interescre;
	}
	public void setVenc_interescre(Double venc_interescre){
		this.venc_interescre = venc_interescre;
	}
	public Double getVenc_montxcuot(){
		return venc_montxcuot;
	}
	public void setVenc_montxcuot(Double venc_montxcuot){
		this.venc_montxcuot = venc_montxcuot;
	}
	public Double getVenc_totalc(){
		return venc_totalc;
	}
	public void setVenc_totalc(Double venc_totalc){
		this.venc_totalc = venc_totalc;
	}
	public Double getVenc_entretot(){
		return venc_entretot;
	}
	public void setVenc_entretot(Double venc_entretot){
		this.venc_entretot = venc_entretot;
	}
	public Double getVenc_saldo(){
		return venc_saldo;
	}
	public void setVenc_saldo(Double venc_saldo){
		this.venc_saldo = venc_saldo;
	}
	public Double getVenc_cdolar(){
		return venc_cdolar;
	}
	public void setVenc_cdolar(Double venc_cdolar){
		this.venc_cdolar = venc_cdolar;
	}
	public Double getVenc_creal(){
		return venc_creal;
	}
	public void setVenc_creal(Double venc_creal){
		this.venc_creal = venc_creal;
	}
	public Double getVenc_cpeso(){
		return venc_cpeso;
	}
	public void setVenc_cpeso(Double venc_cpeso){
		this.venc_cpeso = venc_cpeso;
	}
	public Double getVenc_ceuro(){
		return venc_ceuro;
	}
	public void setVenc_ceuro(Double venc_ceuro){
		this.venc_ceuro = venc_ceuro;
	}
	public Integer getVenc_cancelado(){
		return venc_cancelado;
	}
	public void setVenc_cancelado(Integer venc_cancelado){
		this.venc_cancelado = venc_cancelado;
	}
	public Integer getVenc_borrado(){
		return venc_borrado;
	}
	public void setVenc_borrado(Integer venc_borrado){
		this.venc_borrado = venc_borrado;
	}
	public String getVenc_fechaentrega(){
		return venc_fechaentrega;
	}
	public void setVenc_fechaentrega(String venc_fechaentrega){
		this.venc_fechaentrega = venc_fechaentrega;
	}
	public Double getVenc_inientrega(){
		return venc_inientrega;
	}
	public void setVenc_inientrega(Double venc_inientrega){
		this.venc_inientrega = venc_inientrega;
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
	public Double getVenc_devolucion(){
		return venc_devolucion;
	}
	public void setVenc_devolucion(Double venc_devolucion){
		this.venc_devolucion = venc_devolucion;
	}
	public Integer getVenc_zafra(){
		return venc_zafra;
	}
	public void setVenc_zafra(Integer venc_zafra){
		this.venc_zafra = venc_zafra;
	}

}