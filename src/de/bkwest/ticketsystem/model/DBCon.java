package de.bkwest.ticketsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCon {

	public static void connection() {
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String user = "itam-root6";
		String pass = "X~r3z7g5";

		try {
		    
		  Connection con = DriverManager.getConnection(url, user, pass);
		    System.out.println("Verbindung erfolgreich hergestellt");
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		}
	}
}
