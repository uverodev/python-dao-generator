package modelo;

public class Arqcaja{
	Integer arq_nro;
	Integer arq_usuario;
	String arq_numcaja;
	String arq_fecha;
	String arq_fechacarga;
	String arq_hora;
	Double arq_cajinicial;
	Double arq_totdescredito;
	Double arq_totvencontado;
	Double arq_totdescontado;
	Double arq_totchedia;
	Double arq_totnota;
	Double arq_tottarcredito;
	Double arq_comcrepagado;
	Double arq_tottardebito;
	Double arq_comcontado;
	Double arq_faccrecobrado;
	Double arq_totgasto;
	Double arq_totvencredito;
	Double arq_totingreso;
	Double arq_totegreso;
	Double arq_efecaja;
	Integer arq_borrado;
	Double arq_totcheplazo;
	Double arq_totefecajguarani;
	Double arq_totefecajdolar;
	Double arq_totefecajreal;
	Double arq_totefecajpeso;
	Double arq_totefecajeuro;
	Double arq_tototrosingresos;
	Double arq_totentregacobrada;
	Double arq_totcuotacobrada;
	Double arq_totnotaemitida;
	Double arq_tototrasentradas;
	Double arq_totsalon;
	Double arq_totgreenfee;
	Double arq_totcarrito;
	Double arq_totpiscina;
	Double arq_totocupacion;
	Double arq_totconsumicion;
	Double arq_totgiro;
	Double arq_totdepbancario;
	Double arq_totaladelanto;
	Double arq_totalsalario;
	Double arq_totinguarani;
	Double arq_totindolar;
	Double arq_totinreal;
	Double arq_totinpeso;
	Double arq_totineuro;
	Double arq_totdifguarani;
	Double arq_totdifdolar;
	Double arq_totdifreal;
	Double arq_totdifpeso;
	Double arq_totdifeuro;
	Double arq_totredondeos;
	Double arq_monto_contado;

