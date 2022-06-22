package modelo;

public class Producto_imagen{
	Integer pri_id;
	Object pri_codproducto;
	Object pri_archivo;
	Object pri_nombre;
	Object pri_nro;

	public Producto_imagen(Integer pri_id, Object pri_codproducto, Object pri_archivo, Object pri_nombre, Object pri_nro){
		this.pri_id = pri_id;
		this.pri_codproducto = pri_codproducto;
		this.pri_archivo = pri_archivo;
		this.pri_nombre = pri_nombre;
		this.pri_nro = pri_nro;
	}
	public Producto_imagen(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Producto_imagen{"+", pri_id=" + pri_id+", pri_codproducto=" + pri_codproducto+", pri_archivo=" + pri_archivo+", pri_nombre=" + pri_nombre+", pri_nro=" + pri_nro+"}";

	}
	public Integer getPri_id(){
		return pri_id;
	}
	public void setPri_id(Integer pri_id){
		this.pri_id = pri_id;
	}
	public Object getPri_codproducto(){
		return pri_codproducto;
	}
	public void setPri_codproducto(Object pri_codproducto){
		this.pri_codproducto = pri_codproducto;
	}
	public Object getPri_archivo(){
		return pri_archivo;
	}
	public void setPri_archivo(Object pri_archivo){
		this.pri_archivo = pri_archivo;
	}
	public Object getPri_nombre(){
		return pri_nombre;
	}
	public void setPri_nombre(Object pri_nombre){
		this.pri_nombre = pri_nombre;
	}
	public Object getPri_nro(){
		return pri_nro;
	}
	public void setPri_nro(Object pri_nro){
		this.pri_nro = pri_nro;
	}

}