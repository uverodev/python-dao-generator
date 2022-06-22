package modelo;

public class Creditos_pagos{
	Integer id;
	String fecha;
	Integer idcreditos;
	String pago;
	Integer idUsuarios;

	public Creditos_pagos(Integer id, String fecha, Integer idcreditos, String pago, Integer idUsuarios){
		this.id = id;
		this.fecha = fecha;
		this.idcreditos = idcreditos;
		this.pago = pago;
		this.idUsuarios = idUsuarios;
	}
	public Creditos_pagos(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Creditos_pagos{"+"id=" + id+"fecha=" + fecha+"idcreditos=" + idcreditos+"pago=" + pago+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public Integer getIdcreditos(){
		return idcreditos;
	}
	public void setIdcreditos(Integer idcreditos){
		this.idcreditos = idcreditos;
	}
	public String getPago(){
		return pago;
	}
	public void setPago(String pago){
		this.pago = pago;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}