package modelo;

public class Marcaciones{
	Integer mc_nro;
	Integer mc_empleado;
	String mc_inghora1;
	String mc_salhora1;
	Integer mc_turfinalizado;
	String mc_fecha;
	Object mc_entfoto1;
	Object mc_salfoto1;
	Integer mc_borrado;
	Integer mc_nroliquidacion;
	Integer mc_liquidado;
	Integer mc_feriado;
	String mc_horaextra;
	String mc_salmin;
	String mc_ingmin;

	public Marcaciones(Integer mc_nro, Integer mc_empleado, String mc_inghora1, String mc_salhora1, Integer mc_turfinalizado, String mc_fecha, Object mc_entfoto1, Object mc_salfoto1, Integer mc_borrado, Integer mc_nroliquidacion, Integer mc_liquidado, Integer mc_feriado, String mc_horaextra, String mc_salmin, String mc_ingmin){
		this.mc_nro = mc_nro;
		this.mc_empleado = mc_empleado;
		this.mc_inghora1 = mc_inghora1;
		this.mc_salhora1 = mc_salhora1;
		this.mc_turfinalizado = mc_turfinalizado;
		this.mc_fecha = mc_fecha;
		this.mc_entfoto1 = mc_entfoto1;
		this.mc_salfoto1 = mc_salfoto1;
		this.mc_borrado = mc_borrado;
		this.mc_nroliquidacion = mc_nroliquidacion;
		this.mc_liquidado = mc_liquidado;
		this.mc_feriado = mc_feriado;
		this.mc_horaextra = mc_horaextra;
		this.mc_salmin = mc_salmin;
		this.mc_ingmin = mc_ingmin;
	}
	public Marcaciones(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Marcaciones{"+", mc_nro=" + mc_nro+", mc_empleado=" + mc_empleado+", mc_inghora1=" + mc_inghora1+", mc_salhora1=" + mc_salhora1+", mc_turfinalizado=" + mc_turfinalizado+", mc_fecha=" + mc_fecha+", mc_entfoto1=" + mc_entfoto1+", mc_salfoto1=" + mc_salfoto1+", mc_borrado=" + mc_borrado+", mc_nroliquidacion=" + mc_nroliquidacion+", mc_liquidado=" + mc_liquidado+", mc_feriado=" + mc_feriado+", mc_horaextra=" + mc_horaextra+", mc_salmin=" + mc_salmin+", mc_ingmin=" + mc_ingmin+"}";

	}
	public Integer getMc_nro(){
		return mc_nro;
	}
	public void setMc_nro(Integer mc_nro){
		this.mc_nro = mc_nro;
	}
	public Integer getMc_empleado(){
		return mc_empleado;
	}
	public void setMc_empleado(Integer mc_empleado){
		this.mc_empleado = mc_empleado;
	}
	public String getMc_inghora1(){
		return mc_inghora1;
	}
	public void setMc_inghora1(String mc_inghora1){
		this.mc_inghora1 = mc_inghora1;
	}
	public String getMc_salhora1(){
		return mc_salhora1;
	}
	public void setMc_salhora1(String mc_salhora1){
		this.mc_salhora1 = mc_salhora1;
	}
	public Integer getMc_turfinalizado(){
		return mc_turfinalizado;
	}
	public void setMc_turfinalizado(Integer mc_turfinalizado){
		this.mc_turfinalizado = mc_turfinalizado;
	}
	public String getMc_fecha(){
		return mc_fecha;
	}
	public void setMc_fecha(String mc_fecha){
		this.mc_fecha = mc_fecha;
	}
	public Object getMc_entfoto1(){
		return mc_entfoto1;
	}
	public void setMc_entfoto1(Object mc_entfoto1){
		this.mc_entfoto1 = mc_entfoto1;
	}
	public Object getMc_salfoto1(){
		return mc_salfoto1;
	}
	public void setMc_salfoto1(Object mc_salfoto1){
		this.mc_salfoto1 = mc_salfoto1;
	}
	public Integer getMc_borrado(){
		return mc_borrado;
	}
	public void setMc_borrado(Integer mc_borrado){
		this.mc_borrado = mc_borrado;
	}
	public Integer getMc_nroliquidacion(){
		return mc_nroliquidacion;
	}
	public void setMc_nroliquidacion(Integer mc_nroliquidacion){
		this.mc_nroliquidacion = mc_nroliquidacion;
	}
	public Integer getMc_liquidado(){
		return mc_liquidado;
	}
	public void setMc_liquidado(Integer mc_liquidado){
		this.mc_liquidado = mc_liquidado;
	}
	public Integer getMc_feriado(){
		return mc_feriado;
	}
	public void setMc_feriado(Integer mc_feriado){
		this.mc_feriado = mc_feriado;
	}
	public String getMc_horaextra(){
		return mc_horaextra;
	}
	public void setMc_horaextra(String mc_horaextra){
		this.mc_horaextra = mc_horaextra;
	}
	public String getMc_salmin(){
		return mc_salmin;
	}
	public void setMc_salmin(String mc_salmin){
		this.mc_salmin = mc_salmin;
	}
	public String getMc_ingmin(){
		return mc_ingmin;
	}
	public void setMc_ingmin(String mc_ingmin){
		this.mc_ingmin = mc_ingmin;
	}

}