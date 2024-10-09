package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addController")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        int num1 = Integer.parseInt(request.getParameter("num1"));
	        int num2 = Integer.parseInt(request.getParameter("num2"));
	        
	        Add a = new Add();
	        int result = a.addNumber(num1, num2);
	        request.setAttribute("result", result);
	        RequestDispatcher rd = request.getRequestDispatcher("A.jsp");
	        rd.forward(request, response);
	 }

}
