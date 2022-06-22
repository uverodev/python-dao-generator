package modelo;

public class Presupuestocab{
	Integer pr_nro;
	String pr_fecha;
	String pr_hora;
	String pr_cliente;
	Double pr_total;
	Double pr_descuento;
	Double pr_dolar;
	Double pr_real;
	Double pr_peso;
	Double pr_euro;
	Integer pr_vendedor;
	Integer pr_usuario;
	Double pr_totalitem;
	String fechasct;
	Integer usuariosct;
	String maquinasct;
	Integer pr_tipo;
	String pr_nro_pedido;
	String pr_fecha_prevista;
	Integer pr_estado;

	public Presupuestocab(Integer pr_nro, String pr_fecha, String pr_hora, String pr_cliente, Double pr_total, Double pr_descuento, Double pr_dolar, Double pr_real, Double pr_peso, Double pr_euro, Integer pr_vendedor, Integer pr_usuario, Double pr_totalitem, String fechasct, Integer usuariosct, String maquinasct, Integer pr_tipo, String pr_nro_pedido, String pr_fecha_prevista, Integer pr_estado){
		this.pr_nro = pr_nro;
		this.pr_fecha = pr_fecha;
		this.pr_hora = pr_hora;
		this.pr_cliente = pr_cliente;
		this.pr_total = pr_total;
		this.pr_descuento = pr_descuento;
		this.pr_dolar = pr_dolar;
		this.pr_real = pr_real;
		this.pr_peso = pr_peso;
		this.pr_euro = pr_euro;
		this.pr_vendedor = pr_vendedor;
		this.pr_usuario = pr_usuario;
		this.pr_totalitem = pr_totalitem;
		this.fechasct = fechasct;
		this.usuariosct = usuariosct;
		this.maquinasct = maquinasct;
		this.pr_tipo = pr_tipo;
		this.pr_nro_pedido = pr_nro_pedido;
		this.pr_fecha_prevista = pr_fecha_prevista;
		this.pr_estado = pr_estado;
	}
	public Presupuestocab(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Presupuestocab{"+", pr_nro=" + pr_nro+", pr_fecha=" + pr_fecha+", pr_hora=" + pr_hora+", pr_cliente=" + pr_cliente+", pr_total=" + pr_total+", pr_descuento=" + pr_descuento+", pr_dolar=" + pr_dolar+", pr_real=" + pr_real+", pr_peso=" + pr_peso+", pr_euro=" + pr_euro+", pr_vendedor=" + pr_vendedor+", pr_usuario=" + pr_usuario+", pr_totalitem=" + pr_totalitem+", fechasct=" + fechasct+", usuariosct=" + usuariosct+", maquinasct=" + maquinasct+", pr_tipo=" + pr_tipo+", pr_nro_pedido=" + pr_nro_pedido+", pr_fecha_prevista=" + pr_fecha_prevista+", pr_estado=" + pr_estado+"}";

	}
	public Integer getPr_nro(){
		return pr_nro;
	}
	public void setPr_nro(Integer pr_nro){
		this.pr_nro = pr_nro;
	}
	public String getPr_fecha(){
		return pr_fecha;
	}
	public void setPr_fecha(String pr_fecha){
		this.pr_fecha = pr_fecha;
	}
	public String getPr_hora(){
		return pr_hora;
	}
	public void setPr_hora(String pr_hora){
		this.pr_hora = pr_hora;
	}
	public String getPr_cliente(){
		return pr_cliente;
	}
	public void setPr_cliente(String pr_cliente){
		this.pr_cliente = pr_cliente;
	}
	public Double getPr_total(){
		return pr_total;
	}
	public void setPr_total(Double pr_total){
		this.pr_total = pr_total;
	}
	public Double getPr_descuento(){
		return pr_descuento;
	}
	public void setPr_descuento(Double pr_descuento){
		this.pr_descuento = pr_descuento;
	}
	public Double getPr_dolar(){
		return pr_dolar;
	}
	public void setPr_dolar(Double pr_dolar){
		this.pr_dolar = pr_dolar;
	}
	public Double getPr_real(){
		return pr_real;
	}
	public void setPr_real(Double pr_real){
		this.pr_real = pr_real;
	}
	public Double getPr_peso(){
		return pr_peso;
	}
	public void setPr_peso(Double pr_peso){
		this.pr_peso = pr_peso;
	}
	public Double getPr_euro(){
		return pr_euro;
	}
	public void setPr_euro(Double pr_euro){
		this.pr_euro = pr_euro;
	}
	public Integer getPr_vendedor(){
		return pr_vendedor;
	}
	public void setPr_vendedor(Integer pr_vendedor){
		this.pr_vendedor = pr_vendedor;
	}
	public Integer getPr_usuario(){
		return pr_usuario;
	}
	public void setPr_usuario(Integer pr_usuario){
		this.pr_usuario = pr_usuario;
	}
	public Double getPr_totalitem(){
		return pr_totalitem;
	}
	public void setPr_totalitem(Double pr_totalitem){
		this.pr_totalitem = pr_totalitem;
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
	public Integer getPr_tipo(){
		return pr_tipo;
	}
	public void setPr_tipo(Integer pr_tipo){
		this.pr_tipo = pr_tipo;
	}
	public String getPr_nro_pedido(){
		return pr_nro_pedido;
	}
	public void setPr_nro_pedido(String pr_nro_pedido){
		this.pr_nro_pedido = pr_nro_pedido;
	}
	public String getPr_fecha_prevista(){
		return pr_fecha_prevista;
	}
	public void setPr_fecha_prevista(String pr_fecha_prevista){
		this.pr_fecha_prevista = pr_fecha_prevista;
	}
	public Integer getPr_estado(){
		return pr_estado;
	}
	public void setPr_estado(Integer pr_estado){
		this.pr_estado = pr_estado;
	}

}