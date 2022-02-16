package com.hcl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.User;
import com.hcl.db.DBHandler;

import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		User user = new User(username, password);		
		try{
			boolean flag = DBHandler.validate(user);
			if(flag) {
				res.sendRedirect("successfulLogin.jsp");
			}
			else {
				 req.getSession();
			}
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doPost(req, res);
	}
}
