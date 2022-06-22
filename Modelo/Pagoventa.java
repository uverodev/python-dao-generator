package modelo;

public class Pagoventa{
	Integer pven_nro;
	Integer pven_numventa;
	Integer pven_tipventa;
	String pven_fecha;
	Integer pven_usuario;
	String pven_hora;
	Double pven_exoneracion;
	Integer pven_tiptcre;
	String pven_numtcre;
	Integer pven_cobrador;
	Integer pven_tiptdeb;
	String pven_numtdeb;
	String pven_cliente;
	Integer pven_vendedor;
	Double pven_totalgs;
	Double pven_totald;
	Double pven_totalr;
	Double pven_totalp;
	Double pven_totale;
	Double pven_montorgs;
	Double pven_montord;
	Double pven_montorr;
	Double pven_montorp;
	Double pven_montore;
	Double pven_vuelto;
	Integer pven_moneda;
	Double pven_cdolar;
	Double pven_creal;
	Double pven_cpeso;
	Double pven_ceuro;
	Integer pven_efectivo;
	Double pven_totalefectivo;
	Double pven_toteguarani;
	Double pven_totedolar;
	Double pven_totereal;
	Double pven_totepeso;
	Double pven_toteeuro;
	Integer pven_cheque;
	Double pven_totalcheque;
	Double pven_totcguaranies;
	Double pven_totcdolar;
	Double pven_totcreal;
	Double pven_totcpeso;
	Double pven_totceuro;
	Integer pven_tcredito;
	Double pven_totaltcredito;
	Double pven_tottcguarani;
	Double pven_tottcdolar;
	Double pven_tottcreal;
	Double pven_tottcpeso;
	Double pven_tottceuro;
	Integer pven_tdebito;
	Double pven_totaltdebito;
	Double pven_tottdguarani;
	Double pven_tottddolar;
	Double pven_tottdreal;
	Double pven_tottdpeso;
	Double pven_tottdeuro;
	Integer pven_nota;
	Double pven_totalnota;
	Double pven_totnguarani;
	Double pven_totndolar;
	Double pven_totnreal;
	Double pven_totnpeso;
	Double pven_totneuro;
	String pven_caja;
	Double pven_totvueguarani;
	Double pven_totvuedolar;
	Double pven_totvuereal;
	Double pven_totvuepeso;
	Double pven_totvueeuro;
	Integer pven_cierre;
	Integer pven_borrado;
	Integer pven_nrosuboperacion;
	Integer pven_nrorecibo;
	String pven_numdeposito;
	Integer pven_banco;
	Double pven_totdbeuro;
	Double pven_totdbreal;
	Double pven_totdbpeso;
	Double pven_totdbdolar;
	Double pven_totdbguarani;
	Double pven_totaldepbancario;
	Integer pven_depbancario;
	String pven_numgiro;
	String pven_giromedio;
	Double pven_totgeuro;
	Double pven_totgreal;
	Double pven_totgpeso;
	Double pven_totgdolar;
	Double pven_totgguarani;
	Double pven_totalgiro;
	Integer pven_giro;
	Double pven_interes;
	Integer pven_deposito;
	Integer pag_nrocierre;
	Integer pven_nroliquidacion;
	Integer pven_liquidacion;
	Integer pven_cierrecajagennro;
	Object pven_numerorecibointerno;

