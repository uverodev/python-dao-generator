package modelo;

public class Ajuste{
	Integer aj_nro;
	Integer aj_ubicacion;
	String aj_codprod;
	Integer aj_motivo;
	Double aj_pcompra;
	Double aj_pventamin;
	Double aj_pventabas;
	Double aj_pventamay;
	Double aj_pventacred;
	String aj_fecha;
	Double aj_cantidad;
	Double aj_stock;
	Integer aj_usuario;
	Integer aj_borrado;
	Integer aj_deposito1;
	Integer aj_deposito2;
	String aj_lote;
	Integer aj_deposito3;
	String aj_observacion;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	String aj_vencimiento;
	Integer aj_inventario;
	Double aj_costo_promedio;

	public Ajuste(Integer aj_nro, Integer aj_ubicacion, String aj_codprod, Integer aj_motivo, Double aj_pcompra, Double aj_pventamin, Double aj_pventabas, Double aj_pventamay, Double aj_pventacred, String aj_fecha, Double aj_cantidad, Double aj_stock, Integer aj_usuario, Integer aj_borrado, Integer aj_deposito1, Integer aj_deposito2, String aj_lote, Integer aj_deposito3, String aj_observacion, String fechasct, Integer usuariosct, String maquinasct, String aj_vencimiento, Integer aj_inventario, Double aj_costo_promedio){
		this.aj_nro = aj_nro;
		this.aj_ubicacion = aj_ubicacion;
		this.aj_codprod = aj_codprod;
		this.aj_motivo = aj_motivo;
		this.aj_pcompra = aj_pcompra;
		this.aj_pventamin = aj_pventamin;
		this.aj_pventabas = aj_pventabas;
		this.aj_pventamay = aj_pventamay;
		this.aj_pventacred = aj_pventacred;
		this.aj_fecha = aj_fecha;
		this.aj_cantidad = aj_cantidad;
		this.aj_stock = aj_stock;
		this.aj_usuario = aj_usuario;
		this.aj_borrado = aj_borrado;
		this.aj_deposito1 = aj_deposito1;
		this.aj_deposito2 = aj_deposito2;
		this.aj_lote = aj_lote;
		this.aj_deposito3 = aj_deposito3;
		this.aj_observacion = aj_observacion;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.aj_vencimiento = aj_vencimiento;
		this.aj_inventario = aj_inventario;
		this.aj_costo_promedio = aj_costo_promedio;
	}
	public Ajuste(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ajuste{"+", aj_nro=" + aj_nro+", aj_ubicacion=" + aj_ubicacion+", aj_codprod=" + aj_codprod+", aj_motivo=" + aj_motivo+", aj_pcompra=" + aj_pcompra+", aj_pventamin=" + aj_pventamin+", aj_pventabas=" + aj_pventabas+", aj_pventamay=" + aj_pventamay+", aj_pventacred=" + aj_pventacred+", aj_fecha=" + aj_fecha+", aj_cantidad=" + aj_cantidad+", aj_stock=" + aj_stock+", aj_usuario=" + aj_usuario+", aj_borrado=" + aj_borrado+", aj_deposito1=" + aj_deposito1+", aj_deposito2=" + aj_deposito2+", aj_lote=" + aj_lote+", aj_deposito3=" + aj_deposito3+", aj_observacion=" + aj_observacion+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", aj_vencimiento=" + aj_vencimiento+", aj_inventario=" + aj_inventario+", aj_costo_promedio=" + aj_costo_promedio+"}";

	}
	public Integer getAj_nro(){
		return aj_nro;
	}
	public void setAj_nro(Integer aj_nro){
		this.aj_nro = aj_nro;
	}
	public Integer getAj_ubicacion(){
		return aj_ubicacion;
	}
	public void setAj_ubicacion(Integer aj_ubicacion){
		this.aj_ubicacion = aj_ubicacion;
	}
	public String getAj_codprod(){
		return aj_codprod;
	}
	public void setAj_codprod(String aj_codprod){
		this.aj_codprod = aj_codprod;
	}
	public Integer getAj_motivo(){
		return aj_motivo;
	}
	public void setAj_motivo(Integer aj_motivo){
		this.aj_motivo = aj_motivo;
	}
	public Double getAj_pcompra(){
		return aj_pcompra;
	}
	public void setAj_pcompra(Double aj_pcompra){
		this.aj_pcompra = aj_pcompra;
	}
	public Double getAj_pventamin(){
		return aj_pventamin;
	}
	public void setAj_pventamin(Double aj_pventamin){
		this.aj_pventamin = aj_pventamin;
	}
	public Double getAj_pventabas(){
		return aj_pventabas;
	}
	public void setAj_pventabas(Double aj_pventabas){
		this.aj_pventabas = aj_pventabas;
	}
	public Double getAj_pventamay(){
		return aj_pventamay;
	}
	public void setAj_pventamay(Double aj_pventamay){
		this.aj_pventamay = aj_pventamay;
	}
	public Double getAj_pventacred(){
		return aj_pventacred;
	}
	public void setAj_pventacred(Double aj_pventacred){
		this.aj_pventacred = aj_pventacred;
	}
	public String getAj_fecha(){
		return aj_fecha;
	}
	public void setAj_fecha(String aj_fecha){
		this.aj_fecha = aj_fecha;
	}
	public Double getAj_cantidad(){
		return aj_cantidad;
	}
	public void setAj_cantidad(Double aj_cantidad){
		this.aj_cantidad = aj_cantidad;
	}
	public Double getAj_stock(){
		return aj_stock;
	}
	public void setAj_stock(Double aj_stock){
		this.aj_stock = aj_stock;
	}
	public Integer getAj_usuario(){
		return aj_usuario;
	}
	public void setAj_usuario(Integer aj_usuario){
		this.aj_usuario = aj_usuario;
	}
	public Integer getAj_borrado(){
		return aj_borrado;
	}
	public void setAj_borrado(Integer aj_borrado){
		this.aj_borrado = aj_borrado;
	}
	public Integer getAj_deposito1(){
		return aj_deposito1;
	}
	public void setAj_deposito1(Integer aj_deposito1){
		this.aj_deposito1 = aj_deposito1;
	}
	public Integer getAj_deposito2(){
		return aj_deposito2;
	}
	public void setAj_deposito2(Integer aj_deposito2){
		this.aj_deposito2 = aj_deposito2;
	}
	public String getAj_lote(){
		return aj_lote;
	}
	public void setAj_lote(String aj_lote){
		this.aj_lote = aj_lote;
	}
	public Integer getAj_deposito3(){
		return aj_deposito3;
	}
	public void setAj_deposito3(Integer aj_deposito3){
		this.aj_deposito3 = aj_deposito3;
	}
	public String getAj_observacion(){
		return aj_observacion;
	}
	public void setAj_observacion(String aj_observacion){
		this.aj_observacion = aj_observacion;
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
	public String getAj_vencimiento(){
		return aj_vencimiento;
	}
	public void setAj_vencimiento(String aj_vencimiento){
		this.aj_vencimiento = aj_vencimiento;
	}
	public Integer getAj_inventario(){
		return aj_inventario;
	}
	public void setAj_inventario(Integer aj_inventario){
		this.aj_inventario = aj_inventario;
	}
	public Double getAj_costo_promedio(){
		return aj_costo_promedio;
	}
	public void setAj_costo_promedio(Double aj_costo_promedio){
		this.aj_costo_promedio = aj_costo_promedio;
	}

}