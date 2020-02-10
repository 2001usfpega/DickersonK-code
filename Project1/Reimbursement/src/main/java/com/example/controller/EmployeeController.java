package com.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.AdminDAO;
import com.example.employee.EmployeeDAO;
import com.example.model.EmployeeModel;

public class EmployeeController {
	public static String login(HttpServletRequest req) throws SQLException {
		if(!req.getMethod().equals("POST")) {
			return "html/index.html";
		}
		
		String Uname= req.getParameter("username");
		String Pass= req.getParameter("password");
		int rank = req.getIntHeader("rank");
		EmployeeDAO DaoImpl = new EmployeeDAO();
		EmployeeModel yeah2 = DaoImpl.emp_login(Uname, Pass, rank);
		
	//	EmployeeModel admin = DaoImpl.emp_login(Uname, Pass, rank);
		
		
		
		
		if(yeah2 == null) {
			return "html/badlogin.html";
			
		}else if(yeah2.getRank()==1){
			return "html/EmployeeHome.html";
			
		}else if(yeah2.getRank()==2) {
			return "html/AdminHome.html";
		}

			return "html/EmployeeHome.html";
		}
		
	
}

