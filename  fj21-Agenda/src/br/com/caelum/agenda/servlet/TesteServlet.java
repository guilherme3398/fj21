package br.com.caelum.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/minhaServlet")
public class TesteServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
	}
	@Override
	public void destroy() {
		
		super.destroy();
	}
	protected void service (HttpServletRequest request,HttpServletResponse response)
	throws IOException , ServletException {
	}
	
	}

}
