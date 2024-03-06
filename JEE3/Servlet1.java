package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String username =req.getParameter("username");
			PrintWriter out =resp.getWriter();
			out.print("Hello " +username+" Welcome to login page (Servlet1)\n");
			
			RequestDispatcher rd =req.getRequestDispatcher("CallServlet2");
			//rd.forward(req, resp); // `forward` method skips the instructions in servlet1
			// to include the instructions in Servlet1 , we need to use the method `include`
			rd.include(req, resp);
		}

}
