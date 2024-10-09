package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveReg")
public class SaveRgstrController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SaveRgstrController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOServiceImpl service= new DAOServiceImpl();
		service.connectDb();
		service.saveRegistration(name,city, email, mobile);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/new_reg.jsp");
		rd.forward(request, response);
	}

}
