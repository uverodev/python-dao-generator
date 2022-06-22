package modelo;

public class Detallefacturacionlibre{
	Integer df_codigo;
	Object df_codprod;
	Double df_cantidad;
	Double df_precio;
	Integer df_borrado;
	Integer df_codigocabecera;
	Double df_totalexenta;
	Double df_total5;
	Double df_total10;
	Object df_detalle;

	public Detallefacturacionlibre(Integer df_codigo, Object df_codprod, Double df_cantidad, Double df_precio, Integer df_borrado, Integer df_codigocabecera, Double df_totalexenta, Double df_total5, Double df_total10, Object df_detalle){
		this.df_codigo = df_codigo;
		this.df_codprod = df_codprod;
		this.df_cantidad = df_cantidad;
		this.df_precio = df_precio;
		this.df_borrado = df_borrado;
		this.df_codigocabecera = df_codigocabecera;
		this.df_totalexenta = df_totalexenta;
		this.df_total5 = df_total5;
		this.df_total10 = df_total10;
		this.df_detalle = df_detalle;
	}
	public Detallefacturacionlibre(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Detallefacturacionlibre{"+", df_codigo=" + df_codigo+", df_codprod=" + df_codprod+", df_cantidad=" + df_cantidad+", df_precio=" + df_precio+", df_borrado=" + df_borrado+", df_codigocabecera=" + df_codigocabecera+", df_totalexenta=" + df_totalexenta+", df_total5=" + df_total5+", df_total10=" + df_total10+", df_detalle=" + df_detalle+"}";

	}
	public Integer getDf_codigo(){
		return df_codigo;
	}
	public void setDf_codigo(Integer df_codigo){
		this.df_codigo = df_codigo;
	}
	public Object getDf_codprod(){
		return df_codprod;
	}
	public void setDf_codprod(Object df_codprod){
		this.df_codprod = df_codprod;
	}
	public Double getDf_cantidad(){
		return df_cantidad;
	}
	public void setDf_cantidad(Double df_cantidad){
		this.df_cantidad = df_cantidad;
	}
	public Double getDf_precio(){
		return df_precio;
	}
	public void setDf_precio(Double df_precio){
		this.df_precio = df_precio;
	}
	public Integer getDf_borrado(){
		return df_borrado;
	}
	public void setDf_borrado(Integer df_borrado){
		this.df_borrado = df_borrado;
	}
	public Integer getDf_codigocabecera(){
		return df_codigocabecera;
	}
	public void setDf_codigocabecera(Integer df_codigocabecera){
		this.df_codigocabecera = df_codigocabecera;
	}
	public Double getDf_totalexenta(){
		return df_totalexenta;
	}
	public void setDf_totalexenta(Double df_totalexenta){
		this.df_totalexenta = df_totalexenta;
	}
	public Double getDf_total5(){
		return df_total5;
	}
	public void setDf_total5(Double df_total5){
		this.df_total5 = df_total5;
	}
	public Double getDf_total10(){
		return df_total10;
	}
	public void setDf_total10(Double df_total10){
		this.df_total10 = df_total10;
	}
	public Object getDf_detalle(){
		return df_detalle;
	}
	public void setDf_detalle(Object df_detalle){
		this.df_detalle = df_detalle;
	}

}