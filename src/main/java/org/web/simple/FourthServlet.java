package org.web.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FourthServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write("fourth servlet responce");
		response.setStatus(201);
		Cookie cookie = new Cookie("jwt", "fhjidsgoipoeriiwpoirrrJJOREH");
		response.addCookie(cookie);
	}
}