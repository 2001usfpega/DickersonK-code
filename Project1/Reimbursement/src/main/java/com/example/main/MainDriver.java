package com.example.main;

import java.sql.SQLException;

import com.example.employee.EmployeeDAO;

public class MainDriver {


 
	
	public static void main (String [] Fl4k) throws SQLException {
//		Double amount2;
//		int expense_type = 0;
		
//		
//		
//		System.out.println("Enter reimbursement amount:");	
//		amount2=Double.parseDouble(input.nextLine());
//		System.out.println("Enter date:");
//		EmployeeDAO exp = new EmployeeDAO();
//		String date = input.nextLine();
		//EmployeeDAO.intExp1(amount2, date, expense_type);;
//		System.out.println("Choose type: ");
//		expense_type=input.nextInt();
//		exp.setAmount(amount2);
//		exp.setDate_submitted(date);
//		exp.setExpense_type(expense_type);
		EmployeeDAO test = new EmployeeDAO();
		test.emp_login("exSoldier7","Braver");
		
		
	}
}
