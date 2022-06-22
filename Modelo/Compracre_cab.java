package modelo;

public class Compracre_cab{
	Integer com_nro;
	String com_hora;
	Integer com_usua;
	String com_movim;
	String com_fechac;
	String com_fecha;
	String com_nrofact;
	Integer com_prove;
	Double com_total;
	Double com_totald;
	Double com_totalr;
	Double com_totalp;
	Double com_totale;
	Integer com_activo;
	Integer com_cance;
	String com_venci;
	String com_fpago;
	Integer com_moneda;
	Double com_monedo;
	Double com_monere;
	Double com_monepe;
	Double com_moneeu;
	String com_nucaja;
	Integer com_ubica;
	Integer com_tip;
	Double com_desc;
	Double com_descd;
	Double com_descr;
	Double com_descp;
	Double com_desce;
	Double com_entr;
	Double com_entrd;
	Double com_entrr;
	Double com_entrp;
	Double com_entre;
	Integer com_cierre;
	Double com_entrpar;
	Integer com_tipoperacion;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer com_deposito;
	Integer com_nro_pedido;
	Integer com_empresa;
	String com_timbrado;
	String com_fin_vigencia;

	public Compracre_cab(Integer com_nro, String com_hora, Integer com_usua, String com_movim, String com_fechac, String com_fecha, String com_nrofact, Integer com_prove, Double com_total, Double com_totald, Double com_totalr, Double com_totalp, Double com_totale, Integer com_activo, Integer com_cance, String com_venci, String com_fpago, Integer com_moneda, Double com_monedo, Double com_monere, Double com_monepe, Double com_moneeu, String com_nucaja, Integer com_ubica, Integer com_tip, Double com_desc, Double com_descd, Double com_descr, Double com_descp, Double com_desce, Double com_entr, Double com_entrd, Double com_entrr, Double com_entrp, Double com_entre, Integer com_cierre, Double com_entrpar, Integer com_tipoperacion, String fechasct, Integer usuariosct, String maquinasct, Integer com_deposito, Integer com_nro_pedido, Integer com_empresa, String com_timbrado, String com_fin_vigencia){
		this.com_nro = com_nro;
		this.com_hora = com_hora;
		this.com_usua = com_usua;
		this.com_movim = com_movim;
		this.com_fechac = com_fechac;
		this.com_fecha = com_fecha;
		this.com_nrofact = com_nrofact;
		this.com_prove = com_prove;
		this.com_total = com_total;
		this.com_totald = com_totald;
		this.com_totalr = com_totalr;
		this.com_totalp = com_totalp;
		this.com_totale = com_totale;
		this.com_activo = com_activo;
		this.com_cance = com_cance;
		this.com_venci = com_venci;
		this.com_fpago = com_fpago;
		this.com_moneda = com_moneda;
		this.com_monedo = com_monedo;
		this.com_monere = com_monere;
		this.com_monepe = com_monepe;
		this.com_moneeu = com_moneeu;
		this.com_nucaja = com_nucaja;
		this.com_ubica = com_ubica;
		this.com_tip = com_tip;
		this.com_desc = com_desc;
		this.com_descd = com_descd;
		this.com_descr = com_descr;
		this.com_descp = com_descp;
		this.com_desce = com_desce;
		this.com_entr = com_entr;
		this.com_entrd = com_entrd;
		this.com_entrr = com_entrr;
		this.com_entrp = com_entrp;
		this.com_entre = com_entre;
		this.com_cierre = com_cierre;
		this.com_entrpar = com_entrpar;
		this.com_tipoperacion = com_tipoperacion;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.com_deposito = com_deposito;
		this.com_nro_pedido = com_nro_pedido;
		this.com_empresa = com_empresa;
		this.com_timbrado = com_timbrado;
		this.com_fin_vigencia = com_fin_vigencia;
	}
	public Compracre_cab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compracre_cab{"+", com_nro=" + com_nro+", com_hora=" + com_hora+", com_usua=" + com_usua+", com_movim=" + com_movim+", com_fechac=" + com_fechac+", com_fecha=" + com_fecha+", com_nrofact=" + com_nrofact+", com_prove=" + com_prove+", com_total=" + com_total+", com_totald=" + com_totald+", com_totalr=" + com_totalr+", com_totalp=" + com_totalp+", com_totale=" + com_totale+", com_activo=" + com_activo+", com_cance=" + com_cance+", com_venci=" + com_venci+", com_fpago=" + com_fpago+", com_moneda=" + com_moneda+", com_monedo=" + com_monedo+", com_monere=" + com_monere+", com_monepe=" + com_monepe+", com_moneeu=" + com_moneeu+", com_nucaja=" + com_nucaja+", com_ubica=" + com_ubica+", com_tip=" + com_tip+", com_desc=" + com_desc+", com_descd=" + com_descd+", com_descr=" + com_descr+", com_descp=" + com_descp+", com_desce=" + com_desce+", com_entr=" + com_entr+", com_entrd=" + com_entrd+", com_entrr=" + com_entrr+", com_entrp=" + com_entrp+", com_entre=" + com_entre+", com_cierre=" + com_cierre+", com_entrpar=" + com_entrpar+", com_tipoperacion=" + com_tipoperacion+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", com_deposito=" + com_deposito+", com_nro_pedido=" + com_nro_pedido+", com_empresa=" + com_empresa+", com_timbrado=" + com_timbrado+", com_fin_vigencia=" + com_fin_vigencia+"}";

	}
	public Integer getCom_nro(){
		return com_nro;
	}
	public void setCom_nro(Integer com_nro){
		this.com_nro = com_nro;
	}
	public String getCom_hora(){
		return com_hora;
	}
	public void setCom_hora(String com_hora){
		this.com_hora = com_hora;
	}
	public Integer getCom_usua(){
		return com_usua;
	}
	public void setCom_usua(Integer com_usua){
		this.com_usua = com_usua;
	}
	public String getCom_movim(){
		return com_movim;
	}
	public void setCom_movim(String com_movim){
		this.com_movim = com_movim;
	}
	public String getCom_fechac(){
		return com_fechac;
	}
	public void setCom_fechac(String com_fechac){
		this.com_fechac = com_fechac;
	}
	public String getCom_fecha(){
		return com_fecha;
	}
	public void setCom_fecha(String com_fecha){
		this.com_fecha = com_fecha;
	}
	public String getCom_nrofact(){
		return com_nrofact;
	}
	public void setCom_nrofact(String com_nrofact){
		this.com_nrofact = com_nrofact;
	}
	public Integer getCom_prove(){
		return com_prove;
	}
	public void setCom_prove(Integer com_prove){
		this.com_prove = com_prove;
	}
	public Double getCom_total(){
		return com_total;
	}
	public void setCom_total(Double com_total){
		this.com_total = com_total;
	}
	public Double getCom_totald(){
		return com_totald;
	}
	public void setCom_totald(Double com_totald){
		this.com_totald = com_totald;
	}
	public Double getCom_totalr(){
		return com_totalr;
	}
	public void setCom_totalr(Double com_totalr){
		this.com_totalr = com_totalr;
	}
	public Double getCom_totalp(){
		return com_totalp;
	}
	public void setCom_totalp(Double com_totalp){
		this.com_totalp = com_totalp;
	}
	public Double getCom_totale(){
		return com_totale;
	}
	public void setCom_totale(Double com_totale){
		this.com_totale = com_totale;
	}
	public Integer getCom_activo(){
		return com_activo;
	}
	public void setCom_activo(Integer com_activo){
		this.com_activo = com_activo;
	}
	public Integer getCom_cance(){
		return com_cance;
	}
	public void setCom_cance(Integer com_cance){
		this.com_cance = com_cance;
	}
	public String getCom_venci(){
		return com_venci;
	}
	public void setCom_venci(String com_venci){
		this.com_venci = com_venci;
	}
	public String getCom_fpago(){
		return com_fpago;
	}
	public void setCom_fpago(String com_fpago){
		this.com_fpago = com_fpago;
	}
	public Integer getCom_moneda(){
		return com_moneda;
	}
	public void setCom_moneda(Integer com_moneda){
		this.com_moneda = com_moneda;
	}
	public Double getCom_monedo(){
		return com_monedo;
	}
	public void setCom_monedo(Double com_monedo){
		this.com_monedo = com_monedo;
	}
	public Double getCom_monere(){
		return com_monere;
	}
	public void setCom_monere(Double com_monere){
		this.com_monere = com_monere;
	}
	public Double getCom_monepe(){
		return com_monepe;
	}
	public void setCom_monepe(Double com_monepe){
		this.com_monepe = com_monepe;
	}
	public Double getCom_moneeu(){
		return com_moneeu;
	}
	public void setCom_moneeu(Double com_moneeu){
		this.com_moneeu = com_moneeu;
	}
	public String getCom_nucaja(){
		return com_nucaja;
	}
	public void setCom_nucaja(String com_nucaja){
		this.com_nucaja = com_nucaja;
	}
	public Integer getCom_ubica(){
		return com_ubica;
	}
	public void setCom_ubica(Integer com_ubica){
		this.com_ubica = com_ubica;
	}
	public Integer getCom_tip(){
		return com_tip;
	}
	public void setCom_tip(Integer com_tip){
		this.com_tip = com_tip;
	}
	public Double getCom_desc(){
		return com_desc;
	}
	public void setCom_desc(Double com_desc){
		this.com_desc = com_desc;
	}
	public Double getCom_descd(){
		return com_descd;
	}
	public void setCom_descd(Double com_descd){
		this.com_descd = com_descd;
	}
	public Double getCom_descr(){
		return com_descr;
	}
	public void setCom_descr(Double com_descr){
		this.com_descr = com_descr;
	}
	public Double getCom_descp(){
		return com_descp;
	}
	public void setCom_descp(Double com_descp){
		this.com_descp = com_descp;
	}
	public Double getCom_desce(){
		return com_desce;
	}
	public void setCom_desce(Double com_desce){
		this.com_desce = com_desce;
	}
	public Double getCom_entr(){
		return com_entr;
	}
	public void setCom_entr(Double com_entr){
		this.com_entr = com_entr;
	}
	public Double getCom_entrd(){
		return com_entrd;
	}
	public void setCom_entrd(Double com_entrd){
		this.com_entrd = com_entrd;
	}
	public Double getCom_entrr(){
		return com_entrr;
	}
	public void setCom_entrr(Double com_entrr){
		this.com_entrr = com_entrr;
	}
	public Double getCom_entrp(){
		return com_entrp;
	}
	public void setCom_entrp(Double com_entrp){
		this.com_entrp = com_entrp;
	}
	public Double getCom_entre(){
		return com_entre;
	}
	public void setCom_entre(Double com_entre){
		this.com_entre = com_entre;
	}
	public Integer getCom_cierre(){
		return com_cierre;
	}
	public void setCom_cierre(Integer com_cierre){
		this.com_cierre = com_cierre;
	}
	public Double getCom_entrpar(){
		return com_entrpar;
	}
	public void setCom_entrpar(Double com_entrpar){
		this.com_entrpar = com_entrpar;
	}
	public Integer getCom_tipoperacion(){
		return com_tipoperacion;
	}
	public void setCom_tipoperacion(Integer com_tipoperacion){
		this.com_tipoperacion = com_tipoperacion;
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
	public Integer getCom_deposito(){
		return com_deposito;
	}
	public void setCom_deposito(Integer com_deposito){
		this.com_deposito = com_deposito;
	}
	public Integer getCom_nro_pedido(){
		return com_nro_pedido;
	}
	public void setCom_nro_pedido(Integer com_nro_pedido){
		this.com_nro_pedido = com_nro_pedido;
	}
	public Integer getCom_empresa(){
		return com_empresa;
	}
	public void setCom_empresa(Integer com_empresa){
		this.com_empresa = com_empresa;
	}
	public String getCom_timbrado(){
		return com_timbrado;
	}
	public void setCom_timbrado(String com_timbrado){
		this.com_timbrado = com_timbrado;
	}
	public String getCom_fin_vigencia(){
		return com_fin_vigencia;
	}
	public void setCom_fin_vigencia(String com_fin_vigencia){
		this.com_fin_vigencia = com_fin_vigencia;
	}

}