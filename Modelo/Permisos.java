package modelo;

public class Permisos{
	Integer id;
	Integer idUsuarios;
	String permisos_json;

	public Permisos(Integer id, Integer idUsuarios, String permisos_json){
		this.id = id;
		this.idUsuarios = idUsuarios;
		this.permisos_json = permisos_json;
	}
	public Permisos(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Permisos{"+"id=" + id+"idUsuarios=" + idUsuarios+"permisos_json=" + permisos_json+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getIdusuarios(){
		return idUsuarios;
	}
	public void setIdusuarios(Integer idUsuarios){
		this.idUsuarios = idUsuarios;
	}
	public String getPermisos_json(){
		return permisos_json;
	}
	public void setPermisos_json(String permisos_json){
		this.permisos_json = permisos_json;
	}

}