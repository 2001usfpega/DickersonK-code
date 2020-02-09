package com.example.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;


public class RequestHelper {

	public static String process(HttpServletRequest req) throws SQLException{
		
		System.out.println(req.getRequestURI());
		
		switch(req.getRequestURI()) {
		
		case "/Reimbursement/login.change":
			//System.out.println("in login.change");
			return EmployeeController.login(req);
			
		case "/HelloFrontController/home.change":
			System.out.println("in home change");
			return AdminController.home(req);
			
		case "/Reimbursement/yup":
			return ExpenseTicketController.money(req);
		default:
			System.out.println("in default case");
			return "badlogin.html";
		}
		
	
	}
			
		
		}

