package modelo;

public class Creditos_ventas{
	Integer id;
	String fecha;
	Integer idcreditos;
	Integer idventas;
	Integer idUsuarios;

	public Creditos_ventas(Integer id, String fecha, Integer idcreditos, Integer idventas, Integer idUsuarios){
		this.id = id;
		this.fecha = fecha;
		this.idcreditos = idcreditos;
		this.idventas = idventas;
		this.idUsuarios = idUsuarios;
	}
	public Creditos_ventas(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Creditos_ventas{"+"id=" + id+"fecha=" + fecha+"idcreditos=" + idcreditos+"idventas=" + idventas+"idUsuarios=" + idUsuarios+"}";

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
	public Integer getIdventas(){
		return idventas;
	}
	public void setIdventas(Integer idventas){
		this.idventas = idventas;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}