package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDispatcher extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		if(uname.equals("admin") && pwd.equals("admin")) {
			pw.println("Login Success");
			RequestDispatcher rd = request.getRequestDispatcher("/Servlet1");
			rd.forward(request, response);
			
		} else {
			pw.println("Login if failed. Please check your credentials");
			RequestDispatcher rd = request.getRequestDispatcher("home.html");
			rd.include(request, response);
		}
	}

}
