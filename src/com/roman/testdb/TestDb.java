package com.roman.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDb
 */
@WebServlet("/TestDb")
public class TestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Setup connection
		String user = "springstudent";
		String pass = "springstudent";
		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&allowPublicKeyRetrieval=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		//get connection
		
		try {
			
			PrintWriter p = response.getWriter();
			p.println("Connection to :" + url);
			Class.forName(driver);
			Connection c = DriverManager.getConnection(url, user, pass);
			p.println("Connection ok");
			c.close(); 
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServletException();
		}
	}

}
