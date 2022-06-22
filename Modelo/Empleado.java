package modelo;

public class Empleado{
	Integer emp_nro;
	String emp_nombre;
	String emp_apelli;
	Integer emp_modalidad;
	String emp_fechaingre;
	Integer emp_usistema;
	String emp_tele1;
	String emp_tele2;
	String emp_tele3;
	String emp_domicilio;
	String emp_nrodomi;
	String emp_dominum;
	Integer emp_edad;
	Integer emp_sexo;
	Integer emp_estcivil;
	String emp_profesion;
	String emp_sena;
	Integer emp_estempleado;
	Double emp_sueldo;
	Double emp_horaxdia;
	Double emp_horaextra;
	Double emp_fercosto;
	Integer emp_comitipo;
	Integer emp_prectipo;
	Integer emp_ventacont;
	Integer emp_ventacred;
	Integer emp_cobrador;
	String emp_observacion;
	Integer emp_moneda;
	Double emp_comivcont;
	Double emp_comivcred;
	String emp_numced;
	String emp_ruc;
	String emp_cargo;
	String emp_fechanaci;
	Integer emp_borrado;
	Double emp_comivpracont;
	Double emp_comivpracred;
	Double emp_comivfijocont;
	Double emp_comivfijocred;
	String emp_turn8;
	String emp_turn7;
	String emp_turn6;
	String emp_turn5;
	String emp_turn4;
	String emp_turn3;
	String emp_turn2;
	String emp_turn1;
	Double emp_porcxutilidad;
	Integer emp_comisionista;
	Double emp_sueldoxdia;
	Integer emp_tipsalario;
	Integer emp_tiptrabajo;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Double emp_porcentaje_ips;
	Double emp_minimo_comision;
	Integer emp_usuario;
	String emp_comision_desde;
	String emp_comision_hasta;

