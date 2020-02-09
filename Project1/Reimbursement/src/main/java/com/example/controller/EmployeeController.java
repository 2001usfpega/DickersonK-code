package com.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.example.employee.EmployeeDAO;
import com.example.model.EmployeeModel;

public class EmployeeController {
	public static String login(HttpServletRequest req) throws SQLException {
		if(!req.getMethod().equals("POST")) {
			return "html/EmployeeHome.html";
		}
		
		String Uname= req.getParameter("username");
		String Pass= req.getParameter("password");
		
		EmployeeDAO DaoImpl = new EmployeeDAO();
		EmployeeModel yeah = DaoImpl.emp_login(Uname, Pass);
		
		
		if(yeah == null) {
			return "html/badlogin.html";
			
		}else {
			
			return "html/EmployeeHome.html";

			
		}
	
}}

