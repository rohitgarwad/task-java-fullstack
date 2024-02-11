package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.util.ConnUtil;

public class SigninValidation extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String url = "jdbc:mysql://localhost:3306/testdb";
		String dbusername = "root";
		String dbpassword = "0404@Rohit";

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ConnUtil.getDBConnection();
			ps = conn.prepareStatement("select username, password from users where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				//pw.println("signin success");
				RequestDispatcher rd = request.getRequestDispatcher("/GetUsers");
				rd.forward(request, response);
			} else {
				pw.println("Login failed. Please check your credentials");
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				rd.include(request, response);
			}

			ps.close();
			ConnUtil.getDBDestroyConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
