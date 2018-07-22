package org.web.simple;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RespectBinding;

public class TimerFilter implements Filter {
	private FilterConfig config = null;

	public void init(FilterConfig config) throws ServletException {
		this.config = config;

	}

	public void destroy() {
		config = null;

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// @Override
		// public void destroy() {
		// config = null;
		// }

		long before = System.currentTimeMillis();
		
		long after = System.currentTimeMillis();
		String name = "  ";
		if (request instanceof HttpServletRequest) {
			HttpServletRequest request2;
			name = ((HttpServletRequest) request).getRequestURI();
		}
		config.getServletContext().log(name + " : " + (after - before) + "ms");
		System.out.println(name + " : " + (after - before) + "ms");
		
		chain.doFilter(request, response);

	}
}
