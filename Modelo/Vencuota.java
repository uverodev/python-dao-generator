package modelo;

public class Vencuota{
	Integer vcta_nro;
	Integer vcta_numcuota;
	Integer vcta_cobrador;
	Integer vcta_numventa;
	Integer vcta_tipcobro;
	String vcta_cliente;
	String vcta_fechapago;
	String vcta_fechavenci;
	Double vcta_totcuota;
	Double vcta_interescre;
	Double vcta_cdolar;
	Double vcta_creal;
	Double vcta_cpeso;
	Double vcta_ceuro;
	Double vcta_entrega;
	Integer vcta_nrocredito;
	Integer vcta_pagado;
	Integer vcta_borrado;
	Double vcta_interes;
	Double vcta_entinteres;
	String vcta_fechaultpago;
	Integer vcta_nroliquidacion;
	Integer vcta_liquidado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Vencuota(Integer vcta_nro, Integer vcta_numcuota, Integer vcta_cobrador, Integer vcta_numventa, Integer vcta_tipcobro, String vcta_cliente, String vcta_fechapago, String vcta_fechavenci, Double vcta_totcuota, Double vcta_interescre, Double vcta_cdolar, Double vcta_creal, Double vcta_cpeso, Double vcta_ceuro, Double vcta_entrega, Integer vcta_nrocredito, Integer vcta_pagado, Integer vcta_borrado, Double vcta_interes, Double vcta_entinteres, String vcta_fechaultpago, Integer vcta_nroliquidacion, Integer vcta_liquidado, String fechasct, Integer usuariosct, String maquinasct){
		this.vcta_nro = vcta_nro;
		this.vcta_numcuota = vcta_numcuota;
		this.vcta_cobrador = vcta_cobrador;
		this.vcta_numventa = vcta_numventa;
		this.vcta_tipcobro = vcta_tipcobro;
		this.vcta_cliente = vcta_cliente;
		this.vcta_fechapago = vcta_fechapago;
		this.vcta_fechavenci = vcta_fechavenci;
		this.vcta_totcuota = vcta_totcuota;
		this.vcta_interescre = vcta_interescre;
		this.vcta_cdolar = vcta_cdolar;
		this.vcta_creal = vcta_creal;
		this.vcta_cpeso = vcta_cpeso;
		this.vcta_ceuro = vcta_ceuro;
		this.vcta_entrega = vcta_entrega;
		this.vcta_nrocredito = vcta_nrocredito;
		this.vcta_pagado = vcta_pagado;
		this.vcta_borrado = vcta_borrado;
		this.vcta_interes = vcta_interes;
		this.vcta_entinteres = vcta_entinteres;
		this.vcta_fechaultpago = vcta_fechaultpago;
		this.vcta_nroliquidacion = vcta_nroliquidacion;
		this.vcta_liquidado = vcta_liquidado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Vencuota(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Vencuota{"+", vcta_nro=" + vcta_nro+", vcta_numcuota=" + vcta_numcuota+", vcta_cobrador=" + vcta_cobrador+", vcta_numventa=" + vcta_numventa+", vcta_tipcobro=" + vcta_tipcobro+", vcta_cliente=" + vcta_cliente+", vcta_fechapago=" + vcta_fechapago+", vcta_fechavenci=" + vcta_fechavenci+", vcta_totcuota=" + vcta_totcuota+", vcta_interescre=" + vcta_interescre+", vcta_cdolar=" + vcta_cdolar+", vcta_creal=" + vcta_creal+", vcta_cpeso=" + vcta_cpeso+", vcta_ceuro=" + vcta_ceuro+", vcta_entrega=" + vcta_entrega+", vcta_nrocredito=" + vcta_nrocredito+", vcta_pagado=" + vcta_pagado+", vcta_borrado=" + vcta_borrado+", vcta_interes=" + vcta_interes+", vcta_entinteres=" + vcta_entinteres+", vcta_fechaultpago=" + vcta_fechaultpago+", vcta_nroliquidacion=" + vcta_nroliquidacion+", vcta_liquidado=" + vcta_liquidado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getVcta_nro(){
		return vcta_nro;
	}
	public void setVcta_nro(Integer vcta_nro){
		this.vcta_nro = vcta_nro;
	}
	public Integer getVcta_numcuota(){
		return vcta_numcuota;
	}
	public void setVcta_numcuota(Integer vcta_numcuota){
		this.vcta_numcuota = vcta_numcuota;
	}
	public Integer getVcta_cobrador(){
		return vcta_cobrador;
	}
	public void setVcta_cobrador(Integer vcta_cobrador){
		this.vcta_cobrador = vcta_cobrador;
	}
	public Integer getVcta_numventa(){
		return vcta_numventa;
	}
	public void setVcta_numventa(Integer vcta_numventa){
		this.vcta_numventa = vcta_numventa;
	}
	public Integer getVcta_tipcobro(){
		return vcta_tipcobro;
	}
	public void setVcta_tipcobro(Integer vcta_tipcobro){
		this.vcta_tipcobro = vcta_tipcobro;
	}
	public String getVcta_cliente(){
		return vcta_cliente;
	}
	public void setVcta_cliente(String vcta_cliente){
		this.vcta_cliente = vcta_cliente;
	}
	public String getVcta_fechapago(){
		return vcta_fechapago;
	}
	public void setVcta_fechapago(String vcta_fechapago){
		this.vcta_fechapago = vcta_fechapago;
	}
	public String getVcta_fechavenci(){
		return vcta_fechavenci;
	}
	public void setVcta_fechavenci(String vcta_fechavenci){
		this.vcta_fechavenci = vcta_fechavenci;
	}
	public Double getVcta_totcuota(){
		return vcta_totcuota;
	}
	public void setVcta_totcuota(Double vcta_totcuota){
		this.vcta_totcuota = vcta_totcuota;
	}
	public Double getVcta_interescre(){
		return vcta_interescre;
	}
	public void setVcta_interescre(Double vcta_interescre){
		this.vcta_interescre = vcta_interescre;
	}
	public Double getVcta_cdolar(){
		return vcta_cdolar;
	}
	public void setVcta_cdolar(Double vcta_cdolar){
		this.vcta_cdolar = vcta_cdolar;
	}
	public Double getVcta_creal(){
		return vcta_creal;
	}
	public void setVcta_creal(Double vcta_creal){
		this.vcta_creal = vcta_creal;
	}
	public Double getVcta_cpeso(){
		return vcta_cpeso;
	}
	public void setVcta_cpeso(Double vcta_cpeso){
		this.vcta_cpeso = vcta_cpeso;
	}
	public Double getVcta_ceuro(){
		return vcta_ceuro;
	}
	public void setVcta_ceuro(Double vcta_ceuro){
		this.vcta_ceuro = vcta_ceuro;
	}
	public Double getVcta_entrega(){
		return vcta_entrega;
	}
	public void setVcta_entrega(Double vcta_entrega){
		this.vcta_entrega = vcta_entrega;
	}
	public Integer getVcta_nrocredito(){
		return vcta_nrocredito;
	}
	public void setVcta_nrocredito(Integer vcta_nrocredito){
		this.vcta_nrocredito = vcta_nrocredito;
	}
	public Integer getVcta_pagado(){
		return vcta_pagado;
	}
	public void setVcta_pagado(Integer vcta_pagado){
		this.vcta_pagado = vcta_pagado;
	}
	public Integer getVcta_borrado(){
		return vcta_borrado;
	}
	public void setVcta_borrado(Integer vcta_borrado){
		this.vcta_borrado = vcta_borrado;
	}
	public Double getVcta_interes(){
		return vcta_interes;
	}
	public void setVcta_interes(Double vcta_interes){
		this.vcta_interes = vcta_interes;
	}
	public Double getVcta_entinteres(){
		return vcta_entinteres;
	}
	public void setVcta_entinteres(Double vcta_entinteres){
		this.vcta_entinteres = vcta_entinteres;
	}
	public String getVcta_fechaultpago(){
		return vcta_fechaultpago;
	}
	public void setVcta_fechaultpago(String vcta_fechaultpago){
		this.vcta_fechaultpago = vcta_fechaultpago;
	}
	public Integer getVcta_nroliquidacion(){
		return vcta_nroliquidacion;
	}
	public void setVcta_nroliquidacion(Integer vcta_nroliquidacion){
		this.vcta_nroliquidacion = vcta_nroliquidacion;
	}
	public Integer getVcta_liquidado(){
		return vcta_liquidado;
	}
	public void setVcta_liquidado(Integer vcta_liquidado){
		this.vcta_liquidado = vcta_liquidado;
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