	public Empleado(Integer emp_nro, String emp_nombre, String emp_apelli, Integer emp_modalidad, String emp_fechaingre, Integer emp_usistema, String emp_tele1, String emp_tele2, String emp_tele3, String emp_domicilio, String emp_nrodomi, String emp_dominum, Integer emp_edad, Integer emp_sexo, Integer emp_estcivil, String emp_profesion, String emp_sena, Integer emp_estempleado, Double emp_sueldo, Double emp_horaxdia, Double emp_horaextra, Double emp_fercosto, Integer emp_comitipo, Integer emp_prectipo, Integer emp_ventacont, Integer emp_ventacred, Integer emp_cobrador, String emp_observacion, Integer emp_moneda, Double emp_comivcont, Double emp_comivcred, String emp_numced, String emp_ruc, String emp_cargo, String emp_fechanaci, Integer emp_borrado, Double emp_comivpracont, Double emp_comivpracred, Double emp_comivfijocont, Double emp_comivfijocred, String emp_turn8, String emp_turn7, String emp_turn6, String emp_turn5, String emp_turn4, String emp_turn3, String emp_turn2, String emp_turn1, Double emp_porcxutilidad, Integer emp_comisionista, Double emp_sueldoxdia, Integer emp_tipsalario, Integer emp_tiptrabajo, String fechasct, Integer usuariosct, String maquinasct, Double emp_porcentaje_ips, Double emp_minimo_comision, Integer emp_usuario, String emp_comision_desde, String emp_comision_hasta){
		this.emp_nro = emp_nro;
		this.emp_nombre = emp_nombre;
		this.emp_apelli = emp_apelli;
		this.emp_modalidad = emp_modalidad;
		this.emp_fechaingre = emp_fechaingre;
		this.emp_usistema = emp_usistema;
		this.emp_tele1 = emp_tele1;
		this.emp_tele2 = emp_tele2;
		this.emp_tele3 = emp_tele3;
		this.emp_domicilio = emp_domicilio;
		this.emp_nrodomi = emp_nrodomi;
		this.emp_dominum = emp_dominum;
		this.emp_edad = emp_edad;
		this.emp_sexo = emp_sexo;
		this.emp_estcivil = emp_estcivil;
		this.emp_profesion = emp_profesion;
		this.emp_sena = emp_sena;
		this.emp_estempleado = emp_estempleado;
		this.emp_sueldo = emp_sueldo;
		this.emp_horaxdia = emp_horaxdia;
		this.emp_horaextra = emp_horaextra;
		this.emp_fercosto = emp_fercosto;
		this.emp_comitipo = emp_comitipo;
		this.emp_prectipo = emp_prectipo;
		this.emp_ventacont = emp_ventacont;
		this.emp_ventacred = emp_ventacred;
		this.emp_cobrador = emp_cobrador;
		this.emp_observacion = emp_observacion;
		this.emp_moneda = emp_moneda;
		this.emp_comivcont = emp_comivcont;
		this.emp_comivcred = emp_comivcred;
		this.emp_numced = emp_numced;
		this.emp_ruc = emp_ruc;
		this.emp_cargo = emp_cargo;
		this.emp_fechanaci = emp_fechanaci;
		this.emp_borrado = emp_borrado;
		this.emp_comivpracont = emp_comivpracont;
		this.emp_comivpracred = emp_comivpracred;
		this.emp_comivfijocont = emp_comivfijocont;
		this.emp_comivfijocred = emp_comivfijocred;
		this.emp_turn8 = emp_turn8;
		this.emp_turn7 = emp_turn7;
		this.emp_turn6 = emp_turn6;
		this.emp_turn5 = emp_turn5;
		this.emp_turn4 = emp_turn4;
		this.emp_turn3 = emp_turn3;
		this.emp_turn2 = emp_turn2;
		this.emp_turn1 = emp_turn1;
		this.emp_porcxutilidad = emp_porcxutilidad;
		this.emp_comisionista = emp_comisionista;
		this.emp_sueldoxdia = emp_sueldoxdia;
		this.emp_tipsalario = emp_tipsalario;
		this.emp_tiptrabajo = emp_tiptrabajo;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.emp_porcentaje_ips = emp_porcentaje_ips;
		this.emp_minimo_comision = emp_minimo_comision;
		this.emp_usuario = emp_usuario;
		this.emp_comision_desde = emp_comision_desde;
		this.emp_comision_hasta = emp_comision_hasta;
	}
	public Empleado(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Empleado{"+", emp_nro=" + emp_nro+", emp_nombre=" + emp_nombre+", emp_apelli=" + emp_apelli+", emp_modalidad=" + emp_modalidad+", emp_fechaingre=" + emp_fechaingre+", emp_usistema=" + emp_usistema+", emp_tele1=" + emp_tele1+", emp_tele2=" + emp_tele2+", emp_tele3=" + emp_tele3+", emp_domicilio=" + emp_domicilio+", emp_nrodomi=" + emp_nrodomi+", emp_dominum=" + emp_dominum+", emp_edad=" + emp_edad+", emp_sexo=" + emp_sexo+", emp_estcivil=" + emp_estcivil+", emp_profesion=" + emp_profesion+", emp_sena=" + emp_sena+", emp_estempleado=" + emp_estempleado+", emp_sueldo=" + emp_sueldo+", emp_horaxdia=" + emp_horaxdia+", emp_horaextra=" + emp_horaextra+", emp_fercosto=" + emp_fercosto+", emp_comitipo=" + emp_comitipo+", emp_prectipo=" + emp_prectipo+", emp_ventacont=" + emp_ventacont+", emp_ventacred=" + emp_ventacred+", emp_cobrador=" + emp_cobrador+", emp_observacion=" + emp_observacion+", emp_moneda=" + emp_moneda+", emp_comivcont=" + emp_comivcont+", emp_comivcred=" + emp_comivcred+", emp_numced=" + emp_numced+", emp_ruc=" + emp_ruc+", emp_cargo=" + emp_cargo+", emp_fechanaci=" + emp_fechanaci+", emp_borrado=" + emp_borrado+", emp_comivpracont=" + emp_comivpracont+", emp_comivpracred=" + emp_comivpracred+", emp_comivfijocont=" + emp_comivfijocont+", emp_comivfijocred=" + emp_comivfijocred+", emp_turn8=" + emp_turn8+", emp_turn7=" + emp_turn7+", emp_turn6=" + emp_turn6+", emp_turn5=" + emp_turn5+", emp_turn4=" + emp_turn4+", emp_turn3=" + emp_turn3+", emp_turn2=" + emp_turn2+", emp_turn1=" + emp_turn1+", emp_porcxutilidad=" + emp_porcxutilidad+", emp_comisionista=" + emp_comisionista+", emp_sueldoxdia=" + emp_sueldoxdia+", emp_tipsalario=" + emp_tipsalario+", emp_tiptrabajo=" + emp_tiptrabajo+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", emp_porcentaje_ips=" + emp_porcentaje_ips+", emp_minimo_comision=" + emp_minimo_comision+", emp_usuario=" + emp_usuario+", emp_comision_desde=" + emp_comision_desde+", emp_comision_hasta=" + emp_comision_hasta+"}";

	}
	public Integer getEmp_nro(){
		return emp_nro;
	}
	public void setEmp_nro(Integer emp_nro){
		this.emp_nro = emp_nro;
	}
	public String getEmp_nombre(){
		return emp_nombre;
	}
	public void setEmp_nombre(String emp_nombre){
		this.emp_nombre = emp_nombre;
	}
	public String getEmp_apelli(){
		return emp_apelli;
	}
	public void setEmp_apelli(String emp_apelli){
		this.emp_apelli = emp_apelli;
	}
	public Integer getEmp_modalidad(){
		return emp_modalidad;
	}
	public void setEmp_modalidad(Integer emp_modalidad){
		this.emp_modalidad = emp_modalidad;
	}
	public String getEmp_fechaingre(){
		return emp_fechaingre;
	}
	public void setEmp_fechaingre(String emp_fechaingre){
		this.emp_fechaingre = emp_fechaingre;
	}
	public Integer getEmp_usistema(){
		return emp_usistema;
	}
	public void setEmp_usistema(Integer emp_usistema){
		this.emp_usistema = emp_usistema;
	}
	public String getEmp_tele1(){
		return emp_tele1;
	}
	public void setEmp_tele1(String emp_tele1){
		this.emp_tele1 = emp_tele1;
	}
	public String getEmp_tele2(){
		return emp_tele2;
	}
	public void setEmp_tele2(String emp_tele2){
		this.emp_tele2 = emp_tele2;
	}
	public String getEmp_tele3(){
		return emp_tele3;
	}
	public void setEmp_tele3(String emp_tele3){
		this.emp_tele3 = emp_tele3;
	}
	public String getEmp_domicilio(){
		return emp_domicilio;
	}
	public void setEmp_domicilio(String emp_domicilio){
		this.emp_domicilio = emp_domicilio;
	}
	public String getEmp_nrodomi(){
		return emp_nrodomi;
	}
	public void setEmp_nrodomi(String emp_nrodomi){
		this.emp_nrodomi = emp_nrodomi;
	}
	public String getEmp_dominum(){
		return emp_dominum;
	}
	public void setEmp_dominum(String emp_dominum){
		this.emp_dominum = emp_dominum;
	}
	public Integer getEmp_edad(){
		return emp_edad;
	}
	public void setEmp_edad(Integer emp_edad){
		this.emp_edad = emp_edad;
	}
	public Integer getEmp_sexo(){
		return emp_sexo;
	}
	public void setEmp_sexo(Integer emp_sexo){
		this.emp_sexo = emp_sexo;
	}
	public Integer getEmp_estcivil(){
		return emp_estcivil;
	}
	public void setEmp_estcivil(Integer emp_estcivil){
		this.emp_estcivil = emp_estcivil;
	}
	public String getEmp_profesion(){
		return emp_profesion;
	}
	public void setEmp_profesion(String emp_profesion){
		this.emp_profesion = emp_profesion;
	}
	public String getEmp_sena(){
		return emp_sena;
	}
	public void setEmp_sena(String emp_sena){
		this.emp_sena = emp_sena;
	}
	public Integer getEmp_estempleado(){
		return emp_estempleado;
	}
	public void setEmp_estempleado(Integer emp_estempleado){
		this.emp_estempleado = emp_estempleado;
	}
	public Double getEmp_sueldo(){
		return emp_sueldo;
	}
	public void setEmp_sueldo(Double emp_sueldo){
		this.emp_sueldo = emp_sueldo;
	}
	public Double getEmp_horaxdia(){
		return emp_horaxdia;
	}
	public void setEmp_horaxdia(Double emp_horaxdia){
		this.emp_horaxdia = emp_horaxdia;
	}
	public Double getEmp_horaextra(){
		return emp_horaextra;
	}
	public void setEmp_horaextra(Double emp_horaextra){
		this.emp_horaextra = emp_horaextra;
	}
	public Double getEmp_fercosto(){
		return emp_fercosto;
	}
	public void setEmp_fercosto(Double emp_fercosto){
		this.emp_fercosto = emp_fercosto;
	}
	public Integer getEmp_comitipo(){
		return emp_comitipo;
	}
	public void setEmp_comitipo(Integer emp_comitipo){
		this.emp_comitipo = emp_comitipo;
	}
	public Integer getEmp_prectipo(){
		return emp_prectipo;
	}
	public void setEmp_prectipo(Integer emp_prectipo){
		this.emp_prectipo = emp_prectipo;
	}
	public Integer getEmp_ventacont(){
		return emp_ventacont;
	}
	public void setEmp_ventacont(Integer emp_ventacont){
		this.emp_ventacont = emp_ventacont;
	}
	public Integer getEmp_ventacred(){
		return emp_ventacred;
	}
	public void setEmp_ventacred(Integer emp_ventacred){
		this.emp_ventacred = emp_ventacred;
	}
	public Integer getEmp_cobrador(){
		return emp_cobrador;
	}
	public void setEmp_cobrador(Integer emp_cobrador){
		this.emp_cobrador = emp_cobrador;
	}
	public String getEmp_observacion(){
		return emp_observacion;
	}
	public void setEmp_observacion(String emp_observacion){
		this.emp_observacion = emp_observacion;
	}
	public Integer getEmp_moneda(){
		return emp_moneda;
	}
	public void setEmp_moneda(Integer emp_moneda){
		this.emp_moneda = emp_moneda;
	}
	public Double getEmp_comivcont(){
		return emp_comivcont;
	}
	public void setEmp_comivcont(Double emp_comivcont){
		this.emp_comivcont = emp_comivcont;
	}
	public Double getEmp_comivcred(){
		return emp_comivcred;
	}
	public void setEmp_comivcred(Double emp_comivcred){
		this.emp_comivcred = emp_comivcred;
	}
	public String getEmp_numced(){
		return emp_numced;
	}
	public void setEmp_numced(String emp_numced){
		this.emp_numced = emp_numced;
	}
	public String getEmp_ruc(){
		return emp_ruc;
	}
	public void setEmp_ruc(String emp_ruc){
		this.emp_ruc = emp_ruc;
	}
	public String getEmp_cargo(){
		return emp_cargo;
	}
	public void setEmp_cargo(String emp_cargo){
		this.emp_cargo = emp_cargo;
	}
	public String getEmp_fechanaci(){
		return emp_fechanaci;
	}
	public void setEmp_fechanaci(String emp_fechanaci){
		this.emp_fechanaci = emp_fechanaci;
	}
	public Integer getEmp_borrado(){
		return emp_borrado;
	}
	public void setEmp_borrado(Integer emp_borrado){
		this.emp_borrado = emp_borrado;
	}
	public Double getEmp_comivpracont(){
		return emp_comivpracont;
	}
	public void setEmp_comivpracont(Double emp_comivpracont){
		this.emp_comivpracont = emp_comivpracont;
	}
	public Double getEmp_comivpracred(){
		return emp_comivpracred;
	}
	public void setEmp_comivpracred(Double emp_comivpracred){
		this.emp_comivpracred = emp_comivpracred;
	}
	public Double getEmp_comivfijocont(){
		return emp_comivfijocont;
	}
	public void setEmp_comivfijocont(Double emp_comivfijocont){
		this.emp_comivfijocont = emp_comivfijocont;
	}
	public Double getEmp_comivfijocred(){
		return emp_comivfijocred;
	}
	public void setEmp_comivfijocred(Double emp_comivfijocred){
		this.emp_comivfijocred = emp_comivfijocred;
	}
	public String getEmp_turn8(){
		return emp_turn8;
	}
	public void setEmp_turn8(String emp_turn8){
		this.emp_turn8 = emp_turn8;
	}
	public String getEmp_turn7(){
		return emp_turn7;
	}
	public void setEmp_turn7(String emp_turn7){
		this.emp_turn7 = emp_turn7;
	}
	public String getEmp_turn6(){
		return emp_turn6;
	}
	public void setEmp_turn6(String emp_turn6){
		this.emp_turn6 = emp_turn6;
	}
	public String getEmp_turn5(){
		return emp_turn5;
	}
	public void setEmp_turn5(String emp_turn5){
		this.emp_turn5 = emp_turn5;
	}
	public String getEmp_turn4(){
		return emp_turn4;
	}
	public void setEmp_turn4(String emp_turn4){
		this.emp_turn4 = emp_turn4;
	}
	public String getEmp_turn3(){
		return emp_turn3;
	}
	public void setEmp_turn3(String emp_turn3){
		this.emp_turn3 = emp_turn3;
	}
	public String getEmp_turn2(){
		return emp_turn2;
	}
	public void setEmp_turn2(String emp_turn2){
		this.emp_turn2 = emp_turn2;
	}
	public String getEmp_turn1(){
		return emp_turn1;
	}
	public void setEmp_turn1(String emp_turn1){
		this.emp_turn1 = emp_turn1;
	}
	public Double getEmp_porcxutilidad(){
		return emp_porcxutilidad;
	}
	public void setEmp_porcxutilidad(Double emp_porcxutilidad){
		this.emp_porcxutilidad = emp_porcxutilidad;
	}
	public Integer getEmp_comisionista(){
		return emp_comisionista;
	}
	public void setEmp_comisionista(Integer emp_comisionista){
		this.emp_comisionista = emp_comisionista;
	}
	public Double getEmp_sueldoxdia(){
		return emp_sueldoxdia;
	}
	public void setEmp_sueldoxdia(Double emp_sueldoxdia){
		this.emp_sueldoxdia = emp_sueldoxdia;
	}
	public Integer getEmp_tipsalario(){
		return emp_tipsalario;
	}
	public void setEmp_tipsalario(Integer emp_tipsalario){
		this.emp_tipsalario = emp_tipsalario;
	}
	public Integer getEmp_tiptrabajo(){
		return emp_tiptrabajo;
	}
	public void setEmp_tiptrabajo(Integer emp_tiptrabajo){
		this.emp_tiptrabajo = emp_tiptrabajo;
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
	public Double getEmp_porcentaje_ips(){
		return emp_porcentaje_ips;
	}
	public void setEmp_porcentaje_ips(Double emp_porcentaje_ips){
		this.emp_porcentaje_ips = emp_porcentaje_ips;
	}
	public Double getEmp_minimo_comision(){
		return emp_minimo_comision;
	}
	public void setEmp_minimo_comision(Double emp_minimo_comision){
		this.emp_minimo_comision = emp_minimo_comision;
	}
	public Integer getEmp_usuario(){
		return emp_usuario;
	}
	public void setEmp_usuario(Integer emp_usuario){
		this.emp_usuario = emp_usuario;
	}
	public String getEmp_comision_desde(){
		return emp_comision_desde;
	}
	public void setEmp_comision_desde(String emp_comision_desde){
		this.emp_comision_desde = emp_comision_desde;
	}
	public String getEmp_comision_hasta(){
		return emp_comision_hasta;
	}
	public void setEmp_comision_hasta(String emp_comision_hasta){
		this.emp_comision_hasta = emp_comision_hasta;
	}

}