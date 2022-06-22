package modelo;

public class Proveedores{
	Integer prov_cod;
	String prov_descr;
	String prov_telef;
	String prov_fax;
	String prov_email;
	String prov_ciuda;
	String prov_direc;
	String prov_conta;
	String prov_obs;
	String prov_ruc;
	String prov_dv;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer prov_borrado;
	Integer prov_plazo;

	public Proveedores(Integer prov_cod, String prov_descr, String prov_telef, String prov_fax, String prov_email, String prov_ciuda, String prov_direc, String prov_conta, String prov_obs, String prov_ruc, String prov_dv, String fechasct, Integer usuariosct, String maquinasct, Integer prov_borrado, Integer prov_plazo){
		this.prov_cod = prov_cod;
		this.prov_descr = prov_descr;
		this.prov_telef = prov_telef;
		this.prov_fax = prov_fax;
		this.prov_email = prov_email;
		this.prov_ciuda = prov_ciuda;
		this.prov_direc = prov_direc;
		this.prov_conta = prov_conta;
		this.prov_obs = prov_obs;
		this.prov_ruc = prov_ruc;
		this.prov_dv = prov_dv;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.prov_borrado = prov_borrado;
		this.prov_plazo = prov_plazo;
	}
	public Proveedores(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Proveedores{"+", prov_cod=" + prov_cod+", prov_descr=" + prov_descr+", prov_telef=" + prov_telef+", prov_fax=" + prov_fax+", prov_email=" + prov_email+", prov_ciuda=" + prov_ciuda+", prov_direc=" + prov_direc+", prov_conta=" + prov_conta+", prov_obs=" + prov_obs+", prov_ruc=" + prov_ruc+", prov_dv=" + prov_dv+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", prov_borrado=" + prov_borrado+", prov_plazo=" + prov_plazo+"}";

	}
	public Integer getProv_cod(){
		return prov_cod;
	}
	public void setProv_cod(Integer prov_cod){
		this.prov_cod = prov_cod;
	}
	public String getProv_descr(){
		return prov_descr;
	}
	public void setProv_descr(String prov_descr){
		this.prov_descr = prov_descr;
	}
	public String getProv_telef(){
		return prov_telef;
	}
	public void setProv_telef(String prov_telef){
		this.prov_telef = prov_telef;
	}
	public String getProv_fax(){
		return prov_fax;
	}
	public void setProv_fax(String prov_fax){
		this.prov_fax = prov_fax;
	}
	public String getProv_email(){
		return prov_email;
	}
	public void setProv_email(String prov_email){
		this.prov_email = prov_email;
	}
	public String getProv_ciuda(){
		return prov_ciuda;
	}
	public void setProv_ciuda(String prov_ciuda){
		this.prov_ciuda = prov_ciuda;
	}
	public String getProv_direc(){
		return prov_direc;
	}
	public void setProv_direc(String prov_direc){
		this.prov_direc = prov_direc;
	}
	public String getProv_conta(){
		return prov_conta;
	}
	public void setProv_conta(String prov_conta){
		this.prov_conta = prov_conta;
	}
	public String getProv_obs(){
		return prov_obs;
	}
	public void setProv_obs(String prov_obs){
		this.prov_obs = prov_obs;
	}
	public String getProv_ruc(){
		return prov_ruc;
	}
	public void setProv_ruc(String prov_ruc){
		this.prov_ruc = prov_ruc;
	}
	public String getProv_dv(){
		return prov_dv;
	}
	public void setProv_dv(String prov_dv){
		this.prov_dv = prov_dv;
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
	public Integer getProv_borrado(){
		return prov_borrado;
	}
	public void setProv_borrado(Integer prov_borrado){
		this.prov_borrado = prov_borrado;
	}
	public Integer getProv_plazo(){
		return prov_plazo;
	}
	public void setProv_plazo(Integer prov_plazo){
		this.prov_plazo = prov_plazo;
	}

}