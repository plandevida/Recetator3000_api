package com.recetatordeveloperteam.other.api;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String loginName = (String) req.getParameter("loginname");
		String pass = (String) req.getParameter("passed");
		
		System.out.println(loginName + " " + pass);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("{ \"respuesta\": \"correctamente\" }");
	}
}
