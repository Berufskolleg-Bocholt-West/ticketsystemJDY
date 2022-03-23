package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*;
import de.bkwest.*;
import de.bkwest.ticketsystem.model.User;

public class LoginFunction {

	public static boolean compare(String usernameGUI, String passwordGUI) {
		boolean output;
		for (User u : DBCon.getAllusers()) {
			if (u.getUsername().equals(usernameGUI) && u.getPassword().equals(passwordGUI) && u.isBlocked() == false) {
				System.out.println("User Successfully logged in.");
				return output = true;
			} else if (u.getUsername().equals(usernameGUI) && u.isBlocked() == false) {
				u.setAttempts(u.getAttempts() + 1);
				DBCon.updateUserTable(u.getUserID(), u.isBlocked(), u.getAttempts());
			} else if (u.getAttempts() >= 3 && u.isBlocked() == false) {
				u.setBlocked(true);
				DBCon.updateUserTable(u.getUserID(), u.isBlocked(), u.getAttempts());
				System.out.println("Login unsuccesful.");
				return output = false;
			}
		}
		return output = false;
	}
}