package modelo;

public class Compracon_temp{
	Integer comt_nro;
	Object comt_nrofact;
	String comt_hora;
	Integer comt_usua;
	String comt_movim;
	String comt_fechac;
	String comt_fecha;
	Integer comt_proveedor;
	Double comt_total;
	Double comt_totald;
	Double comt_totalp;
	Double comt_totalr;
	Double comt_totale;
	Integer comt_activo;
	Double comt_moneda;
	Double comt_monedo;
	Double comt_monepe;
	Double comt_monere;
	Double comt_moneeu;
	String comt_nucaja;
	Integer comt_ubica;
	Integer comt_tip;
	Double comt_desc;
	Integer comt_cierre;
	Integer comt_nrocierre;
	Integer comt_deposito;
	Integer comt_tipoperacion;
	String comt_fechasct;
	Integer comt_usuariosct;
	String comt_maquinasct;

	public Compracon_temp(Integer comt_nro, Object comt_nrofact, String comt_hora, Integer comt_usua, String comt_movim, String comt_fechac, String comt_fecha, Integer comt_proveedor, Double comt_total, Double comt_totald, Double comt_totalp, Double comt_totalr, Double comt_totale, Integer comt_activo, Double comt_moneda, Double comt_monedo, Double comt_monepe, Double comt_monere, Double comt_moneeu, String comt_nucaja, Integer comt_ubica, Integer comt_tip, Double comt_desc, Integer comt_cierre, Integer comt_nrocierre, Integer comt_deposito, Integer comt_tipoperacion, String comt_fechasct, Integer comt_usuariosct, String comt_maquinasct){
		this.comt_nro = comt_nro;
		this.comt_nrofact = comt_nrofact;
		this.comt_hora = comt_hora;
		this.comt_usua = comt_usua;
		this.comt_movim = comt_movim;
		this.comt_fechac = comt_fechac;
		this.comt_fecha = comt_fecha;
		this.comt_proveedor = comt_proveedor;
		this.comt_total = comt_total;
		this.comt_totald = comt_totald;
		this.comt_totalp = comt_totalp;
		this.comt_totalr = comt_totalr;
		this.comt_totale = comt_totale;
		this.comt_activo = comt_activo;
		this.comt_moneda = comt_moneda;
		this.comt_monedo = comt_monedo;
		this.comt_monepe = comt_monepe;
		this.comt_monere = comt_monere;
		this.comt_moneeu = comt_moneeu;
		this.comt_nucaja = comt_nucaja;
		this.comt_ubica = comt_ubica;
		this.comt_tip = comt_tip;
		this.comt_desc = comt_desc;
		this.comt_cierre = comt_cierre;
		this.comt_nrocierre = comt_nrocierre;
		this.comt_deposito = comt_deposito;
		this.comt_tipoperacion = comt_tipoperacion;
		this.comt_fechasct = comt_fechasct;
		this.comt_usuariosct = comt_usuariosct;
		this.comt_maquinasct = comt_maquinasct;
	}
	public Compracon_temp(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compracon_temp{"+", comt_nro=" + comt_nro+", comt_nrofact=" + comt_nrofact+", comt_hora=" + comt_hora+", comt_usua=" + comt_usua+", comt_movim=" + comt_movim+", comt_fechac=" + comt_fechac+", comt_fecha=" + comt_fecha+", comt_proveedor=" + comt_proveedor+", comt_total=" + comt_total+", comt_totald=" + comt_totald+", comt_totalp=" + comt_totalp+", comt_totalr=" + comt_totalr+", comt_totale=" + comt_totale+", comt_activo=" + comt_activo+", comt_moneda=" + comt_moneda+", comt_monedo=" + comt_monedo+", comt_monepe=" + comt_monepe+", comt_monere=" + comt_monere+", comt_moneeu=" + comt_moneeu+", comt_nucaja=" + comt_nucaja+", comt_ubica=" + comt_ubica+", comt_tip=" + comt_tip+", comt_desc=" + comt_desc+", comt_cierre=" + comt_cierre+", comt_nrocierre=" + comt_nrocierre+", comt_deposito=" + comt_deposito+", comt_tipoperacion=" + comt_tipoperacion+", comt_fechasct=" + comt_fechasct+", comt_usuariosct=" + comt_usuariosct+", comt_maquinasct=" + comt_maquinasct+"}";

	}
	public Integer getComt_nro(){
		return comt_nro;
	}
	public void setComt_nro(Integer comt_nro){
		this.comt_nro = comt_nro;
	}
	public Object getComt_nrofact(){
		return comt_nrofact;
	}
	public void setComt_nrofact(Object comt_nrofact){
		this.comt_nrofact = comt_nrofact;
	}
	public String getComt_hora(){
		return comt_hora;
	}
	public void setComt_hora(String comt_hora){
		this.comt_hora = comt_hora;
	}
	public Integer getComt_usua(){
		return comt_usua;
	}
	public void setComt_usua(Integer comt_usua){
		this.comt_usua = comt_usua;
	}
	public String getComt_movim(){
		return comt_movim;
	}
	public void setComt_movim(String comt_movim){
		this.comt_movim = comt_movim;
	}
	public String getComt_fechac(){
		return comt_fechac;
	}
	public void setComt_fechac(String comt_fechac){
		this.comt_fechac = comt_fechac;
	}
	public String getComt_fecha(){
		return comt_fecha;
	}
	public void setComt_fecha(String comt_fecha){
		this.comt_fecha = comt_fecha;
	}
	public Integer getComt_proveedor(){
		return comt_proveedor;
	}
	public void setComt_proveedor(Integer comt_proveedor){
		this.comt_proveedor = comt_proveedor;
	}
	public Double getComt_total(){
		return comt_total;
	}
	public void setComt_total(Double comt_total){
		this.comt_total = comt_total;
	}
	public Double getComt_totald(){
		return comt_totald;
	}
	public void setComt_totald(Double comt_totald){
		this.comt_totald = comt_totald;
	}
	public Double getComt_totalp(){
		return comt_totalp;
	}
	public void setComt_totalp(Double comt_totalp){
		this.comt_totalp = comt_totalp;
	}
	public Double getComt_totalr(){
		return comt_totalr;
	}
	public void setComt_totalr(Double comt_totalr){
		this.comt_totalr = comt_totalr;
	}
	public Double getComt_totale(){
		return comt_totale;
	}
	public void setComt_totale(Double comt_totale){
		this.comt_totale = comt_totale;
	}
	public Integer getComt_activo(){
		return comt_activo;
	}
	public void setComt_activo(Integer comt_activo){
		this.comt_activo = comt_activo;
	}
	public Double getComt_moneda(){
		return comt_moneda;
	}
	public void setComt_moneda(Double comt_moneda){
		this.comt_moneda = comt_moneda;
	}
	public Double getComt_monedo(){
		return comt_monedo;
	}
	public void setComt_monedo(Double comt_monedo){
		this.comt_monedo = comt_monedo;
	}
	public Double getComt_monepe(){
		return comt_monepe;
	}
	public void setComt_monepe(Double comt_monepe){
		this.comt_monepe = comt_monepe;
	}
	public Double getComt_monere(){
		return comt_monere;
	}
	public void setComt_monere(Double comt_monere){
		this.comt_monere = comt_monere;
	}
	public Double getComt_moneeu(){
		return comt_moneeu;
	}
	public void setComt_moneeu(Double comt_moneeu){
		this.comt_moneeu = comt_moneeu;
	}
	public String getComt_nucaja(){
		return comt_nucaja;
	}
	public void setComt_nucaja(String comt_nucaja){
		this.comt_nucaja = comt_nucaja;
	}
	public Integer getComt_ubica(){
		return comt_ubica;
	}
	public void setComt_ubica(Integer comt_ubica){
		this.comt_ubica = comt_ubica;
	}
	public Integer getComt_tip(){
		return comt_tip;
	}
	public void setComt_tip(Integer comt_tip){
		this.comt_tip = comt_tip;
	}
	public Double getComt_desc(){
		return comt_desc;
	}
	public void setComt_desc(Double comt_desc){
		this.comt_desc = comt_desc;
	}
	public Integer getComt_cierre(){
		return comt_cierre;
	}
	public void setComt_cierre(Integer comt_cierre){
		this.comt_cierre = comt_cierre;
	}
	public Integer getComt_nrocierre(){
		return comt_nrocierre;
	}
	public void setComt_nrocierre(Integer comt_nrocierre){
		this.comt_nrocierre = comt_nrocierre;
	}
	public Integer getComt_deposito(){
		return comt_deposito;
	}
	public void setComt_deposito(Integer comt_deposito){
		this.comt_deposito = comt_deposito;
	}
	public Integer getComt_tipoperacion(){
		return comt_tipoperacion;
	}
	public void setComt_tipoperacion(Integer comt_tipoperacion){
		this.comt_tipoperacion = comt_tipoperacion;
	}
	public String getComt_fechasct(){
		return comt_fechasct;
	}
	public void setComt_fechasct(String comt_fechasct){
		this.comt_fechasct = comt_fechasct;
	}
	public Integer getComt_usuariosct(){
		return comt_usuariosct;
	}
	public void setComt_usuariosct(Integer comt_usuariosct){
		this.comt_usuariosct = comt_usuariosct;
	}
	public String getComt_maquinasct(){
		return comt_maquinasct;
	}
	public void setComt_maquinasct(String comt_maquinasct){
		this.comt_maquinasct = comt_maquinasct;
	}

}