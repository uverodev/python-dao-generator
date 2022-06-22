package modelo;

public class Pago_comp{
	Integer pag_nro;
	Integer pag_nrocomp;
	Integer pag_tipo;
	String pag_fecha;
	String pag_hora;
	Integer pag_usuario;
	String pag_tipmovi;
	Double pag_totalgs;
	Double pag_totald;
	Double pag_totalr;
	Double pag_totalp;
	Double pag_totale;
	Integer pag_proveedor;
	Double pag_montorec;
	Double pag_montorecd;
	Double pag_montorecr;
	Double pag_montorecp;
	Double pag_montorece;
	Double pag_montofalt;
	Double pag_vuelto;
	Double pag_moneda;
	Double pag_dolar;
	Double pag_real;
	Double pag_peso;
	Double pag_euro;
	Integer pag_efectivo;
	Double pag_eguarani;
	Double pag_edolar;
	Double pag_ereal;
	Double pag_epeso;
	Double pag_eeuro;
	Integer pag_cheque;
	Double pag_cguarani;
	Double pag_cdolar;
	Double pag_creal;
	Double pag_cpeso;
	Double pag_ceuro;
	Integer pag_tcre;
	Double pag_tcguarani;
	Double pag_tcdolar;
	Double pag_tcreal;
	Double pag_tcpeso;
	Double pag_tceuro;
	Integer pag_tdeb;
	Double pag_tdguarani;
	Double pag_tddolar;
	Double pag_tdreal;
	Double pag_tdpeso;
	Double pag_tdeuro;
	Integer pag_nota;
	Double pag_nguarani;
	Double pag_ndolar;
	Double pag_nreal;
	Double pag_npeso;
	Double pag_neuro;
	Double pag_exoneracion;
	Integer pag_tiptcredito;
	String pag_numtcredito;
	Integer pag_tiptdebito;
	String pag_numtdebito;
	String pag_caja;
	Double pag_totvueguarani;
	Double pag_totvuedolar;
	Double pag_totvuereal;
	Double pag_totvuepeso;
	Double pag_totvueeuro;
	Integer pag_borrado;
	Integer pag_cierre;
	Integer pag_nrorecibo;
	Integer pag_deposito;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer pag_nrocierre;
	Integer pag_cierrecajagennro;
	Object pag_pc;

