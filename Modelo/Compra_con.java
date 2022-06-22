package modelo;

public class Compra_con{
	Integer com_nro;
	String com_codpro;
	Double com_cant;
	Integer cod_tipcan;
	Double com_costo;
	Double com_pventa1;
	Double com_pventa2;
	Double com_pventa3;
	Double com_pventa4;
	String com_vencimiento;
	Integer com_activo;
	Double com_stact;
	Double com_stant;
	Integer com_iva;
	Double com_iva5;
	Double com_iva10;
	Double com_excen;
	String com_lote;
	Double com_moneda;
	Double com_monedo;
	Double com_monere;
	Double com_monepe;
	Double com_moneeu;
	Integer com_nucaja;
	Double com_desc;
	Integer com_borrado;
	Integer usuariosct;
	String maquinasct;
	Integer com_deposito;
	Double com_costomayorista;
	Double com_cantbonificacion;
	Double com_bonificado;
	Integer com_id;
	Integer com_rubro;
	String com_detalle;

	public Compra_con(Integer com_nro, String com_codpro, Double com_cant, Integer cod_tipcan, Double com_costo, Double com_pventa1, Double com_pventa2, Double com_pventa3, Double com_pventa4, String com_vencimiento, Integer com_activo, Double com_stact, Double com_stant, Integer com_iva, Double com_iva5, Double com_iva10, Double com_excen, String com_lote, Double com_moneda, Double com_monedo, Double com_monere, Double com_monepe, Double com_moneeu, Integer com_nucaja, Double com_desc, Integer com_borrado, Integer usuariosct, String maquinasct, Integer com_deposito, Double com_costomayorista, Double com_cantbonificacion, Double com_bonificado, Integer com_id, Integer com_rubro, String com_detalle){
		this.com_nro = com_nro;
		this.com_codpro = com_codpro;
		this.com_cant = com_cant;
		this.cod_tipcan = cod_tipcan;
		this.com_costo = com_costo;
		this.com_pventa1 = com_pventa1;
		this.com_pventa2 = com_pventa2;
		this.com_pventa3 = com_pventa3;
		this.com_pventa4 = com_pventa4;
		this.com_vencimiento = com_vencimiento;
		this.com_activo = com_activo;
		this.com_stact = com_stact;
		this.com_stant = com_stant;
		this.com_iva = com_iva;
		this.com_iva5 = com_iva5;
		this.com_iva10 = com_iva10;
		this.com_excen = com_excen;
		this.com_lote = com_lote;
		this.com_moneda = com_moneda;
		this.com_monedo = com_monedo;
		this.com_monere = com_monere;
		this.com_monepe = com_monepe;
		this.com_moneeu = com_moneeu;
		this.com_nucaja = com_nucaja;
		this.com_desc = com_desc;
		this.com_borrado = com_borrado;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.com_deposito = com_deposito;
		this.com_costomayorista = com_costomayorista;
		this.com_cantbonificacion = com_cantbonificacion;
		this.com_bonificado = com_bonificado;
		this.com_id = com_id;
		this.com_rubro = com_rubro;
		this.com_detalle = com_detalle;
	}
	public Compra_con(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compra_con{"+", com_nro=" + com_nro+", com_codpro=" + com_codpro+", com_cant=" + com_cant+", cod_tipcan=" + cod_tipcan+", com_costo=" + com_costo+", com_pventa1=" + com_pventa1+", com_pventa2=" + com_pventa2+", com_pventa3=" + com_pventa3+", com_pventa4=" + com_pventa4+", com_vencimiento=" + com_vencimiento+", com_activo=" + com_activo+", com_stact=" + com_stact+", com_stant=" + com_stant+", com_iva=" + com_iva+", com_iva5=" + com_iva5+", com_iva10=" + com_iva10+", com_excen=" + com_excen+", com_lote=" + com_lote+", com_moneda=" + com_moneda+", com_monedo=" + com_monedo+", com_monere=" + com_monere+", com_monepe=" + com_monepe+", com_moneeu=" + com_moneeu+", com_nucaja=" + com_nucaja+", com_desc=" + com_desc+", com_borrado=" + com_borrado+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", com_deposito=" + com_deposito+", com_costomayorista=" + com_costomayorista+", com_cantbonificacion=" + com_cantbonificacion+", com_bonificado=" + com_bonificado+", com_id=" + com_id+", com_rubro=" + com_rubro+", com_detalle=" + com_detalle+"}";

	}
	public Integer getCom_nro(){
		return com_nro;
	}
	public void setCom_nro(Integer com_nro){
		this.com_nro = com_nro;
	}
	public String getCom_codpro(){
		return com_codpro;
	}
	public void setCom_codpro(String com_codpro){
		this.com_codpro = com_codpro;
	}
	public Double getCom_cant(){
		return com_cant;
	}
	public void setCom_cant(Double com_cant){
		this.com_cant = com_cant;
	}
	public Integer getCod_tipcan(){
		return cod_tipcan;
	}
	public void setCod_tipcan(Integer cod_tipcan){
		this.cod_tipcan = cod_tipcan;
	}
	public Double getCom_costo(){
		return com_costo;
	}
	public void setCom_costo(Double com_costo){
		this.com_costo = com_costo;
	}
	public Double getCom_pventa1(){
		return com_pventa1;
	}
	public void setCom_pventa1(Double com_pventa1){
		this.com_pventa1 = com_pventa1;
	}
	public Double getCom_pventa2(){
		return com_pventa2;
	}
	public void setCom_pventa2(Double com_pventa2){
		this.com_pventa2 = com_pventa2;
	}
	public Double getCom_pventa3(){
		return com_pventa3;
	}
	public void setCom_pventa3(Double com_pventa3){
		this.com_pventa3 = com_pventa3;
	}
	public Double getCom_pventa4(){
		return com_pventa4;
	}
	public void setCom_pventa4(Double com_pventa4){
		this.com_pventa4 = com_pventa4;
	}
	public String getCom_vencimiento(){
		return com_vencimiento;
	}
	public void setCom_vencimiento(String com_vencimiento){
		this.com_vencimiento = com_vencimiento;
	}
	public Integer getCom_activo(){
		return com_activo;
	}
	public void setCom_activo(Integer com_activo){
		this.com_activo = com_activo;
	}
	public Double getCom_stact(){
		return com_stact;
	}
	public void setCom_stact(Double com_stact){
		this.com_stact = com_stact;
	}
	public Double getCom_stant(){
		return com_stant;
	}
	public void setCom_stant(Double com_stant){
		this.com_stant = com_stant;
	}
	public Integer getCom_iva(){
		return com_iva;
	}
	public void setCom_iva(Integer com_iva){
		this.com_iva = com_iva;
	}
	public Double getCom_iva5(){
		return com_iva5;
	}
	public void setCom_iva5(Double com_iva5){
		this.com_iva5 = com_iva5;
	}
	public Double getCom_iva10(){
		return com_iva10;
	}
	public void setCom_iva10(Double com_iva10){
		this.com_iva10 = com_iva10;
	}
	public Double getCom_excen(){
		return com_excen;
	}
	public void setCom_excen(Double com_excen){
		this.com_excen = com_excen;
	}
	public String getCom_lote(){
		return com_lote;
	}
	public void setCom_lote(String com_lote){
		this.com_lote = com_lote;
	}
	public Double getCom_moneda(){
		return com_moneda;
	}
	public void setCom_moneda(Double com_moneda){
		this.com_moneda = com_moneda;
	}
	public Double getCom_monedo(){
		return com_monedo;
	}
	public void setCom_monedo(Double com_monedo){
		this.com_monedo = com_monedo;
	}
	public Double getCom_monere(){
		return com_monere;
	}
	public void setCom_monere(Double com_monere){
		this.com_monere = com_monere;
	}
	public Double getCom_monepe(){
		return com_monepe;
	}
	public void setCom_monepe(Double com_monepe){
		this.com_monepe = com_monepe;
	}
	public Double getCom_moneeu(){
		return com_moneeu;
	}
	public void setCom_moneeu(Double com_moneeu){
		this.com_moneeu = com_moneeu;
	}
	public Integer getCom_nucaja(){
		return com_nucaja;
	}
	public void setCom_nucaja(Integer com_nucaja){
		this.com_nucaja = com_nucaja;
	}
	public Double getCom_desc(){
		return com_desc;
	}
	public void setCom_desc(Double com_desc){
		this.com_desc = com_desc;
	}
	public Integer getCom_borrado(){
		return com_borrado;
	}
	public void setCom_borrado(Integer com_borrado){
		this.com_borrado = com_borrado;
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
	public Integer getCom_deposito(){
		return com_deposito;
	}
	public void setCom_deposito(Integer com_deposito){
		this.com_deposito = com_deposito;
	}
	public Double getCom_costomayorista(){
		return com_costomayorista;
	}
	public void setCom_costomayorista(Double com_costomayorista){
		this.com_costomayorista = com_costomayorista;
	}
	public Double getCom_cantbonificacion(){
		return com_cantbonificacion;
	}
	public void setCom_cantbonificacion(Double com_cantbonificacion){
		this.com_cantbonificacion = com_cantbonificacion;
	}
	public Double getCom_bonificado(){
		return com_bonificado;
	}
	public void setCom_bonificado(Double com_bonificado){
		this.com_bonificado = com_bonificado;
	}
	public Integer getCom_id(){
		return com_id;
	}
	public void setCom_id(Integer com_id){
		this.com_id = com_id;
	}
	public Integer getCom_rubro(){
		return com_rubro;
	}
	public void setCom_rubro(Integer com_rubro){
		this.com_rubro = com_rubro;
	}
	public String getCom_detalle(){
		return com_detalle;
	}
	public void setCom_detalle(String com_detalle){
		this.com_detalle = com_detalle;
	}

}