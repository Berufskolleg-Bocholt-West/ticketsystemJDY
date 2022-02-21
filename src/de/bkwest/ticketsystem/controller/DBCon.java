package de.bkwest.ticketsystem.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCon {
	public static void connection() {
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String dbuser = "itam-root6";
		String pass = "X~r3z7g5";
		try {
			Connection con = DriverManager.getConnection(url, dbuser, pass);
			System.out.println("Verbindung erfolgreich hergestellt");
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String fetchPassword(String username) {
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String dbuser = "itam-root6";
		String pass = "X~r3z7g5";
		try {
			Connection con = DriverManager.getConnection(url, dbuser, pass);
			Statement st = con.createStatement();
			String sql = ("SELECT password FROM User WHERE username = '" + username + "';");
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				String password2 = rs.getString("password");
				con.close();
				return password2;
			} else {
				con.close();
				return "Username was not found";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return "Something went horribly wrong! >:)";
	}
}
