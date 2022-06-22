package modelo;

public class Anulacion{
	Integer an_nro;
	String an_motivo;
	Integer an_operacion;
	Integer an_numoperacio;
	Integer an_usuario;
	String an_fecha;
	String an_hora;
	Integer an_borrado;
	Object an_pc;

	public Anulacion(Integer an_nro, String an_motivo, Integer an_operacion, Integer an_numoperacio, Integer an_usuario, String an_fecha, String an_hora, Integer an_borrado, Object an_pc){
		this.an_nro = an_nro;
		this.an_motivo = an_motivo;
		this.an_operacion = an_operacion;
		this.an_numoperacio = an_numoperacio;
		this.an_usuario = an_usuario;
		this.an_fecha = an_fecha;
		this.an_hora = an_hora;
		this.an_borrado = an_borrado;
		this.an_pc = an_pc;
	}
	public Anulacion(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Anulacion{"+", an_nro=" + an_nro+", an_motivo=" + an_motivo+", an_operacion=" + an_operacion+", an_numoperacio=" + an_numoperacio+", an_usuario=" + an_usuario+", an_fecha=" + an_fecha+", an_hora=" + an_hora+", an_borrado=" + an_borrado+", an_pc=" + an_pc+"}";

	}
	public Integer getAn_nro(){
		return an_nro;
	}
	public void setAn_nro(Integer an_nro){
		this.an_nro = an_nro;
	}
	public String getAn_motivo(){
		return an_motivo;
	}
	public void setAn_motivo(String an_motivo){
		this.an_motivo = an_motivo;
	}
	public Integer getAn_operacion(){
		return an_operacion;
	}
	public void setAn_operacion(Integer an_operacion){
		this.an_operacion = an_operacion;
	}
	public Integer getAn_numoperacio(){
		return an_numoperacio;
	}
	public void setAn_numoperacio(Integer an_numoperacio){
		this.an_numoperacio = an_numoperacio;
	}
	public Integer getAn_usuario(){
		return an_usuario;
	}
	public void setAn_usuario(Integer an_usuario){
		this.an_usuario = an_usuario;
	}
	public String getAn_fecha(){
		return an_fecha;
	}
	public void setAn_fecha(String an_fecha){
		this.an_fecha = an_fecha;
	}
	public String getAn_hora(){
		return an_hora;
	}
	public void setAn_hora(String an_hora){
		this.an_hora = an_hora;
	}
	public Integer getAn_borrado(){
		return an_borrado;
	}
	public void setAn_borrado(Integer an_borrado){
		this.an_borrado = an_borrado;
	}
	public Object getAn_pc(){
		return an_pc;
	}
	public void setAn_pc(Object an_pc){
		this.an_pc = an_pc;
	}

}