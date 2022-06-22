package modelo;

public class Compradetalle_temp{
	Integer comt_nro;
	String comt_codpro;
	Double comt_cant;
	Integer cod_tipcan;
	Double comt_costo;
	Double comt_pventa1;
	Double comt_pventa2;
	Double comt_pventa3;
	Double comt_pventa4;
	String comt_vencimiento;
	Integer comt_activo;
	Double comt_stact;
	Double comt_stant;
	Integer comt_iva;
	Double comt_iva5;
	Double comt_iva10;
	Double comt_excen;
	String comt_lote;
	Double comt_moneda;
	Double comt_monedo;
	Double comt_monere;
	Double comt_monepe;
	Double comt_moneeu;
	Integer comt_nucaja;
	Double comt_desc;
	Integer comt_borrado;
	Integer comt_usuariosct;
	String comt_maquinasct;
	Integer comt_deposito;
	Double comt_costomayorista;
	String comt_maquina;
	Double comt_cantbonificacion;

	public Compradetalle_temp(Integer comt_nro, String comt_codpro, Double comt_cant, Integer cod_tipcan, Double comt_costo, Double comt_pventa1, Double comt_pventa2, Double comt_pventa3, Double comt_pventa4, String comt_vencimiento, Integer comt_activo, Double comt_stact, Double comt_stant, Integer comt_iva, Double comt_iva5, Double comt_iva10, Double comt_excen, String comt_lote, Double comt_moneda, Double comt_monedo, Double comt_monere, Double comt_monepe, Double comt_moneeu, Integer comt_nucaja, Double comt_desc, Integer comt_borrado, Integer comt_usuariosct, String comt_maquinasct, Integer comt_deposito, Double comt_costomayorista, String comt_maquina, Double comt_cantbonificacion){
		this.comt_nro = comt_nro;
		this.comt_codpro = comt_codpro;
		this.comt_cant = comt_cant;
		this.cod_tipcan = cod_tipcan;
		this.comt_costo = comt_costo;
		this.comt_pventa1 = comt_pventa1;
		this.comt_pventa2 = comt_pventa2;
		this.comt_pventa3 = comt_pventa3;
		this.comt_pventa4 = comt_pventa4;
		this.comt_vencimiento = comt_vencimiento;
		this.comt_activo = comt_activo;
		this.comt_stact = comt_stact;
		this.comt_stant = comt_stant;
		this.comt_iva = comt_iva;
		this.comt_iva5 = comt_iva5;
		this.comt_iva10 = comt_iva10;
		this.comt_excen = comt_excen;
		this.comt_lote = comt_lote;
		this.comt_moneda = comt_moneda;
		this.comt_monedo = comt_monedo;
		this.comt_monere = comt_monere;
		this.comt_monepe = comt_monepe;
		this.comt_moneeu = comt_moneeu;
		this.comt_nucaja = comt_nucaja;
		this.comt_desc = comt_desc;
		this.comt_borrado = comt_borrado;
		this.comt_usuariosct = comt_usuariosct;
		this.comt_maquinasct = comt_maquinasct;
		this.comt_deposito = comt_deposito;
		this.comt_costomayorista = comt_costomayorista;
		this.comt_maquina = comt_maquina;
		this.comt_cantbonificacion = comt_cantbonificacion;
	}
	public Compradetalle_temp(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Compradetalle_temp{"+", comt_nro=" + comt_nro+", comt_codpro=" + comt_codpro+", comt_cant=" + comt_cant+", cod_tipcan=" + cod_tipcan+", comt_costo=" + comt_costo+", comt_pventa1=" + comt_pventa1+", comt_pventa2=" + comt_pventa2+", comt_pventa3=" + comt_pventa3+", comt_pventa4=" + comt_pventa4+", comt_vencimiento=" + comt_vencimiento+", comt_activo=" + comt_activo+", comt_stact=" + comt_stact+", comt_stant=" + comt_stant+", comt_iva=" + comt_iva+", comt_iva5=" + comt_iva5+", comt_iva10=" + comt_iva10+", comt_excen=" + comt_excen+", comt_lote=" + comt_lote+", comt_moneda=" + comt_moneda+", comt_monedo=" + comt_monedo+", comt_monere=" + comt_monere+", comt_monepe=" + comt_monepe+", comt_moneeu=" + comt_moneeu+", comt_nucaja=" + comt_nucaja+", comt_desc=" + comt_desc+", comt_borrado=" + comt_borrado+", comt_usuariosct=" + comt_usuariosct+", comt_maquinasct=" + comt_maquinasct+", comt_deposito=" + comt_deposito+", comt_costomayorista=" + comt_costomayorista+", comt_maquina=" + comt_maquina+", comt_cantbonificacion=" + comt_cantbonificacion+"}";

	}
	public Integer getComt_nro(){
		return comt_nro;
	}
	public void setComt_nro(Integer comt_nro){
		this.comt_nro = comt_nro;
	}
	public String getComt_codpro(){
		return comt_codpro;
	}
	public void setComt_codpro(String comt_codpro){
		this.comt_codpro = comt_codpro;
	}
	public Double getComt_cant(){
		return comt_cant;
	}
	public void setComt_cant(Double comt_cant){
		this.comt_cant = comt_cant;
	}
	public Integer getCod_tipcan(){
		return cod_tipcan;
	}
	public void setCod_tipcan(Integer cod_tipcan){
		this.cod_tipcan = cod_tipcan;
	}
	public Double getComt_costo(){
		return comt_costo;
	}
	public void setComt_costo(Double comt_costo){
		this.comt_costo = comt_costo;
	}
	public Double getComt_pventa1(){
		return comt_pventa1;
	}
	public void setComt_pventa1(Double comt_pventa1){
		this.comt_pventa1 = comt_pventa1;
	}
	public Double getComt_pventa2(){
		return comt_pventa2;
	}
	public void setComt_pventa2(Double comt_pventa2){
		this.comt_pventa2 = comt_pventa2;
	}
	public Double getComt_pventa3(){
		return comt_pventa3;
	}
	public void setComt_pventa3(Double comt_pventa3){
		this.comt_pventa3 = comt_pventa3;
	}
	public Double getComt_pventa4(){
		return comt_pventa4;
	}
	public void setComt_pventa4(Double comt_pventa4){
		this.comt_pventa4 = comt_pventa4;
	}
	public String getComt_vencimiento(){
		return comt_vencimiento;
	}
	public void setComt_vencimiento(String comt_vencimiento){
		this.comt_vencimiento = comt_vencimiento;
	}
	public Integer getComt_activo(){
		return comt_activo;
	}
	public void setComt_activo(Integer comt_activo){
		this.comt_activo = comt_activo;
	}
	public Double getComt_stact(){
		return comt_stact;
	}
	public void setComt_stact(Double comt_stact){
		this.comt_stact = comt_stact;
	}
	public Double getComt_stant(){
		return comt_stant;
	}
	public void setComt_stant(Double comt_stant){
		this.comt_stant = comt_stant;
	}
	public Integer getComt_iva(){
		return comt_iva;
	}
	public void setComt_iva(Integer comt_iva){
		this.comt_iva = comt_iva;
	}
	public Double getComt_iva5(){
		return comt_iva5;
	}
	public void setComt_iva5(Double comt_iva5){
		this.comt_iva5 = comt_iva5;
	}
	public Double getComt_iva10(){
		return comt_iva10;
	}
	public void setComt_iva10(Double comt_iva10){
		this.comt_iva10 = comt_iva10;
	}
	public Double getComt_excen(){
		return comt_excen;
	}
	public void setComt_excen(Double comt_excen){
		this.comt_excen = comt_excen;
	}
	public String getComt_lote(){
		return comt_lote;
	}
	public void setComt_lote(String comt_lote){
		this.comt_lote = comt_lote;
	}
	public Double getComt_moneda(){
		return comt_moneda;
	}
	public void setComt_moneda(Double comt_moneda){
		this.comt_moneda = comt_moneda;
	}
	public Double getComt_monedo(){
		return comt_monedo;
	}
	public void setComt_monedo(Double comt_monedo){
		this.comt_monedo = comt_monedo;
	}
	public Double getComt_monere(){
		return comt_monere;
	}
	public void setComt_monere(Double comt_monere){
		this.comt_monere = comt_monere;
	}
	public Double getComt_monepe(){
		return comt_monepe;
	}
	public void setComt_monepe(Double comt_monepe){
		this.comt_monepe = comt_monepe;
	}
	public Double getComt_moneeu(){
		return comt_moneeu;
	}
	public void setComt_moneeu(Double comt_moneeu){
		this.comt_moneeu = comt_moneeu;
	}
	public Integer getComt_nucaja(){
		return comt_nucaja;
	}
	public void setComt_nucaja(Integer comt_nucaja){
		this.comt_nucaja = comt_nucaja;
	}
	public Double getComt_desc(){
		return comt_desc;
	}
	public void setComt_desc(Double comt_desc){
		this.comt_desc = comt_desc;
	}
	public Integer getComt_borrado(){
		return comt_borrado;
	}
	public void setComt_borrado(Integer comt_borrado){
		this.comt_borrado = comt_borrado;
	}
	public Integer getComt_usuariosct(){
		return comt_usuariosct;
	}
	public void setComt_usuariosct(Integer comt_usuariosct){
		this.comt_usuariosct = comt_usuariosct;
	}
	public String getComt_maquinasct(){
		return comt_maquinasct;
	}
	public void setComt_maquinasct(String comt_maquinasct){
		this.comt_maquinasct = comt_maquinasct;
	}
	public Integer getComt_deposito(){
		return comt_deposito;
	}
	public void setComt_deposito(Integer comt_deposito){
		this.comt_deposito = comt_deposito;
	}
	public Double getComt_costomayorista(){
		return comt_costomayorista;
	}
	public void setComt_costomayorista(Double comt_costomayorista){
		this.comt_costomayorista = comt_costomayorista;
	}
	public String getComt_maquina(){
		return comt_maquina;
	}
	public void setComt_maquina(String comt_maquina){
		this.comt_maquina = comt_maquina;
	}
	public Double getComt_cantbonificacion(){
		return comt_cantbonificacion;
	}
	public void setComt_cantbonificacion(Double comt_cantbonificacion){
		this.comt_cantbonificacion = comt_cantbonificacion;
	}

}