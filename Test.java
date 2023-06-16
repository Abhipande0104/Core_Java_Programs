package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    
    String mail, phone, copyr;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		mail= config.getInitParameter("mail");
		phone= config.getInitParameter("phone");
		
		ServletContext sctx= config.getServletContext();
		copyr= sctx.getInitParameter("copyright");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user= request.getParameter("user");
		PrintWriter out= response.getWriter();
		out.println("<h2> Welcome...."+user+"</h2>");
		out.println("<h2> Mail...."+mail+"</h2>");
		out.println("<h2> Phone...."+phone+"</h2>");
		
		out.println("<h2> copyright "+copyr+"</h2>");
		
	}

}
