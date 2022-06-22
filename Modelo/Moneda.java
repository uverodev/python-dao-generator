package modelo;

public class Moneda{
	Integer nro;
	String fecha;
	Double docom;
	Double doven;
	Double pecom;
	Double peven;
	Double recom;
	Double reven;
	Double eucom;
	Double euven;
	String maquinasct;

	public Moneda(Integer nro, String fecha, Double docom, Double doven, Double pecom, Double peven, Double recom, Double reven, Double eucom, Double euven, String maquinasct){
		this.nro = nro;
		this.fecha = fecha;
		this.docom = docom;
		this.doven = doven;
		this.pecom = pecom;
		this.peven = peven;
		this.recom = recom;
		this.reven = reven;
		this.eucom = eucom;
		this.euven = euven;
		this.maquinasct = maquinasct;
	}
	public Moneda(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Moneda{"+", nro=" + nro+", fecha=" + fecha+", docom=" + docom+", doven=" + doven+", pecom=" + pecom+", peven=" + peven+", recom=" + recom+", reven=" + reven+", eucom=" + eucom+", euven=" + euven+", maquinasct=" + maquinasct+"}";

	}
	public Integer getNro(){
		return nro;
	}
	public void setNro(Integer nro){
		this.nro = nro;
	}
	public String getFecha(){
		return fecha;
	}
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	public Double getDocom(){
		return docom;
	}
	public void setDocom(Double docom){
		this.docom = docom;
	}
	public Double getDoven(){
		return doven;
	}
	public void setDoven(Double doven){
		this.doven = doven;
	}
	public Double getPecom(){
		return pecom;
	}
	public void setPecom(Double pecom){
		this.pecom = pecom;
	}
	public Double getPeven(){
		return peven;
	}
	public void setPeven(Double peven){
		this.peven = peven;
	}
	public Double getRecom(){
		return recom;
	}
	public void setRecom(Double recom){
		this.recom = recom;
	}
	public Double getReven(){
		return reven;
	}
	public void setReven(Double reven){
		this.reven = reven;
	}
	public Double getEucom(){
		return eucom;
	}
	public void setEucom(Double eucom){
		this.eucom = eucom;
	}
	public Double getEuven(){
		return euven;
	}
	public void setEuven(Double euven){
		this.euven = euven;
	}
	public String getMaquinasct(){
		return maquinasct;
	}
	public void setMaquinasct(String maquinasct){
		this.maquinasct = maquinasct;
	}

}