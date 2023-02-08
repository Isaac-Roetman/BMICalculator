package Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMICalculator;

/**
 * Servlet implementation class getAgeServlet
 */
@WebServlet("/getAgeServlet")
public class getAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAgeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAge = request.getParameter("userAge");
		
		BMICalculator age = new BMICalculator(Integer.parseInt(userAge));
		request.setAttribute("userBMI", age);
		
		getServletContext().getRequestDispatcher("/measurements.jsp").forward(request, response);
	
	}

}
