package modelo;

public class Categorias{
	Integer cat_cod;
	String cat_descri;
	Double cat_por1;
	Double cat_por2;
	Double cat_por3;
	Double cat_por4;
	Double cat_comisioncreex;
	Double cat_pracomisioncreex;
	Double cat_pracomisionex;
	Double cat_comisionex;
	Double cat_comisioncre;
	Double cat_pracomisioncre;
	Double cat_pracomision;
	Double cat_comision;

	public Categorias(Integer cat_cod, String cat_descri, Double cat_por1, Double cat_por2, Double cat_por3, Double cat_por4, Double cat_comisioncreex, Double cat_pracomisioncreex, Double cat_pracomisionex, Double cat_comisionex, Double cat_comisioncre, Double cat_pracomisioncre, Double cat_pracomision, Double cat_comision){
		this.cat_cod = cat_cod;
		this.cat_descri = cat_descri;
		this.cat_por1 = cat_por1;
		this.cat_por2 = cat_por2;
		this.cat_por3 = cat_por3;
		this.cat_por4 = cat_por4;
		this.cat_comisioncreex = cat_comisioncreex;
		this.cat_pracomisioncreex = cat_pracomisioncreex;
		this.cat_pracomisionex = cat_pracomisionex;
		this.cat_comisionex = cat_comisionex;
		this.cat_comisioncre = cat_comisioncre;
		this.cat_pracomisioncre = cat_pracomisioncre;
		this.cat_pracomision = cat_pracomision;
		this.cat_comision = cat_comision;
	}
	public Categorias(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Categorias{"+", cat_cod=" + cat_cod+", cat_descri=" + cat_descri+", cat_por1=" + cat_por1+", cat_por2=" + cat_por2+", cat_por3=" + cat_por3+", cat_por4=" + cat_por4+", cat_comisioncreex=" + cat_comisioncreex+", cat_pracomisioncreex=" + cat_pracomisioncreex+", cat_pracomisionex=" + cat_pracomisionex+", cat_comisionex=" + cat_comisionex+", cat_comisioncre=" + cat_comisioncre+", cat_pracomisioncre=" + cat_pracomisioncre+", cat_pracomision=" + cat_pracomision+", cat_comision=" + cat_comision+"}";

	}
	public Integer getCat_cod(){
		return cat_cod;
	}
	public void setCat_cod(Integer cat_cod){
		this.cat_cod = cat_cod;
	}
	public String getCat_descri(){
		return cat_descri;
	}
	public void setCat_descri(String cat_descri){
		this.cat_descri = cat_descri;
	}
	public Double getCat_por1(){
		return cat_por1;
	}
	public void setCat_por1(Double cat_por1){
		this.cat_por1 = cat_por1;
	}
	public Double getCat_por2(){
		return cat_por2;
	}
	public void setCat_por2(Double cat_por2){
		this.cat_por2 = cat_por2;
	}
	public Double getCat_por3(){
		return cat_por3;
	}
	public void setCat_por3(Double cat_por3){
		this.cat_por3 = cat_por3;
	}
	public Double getCat_por4(){
		return cat_por4;
	}
	public void setCat_por4(Double cat_por4){
		this.cat_por4 = cat_por4;
	}
	public Double getCat_comisioncreex(){
		return cat_comisioncreex;
	}
	public void setCat_comisioncreex(Double cat_comisioncreex){
		this.cat_comisioncreex = cat_comisioncreex;
	}
	public Double getCat_pracomisioncreex(){
		return cat_pracomisioncreex;
	}
	public void setCat_pracomisioncreex(Double cat_pracomisioncreex){
		this.cat_pracomisioncreex = cat_pracomisioncreex;
	}
	public Double getCat_pracomisionex(){
		return cat_pracomisionex;
	}
	public void setCat_pracomisionex(Double cat_pracomisionex){
		this.cat_pracomisionex = cat_pracomisionex;
	}
	public Double getCat_comisionex(){
		return cat_comisionex;
	}
	public void setCat_comisionex(Double cat_comisionex){
		this.cat_comisionex = cat_comisionex;
	}
	public Double getCat_comisioncre(){
		return cat_comisioncre;
	}
	public void setCat_comisioncre(Double cat_comisioncre){
		this.cat_comisioncre = cat_comisioncre;
	}
	public Double getCat_pracomisioncre(){
		return cat_pracomisioncre;
	}
	public void setCat_pracomisioncre(Double cat_pracomisioncre){
		this.cat_pracomisioncre = cat_pracomisioncre;
	}
	public Double getCat_pracomision(){
		return cat_pracomision;
	}
	public void setCat_pracomision(Double cat_pracomision){
		this.cat_pracomision = cat_pracomision;
	}
	public Double getCat_comision(){
		return cat_comision;
	}
	public void setCat_comision(Double cat_comision){
		this.cat_comision = cat_comision;
	}

}