package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServelet
 */
@WebServlet("/FirstServelet")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pname = request.getParameter("personname");
		
		
		out.println("<h1> Hello, "+pname+". This is my First servlet</h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pname = request.getParameter("personname");
		String pwd = request.getParameter("password");
		String gen = request.getParameter("gender");
		String sems[] = request.getParameterValues("sems");
		ArrayList list = new ArrayList(Arrays.asList(sems));
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String examtime = request.getParameter("examtime");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>Person Name</td><td>" + pname +"</td>");
		out.println("</tr>");
			
		out.println("<tr>");
		out.println("<td>Password</td><td>" + pwd +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Gender</td><td>" + gen +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Sems studied</td><td>" + list.toString() +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>DOB</td><td>" + dob +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Mobile Number</td><td>" + mobile +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Exam time</td><td>" + examtime +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Address</td><td>" + address +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>E-mail</td><td>" + email +"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Course</td><td>" + course +"</td>");
		out.println("</tr>");
		
		out.println("</table>");
		
		//out.println("<h1> Hello, "+pname+". This is my First servlet</h1>");
	}

}
