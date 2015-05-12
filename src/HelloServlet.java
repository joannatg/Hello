

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Date date = new Date();
		String name = request.getParameter("name");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h2>Hello from Servlet " + date + "</h2>");
		out.print("This is amazing!");
		out.print ("</body></html>");
		
		System.out.println("Servlet invoked " + date);
	}

}
