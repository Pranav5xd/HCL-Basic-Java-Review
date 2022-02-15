package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.User;
import com.hcl.db.DBHandler;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		User user = new User(username, password);
		
		try {
			DBHandler.register(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("successfulRegister.jsp");
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	}
}	
