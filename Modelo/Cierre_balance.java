package modelo;

public class Cierre_balance{
	Integer cb_id;
	String cb_fecha;
	String cb_hora;
	String cb_fechasct;
	Integer cb_usuario;
	Integer cb_borrado;
	String cb_maquina;
	String cb_fecha_desde;
	String cb_fecha_hasta;
	String cb_hora_desde;
	String cb_hora_hasta;
	Double cb_caja_inicial;
	Double cb_ventas;
	Double cb_cobranzas;
	Double cb_total_ingresos;
	Double cb_compras;
	Double cb_pagos_a_proveedores;
	Double cb_otros_gastos;
	Double cb_total_egresos;
	Double cb_total_ingresos_menos_total_egresos;
	Double cb_caja;
	Integer cb_sucursal;

	public Cierre_balance(Integer cb_id, String cb_fecha, String cb_hora, String cb_fechasct, Integer cb_usuario, Integer cb_borrado, String cb_maquina, String cb_fecha_desde, String cb_fecha_hasta, String cb_hora_desde, String cb_hora_hasta, Double cb_caja_inicial, Double cb_ventas, Double cb_cobranzas, Double cb_total_ingresos, Double cb_compras, Double cb_pagos_a_proveedores, Double cb_otros_gastos, Double cb_total_egresos, Double cb_total_ingresos_menos_total_egresos, Double cb_caja, Integer cb_sucursal){
		this.cb_id = cb_id;
		this.cb_fecha = cb_fecha;
		this.cb_hora = cb_hora;
		this.cb_fechasct = cb_fechasct;
		this.cb_usuario = cb_usuario;
		this.cb_borrado = cb_borrado;
		this.cb_maquina = cb_maquina;
		this.cb_fecha_desde = cb_fecha_desde;
		this.cb_fecha_hasta = cb_fecha_hasta;
		this.cb_hora_desde = cb_hora_desde;
		this.cb_hora_hasta = cb_hora_hasta;
		this.cb_caja_inicial = cb_caja_inicial;
		this.cb_ventas = cb_ventas;
		this.cb_cobranzas = cb_cobranzas;
		this.cb_total_ingresos = cb_total_ingresos;
		this.cb_compras = cb_compras;
		this.cb_pagos_a_proveedores = cb_pagos_a_proveedores;
		this.cb_otros_gastos = cb_otros_gastos;
		this.cb_total_egresos = cb_total_egresos;
		this.cb_total_ingresos_menos_total_egresos = cb_total_ingresos_menos_total_egresos;
		this.cb_caja = cb_caja;
		this.cb_sucursal = cb_sucursal;
	}
	public Cierre_balance(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cierre_balance{"+", cb_id=" + cb_id+", cb_fecha=" + cb_fecha+", cb_hora=" + cb_hora+", cb_fechasct=" + cb_fechasct+", cb_usuario=" + cb_usuario+", cb_borrado=" + cb_borrado+", cb_maquina=" + cb_maquina+", cb_fecha_desde=" + cb_fecha_desde+", cb_fecha_hasta=" + cb_fecha_hasta+", cb_hora_desde=" + cb_hora_desde+", cb_hora_hasta=" + cb_hora_hasta+", cb_caja_inicial=" + cb_caja_inicial+", cb_ventas=" + cb_ventas+", cb_cobranzas=" + cb_cobranzas+", cb_total_ingresos=" + cb_total_ingresos+", cb_compras=" + cb_compras+", cb_pagos_a_proveedores=" + cb_pagos_a_proveedores+", cb_otros_gastos=" + cb_otros_gastos+", cb_total_egresos=" + cb_total_egresos+", cb_total_ingresos_menos_total_egresos=" + cb_total_ingresos_menos_total_egresos+", cb_caja=" + cb_caja+", cb_sucursal=" + cb_sucursal+"}";

	}
	public Integer getCb_id(){
		return cb_id;
	}
	public void setCb_id(Integer cb_id){
		this.cb_id = cb_id;
	}
	public String getCb_fecha(){
		return cb_fecha;
	}
	public void setCb_fecha(String cb_fecha){
		this.cb_fecha = cb_fecha;
	}
	public String getCb_hora(){
		return cb_hora;
	}
	public void setCb_hora(String cb_hora){
		this.cb_hora = cb_hora;
	}
	public String getCb_fechasct(){
		return cb_fechasct;
	}
	public void setCb_fechasct(String cb_fechasct){
		this.cb_fechasct = cb_fechasct;
	}
	public Integer getCb_usuario(){
		return cb_usuario;
	}
	public void setCb_usuario(Integer cb_usuario){
		this.cb_usuario = cb_usuario;
	}
	public Integer getCb_borrado(){
		return cb_borrado;
	}
	public void setCb_borrado(Integer cb_borrado){
		this.cb_borrado = cb_borrado;
	}
	public String getCb_maquina(){
		return cb_maquina;
	}
	public void setCb_maquina(String cb_maquina){
		this.cb_maquina = cb_maquina;
	}
	public String getCb_fecha_desde(){
		return cb_fecha_desde;
	}
	public void setCb_fecha_desde(String cb_fecha_desde){
		this.cb_fecha_desde = cb_fecha_desde;
	}
	public String getCb_fecha_hasta(){
		return cb_fecha_hasta;
	}
	public void setCb_fecha_hasta(String cb_fecha_hasta){
		this.cb_fecha_hasta = cb_fecha_hasta;
	}
	public String getCb_hora_desde(){
		return cb_hora_desde;
	}
	public void setCb_hora_desde(String cb_hora_desde){
		this.cb_hora_desde = cb_hora_desde;
	}
	public String getCb_hora_hasta(){
		return cb_hora_hasta;
	}
	public void setCb_hora_hasta(String cb_hora_hasta){
		this.cb_hora_hasta = cb_hora_hasta;
	}
	public Double getCb_caja_inicial(){
		return cb_caja_inicial;
	}
	public void setCb_caja_inicial(Double cb_caja_inicial){
		this.cb_caja_inicial = cb_caja_inicial;
	}
	public Double getCb_ventas(){
		return cb_ventas;
	}
	public void setCb_ventas(Double cb_ventas){
		this.cb_ventas = cb_ventas;
	}
	public Double getCb_cobranzas(){
		return cb_cobranzas;
	}
	public void setCb_cobranzas(Double cb_cobranzas){
		this.cb_cobranzas = cb_cobranzas;
	}
	public Double getCb_total_ingresos(){
		return cb_total_ingresos;
	}
	public void setCb_total_ingresos(Double cb_total_ingresos){
		this.cb_total_ingresos = cb_total_ingresos;
	}
	public Double getCb_compras(){
		return cb_compras;
	}
	public void setCb_compras(Double cb_compras){
		this.cb_compras = cb_compras;
	}
	public Double getCb_pagos_a_proveedores(){
		return cb_pagos_a_proveedores;
	}
	public void setCb_pagos_a_proveedores(Double cb_pagos_a_proveedores){
		this.cb_pagos_a_proveedores = cb_pagos_a_proveedores;
	}
	public Double getCb_otros_gastos(){
		return cb_otros_gastos;
	}
	public void setCb_otros_gastos(Double cb_otros_gastos){
		this.cb_otros_gastos = cb_otros_gastos;
	}
	public Double getCb_total_egresos(){
		return cb_total_egresos;
	}
	public void setCb_total_egresos(Double cb_total_egresos){
		this.cb_total_egresos = cb_total_egresos;
	}
	public Double getCb_total_ingresos_menos_total_egresos(){
		return cb_total_ingresos_menos_total_egresos;
	}
	public void setCb_total_ingresos_menos_total_egresos(Double cb_total_ingresos_menos_total_egresos){
		this.cb_total_ingresos_menos_total_egresos = cb_total_ingresos_menos_total_egresos;
	}
	public Double getCb_caja(){
		return cb_caja;
	}
	public void setCb_caja(Double cb_caja){
		this.cb_caja = cb_caja;
	}
	public Integer getCb_sucursal(){
		return cb_sucursal;
	}
	public void setCb_sucursal(Integer cb_sucursal){
		this.cb_sucursal = cb_sucursal;
	}

}