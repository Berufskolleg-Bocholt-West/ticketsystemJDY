package de.bkwest.ticketsystem.controller;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import de.bkwest.ticketsystem.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCon {
	private static ArrayList<User> allusers = new ArrayList<User>();
	
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
	
	public static void fetchUser() {
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String dbuser = "itam-root6";
		String pass = "X~r3z7g5";
		try {
			Connection con = DriverManager.getConnection(url, dbuser, pass);
			Statement st = con.createStatement();
			String sql = ("SELECT * FROM User;");
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				User users = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"),rs.getBoolean("blocked"), rs.getInt("attempts"));
				getAllusers().add(users);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public static ArrayList<User> getAllusers() {
		return allusers;
	}

	public static void setAllusers(ArrayList<User> allusers) {
		DBCon.allusers = allusers;
	}
}
