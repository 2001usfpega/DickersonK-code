package com.example.model;

import java.sql.Date;

public class AdminModel {

	public int ticketid;
	public String firstname;
	public String lastname;
	public double amount;
	public Date date_submitted;
	public String description;
	public int userid;
	public int expense_type;
	
	
	
	
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate_submitted() {
		return date_submitted;
	}
	public void setDate_submitted(Date date_submitted) {
		this.date_submitted = date_submitted;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getExpense_type() {
		return expense_type;
	}
	public void setExpense_type(int expense_type) {
		this.expense_type = expense_type;
	}
	public AdminModel(int ticketid, String firstname, String lastname, double amount, Date date_submitted,
			String description, int userid, int expense_type) {
		super();
		this.ticketid = ticketid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.amount = amount;
		this.date_submitted = date_submitted;
		this.description = description;
		this.userid = userid;
		this.expense_type = expense_type;
	}
	public AdminModel(String string, String string2, String string3, String string4) {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminModel(String string, String string2, String string3, String string4, String string5, int int1) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminModel [ticketid=" + ticketid + ", firstname=" + firstname + ", lastname=" + lastname + ", amount="
				+ amount + ", description=" + description + ", userid=" + userid + ", expense_type=" + expense_type
				+ "]";
	}
	public String getDate_resolved() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
