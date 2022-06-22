package modelo;

public class Ventacab{
	Integer ven_nro;
	String ven_fecha;
	String ven_fechacarga;
	Integer ven_usuario;
	String ven_hora;
	String ven_cliente;
	Integer ven_tipo;
	Double ven_total;
	Double ven_cdolar;
	Double ven_creal;
	Double ven_cpeso;
	Double ven_ceuro;
	Double ven_vendedor;
	Double ven_moneda;
	Double ven_descuento;
	Double ven_totalexe;
	Double ven_totaliva5;
	Double ven_totaliva10;
	Double ven_totalitem;
	Double ven_totaliva;
	Integer ven_cierre;
	Integer ven_regturista;
	Integer ven_borrado;
	Integer ven_confirmado;
	Integer ven_nrocierre;
	Integer ven_factura;
	Double ven_saldoanterior;
	Integer ven_transentregado;
	Integer ven_transporte;
	Integer ven_implegal;
	Integer ven_deposito;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Double ven_totanterior;
	Integer ven_liquidacion;
	Integer ven_nroliquidacion;
	Integer ven_cierrecajagennro;
	Integer ven_guia;
	Double ven_montoguia;
	Integer ven_mayorista;
	Object ven_numerofactura;
	Integer ven_local;
	Double ven_redondeo;
	Integer ven_nro_pedido;
	Integer ven_cierre_accionista;

