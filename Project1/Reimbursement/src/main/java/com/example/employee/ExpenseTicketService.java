//package com.example.employee;
//
//import java.sql.Date;
//import java.util.Scanner;
//
//import com.example.model.ExpenseTicket;
//
//import oracle.sql.DATE;
//
//public class ExpenseTicketService {
//	
//public ExpenseTicketService(int i, double amount, Date date_submitted, Date date_resolved) {
//		// TODO Auto-generated constructor stub
//	}
//
//public void expenseticket(){
//	Scanner input = new Scanner(System.in);
//	
//	System.out.println("Enter ticket type");
//	int type = Integer.parseInt(input.nextLine());
//	System.out.println("Enter amount");
//	double amount = Double.parseDouble(input.nextLine());
//	Date date_submitted = new Date(System.currentTimeMillis());
//	Date date_resolved = new Date(System.currentTimeMillis());
//
//	ExpenseTicket et = new ExpenseTicket();
//	Object date = null;
//	et.setDate_submitted(date.toString());
//	String status = "Pending";
//	
//	System.out.println("description");
//	String description = input.nextLine();
//	
//	ExpenseTicketService xt = new ExpenseTicketService(0,amount,date_submitted,date_resolved);
//	xt.createExpenseTicketService(xt);
//	input.close();
//}
//
//private void createExpenseTicketService(ExpenseTicketService xt) {
//	// TODO Auto-generated method stub
//	
//}
//}
