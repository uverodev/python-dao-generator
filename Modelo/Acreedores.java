package modelo;

public class Acreedores{
	Integer id;
	String descripcion;
	Double monto;
	String fecha;
	String estado;
	Integer idUsuarios;

	public Acreedores(Integer id, String descripcion, Double monto, String fecha, String estado, Integer idUsuarios){
		this.id = id;
		this.descripcion = descripcion;
		this.monto = monto;
		this.fecha = fecha;
		this.estado = estado;
		this.idUsuarios = idUsuarios;
	}
	public Acreedores(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Acreedores{"+"id=" + id+"descripcion=" + descripcion+"monto=" + monto+"fecha=" + fecha+"estado=" + estado+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public Double getMonto(){
		return monto;
	}
	public void setMonto(Double monto){
		this.monto = monto;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}

}