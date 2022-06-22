package modelo;

public class Nota_cab{
	Integer n_nro;
	String n_fecha;
	String n_hora;
	Double n_montodnota;
	Double n_montototalventa;
	Double n_montoventarestante;
	Integer n_numventa;
	Integer n_usuario;
	Integer n_borrado;
	Integer n_cierre;
	Integer n_nrocierre;
	Integer n_cierrecajagennro;

	public Nota_cab(Integer n_nro, String n_fecha, String n_hora, Double n_montodnota, Double n_montototalventa, Double n_montoventarestante, Integer n_numventa, Integer n_usuario, Integer n_borrado, Integer n_cierre, Integer n_nrocierre, Integer n_cierrecajagennro){
		this.n_nro = n_nro;
		this.n_fecha = n_fecha;
		this.n_hora = n_hora;
		this.n_montodnota = n_montodnota;
		this.n_montototalventa = n_montototalventa;
		this.n_montoventarestante = n_montoventarestante;
		this.n_numventa = n_numventa;
		this.n_usuario = n_usuario;
		this.n_borrado = n_borrado;
		this.n_cierre = n_cierre;
		this.n_nrocierre = n_nrocierre;
		this.n_cierrecajagennro = n_cierrecajagennro;
	}
	public Nota_cab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nota_cab{"+", n_nro=" + n_nro+", n_fecha=" + n_fecha+", n_hora=" + n_hora+", n_montodnota=" + n_montodnota+", n_montototalventa=" + n_montototalventa+", n_montoventarestante=" + n_montoventarestante+", n_numventa=" + n_numventa+", n_usuario=" + n_usuario+", n_borrado=" + n_borrado+", n_cierre=" + n_cierre+", n_nrocierre=" + n_nrocierre+", n_cierrecajagennro=" + n_cierrecajagennro+"}";

	}
	public Integer getN_nro(){
		return n_nro;
	}
	public void setN_nro(Integer n_nro){
		this.n_nro = n_nro;
	}
	public String getN_fecha(){
		return n_fecha;
	}
	public void setN_fecha(String n_fecha){
		this.n_fecha = n_fecha;
	}
	public String getN_hora(){
		return n_hora;
	}
	public void setN_hora(String n_hora){
		this.n_hora = n_hora;
	}
	public Double getN_montodnota(){
		return n_montodnota;
	}
	public void setN_montodnota(Double n_montodnota){
		this.n_montodnota = n_montodnota;
	}
	public Double getN_montototalventa(){
		return n_montototalventa;
	}
	public void setN_montototalventa(Double n_montototalventa){
		this.n_montototalventa = n_montototalventa;
	}
	public Double getN_montoventarestante(){
		return n_montoventarestante;
	}
	public void setN_montoventarestante(Double n_montoventarestante){
		this.n_montoventarestante = n_montoventarestante;
	}
	public Integer getN_numventa(){
		return n_numventa;
	}
	public void setN_numventa(Integer n_numventa){
		this.n_numventa = n_numventa;
	}
	public Integer getN_usuario(){
		return n_usuario;
	}
	public void setN_usuario(Integer n_usuario){
		this.n_usuario = n_usuario;
	}
	public Integer getN_borrado(){
		return n_borrado;
	}
	public void setN_borrado(Integer n_borrado){
		this.n_borrado = n_borrado;
	}
	public Integer getN_cierre(){
		return n_cierre;
	}
	public void setN_cierre(Integer n_cierre){
		this.n_cierre = n_cierre;
	}
	public Integer getN_nrocierre(){
		return n_nrocierre;
	}
	public void setN_nrocierre(Integer n_nrocierre){
		this.n_nrocierre = n_nrocierre;
	}
	public Integer getN_cierrecajagennro(){
		return n_cierrecajagennro;
	}
	public void setN_cierrecajagennro(Integer n_cierrecajagennro){
		this.n_cierrecajagennro = n_cierrecajagennro;
	}

}