package modelo;

public class Usuarios{
	Integer id;
	String usuario;
	String pass;
	String rango;
	String cinruc;
	String nombres;
	String apellidos;
	String direccion;
	String fecha;
	String celtel;
	String correo;
	String ciudad;
	String ultimoinicio;
	String ultimoip;
	String ultimopc;
	Boolean activo;

	public Usuarios(Integer id, String usuario, String pass, String rango, String cinruc, String nombres, String apellidos, String direccion, String fecha, String celtel, String correo, String ciudad, String ultimoinicio, String ultimoip, String ultimopc, Boolean activo){
		this.id = id;
		this.usuario = usuario;
		this.pass = pass;
		this.rango = rango;
		this.cinruc = cinruc;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.fecha = fecha;
		this.celtel = celtel;
		this.correo = correo;
		this.ciudad = ciudad;
		this.ultimoinicio = ultimoinicio;
		this.ultimoip = ultimoip;
		this.ultimopc = ultimopc;
		this.activo = activo;
	}
	public Usuarios(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Usuarios{"+"id=" + id+"usuario=" + usuario+"pass=" + pass+"rango=" + rango+"cinruc=" + cinruc+"nombres=" + nombres+"apellidos=" + apellidos+"direccion=" + direccion+"fecha=" + fecha+"celtel=" + celtel+"correo=" + correo+"ciudad=" + ciudad+"ultimoinicio=" + ultimoinicio+"ultimoip=" + ultimoip+"ultimopc=" + ultimopc+"activo=" + activo+"}";

	}
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public String getRango(){
		return rango;
	}
	public void setRango(String rango){
		this.rango = rango;
	}
	public String getCinruc(){
		return cinruc;
	}
	public void setCinruc(String cinruc){
		this.cinruc = cinruc;
	}
	public String getNombres(){
		return nombres;
	}
	public void setNombres(String nombres){
		this.nombres = nombres;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public String getCeltel(){
		return celtel;
	}
	public void setCeltel(String celtel){
		this.celtel = celtel;
	}
	public String getCorreo(){
		return correo;
	}
	public void setCorreo(String correo){
		this.correo = correo;
	}
	public String getCiudad(){
		return ciudad;
	}
	public void setCiudad(String ciudad){
		this.ciudad = ciudad;
	}
	public String getUltimoinicio(){
		return ultimoinicio;
	}
	public void setUltimoinicio(String ultimoinicio){
		this.ultimoinicio = ultimoinicio;
	}
	public String getUltimoip(){
		return ultimoip;
	}
	public void setUltimoip(String ultimoip){
		this.ultimoip = ultimoip;
	}
	public String getUltimopc(){
		return ultimopc;
	}
	public void setUltimopc(String ultimopc){
		this.ultimopc = ultimopc;
	}
	public Boolean getActivo(){
		return activo;
	}
	public void setActivo(Boolean activo){
		this.activo = activo;
	}

}