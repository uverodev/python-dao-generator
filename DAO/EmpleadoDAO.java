package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Empleado;
import vista.*;

public class EmpleadoDAO extends Thread {
	private Empleado empl;
	public ArrayList<Empleado> resultadoEmpleado;

	@Override
	public void run() {
		try{
			actualizarEmpleado("");
		} catch (Exception e) {
			System.out.println("Error al generar Empleado");
		}
		yield();
	}

	public void actualizarEmpleado(String condicion) {
		resultadoEmpleado = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  empleado " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				empl = new Empleado(
						rs.getInt("emp_nro"),
						rs.getString("emp_nombre"),
						rs.getString("emp_apelli"),
						rs.getInt("emp_modalidad"),
						rs.getString("emp_fechaingre"),
						rs.getInt("emp_usistema"),
						rs.getString("emp_tele1"),
						rs.getString("emp_tele2"),
						rs.getString("emp_tele3"),
						rs.getString("emp_domicilio"),
						rs.getString("emp_nrodomi"),
						rs.getString("emp_dominum"),
						rs.getInt("emp_edad"),
						rs.getInt("emp_sexo"),
						rs.getInt("emp_estcivil"),
						rs.getString("emp_profesion"),
						rs.getString("emp_sena"),
						rs.getInt("emp_estempleado"),
						rs.getDouble("emp_sueldo"),
						rs.getDouble("emp_horaxdia"),
						rs.getDouble("emp_horaextra"),
						rs.getDouble("emp_fercosto"),
						rs.getInt("emp_comitipo"),
						rs.getInt("emp_prectipo"),
						rs.getInt("emp_ventacont"),
						rs.getInt("emp_ventacred"),
						rs.getInt("emp_cobrador"),
						rs.getString("emp_observacion"),
						rs.getInt("emp_moneda"),
						rs.getDouble("emp_comivcont"),
						rs.getDouble("emp_comivcred"),
						rs.getString("emp_numced"),
						rs.getString("emp_ruc"),
						rs.getString("emp_cargo"),
						rs.getString("emp_fechanaci"),
						rs.getInt("emp_borrado"),
						rs.getDouble("emp_comivpracont"),
						rs.getDouble("emp_comivpracred"),
						rs.getDouble("emp_comivfijocont"),
						rs.getDouble("emp_comivfijocred"),
						rs.getString("emp_turn8"),
						rs.getString("emp_turn7"),
						rs.getString("emp_turn6"),
						rs.getString("emp_turn5"),
						rs.getString("emp_turn4"),
						rs.getString("emp_turn3"),
						rs.getString("emp_turn2"),
						rs.getString("emp_turn1"),
						rs.getDouble("emp_porcxutilidad"),
						rs.getInt("emp_comisionista"),
						rs.getDouble("emp_sueldoxdia"),
						rs.getInt("emp_tipsalario"),
						rs.getInt("emp_tiptrabajo"),
						rs.getString("fechasct"),
						rs.getInt("usuariosct"),
						rs.getString("maquinasct"),
						rs.getDouble("emp_porcentaje_ips"),
						rs.getDouble("emp_minimo_comision"),
						rs.getInt("emp_usuario"),
						rs.getString("emp_comision_desde"),
						rs.getString("emp_comision_hasta")
			);
			arr.add(empl);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Empleado empl) {
		String q = " insert into empleado( emp_nombre,  emp_apelli,  emp_modalidad,  emp_fechaingre,  emp_usistema,  emp_tele1,  emp_tele2,  emp_tele3,  emp_domicilio,  emp_nrodomi,  emp_dominum,  emp_edad,  emp_sexo,  emp_estcivil,  emp_profesion,  emp_sena,  emp_estempleado,  emp_sueldo,  emp_horaxdia,  emp_horaextra,  emp_fercosto,  emp_comitipo,  emp_prectipo,  emp_ventacont,  emp_ventacred,  emp_cobrador,  emp_observacion,  emp_moneda,  emp_comivcont,  emp_comivcred,  emp_numced,  emp_ruc,  emp_cargo,  emp_fechanaci,  emp_borrado,  emp_comivpracont,  emp_comivpracred,  emp_comivfijocont,  emp_comivfijocred,  emp_turn8,  emp_turn7,  emp_turn6,  emp_turn5,  emp_turn4,  emp_turn3,  emp_turn2,  emp_turn1,  emp_porcxutilidad,  emp_comisionista,  emp_sueldoxdia,  emp_tipsalario,  emp_tiptrabajo,  fechasct,  usuariosct,  maquinasct,  emp_porcentaje_ips,  emp_minimo_comision,  emp_usuario,  emp_comision_desde,  emp_comision_hasta) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, empl.getEmp_nombre());
			ps.setString(2, empl.getEmp_apelli());
			ps.setInt(3, empl.getEmp_modalidad());
			ps.setString(4, empl.getEmp_fechaingre());
			ps.setInt(5, empl.getEmp_usistema());
			ps.setString(6, empl.getEmp_tele1());
			ps.setString(7, empl.getEmp_tele2());
			ps.setString(8, empl.getEmp_tele3());
			ps.setString(9, empl.getEmp_domicilio());
			ps.setString(10, empl.getEmp_nrodomi());
			ps.setString(11, empl.getEmp_dominum());
			ps.setInt(12, empl.getEmp_edad());
			ps.setInt(13, empl.getEmp_sexo());
			ps.setInt(14, empl.getEmp_estcivil());
			ps.setString(15, empl.getEmp_profesion());
			ps.setString(16, empl.getEmp_sena());
			ps.setInt(17, empl.getEmp_estempleado());
			ps.setDouble(18, empl.getEmp_sueldo());
			ps.setDouble(19, empl.getEmp_horaxdia());
			ps.setDouble(20, empl.getEmp_horaextra());
			ps.setDouble(21, empl.getEmp_fercosto());
			ps.setInt(22, empl.getEmp_comitipo());
			ps.setInt(23, empl.getEmp_prectipo());
			ps.setInt(24, empl.getEmp_ventacont());
			ps.setInt(25, empl.getEmp_ventacred());
			ps.setInt(26, empl.getEmp_cobrador());
			ps.setString(27, empl.getEmp_observacion());
			ps.setInt(28, empl.getEmp_moneda());
			ps.setDouble(29, empl.getEmp_comivcont());
			ps.setDouble(30, empl.getEmp_comivcred());
			ps.setString(31, empl.getEmp_numced());
			ps.setString(32, empl.getEmp_ruc());
			ps.setString(33, empl.getEmp_cargo());
			ps.setString(34, empl.getEmp_fechanaci());
			ps.setInt(35, empl.getEmp_borrado());
			ps.setDouble(36, empl.getEmp_comivpracont());
			ps.setDouble(37, empl.getEmp_comivpracred());
			ps.setDouble(38, empl.getEmp_comivfijocont());
			ps.setDouble(39, empl.getEmp_comivfijocred());
			ps.setString(40, empl.getEmp_turn8());
			ps.setString(41, empl.getEmp_turn7());
			ps.setString(42, empl.getEmp_turn6());
			ps.setString(43, empl.getEmp_turn5());
			ps.setString(44, empl.getEmp_turn4());
			ps.setString(45, empl.getEmp_turn3());
			ps.setString(46, empl.getEmp_turn2());
			ps.setString(47, empl.getEmp_turn1());
			ps.setDouble(48, empl.getEmp_porcxutilidad());
			ps.setInt(49, empl.getEmp_comisionista());
			ps.setDouble(50, empl.getEmp_sueldoxdia());
			ps.setInt(51, empl.getEmp_tipsalario());
			ps.setInt(52, empl.getEmp_tiptrabajo());
			ps.setString(53, empl.getFechasct());
			ps.setInt(54, empl.getUsuariosct());
			ps.setString(55, empl.getMaquinasct());
			ps.setDouble(56, empl.getEmp_porcentaje_ips());
			ps.setDouble(57, empl.getEmp_minimo_comision());
			ps.setInt(58, empl.getEmp_usuario());
			ps.setString(59, empl.getEmp_comision_desde());
			ps.setString(60, empl.getEmp_comision_hasta());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Empleado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Empleado empl) {
		String q = " update empleado set  emp_nombre=?,  emp_apelli=?,  emp_modalidad=?,  emp_fechaingre=?,  emp_usistema=?,  emp_tele1=?,  emp_tele2=?,  emp_tele3=?,  emp_domicilio=?,  emp_nrodomi=?,  emp_dominum=?,  emp_edad=?,  emp_sexo=?,  emp_estcivil=?,  emp_profesion=?,  emp_sena=?,  emp_estempleado=?,  emp_sueldo=?,  emp_horaxdia=?,  emp_horaextra=?,  emp_fercosto=?,  emp_comitipo=?,  emp_prectipo=?,  emp_ventacont=?,  emp_ventacred=?,  emp_cobrador=?,  emp_observacion=?,  emp_moneda=?,  emp_comivcont=?,  emp_comivcred=?,  emp_numced=?,  emp_ruc=?,  emp_cargo=?,  emp_fechanaci=?,  emp_borrado=?,  emp_comivpracont=?,  emp_comivpracred=?,  emp_comivfijocont=?,  emp_comivfijocred=?,  emp_turn8=?,  emp_turn7=?,  emp_turn6=?,  emp_turn5=?,  emp_turn4=?,  emp_turn3=?,  emp_turn2=?,  emp_turn1=?,  emp_porcxutilidad=?,  emp_comisionista=?,  emp_sueldoxdia=?,  emp_tipsalario=?,  emp_tiptrabajo=?,  fechasct=?,  usuariosct=?,  maquinasct=?,  emp_porcentaje_ips=?,  emp_minimo_comision=?,  emp_usuario=?,  emp_comision_desde=?,  emp_comision_hasta=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, empl.getEmp_nombre());
			ps.setString(2, empl.getEmp_apelli());
			ps.setInt(3, empl.getEmp_modalidad());
			ps.setString(4, empl.getEmp_fechaingre());
			ps.setInt(5, empl.getEmp_usistema());
			ps.setString(6, empl.getEmp_tele1());
			ps.setString(7, empl.getEmp_tele2());
			ps.setString(8, empl.getEmp_tele3());
			ps.setString(9, empl.getEmp_domicilio());
			ps.setString(10, empl.getEmp_nrodomi());
			ps.setString(11, empl.getEmp_dominum());
			ps.setInt(12, empl.getEmp_edad());
			ps.setInt(13, empl.getEmp_sexo());
			ps.setInt(14, empl.getEmp_estcivil());
			ps.setString(15, empl.getEmp_profesion());
			ps.setString(16, empl.getEmp_sena());
			ps.setInt(17, empl.getEmp_estempleado());
			ps.setDouble(18, empl.getEmp_sueldo());
			ps.setDouble(19, empl.getEmp_horaxdia());
			ps.setDouble(20, empl.getEmp_horaextra());
			ps.setDouble(21, empl.getEmp_fercosto());
			ps.setInt(22, empl.getEmp_comitipo());
			ps.setInt(23, empl.getEmp_prectipo());
			ps.setInt(24, empl.getEmp_ventacont());
			ps.setInt(25, empl.getEmp_ventacred());
			ps.setInt(26, empl.getEmp_cobrador());
			ps.setString(27, empl.getEmp_observacion());
			ps.setInt(28, empl.getEmp_moneda());
			ps.setDouble(29, empl.getEmp_comivcont());
			ps.setDouble(30, empl.getEmp_comivcred());
			ps.setString(31, empl.getEmp_numced());
			ps.setString(32, empl.getEmp_ruc());
			ps.setString(33, empl.getEmp_cargo());
			ps.setString(34, empl.getEmp_fechanaci());
			ps.setInt(35, empl.getEmp_borrado());
			ps.setDouble(36, empl.getEmp_comivpracont());
			ps.setDouble(37, empl.getEmp_comivpracred());
			ps.setDouble(38, empl.getEmp_comivfijocont());
			ps.setDouble(39, empl.getEmp_comivfijocred());
			ps.setString(40, empl.getEmp_turn8());
			ps.setString(41, empl.getEmp_turn7());
			ps.setString(42, empl.getEmp_turn6());
			ps.setString(43, empl.getEmp_turn5());
			ps.setString(44, empl.getEmp_turn4());
			ps.setString(45, empl.getEmp_turn3());
			ps.setString(46, empl.getEmp_turn2());
			ps.setString(47, empl.getEmp_turn1());
			ps.setDouble(48, empl.getEmp_porcxutilidad());
			ps.setInt(49, empl.getEmp_comisionista());
			ps.setDouble(50, empl.getEmp_sueldoxdia());
			ps.setInt(51, empl.getEmp_tipsalario());
			ps.setInt(52, empl.getEmp_tiptrabajo());
			ps.setString(53, empl.getFechasct());
			ps.setInt(54, empl.getUsuariosct());
			ps.setString(55, empl.getMaquinasct());
			ps.setDouble(56, empl.getEmp_porcentaje_ips());
			ps.setDouble(57, empl.getEmp_minimo_comision());
			ps.setInt(58, empl.getEmp_usuario());
			ps.setString(59, empl.getEmp_comision_desde());
			ps.setString(60, empl.getEmp_comision_hasta());
			ps.setInt(61, empl.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Empleado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Empleado empl) {
		String q = " delete from empleado where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, empl.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Empleado", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}