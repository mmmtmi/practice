package try1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MoInt;

/**
 * Servlet implementation class Test112903
 */
@WebServlet("/Test112903")
public class Test112903 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/jsp/Test112904.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String num = request.getParameter("number");
		MoInt moInt = new MoInt();
		moInt.setNum( (int) Double.parseDouble(num));
		request.setAttribute("1", moInt);
		RequestDispatcher disp = request.getRequestDispatcher("WEB-INF/jsp/kekka2.jsp");
		disp.forward(request, response);
	}

}
