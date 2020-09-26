import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "display_discount_servlet", urlPatterns = "/display_discount")
public class display_discount_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String desciption = request.getParameter("desciption");
        String cost = request.getParameter("cost");
        String discount_percent = request.getParameter("discount_percent");
        float discount_amount = Integer.parseInt(cost)*Integer.parseInt(discount_percent)/100;
        request.setAttribute("discount_amount",String.valueOf(discount_amount));
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
