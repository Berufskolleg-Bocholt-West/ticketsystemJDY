package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*; 
import de.bkwest.ticketsystem.model.User;
import de.bkwest.ticketsystem.view.LoginUserInterface;

public class LoginFunction {
	
	public static String compare(String usernameGUI, char[] passwordGUI) {
		String output;
		for (User u : DBCon.getAllusers()) {
			return usernameGUI;
		//	if(u.getUsername().equals(usernameGUI) && u.getPassword().toCharArray().equals(passwordGUI)) {
		//		return output = "success";
		//	}else { 
		//		return output = "failure";
		//	}
		}
		return output = "did not enter loop";
	}
}