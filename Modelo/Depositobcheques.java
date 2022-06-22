package modelo;

public class Depositobcheques{
	Integer dbc_codigo;
	String dbc_numcheque;
	String dbc_banco;
	Double dbc_monto;
	Integer dbc_nrodepositob;
	String dbc_fecha;

	public Depositobcheques(Integer dbc_codigo, String dbc_numcheque, String dbc_banco, Double dbc_monto, Integer dbc_nrodepositob, String dbc_fecha){
		this.dbc_codigo = dbc_codigo;
		this.dbc_numcheque = dbc_numcheque;
		this.dbc_banco = dbc_banco;
		this.dbc_monto = dbc_monto;
		this.dbc_nrodepositob = dbc_nrodepositob;
		this.dbc_fecha = dbc_fecha;
	}
	public Depositobcheques(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Depositobcheques{"+", dbc_codigo=" + dbc_codigo+", dbc_numcheque=" + dbc_numcheque+", dbc_banco=" + dbc_banco+", dbc_monto=" + dbc_monto+", dbc_nrodepositob=" + dbc_nrodepositob+", dbc_fecha=" + dbc_fecha+"}";

	}
	public Integer getDbc_codigo(){
		return dbc_codigo;
	}
	public void setDbc_codigo(Integer dbc_codigo){
		this.dbc_codigo = dbc_codigo;
	}
	public String getDbc_numcheque(){
		return dbc_numcheque;
	}
	public void setDbc_numcheque(String dbc_numcheque){
		this.dbc_numcheque = dbc_numcheque;
	}
	public String getDbc_banco(){
		return dbc_banco;
	}
	public void setDbc_banco(String dbc_banco){
		this.dbc_banco = dbc_banco;
	}
	public Double getDbc_monto(){
		return dbc_monto;
	}
	public void setDbc_monto(Double dbc_monto){
		this.dbc_monto = dbc_monto;
	}
	public Integer getDbc_nrodepositob(){
		return dbc_nrodepositob;
	}
	public void setDbc_nrodepositob(Integer dbc_nrodepositob){
		this.dbc_nrodepositob = dbc_nrodepositob;
	}
	public String getDbc_fecha(){
		return dbc_fecha;
	}
	public void setDbc_fecha(String dbc_fecha){
		this.dbc_fecha = dbc_fecha;
	}

}