package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Pais;


public class PaisController {
	
private static Connection conn = null;
	
	
	public static List<Pais> cargarPaises() {
		List<Pais> lc = new ArrayList<Pais>();
		try {
			conn = controllers.ConnectionManagerV1.getConexion();

			PreparedStatement ps = conn.prepareStatement(
					"select * from pais");
			ResultSet rs = ps.executeQuery();
			Pais p = null;
			while (rs.next()) {
				p = new Pais();
				p.setId(rs.getInt(1));
				p.setDescripcion(rs.getString(2));
				lc.add(p);
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