	public Arqcaja(Integer arq_nro, Integer arq_usuario, String arq_numcaja, String arq_fecha, String arq_fechacarga, String arq_hora, Double arq_cajinicial, Double arq_totdescredito, Double arq_totvencontado, Double arq_totdescontado, Double arq_totchedia, Double arq_totnota, Double arq_tottarcredito, Double arq_comcrepagado, Double arq_tottardebito, Double arq_comcontado, Double arq_faccrecobrado, Double arq_totgasto, Double arq_totvencredito, Double arq_totingreso, Double arq_totegreso, Double arq_efecaja, Integer arq_borrado, Double arq_totcheplazo, Double arq_totefecajguarani, Double arq_totefecajdolar, Double arq_totefecajreal, Double arq_totefecajpeso, Double arq_totefecajeuro, Double arq_tototrosingresos, Double arq_totentregacobrada, Double arq_totcuotacobrada, Double arq_totnotaemitida, Double arq_tototrasentradas, Double arq_totsalon, Double arq_totgreenfee, Double arq_totcarrito, Double arq_totpiscina, Double arq_totocupacion, Double arq_totconsumicion, Double arq_totgiro, Double arq_totdepbancario, Double arq_totaladelanto, Double arq_totalsalario, Double arq_totinguarani, Double arq_totindolar, Double arq_totinreal, Double arq_totinpeso, Double arq_totineuro, Double arq_totdifguarani, Double arq_totdifdolar, Double arq_totdifreal, Double arq_totdifpeso, Double arq_totdifeuro, Double arq_totredondeos, Double arq_monto_contado){
		this.arq_nro = arq_nro;
		this.arq_usuario = arq_usuario;
		this.arq_numcaja = arq_numcaja;
		this.arq_fecha = arq_fecha;
		this.arq_fechacarga = arq_fechacarga;
		this.arq_hora = arq_hora;
		this.arq_cajinicial = arq_cajinicial;
		this.arq_totdescredito = arq_totdescredito;
		this.arq_totvencontado = arq_totvencontado;
		this.arq_totdescontado = arq_totdescontado;
		this.arq_totchedia = arq_totchedia;
		this.arq_totnota = arq_totnota;
		this.arq_tottarcredito = arq_tottarcredito;
		this.arq_comcrepagado = arq_comcrepagado;
		this.arq_tottardebito = arq_tottardebito;
		this.arq_comcontado = arq_comcontado;
		this.arq_faccrecobrado = arq_faccrecobrado;
		this.arq_totgasto = arq_totgasto;
		this.arq_totvencredito = arq_totvencredito;
		this.arq_totingreso = arq_totingreso;
		this.arq_totegreso = arq_totegreso;
		this.arq_efecaja = arq_efecaja;
		this.arq_borrado = arq_borrado;
		this.arq_totcheplazo = arq_totcheplazo;
		this.arq_totefecajguarani = arq_totefecajguarani;
		this.arq_totefecajdolar = arq_totefecajdolar;
		this.arq_totefecajreal = arq_totefecajreal;
		this.arq_totefecajpeso = arq_totefecajpeso;
		this.arq_totefecajeuro = arq_totefecajeuro;
		this.arq_tototrosingresos = arq_tototrosingresos;
		this.arq_totentregacobrada = arq_totentregacobrada;
		this.arq_totcuotacobrada = arq_totcuotacobrada;
		this.arq_totnotaemitida = arq_totnotaemitida;
		this.arq_tototrasentradas = arq_tototrasentradas;
		this.arq_totsalon = arq_totsalon;
		this.arq_totgreenfee = arq_totgreenfee;
		this.arq_totcarrito = arq_totcarrito;
		this.arq_totpiscina = arq_totpiscina;
		this.arq_totocupacion = arq_totocupacion;
		this.arq_totconsumicion = arq_totconsumicion;
		this.arq_totgiro = arq_totgiro;
		this.arq_totdepbancario = arq_totdepbancario;
		this.arq_totaladelanto = arq_totaladelanto;
		this.arq_totalsalario = arq_totalsalario;
		this.arq_totinguarani = arq_totinguarani;
		this.arq_totindolar = arq_totindolar;
		this.arq_totinreal = arq_totinreal;
		this.arq_totinpeso = arq_totinpeso;
		this.arq_totineuro = arq_totineuro;
		this.arq_totdifguarani = arq_totdifguarani;
		this.arq_totdifdolar = arq_totdifdolar;
		this.arq_totdifreal = arq_totdifreal;
		this.arq_totdifpeso = arq_totdifpeso;
		this.arq_totdifeuro = arq_totdifeuro;
		this.arq_totredondeos = arq_totredondeos;
		this.arq_monto_contado = arq_monto_contado;
	}
	public Arqcaja(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Arqcaja{"+", arq_nro=" + arq_nro+", arq_usuario=" + arq_usuario+", arq_numcaja=" + arq_numcaja+", arq_fecha=" + arq_fecha+", arq_fechacarga=" + arq_fechacarga+", arq_hora=" + arq_hora+", arq_cajinicial=" + arq_cajinicial+", arq_totdescredito=" + arq_totdescredito+", arq_totvencontado=" + arq_totvencontado+", arq_totdescontado=" + arq_totdescontado+", arq_totchedia=" + arq_totchedia+", arq_totnota=" + arq_totnota+", arq_tottarcredito=" + arq_tottarcredito+", arq_comcrepagado=" + arq_comcrepagado+", arq_tottardebito=" + arq_tottardebito+", arq_comcontado=" + arq_comcontado+", arq_faccrecobrado=" + arq_faccrecobrado+", arq_totgasto=" + arq_totgasto+", arq_totvencredito=" + arq_totvencredito+", arq_totingreso=" + arq_totingreso+", arq_totegreso=" + arq_totegreso+", arq_efecaja=" + arq_efecaja+", arq_borrado=" + arq_borrado+", arq_totcheplazo=" + arq_totcheplazo+", arq_totefecajguarani=" + arq_totefecajguarani+", arq_totefecajdolar=" + arq_totefecajdolar+", arq_totefecajreal=" + arq_totefecajreal+", arq_totefecajpeso=" + arq_totefecajpeso+", arq_totefecajeuro=" + arq_totefecajeuro+", arq_tototrosingresos=" + arq_tototrosingresos+", arq_totentregacobrada=" + arq_totentregacobrada+", arq_totcuotacobrada=" + arq_totcuotacobrada+", arq_totnotaemitida=" + arq_totnotaemitida+", arq_tototrasentradas=" + arq_tototrasentradas+", arq_totsalon=" + arq_totsalon+", arq_totgreenfee=" + arq_totgreenfee+", arq_totcarrito=" + arq_totcarrito+", arq_totpiscina=" + arq_totpiscina+", arq_totocupacion=" + arq_totocupacion+", arq_totconsumicion=" + arq_totconsumicion+", arq_totgiro=" + arq_totgiro+", arq_totdepbancario=" + arq_totdepbancario+", arq_totaladelanto=" + arq_totaladelanto+", arq_totalsalario=" + arq_totalsalario+", arq_totinguarani=" + arq_totinguarani+", arq_totindolar=" + arq_totindolar+", arq_totinreal=" + arq_totinreal+", arq_totinpeso=" + arq_totinpeso+", arq_totineuro=" + arq_totineuro+", arq_totdifguarani=" + arq_totdifguarani+", arq_totdifdolar=" + arq_totdifdolar+", arq_totdifreal=" + arq_totdifreal+", arq_totdifpeso=" + arq_totdifpeso+", arq_totdifeuro=" + arq_totdifeuro+", arq_totredondeos=" + arq_totredondeos+", arq_monto_contado=" + arq_monto_contado+"}";

	}
	public Integer getArq_nro(){
		return arq_nro;
	}
	public void setArq_nro(Integer arq_nro){
		this.arq_nro = arq_nro;
	}
	public Integer getArq_usuario(){
		return arq_usuario;
	}
	public void setArq_usuario(Integer arq_usuario){
		this.arq_usuario = arq_usuario;
	}
	public String getArq_numcaja(){
		return arq_numcaja;
	}
	public void setArq_numcaja(String arq_numcaja){
		this.arq_numcaja = arq_numcaja;
	}
	public String getArq_fecha(){
		return arq_fecha;
	}
	public void setArq_fecha(String arq_fecha){
		this.arq_fecha = arq_fecha;
	}
	public String getArq_fechacarga(){
		return arq_fechacarga;
	}
	public void setArq_fechacarga(String arq_fechacarga){
		this.arq_fechacarga = arq_fechacarga;
	}
	public String getArq_hora(){
		return arq_hora;
	}
	public void setArq_hora(String arq_hora){
		this.arq_hora = arq_hora;
	}
	public Double getArq_cajinicial(){
		return arq_cajinicial;
	}
	public void setArq_cajinicial(Double arq_cajinicial){
		this.arq_cajinicial = arq_cajinicial;
	}
	public Double getArq_totdescredito(){
		return arq_totdescredito;
	}
	public void setArq_totdescredito(Double arq_totdescredito){
		this.arq_totdescredito = arq_totdescredito;
	}
	public Double getArq_totvencontado(){
		return arq_totvencontado;
	}
	public void setArq_totvencontado(Double arq_totvencontado){
		this.arq_totvencontado = arq_totvencontado;
	}
	public Double getArq_totdescontado(){
		return arq_totdescontado;
	}
	public void setArq_totdescontado(Double arq_totdescontado){
		this.arq_totdescontado = arq_totdescontado;
	}
	public Double getArq_totchedia(){
		return arq_totchedia;
	}
	public void setArq_totchedia(Double arq_totchedia){
		this.arq_totchedia = arq_totchedia;
	}
	public Double getArq_totnota(){
		return arq_totnota;
	}
	public void setArq_totnota(Double arq_totnota){
		this.arq_totnota = arq_totnota;
	}
	public Double getArq_tottarcredito(){
		return arq_tottarcredito;
	}
	public void setArq_tottarcredito(Double arq_tottarcredito){
		this.arq_tottarcredito = arq_tottarcredito;
	}
	public Double getArq_comcrepagado(){
		return arq_comcrepagado;
	}
	public void setArq_comcrepagado(Double arq_comcrepagado){
		this.arq_comcrepagado = arq_comcrepagado;
	}
	public Double getArq_tottardebito(){
		return arq_tottardebito;
	}
	public void setArq_tottardebito(Double arq_tottardebito){
		this.arq_tottardebito = arq_tottardebito;
	}
	public Double getArq_comcontado(){
		return arq_comcontado;
	}
	public void setArq_comcontado(Double arq_comcontado){
		this.arq_comcontado = arq_comcontado;
	}
	public Double getArq_faccrecobrado(){
		return arq_faccrecobrado;
	}
	public void setArq_faccrecobrado(Double arq_faccrecobrado){
		this.arq_faccrecobrado = arq_faccrecobrado;
	}
	public Double getArq_totgasto(){
		return arq_totgasto;
	}
	public void setArq_totgasto(Double arq_totgasto){
		this.arq_totgasto = arq_totgasto;
	}
	public Double getArq_totvencredito(){
		return arq_totvencredito;
	}
	public void setArq_totvencredito(Double arq_totvencredito){
		this.arq_totvencredito = arq_totvencredito;
	}
	public Double getArq_totingreso(){
		return arq_totingreso;
	}
	public void setArq_totingreso(Double arq_totingreso){
		this.arq_totingreso = arq_totingreso;
	}
	public Double getArq_totegreso(){
		return arq_totegreso;
	}
	public void setArq_totegreso(Double arq_totegreso){
		this.arq_totegreso = arq_totegreso;
	}
	public Double getArq_efecaja(){
		return arq_efecaja;
	}
	public void setArq_efecaja(Double arq_efecaja){
		this.arq_efecaja = arq_efecaja;
	}
	public Integer getArq_borrado(){
		return arq_borrado;
	}
	public void setArq_borrado(Integer arq_borrado){
		this.arq_borrado = arq_borrado;
	}
	public Double getArq_totcheplazo(){
		return arq_totcheplazo;
	}
	public void setArq_totcheplazo(Double arq_totcheplazo){
		this.arq_totcheplazo = arq_totcheplazo;
	}
	public Double getArq_totefecajguarani(){
		return arq_totefecajguarani;
	}
	public void setArq_totefecajguarani(Double arq_totefecajguarani){
		this.arq_totefecajguarani = arq_totefecajguarani;
	}
	public Double getArq_totefecajdolar(){
		return arq_totefecajdolar;
	}
	public void setArq_totefecajdolar(Double arq_totefecajdolar){
		this.arq_totefecajdolar = arq_totefecajdolar;
	}
	public Double getArq_totefecajreal(){
		return arq_totefecajreal;
	}
	public void setArq_totefecajreal(Double arq_totefecajreal){
		this.arq_totefecajreal = arq_totefecajreal;
	}
	public Double getArq_totefecajpeso(){
		return arq_totefecajpeso;
	}
	public void setArq_totefecajpeso(Double arq_totefecajpeso){
		this.arq_totefecajpeso = arq_totefecajpeso;
	}
	public Double getArq_totefecajeuro(){
		return arq_totefecajeuro;
	}
	public void setArq_totefecajeuro(Double arq_totefecajeuro){
		this.arq_totefecajeuro = arq_totefecajeuro;
	}
	public Double getArq_tototrosingresos(){
		return arq_tototrosingresos;
	}
	public void setArq_tototrosingresos(Double arq_tototrosingresos){
		this.arq_tototrosingresos = arq_tototrosingresos;
	}
	public Double getArq_totentregacobrada(){
		return arq_totentregacobrada;
	}
	public void setArq_totentregacobrada(Double arq_totentregacobrada){
		this.arq_totentregacobrada = arq_totentregacobrada;
	}
	public Double getArq_totcuotacobrada(){
		return arq_totcuotacobrada;
	}
	public void setArq_totcuotacobrada(Double arq_totcuotacobrada){
		this.arq_totcuotacobrada = arq_totcuotacobrada;
	}
	public Double getArq_totnotaemitida(){
		return arq_totnotaemitida;
	}
	public void setArq_totnotaemitida(Double arq_totnotaemitida){
		this.arq_totnotaemitida = arq_totnotaemitida;
	}
	public Double getArq_tototrasentradas(){
		return arq_tototrasentradas;
	}
	public void setArq_tototrasentradas(Double arq_tototrasentradas){
		this.arq_tototrasentradas = arq_tototrasentradas;
	}
	public Double getArq_totsalon(){
		return arq_totsalon;
	}
	public void setArq_totsalon(Double arq_totsalon){
		this.arq_totsalon = arq_totsalon;
	}
	public Double getArq_totgreenfee(){
		return arq_totgreenfee;
	}
	public void setArq_totgreenfee(Double arq_totgreenfee){
		this.arq_totgreenfee = arq_totgreenfee;
	}
	public Double getArq_totcarrito(){
		return arq_totcarrito;
	}
	public void setArq_totcarrito(Double arq_totcarrito){
		this.arq_totcarrito = arq_totcarrito;
	}
	public Double getArq_totpiscina(){
		return arq_totpiscina;
	}
	public void setArq_totpiscina(Double arq_totpiscina){
		this.arq_totpiscina = arq_totpiscina;
	}
	public Double getArq_totocupacion(){
		return arq_totocupacion;
	}
	public void setArq_totocupacion(Double arq_totocupacion){
		this.arq_totocupacion = arq_totocupacion;
	}
	public Double getArq_totconsumicion(){
		return arq_totconsumicion;
	}
	public void setArq_totconsumicion(Double arq_totconsumicion){
		this.arq_totconsumicion = arq_totconsumicion;
	}
	public Double getArq_totgiro(){
		return arq_totgiro;
	}
	public void setArq_totgiro(Double arq_totgiro){
		this.arq_totgiro = arq_totgiro;
	}
	public Double getArq_totdepbancario(){
		return arq_totdepbancario;
	}
	public void setArq_totdepbancario(Double arq_totdepbancario){
		this.arq_totdepbancario = arq_totdepbancario;
	}
	public Double getArq_totaladelanto(){
		return arq_totaladelanto;
	}
	public void setArq_totaladelanto(Double arq_totaladelanto){
		this.arq_totaladelanto = arq_totaladelanto;
	}
	public Double getArq_totalsalario(){
		return arq_totalsalario;
	}
	public void setArq_totalsalario(Double arq_totalsalario){
		this.arq_totalsalario = arq_totalsalario;
	}
	public Double getArq_totinguarani(){
		return arq_totinguarani;
	}
	public void setArq_totinguarani(Double arq_totinguarani){
		this.arq_totinguarani = arq_totinguarani;
	}
	public Double getArq_totindolar(){
		return arq_totindolar;
	}
	public void setArq_totindolar(Double arq_totindolar){
		this.arq_totindolar = arq_totindolar;
	}
	public Double getArq_totinreal(){
		return arq_totinreal;
	}
	public void setArq_totinreal(Double arq_totinreal){
		this.arq_totinreal = arq_totinreal;
	}
	public Double getArq_totinpeso(){
		return arq_totinpeso;
	}
	public void setArq_totinpeso(Double arq_totinpeso){
		this.arq_totinpeso = arq_totinpeso;
	}
	public Double getArq_totineuro(){
		return arq_totineuro;
	}
	public void setArq_totineuro(Double arq_totineuro){
		this.arq_totineuro = arq_totineuro;
	}
	public Double getArq_totdifguarani(){
		return arq_totdifguarani;
	}
	public void setArq_totdifguarani(Double arq_totdifguarani){
		this.arq_totdifguarani = arq_totdifguarani;
	}
	public Double getArq_totdifdolar(){
		return arq_totdifdolar;
	}
	public void setArq_totdifdolar(Double arq_totdifdolar){
		this.arq_totdifdolar = arq_totdifdolar;
	}
	public Double getArq_totdifreal(){
		return arq_totdifreal;
	}
	public void setArq_totdifreal(Double arq_totdifreal){
		this.arq_totdifreal = arq_totdifreal;
	}
	public Double getArq_totdifpeso(){
		return arq_totdifpeso;
	}
	public void setArq_totdifpeso(Double arq_totdifpeso){
		this.arq_totdifpeso = arq_totdifpeso;
	}
	public Double getArq_totdifeuro(){
		return arq_totdifeuro;
	}
	public void setArq_totdifeuro(Double arq_totdifeuro){
		this.arq_totdifeuro = arq_totdifeuro;
	}
	public Double getArq_totredondeos(){
		return arq_totredondeos;
	}
	public void setArq_totredondeos(Double arq_totredondeos){
		this.arq_totredondeos = arq_totredondeos;
	}
	public Double getArq_monto_contado(){
		return arq_monto_contado;
	}
	public void setArq_monto_contado(Double arq_monto_contado){
		this.arq_monto_contado = arq_monto_contado;
	}

}