package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amida
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("CurrentAge").equals("") || request.getParameter("CurrentAge")== null) {
            request.setAttribute("nextAge", "You must enter your current Age!");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
                    return;
        }
        
        int CurrentAge = Integer.parseInt(request.getParameter("CurrentAge"));
        int nextAge = CurrentAge + 1;
        
        request.setAttribute("CurrentAge", CurrentAge);
        request.setAttribute("nextAge", "Your age next birthday will be: " + nextAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
    }
}