	public Pago_comp(Integer pag_nro, Integer pag_nrocomp, Integer pag_tipo, String pag_fecha, String pag_hora, Integer pag_usuario, String pag_tipmovi, Double pag_totalgs, Double pag_totald, Double pag_totalr, Double pag_totalp, Double pag_totale, Integer pag_proveedor, Double pag_montorec, Double pag_montorecd, Double pag_montorecr, Double pag_montorecp, Double pag_montorece, Double pag_montofalt, Double pag_vuelto, Double pag_moneda, Double pag_dolar, Double pag_real, Double pag_peso, Double pag_euro, Integer pag_efectivo, Double pag_eguarani, Double pag_edolar, Double pag_ereal, Double pag_epeso, Double pag_eeuro, Integer pag_cheque, Double pag_cguarani, Double pag_cdolar, Double pag_creal, Double pag_cpeso, Double pag_ceuro, Integer pag_tcre, Double pag_tcguarani, Double pag_tcdolar, Double pag_tcreal, Double pag_tcpeso, Double pag_tceuro, Integer pag_tdeb, Double pag_tdguarani, Double pag_tddolar, Double pag_tdreal, Double pag_tdpeso, Double pag_tdeuro, Integer pag_nota, Double pag_nguarani, Double pag_ndolar, Double pag_nreal, Double pag_npeso, Double pag_neuro, Double pag_exoneracion, Integer pag_tiptcredito, String pag_numtcredito, Integer pag_tiptdebito, String pag_numtdebito, String pag_caja, Double pag_totvueguarani, Double pag_totvuedolar, Double pag_totvuereal, Double pag_totvuepeso, Double pag_totvueeuro, Integer pag_borrado, Integer pag_cierre, Integer pag_nrorecibo, Integer pag_deposito, String fechasct, Integer usuariosct, String maquinasct, Integer pag_nrocierre, Integer pag_cierrecajagennro, Object pag_pc){
		this.pag_nro = pag_nro;
		this.pag_nrocomp = pag_nrocomp;
		this.pag_tipo = pag_tipo;
		this.pag_fecha = pag_fecha;
		this.pag_hora = pag_hora;
		this.pag_usuario = pag_usuario;
		this.pag_tipmovi = pag_tipmovi;
		this.pag_totalgs = pag_totalgs;
		this.pag_totald = pag_totald;
		this.pag_totalr = pag_totalr;
		this.pag_totalp = pag_totalp;
		this.pag_totale = pag_totale;
		this.pag_proveedor = pag_proveedor;
		this.pag_montorec = pag_montorec;
		this.pag_montorecd = pag_montorecd;
		this.pag_montorecr = pag_montorecr;
		this.pag_montorecp = pag_montorecp;
		this.pag_montorece = pag_montorece;
		this.pag_montofalt = pag_montofalt;
		this.pag_vuelto = pag_vuelto;
		this.pag_moneda = pag_moneda;
		this.pag_dolar = pag_dolar;
		this.pag_real = pag_real;
		this.pag_peso = pag_peso;
		this.pag_euro = pag_euro;
		this.pag_efectivo = pag_efectivo;
		this.pag_eguarani = pag_eguarani;
		this.pag_edolar = pag_edolar;
		this.pag_ereal = pag_ereal;
		this.pag_epeso = pag_epeso;
		this.pag_eeuro = pag_eeuro;
		this.pag_cheque = pag_cheque;
		this.pag_cguarani = pag_cguarani;
		this.pag_cdolar = pag_cdolar;
		this.pag_creal = pag_creal;
		this.pag_cpeso = pag_cpeso;
		this.pag_ceuro = pag_ceuro;
		this.pag_tcre = pag_tcre;
		this.pag_tcguarani = pag_tcguarani;
		this.pag_tcdolar = pag_tcdolar;
		this.pag_tcreal = pag_tcreal;
		this.pag_tcpeso = pag_tcpeso;
		this.pag_tceuro = pag_tceuro;
		this.pag_tdeb = pag_tdeb;
		this.pag_tdguarani = pag_tdguarani;
		this.pag_tddolar = pag_tddolar;
		this.pag_tdreal = pag_tdreal;
		this.pag_tdpeso = pag_tdpeso;
		this.pag_tdeuro = pag_tdeuro;
		this.pag_nota = pag_nota;
		this.pag_nguarani = pag_nguarani;
		this.pag_ndolar = pag_ndolar;
		this.pag_nreal = pag_nreal;
		this.pag_npeso = pag_npeso;
		this.pag_neuro = pag_neuro;
		this.pag_exoneracion = pag_exoneracion;
		this.pag_tiptcredito = pag_tiptcredito;
		this.pag_numtcredito = pag_numtcredito;
		this.pag_tiptdebito = pag_tiptdebito;
		this.pag_numtdebito = pag_numtdebito;
		this.pag_caja = pag_caja;
		this.pag_totvueguarani = pag_totvueguarani;
		this.pag_totvuedolar = pag_totvuedolar;
		this.pag_totvuereal = pag_totvuereal;
		this.pag_totvuepeso = pag_totvuepeso;
		this.pag_totvueeuro = pag_totvueeuro;
		this.pag_borrado = pag_borrado;
		this.pag_cierre = pag_cierre;
		this.pag_nrorecibo = pag_nrorecibo;
		this.pag_deposito = pag_deposito;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.pag_nrocierre = pag_nrocierre;
		this.pag_cierrecajagennro = pag_cierrecajagennro;
		this.pag_pc = pag_pc;
	}
	public Pago_comp(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Pago_comp{"+", pag_nro=" + pag_nro+", pag_nrocomp=" + pag_nrocomp+", pag_tipo=" + pag_tipo+", pag_fecha=" + pag_fecha+", pag_hora=" + pag_hora+", pag_usuario=" + pag_usuario+", pag_tipmovi=" + pag_tipmovi+", pag_totalgs=" + pag_totalgs+", pag_totald=" + pag_totald+", pag_totalr=" + pag_totalr+", pag_totalp=" + pag_totalp+", pag_totale=" + pag_totale+", pag_proveedor=" + pag_proveedor+", pag_montorec=" + pag_montorec+", pag_montorecd=" + pag_montorecd+", pag_montorecr=" + pag_montorecr+", pag_montorecp=" + pag_montorecp+", pag_montorece=" + pag_montorece+", pag_montofalt=" + pag_montofalt+", pag_vuelto=" + pag_vuelto+", pag_moneda=" + pag_moneda+", pag_dolar=" + pag_dolar+", pag_real=" + pag_real+", pag_peso=" + pag_peso+", pag_euro=" + pag_euro+", pag_efectivo=" + pag_efectivo+", pag_eguarani=" + pag_eguarani+", pag_edolar=" + pag_edolar+", pag_ereal=" + pag_ereal+", pag_epeso=" + pag_epeso+", pag_eeuro=" + pag_eeuro+", pag_cheque=" + pag_cheque+", pag_cguarani=" + pag_cguarani+", pag_cdolar=" + pag_cdolar+", pag_creal=" + pag_creal+", pag_cpeso=" + pag_cpeso+", pag_ceuro=" + pag_ceuro+", pag_tcre=" + pag_tcre+", pag_tcguarani=" + pag_tcguarani+", pag_tcdolar=" + pag_tcdolar+", pag_tcreal=" + pag_tcreal+", pag_tcpeso=" + pag_tcpeso+", pag_tceuro=" + pag_tceuro+", pag_tdeb=" + pag_tdeb+", pag_tdguarani=" + pag_tdguarani+", pag_tddolar=" + pag_tddolar+", pag_tdreal=" + pag_tdreal+", pag_tdpeso=" + pag_tdpeso+", pag_tdeuro=" + pag_tdeuro+", pag_nota=" + pag_nota+", pag_nguarani=" + pag_nguarani+", pag_ndolar=" + pag_ndolar+", pag_nreal=" + pag_nreal+", pag_npeso=" + pag_npeso+", pag_neuro=" + pag_neuro+", pag_exoneracion=" + pag_exoneracion+", pag_tiptcredito=" + pag_tiptcredito+", pag_numtcredito=" + pag_numtcredito+", pag_tiptdebito=" + pag_tiptdebito+", pag_numtdebito=" + pag_numtdebito+", pag_caja=" + pag_caja+", pag_totvueguarani=" + pag_totvueguarani+", pag_totvuedolar=" + pag_totvuedolar+", pag_totvuereal=" + pag_totvuereal+", pag_totvuepeso=" + pag_totvuepeso+", pag_totvueeuro=" + pag_totvueeuro+", pag_borrado=" + pag_borrado+", pag_cierre=" + pag_cierre+", pag_nrorecibo=" + pag_nrorecibo+", pag_deposito=" + pag_deposito+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", pag_nrocierre=" + pag_nrocierre+", pag_cierrecajagennro=" + pag_cierrecajagennro+", pag_pc=" + pag_pc+"}";

	}
	public Integer getPag_nro(){
		return pag_nro;
	}
	public void setPag_nro(Integer pag_nro){
		this.pag_nro = pag_nro;
	}
	public Integer getPag_nrocomp(){
		return pag_nrocomp;
	}
	public void setPag_nrocomp(Integer pag_nrocomp){
		this.pag_nrocomp = pag_nrocomp;
	}
	public Integer getPag_tipo(){
		return pag_tipo;
	}
	public void setPag_tipo(Integer pag_tipo){
		this.pag_tipo = pag_tipo;
	}
	public String getPag_fecha(){
		return pag_fecha;
	}
	public void setPag_fecha(String pag_fecha){
		this.pag_fecha = pag_fecha;
	}
	public String getPag_hora(){
		return pag_hora;
	}
	public void setPag_hora(String pag_hora){
		this.pag_hora = pag_hora;
	}
	public Integer getPag_usuario(){
		return pag_usuario;
	}
	public void setPag_usuario(Integer pag_usuario){
		this.pag_usuario = pag_usuario;
	}
	public String getPag_tipmovi(){
		return pag_tipmovi;
	}
	public void setPag_tipmovi(String pag_tipmovi){
		this.pag_tipmovi = pag_tipmovi;
	}
	public Double getPag_totalgs(){
		return pag_totalgs;
	}
	public void setPag_totalgs(Double pag_totalgs){
		this.pag_totalgs = pag_totalgs;
	}
	public Double getPag_totald(){
		return pag_totald;
	}
	public void setPag_totald(Double pag_totald){
		this.pag_totald = pag_totald;
	}
	public Double getPag_totalr(){
		return pag_totalr;
	}
	public void setPag_totalr(Double pag_totalr){
		this.pag_totalr = pag_totalr;
	}
	public Double getPag_totalp(){
		return pag_totalp;
	}
	public void setPag_totalp(Double pag_totalp){
		this.pag_totalp = pag_totalp;
	}
	public Double getPag_totale(){
		return pag_totale;
	}
	public void setPag_totale(Double pag_totale){
		this.pag_totale = pag_totale;
	}
	public Integer getPag_proveedor(){
		return pag_proveedor;
	}
	public void setPag_proveedor(Integer pag_proveedor){
		this.pag_proveedor = pag_proveedor;
	}
	public Double getPag_montorec(){
		return pag_montorec;
	}
	public void setPag_montorec(Double pag_montorec){
		this.pag_montorec = pag_montorec;
	}
	public Double getPag_montorecd(){
		return pag_montorecd;
	}
	public void setPag_montorecd(Double pag_montorecd){
		this.pag_montorecd = pag_montorecd;
	}
	public Double getPag_montorecr(){
		return pag_montorecr;
	}
	public void setPag_montorecr(Double pag_montorecr){
		this.pag_montorecr = pag_montorecr;
	}
	public Double getPag_montorecp(){
		return pag_montorecp;
	}
	public void setPag_montorecp(Double pag_montorecp){
		this.pag_montorecp = pag_montorecp;
	}
	public Double getPag_montorece(){
		return pag_montorece;
	}
	public void setPag_montorece(Double pag_montorece){
		this.pag_montorece = pag_montorece;
	}
	public Double getPag_montofalt(){
		return pag_montofalt;
	}
	public void setPag_montofalt(Double pag_montofalt){
		this.pag_montofalt = pag_montofalt;
	}
	public Double getPag_vuelto(){
		return pag_vuelto;
	}
	public void setPag_vuelto(Double pag_vuelto){
		this.pag_vuelto = pag_vuelto;
	}
	public Double getPag_moneda(){
		return pag_moneda;
	}
	public void setPag_moneda(Double pag_moneda){
		this.pag_moneda = pag_moneda;
	}
	public Double getPag_dolar(){
		return pag_dolar;
	}
	public void setPag_dolar(Double pag_dolar){
		this.pag_dolar = pag_dolar;
	}
	public Double getPag_real(){
		return pag_real;
	}
	public void setPag_real(Double pag_real){
		this.pag_real = pag_real;
	}
	public Double getPag_peso(){
		return pag_peso;
	}
	public void setPag_peso(Double pag_peso){
		this.pag_peso = pag_peso;
	}
	public Double getPag_euro(){
		return pag_euro;
	}
	public void setPag_euro(Double pag_euro){
		this.pag_euro = pag_euro;
	}
	public Integer getPag_efectivo(){
		return pag_efectivo;
	}
	public void setPag_efectivo(Integer pag_efectivo){
		this.pag_efectivo = pag_efectivo;
	}
	public Double getPag_eguarani(){
		return pag_eguarani;
	}
	public void setPag_eguarani(Double pag_eguarani){
		this.pag_eguarani = pag_eguarani;
	}
	public Double getPag_edolar(){
		return pag_edolar;
	}
	public void setPag_edolar(Double pag_edolar){
		this.pag_edolar = pag_edolar;
	}
	public Double getPag_ereal(){
		return pag_ereal;
	}
	public void setPag_ereal(Double pag_ereal){
		this.pag_ereal = pag_ereal;
	}
	public Double getPag_epeso(){
		return pag_epeso;
	}
	public void setPag_epeso(Double pag_epeso){
		this.pag_epeso = pag_epeso;
	}
	public Double getPag_eeuro(){
		return pag_eeuro;
	}
	public void setPag_eeuro(Double pag_eeuro){
		this.pag_eeuro = pag_eeuro;
	}
	public Integer getPag_cheque(){
		return pag_cheque;
	}
	public void setPag_cheque(Integer pag_cheque){
		this.pag_cheque = pag_cheque;
	}
	public Double getPag_cguarani(){
		return pag_cguarani;
	}
	public void setPag_cguarani(Double pag_cguarani){
		this.pag_cguarani = pag_cguarani;
	}
	public Double getPag_cdolar(){
		return pag_cdolar;
	}
	public void setPag_cdolar(Double pag_cdolar){
		this.pag_cdolar = pag_cdolar;
	}
	public Double getPag_creal(){
		return pag_creal;
	}
	public void setPag_creal(Double pag_creal){
		this.pag_creal = pag_creal;
	}
	public Double getPag_cpeso(){
		return pag_cpeso;
	}
	public void setPag_cpeso(Double pag_cpeso){
		this.pag_cpeso = pag_cpeso;
	}
	public Double getPag_ceuro(){
		return pag_ceuro;
	}
	public void setPag_ceuro(Double pag_ceuro){
		this.pag_ceuro = pag_ceuro;
	}
	public Integer getPag_tcre(){
		return pag_tcre;
	}
	public void setPag_tcre(Integer pag_tcre){
		this.pag_tcre = pag_tcre;
	}
	public Double getPag_tcguarani(){
		return pag_tcguarani;
	}
	public void setPag_tcguarani(Double pag_tcguarani){
		this.pag_tcguarani = pag_tcguarani;
	}
	public Double getPag_tcdolar(){
		return pag_tcdolar;
	}
	public void setPag_tcdolar(Double pag_tcdolar){
		this.pag_tcdolar = pag_tcdolar;
	}
	public Double getPag_tcreal(){
		return pag_tcreal;
	}
	public void setPag_tcreal(Double pag_tcreal){
		this.pag_tcreal = pag_tcreal;
	}
	public Double getPag_tcpeso(){
		return pag_tcpeso;
	}
	public void setPag_tcpeso(Double pag_tcpeso){
		this.pag_tcpeso = pag_tcpeso;
	}
	public Double getPag_tceuro(){
		return pag_tceuro;
	}
	public void setPag_tceuro(Double pag_tceuro){
		this.pag_tceuro = pag_tceuro;
	}
	public Integer getPag_tdeb(){
		return pag_tdeb;
	}
	public void setPag_tdeb(Integer pag_tdeb){
		this.pag_tdeb = pag_tdeb;
	}
	public Double getPag_tdguarani(){
		return pag_tdguarani;
	}
	public void setPag_tdguarani(Double pag_tdguarani){
		this.pag_tdguarani = pag_tdguarani;
	}
	public Double getPag_tddolar(){
		return pag_tddolar;
	}
	public void setPag_tddolar(Double pag_tddolar){
		this.pag_tddolar = pag_tddolar;
	}
	public Double getPag_tdreal(){
		return pag_tdreal;
	}
	public void setPag_tdreal(Double pag_tdreal){
		this.pag_tdreal = pag_tdreal;
	}
	public Double getPag_tdpeso(){
		return pag_tdpeso;
	}
	public void setPag_tdpeso(Double pag_tdpeso){
		this.pag_tdpeso = pag_tdpeso;
	}
	public Double getPag_tdeuro(){
		return pag_tdeuro;
	}
	public void setPag_tdeuro(Double pag_tdeuro){
		this.pag_tdeuro = pag_tdeuro;
	}
	public Integer getPag_nota(){
		return pag_nota;
	}
	public void setPag_nota(Integer pag_nota){
		this.pag_nota = pag_nota;
	}
	public Double getPag_nguarani(){
		return pag_nguarani;
	}
	public void setPag_nguarani(Double pag_nguarani){
		this.pag_nguarani = pag_nguarani;
	}
	public Double getPag_ndolar(){
		return pag_ndolar;
	}
	public void setPag_ndolar(Double pag_ndolar){
		this.pag_ndolar = pag_ndolar;
	}
	public Double getPag_nreal(){
		return pag_nreal;
	}
	public void setPag_nreal(Double pag_nreal){
		this.pag_nreal = pag_nreal;
	}
	public Double getPag_npeso(){
		return pag_npeso;
	}
	public void setPag_npeso(Double pag_npeso){
		this.pag_npeso = pag_npeso;
	}
	public Double getPag_neuro(){
		return pag_neuro;
	}
	public void setPag_neuro(Double pag_neuro){
		this.pag_neuro = pag_neuro;
	}
	public Double getPag_exoneracion(){
		return pag_exoneracion;
	}
	public void setPag_exoneracion(Double pag_exoneracion){
		this.pag_exoneracion = pag_exoneracion;
	}
	public Integer getPag_tiptcredito(){
		return pag_tiptcredito;
	}
	public void setPag_tiptcredito(Integer pag_tiptcredito){
		this.pag_tiptcredito = pag_tiptcredito;
	}
	public String getPag_numtcredito(){
		return pag_numtcredito;
	}
	public void setPag_numtcredito(String pag_numtcredito){
		this.pag_numtcredito = pag_numtcredito;
	}
	public Integer getPag_tiptdebito(){
		return pag_tiptdebito;
	}
	public void setPag_tiptdebito(Integer pag_tiptdebito){
		this.pag_tiptdebito = pag_tiptdebito;
	}
	public String getPag_numtdebito(){
		return pag_numtdebito;
	}
	public void setPag_numtdebito(String pag_numtdebito){
		this.pag_numtdebito = pag_numtdebito;
	}
	public String getPag_caja(){
		return pag_caja;
	}
	public void setPag_caja(String pag_caja){
		this.pag_caja = pag_caja;
	}
	public Double getPag_totvueguarani(){
		return pag_totvueguarani;
	}
	public void setPag_totvueguarani(Double pag_totvueguarani){
		this.pag_totvueguarani = pag_totvueguarani;
	}
	public Double getPag_totvuedolar(){
		return pag_totvuedolar;
	}
	public void setPag_totvuedolar(Double pag_totvuedolar){
		this.pag_totvuedolar = pag_totvuedolar;
	}
	public Double getPag_totvuereal(){
		return pag_totvuereal;
	}
	public void setPag_totvuereal(Double pag_totvuereal){
		this.pag_totvuereal = pag_totvuereal;
	}
	public Double getPag_totvuepeso(){
		return pag_totvuepeso;
	}
	public void setPag_totvuepeso(Double pag_totvuepeso){
		this.pag_totvuepeso = pag_totvuepeso;
	}
	public Double getPag_totvueeuro(){
		return pag_totvueeuro;
	}
	public void setPag_totvueeuro(Double pag_totvueeuro){
		this.pag_totvueeuro = pag_totvueeuro;
	}
	public Integer getPag_borrado(){
		return pag_borrado;
	}
	public void setPag_borrado(Integer pag_borrado){
		this.pag_borrado = pag_borrado;
	}
	public Integer getPag_cierre(){
		return pag_cierre;
	}
	public void setPag_cierre(Integer pag_cierre){
		this.pag_cierre = pag_cierre;
	}
	public Integer getPag_nrorecibo(){
		return pag_nrorecibo;
	}
	public void setPag_nrorecibo(Integer pag_nrorecibo){
		this.pag_nrorecibo = pag_nrorecibo;
	}
	public Integer getPag_deposito(){
		return pag_deposito;
	}
	public void setPag_deposito(Integer pag_deposito){
		this.pag_deposito = pag_deposito;
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
	public Integer getPag_nrocierre(){
		return pag_nrocierre;
	}
	public void setPag_nrocierre(Integer pag_nrocierre){
		this.pag_nrocierre = pag_nrocierre;
	}
	public Integer getPag_cierrecajagennro(){
		return pag_cierrecajagennro;
	}
	public void setPag_cierrecajagennro(Integer pag_cierrecajagennro){
		this.pag_cierrecajagennro = pag_cierrecajagennro;
	}
	public Object getPag_pc(){
		return pag_pc;
	}
	public void setPag_pc(Object pag_pc){
		this.pag_pc = pag_pc;
	}

}