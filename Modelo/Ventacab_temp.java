package modelo;

public class Ventacab_temp{
	Integer vent_nro;
	String vent_fecha;
	String vent_fechacarga;
	Integer vent_usuario;
	String vent_hora;
	String vent_cliente;
	Integer vent_tipo;
	Double vent_total;
	Double vent_cdolar;
	Double vent_creal;
	Double vent_cpeso;
	Double vent_ceuro;
	Double vent_vendedor;
	Double vent_moneda;
	Double vent_descuento;
	Double vent_totalexe;
	Double vent_totaliva5;
	Double vent_totaliva10;
	Double vent_totalitem;
	Double vent_totaliva;
	Integer vent_cierre;
	Integer vent_regturista;
	Integer vent_borrado;
	Integer vent_confirmado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer vent_nrocierre;
	Double vent_totanterior;
	Integer vent_liquidacion;
	Integer vent_nroliquidacion;
	Integer vent_deposito;
	Integer vent_implegal;
	Double vent_saldoanterior;
	Integer vent_transentregado;
	Integer vent_transporte;
	Integer vent_factura;
	Integer vent_cierrecajagennro;
	Integer vent_guia;
	Double vent_montoguia;
	Integer vent_mayorista;
	Object vent_numerofactura;
	Integer vent_local;
	Object vent_numerocontrato;
	Integer vent_tipofactura;

