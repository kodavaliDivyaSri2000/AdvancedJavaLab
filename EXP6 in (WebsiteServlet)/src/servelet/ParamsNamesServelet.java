package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamsNamesServelet
 */
@WebServlet("/ParamsNamesServelet")
public class ParamsNamesServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParamsNamesServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Enumeration paramnames = request.getParameterNames();
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<th>Name of the Parameter</th>");
		out.println("<th>Value of the parameter</th>");
		out.println("</tr>");
		
		while(paramnames.hasMoreElements()) {
			String paramname=paramnames.nextElement().toString();
			String paramvalue=request.getParameter(paramname);
			out.println("<tr>");
			out.println("<td>"+paramname+"</td>");
			out.println("<td>"+paramvalue+"</td>");
			out.println("</tr>");
			
			
		}
		out.println("</table>");

	}

}
