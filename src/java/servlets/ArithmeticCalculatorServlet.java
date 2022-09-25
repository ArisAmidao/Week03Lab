package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String numFirst = request.getParameter("first");
        String numSecond = request.getParameter("second");
        String operation = request.getParameter("operation");
        String result = "---";
        
        int firstNum = Integer.parseInt(numFirst);
        int secNum = Integer.parseInt(numSecond);
        
        if(numFirst == null || numFirst.equals("") || numSecond == null || numSecond.equals("")){
            request.setAttribute("resultMessage", "Result: INVALID");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        if(numFirst.equals("") && numSecond.equals("")){
            request.setAttribute("resultMessage", "Result: ---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        switch (operation) {
            case "+":
                result = Integer.toString(firstNum + secNum);
                break;
            case "-":
                result = Integer.toString(firstNum - secNum);
                break;
            case "*":
                result = Integer.toString(firstNum * secNum);
                break;
            case "%":
                result = Integer.toString(firstNum % secNum);
                break;
            default:
                break;
        }
        
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }    
}
