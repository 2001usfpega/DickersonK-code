package com.example.model;

import java.sql.Date;

public class ExpenseTicketModel {

	public int ticketid;
	public double amount;
	public Date date_submitted;
	public Date date_resolved;
	public String last_name;
	public String description;
	public int userid;
	public int expense_id;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
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
	public Date getDate_resolved() {
		return date_resolved;
	}
	public void setDate_resolved(Date date_resolved) {
		this.date_resolved = date_resolved;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public int getExpense_id() {
		return expense_id;
	}
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}
	public ExpenseTicketModel(int ticketid, double amount, Date date_submitted, Date date_resolved, String last_name,
			String description, int userid, int expense_id) {
		super();
		this.ticketid = ticketid;
		this.amount = amount;
		this.date_submitted = date_submitted;
		this.date_resolved = date_resolved;
		this.last_name = last_name;
		this.description = description;
		this.userid = userid;
		this.expense_id = expense_id;
	}
	public ExpenseTicketModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ExpenseTicketModel [ticketid=" + ticketid + ", amount=" + amount + ", last_name=" + last_name
				+ ", description=" + description + ", userid=" + userid + ", expense_id=" + expense_id + "]";
	}
	
	
	
	
	
	
}
