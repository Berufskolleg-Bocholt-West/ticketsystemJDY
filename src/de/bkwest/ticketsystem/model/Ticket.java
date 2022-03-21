package de.bkwest.ticketsystem.model;

import java.sql.Date;

public class Ticket {
	private int id;
	private int userId;
	private String status;
	private String title;
	private String discription;
	private Date start;
	private Date end;
	
	public Ticket(int id, int userId, String status, String title, String discrition, Date start, Date end) {
		super();
		this.id = id;
		this.userId = userId;
		this.status = status;
		this.title = title;
		this.discription = discrition;
		this.start = start;
		this.end = end;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int userId) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscrition() {
		return discription;
	}
	public void setDiscrition(String discrition) {
		this.discription = discrition;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public void notification() {
		
	}
	
	public void allocation() {
		
	}
}
