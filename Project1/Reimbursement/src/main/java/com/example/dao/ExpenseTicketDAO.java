package com.example.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.model.ExpenseTicketModel;

public class ExpenseTicketDAO {

	private static String url = "jdbc:oracle:thin:@usfpega2001.cewha0omcs9b.us-east-2.rds.amazonaws.com:1521:orcl";
	private static String username = "bankdb";
	private static String password = "b4nklif3";
	
	
	public void intExp1(Double amount2, String date, int expense_type) {
		
		
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = ("UPDATE expense_ticket SET amount=?, date_submitted=?, expense_type=? WHERE userid=?");
			PreparedStatement expense = conn.prepareStatement(sql);

			expense.setDouble(1, amount2);
			expense.setString(2, date);
			expense.setInt(3, expense_type);

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