	public Ventacab(Integer ven_nro, String ven_fecha, String ven_fechacarga, Integer ven_usuario, String ven_hora, String ven_cliente, Integer ven_tipo, Double ven_total, Double ven_cdolar, Double ven_creal, Double ven_cpeso, Double ven_ceuro, Double ven_vendedor, Double ven_moneda, Double ven_descuento, Double ven_totalexe, Double ven_totaliva5, Double ven_totaliva10, Double ven_totalitem, Double ven_totaliva, Integer ven_cierre, Integer ven_regturista, Integer ven_borrado, Integer ven_confirmado, Integer ven_nrocierre, Integer ven_factura, Double ven_saldoanterior, Integer ven_transentregado, Integer ven_transporte, Integer ven_implegal, Integer ven_deposito, String fechasct, Integer usuariosct, String maquinasct, Double ven_totanterior, Integer ven_liquidacion, Integer ven_nroliquidacion, Integer ven_cierrecajagennro, Integer ven_guia, Double ven_montoguia, Integer ven_mayorista, Object ven_numerofactura, Integer ven_local, Double ven_redondeo, Integer ven_nro_pedido, Integer ven_cierre_accionista){
		this.ven_nro = ven_nro;
		this.ven_fecha = ven_fecha;
		this.ven_fechacarga = ven_fechacarga;
		this.ven_usuario = ven_usuario;
		this.ven_hora = ven_hora;
		this.ven_cliente = ven_cliente;
		this.ven_tipo = ven_tipo;
		this.ven_total = ven_total;
		this.ven_cdolar = ven_cdolar;
		this.ven_creal = ven_creal;
		this.ven_cpeso = ven_cpeso;
		this.ven_ceuro = ven_ceuro;
		this.ven_vendedor = ven_vendedor;
		this.ven_moneda = ven_moneda;
		this.ven_descuento = ven_descuento;
		this.ven_totalexe = ven_totalexe;
		this.ven_totaliva5 = ven_totaliva5;
		this.ven_totaliva10 = ven_totaliva10;
		this.ven_totalitem = ven_totalitem;
		this.ven_totaliva = ven_totaliva;
		this.ven_cierre = ven_cierre;
		this.ven_regturista = ven_regturista;
		this.ven_borrado = ven_borrado;
		this.ven_confirmado = ven_confirmado;
		this.ven_nrocierre = ven_nrocierre;
		this.ven_factura = ven_factura;
		this.ven_saldoanterior = ven_saldoanterior;
		this.ven_transentregado = ven_transentregado;
		this.ven_transporte = ven_transporte;
		this.ven_implegal = ven_implegal;
		this.ven_deposito = ven_deposito;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.ven_totanterior = ven_totanterior;
		this.ven_liquidacion = ven_liquidacion;
		this.ven_nroliquidacion = ven_nroliquidacion;
		this.ven_cierrecajagennro = ven_cierrecajagennro;
		this.ven_guia = ven_guia;
		this.ven_montoguia = ven_montoguia;
		this.ven_mayorista = ven_mayorista;
		this.ven_numerofactura = ven_numerofactura;
		this.ven_local = ven_local;
		this.ven_redondeo = ven_redondeo;
		this.ven_nro_pedido = ven_nro_pedido;
		this.ven_cierre_accionista = ven_cierre_accionista;
	}
	public Ventacab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ventacab{"+", ven_nro=" + ven_nro+", ven_fecha=" + ven_fecha+", ven_fechacarga=" + ven_fechacarga+", ven_usuario=" + ven_usuario+", ven_hora=" + ven_hora+", ven_cliente=" + ven_cliente+", ven_tipo=" + ven_tipo+", ven_total=" + ven_total+", ven_cdolar=" + ven_cdolar+", ven_creal=" + ven_creal+", ven_cpeso=" + ven_cpeso+", ven_ceuro=" + ven_ceuro+", ven_vendedor=" + ven_vendedor+", ven_moneda=" + ven_moneda+", ven_descuento=" + ven_descuento+", ven_totalexe=" + ven_totalexe+", ven_totaliva5=" + ven_totaliva5+", ven_totaliva10=" + ven_totaliva10+", ven_totalitem=" + ven_totalitem+", ven_totaliva=" + ven_totaliva+", ven_cierre=" + ven_cierre+", ven_regturista=" + ven_regturista+", ven_borrado=" + ven_borrado+", ven_confirmado=" + ven_confirmado+", ven_nrocierre=" + ven_nrocierre+", ven_factura=" + ven_factura+", ven_saldoanterior=" + ven_saldoanterior+", ven_transentregado=" + ven_transentregado+", ven_transporte=" + ven_transporte+", ven_implegal=" + ven_implegal+", ven_deposito=" + ven_deposito+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", ven_totanterior=" + ven_totanterior+", ven_liquidacion=" + ven_liquidacion+", ven_nroliquidacion=" + ven_nroliquidacion+", ven_cierrecajagennro=" + ven_cierrecajagennro+", ven_guia=" + ven_guia+", ven_montoguia=" + ven_montoguia+", ven_mayorista=" + ven_mayorista+", ven_numerofactura=" + ven_numerofactura+", ven_local=" + ven_local+", ven_redondeo=" + ven_redondeo+", ven_nro_pedido=" + ven_nro_pedido+", ven_cierre_accionista=" + ven_cierre_accionista+"}";

	}
	public Integer getVen_nro(){
		return ven_nro;
	}
	public void setVen_nro(Integer ven_nro){
		this.ven_nro = ven_nro;
	}
	public String getVen_fecha(){
		return ven_fecha;
	}
	public void setVen_fecha(String ven_fecha){
		this.ven_fecha = ven_fecha;
	}
	public String getVen_fechacarga(){
		return ven_fechacarga;
	}
	public void setVen_fechacarga(String ven_fechacarga){
		this.ven_fechacarga = ven_fechacarga;
	}
	public Integer getVen_usuario(){
		return ven_usuario;
	}
	public void setVen_usuario(Integer ven_usuario){
		this.ven_usuario = ven_usuario;
	}
	public String getVen_hora(){
		return ven_hora;
	}
	public void setVen_hora(String ven_hora){
		this.ven_hora = ven_hora;
	}
	public String getVen_cliente(){
		return ven_cliente;
	}
	public void setVen_cliente(String ven_cliente){
		this.ven_cliente = ven_cliente;
	}
	public Integer getVen_tipo(){
		return ven_tipo;
	}
	public void setVen_tipo(Integer ven_tipo){
		this.ven_tipo = ven_tipo;
	}
	public Double getVen_total(){
		return ven_total;
	}
	public void setVen_total(Double ven_total){
		this.ven_total = ven_total;
	}
	public Double getVen_cdolar(){
		return ven_cdolar;
	}
	public void setVen_cdolar(Double ven_cdolar){
		this.ven_cdolar = ven_cdolar;
	}
	public Double getVen_creal(){
		return ven_creal;
	}
	public void setVen_creal(Double ven_creal){
		this.ven_creal = ven_creal;
	}
	public Double getVen_cpeso(){
		return ven_cpeso;
	}
	public void setVen_cpeso(Double ven_cpeso){
		this.ven_cpeso = ven_cpeso;
	}
	public Double getVen_ceuro(){
		return ven_ceuro;
	}
	public void setVen_ceuro(Double ven_ceuro){
		this.ven_ceuro = ven_ceuro;
	}
	public Double getVen_vendedor(){
		return ven_vendedor;
	}
	public void setVen_vendedor(Double ven_vendedor){
		this.ven_vendedor = ven_vendedor;
	}
	public Double getVen_moneda(){
		return ven_moneda;
	}
	public void setVen_moneda(Double ven_moneda){
		this.ven_moneda = ven_moneda;
	}
	public Double getVen_descuento(){
		return ven_descuento;
	}
	public void setVen_descuento(Double ven_descuento){
		this.ven_descuento = ven_descuento;
	}
	public Double getVen_totalexe(){
		return ven_totalexe;
	}
	public void setVen_totalexe(Double ven_totalexe){
		this.ven_totalexe = ven_totalexe;
	}
	public Double getVen_totaliva5(){
		return ven_totaliva5;
	}
	public void setVen_totaliva5(Double ven_totaliva5){
		this.ven_totaliva5 = ven_totaliva5;
	}
	public Double getVen_totaliva10(){
		return ven_totaliva10;
	}
	public void setVen_totaliva10(Double ven_totaliva10){
		this.ven_totaliva10 = ven_totaliva10;
	}
	public Double getVen_totalitem(){
		return ven_totalitem;
	}
	public void setVen_totalitem(Double ven_totalitem){
		this.ven_totalitem = ven_totalitem;
	}
	public Double getVen_totaliva(){
		return ven_totaliva;
	}
	public void setVen_totaliva(Double ven_totaliva){
		this.ven_totaliva = ven_totaliva;
	}
	public Integer getVen_cierre(){
		return ven_cierre;
	}
	public void setVen_cierre(Integer ven_cierre){
		this.ven_cierre = ven_cierre;
	}
	public Integer getVen_regturista(){
		return ven_regturista;
	}
	public void setVen_regturista(Integer ven_regturista){
		this.ven_regturista = ven_regturista;
	}
	public Integer getVen_borrado(){
		return ven_borrado;
	}
	public void setVen_borrado(Integer ven_borrado){
		this.ven_borrado = ven_borrado;
	}
	public Integer getVen_confirmado(){
		return ven_confirmado;
	}
	public void setVen_confirmado(Integer ven_confirmado){
		this.ven_confirmado = ven_confirmado;
	}
	public Integer getVen_nrocierre(){
		return ven_nrocierre;
	}
	public void setVen_nrocierre(Integer ven_nrocierre){
		this.ven_nrocierre = ven_nrocierre;
	}
	public Integer getVen_factura(){
		return ven_factura;
	}
	public void setVen_factura(Integer ven_factura){
		this.ven_factura = ven_factura;
	}
	public Double getVen_saldoanterior(){
		return ven_saldoanterior;
	}
	public void setVen_saldoanterior(Double ven_saldoanterior){
		this.ven_saldoanterior = ven_saldoanterior;
	}
	public Integer getVen_transentregado(){
		return ven_transentregado;
	}
	public void setVen_transentregado(Integer ven_transentregado){
		this.ven_transentregado = ven_transentregado;
	}
	public Integer getVen_transporte(){
		return ven_transporte;
	}
	public void setVen_transporte(Integer ven_transporte){
		this.ven_transporte = ven_transporte;
	}
	public Integer getVen_implegal(){
		return ven_implegal;
	}
	public void setVen_implegal(Integer ven_implegal){
		this.ven_implegal = ven_implegal;
	}
	public Integer getVen_deposito(){
		return ven_deposito;
	}
	public void setVen_deposito(Integer ven_deposito){
		this.ven_deposito = ven_deposito;
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
	public Double getVen_totanterior(){
		return ven_totanterior;
	}
	public void setVen_totanterior(Double ven_totanterior){
		this.ven_totanterior = ven_totanterior;
	}
	public Integer getVen_liquidacion(){
		return ven_liquidacion;
	}
	public void setVen_liquidacion(Integer ven_liquidacion){
		this.ven_liquidacion = ven_liquidacion;
	}
	public Integer getVen_nroliquidacion(){
		return ven_nroliquidacion;
	}
	public void setVen_nroliquidacion(Integer ven_nroliquidacion){
		this.ven_nroliquidacion = ven_nroliquidacion;
	}
	public Integer getVen_cierrecajagennro(){
		return ven_cierrecajagennro;
	}
	public void setVen_cierrecajagennro(Integer ven_cierrecajagennro){
		this.ven_cierrecajagennro = ven_cierrecajagennro;
	}
	public Integer getVen_guia(){
		return ven_guia;
	}
	public void setVen_guia(Integer ven_guia){
		this.ven_guia = ven_guia;
	}
	public Double getVen_montoguia(){
		return ven_montoguia;
	}
	public void setVen_montoguia(Double ven_montoguia){
		this.ven_montoguia = ven_montoguia;
	}
	public Integer getVen_mayorista(){
		return ven_mayorista;
	}
	public void setVen_mayorista(Integer ven_mayorista){
		this.ven_mayorista = ven_mayorista;
	}
	public Object getVen_numerofactura(){
		return ven_numerofactura;
	}
	public void setVen_numerofactura(Object ven_numerofactura){
		this.ven_numerofactura = ven_numerofactura;
	}
	public Integer getVen_local(){
		return ven_local;
	}
	public void setVen_local(Integer ven_local){
		this.ven_local = ven_local;
	}
	public Double getVen_redondeo(){
		return ven_redondeo;
	}
	public void setVen_redondeo(Double ven_redondeo){
		this.ven_redondeo = ven_redondeo;
	}
	public Integer getVen_nro_pedido(){
		return ven_nro_pedido;
	}
	public void setVen_nro_pedido(Integer ven_nro_pedido){
		this.ven_nro_pedido = ven_nro_pedido;
	}
	public Integer getVen_cierre_accionista(){
		return ven_cierre_accionista;
	}
	public void setVen_cierre_accionista(Integer ven_cierre_accionista){
		this.ven_cierre_accionista = ven_cierre_accionista;
	}

}