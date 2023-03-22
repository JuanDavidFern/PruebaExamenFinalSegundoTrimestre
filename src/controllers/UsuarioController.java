package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import models.Usuario;

public class UsuarioController {
	private static Connection conn = null;
	
	public static void guardarNuevo(Usuario u) {
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn
					.prepareStatement("insert into usuario set id = ?, email = ?, usuario = ?, password = ?, idIdioma = ? ");

			ps.setInt(1, nextId());

			ps.setString(2, u.getEmail());
			
			ps.setString(3, u.getUsuario());
			
			ps.setString(4, u.getPassword());
			
			ps.setInt(5, u.getIdioma().getId());
			
			JOptionPane.showMessageDialog(null, " Lineas afectadas" + ps.executeUpdate());

			

			ps.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	}
	
	public static boolean comprobarUsuario(String nombre) {
		boolean existe = false;
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn
					.prepareStatement("SELECT usuario from usuario where usuario = '" + nombre +"'");
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				existe = true;
			}

			
			rs.close();
			ps.close();
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return existe;
	
	}
	
	private static int nextId() throws SQLException {
		conn = controllers.ConnectionManagerV1.getConexion();
		PreparedStatement ps = conn.prepareStatement("select max(id) from usuario");
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			int maxid = rs.getInt(1) + 1;
			ps.close();
			rs.close();
			return maxid;

		}
		ps.close();
		rs.close();
		return 1;

	}

}
