package modelo;

public class Interes{
	Integer int_nro;
	String int_fecha;
	String int_hora;
	Double int_mora;
	Double int_cobrador;
	Integer int_tipcobro;
	Double int_mcobrador;
	Double int_limredondeo;
	Double int_intmensual;
	Double int_pventa1por;
	Double int_pventa2por;
	Double int_pventa3por;
	Double int_pventa4por;
	Integer int_borrado;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Double int_meta;

	public Interes(Integer int_nro, String int_fecha, String int_hora, Double int_mora, Double int_cobrador, Integer int_tipcobro, Double int_mcobrador, Double int_limredondeo, Double int_intmensual, Double int_pventa1por, Double int_pventa2por, Double int_pventa3por, Double int_pventa4por, Integer int_borrado, String fechasct, Integer usuariosct, String maquinasct, Double int_meta){
		this.int_nro = int_nro;
		this.int_fecha = int_fecha;
		this.int_hora = int_hora;
		this.int_mora = int_mora;
		this.int_cobrador = int_cobrador;
		this.int_tipcobro = int_tipcobro;
		this.int_mcobrador = int_mcobrador;
		this.int_limredondeo = int_limredondeo;
		this.int_intmensual = int_intmensual;
		this.int_pventa1por = int_pventa1por;
		this.int_pventa2por = int_pventa2por;
		this.int_pventa3por = int_pventa3por;
		this.int_pventa4por = int_pventa4por;
		this.int_borrado = int_borrado;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.int_meta = int_meta;
	}
	public Interes(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Interes{"+", int_nro=" + int_nro+", int_fecha=" + int_fecha+", int_hora=" + int_hora+", int_mora=" + int_mora+", int_cobrador=" + int_cobrador+", int_tipcobro=" + int_tipcobro+", int_mcobrador=" + int_mcobrador+", int_limredondeo=" + int_limredondeo+", int_intmensual=" + int_intmensual+", int_pventa1por=" + int_pventa1por+", int_pventa2por=" + int_pventa2por+", int_pventa3por=" + int_pventa3por+", int_pventa4por=" + int_pventa4por+", int_borrado=" + int_borrado+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", int_meta=" + int_meta+"}";

	}
	public Integer getInt_nro(){
		return int_nro;
	}
	public void setInt_nro(Integer int_nro){
		this.int_nro = int_nro;
	}
	public String getInt_fecha(){
		return int_fecha;
	}
	public void setInt_fecha(String int_fecha){
		this.int_fecha = int_fecha;
	}
	public String getInt_hora(){
		return int_hora;
	}
	public void setInt_hora(String int_hora){
		this.int_hora = int_hora;
	}
	public Double getInt_mora(){
		return int_mora;
	}
	public void setInt_mora(Double int_mora){
		this.int_mora = int_mora;
	}
	public Double getInt_cobrador(){
		return int_cobrador;
	}
	public void setInt_cobrador(Double int_cobrador){
		this.int_cobrador = int_cobrador;
	}
	public Integer getInt_tipcobro(){
		return int_tipcobro;
	}
	public void setInt_tipcobro(Integer int_tipcobro){
		this.int_tipcobro = int_tipcobro;
	}
	public Double getInt_mcobrador(){
		return int_mcobrador;
	}
	public void setInt_mcobrador(Double int_mcobrador){
		this.int_mcobrador = int_mcobrador;
	}
	public Double getInt_limredondeo(){
		return int_limredondeo;
	}
	public void setInt_limredondeo(Double int_limredondeo){
		this.int_limredondeo = int_limredondeo;
	}
	public Double getInt_intmensual(){
		return int_intmensual;
	}
	public void setInt_intmensual(Double int_intmensual){
		this.int_intmensual = int_intmensual;
	}
	public Double getInt_pventa1por(){
		return int_pventa1por;
	}
	public void setInt_pventa1por(Double int_pventa1por){
		this.int_pventa1por = int_pventa1por;
	}
	public Double getInt_pventa2por(){
		return int_pventa2por;
	}
	public void setInt_pventa2por(Double int_pventa2por){
		this.int_pventa2por = int_pventa2por;
	}
	public Double getInt_pventa3por(){
		return int_pventa3por;
	}
	public void setInt_pventa3por(Double int_pventa3por){
		this.int_pventa3por = int_pventa3por;
	}
	public Double getInt_pventa4por(){
		return int_pventa4por;
	}
	public void setInt_pventa4por(Double int_pventa4por){
		this.int_pventa4por = int_pventa4por;
	}
	public Integer getInt_borrado(){
		return int_borrado;
	}
	public void setInt_borrado(Integer int_borrado){
		this.int_borrado = int_borrado;
	}
	public String getFechasct(){
		return fechasct;
	}
	public void setFechasct(String fechasct){
		this.fechasct = fechasct;
	}
	public Integer getUsuariosct(){
		return usuariosct;
	}
	public void setUsuariosct(Integer usuariosct){
		this.usuariosct = usuariosct;
	}
	public String getMaquinasct(){
		return maquinasct;
	}
	public void setMaquinasct(String maquinasct){
		this.maquinasct = maquinasct;
	}
	public Double getInt_meta(){
		return int_meta;
	}
	public void setInt_meta(Double int_meta){
		this.int_meta = int_meta;
	}

}