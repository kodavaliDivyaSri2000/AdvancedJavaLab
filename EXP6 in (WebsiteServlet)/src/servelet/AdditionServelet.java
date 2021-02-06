package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServelet
 */
@WebServlet("/AdditionServelet")
public class AdditionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int a=Integer.parseInt(request.getParameter("n1"));
        int b=Integer.parseInt(request.getParameter("n2"));

        int c=a+b;
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<td>First Number:" + a + "</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>second Number:" + b + "</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>Sum of Two numbers is:" + c + "</td>");
        out.println("</tr>");
        out.println("</table>"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
