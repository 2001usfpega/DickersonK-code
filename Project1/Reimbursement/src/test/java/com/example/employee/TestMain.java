package com.example.employee;

import java.util.Scanner;

import org.junit.Test;


public class TestMain {

	@Test
	public static void main (String [] Fl4k) {
		Double amount2;
		Scanner input = new Scanner(System.in);
		int expense_type = 0;
		
		
		System.out.println("Enter reimbursement amount:");	
		amount2=Double.parseDouble(input.nextLine());
		System.out.println("Enter date:");
		EmployeeDAO exp = new EmployeeDAO();
		String date = input.nextLine();
		EmployeeDAO.intExp1(amount2, date, expense_type);;
		System.out.println("Choose type: ");
		expense_type=input.nextInt();
		exp.setAmount(amount2);
		exp.setExpense_type(expense_type);
		
		
		
		
	}
}

