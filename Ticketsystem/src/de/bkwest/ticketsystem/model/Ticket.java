package de.bkwest.ticketsystem.model;

import java.sql.Date;

public class Ticket {
	private int id;
	private String status;
	private String title;
	private String discription;
	private Date start;
	private Date end;
	
	public Ticket(int id, String status, String title, String discrition, Date start, Date end) {
		super();
		this.id = id;
		this.status = status;
		this.title = title;
		this.discription = discrition;
		this.start = start;
		this.end = end;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
