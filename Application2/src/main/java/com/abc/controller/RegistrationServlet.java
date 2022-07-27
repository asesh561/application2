package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    static
    {
    	System.out.println("Servlet Loading.......");
    }
	
	
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Servlet instantiation....");
    }
    public void init()
    {
    	System.out.println("Servlet initialization......");
    }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//setting the content type
				response.setContentType("text/html");
				
				//getting the writer Object 
				PrintWriter out = response.getWriter();
		
				out.println("<html><head><title>RegistrationDetails</title></head>");
				out.println("<body>");
				
				//getting the parameter data
				String employeeid = request.getParameter("enumber");
				System.out.println(employeeid);
				String employeename = request.getParameter("ename");
				String employeeage = request.getParameter("eage");
				String employeeAddress = request.getParameter("eaddress");
				
				
				//printing the details
				out.println("<table><tr>");
				out.println("<td>Employee ID=</td><td>"+employeeid+"</td></tr>");
				out.println("<tr><td>Employee Name=</td><td>"+employeename+"</td></tr>");
				out.println("<tr><td>Employee Age=</td><td>"+employeeage+"</td></tr>");
				out.println("<tr><td>Employee Address=</td><td>"+employeeAddress+"</td></tr>");
			
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
				
				out.close();
				
	}

}
