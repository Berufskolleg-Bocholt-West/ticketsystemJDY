package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*;
import de.bkwest.*;
import de.bkwest.ticketsystem.model.User;

public class LoginFunction {
	
	
	
	public static boolean compare(String usernameGUI, String passwordGUI) {
		int i = 0;
		boolean output;
		for (User u : DBCon.getAllusers()) {
			if (u.getUsername().equals(usernameGUI) && u.getPassword().equals(passwordGUI) && !u.isBlocked()) {
				JOptionPane.showMessageDialog(null, "Login successful");
				
				return output = true;
			} else if (u.getUsername().equals(usernameGUI) && !u.getPassword().equals(passwordGUI) && u.getAttempts() < 3 && !u.isBlocked()) {
				u.setAttempts(u.getAttempts() + 1);
				JOptionPane.showMessageDialog(null, "Login failed");
				DBCon.updateUserTable(u.getUserID(), u.isBlocked(), u.getAttempts());
				break;
			} else if (u.getUsername().equals(usernameGUI) && u.getAttempts() >= 3 ) {
				u.setBlocked(true);
				DBCon.updateUserTable(u.getUserID(), u.isBlocked(), u.getAttempts());
				JOptionPane.showMessageDialog(null, "User blocked");
				return output = false;
			}
			i++;
		}
		if (i ==  DBCon.getAllusers().size()) {
		JOptionPane.showMessageDialog(null, "Login failed");
		return output = false;
		}
		return output = false;
	}
}