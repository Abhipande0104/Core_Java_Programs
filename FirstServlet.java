package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("In constructor......");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
		System.out.println("in init.....");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		// TODO Auto-generated method stub
		System.out.println("in destroy.....");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("in service.....");
		String user= request.getParameter("user");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<h2> Welcome "+user+" reaching to this page </h2>");
	}

}
