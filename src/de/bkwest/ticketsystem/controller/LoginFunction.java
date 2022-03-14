package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*; 
import de.bkwest.ticketsystem.model.User;
import de.bkwest.ticketsystem.view.LoginUserInterface;

public class LoginFunction {
	
	public static String compare(String usernameGUI, String passwordGUI) {
		String output;
		
		for (User u : DBCon.getAllusers()) {
			if(u.getUsername().equals(usernameGUI) && u.getPassword().equals(passwordGUI)) {
				return output = "success";
			}else if(u.getUsername().equals(usernameGUI)){
				u.setAttempts(+1);
			}else if(u.getAttempts()>=3) {
				u.setBlocked(true);
			}
		}
		return output = "did not enter loop";
	}
}