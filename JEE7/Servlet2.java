package com.tap;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie a[] =req.getCookies();
		System.out.println(a[0]);
		for(Cookie res:a)
		{
			System.out.println(res.getName()+" : "+res.getValue());
		}
	}

}
