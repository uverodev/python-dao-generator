package modelo;

public class Liquidaciones{
	Integer liq_nro;
	String liq_canthora;
	String liq_totextra;
	String liq_totferiado;
	Double iiq_montferiado;
	Double liq_monthextra;
	Double liq_totventas;
	Double liq_totcomision;
	Double liq_sueldo;
	Double liq_descuotcompra;
	Double liq_adelanto;
	Double liq_saldo;
	String liq_fecha;
	String liq_hora;
	Integer liq_empleado;
	Integer liq_usuario;
	Integer liq_borrado;
	Double liq_totdescxatraso;
	Double liq_tototrosdescuentos;
	Double liq_saldocomiuti;
	Double liq_totcomiuti;
	Double liq_totutilidad;
	Double liq_totpcosto;
	Double liq_totpventas;
	String liq_ultliquidacion;
	Integer liq_cantdias;
	String liq_fechahasta;
	String liq_fechadesde;
	Double liq_totcomicobro;
	Double liq_totcomiventa;
	Integer liq_cierrecajagennro;
	Integer liq_pagado;
	Integer liq_usuariopago;
	String liq_fechapago;
	Object liq_pcpago;
	Integer liq_cierrecajanro;
	Double liq_montferiado;
	Double liq_monto_ips;

