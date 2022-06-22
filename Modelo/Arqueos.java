package modelo;

public class Arqueos{
	Integer id;
	String fechaapertura;
	Double aperturatotal;
	String horaapertura;
	String fechacierre;
	Double cierretotal;
	String horacierre;
	Double redondeo;
	Integer idUsuarios;

	public Arqueos(Integer id, String fechaapertura, Double aperturatotal, String horaapertura, String fechacierre, Double cierretotal, String horacierre, Double redondeo, Integer idUsuarios){
		this.id = id;
		this.fechaapertura = fechaapertura;
		this.aperturatotal = aperturatotal;
		this.horaapertura = horaapertura;
		this.fechacierre = fechacierre;
		this.cierretotal = cierretotal;
		this.horacierre = horacierre;
		this.redondeo = redondeo;
		this.idUsuarios = idUsuarios;
	}
	public Arqueos(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Arqueos{"+"id=" + id+"fechaapertura=" + fechaapertura+"aperturatotal=" + aperturatotal+"horaapertura=" + horaapertura+"fechacierre=" + fechacierre+"cierretotal=" + cierretotal+"horacierre=" + horacierre+"redondeo=" + redondeo+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getFechaapertura(){
		return fechaapertura;
	}
	public void setFechaapertura(String fechaapertura){
		this.fechaapertura = fechaapertura;
	}
	public Double getAperturatotal(){
		return aperturatotal;
	}
	public void setAperturatotal(Double aperturatotal){
		this.aperturatotal = aperturatotal;
	}
	public String getHoraapertura(){
		return horaapertura;
	}
	public void setHoraapertura(String horaapertura){
		this.horaapertura = horaapertura;
	}
	public String getFechacierre(){
		return fechacierre;
	}
	public void setFechacierre(String fechacierre){
		this.fechacierre = fechacierre;
	}
	public Double getCierretotal(){
		return cierretotal;
	}
	public void setCierretotal(Double cierretotal){
		this.cierretotal = cierretotal;
	}
	public String getHoracierre(){
		return horacierre;
	}
	public void setHoracierre(String horacierre){
		this.horacierre = horacierre;
	}
	public Double getRedondeo(){
		return redondeo;
	}
	public void setRedondeo(Double redondeo){
		this.redondeo = redondeo;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}