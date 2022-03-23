package de.bkwest.ticketsystem.controller;

import java.util.*;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import de.bkwest.ticketsystem.model.User;
import de.bkwest.ticketsystem.view.RegisterUserInterface;

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
			while(rs.next()) {
				boolean blockedBool;
				if(rs.getInt("blocked") == 1) {
					blockedBool = true;
				}else{
					blockedBool = false;
				}
				User users = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"),blockedBool, rs.getInt("attempts"));
				allusers.add(users);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void updateUserTable(int userID, boolean blocked, int attempts) {
		//opoipopo
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String dbuser = "itam-root6";
		String pass = "X~r3z7g5";
		int blockedInt;
		if(blocked == true) {
			blockedInt = 1;
		}else {
			blockedInt = 0;
		}
		try {
			Connection con = DriverManager.getConnection(url, dbuser, pass);
			Statement st = con.createStatement();
			String sql = ("UPDATE User SET  blocked = "+blockedInt+", attempts = "+attempts+" WHERE userID = "+userID+";");
			st.executeUpdate(sql);
			con.close();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static ArrayList<User> getAllusers() {
		return allusers;
	}

	public static void setAllusers(ArrayList<User> allusers) {
		DBCon.allusers = allusers;
	}


	public static String insertUser(String username, String password, String confirmedPassword) {
		String url = "jdbc:mysql://45.81.232.17/itam-gruppe6";
		String dbuser = "itam-root6";
		String pass = "X~r3z7g5";
		String output;
		try {
			Connection con = DriverManager.getConnection(url, dbuser, pass);
			Statement st = con.createStatement();
			String sql = ("Insert into User(username,password) values("+username+","+password+");");
			for (User u : DBCon.getAllusers()) {
				if (u.getUsername().equals(username)) {
					 System.out.println("User does already exist");
					 return output = "";
				}
			}
			if(confirmedPassword.equals(password) ) {
				st.executeUpdate(sql);
				con.close();
				System.out.println("Yey");
				return output = ""; 
			}	
			else {
				 System.out.println("Pasword does not match");
				 return output = "";
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return output = "";
	}
	public static void insertTicket(int UserID ) {
		
	}
}
