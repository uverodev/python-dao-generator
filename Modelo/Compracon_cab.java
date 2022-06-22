package modelo;

public class Compracon_cab{
	Integer com_nro;
	String com_nrofact;
	String com_hora;
	Integer com_usua;
	String com_movim;
	String com_fechac;
	String com_fecha;
	Integer com_proveedor;
	Double com_total;
	Double com_totald;
	Double com_totalp;
	Double com_totalr;
	Double com_totale;
	Integer com_activo;
	Double com_moneda;
	Double com_monedo;
	Double com_monepe;
	Double com_monere;
	Double com_moneeu;
	String com_nucaja;
	Integer com_ubica;
	Integer com_tip;
	Double com_desc;
	Integer com_cierre;
	Integer com_tipoperacion;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer com_deposito;
	Integer com_nrocierre;
	Integer com_pagado;
	Integer com_usuariopago;
	Object com_pcpago;
	String com_fechapago;
	Integer com_cierrecajanro;
	Integer com_cierrecajagennro;
	Integer com_nro_pedido;
	Integer com_empresa;
	String com_timbrado;
	String com_fin_vigencia;

	public Compracon_cab(Integer com_nro, String com_nrofact, String com_hora, Integer com_usua, String com_movim, String com_fechac, String com_fecha, Integer com_proveedor, Double com_total, Double com_totald, Double com_totalp, Double com_totalr, Double com_totale, Integer com_activo, Double com_moneda, Double com_monedo, Double com_monepe, Double com_monere, Double com_moneeu, String com_nucaja, Integer com_ubica, Integer com_tip, Double com_desc, Integer com_cierre, Integer com_tipoperacion, String fechasct, Integer usuariosct, String maquinasct, Integer com_deposito, Integer com_nrocierre, Integer com_pagado, Integer com_usuariopago, Object com_pcpago, String com_fechapago, Integer com_cierrecajanro, Integer com_cierrecajagennro, Integer com_nro_pedido, Integer com_empresa, String com_timbrado, String com_fin_vigencia){
		this.com_nro = com_nro;
		this.com_nrofact = com_nrofact;
		this.com_hora = com_hora;
		this.com_usua = com_usua;
		this.com_movim = com_movim;
		this.com_fechac = com_fechac;
		this.com_fecha = com_fecha;
		this.com_proveedor = com_proveedor;
		this.com_total = com_total;
		this.com_totald = com_totald;
		this.com_totalp = com_totalp;
		this.com_totalr = com_totalr;
		this.com_totale = com_totale;
		this.com_activo = com_activo;
		this.com_moneda = com_moneda;
		this.com_monedo = com_monedo;
		this.com_monepe = com_monepe;
		this.com_monere = com_monere;
		this.com_moneeu = com_moneeu;
		this.com_nucaja = com_nucaja;
		this.com_ubica = com_ubica;
		this.com_tip = com_tip;
		this.com_desc = com_desc;
		this.com_cierre = com_cierre;
		this.com_tipoperacion = com_tipoperacion;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.com_deposito = com_deposito;
		this.com_nrocierre = com_nrocierre;
		this.com_pagado = com_pagado;
		this.com_usuariopago = com_usuariopago;
		this.com_pcpago = com_pcpago;
		this.com_fechapago = com_fechapago;
		this.com_cierrecajanro = com_cierrecajanro;
		this.com_cierrecajagennro = com_cierrecajagennro;
		this.com_nro_pedido = com_nro_pedido;
		this.com_empresa = com_empresa;
		this.com_timbrado = com_timbrado;
		this.com_fin_vigencia = com_fin_vigencia;
	}
	public Compracon_cab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compracon_cab{"+", com_nro=" + com_nro+", com_nrofact=" + com_nrofact+", com_hora=" + com_hora+", com_usua=" + com_usua+", com_movim=" + com_movim+", com_fechac=" + com_fechac+", com_fecha=" + com_fecha+", com_proveedor=" + com_proveedor+", com_total=" + com_total+", com_totald=" + com_totald+", com_totalp=" + com_totalp+", com_totalr=" + com_totalr+", com_totale=" + com_totale+", com_activo=" + com_activo+", com_moneda=" + com_moneda+", com_monedo=" + com_monedo+", com_monepe=" + com_monepe+", com_monere=" + com_monere+", com_moneeu=" + com_moneeu+", com_nucaja=" + com_nucaja+", com_ubica=" + com_ubica+", com_tip=" + com_tip+", com_desc=" + com_desc+", com_cierre=" + com_cierre+", com_tipoperacion=" + com_tipoperacion+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", com_deposito=" + com_deposito+", com_nrocierre=" + com_nrocierre+", com_pagado=" + com_pagado+", com_usuariopago=" + com_usuariopago+", com_pcpago=" + com_pcpago+", com_fechapago=" + com_fechapago+", com_cierrecajanro=" + com_cierrecajanro+", com_cierrecajagennro=" + com_cierrecajagennro+", com_nro_pedido=" + com_nro_pedido+", com_empresa=" + com_empresa+", com_timbrado=" + com_timbrado+", com_fin_vigencia=" + com_fin_vigencia+"}";

	}
	public Integer getCom_nro(){
		return com_nro;
	}
	public void setCom_nro(Integer com_nro){
		this.com_nro = com_nro;
	}
	public String getCom_nrofact(){
		return com_nrofact;
	}
	public void setCom_nrofact(String com_nrofact){
		this.com_nrofact = com_nrofact;
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
	public Integer getCom_proveedor(){
		return com_proveedor;
	}
	public void setCom_proveedor(Integer com_proveedor){
		this.com_proveedor = com_proveedor;
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
	public Double getCom_totalp(){
		return com_totalp;
	}
	public void setCom_totalp(Double com_totalp){
		this.com_totalp = com_totalp;
	}
	public Double getCom_totalr(){
		return com_totalr;
	}
	public void setCom_totalr(Double com_totalr){
		this.com_totalr = com_totalr;
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
	public Double getCom_moneda(){
		return com_moneda;
	}
	public void setCom_moneda(Double com_moneda){
		this.com_moneda = com_moneda;
	}
	public Double getCom_monedo(){
		return com_monedo;
	}
	public void setCom_monedo(Double com_monedo){
		this.com_monedo = com_monedo;
	}
	public Double getCom_monepe(){
		return com_monepe;
	}
	public void setCom_monepe(Double com_monepe){
		this.com_monepe = com_monepe;
	}
	public Double getCom_monere(){
		return com_monere;
	}
	public void setCom_monere(Double com_monere){
		this.com_monere = com_monere;
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
	public Integer getCom_cierre(){
		return com_cierre;
	}
	public void setCom_cierre(Integer com_cierre){
		this.com_cierre = com_cierre;
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
	public Integer getCom_nrocierre(){
		return com_nrocierre;
	}
	public void setCom_nrocierre(Integer com_nrocierre){
		this.com_nrocierre = com_nrocierre;
	}
	public Integer getCom_pagado(){
		return com_pagado;
	}
	public void setCom_pagado(Integer com_pagado){
		this.com_pagado = com_pagado;
	}
	public Integer getCom_usuariopago(){
		return com_usuariopago;
	}
	public void setCom_usuariopago(Integer com_usuariopago){
		this.com_usuariopago = com_usuariopago;
	}
	public Object getCom_pcpago(){
		return com_pcpago;
	}
	public void setCom_pcpago(Object com_pcpago){
		this.com_pcpago = com_pcpago;
	}
	public String getCom_fechapago(){
		return com_fechapago;
	}
	public void setCom_fechapago(String com_fechapago){
		this.com_fechapago = com_fechapago;
	}
	public Integer getCom_cierrecajanro(){
		return com_cierrecajanro;
	}
	public void setCom_cierrecajanro(Integer com_cierrecajanro){
		this.com_cierrecajanro = com_cierrecajanro;
	}
	public Integer getCom_cierrecajagennro(){
		return com_cierrecajagennro;
	}
	public void setCom_cierrecajagennro(Integer com_cierrecajagennro){
		this.com_cierrecajagennro = com_cierrecajagennro;
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