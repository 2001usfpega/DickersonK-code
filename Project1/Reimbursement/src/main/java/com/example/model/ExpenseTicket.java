package com.example.model;

public class ExpenseTicket {

	
private int ticketid;
private int amount;
private String date_submitted;
private String date_resolved;
public int getTicketid() {
	return ticketid;
}
public void setTicketid(int ticketid) {
	this.ticketid = ticketid;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public String getDate_submitted() {
	return date_submitted;
}
public void setDate_submitted(String date_submitted) {
	this.date_submitted = date_submitted;
}
public String getDate_resolved() {
	return date_resolved;
}
public void setDate_resolved(String date_resolved) {
	this.date_resolved = date_resolved;
}
public ExpenseTicket() {
	super();
	// TODO Auto-generated constructor stub
}
public ExpenseTicket(int ticketid, int amount, String date_submitted, String date_resolved) {
	super();
	this.ticketid = ticketid;
	this.amount = amount;
	this.date_submitted = date_submitted;
	this.date_resolved = date_resolved;
}
	
}
