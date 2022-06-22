package modelo;

public class Judiciales{
	Integer ju_nro;
	String ju_fecha;
	String ju_hora;
	Double ju_monto;
	Integer ju_tipoperacion;
	Integer ju_usuario;
	Integer ju_cuota;
	Integer ju_borrado;
	String ju_cliente;
	String ju_observacion;
	Double ju_entrega;
	Integer ju_pagado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;

	public Judiciales(Integer ju_nro, String ju_fecha, String ju_hora, Double ju_monto, Integer ju_tipoperacion, Integer ju_usuario, Integer ju_cuota, Integer ju_borrado, String ju_cliente, String ju_observacion, Double ju_entrega, Integer ju_pagado, String fechasct, Integer usuariosct, String maquinasct){
		this.ju_nro = ju_nro;
		this.ju_fecha = ju_fecha;
		this.ju_hora = ju_hora;
		this.ju_monto = ju_monto;
		this.ju_tipoperacion = ju_tipoperacion;
		this.ju_usuario = ju_usuario;
		this.ju_cuota = ju_cuota;
		this.ju_borrado = ju_borrado;
		this.ju_cliente = ju_cliente;
		this.ju_observacion = ju_observacion;
		this.ju_entrega = ju_entrega;
		this.ju_pagado = ju_pagado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
	}
	public Judiciales(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Judiciales{"+", ju_nro=" + ju_nro+", ju_fecha=" + ju_fecha+", ju_hora=" + ju_hora+", ju_monto=" + ju_monto+", ju_tipoperacion=" + ju_tipoperacion+", ju_usuario=" + ju_usuario+", ju_cuota=" + ju_cuota+", ju_borrado=" + ju_borrado+", ju_cliente=" + ju_cliente+", ju_observacion=" + ju_observacion+", ju_entrega=" + ju_entrega+", ju_pagado=" + ju_pagado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+"}";

	}
	public Integer getJu_nro(){
		return ju_nro;
	}
	public void setJu_nro(Integer ju_nro){
		this.ju_nro = ju_nro;
	}
	public String getJu_fecha(){
		return ju_fecha;
	}
	public void setJu_fecha(String ju_fecha){
		this.ju_fecha = ju_fecha;
	}
	public String getJu_hora(){
		return ju_hora;
	}
	public void setJu_hora(String ju_hora){
		this.ju_hora = ju_hora;
	}
	public Double getJu_monto(){
		return ju_monto;
	}
	public void setJu_monto(Double ju_monto){
		this.ju_monto = ju_monto;
	}
	public Integer getJu_tipoperacion(){
		return ju_tipoperacion;
	}
	public void setJu_tipoperacion(Integer ju_tipoperacion){
		this.ju_tipoperacion = ju_tipoperacion;
	}
	public Integer getJu_usuario(){
		return ju_usuario;
	}
	public void setJu_usuario(Integer ju_usuario){
		this.ju_usuario = ju_usuario;
	}
	public Integer getJu_cuota(){
		return ju_cuota;
	}
	public void setJu_cuota(Integer ju_cuota){
		this.ju_cuota = ju_cuota;
	}
	public Integer getJu_borrado(){
		return ju_borrado;
	}
	public void setJu_borrado(Integer ju_borrado){
		this.ju_borrado = ju_borrado;
	}
	public String getJu_cliente(){
		return ju_cliente;
	}
	public void setJu_cliente(String ju_cliente){
		this.ju_cliente = ju_cliente;
	}
	public String getJu_observacion(){
		return ju_observacion;
	}
	public void setJu_observacion(String ju_observacion){
		this.ju_observacion = ju_observacion;
	}
	public Double getJu_entrega(){
		return ju_entrega;
	}
	public void setJu_entrega(Double ju_entrega){
		this.ju_entrega = ju_entrega;
	}
	public Integer getJu_pagado(){
		return ju_pagado;
	}
	public void setJu_pagado(Integer ju_pagado){
		this.ju_pagado = ju_pagado;
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