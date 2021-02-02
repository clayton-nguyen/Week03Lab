package Servlets;

/**
 *
 * @author 809882
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int finalVal = 0;
        String whichButton = request.getParameter("operation");

        String fValue = request.getParameter("first_val");
        String sValue = request.getParameter("second_val");
        
        switch(whichButton) {
            case "+": if (fValue.isEmpty() && !sValue.isEmpty() || !fValue.isEmpty() && sValue.isEmpty() || fValue.isEmpty() && sValue.isEmpty()) {
                        request.setAttribute("result", "invalid");
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                        }
            case "-": if (fValue.isEmpty() && !sValue.isEmpty() || !fValue.isEmpty() && sValue.isEmpty() || fValue.isEmpty() && sValue.isEmpty()) {
                        request.setAttribute("result", "invalid");
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                        }
            case "*": if (fValue.isEmpty() && !sValue.isEmpty() || !fValue.isEmpty() && sValue.isEmpty() || fValue.isEmpty() && sValue.isEmpty()) {
                        request.setAttribute("result", "invalid");
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                        }
            case "%": if (fValue.isEmpty() && !sValue.isEmpty() || !fValue.isEmpty() && sValue.isEmpty() || fValue.isEmpty() && sValue.isEmpty()) {
                        request.setAttribute("result", "invalid");
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                        }
             
        }
        
        if (whichButton == null) {

        } else if (whichButton.equals("+")) {
            int firstValue = Integer.parseInt(fValue);
            int secondValue = Integer.parseInt(sValue);
            finalVal = firstValue + secondValue;
            request.setAttribute("result", finalVal);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } else if (whichButton.equals("-")) {
            int firstValue = Integer.parseInt(fValue);
            int secondValue = Integer.parseInt(sValue);
            finalVal = firstValue - secondValue;
            request.setAttribute("result", finalVal);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } else if (whichButton.equals("*")) {
            int firstValue = Integer.parseInt(fValue);
            int secondValue = Integer.parseInt(sValue);
            finalVal = firstValue * secondValue;
            request.setAttribute("result", finalVal);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } else if (whichButton.equals("%")) {
            int firstValue = Integer.parseInt(fValue);
            int secondValue = Integer.parseInt(sValue);
            finalVal = firstValue % secondValue;
            request.setAttribute("result", finalVal);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        else {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        

    }

}
