package com.crud;

import java.sql.*;

public class MySqlConn {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "root");
			PreparedStatement stmt = con.prepareStatement("insert into emp values(?, ?, ?)");
			stmt.setInt(1, 2);
			stmt.setString(2, "RamaKrishna");
			stmt.setDouble(3, 40000);
			stmt.setInt(1, 4);
			stmt.setString(2, "Avinash");
			stmt.setDouble(3, 37000);
			stmt.executeUpdate();
			
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
//			}
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
