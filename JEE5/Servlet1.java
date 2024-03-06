package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public static int count=3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password =req.getParameter("password");
		String username =req.getParameter("username");
		String myPassword="jee123";
		
		PrintWriter out =resp.getWriter();
		
		resp.setContentType("text/html");
		
		if(myPassword.equals(password))
		{
			out.print("Hey, "+username+" Welcome to the Home Page.....");
		}
		else if(count>0)
		{
			out.println("You have only "+count+" attempts left,Try again...");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			count--;
		}
		else
		{
			out.print("Hey, "+username+" Please Contact Admin.....");
		}
	}

}
