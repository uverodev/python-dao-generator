package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Arqcaja;
import vista.*;

public class ArqcajaDAO extends Thread {
	private Arqcaja arqc;
	public ArrayList<Arqcaja> resultadoArqcaja;

	@Override
	public void run() {
		try{
			actualizarArqcaja("");
		} catch (Exception e) {
			System.out.println("Error al generar Arqcaja");
		}
		yield();
	}

	public void actualizarArqcaja(String condicion) {
		resultadoArqcaja = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  arqcaja " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				arqc = new Arqcaja(
						rs.getInt("arq_nro"),
						rs.getInt("arq_usuario"),
						rs.getString("arq_numcaja"),
						rs.getString("arq_fecha"),
						rs.getString("arq_fechacarga"),
						rs.getString("arq_hora"),
						rs.getDouble("arq_cajinicial"),
						rs.getDouble("arq_totdescredito"),
						rs.getDouble("arq_totvencontado"),
						rs.getDouble("arq_totdescontado"),
						rs.getDouble("arq_totchedia"),
						rs.getDouble("arq_totnota"),
						rs.getDouble("arq_tottarcredito"),
						rs.getDouble("arq_comcrepagado"),
						rs.getDouble("arq_tottardebito"),
						rs.getDouble("arq_comcontado"),
						rs.getDouble("arq_faccrecobrado"),
						rs.getDouble("arq_totgasto"),
						rs.getDouble("arq_totvencredito"),
						rs.getDouble("arq_totingreso"),
						rs.getDouble("arq_totegreso"),
						rs.getDouble("arq_efecaja"),
						rs.getInt("arq_borrado"),
						rs.getDouble("arq_totcheplazo"),
						rs.getDouble("arq_totefecajguarani"),
						rs.getDouble("arq_totefecajdolar"),
						rs.getDouble("arq_totefecajreal"),
						rs.getDouble("arq_totefecajpeso"),
						rs.getDouble("arq_totefecajeuro"),
						rs.getDouble("arq_tototrosingresos"),
						rs.getDouble("arq_totentregacobrada"),
						rs.getDouble("arq_totcuotacobrada"),
						rs.getDouble("arq_totnotaemitida"),
						rs.getDouble("arq_tototrasentradas"),
						rs.getDouble("arq_totsalon"),
						rs.getDouble("arq_totgreenfee"),
						rs.getDouble("arq_totcarrito"),
						rs.getDouble("arq_totpiscina"),
						rs.getDouble("arq_totocupacion"),
						rs.getDouble("arq_totconsumicion"),
						rs.getDouble("arq_totgiro"),
						rs.getDouble("arq_totdepbancario"),
						rs.getDouble("arq_totaladelanto"),
						rs.getDouble("arq_totalsalario"),
						rs.getDouble("arq_totinguarani"),
						rs.getDouble("arq_totindolar"),
						rs.getDouble("arq_totinreal"),
						rs.getDouble("arq_totinpeso"),
						rs.getDouble("arq_totineuro"),
						rs.getDouble("arq_totdifguarani"),
						rs.getDouble("arq_totdifdolar"),
						rs.getDouble("arq_totdifreal"),
						rs.getDouble("arq_totdifpeso"),
						rs.getDouble("arq_totdifeuro"),
						rs.getDouble("arq_totredondeos"),
						rs.getDouble("arq_monto_contado")
			);
			arr.add(arqc);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Arqcaja arqc) {
		String q = " insert into arqcaja( arq_usuario,  arq_numcaja,  arq_fecha,  arq_fechacarga,  arq_hora,  arq_cajinicial,  arq_totdescredito,  arq_totvencontado,  arq_totdescontado,  arq_totchedia,  arq_totnota,  arq_tottarcredito,  arq_comcrepagado,  arq_tottardebito,  arq_comcontado,  arq_faccrecobrado,  arq_totgasto,  arq_totvencredito,  arq_totingreso,  arq_totegreso,  arq_efecaja,  arq_borrado,  arq_totcheplazo,  arq_totefecajguarani,  arq_totefecajdolar,  arq_totefecajreal,  arq_totefecajpeso,  arq_totefecajeuro,  arq_tototrosingresos,  arq_totentregacobrada,  arq_totcuotacobrada,  arq_totnotaemitida,  arq_tototrasentradas,  arq_totsalon,  arq_totgreenfee,  arq_totcarrito,  arq_totpiscina,  arq_totocupacion,  arq_totconsumicion,  arq_totgiro,  arq_totdepbancario,  arq_totaladelanto,  arq_totalsalario,  arq_totinguarani,  arq_totindolar,  arq_totinreal,  arq_totinpeso,  arq_totineuro,  arq_totdifguarani,  arq_totdifdolar,  arq_totdifreal,  arq_totdifpeso,  arq_totdifeuro,  arq_totredondeos,  arq_monto_contado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqc.getArq_usuario());
			ps.setString(2, arqc.getArq_numcaja());
			ps.setString(3, arqc.getArq_fecha());
			ps.setString(4, arqc.getArq_fechacarga());
			ps.setString(5, arqc.getArq_hora());
			ps.setDouble(6, arqc.getArq_cajinicial());
			ps.setDouble(7, arqc.getArq_totdescredito());
			ps.setDouble(8, arqc.getArq_totvencontado());
			ps.setDouble(9, arqc.getArq_totdescontado());
			ps.setDouble(10, arqc.getArq_totchedia());
			ps.setDouble(11, arqc.getArq_totnota());
			ps.setDouble(12, arqc.getArq_tottarcredito());
			ps.setDouble(13, arqc.getArq_comcrepagado());
			ps.setDouble(14, arqc.getArq_tottardebito());
			ps.setDouble(15, arqc.getArq_comcontado());
			ps.setDouble(16, arqc.getArq_faccrecobrado());
			ps.setDouble(17, arqc.getArq_totgasto());
			ps.setDouble(18, arqc.getArq_totvencredito());
			ps.setDouble(19, arqc.getArq_totingreso());
			ps.setDouble(20, arqc.getArq_totegreso());
			ps.setDouble(21, arqc.getArq_efecaja());
			ps.setInt(22, arqc.getArq_borrado());
			ps.setDouble(23, arqc.getArq_totcheplazo());
			ps.setDouble(24, arqc.getArq_totefecajguarani());
			ps.setDouble(25, arqc.getArq_totefecajdolar());
			ps.setDouble(26, arqc.getArq_totefecajreal());
			ps.setDouble(27, arqc.getArq_totefecajpeso());
			ps.setDouble(28, arqc.getArq_totefecajeuro());
			ps.setDouble(29, arqc.getArq_tototrosingresos());
			ps.setDouble(30, arqc.getArq_totentregacobrada());
			ps.setDouble(31, arqc.getArq_totcuotacobrada());
			ps.setDouble(32, arqc.getArq_totnotaemitida());
			ps.setDouble(33, arqc.getArq_tototrasentradas());
			ps.setDouble(34, arqc.getArq_totsalon());
			ps.setDouble(35, arqc.getArq_totgreenfee());
			ps.setDouble(36, arqc.getArq_totcarrito());
			ps.setDouble(37, arqc.getArq_totpiscina());
			ps.setDouble(38, arqc.getArq_totocupacion());
			ps.setDouble(39, arqc.getArq_totconsumicion());
			ps.setDouble(40, arqc.getArq_totgiro());
			ps.setDouble(41, arqc.getArq_totdepbancario());
			ps.setDouble(42, arqc.getArq_totaladelanto());
			ps.setDouble(43, arqc.getArq_totalsalario());
			ps.setDouble(44, arqc.getArq_totinguarani());
			ps.setDouble(45, arqc.getArq_totindolar());
			ps.setDouble(46, arqc.getArq_totinreal());
			ps.setDouble(47, arqc.getArq_totinpeso());
			ps.setDouble(48, arqc.getArq_totineuro());
			ps.setDouble(49, arqc.getArq_totdifguarani());
			ps.setDouble(50, arqc.getArq_totdifdolar());
			ps.setDouble(51, arqc.getArq_totdifreal());
			ps.setDouble(52, arqc.getArq_totdifpeso());
			ps.setDouble(53, arqc.getArq_totdifeuro());
			ps.setDouble(54, arqc.getArq_totredondeos());
			ps.setDouble(55, arqc.getArq_monto_contado());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Arqcaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Arqcaja arqc) {
		String q = " update arqcaja set  arq_usuario=?,  arq_numcaja=?,  arq_fecha=?,  arq_fechacarga=?,  arq_hora=?,  arq_cajinicial=?,  arq_totdescredito=?,  arq_totvencontado=?,  arq_totdescontado=?,  arq_totchedia=?,  arq_totnota=?,  arq_tottarcredito=?,  arq_comcrepagado=?,  arq_tottardebito=?,  arq_comcontado=?,  arq_faccrecobrado=?,  arq_totgasto=?,  arq_totvencredito=?,  arq_totingreso=?,  arq_totegreso=?,  arq_efecaja=?,  arq_borrado=?,  arq_totcheplazo=?,  arq_totefecajguarani=?,  arq_totefecajdolar=?,  arq_totefecajreal=?,  arq_totefecajpeso=?,  arq_totefecajeuro=?,  arq_tototrosingresos=?,  arq_totentregacobrada=?,  arq_totcuotacobrada=?,  arq_totnotaemitida=?,  arq_tototrasentradas=?,  arq_totsalon=?,  arq_totgreenfee=?,  arq_totcarrito=?,  arq_totpiscina=?,  arq_totocupacion=?,  arq_totconsumicion=?,  arq_totgiro=?,  arq_totdepbancario=?,  arq_totaladelanto=?,  arq_totalsalario=?,  arq_totinguarani=?,  arq_totindolar=?,  arq_totinreal=?,  arq_totinpeso=?,  arq_totineuro=?,  arq_totdifguarani=?,  arq_totdifdolar=?,  arq_totdifreal=?,  arq_totdifpeso=?,  arq_totdifeuro=?,  arq_totredondeos=?,  arq_monto_contado=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqc.getArq_usuario());
			ps.setString(2, arqc.getArq_numcaja());
			ps.setString(3, arqc.getArq_fecha());
			ps.setString(4, arqc.getArq_fechacarga());
			ps.setString(5, arqc.getArq_hora());
			ps.setDouble(6, arqc.getArq_cajinicial());
			ps.setDouble(7, arqc.getArq_totdescredito());
			ps.setDouble(8, arqc.getArq_totvencontado());
			ps.setDouble(9, arqc.getArq_totdescontado());
			ps.setDouble(10, arqc.getArq_totchedia());
			ps.setDouble(11, arqc.getArq_totnota());
			ps.setDouble(12, arqc.getArq_tottarcredito());
			ps.setDouble(13, arqc.getArq_comcrepagado());
			ps.setDouble(14, arqc.getArq_tottardebito());
			ps.setDouble(15, arqc.getArq_comcontado());
			ps.setDouble(16, arqc.getArq_faccrecobrado());
			ps.setDouble(17, arqc.getArq_totgasto());
			ps.setDouble(18, arqc.getArq_totvencredito());
			ps.setDouble(19, arqc.getArq_totingreso());
			ps.setDouble(20, arqc.getArq_totegreso());
			ps.setDouble(21, arqc.getArq_efecaja());
			ps.setInt(22, arqc.getArq_borrado());
			ps.setDouble(23, arqc.getArq_totcheplazo());
			ps.setDouble(24, arqc.getArq_totefecajguarani());
			ps.setDouble(25, arqc.getArq_totefecajdolar());
			ps.setDouble(26, arqc.getArq_totefecajreal());
			ps.setDouble(27, arqc.getArq_totefecajpeso());
			ps.setDouble(28, arqc.getArq_totefecajeuro());
			ps.setDouble(29, arqc.getArq_tototrosingresos());
			ps.setDouble(30, arqc.getArq_totentregacobrada());
			ps.setDouble(31, arqc.getArq_totcuotacobrada());
			ps.setDouble(32, arqc.getArq_totnotaemitida());
			ps.setDouble(33, arqc.getArq_tototrasentradas());
			ps.setDouble(34, arqc.getArq_totsalon());
			ps.setDouble(35, arqc.getArq_totgreenfee());
			ps.setDouble(36, arqc.getArq_totcarrito());
			ps.setDouble(37, arqc.getArq_totpiscina());
			ps.setDouble(38, arqc.getArq_totocupacion());
			ps.setDouble(39, arqc.getArq_totconsumicion());
			ps.setDouble(40, arqc.getArq_totgiro());
			ps.setDouble(41, arqc.getArq_totdepbancario());
			ps.setDouble(42, arqc.getArq_totaladelanto());
			ps.setDouble(43, arqc.getArq_totalsalario());
			ps.setDouble(44, arqc.getArq_totinguarani());
			ps.setDouble(45, arqc.getArq_totindolar());
			ps.setDouble(46, arqc.getArq_totinreal());
			ps.setDouble(47, arqc.getArq_totinpeso());
			ps.setDouble(48, arqc.getArq_totineuro());
			ps.setDouble(49, arqc.getArq_totdifguarani());
			ps.setDouble(50, arqc.getArq_totdifdolar());
			ps.setDouble(51, arqc.getArq_totdifreal());
			ps.setDouble(52, arqc.getArq_totdifpeso());
			ps.setDouble(53, arqc.getArq_totdifeuro());
			ps.setDouble(54, arqc.getArq_totredondeos());
			ps.setDouble(55, arqc.getArq_monto_contado());
			ps.setInt(56, arqc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Arqcaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Arqcaja arqc) {
		String q = " delete from arqcaja where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, arqc.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Arqcaja", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}