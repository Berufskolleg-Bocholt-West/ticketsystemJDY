package de.bkwest.ticketsystem.controller;

import java.util.ArrayList;
import javax.swing.*; 
import de.bkwest.ticketsystem.model.User;
import de.bkwest.ticketsystem.view.LoginUserInterface;

public class LoginFunction {
	
	public static String compare(String usernameGUI, String passwordGUI) {
		String output;
		
		for (User u : DBCon.getAllusers()) {
			System.out.println(u.getUsername());
			System.out.println(u.getPassword());
			if(u.getUsername().equals(usernameGUI) && u.getPassword().equals(passwordGUI)) {
				return output = "success";
			}
		}
		return output = "did not enter loop";
	}
}