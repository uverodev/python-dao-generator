package modelo;

public class Parametro{
	String par_razon;
	String par_ruc;
	String par_direc;
	String par_tel;
	String par_mem1;
	String par_mem2;
	String par_mem3;
	String par_memp;
	String par_memcb;
	String par_messa;
	String par_ciudad;
	String par_finfactura;
	String par_iniciofactura;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	String par_ultmant;
	String par_base_transferencia;
	Integer par_cod;

	public Parametro(String par_razon, String par_ruc, String par_direc, String par_tel, String par_mem1, String par_mem2, String par_mem3, String par_memp, String par_memcb, String par_messa, String par_ciudad, String par_finfactura, String par_iniciofactura, String fechasct, Integer usuariosct, String maquinasct, String par_ultmant, String par_base_transferencia, Integer par_cod){
		this.par_razon = par_razon;
		this.par_ruc = par_ruc;
		this.par_direc = par_direc;
		this.par_tel = par_tel;
		this.par_mem1 = par_mem1;
		this.par_mem2 = par_mem2;
		this.par_mem3 = par_mem3;
		this.par_memp = par_memp;
		this.par_memcb = par_memcb;
		this.par_messa = par_messa;
		this.par_ciudad = par_ciudad;
		this.par_finfactura = par_finfactura;
		this.par_iniciofactura = par_iniciofactura;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.par_ultmant = par_ultmant;
		this.par_base_transferencia = par_base_transferencia;
		this.par_cod = par_cod;
	}
	public Parametro(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Parametro{"+", par_razon=" + par_razon+", par_ruc=" + par_ruc+", par_direc=" + par_direc+", par_tel=" + par_tel+", par_mem1=" + par_mem1+", par_mem2=" + par_mem2+", par_mem3=" + par_mem3+", par_memp=" + par_memp+", par_memcb=" + par_memcb+", par_messa=" + par_messa+", par_ciudad=" + par_ciudad+", par_finfactura=" + par_finfactura+", par_iniciofactura=" + par_iniciofactura+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", par_ultmant=" + par_ultmant+", par_base_transferencia=" + par_base_transferencia+", par_cod=" + par_cod+"}";

	}
	public String getPar_razon(){
		return par_razon;
	}
	public void setPar_razon(String par_razon){
		this.par_razon = par_razon;
	}
	public String getPar_ruc(){
		return par_ruc;
	}
	public void setPar_ruc(String par_ruc){
		this.par_ruc = par_ruc;
	}
	public String getPar_direc(){
		return par_direc;
	}
	public void setPar_direc(String par_direc){
		this.par_direc = par_direc;
	}
	public String getPar_tel(){
		return par_tel;
	}
	public void setPar_tel(String par_tel){
		this.par_tel = par_tel;
	}
	public String getPar_mem1(){
		return par_mem1;
	}
	public void setPar_mem1(String par_mem1){
		this.par_mem1 = par_mem1;
	}
	public String getPar_mem2(){
		return par_mem2;
	}
	public void setPar_mem2(String par_mem2){
		this.par_mem2 = par_mem2;
	}
	public String getPar_mem3(){
		return par_mem3;
	}
	public void setPar_mem3(String par_mem3){
		this.par_mem3 = par_mem3;
	}
	public String getPar_memp(){
		return par_memp;
	}
	public void setPar_memp(String par_memp){
		this.par_memp = par_memp;
	}
	public String getPar_memcb(){
		return par_memcb;
	}
	public void setPar_memcb(String par_memcb){
		this.par_memcb = par_memcb;
	}
	public String getPar_messa(){
		return par_messa;
	}
	public void setPar_messa(String par_messa){
		this.par_messa = par_messa;
	}
	public String getPar_ciudad(){
		return par_ciudad;
	}
	public void setPar_ciudad(String par_ciudad){
		this.par_ciudad = par_ciudad;
	}
	public String getPar_finfactura(){
		return par_finfactura;
	}
	public void setPar_finfactura(String par_finfactura){
		this.par_finfactura = par_finfactura;
	}
	public String getPar_iniciofactura(){
		return par_iniciofactura;
	}
	public void setPar_iniciofactura(String par_iniciofactura){
		this.par_iniciofactura = par_iniciofactura;
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
	public String getPar_ultmant(){
		return par_ultmant;
	}
	public void setPar_ultmant(String par_ultmant){
		this.par_ultmant = par_ultmant;
	}
	public String getPar_base_transferencia(){
		return par_base_transferencia;
	}
	public void setPar_base_transferencia(String par_base_transferencia){
		this.par_base_transferencia = par_base_transferencia;
	}
	public Integer getPar_cod(){
		return par_cod;
	}
	public void setPar_cod(Integer par_cod){
		this.par_cod = par_cod;
	}

}