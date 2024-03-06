package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String username = req.getParameter("username");
		PrintWriter out = resp.getWriter(); 
		
		HttpSession session =req.getSession();
		String username =(String)session.getAttribute("username");
		
		out.print("Hey, "+username+" Please Contact Admin....");
	}

}
