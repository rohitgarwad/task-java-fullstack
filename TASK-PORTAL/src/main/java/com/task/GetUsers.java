package com.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.util.ConnUtil;

public class GetUsers extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection conn = null;
		PreparedStatement ps = null;
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\" name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<style type=\"text/css\">\r\n"
				+ "\r\n"
				+ ".users {\r\n"
				+ "	display: block;\r\n"
				+ "	position: relative;\r\n"
				+ "	height: 760px;\r\n"
				+ "	width: 90%;\r\n"
				+ "	margin: auto;\r\n"
				+ "	padding: 60px 60px;\r\n"
				+ "	background:\r\n"
				+ "		url(https://www.task.telangana.gov.in/_nuxt/logo.cf112990.png)\r\n"
				+ "		no-repeat center center #505050;\r\n"
				+ "	background-size: contain;\r\n"
				+ "	box-shadow: 0px 30px 60px -5px #000;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "table {\r\n"
				+ "	background-color: #607d8b;\r\n"
				+ "	width: 100%;\r\n"
				+ "	border-collapse: collapse;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "h1 {\r\n"
				+ "	color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th, td {\r\n"
				+ "	border: 1px solid #ddd;\r\n"
				+ "	padding: 8px;\r\n"
				+ "	text-align: left;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th {\r\n"
				+ "	background-color: #fff;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<div class=\"users\">\r\n"
				+ "		<h1>User Information</h1>\r\n"
				+ "		<table>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Id</th>\r\n"
				+ "				<th>Name</th>\r\n"
				+ "				<th>Username</th>\r\n"
				+ "				<th>Email</th>\r\n"
				+ "			</tr>");
		
		try {
			conn = ConnUtil.getDBConnection();
			ps = conn.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String username = rs.getString(3);
				//String password = rs.getString(4);
				String email = rs.getString(5);
				pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + username + "</td><td>" + email + "</td></tr>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection conn = null;
		PreparedStatement ps = null;
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\" name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<style type=\"text/css\">\r\n"
				+ "\r\n"
				+ ".users {\r\n"
				+ "	display: block;\r\n"
				+ "	position: relative;\r\n"
				+ "	height: 760px;\r\n"
				+ "	width: 90%;\r\n"
				+ "	margin: auto;\r\n"
				+ "	padding: 60px 60px;\r\n"
				+ "	background:\r\n"
				+ "		url(https://www.task.telangana.gov.in/_nuxt/logo.cf112990.png)\r\n"
				+ "		no-repeat center center #505050;\r\n"
				+ "	background-size: contain;\r\n"
				+ "	box-shadow: 0px 30px 60px -5px #000;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "table {\r\n"
				+ "	background-color: #607d8b;\r\n"
				+ "	width: 100%;\r\n"
				+ "	border-collapse: collapse;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "h1 {\r\n"
				+ "	color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th, td {\r\n"
				+ "	border: 1px solid #ddd;\r\n"
				+ "	padding: 8px;\r\n"
				+ "	text-align: left;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th {\r\n"
				+ "	background-color: #fff;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<div class=\"users\">\r\n"
				+ "		<h1>User Information</h1>\r\n"
				+ "		<table>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>Id</th>\r\n"
				+ "				<th>Name</th>\r\n"
				+ "				<th>Username</th>\r\n"
				+ "				<th>Email</th>\r\n"
				+ "			</tr>");
		
		try {
			conn = ConnUtil.getDBConnection();
			ps = conn.prepareStatement("select * from users");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String username = rs.getString(3);
				//String password = rs.getString(4);
				String email = rs.getString(5);
				pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + username + "</td><td>" + email + "</td></tr>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