	public Ventacab_temp(Integer vent_nro, String vent_fecha, String vent_fechacarga, Integer vent_usuario, String vent_hora, String vent_cliente, Integer vent_tipo, Double vent_total, Double vent_cdolar, Double vent_creal, Double vent_cpeso, Double vent_ceuro, Double vent_vendedor, Double vent_moneda, Double vent_descuento, Double vent_totalexe, Double vent_totaliva5, Double vent_totaliva10, Double vent_totalitem, Double vent_totaliva, Integer vent_cierre, Integer vent_regturista, Integer vent_borrado, Integer vent_confirmado, String fechasct, Integer usuariosct, String maquinasct, Integer vent_nrocierre, Double vent_totanterior, Integer vent_liquidacion, Integer vent_nroliquidacion, Integer vent_deposito, Integer vent_implegal, Double vent_saldoanterior, Integer vent_transentregado, Integer vent_transporte, Integer vent_factura, Integer vent_cierrecajagennro, Integer vent_guia, Double vent_montoguia, Integer vent_mayorista, Object vent_numerofactura, Integer vent_local, Object vent_numerocontrato, Integer vent_tipofactura){
		this.vent_nro = vent_nro;
		this.vent_fecha = vent_fecha;
		this.vent_fechacarga = vent_fechacarga;
		this.vent_usuario = vent_usuario;
		this.vent_hora = vent_hora;
		this.vent_cliente = vent_cliente;
		this.vent_tipo = vent_tipo;
		this.vent_total = vent_total;
		this.vent_cdolar = vent_cdolar;
		this.vent_creal = vent_creal;
		this.vent_cpeso = vent_cpeso;
		this.vent_ceuro = vent_ceuro;
		this.vent_vendedor = vent_vendedor;
		this.vent_moneda = vent_moneda;
		this.vent_descuento = vent_descuento;
		this.vent_totalexe = vent_totalexe;
		this.vent_totaliva5 = vent_totaliva5;
		this.vent_totaliva10 = vent_totaliva10;
		this.vent_totalitem = vent_totalitem;
		this.vent_totaliva = vent_totaliva;
		this.vent_cierre = vent_cierre;
		this.vent_regturista = vent_regturista;
		this.vent_borrado = vent_borrado;
		this.vent_confirmado = vent_confirmado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.vent_nrocierre = vent_nrocierre;
		this.vent_totanterior = vent_totanterior;
		this.vent_liquidacion = vent_liquidacion;
		this.vent_nroliquidacion = vent_nroliquidacion;
		this.vent_deposito = vent_deposito;
		this.vent_implegal = vent_implegal;
		this.vent_saldoanterior = vent_saldoanterior;
		this.vent_transentregado = vent_transentregado;
		this.vent_transporte = vent_transporte;
		this.vent_factura = vent_factura;
		this.vent_cierrecajagennro = vent_cierrecajagennro;
		this.vent_guia = vent_guia;
		this.vent_montoguia = vent_montoguia;
		this.vent_mayorista = vent_mayorista;
		this.vent_numerofactura = vent_numerofactura;
		this.vent_local = vent_local;
		this.vent_numerocontrato = vent_numerocontrato;
		this.vent_tipofactura = vent_tipofactura;
	}
	public Ventacab_temp(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventacab_temp{"+", vent_nro=" + vent_nro+", vent_fecha=" + vent_fecha+", vent_fechacarga=" + vent_fechacarga+", vent_usuario=" + vent_usuario+", vent_hora=" + vent_hora+", vent_cliente=" + vent_cliente+", vent_tipo=" + vent_tipo+", vent_total=" + vent_total+", vent_cdolar=" + vent_cdolar+", vent_creal=" + vent_creal+", vent_cpeso=" + vent_cpeso+", vent_ceuro=" + vent_ceuro+", vent_vendedor=" + vent_vendedor+", vent_moneda=" + vent_moneda+", vent_descuento=" + vent_descuento+", vent_totalexe=" + vent_totalexe+", vent_totaliva5=" + vent_totaliva5+", vent_totaliva10=" + vent_totaliva10+", vent_totalitem=" + vent_totalitem+", vent_totaliva=" + vent_totaliva+", vent_cierre=" + vent_cierre+", vent_regturista=" + vent_regturista+", vent_borrado=" + vent_borrado+", vent_confirmado=" + vent_confirmado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", vent_nrocierre=" + vent_nrocierre+", vent_totanterior=" + vent_totanterior+", vent_liquidacion=" + vent_liquidacion+", vent_nroliquidacion=" + vent_nroliquidacion+", vent_deposito=" + vent_deposito+", vent_implegal=" + vent_implegal+", vent_saldoanterior=" + vent_saldoanterior+", vent_transentregado=" + vent_transentregado+", vent_transporte=" + vent_transporte+", vent_factura=" + vent_factura+", vent_cierrecajagennro=" + vent_cierrecajagennro+", vent_guia=" + vent_guia+", vent_montoguia=" + vent_montoguia+", vent_mayorista=" + vent_mayorista+", vent_numerofactura=" + vent_numerofactura+", vent_local=" + vent_local+", vent_numerocontrato=" + vent_numerocontrato+", vent_tipofactura=" + vent_tipofactura+"}";

	}
	public Integer getVent_nro(){
		return vent_nro;
	}
	public void setVent_nro(Integer vent_nro){
		this.vent_nro = vent_nro;
	}
	public String getVent_fecha(){
		return vent_fecha;
	}
	public void setVent_fecha(String vent_fecha){
		this.vent_fecha = vent_fecha;
	}
	public String getVent_fechacarga(){
		return vent_fechacarga;
	}
	public void setVent_fechacarga(String vent_fechacarga){
		this.vent_fechacarga = vent_fechacarga;
	}
	public Integer getVent_usuario(){
		return vent_usuario;
	}
	public void setVent_usuario(Integer vent_usuario){
		this.vent_usuario = vent_usuario;
	}
	public String getVent_hora(){
		return vent_hora;
	}
	public void setVent_hora(String vent_hora){
		this.vent_hora = vent_hora;
	}
	public String getVent_cliente(){
		return vent_cliente;
	}
	public void setVent_cliente(String vent_cliente){
		this.vent_cliente = vent_cliente;
	}
	public Integer getVent_tipo(){
		return vent_tipo;
	}
	public void setVent_tipo(Integer vent_tipo){
		this.vent_tipo = vent_tipo;
	}
	public Double getVent_total(){
		return vent_total;
	}
	public void setVent_total(Double vent_total){
		this.vent_total = vent_total;
	}
	public Double getVent_cdolar(){
		return vent_cdolar;
	}
	public void setVent_cdolar(Double vent_cdolar){
		this.vent_cdolar = vent_cdolar;
	}
	public Double getVent_creal(){
		return vent_creal;
	}
	public void setVent_creal(Double vent_creal){
		this.vent_creal = vent_creal;
	}
	public Double getVent_cpeso(){
		return vent_cpeso;
	}
	public void setVent_cpeso(Double vent_cpeso){
		this.vent_cpeso = vent_cpeso;
	}
	public Double getVent_ceuro(){
		return vent_ceuro;
	}
	public void setVent_ceuro(Double vent_ceuro){
		this.vent_ceuro = vent_ceuro;
	}
	public Double getVent_vendedor(){
		return vent_vendedor;
	}
	public void setVent_vendedor(Double vent_vendedor){
		this.vent_vendedor = vent_vendedor;
	}
	public Double getVent_moneda(){
		return vent_moneda;
	}
	public void setVent_moneda(Double vent_moneda){
		this.vent_moneda = vent_moneda;
	}
	public Double getVent_descuento(){
		return vent_descuento;
	}
	public void setVent_descuento(Double vent_descuento){
		this.vent_descuento = vent_descuento;
	}
	public Double getVent_totalexe(){
		return vent_totalexe;
	}
	public void setVent_totalexe(Double vent_totalexe){
		this.vent_totalexe = vent_totalexe;
	}
	public Double getVent_totaliva5(){
		return vent_totaliva5;
	}
	public void setVent_totaliva5(Double vent_totaliva5){
		this.vent_totaliva5 = vent_totaliva5;
	}
	public Double getVent_totaliva10(){
		return vent_totaliva10;
	}
	public void setVent_totaliva10(Double vent_totaliva10){
		this.vent_totaliva10 = vent_totaliva10;
	}
	public Double getVent_totalitem(){
		return vent_totalitem;
	}
	public void setVent_totalitem(Double vent_totalitem){
		this.vent_totalitem = vent_totalitem;
	}
	public Double getVent_totaliva(){
		return vent_totaliva;
	}
	public void setVent_totaliva(Double vent_totaliva){
		this.vent_totaliva = vent_totaliva;
	}
	public Integer getVent_cierre(){
		return vent_cierre;
	}
	public void setVent_cierre(Integer vent_cierre){
		this.vent_cierre = vent_cierre;
	}
	public Integer getVent_regturista(){
		return vent_regturista;
	}
	public void setVent_regturista(Integer vent_regturista){
		this.vent_regturista = vent_regturista;
	}
	public Integer getVent_borrado(){
		return vent_borrado;
	}
	public void setVent_borrado(Integer vent_borrado){
		this.vent_borrado = vent_borrado;
	}
	public Integer getVent_confirmado(){
		return vent_confirmado;
	}
	public void setVent_confirmado(Integer vent_confirmado){
		this.vent_confirmado = vent_confirmado;
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
	public Integer getVent_nrocierre(){
		return vent_nrocierre;
	}
	public void setVent_nrocierre(Integer vent_nrocierre){
		this.vent_nrocierre = vent_nrocierre;
	}
	public Double getVent_totanterior(){
		return vent_totanterior;
	}
	public void setVent_totanterior(Double vent_totanterior){
		this.vent_totanterior = vent_totanterior;
	}
	public Integer getVent_liquidacion(){
		return vent_liquidacion;
	}
	public void setVent_liquidacion(Integer vent_liquidacion){
		this.vent_liquidacion = vent_liquidacion;
	}
	public Integer getVent_nroliquidacion(){
		return vent_nroliquidacion;
	}
	public void setVent_nroliquidacion(Integer vent_nroliquidacion){
		this.vent_nroliquidacion = vent_nroliquidacion;
	}
	public Integer getVent_deposito(){
		return vent_deposito;
	}
	public void setVent_deposito(Integer vent_deposito){
		this.vent_deposito = vent_deposito;
	}
	public Integer getVent_implegal(){
		return vent_implegal;
	}
	public void setVent_implegal(Integer vent_implegal){
		this.vent_implegal = vent_implegal;
	}
	public Double getVent_saldoanterior(){
		return vent_saldoanterior;
	}
	public void setVent_saldoanterior(Double vent_saldoanterior){
		this.vent_saldoanterior = vent_saldoanterior;
	}
	public Integer getVent_transentregado(){
		return vent_transentregado;
	}
	public void setVent_transentregado(Integer vent_transentregado){
		this.vent_transentregado = vent_transentregado;
	}
	public Integer getVent_transporte(){
		return vent_transporte;
	}
	public void setVent_transporte(Integer vent_transporte){
		this.vent_transporte = vent_transporte;
	}
	public Integer getVent_factura(){
		return vent_factura;
	}
	public void setVent_factura(Integer vent_factura){
		this.vent_factura = vent_factura;
	}
	public Integer getVent_cierrecajagennro(){
		return vent_cierrecajagennro;
	}
	public void setVent_cierrecajagennro(Integer vent_cierrecajagennro){
		this.vent_cierrecajagennro = vent_cierrecajagennro;
	}
	public Integer getVent_guia(){
		return vent_guia;
	}
	public void setVent_guia(Integer vent_guia){
		this.vent_guia = vent_guia;
	}
	public Double getVent_montoguia(){
		return vent_montoguia;
	}
	public void setVent_montoguia(Double vent_montoguia){
		this.vent_montoguia = vent_montoguia;
	}
	public Integer getVent_mayorista(){
		return vent_mayorista;
	}
	public void setVent_mayorista(Integer vent_mayorista){
		this.vent_mayorista = vent_mayorista;
	}
	public Object getVent_numerofactura(){
		return vent_numerofactura;
	}
	public void setVent_numerofactura(Object vent_numerofactura){
		this.vent_numerofactura = vent_numerofactura;
	}
	public Integer getVent_local(){
		return vent_local;
	}
	public void setVent_local(Integer vent_local){
		this.vent_local = vent_local;
	}
	public Object getVent_numerocontrato(){
		return vent_numerocontrato;
	}
	public void setVent_numerocontrato(Object vent_numerocontrato){
		this.vent_numerocontrato = vent_numerocontrato;
	}
	public Integer getVent_tipofactura(){
		return vent_tipofactura;
	}
	public void setVent_tipofactura(Integer vent_tipofactura){
		this.vent_tipofactura = vent_tipofactura;
	}

}