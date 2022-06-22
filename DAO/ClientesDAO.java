package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Clientes;
import vista.*;

public class ClientesDAO extends Thread {
	private Clientes clie;
	public ArrayList<Clientes> resultadoClientes;

	@Override
	public void run() {
		try{
			actualizarClientes("");
		} catch (Exception e) {
			System.out.println("Error al generar Clientes");
		}
		yield();
	}

	public void actualizarClientes(String condicion) {
		resultadoClientes = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  clientes " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				clie = new Clientes(
						rs.getInt("cli_cod"),
						rs.getInt("cli_codaso"),
						rs.getInt("cli_aso"),
						rs.getInt("cli_asosal"),
						rs.getString("cli_nombre"),
						rs.getString("cli_apelli"),
						rs.getString("cli_cedula"),
						rs.getString("cli_direc"),
						rs.getString("cli_tel"),
						rs.getString("cli_telab"),
						rs.getInt("cli_nacion"),
						rs.getString("cli_ruc"),
						rs.getString("cli_lug"),
						rs.getInt("cli_tipo"),
						rs.getString("cli_obs"),
						rs.getDouble("cli_creant"),
						rs.getDouble("cli_credit"),
						rs.getDouble("cli_deusal"),
						rs.getDouble("cli_sal"),
						rs.getInt("cli_dv"),
						rs.getString("cli_esposa"),
						rs.getString("cli_esdir"),
						rs.getString("cli_estel"),
						rs.getInt("cli_esci"),
						rs.getString("cli_fecre"),
						rs.getDouble("cli_acucre"),
						rs.getString("cli_correo"),
						rs.getString("cli_naci"),
						rs.getString("cli_foto"),
						rs.getInt("cli_zona"),
						rs.getInt("cli_vendedor"),
						rs.getInt("cli_cobrador"),
						rs.getString("cli_dircobro"),
						rs.getInt("cli_escivil"),
						rs.getString("cli_nombref1"),
						rs.getString("cli_empref1"),
						rs.getString("cli_telref1"),
						rs.getString("cli_dirref1"),
						rs.getString("cli_nombref2"),
						rs.getString("cli_empref2"),
						rs.getString("cli_telref2"),
						rs.getString("cli_dirref2"),
						rs.getString("cli_nombref3"),
						rs.getString("cli_empref3"),
						rs.getString("cli_telref3"),
						rs.getString("cli_dirref3"),
						rs.getString("cli_nombref4"),
						rs.getString("cli_empref4"),
						rs.getString("cli_telref4"),
						rs.getString("cli_dirref4"),
						rs.getInt("cli_ciudad"),
						rs.getInt("cli_edad"),
						rs.getInt("cli_cantfotos"),
						rs.getInt("cli_tipopersona"),
						rs.getInt("cli_calificacion"),
						rs.getInt("cli_borrado"),
						rs.getInt("cli_dias"),
						rs.getDouble("cli_costcuota"),
						rs.getInt("cli_tipomodalidad"),
						rs.getDouble("cli_pesoinicial"),
						rs.getString("cli_apodo"),
						rs.getString("cli_profesion"),
						rs.getInt("usuariosct"),
						rs.getString("fechasct"),
						rs.getString("maquinasct"),
						rs.getInt("cli_cantcuotasatrasadas"),
						rs.getInt("cli_tipo_cliente"),
						rs.getInt("cli_especial"),
						rs.getInt("cli_estamento")
			);
			arr.add(clie);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Clientes clie) {
		String q = " insert into clientes( cli_codaso,  cli_aso,  cli_asosal,  cli_nombre,  cli_apelli,  cli_cedula,  cli_direc,  cli_tel,  cli_telab,  cli_nacion,  cli_ruc,  cli_lug,  cli_tipo,  cli_obs,  cli_creant,  cli_credit,  cli_deusal,  cli_sal,  cli_dv,  cli_esposa,  cli_esdir,  cli_estel,  cli_esci,  cli_fecre,  cli_acucre,  cli_correo,  cli_naci,  cli_foto,  cli_zona,  cli_vendedor,  cli_cobrador,  cli_dircobro,  cli_escivil,  cli_nombref1,  cli_empref1,  cli_telref1,  cli_dirref1,  cli_nombref2,  cli_empref2,  cli_telref2,  cli_dirref2,  cli_nombref3,  cli_empref3,  cli_telref3,  cli_dirref3,  cli_nombref4,  cli_empref4,  cli_telref4,  cli_dirref4,  cli_ciudad,  cli_edad,  cli_cantfotos,  cli_tipopersona,  cli_calificacion,  cli_borrado,  cli_dias,  cli_costcuota,  cli_tipomodalidad,  cli_pesoinicial,  cli_apodo,  cli_profesion,  usuariosct,  fechasct,  maquinasct,  cli_cantcuotasatrasadas,  cli_tipo_cliente,  cli_especial,  cli_estamento) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, clie.getCli_codaso());
			ps.setInt(2, clie.getCli_aso());
			ps.setInt(3, clie.getCli_asosal());
			ps.setString(4, clie.getCli_nombre());
			ps.setString(5, clie.getCli_apelli());
			ps.setString(6, clie.getCli_cedula());
			ps.setString(7, clie.getCli_direc());
			ps.setString(8, clie.getCli_tel());
			ps.setString(9, clie.getCli_telab());
			ps.setInt(10, clie.getCli_nacion());
			ps.setString(11, clie.getCli_ruc());
			ps.setString(12, clie.getCli_lug());
			ps.setInt(13, clie.getCli_tipo());
			ps.setString(14, clie.getCli_obs());
			ps.setDouble(15, clie.getCli_creant());
			ps.setDouble(16, clie.getCli_credit());
			ps.setDouble(17, clie.getCli_deusal());
			ps.setDouble(18, clie.getCli_sal());
			ps.setInt(19, clie.getCli_dv());
			ps.setString(20, clie.getCli_esposa());
			ps.setString(21, clie.getCli_esdir());
			ps.setString(22, clie.getCli_estel());
			ps.setInt(23, clie.getCli_esci());
			ps.setString(24, clie.getCli_fecre());
			ps.setDouble(25, clie.getCli_acucre());
			ps.setString(26, clie.getCli_correo());
			ps.setString(27, clie.getCli_naci());
			ps.setString(28, clie.getCli_foto());
			ps.setInt(29, clie.getCli_zona());
			ps.setInt(30, clie.getCli_vendedor());
			ps.setInt(31, clie.getCli_cobrador());
			ps.setString(32, clie.getCli_dircobro());
			ps.setInt(33, clie.getCli_escivil());
			ps.setString(34, clie.getCli_nombref1());
			ps.setString(35, clie.getCli_empref1());
			ps.setString(36, clie.getCli_telref1());
			ps.setString(37, clie.getCli_dirref1());
			ps.setString(38, clie.getCli_nombref2());
			ps.setString(39, clie.getCli_empref2());
			ps.setString(40, clie.getCli_telref2());
			ps.setString(41, clie.getCli_dirref2());
			ps.setString(42, clie.getCli_nombref3());
			ps.setString(43, clie.getCli_empref3());
			ps.setString(44, clie.getCli_telref3());
			ps.setString(45, clie.getCli_dirref3());
			ps.setString(46, clie.getCli_nombref4());
			ps.setString(47, clie.getCli_empref4());
			ps.setString(48, clie.getCli_telref4());
			ps.setString(49, clie.getCli_dirref4());
			ps.setInt(50, clie.getCli_ciudad());
			ps.setInt(51, clie.getCli_edad());
			ps.setInt(52, clie.getCli_cantfotos());
			ps.setInt(53, clie.getCli_tipopersona());
			ps.setInt(54, clie.getCli_calificacion());
			ps.setInt(55, clie.getCli_borrado());
			ps.setInt(56, clie.getCli_dias());
			ps.setDouble(57, clie.getCli_costcuota());
			ps.setInt(58, clie.getCli_tipomodalidad());
			ps.setDouble(59, clie.getCli_pesoinicial());
			ps.setString(60, clie.getCli_apodo());
			ps.setString(61, clie.getCli_profesion());
			ps.setInt(62, clie.getUsuariosct());
			ps.setString(63, clie.getFechasct());
			ps.setString(64, clie.getMaquinasct());
			ps.setInt(65, clie.getCli_cantcuotasatrasadas());
			ps.setInt(66, clie.getCli_tipo_cliente());
			ps.setInt(67, clie.getCli_especial());
			ps.setInt(68, clie.getCli_estamento());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Clientes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Clientes clie) {
		String q = " update clientes set  cli_codaso=?,  cli_aso=?,  cli_asosal=?,  cli_nombre=?,  cli_apelli=?,  cli_cedula=?,  cli_direc=?,  cli_tel=?,  cli_telab=?,  cli_nacion=?,  cli_ruc=?,  cli_lug=?,  cli_tipo=?,  cli_obs=?,  cli_creant=?,  cli_credit=?,  cli_deusal=?,  cli_sal=?,  cli_dv=?,  cli_esposa=?,  cli_esdir=?,  cli_estel=?,  cli_esci=?,  cli_fecre=?,  cli_acucre=?,  cli_correo=?,  cli_naci=?,  cli_foto=?,  cli_zona=?,  cli_vendedor=?,  cli_cobrador=?,  cli_dircobro=?,  cli_escivil=?,  cli_nombref1=?,  cli_empref1=?,  cli_telref1=?,  cli_dirref1=?,  cli_nombref2=?,  cli_empref2=?,  cli_telref2=?,  cli_dirref2=?,  cli_nombref3=?,  cli_empref3=?,  cli_telref3=?,  cli_dirref3=?,  cli_nombref4=?,  cli_empref4=?,  cli_telref4=?,  cli_dirref4=?,  cli_ciudad=?,  cli_edad=?,  cli_cantfotos=?,  cli_tipopersona=?,  cli_calificacion=?,  cli_borrado=?,  cli_dias=?,  cli_costcuota=?,  cli_tipomodalidad=?,  cli_pesoinicial=?,  cli_apodo=?,  cli_profesion=?,  usuariosct=?,  fechasct=?,  maquinasct=?,  cli_cantcuotasatrasadas=?,  cli_tipo_cliente=?,  cli_especial=?,  cli_estamento=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, clie.getCli_codaso());
			ps.setInt(2, clie.getCli_aso());
			ps.setInt(3, clie.getCli_asosal());
			ps.setString(4, clie.getCli_nombre());
			ps.setString(5, clie.getCli_apelli());
			ps.setString(6, clie.getCli_cedula());
			ps.setString(7, clie.getCli_direc());
			ps.setString(8, clie.getCli_tel());
			ps.setString(9, clie.getCli_telab());
			ps.setInt(10, clie.getCli_nacion());
			ps.setString(11, clie.getCli_ruc());
			ps.setString(12, clie.getCli_lug());
			ps.setInt(13, clie.getCli_tipo());
			ps.setString(14, clie.getCli_obs());
			ps.setDouble(15, clie.getCli_creant());
			ps.setDouble(16, clie.getCli_credit());
			ps.setDouble(17, clie.getCli_deusal());
			ps.setDouble(18, clie.getCli_sal());
			ps.setInt(19, clie.getCli_dv());
			ps.setString(20, clie.getCli_esposa());
			ps.setString(21, clie.getCli_esdir());
			ps.setString(22, clie.getCli_estel());
			ps.setInt(23, clie.getCli_esci());
			ps.setString(24, clie.getCli_fecre());
			ps.setDouble(25, clie.getCli_acucre());
			ps.setString(26, clie.getCli_correo());
			ps.setString(27, clie.getCli_naci());
			ps.setString(28, clie.getCli_foto());
			ps.setInt(29, clie.getCli_zona());
			ps.setInt(30, clie.getCli_vendedor());
			ps.setInt(31, clie.getCli_cobrador());
			ps.setString(32, clie.getCli_dircobro());
			ps.setInt(33, clie.getCli_escivil());
			ps.setString(34, clie.getCli_nombref1());
			ps.setString(35, clie.getCli_empref1());
			ps.setString(36, clie.getCli_telref1());
			ps.setString(37, clie.getCli_dirref1());
			ps.setString(38, clie.getCli_nombref2());
			ps.setString(39, clie.getCli_empref2());
			ps.setString(40, clie.getCli_telref2());
			ps.setString(41, clie.getCli_dirref2());
			ps.setString(42, clie.getCli_nombref3());
			ps.setString(43, clie.getCli_empref3());
			ps.setString(44, clie.getCli_telref3());
			ps.setString(45, clie.getCli_dirref3());
			ps.setString(46, clie.getCli_nombref4());
			ps.setString(47, clie.getCli_empref4());
			ps.setString(48, clie.getCli_telref4());
			ps.setString(49, clie.getCli_dirref4());
			ps.setInt(50, clie.getCli_ciudad());
			ps.setInt(51, clie.getCli_edad());
			ps.setInt(52, clie.getCli_cantfotos());
			ps.setInt(53, clie.getCli_tipopersona());
			ps.setInt(54, clie.getCli_calificacion());
			ps.setInt(55, clie.getCli_borrado());
			ps.setInt(56, clie.getCli_dias());
			ps.setDouble(57, clie.getCli_costcuota());
			ps.setInt(58, clie.getCli_tipomodalidad());
			ps.setDouble(59, clie.getCli_pesoinicial());
			ps.setString(60, clie.getCli_apodo());
			ps.setString(61, clie.getCli_profesion());
			ps.setInt(62, clie.getUsuariosct());
			ps.setString(63, clie.getFechasct());
			ps.setString(64, clie.getMaquinasct());
			ps.setInt(65, clie.getCli_cantcuotasatrasadas());
			ps.setInt(66, clie.getCli_tipo_cliente());
			ps.setInt(67, clie.getCli_especial());
			ps.setInt(68, clie.getCli_estamento());
			ps.setInt(69, clie.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Clientes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Clientes clie) {
		String q = " delete from clientes where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, clie.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Clientes", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}