package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistrationServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String userAddress=request.getParameter("userAddress");
		String userEmail=request.getParameter("userEmail");
		pw.println(userName+" "+passWord+" "+userAddress+" "+userEmail);
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?)");
			ps.setString(1, userName);
			ps.setString(2, passWord);
			ps.setString(3,  userAddress);
			ps.setString(4, userEmail);
			ps.executeUpdate();
			ps.close();
			pw.println("Registration Successful !");
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			pw.println(e);
		}
		
	}
	
}
