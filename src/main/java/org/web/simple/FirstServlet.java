package org.web.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3821592144783673636L;
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter writer   =  response.getWriter();
		writer.write("Response from first servlet receved");
		System.out.println("do get method called!");
	}

}