	public Liquidaciones(Integer liq_nro, String liq_canthora, String liq_totextra, String liq_totferiado, Double iiq_montferiado, Double liq_monthextra, Double liq_totventas, Double liq_totcomision, Double liq_sueldo, Double liq_descuotcompra, Double liq_adelanto, Double liq_saldo, String liq_fecha, String liq_hora, Integer liq_empleado, Integer liq_usuario, Integer liq_borrado, Double liq_totdescxatraso, Double liq_tototrosdescuentos, Double liq_saldocomiuti, Double liq_totcomiuti, Double liq_totutilidad, Double liq_totpcosto, Double liq_totpventas, String liq_ultliquidacion, Integer liq_cantdias, String liq_fechahasta, String liq_fechadesde, Double liq_totcomicobro, Double liq_totcomiventa, Integer liq_cierrecajagennro, Integer liq_pagado, Integer liq_usuariopago, String liq_fechapago, Object liq_pcpago, Integer liq_cierrecajanro, Double liq_montferiado, Double liq_monto_ips){
		this.liq_nro = liq_nro;
		this.liq_canthora = liq_canthora;
		this.liq_totextra = liq_totextra;
		this.liq_totferiado = liq_totferiado;
		this.iiq_montferiado = iiq_montferiado;
		this.liq_monthextra = liq_monthextra;
		this.liq_totventas = liq_totventas;
		this.liq_totcomision = liq_totcomision;
		this.liq_sueldo = liq_sueldo;
		this.liq_descuotcompra = liq_descuotcompra;
		this.liq_adelanto = liq_adelanto;
		this.liq_saldo = liq_saldo;
		this.liq_fecha = liq_fecha;
		this.liq_hora = liq_hora;
		this.liq_empleado = liq_empleado;
		this.liq_usuario = liq_usuario;
		this.liq_borrado = liq_borrado;
		this.liq_totdescxatraso = liq_totdescxatraso;
		this.liq_tototrosdescuentos = liq_tototrosdescuentos;
		this.liq_saldocomiuti = liq_saldocomiuti;
		this.liq_totcomiuti = liq_totcomiuti;
		this.liq_totutilidad = liq_totutilidad;
		this.liq_totpcosto = liq_totpcosto;
		this.liq_totpventas = liq_totpventas;
		this.liq_ultliquidacion = liq_ultliquidacion;
		this.liq_cantdias = liq_cantdias;
		this.liq_fechahasta = liq_fechahasta;
		this.liq_fechadesde = liq_fechadesde;
		this.liq_totcomicobro = liq_totcomicobro;
		this.liq_totcomiventa = liq_totcomiventa;
		this.liq_cierrecajagennro = liq_cierrecajagennro;
		this.liq_pagado = liq_pagado;
		this.liq_usuariopago = liq_usuariopago;
		this.liq_fechapago = liq_fechapago;
		this.liq_pcpago = liq_pcpago;
		this.liq_cierrecajanro = liq_cierrecajanro;
		this.liq_montferiado = liq_montferiado;
		this.liq_monto_ips = liq_monto_ips;
	}
	public Liquidaciones(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Liquidaciones{"+", liq_nro=" + liq_nro+", liq_canthora=" + liq_canthora+", liq_totextra=" + liq_totextra+", liq_totferiado=" + liq_totferiado+", iiq_montferiado=" + iiq_montferiado+", liq_monthextra=" + liq_monthextra+", liq_totventas=" + liq_totventas+", liq_totcomision=" + liq_totcomision+", liq_sueldo=" + liq_sueldo+", liq_descuotcompra=" + liq_descuotcompra+", liq_adelanto=" + liq_adelanto+", liq_saldo=" + liq_saldo+", liq_fecha=" + liq_fecha+", liq_hora=" + liq_hora+", liq_empleado=" + liq_empleado+", liq_usuario=" + liq_usuario+", liq_borrado=" + liq_borrado+", liq_totdescxatraso=" + liq_totdescxatraso+", liq_tototrosdescuentos=" + liq_tototrosdescuentos+", liq_saldocomiuti=" + liq_saldocomiuti+", liq_totcomiuti=" + liq_totcomiuti+", liq_totutilidad=" + liq_totutilidad+", liq_totpcosto=" + liq_totpcosto+", liq_totpventas=" + liq_totpventas+", liq_ultliquidacion=" + liq_ultliquidacion+", liq_cantdias=" + liq_cantdias+", liq_fechahasta=" + liq_fechahasta+", liq_fechadesde=" + liq_fechadesde+", liq_totcomicobro=" + liq_totcomicobro+", liq_totcomiventa=" + liq_totcomiventa+", liq_cierrecajagennro=" + liq_cierrecajagennro+", liq_pagado=" + liq_pagado+", liq_usuariopago=" + liq_usuariopago+", liq_fechapago=" + liq_fechapago+", liq_pcpago=" + liq_pcpago+", liq_cierrecajanro=" + liq_cierrecajanro+", liq_montferiado=" + liq_montferiado+", liq_monto_ips=" + liq_monto_ips+"}";

	}
	public Integer getLiq_nro(){
		return liq_nro;
	}
	public void setLiq_nro(Integer liq_nro){
		this.liq_nro = liq_nro;
	}
	public String getLiq_canthora(){
		return liq_canthora;
	}
	public void setLiq_canthora(String liq_canthora){
		this.liq_canthora = liq_canthora;
	}
	public String getLiq_totextra(){
		return liq_totextra;
	}
	public void setLiq_totextra(String liq_totextra){
		this.liq_totextra = liq_totextra;
	}
	public String getLiq_totferiado(){
		return liq_totferiado;
	}
	public void setLiq_totferiado(String liq_totferiado){
		this.liq_totferiado = liq_totferiado;
	}
	public Double getIiq_montferiado(){
		return iiq_montferiado;
	}
	public void setIiq_montferiado(Double iiq_montferiado){
		this.iiq_montferiado = iiq_montferiado;
	}
	public Double getLiq_monthextra(){
		return liq_monthextra;
	}
	public void setLiq_monthextra(Double liq_monthextra){
		this.liq_monthextra = liq_monthextra;
	}
	public Double getLiq_totventas(){
		return liq_totventas;
	}
	public void setLiq_totventas(Double liq_totventas){
		this.liq_totventas = liq_totventas;
	}
	public Double getLiq_totcomision(){
		return liq_totcomision;
	}
	public void setLiq_totcomision(Double liq_totcomision){
		this.liq_totcomision = liq_totcomision;
	}
	public Double getLiq_sueldo(){
		return liq_sueldo;
	}
	public void setLiq_sueldo(Double liq_sueldo){
		this.liq_sueldo = liq_sueldo;
	}
	public Double getLiq_descuotcompra(){
		return liq_descuotcompra;
	}
	public void setLiq_descuotcompra(Double liq_descuotcompra){
		this.liq_descuotcompra = liq_descuotcompra;
	}
	public Double getLiq_adelanto(){
		return liq_adelanto;
	}
	public void setLiq_adelanto(Double liq_adelanto){
		this.liq_adelanto = liq_adelanto;
	}
	public Double getLiq_saldo(){
		return liq_saldo;
	}
	public void setLiq_saldo(Double liq_saldo){
		this.liq_saldo = liq_saldo;
	}
	public String getLiq_fecha(){
		return liq_fecha;
	}
	public void setLiq_fecha(String liq_fecha){
		this.liq_fecha = liq_fecha;
	}
	public String getLiq_hora(){
		return liq_hora;
	}
	public void setLiq_hora(String liq_hora){
		this.liq_hora = liq_hora;
	}
	public Integer getLiq_empleado(){
		return liq_empleado;
	}
	public void setLiq_empleado(Integer liq_empleado){
		this.liq_empleado = liq_empleado;
	}
	public Integer getLiq_usuario(){
		return liq_usuario;
	}
	public void setLiq_usuario(Integer liq_usuario){
		this.liq_usuario = liq_usuario;
	}
	public Integer getLiq_borrado(){
		return liq_borrado;
	}
	public void setLiq_borrado(Integer liq_borrado){
		this.liq_borrado = liq_borrado;
	}
	public Double getLiq_totdescxatraso(){
		return liq_totdescxatraso;
	}
	public void setLiq_totdescxatraso(Double liq_totdescxatraso){
		this.liq_totdescxatraso = liq_totdescxatraso;
	}
	public Double getLiq_tototrosdescuentos(){
		return liq_tototrosdescuentos;
	}
	public void setLiq_tototrosdescuentos(Double liq_tototrosdescuentos){
		this.liq_tototrosdescuentos = liq_tototrosdescuentos;
	}
	public Double getLiq_saldocomiuti(){
		return liq_saldocomiuti;
	}
	public void setLiq_saldocomiuti(Double liq_saldocomiuti){
		this.liq_saldocomiuti = liq_saldocomiuti;
	}
	public Double getLiq_totcomiuti(){
		return liq_totcomiuti;
	}
	public void setLiq_totcomiuti(Double liq_totcomiuti){
		this.liq_totcomiuti = liq_totcomiuti;
	}
	public Double getLiq_totutilidad(){
		return liq_totutilidad;
	}
	public void setLiq_totutilidad(Double liq_totutilidad){
		this.liq_totutilidad = liq_totutilidad;
	}
	public Double getLiq_totpcosto(){
		return liq_totpcosto;
	}
	public void setLiq_totpcosto(Double liq_totpcosto){
		this.liq_totpcosto = liq_totpcosto;
	}
	public Double getLiq_totpventas(){
		return liq_totpventas;
	}
	public void setLiq_totpventas(Double liq_totpventas){
		this.liq_totpventas = liq_totpventas;
	}
	public String getLiq_ultliquidacion(){
		return liq_ultliquidacion;
	}
	public void setLiq_ultliquidacion(String liq_ultliquidacion){
		this.liq_ultliquidacion = liq_ultliquidacion;
	}
	public Integer getLiq_cantdias(){
		return liq_cantdias;
	}
	public void setLiq_cantdias(Integer liq_cantdias){
		this.liq_cantdias = liq_cantdias;
	}
	public String getLiq_fechahasta(){
		return liq_fechahasta;
	}
	public void setLiq_fechahasta(String liq_fechahasta){
		this.liq_fechahasta = liq_fechahasta;
	}
	public String getLiq_fechadesde(){
		return liq_fechadesde;
	}
	public void setLiq_fechadesde(String liq_fechadesde){
		this.liq_fechadesde = liq_fechadesde;
	}
	public Double getLiq_totcomicobro(){
		return liq_totcomicobro;
	}
	public void setLiq_totcomicobro(Double liq_totcomicobro){
		this.liq_totcomicobro = liq_totcomicobro;
	}
	public Double getLiq_totcomiventa(){
		return liq_totcomiventa;
	}
	public void setLiq_totcomiventa(Double liq_totcomiventa){
		this.liq_totcomiventa = liq_totcomiventa;
	}
	public Integer getLiq_cierrecajagennro(){
		return liq_cierrecajagennro;
	}
	public void setLiq_cierrecajagennro(Integer liq_cierrecajagennro){
		this.liq_cierrecajagennro = liq_cierrecajagennro;
	}
	public Integer getLiq_pagado(){
		return liq_pagado;
	}
	public void setLiq_pagado(Integer liq_pagado){
		this.liq_pagado = liq_pagado;
	}
	public Integer getLiq_usuariopago(){
		return liq_usuariopago;
	}
	public void setLiq_usuariopago(Integer liq_usuariopago){
		this.liq_usuariopago = liq_usuariopago;
	}
	public String getLiq_fechapago(){
		return liq_fechapago;
	}
	public void setLiq_fechapago(String liq_fechapago){
		this.liq_fechapago = liq_fechapago;
	}
	public Object getLiq_pcpago(){
		return liq_pcpago;
	}
	public void setLiq_pcpago(Object liq_pcpago){
		this.liq_pcpago = liq_pcpago;
	}
	public Integer getLiq_cierrecajanro(){
		return liq_cierrecajanro;
	}
	public void setLiq_cierrecajanro(Integer liq_cierrecajanro){
		this.liq_cierrecajanro = liq_cierrecajanro;
	}
	public Double getLiq_montferiado(){
		return liq_montferiado;
	}
	public void setLiq_montferiado(Double liq_montferiado){
		this.liq_montferiado = liq_montferiado;
	}
	public Double getLiq_monto_ips(){
		return liq_monto_ips;
	}
	public void setLiq_monto_ips(Double liq_monto_ips){
		this.liq_monto_ips = liq_monto_ips;
	}

}