package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet{
	static int count=3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username =req.getParameter("username");
		String password =req.getParameter("password");
		resp.setContentType("text/html");
		
		String mypassword ="jee123";
		PrintWriter out=resp.getWriter();
		
		HttpSession session=req.getSession();
		session.setAttribute("username", username);
		
		if(password.equals(mypassword))
		{
			out.print("Hey, "+username+" welcome to the Home Page....");
		}
		else if(count>0)
		{
			out.print("Hey, "+username+" You have only "+count+"attempts left try again....");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			count--;
		}
		else
		{
			//RequestDispatcher rd =req.getRequestDispatcher("CallingServlet2");
			//rd.include(req, resp);
			resp.sendRedirect("CallingServlet2");
		}
	}

}
