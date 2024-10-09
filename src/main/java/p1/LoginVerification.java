package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/verificationLogin")
public class LoginVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginVerification() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName);
		System.out.println(password);

		DAOServiceImpl serviceImpl= new DAOServiceImpl();
		serviceImpl.connectDb();
		boolean status = serviceImpl.verifyLogin(userName, password);
		System.out.println(status);
			if (status) {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/new_reg.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("msg", "invalid/userName password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
	}

}
