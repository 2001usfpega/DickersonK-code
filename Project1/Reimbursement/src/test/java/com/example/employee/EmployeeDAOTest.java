package com.example.employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.sql.DATE;

public class EmployeeDAOTest extends EmployeeService{
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static String url = System.getenv("Bankdb_url");
	private static String username = System.getenv("Bankdb_user");
	private static String password = System.getenv("Bankdb_pass");
	private static String user;
	
	public static int ticketid;
	public double amount;
	public String date_submitted;;
	public int expense_type;
	
	public int getExpense_type() {
		return expense_type;
	}
	public void setExpense_type(int expense_type) {
		this.expense_type = expense_type;
	}
	public int getTicketid() {
		return ticketid;
	}
	@SuppressWarnings("static-access")
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate_submitted() {
		return date_submitted;
	}
	public void setDate_submitted(String date_submitted) {
		this.date_submitted = date_submitted;
	}
	
	
	//private static String pass;
	
	public void Employee(int amount, String date_submitted, int expense_type) {
		
		this.amount = amount;
		this.date_submitted = date_submitted;
		this.ticketid=0;
		this.expense_type=expense_type;
	}
	
	
	
	
	public static void intExp1(Double amount2, String date ,int expense_type) {
		try(Connection conn=DriverManager.getConnection(url,username,password)){
			String sql = "INSERT INTO expense_ticket (amount, date_submitted, expense_type)"+"Values (?,?,?)";
			PreparedStatement expense = conn.prepareStatement(sql);
			
			expense.setDouble(1, amount2);
			expense.setDate(2,new Date(System.currentTimeMillis()));
			expense.setInt(3, expense_type);
//			System.out.println("Submitting");
//			System.out.print(".");
//			
//			System.out.print(".");
//			
//			System.out.print(".");
//			
//			System.out.print(".");
			expense.executeUpdate();
			
			
			
			
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return "EmployeeDAO [ticketid=" + ticketid + ", amount=" + amount + ", date_submitted=" + date_submitted + "]";
	}
	public void intExp(int amount2, String string) {
		// TODO Auto-generated method stub
		
	}
	public void expense() {
		// TODO Auto-generated method stub
		
	}
}
