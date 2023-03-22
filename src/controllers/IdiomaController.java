package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Idioma;
import models.Pais;

public class IdiomaController {
	private static Connection conn = null;

	public static String textCheck(int id) {
		String str = null;
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn.prepareStatement("SELECT descripcion FROM acuerdo where idIdioma = " + id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				str = rs.getString(1);

			}
			rs.close();
			ps.close();
			conn.close();
			return str;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static List<Idioma> cargarIdiomas(int id) {
		List<Idioma> lc = new ArrayList<Idioma>();
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn.prepareStatement("select * from idioma where idPais = " + id);
			ResultSet rs = ps.executeQuery();
			Idioma i = null;
			while (rs.next()) {
				i = new Idioma();
				i.setId(rs.getInt(1));
				i.setDescipcion(rs.getString(2));
				Pais pa = new Pais();
				pa.setId(rs.getInt(3));
				i.setPais(pa);
				lc.add(i);
			}
			rs.close();
			ps.close();
			conn.close();
			return lc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
