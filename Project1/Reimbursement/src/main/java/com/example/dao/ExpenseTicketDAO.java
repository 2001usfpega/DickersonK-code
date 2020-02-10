package com.example.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.ExpenseTicketModel;

public class ExpenseTicketDAO {

	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	 
	
	public void intExp1(Double amount2, String date, int expense_type, int userid, String first_name, String last_name, String description ) {
		
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = "INSERT INTO expense_ticket(first_name, last_name, amount, date_submitted, expense_type, userid, description) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement expense = conn.prepareStatement(sql);

			expense.setDouble(3, amount2);
			expense.setString(4, date);
			expense.setInt(5, expense_type);
			expense.setInt(6, userid);
			expense.setString(1,first_name);
			expense.setString(2, last_name);
			expense.setString(7, description);

			expense.executeUpdate();
			
			//ExpenseTicketModel ugh = new ExpenseTicketModel();

System.out.println(url);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public void intExp1(String date, int type) {
		// TODO Auto-generated method stub
		
	}
}
