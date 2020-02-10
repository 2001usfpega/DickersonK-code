package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.AdminDAO;
import com.example.dao.ExpenseTicketDAO;
import com.example.model.AdminModel;
import com.example.model.ExpenseTicketModel;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	AdminDAO expensetick = new AdminDAO();	
		
	PrintWriter out = response.getWriter();
	out.println("<html>");
	
	out.println("<title> Expense Reports</title>");
	out.println("<table>");
	
	out.println("<tr><th>User Id</th> <th>First Name</th> <th> Last Name</th>"+
	"<th>Type</th> <th>Amount</th> <th>Date Submitted</th> <th>Date Resolved</th>"+
	"<th>Status</th> <th>Description</th> <th>Ticket Id</th> </tr>");
	List<AdminModel> ticketmodel = expensetick.getAllExpenses();
	
	for(AdminModel r:ticketmodel) {
		
		out.println("<tr><td>" + r.getUserid()+"</td>"
		+"<td>" + r.getFirstname() + "</td>"		
		+"<td>"	+ r.getLastname()+"</td>"	
		+"<td>" + r.getExpense_type() +"</td>"
		+"<td>" + r.getAmount() + "</td>"
		+"<td>" + r.getDate_submitted() + "</td>"
		+"<td>" + r.getDate_resolved() + "</td>"
		+"<td>" + r.getStatus() + "</td>"
		+"<td>" + r.getDescription() + "</td>"
		+"<td>" + r.getTicketid() + "</td> </tr>");
	
	out.println("</tables>");
	
	out.println("</body></html>");
	}
	
	}
	
	
}
