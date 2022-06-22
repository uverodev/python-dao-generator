package DAO;
import static java.lang.Thread.yield;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Creditos_pagos;
import vista.*;

public class Creditos_pagosDAO extends Thread {
	private Creditos_pagos cred;
	public ArrayList<Creditos_pagos> resultadoCreditos_pagos;

	@Override
	public void run() {
		try{
			actualizarCreditos_pagos("");
		} catch (Exception e) {
			System.out.println("Error al generar Creditos_pagos");
		}
		yield();
	}

	public void actualizarCreditos_pagos(String condicion) {
		resultadoCreditos_pagos = listar(condicion);
	}

	public ArrayList listar(String condicion) {
		try {
			inicio.gConexion.comprobar();
			String q = "select * from  creditos_pagos " + condicion + " order by id desc";
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();

			ArrayList arr = new ArrayList();

			while (rs.next()) {
				cred = new Creditos_pagos(
						rs.getInt("id"),
						rs.getString("fecha"),
						rs.getInt("idcreditos"),
						rs.getString("pago"),
						rs.getInt("idUsuarios")
			);
			arr.add(cred);
		}

			return arr;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public boolean insertar(Creditos_pagos cred) {
		String q = " insert into creditos_pagos( fecha,  idcreditos,  pago,  idUsuarios) values (?, ?, ?, ?)";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cred.getFecha());
			ps.setInt(2, cred.getIdcreditos());
			ps.setString(3, cred.getPago());
			ps.setInt(4, cred.getIdusuarios());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Agregar Creditos_pagos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean modificar(Creditos_pagos cred) {
		String q = " update creditos_pagos set  fecha=?,  idcreditos=?,  pago=?,  idUsuarios=? where id=?";

		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setString(1, cred.getFecha());
			ps.setInt(2, cred.getIdcreditos());
			ps.setString(3, cred.getPago());
			ps.setInt(4, cred.getIdusuarios());
			ps.setInt(5, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Modificar Creditos_pagos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public boolean eliminar(Creditos_pagos cred) {
		String q = " delete from creditos_pagos where id=?";
		try {
			inicio.gConexion.comprobar();
			PreparedStatement ps = inicio.gConexion.con.prepareStatement(q);
			ps.setInt(1, cred.getId());
			ps.executeUpdate();
			return true;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Eliminar Creditos_pagos", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
}