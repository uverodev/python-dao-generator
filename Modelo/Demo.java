package modelo;

public class Demo{
	Integer de_nro;
	Integer de_dias;
	Integer de_diaspasado;
	String de_serial;
	Integer de_habilitado;
	String de_maquina;
	String de_disco;
	String de_fecinstalacion;

	public Demo(Integer de_nro, Integer de_dias, Integer de_diaspasado, String de_serial, Integer de_habilitado, String de_maquina, String de_disco, String de_fecinstalacion){
		this.de_nro = de_nro;
		this.de_dias = de_dias;
		this.de_diaspasado = de_diaspasado;
		this.de_serial = de_serial;
		this.de_habilitado = de_habilitado;
		this.de_maquina = de_maquina;
		this.de_disco = de_disco;
		this.de_fecinstalacion = de_fecinstalacion;
	}
	public Demo(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Demo{"+", de_nro=" + de_nro+", de_dias=" + de_dias+", de_diaspasado=" + de_diaspasado+", de_serial=" + de_serial+", de_habilitado=" + de_habilitado+", de_maquina=" + de_maquina+", de_disco=" + de_disco+", de_fecinstalacion=" + de_fecinstalacion+"}";

	}
	public Integer getDe_nro(){
		return de_nro;
	}
	public void setDe_nro(Integer de_nro){
		this.de_nro = de_nro;
	}
	public Integer getDe_dias(){
		return de_dias;
	}
	public void setDe_dias(Integer de_dias){
		this.de_dias = de_dias;
	}
	public Integer getDe_diaspasado(){
		return de_diaspasado;
	}
	public void setDe_diaspasado(Integer de_diaspasado){
		this.de_diaspasado = de_diaspasado;
	}
	public String getDe_serial(){
		return de_serial;
	}
	public void setDe_serial(String de_serial){
		this.de_serial = de_serial;
	}
	public Integer getDe_habilitado(){
		return de_habilitado;
	}
	public void setDe_habilitado(Integer de_habilitado){
		this.de_habilitado = de_habilitado;
	}
	public String getDe_maquina(){
		return de_maquina;
	}
	public void setDe_maquina(String de_maquina){
		this.de_maquina = de_maquina;
	}
	public String getDe_disco(){
		return de_disco;
	}
	public void setDe_disco(String de_disco){
		this.de_disco = de_disco;
	}
	public String getDe_fecinstalacion(){
		return de_fecinstalacion;
	}
	public void setDe_fecinstalacion(String de_fecinstalacion){
		this.de_fecinstalacion = de_fecinstalacion;
	}

}