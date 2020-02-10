package com.example.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.example.dao.AdminDAO;
import com.example.model.AdminModel;

public class AdminController {

	public static String adlogin(HttpServletRequest req) throws SQLException {
		if (!req.getMethod().equals("GET")) {
			return "/AdminServlet.java";
		}
		return "/AdminServlet.java";}}

//		String Uname = req.getParameter("username");
//		String Pass = req.getParameter("password");
//
//		AdminDAO addao = new AdminDAO();
//		AdminModel yeah = addao.admin_login(Uname, Pass, 0);
//
//		if (yeah == null) {
//			return "html/badlogin.html";
//
//		} else {
//
//			return "html/AdminHome.html";
//
//		}
//	}

