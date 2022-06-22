package modelo;

public class Datoshechauka{
	Integer dth_id;
	Object dth_ruccontribuyente;
	Integer dth_dvcontribuyente;
	Object dth_nombrecontribuyente;
	Object dth_ruclegal;
	Integer dth_dvlegal;
	Object dth_nombrelegal;

	public Datoshechauka(Integer dth_id, Object dth_ruccontribuyente, Integer dth_dvcontribuyente, Object dth_nombrecontribuyente, Object dth_ruclegal, Integer dth_dvlegal, Object dth_nombrelegal){
		this.dth_id = dth_id;
		this.dth_ruccontribuyente = dth_ruccontribuyente;
		this.dth_dvcontribuyente = dth_dvcontribuyente;
		this.dth_nombrecontribuyente = dth_nombrecontribuyente;
		this.dth_ruclegal = dth_ruclegal;
		this.dth_dvlegal = dth_dvlegal;
		this.dth_nombrelegal = dth_nombrelegal;
	}
	public Datoshechauka(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Datoshechauka{"+", dth_id=" + dth_id+", dth_ruccontribuyente=" + dth_ruccontribuyente+", dth_dvcontribuyente=" + dth_dvcontribuyente+", dth_nombrecontribuyente=" + dth_nombrecontribuyente+", dth_ruclegal=" + dth_ruclegal+", dth_dvlegal=" + dth_dvlegal+", dth_nombrelegal=" + dth_nombrelegal+"}";

	}
	public Integer getDth_id(){
		return dth_id;
	}
	public void setDth_id(Integer dth_id){
		this.dth_id = dth_id;
	}
	public Object getDth_ruccontribuyente(){
		return dth_ruccontribuyente;
	}
	public void setDth_ruccontribuyente(Object dth_ruccontribuyente){
		this.dth_ruccontribuyente = dth_ruccontribuyente;
	}
	public Integer getDth_dvcontribuyente(){
		return dth_dvcontribuyente;
	}
	public void setDth_dvcontribuyente(Integer dth_dvcontribuyente){
		this.dth_dvcontribuyente = dth_dvcontribuyente;
	}
	public Object getDth_nombrecontribuyente(){
		return dth_nombrecontribuyente;
	}
	public void setDth_nombrecontribuyente(Object dth_nombrecontribuyente){
		this.dth_nombrecontribuyente = dth_nombrecontribuyente;
	}
	public Object getDth_ruclegal(){
		return dth_ruclegal;
	}
	public void setDth_ruclegal(Object dth_ruclegal){
		this.dth_ruclegal = dth_ruclegal;
	}
	public Integer getDth_dvlegal(){
		return dth_dvlegal;
	}
	public void setDth_dvlegal(Integer dth_dvlegal){
		this.dth_dvlegal = dth_dvlegal;
	}
	public Object getDth_nombrelegal(){
		return dth_nombrelegal;
	}
	public void setDth_nombrelegal(Object dth_nombrelegal){
		this.dth_nombrelegal = dth_nombrelegal;
	}

}