package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "calculator", urlPatterns = "/calculator")
public class calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder finalResult = new StringBuilder("");
        Pattern pattern = Pattern.compile("^\\s[0-9]*$");
        String annouce = " ";
        java.lang.String first_operand = request.getParameter("first_operand");
        Matcher matcher1 = pattern.matcher(first_operand);
        java.lang.String select = request.getParameter("select");
        java.lang.String second_operand = request.getParameter("second_operand");
        Matcher matcher2 = pattern.matcher(second_operand);
        if(matcher1.matches()&&matcher2.matches()){
            double result = 0;
            if(select.equals("Addition")){
                result = Integer.parseInt(first_operand)+Integer.parseInt(second_operand);
                finalResult.append(first_operand).append(" + ").append(second_operand).append(" = ").append(result);
            }
            else if(select.equals("Subtraction")){
                result = Integer.parseInt(first_operand)-Integer.parseInt(second_operand);
                finalResult.append(first_operand).append(" - ").append(second_operand).append(" = ").append(result);
            }
            else if(select.equals("Multiplication")){
                result = Integer.parseInt(first_operand)*Integer.parseInt(second_operand);
                finalResult.append(first_operand).append(" x ").append(second_operand).append(" = ").append(result);
            }
            else if(select.equals("Division")){
                result = Integer.parseInt(first_operand)/Integer.parseInt(second_operand);
                finalResult.append(first_operand).append(" / ").append(second_operand).append(" = ").append(result);
            }
            request.setAttribute("result", finalResult.toString());
            request.getRequestDispatcher("calculate.jsp").forward(request,response);
        }
        else if (first_operand.equals(" ")||second_operand.equals(" ")){
            request.setAttribute("announce", annouce);
         request.getRequestDispatcher("index.jsp").forward(request,response);
        }


    }
}
