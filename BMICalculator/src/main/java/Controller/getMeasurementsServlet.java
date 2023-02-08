package Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMICalculator;

/**
 * Servlet implementation class getMeasurementsServlet
 */
@WebServlet("/getMeasurementsServlet")
public class getMeasurementsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMeasurementsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userHeight = request.getParameter("userHeight");
		String userWeight = request.getParameter("userWeight");
		
		BMICalculator bmi = new BMICalculator(Integer.parseInt(userHeight),Double.parseDouble(userWeight));
		
		request.setAttribute("userBMI", bmi);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}
