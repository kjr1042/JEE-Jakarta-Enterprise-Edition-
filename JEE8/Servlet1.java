package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CallServlet1")

public class Servlet1 extends HttpServlet{
	@Override
	public void init() throws ServletException {
		System.out.println("init method is excuting.....");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("Service method is excuting....");
		
		req.setAttribute("username", username);
		
		PrintWriter out = resp.getWriter();
		out.println("Hi "+username+" welcome to the Servlet1");
		
		RequestDispatcher rd =req.getRequestDispatcher("CallServlet2");
		rd.include(req, resp);
	}

}
