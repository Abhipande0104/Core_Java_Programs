package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String user= request.getParameter("user");
		int n1= Integer.parseInt(request.getParameter("num1"));
		int n2= Integer.parseInt(request.getParameter("num2"));
		int total= n1+n2;
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h2>Welcome on firstServlet....."+user+"</h2>");
		out.println("<h2>Total on firstServlet......."+total+"</h2>");
		out.println("<h2><a href=SecondServlet?user1="+user+"&sum="+total+">GotoSecond</a></h2>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
