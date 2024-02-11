package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.util.ConnUtil;

public class RegisterUser extends HttpServlet {
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnUtil.getDBConnection();
			ps = conn.prepareStatement("insert into users(id, name, username, password, email) values(?, ?, ?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, email);
			ps.executeUpdate();
			
			ps.close();
			ConnUtil.getDBDestroyConnection();
			
			pw.println("User Registered");
			RequestDispatcher rd = request.getRequestDispatcher("/GetUsers");
			rd.forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
