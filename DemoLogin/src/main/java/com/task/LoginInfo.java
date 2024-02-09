package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInfo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		if (name == null && pwd == null) {
			pw.println("<p color: red>username & password are manditory</p>");
		}
		else if (name.equals("admin") && pwd.equals("admin")) {
			pw.println("Login Success");
		} else {
			pw.println("Please check your credentials !");
		}
		
	}

}
