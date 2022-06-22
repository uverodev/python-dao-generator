package modelo;

public class Creditos{
	Integer id;
	Integer idClientes;
	String estado;
	Integer idUsuarios;

	public Creditos(Integer id, Integer idClientes, String estado, Integer idUsuarios){
		this.id = id;
		this.idClientes = idClientes;
		this.estado = estado;
		this.idUsuarios = idUsuarios;
	}
	public Creditos(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Creditos{"+"id=" + id+"idClientes=" + idClientes+"estado=" + estado+"idUsuarios=" + idUsuarios+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getIdclientes(){
		return idClientes;
	}
	public void setIdclientes(Integer idClientes){
		this.idClientes = idClientes;
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