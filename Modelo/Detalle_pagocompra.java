package modelo;

public class Detalle_pagocompra{
	Integer pagc_nro;
	Integer pagc_nrocompra;
	Double pagc_montoabonado;
	Double pagc_cargosextras;
	Integer pagc_nropago;
	String pagc_fecha;
	Integer pagc_borrado;
	Integer pagc_tipooperacion;

	public Detalle_pagocompra(Integer pagc_nro, Integer pagc_nrocompra, Double pagc_montoabonado, Double pagc_cargosextras, Integer pagc_nropago, String pagc_fecha, Integer pagc_borrado, Integer pagc_tipooperacion){
		this.pagc_nro = pagc_nro;
		this.pagc_nrocompra = pagc_nrocompra;
		this.pagc_montoabonado = pagc_montoabonado;
		this.pagc_cargosextras = pagc_cargosextras;
		this.pagc_nropago = pagc_nropago;
		this.pagc_fecha = pagc_fecha;
		this.pagc_borrado = pagc_borrado;
		this.pagc_tipooperacion = pagc_tipooperacion;
	}
	public Detalle_pagocompra(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detalle_pagocompra{"+", pagc_nro=" + pagc_nro+", pagc_nrocompra=" + pagc_nrocompra+", pagc_montoabonado=" + pagc_montoabonado+", pagc_cargosextras=" + pagc_cargosextras+", pagc_nropago=" + pagc_nropago+", pagc_fecha=" + pagc_fecha+", pagc_borrado=" + pagc_borrado+", pagc_tipooperacion=" + pagc_tipooperacion+"}";

	}
	public Integer getPagc_nro(){
		return pagc_nro;
	}
	public void setPagc_nro(Integer pagc_nro){
		this.pagc_nro = pagc_nro;
	}
	public Integer getPagc_nrocompra(){
		return pagc_nrocompra;
	}
	public void setPagc_nrocompra(Integer pagc_nrocompra){
		this.pagc_nrocompra = pagc_nrocompra;
	}
	public Double getPagc_montoabonado(){
		return pagc_montoabonado;
	}
	public void setPagc_montoabonado(Double pagc_montoabonado){
		this.pagc_montoabonado = pagc_montoabonado;
	}
	public Double getPagc_cargosextras(){
		return pagc_cargosextras;
	}
	public void setPagc_cargosextras(Double pagc_cargosextras){
		this.pagc_cargosextras = pagc_cargosextras;
	}
	public Integer getPagc_nropago(){
		return pagc_nropago;
	}
	public void setPagc_nropago(Integer pagc_nropago){
		this.pagc_nropago = pagc_nropago;
	}
	public String getPagc_fecha(){
		return pagc_fecha;
	}
	public void setPagc_fecha(String pagc_fecha){
		this.pagc_fecha = pagc_fecha;
	}
	public Integer getPagc_borrado(){
		return pagc_borrado;
	}
	public void setPagc_borrado(Integer pagc_borrado){
		this.pagc_borrado = pagc_borrado;
	}
	public Integer getPagc_tipooperacion(){
		return pagc_tipooperacion;
	}
	public void setPagc_tipooperacion(Integer pagc_tipooperacion){
		this.pagc_tipooperacion = pagc_tipooperacion;
	}

}