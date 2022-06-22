package modelo;

public class Prod_marca{
	Integer m_codigo;
	String m_fecha;
	String m_descripcion;
	Integer m_borrado;

	public Prod_marca(Integer m_codigo, String m_fecha, String m_descripcion, Integer m_borrado){
		this.m_codigo = m_codigo;
		this.m_fecha = m_fecha;
		this.m_descripcion = m_descripcion;
		this.m_borrado = m_borrado;
	}
	public Prod_marca(Integer id){
		this.id = id;
	}
	@Override
	public String toString() {
		return "Prod_marca{"+", m_codigo=" + m_codigo+", m_fecha=" + m_fecha+", m_descripcion=" + m_descripcion+", m_borrado=" + m_borrado+"}";

	}
	public Integer getM_codigo(){
		return m_codigo;
	}
	public void setM_codigo(Integer m_codigo){
		this.m_codigo = m_codigo;
	}
	public String getM_fecha(){
		return m_fecha;
	}
	public void setM_fecha(String m_fecha){
		this.m_fecha = m_fecha;
	}
	public String getM_descripcion(){
		return m_descripcion;
	}
	public void setM_descripcion(String m_descripcion){
		this.m_descripcion = m_descripcion;
	}
	public Integer getM_borrado(){
		return m_borrado;
	}
	public void setM_borrado(Integer m_borrado){
		this.m_borrado = m_borrado;
	}

}