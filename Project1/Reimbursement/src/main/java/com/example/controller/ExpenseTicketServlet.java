package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.ExpenseTicketDAO;
import com.example.model.ExpenseTicketModel;


public class ExpenseTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ExpenseTicketServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException, NumberFormatException{
		
		ExpenseTicketDAO moneeeey = new ExpenseTicketDAO();
		
		
		int userid=Integer.parseInt(request.getParameter("userid"));
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		int type = Integer.parseInt(request.getParameter("type"));
		double amount2 = Double.parseDouble(request.getParameter("Amount"));
		String date = request.getParameter("Date");
		String notes = request.getParameter("Description");
		
		moneeeey.intExp1(amount2, date,type,userid,first_name,last_name, notes);
		
		HttpSession session = request.getSession();
		session.setAttribute("id", userid);
		session.setAttribute("firstname", first_name);
		session.setAttribute("lastname", last_name);
		session.setAttribute("expense_type", type);
		session.setAttribute("amount", amount2);
		session.setAttribute("date_submitted", date);
		session.setAttribute("description", notes);
		
		PrintWriter out = response.getWriter();
		out.println("Your Gil Will Be Back Shortly...Unless A Bandit Gets It");
	}


	
	}
	


