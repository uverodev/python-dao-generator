package modelo;

public class Timbrado{
	Integer tim_id;
	Object tim_timbrado;
	Object tim_sucursal;
	Integer tim_numero;
	Integer tim_activo;
	Object tim_desde;
	Object tim_hasta;
	Object tim_pc;
	Integer tim_usuario;
	Object tim_sucursalfin;
	Integer tim_numerofin;
	Integer tim_local;
	Object tim_tipo;

	public Timbrado(Integer tim_id, Object tim_timbrado, Object tim_sucursal, Integer tim_numero, Integer tim_activo, Object tim_desde, Object tim_hasta, Object tim_pc, Integer tim_usuario, Object tim_sucursalfin, Integer tim_numerofin, Integer tim_local, Object tim_tipo){
		this.tim_id = tim_id;
		this.tim_timbrado = tim_timbrado;
		this.tim_sucursal = tim_sucursal;
		this.tim_numero = tim_numero;
		this.tim_activo = tim_activo;
		this.tim_desde = tim_desde;
		this.tim_hasta = tim_hasta;
		this.tim_pc = tim_pc;
		this.tim_usuario = tim_usuario;
		this.tim_sucursalfin = tim_sucursalfin;
		this.tim_numerofin = tim_numerofin;
		this.tim_local = tim_local;
		this.tim_tipo = tim_tipo;
	}
	public Timbrado(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Timbrado{"+", tim_id=" + tim_id+", tim_timbrado=" + tim_timbrado+", tim_sucursal=" + tim_sucursal+", tim_numero=" + tim_numero+", tim_activo=" + tim_activo+", tim_desde=" + tim_desde+", tim_hasta=" + tim_hasta+", tim_pc=" + tim_pc+", tim_usuario=" + tim_usuario+", tim_sucursalfin=" + tim_sucursalfin+", tim_numerofin=" + tim_numerofin+", tim_local=" + tim_local+", tim_tipo=" + tim_tipo+"}";

	}
	public Integer getTim_id(){
		return tim_id;
	}
	public void setTim_id(Integer tim_id){
		this.tim_id = tim_id;
	}
	public Object getTim_timbrado(){
		return tim_timbrado;
	}
	public void setTim_timbrado(Object tim_timbrado){
		this.tim_timbrado = tim_timbrado;
	}
	public Object getTim_sucursal(){
		return tim_sucursal;
	}
	public void setTim_sucursal(Object tim_sucursal){
		this.tim_sucursal = tim_sucursal;
	}
	public Integer getTim_numero(){
		return tim_numero;
	}
	public void setTim_numero(Integer tim_numero){
		this.tim_numero = tim_numero;
	}
	public Integer getTim_activo(){
		return tim_activo;
	}
	public void setTim_activo(Integer tim_activo){
		this.tim_activo = tim_activo;
	}
	public Object getTim_desde(){
		return tim_desde;
	}
	public void setTim_desde(Object tim_desde){
		this.tim_desde = tim_desde;
	}
	public Object getTim_hasta(){
		return tim_hasta;
	}
	public void setTim_hasta(Object tim_hasta){
		this.tim_hasta = tim_hasta;
	}
	public Object getTim_pc(){
		return tim_pc;
	}
	public void setTim_pc(Object tim_pc){
		this.tim_pc = tim_pc;
	}
	public Integer getTim_usuario(){
		return tim_usuario;
	}
	public void setTim_usuario(Integer tim_usuario){
		this.tim_usuario = tim_usuario;
	}
	public Object getTim_sucursalfin(){
		return tim_sucursalfin;
	}
	public void setTim_sucursalfin(Object tim_sucursalfin){
		this.tim_sucursalfin = tim_sucursalfin;
	}
	public Integer getTim_numerofin(){
		return tim_numerofin;
	}
	public void setTim_numerofin(Integer tim_numerofin){
		this.tim_numerofin = tim_numerofin;
	}
	public Integer getTim_local(){
		return tim_local;
	}
	public void setTim_local(Integer tim_local){
		this.tim_local = tim_local;
	}
	public Object getTim_tipo(){
		return tim_tipo;
	}
	public void setTim_tipo(Object tim_tipo){
		this.tim_tipo = tim_tipo;
	}

}