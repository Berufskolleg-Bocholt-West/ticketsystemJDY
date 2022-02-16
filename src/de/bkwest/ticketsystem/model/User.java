package de.bkwest.ticketsystem.model;

public class User {
	private int userID;
	private String username;
	private String password;
	private boolean blocked;
	private int attempts;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	public User(int userID, String username, String password, boolean blocked) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.blocked = blocked;
	}
	
	public void createTicket() {
		
	}
	
	public void changeStatus() {
			
	}
	public void createComment() {
		
	}
}
