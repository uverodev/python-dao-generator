package modelo;

public class Detcajchica{
	Integer dcaj_nro;
	Integer dcaj_moneda;
	Double dcaj_billete;
	Double dcaj_cantidad;
	Double dcaj_monto;
	Integer dcaj_borrado;

	public Detcajchica(Integer dcaj_nro, Integer dcaj_moneda, Double dcaj_billete, Double dcaj_cantidad, Double dcaj_monto, Integer dcaj_borrado){
		this.dcaj_nro = dcaj_nro;
		this.dcaj_moneda = dcaj_moneda;
		this.dcaj_billete = dcaj_billete;
		this.dcaj_cantidad = dcaj_cantidad;
		this.dcaj_monto = dcaj_monto;
		this.dcaj_borrado = dcaj_borrado;
	}
	public Detcajchica(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detcajchica{"+", dcaj_nro=" + dcaj_nro+", dcaj_moneda=" + dcaj_moneda+", dcaj_billete=" + dcaj_billete+", dcaj_cantidad=" + dcaj_cantidad+", dcaj_monto=" + dcaj_monto+", dcaj_borrado=" + dcaj_borrado+"}";

	}
	public Integer getDcaj_nro(){
		return dcaj_nro;
	}
	public void setDcaj_nro(Integer dcaj_nro){
		this.dcaj_nro = dcaj_nro;
	}
	public Integer getDcaj_moneda(){
		return dcaj_moneda;
	}
	public void setDcaj_moneda(Integer dcaj_moneda){
		this.dcaj_moneda = dcaj_moneda;
	}
	public Double getDcaj_billete(){
		return dcaj_billete;
	}
	public void setDcaj_billete(Double dcaj_billete){
		this.dcaj_billete = dcaj_billete;
	}
	public Double getDcaj_cantidad(){
		return dcaj_cantidad;
	}
	public void setDcaj_cantidad(Double dcaj_cantidad){
		this.dcaj_cantidad = dcaj_cantidad;
	}
	public Double getDcaj_monto(){
		return dcaj_monto;
	}
	public void setDcaj_monto(Double dcaj_monto){
		this.dcaj_monto = dcaj_monto;
	}
	public Integer getDcaj_borrado(){
		return dcaj_borrado;
	}
	public void setDcaj_borrado(Integer dcaj_borrado){
		this.dcaj_borrado = dcaj_borrado;
	}

}