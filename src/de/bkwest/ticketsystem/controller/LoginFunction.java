package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*;
import de.bkwest.*;
import de.bkwest.ticketsystem.model.User;

public class LoginFunction {

	public static String compare(String usernameGUI, String passwordGUI) {
		String output;
		for (User u : DBCon.getAllusers()) {
			if (u.getUsername().equals(usernameGUI) && u.getPassword().equals(passwordGUI) && u.isBlocked() == false) {
				return output = "success";
			} else if (u.getUsername().equals(usernameGUI) && u.isBlocked() == false) {
				u.setAttempts(u.getAttempts() + 1);
				DBCon.updateDB(u.getUserID(), u.isBlocked(), u.getAttempts());
			} else if (u.getAttempts() >= 3 && u.isBlocked() == false) {
				u.setBlocked(true);
				DBCon.updateDB(u.getUserID(), u.isBlocked(), u.getAttempts());
				return output = "User is blocked!";
			}
		}
		return output = "No user in Arraylist :(";
	}
}