	public Pagoventa(Integer pven_nro, Integer pven_numventa, Integer pven_tipventa, String pven_fecha, Integer pven_usuario, String pven_hora, Double pven_exoneracion, Integer pven_tiptcre, String pven_numtcre, Integer pven_cobrador, Integer pven_tiptdeb, String pven_numtdeb, String pven_cliente, Integer pven_vendedor, Double pven_totalgs, Double pven_totald, Double pven_totalr, Double pven_totalp, Double pven_totale, Double pven_montorgs, Double pven_montord, Double pven_montorr, Double pven_montorp, Double pven_montore, Double pven_vuelto, Integer pven_moneda, Double pven_cdolar, Double pven_creal, Double pven_cpeso, Double pven_ceuro, Integer pven_efectivo, Double pven_totalefectivo, Double pven_toteguarani, Double pven_totedolar, Double pven_totereal, Double pven_totepeso, Double pven_toteeuro, Integer pven_cheque, Double pven_totalcheque, Double pven_totcguaranies, Double pven_totcdolar, Double pven_totcreal, Double pven_totcpeso, Double pven_totceuro, Integer pven_tcredito, Double pven_totaltcredito, Double pven_tottcguarani, Double pven_tottcdolar, Double pven_tottcreal, Double pven_tottcpeso, Double pven_tottceuro, Integer pven_tdebito, Double pven_totaltdebito, Double pven_tottdguarani, Double pven_tottddolar, Double pven_tottdreal, Double pven_tottdpeso, Double pven_tottdeuro, Integer pven_nota, Double pven_totalnota, Double pven_totnguarani, Double pven_totndolar, Double pven_totnreal, Double pven_totnpeso, Double pven_totneuro, String pven_caja, Double pven_totvueguarani, Double pven_totvuedolar, Double pven_totvuereal, Double pven_totvuepeso, Double pven_totvueeuro, Integer pven_cierre, Integer pven_borrado, Integer pven_nrosuboperacion, Integer pven_nrorecibo, String pven_numdeposito, Integer pven_banco, Double pven_totdbeuro, Double pven_totdbreal, Double pven_totdbpeso, Double pven_totdbdolar, Double pven_totdbguarani, Double pven_totaldepbancario, Integer pven_depbancario, String pven_numgiro, String pven_giromedio, Double pven_totgeuro, Double pven_totgreal, Double pven_totgpeso, Double pven_totgdolar, Double pven_totgguarani, Double pven_totalgiro, Integer pven_giro, Double pven_interes, Integer pven_deposito, Integer pag_nrocierre, Integer pven_nroliquidacion, Integer pven_liquidacion, Integer pven_cierrecajagennro, Object pven_numerorecibointerno){
		this.pven_nro = pven_nro;
		this.pven_numventa = pven_numventa;
		this.pven_tipventa = pven_tipventa;
		this.pven_fecha = pven_fecha;
		this.pven_usuario = pven_usuario;
		this.pven_hora = pven_hora;
		this.pven_exoneracion = pven_exoneracion;
		this.pven_tiptcre = pven_tiptcre;
		this.pven_numtcre = pven_numtcre;
		this.pven_cobrador = pven_cobrador;
		this.pven_tiptdeb = pven_tiptdeb;
		this.pven_numtdeb = pven_numtdeb;
		this.pven_cliente = pven_cliente;
		this.pven_vendedor = pven_vendedor;
		this.pven_totalgs = pven_totalgs;
		this.pven_totald = pven_totald;
		this.pven_totalr = pven_totalr;
		this.pven_totalp = pven_totalp;
		this.pven_totale = pven_totale;
		this.pven_montorgs = pven_montorgs;
		this.pven_montord = pven_montord;
		this.pven_montorr = pven_montorr;
		this.pven_montorp = pven_montorp;
		this.pven_montore = pven_montore;
		this.pven_vuelto = pven_vuelto;
		this.pven_moneda = pven_moneda;
		this.pven_cdolar = pven_cdolar;
		this.pven_creal = pven_creal;
		this.pven_cpeso = pven_cpeso;
		this.pven_ceuro = pven_ceuro;
		this.pven_efectivo = pven_efectivo;
		this.pven_totalefectivo = pven_totalefectivo;
		this.pven_toteguarani = pven_toteguarani;
		this.pven_totedolar = pven_totedolar;
		this.pven_totereal = pven_totereal;
		this.pven_totepeso = pven_totepeso;
		this.pven_toteeuro = pven_toteeuro;
		this.pven_cheque = pven_cheque;
		this.pven_totalcheque = pven_totalcheque;
		this.pven_totcguaranies = pven_totcguaranies;
		this.pven_totcdolar = pven_totcdolar;
		this.pven_totcreal = pven_totcreal;
		this.pven_totcpeso = pven_totcpeso;
		this.pven_totceuro = pven_totceuro;
		this.pven_tcredito = pven_tcredito;
		this.pven_totaltcredito = pven_totaltcredito;
		this.pven_tottcguarani = pven_tottcguarani;
		this.pven_tottcdolar = pven_tottcdolar;
		this.pven_tottcreal = pven_tottcreal;
		this.pven_tottcpeso = pven_tottcpeso;
		this.pven_tottceuro = pven_tottceuro;
		this.pven_tdebito = pven_tdebito;
		this.pven_totaltdebito = pven_totaltdebito;
		this.pven_tottdguarani = pven_tottdguarani;
		this.pven_tottddolar = pven_tottddolar;
		this.pven_tottdreal = pven_tottdreal;
		this.pven_tottdpeso = pven_tottdpeso;
		this.pven_tottdeuro = pven_tottdeuro;
		this.pven_nota = pven_nota;
		this.pven_totalnota = pven_totalnota;
		this.pven_totnguarani = pven_totnguarani;
		this.pven_totndolar = pven_totndolar;
		this.pven_totnreal = pven_totnreal;
		this.pven_totnpeso = pven_totnpeso;
		this.pven_totneuro = pven_totneuro;
		this.pven_caja = pven_caja;
		this.pven_totvueguarani = pven_totvueguarani;
		this.pven_totvuedolar = pven_totvuedolar;
		this.pven_totvuereal = pven_totvuereal;
		this.pven_totvuepeso = pven_totvuepeso;
		this.pven_totvueeuro = pven_totvueeuro;
		this.pven_cierre = pven_cierre;
		this.pven_borrado = pven_borrado;
		this.pven_nrosuboperacion = pven_nrosuboperacion;
		this.pven_nrorecibo = pven_nrorecibo;
		this.pven_numdeposito = pven_numdeposito;
		this.pven_banco = pven_banco;
		this.pven_totdbeuro = pven_totdbeuro;
		this.pven_totdbreal = pven_totdbreal;
		this.pven_totdbpeso = pven_totdbpeso;
		this.pven_totdbdolar = pven_totdbdolar;
		this.pven_totdbguarani = pven_totdbguarani;
		this.pven_totaldepbancario = pven_totaldepbancario;
		this.pven_depbancario = pven_depbancario;
		this.pven_numgiro = pven_numgiro;
		this.pven_giromedio = pven_giromedio;
		this.pven_totgeuro = pven_totgeuro;
		this.pven_totgreal = pven_totgreal;
		this.pven_totgpeso = pven_totgpeso;
		this.pven_totgdolar = pven_totgdolar;
		this.pven_totgguarani = pven_totgguarani;
		this.pven_totalgiro = pven_totalgiro;
		this.pven_giro = pven_giro;
		this.pven_interes = pven_interes;
		this.pven_deposito = pven_deposito;
		this.pag_nrocierre = pag_nrocierre;
		this.pven_nroliquidacion = pven_nroliquidacion;
		this.pven_liquidacion = pven_liquidacion;
		this.pven_cierrecajagennro = pven_cierrecajagennro;
		this.pven_numerorecibointerno = pven_numerorecibointerno;
	}
	public Pagoventa(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pagoventa{"+", pven_nro=" + pven_nro+", pven_numventa=" + pven_numventa+", pven_tipventa=" + pven_tipventa+", pven_fecha=" + pven_fecha+", pven_usuario=" + pven_usuario+", pven_hora=" + pven_hora+", pven_exoneracion=" + pven_exoneracion+", pven_tiptcre=" + pven_tiptcre+", pven_numtcre=" + pven_numtcre+", pven_cobrador=" + pven_cobrador+", pven_tiptdeb=" + pven_tiptdeb+", pven_numtdeb=" + pven_numtdeb+", pven_cliente=" + pven_cliente+", pven_vendedor=" + pven_vendedor+", pven_totalgs=" + pven_totalgs+", pven_totald=" + pven_totald+", pven_totalr=" + pven_totalr+", pven_totalp=" + pven_totalp+", pven_totale=" + pven_totale+", pven_montorgs=" + pven_montorgs+", pven_montord=" + pven_montord+", pven_montorr=" + pven_montorr+", pven_montorp=" + pven_montorp+", pven_montore=" + pven_montore+", pven_vuelto=" + pven_vuelto+", pven_moneda=" + pven_moneda+", pven_cdolar=" + pven_cdolar+", pven_creal=" + pven_creal+", pven_cpeso=" + pven_cpeso+", pven_ceuro=" + pven_ceuro+", pven_efectivo=" + pven_efectivo+", pven_totalefectivo=" + pven_totalefectivo+", pven_toteguarani=" + pven_toteguarani+", pven_totedolar=" + pven_totedolar+", pven_totereal=" + pven_totereal+", pven_totepeso=" + pven_totepeso+", pven_toteeuro=" + pven_toteeuro+", pven_cheque=" + pven_cheque+", pven_totalcheque=" + pven_totalcheque+", pven_totcguaranies=" + pven_totcguaranies+", pven_totcdolar=" + pven_totcdolar+", pven_totcreal=" + pven_totcreal+", pven_totcpeso=" + pven_totcpeso+", pven_totceuro=" + pven_totceuro+", pven_tcredito=" + pven_tcredito+", pven_totaltcredito=" + pven_totaltcredito+", pven_tottcguarani=" + pven_tottcguarani+", pven_tottcdolar=" + pven_tottcdolar+", pven_tottcreal=" + pven_tottcreal+", pven_tottcpeso=" + pven_tottcpeso+", pven_tottceuro=" + pven_tottceuro+", pven_tdebito=" + pven_tdebito+", pven_totaltdebito=" + pven_totaltdebito+", pven_tottdguarani=" + pven_tottdguarani+", pven_tottddolar=" + pven_tottddolar+", pven_tottdreal=" + pven_tottdreal+", pven_tottdpeso=" + pven_tottdpeso+", pven_tottdeuro=" + pven_tottdeuro+", pven_nota=" + pven_nota+", pven_totalnota=" + pven_totalnota+", pven_totnguarani=" + pven_totnguarani+", pven_totndolar=" + pven_totndolar+", pven_totnreal=" + pven_totnreal+", pven_totnpeso=" + pven_totnpeso+", pven_totneuro=" + pven_totneuro+", pven_caja=" + pven_caja+", pven_totvueguarani=" + pven_totvueguarani+", pven_totvuedolar=" + pven_totvuedolar+", pven_totvuereal=" + pven_totvuereal+", pven_totvuepeso=" + pven_totvuepeso+", pven_totvueeuro=" + pven_totvueeuro+", pven_cierre=" + pven_cierre+", pven_borrado=" + pven_borrado+", pven_nrosuboperacion=" + pven_nrosuboperacion+", pven_nrorecibo=" + pven_nrorecibo+", pven_numdeposito=" + pven_numdeposito+", pven_banco=" + pven_banco+", pven_totdbeuro=" + pven_totdbeuro+", pven_totdbreal=" + pven_totdbreal+", pven_totdbpeso=" + pven_totdbpeso+", pven_totdbdolar=" + pven_totdbdolar+", pven_totdbguarani=" + pven_totdbguarani+", pven_totaldepbancario=" + pven_totaldepbancario+", pven_depbancario=" + pven_depbancario+", pven_numgiro=" + pven_numgiro+", pven_giromedio=" + pven_giromedio+", pven_totgeuro=" + pven_totgeuro+", pven_totgreal=" + pven_totgreal+", pven_totgpeso=" + pven_totgpeso+", pven_totgdolar=" + pven_totgdolar+", pven_totgguarani=" + pven_totgguarani+", pven_totalgiro=" + pven_totalgiro+", pven_giro=" + pven_giro+", pven_interes=" + pven_interes+", pven_deposito=" + pven_deposito+", pag_nrocierre=" + pag_nrocierre+", pven_nroliquidacion=" + pven_nroliquidacion+", pven_liquidacion=" + pven_liquidacion+", pven_cierrecajagennro=" + pven_cierrecajagennro+", pven_numerorecibointerno=" + pven_numerorecibointerno+"}";

	}
	public Integer getPven_nro(){
		return pven_nro;
	}
	public void setPven_nro(Integer pven_nro){
		this.pven_nro = pven_nro;
	}
	public Integer getPven_numventa(){
		return pven_numventa;
	}
	public void setPven_numventa(Integer pven_numventa){
		this.pven_numventa = pven_numventa;
	}
	public Integer getPven_tipventa(){
		return pven_tipventa;
	}
	public void setPven_tipventa(Integer pven_tipventa){
		this.pven_tipventa = pven_tipventa;
	}
	public String getPven_fecha(){
		return pven_fecha;
	}
	public void setPven_fecha(String pven_fecha){
		this.pven_fecha = pven_fecha;
	}
	public Integer getPven_usuario(){
		return pven_usuario;
	}
	public void setPven_usuario(Integer pven_usuario){
		this.pven_usuario = pven_usuario;
	}
	public String getPven_hora(){
		return pven_hora;
	}
	public void setPven_hora(String pven_hora){
		this.pven_hora = pven_hora;
	}
	public Double getPven_exoneracion(){
		return pven_exoneracion;
	}
	public void setPven_exoneracion(Double pven_exoneracion){
		this.pven_exoneracion = pven_exoneracion;
	}
	public Integer getPven_tiptcre(){
		return pven_tiptcre;
	}
	public void setPven_tiptcre(Integer pven_tiptcre){
		this.pven_tiptcre = pven_tiptcre;
	}
	public String getPven_numtcre(){
		return pven_numtcre;
	}
	public void setPven_numtcre(String pven_numtcre){
		this.pven_numtcre = pven_numtcre;
	}
	public Integer getPven_cobrador(){
		return pven_cobrador;
	}
	public void setPven_cobrador(Integer pven_cobrador){
		this.pven_cobrador = pven_cobrador;
	}
	public Integer getPven_tiptdeb(){
		return pven_tiptdeb;
	}
	public void setPven_tiptdeb(Integer pven_tiptdeb){
		this.pven_tiptdeb = pven_tiptdeb;
	}
	public String getPven_numtdeb(){
		return pven_numtdeb;
	}
	public void setPven_numtdeb(String pven_numtdeb){
		this.pven_numtdeb = pven_numtdeb;
	}
	public String getPven_cliente(){
		return pven_cliente;
	}
	public void setPven_cliente(String pven_cliente){
		this.pven_cliente = pven_cliente;
	}
	public Integer getPven_vendedor(){
		return pven_vendedor;
	}
	public void setPven_vendedor(Integer pven_vendedor){
		this.pven_vendedor = pven_vendedor;
	}
	public Double getPven_totalgs(){
		return pven_totalgs;
	}
	public void setPven_totalgs(Double pven_totalgs){
		this.pven_totalgs = pven_totalgs;
	}
	public Double getPven_totald(){
		return pven_totald;
	}
	public void setPven_totald(Double pven_totald){
		this.pven_totald = pven_totald;
	}
	public Double getPven_totalr(){
		return pven_totalr;
	}
	public void setPven_totalr(Double pven_totalr){
		this.pven_totalr = pven_totalr;
	}
	public Double getPven_totalp(){
		return pven_totalp;
	}
	public void setPven_totalp(Double pven_totalp){
		this.pven_totalp = pven_totalp;
	}
	public Double getPven_totale(){
		return pven_totale;
	}
	public void setPven_totale(Double pven_totale){
		this.pven_totale = pven_totale;
	}
	public Double getPven_montorgs(){
		return pven_montorgs;
	}
	public void setPven_montorgs(Double pven_montorgs){
		this.pven_montorgs = pven_montorgs;
	}
	public Double getPven_montord(){
		return pven_montord;
	}
	public void setPven_montord(Double pven_montord){
		this.pven_montord = pven_montord;
	}
	public Double getPven_montorr(){
		return pven_montorr;
	}
	public void setPven_montorr(Double pven_montorr){
		this.pven_montorr = pven_montorr;
	}
	public Double getPven_montorp(){
		return pven_montorp;
	}
	public void setPven_montorp(Double pven_montorp){
		this.pven_montorp = pven_montorp;
	}
	public Double getPven_montore(){
		return pven_montore;
	}
	public void setPven_montore(Double pven_montore){
		this.pven_montore = pven_montore;
	}
	public Double getPven_vuelto(){
		return pven_vuelto;
	}
	public void setPven_vuelto(Double pven_vuelto){
		this.pven_vuelto = pven_vuelto;
	}
	public Integer getPven_moneda(){
		return pven_moneda;
	}
	public void setPven_moneda(Integer pven_moneda){
		this.pven_moneda = pven_moneda;
	}
	public Double getPven_cdolar(){
		return pven_cdolar;
	}
	public void setPven_cdolar(Double pven_cdolar){
		this.pven_cdolar = pven_cdolar;
	}
	public Double getPven_creal(){
		return pven_creal;
	}
	public void setPven_creal(Double pven_creal){
		this.pven_creal = pven_creal;
	}
	public Double getPven_cpeso(){
		return pven_cpeso;
	}
	public void setPven_cpeso(Double pven_cpeso){
		this.pven_cpeso = pven_cpeso;
	}
	public Double getPven_ceuro(){
		return pven_ceuro;
	}
	public void setPven_ceuro(Double pven_ceuro){
		this.pven_ceuro = pven_ceuro;
	}
	public Integer getPven_efectivo(){
		return pven_efectivo;
	}
	public void setPven_efectivo(Integer pven_efectivo){
		this.pven_efectivo = pven_efectivo;
	}
	public Double getPven_totalefectivo(){
		return pven_totalefectivo;
	}
	public void setPven_totalefectivo(Double pven_totalefectivo){
		this.pven_totalefectivo = pven_totalefectivo;
	}
	public Double getPven_toteguarani(){
		return pven_toteguarani;
	}
	public void setPven_toteguarani(Double pven_toteguarani){
		this.pven_toteguarani = pven_toteguarani;
	}
	public Double getPven_totedolar(){
		return pven_totedolar;
	}
	public void setPven_totedolar(Double pven_totedolar){
		this.pven_totedolar = pven_totedolar;
	}
	public Double getPven_totereal(){
		return pven_totereal;
	}
	public void setPven_totereal(Double pven_totereal){
		this.pven_totereal = pven_totereal;
	}
	public Double getPven_totepeso(){
		return pven_totepeso;
	}
	public void setPven_totepeso(Double pven_totepeso){
		this.pven_totepeso = pven_totepeso;
	}
	public Double getPven_toteeuro(){
		return pven_toteeuro;
	}
	public void setPven_toteeuro(Double pven_toteeuro){
		this.pven_toteeuro = pven_toteeuro;
	}
	public Integer getPven_cheque(){
		return pven_cheque;
	}
	public void setPven_cheque(Integer pven_cheque){
		this.pven_cheque = pven_cheque;
	}
	public Double getPven_totalcheque(){
		return pven_totalcheque;
	}
	public void setPven_totalcheque(Double pven_totalcheque){
		this.pven_totalcheque = pven_totalcheque;
	}
	public Double getPven_totcguaranies(){
		return pven_totcguaranies;
	}
	public void setPven_totcguaranies(Double pven_totcguaranies){
		this.pven_totcguaranies = pven_totcguaranies;
	}
	public Double getPven_totcdolar(){
		return pven_totcdolar;
	}
	public void setPven_totcdolar(Double pven_totcdolar){
		this.pven_totcdolar = pven_totcdolar;
	}
	public Double getPven_totcreal(){
		return pven_totcreal;
	}
	public void setPven_totcreal(Double pven_totcreal){
		this.pven_totcreal = pven_totcreal;
	}
	public Double getPven_totcpeso(){
		return pven_totcpeso;
	}
	public void setPven_totcpeso(Double pven_totcpeso){
		this.pven_totcpeso = pven_totcpeso;
	}
	public Double getPven_totceuro(){
		return pven_totceuro;
	}
	public void setPven_totceuro(Double pven_totceuro){
		this.pven_totceuro = pven_totceuro;
	}
	public Integer getPven_tcredito(){
		return pven_tcredito;
	}
	public void setPven_tcredito(Integer pven_tcredito){
		this.pven_tcredito = pven_tcredito;
	}
	public Double getPven_totaltcredito(){
		return pven_totaltcredito;
	}
	public void setPven_totaltcredito(Double pven_totaltcredito){
		this.pven_totaltcredito = pven_totaltcredito;
	}
	public Double getPven_tottcguarani(){
		return pven_tottcguarani;
	}
	public void setPven_tottcguarani(Double pven_tottcguarani){
		this.pven_tottcguarani = pven_tottcguarani;
	}
	public Double getPven_tottcdolar(){
		return pven_tottcdolar;
	}
	public void setPven_tottcdolar(Double pven_tottcdolar){
		this.pven_tottcdolar = pven_tottcdolar;
	}
	public Double getPven_tottcreal(){
		return pven_tottcreal;
	}
	public void setPven_tottcreal(Double pven_tottcreal){
		this.pven_tottcreal = pven_tottcreal;
	}
	public Double getPven_tottcpeso(){
		return pven_tottcpeso;
	}
	public void setPven_tottcpeso(Double pven_tottcpeso){
		this.pven_tottcpeso = pven_tottcpeso;
	}
	public Double getPven_tottceuro(){
		return pven_tottceuro;
	}
	public void setPven_tottceuro(Double pven_tottceuro){
		this.pven_tottceuro = pven_tottceuro;
	}
	public Integer getPven_tdebito(){
		return pven_tdebito;
	}
	public void setPven_tdebito(Integer pven_tdebito){
		this.pven_tdebito = pven_tdebito;
	}
	public Double getPven_totaltdebito(){
		return pven_totaltdebito;
	}
	public void setPven_totaltdebito(Double pven_totaltdebito){
		this.pven_totaltdebito = pven_totaltdebito;
	}
	public Double getPven_tottdguarani(){
		return pven_tottdguarani;
	}
	public void setPven_tottdguarani(Double pven_tottdguarani){
		this.pven_tottdguarani = pven_tottdguarani;
	}
	public Double getPven_tottddolar(){
		return pven_tottddolar;
	}
	public void setPven_tottddolar(Double pven_tottddolar){
		this.pven_tottddolar = pven_tottddolar;
	}
	public Double getPven_tottdreal(){
		return pven_tottdreal;
	}
	public void setPven_tottdreal(Double pven_tottdreal){
		this.pven_tottdreal = pven_tottdreal;
	}
	public Double getPven_tottdpeso(){
		return pven_tottdpeso;
	}
	public void setPven_tottdpeso(Double pven_tottdpeso){
		this.pven_tottdpeso = pven_tottdpeso;
	}
	public Double getPven_tottdeuro(){
		return pven_tottdeuro;
	}
	public void setPven_tottdeuro(Double pven_tottdeuro){
		this.pven_tottdeuro = pven_tottdeuro;
	}
	public Integer getPven_nota(){
		return pven_nota;
	}
	public void setPven_nota(Integer pven_nota){
		this.pven_nota = pven_nota;
	}
	public Double getPven_totalnota(){
		return pven_totalnota;
	}
	public void setPven_totalnota(Double pven_totalnota){
		this.pven_totalnota = pven_totalnota;
	}
	public Double getPven_totnguarani(){
		return pven_totnguarani;
	}
	public void setPven_totnguarani(Double pven_totnguarani){
		this.pven_totnguarani = pven_totnguarani;
	}
	public Double getPven_totndolar(){
		return pven_totndolar;
	}
	public void setPven_totndolar(Double pven_totndolar){
		this.pven_totndolar = pven_totndolar;
	}
	public Double getPven_totnreal(){
		return pven_totnreal;
	}
	public void setPven_totnreal(Double pven_totnreal){
		this.pven_totnreal = pven_totnreal;
	}
	public Double getPven_totnpeso(){
		return pven_totnpeso;
	}
	public void setPven_totnpeso(Double pven_totnpeso){
		this.pven_totnpeso = pven_totnpeso;
	}
	public Double getPven_totneuro(){
		return pven_totneuro;
	}
	public void setPven_totneuro(Double pven_totneuro){
		this.pven_totneuro = pven_totneuro;
	}
	public String getPven_caja(){
		return pven_caja;
	}
	public void setPven_caja(String pven_caja){
		this.pven_caja = pven_caja;
	}
	public Double getPven_totvueguarani(){
		return pven_totvueguarani;
	}
	public void setPven_totvueguarani(Double pven_totvueguarani){
		this.pven_totvueguarani = pven_totvueguarani;
	}
	public Double getPven_totvuedolar(){
		return pven_totvuedolar;
	}
	public void setPven_totvuedolar(Double pven_totvuedolar){
		this.pven_totvuedolar = pven_totvuedolar;
	}
	public Double getPven_totvuereal(){
		return pven_totvuereal;
	}
	public void setPven_totvuereal(Double pven_totvuereal){
		this.pven_totvuereal = pven_totvuereal;
	}
	public Double getPven_totvuepeso(){
		return pven_totvuepeso;
	}
	public void setPven_totvuepeso(Double pven_totvuepeso){
		this.pven_totvuepeso = pven_totvuepeso;
	}
	public Double getPven_totvueeuro(){
		return pven_totvueeuro;
	}
	public void setPven_totvueeuro(Double pven_totvueeuro){
		this.pven_totvueeuro = pven_totvueeuro;
	}
	public Integer getPven_cierre(){
		return pven_cierre;
	}
	public void setPven_cierre(Integer pven_cierre){
		this.pven_cierre = pven_cierre;
	}
	public Integer getPven_borrado(){
		return pven_borrado;
	}
	public void setPven_borrado(Integer pven_borrado){
		this.pven_borrado = pven_borrado;
	}
	public Integer getPven_nrosuboperacion(){
		return pven_nrosuboperacion;
	}
	public void setPven_nrosuboperacion(Integer pven_nrosuboperacion){
		this.pven_nrosuboperacion = pven_nrosuboperacion;
	}
	public Integer getPven_nrorecibo(){
		return pven_nrorecibo;
	}
	public void setPven_nrorecibo(Integer pven_nrorecibo){
		this.pven_nrorecibo = pven_nrorecibo;
	}
	public String getPven_numdeposito(){
		return pven_numdeposito;
	}
	public void setPven_numdeposito(String pven_numdeposito){
		this.pven_numdeposito = pven_numdeposito;
	}
	public Integer getPven_banco(){
		return pven_banco;
	}
	public void setPven_banco(Integer pven_banco){
		this.pven_banco = pven_banco;
	}
	public Double getPven_totdbeuro(){
		return pven_totdbeuro;
	}
	public void setPven_totdbeuro(Double pven_totdbeuro){
		this.pven_totdbeuro = pven_totdbeuro;
	}
	public Double getPven_totdbreal(){
		return pven_totdbreal;
	}
	public void setPven_totdbreal(Double pven_totdbreal){
		this.pven_totdbreal = pven_totdbreal;
	}
	public Double getPven_totdbpeso(){
		return pven_totdbpeso;
	}
	public void setPven_totdbpeso(Double pven_totdbpeso){
		this.pven_totdbpeso = pven_totdbpeso;
	}
	public Double getPven_totdbdolar(){
		return pven_totdbdolar;
	}
	public void setPven_totdbdolar(Double pven_totdbdolar){
		this.pven_totdbdolar = pven_totdbdolar;
	}
	public Double getPven_totdbguarani(){
		return pven_totdbguarani;
	}
	public void setPven_totdbguarani(Double pven_totdbguarani){
		this.pven_totdbguarani = pven_totdbguarani;
	}
	public Double getPven_totaldepbancario(){
		return pven_totaldepbancario;
	}
	public void setPven_totaldepbancario(Double pven_totaldepbancario){
		this.pven_totaldepbancario = pven_totaldepbancario;
	}
	public Integer getPven_depbancario(){
		return pven_depbancario;
	}
	public void setPven_depbancario(Integer pven_depbancario){
		this.pven_depbancario = pven_depbancario;
	}
	public String getPven_numgiro(){
		return pven_numgiro;
	}
	public void setPven_numgiro(String pven_numgiro){
		this.pven_numgiro = pven_numgiro;
	}
	public String getPven_giromedio(){
		return pven_giromedio;
	}
	public void setPven_giromedio(String pven_giromedio){
		this.pven_giromedio = pven_giromedio;
	}
	public Double getPven_totgeuro(){
		return pven_totgeuro;
	}
	public void setPven_totgeuro(Double pven_totgeuro){
		this.pven_totgeuro = pven_totgeuro;
	}
	public Double getPven_totgreal(){
		return pven_totgreal;
	}
	public void setPven_totgreal(Double pven_totgreal){
		this.pven_totgreal = pven_totgreal;
	}
	public Double getPven_totgpeso(){
		return pven_totgpeso;
	}
	public void setPven_totgpeso(Double pven_totgpeso){
		this.pven_totgpeso = pven_totgpeso;
	}
	public Double getPven_totgdolar(){
		return pven_totgdolar;
	}
	public void setPven_totgdolar(Double pven_totgdolar){
		this.pven_totgdolar = pven_totgdolar;
	}
	public Double getPven_totgguarani(){
		return pven_totgguarani;
	}
	public void setPven_totgguarani(Double pven_totgguarani){
		this.pven_totgguarani = pven_totgguarani;
	}
	public Double getPven_totalgiro(){
		return pven_totalgiro;
	}
	public void setPven_totalgiro(Double pven_totalgiro){
		this.pven_totalgiro = pven_totalgiro;
	}
	public Integer getPven_giro(){
		return pven_giro;
	}
	public void setPven_giro(Integer pven_giro){
		this.pven_giro = pven_giro;
	}
	public Double getPven_interes(){
		return pven_interes;
	}
	public void setPven_interes(Double pven_interes){
		this.pven_interes = pven_interes;
	}
	public Integer getPven_deposito(){
		return pven_deposito;
	}
	public void setPven_deposito(Integer pven_deposito){
		this.pven_deposito = pven_deposito;
	}
	public Integer getPag_nrocierre(){
		return pag_nrocierre;
	}
	public void setPag_nrocierre(Integer pag_nrocierre){
		this.pag_nrocierre = pag_nrocierre;
	}
	public Integer getPven_nroliquidacion(){
		return pven_nroliquidacion;
	}
	public void setPven_nroliquidacion(Integer pven_nroliquidacion){
		this.pven_nroliquidacion = pven_nroliquidacion;
	}
	public Integer getPven_liquidacion(){
		return pven_liquidacion;
	}
	public void setPven_liquidacion(Integer pven_liquidacion){
		this.pven_liquidacion = pven_liquidacion;
	}
	public Integer getPven_cierrecajagennro(){
		return pven_cierrecajagennro;
	}
	public void setPven_cierrecajagennro(Integer pven_cierrecajagennro){
		this.pven_cierrecajagennro = pven_cierrecajagennro;
	}
	public Object getPven_numerorecibointerno(){
		return pven_numerorecibointerno;
	}
	public void setPven_numerorecibointerno(Object pven_numerorecibointerno){
		this.pven_numerorecibointerno = pven_numerorecibointerno;
	}

}