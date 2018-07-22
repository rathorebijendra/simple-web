package org.web.simple;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.Writer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter Writer = response.getWriter();
		Writer.write("third servlet responce");
	}
}