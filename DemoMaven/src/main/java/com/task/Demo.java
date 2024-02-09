package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int empId = Integer.parseInt(request.getParameter("id"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from getEmp where empId=?");
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pw.println(rs.getInt(1)+" "+rs.getString(2));
			}
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
