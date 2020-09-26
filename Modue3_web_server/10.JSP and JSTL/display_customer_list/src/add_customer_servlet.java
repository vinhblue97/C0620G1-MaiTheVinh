import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import customer.Customer;

@WebServlet(name = "add_customer_servlet", urlPatterns = {"","/add_customer"})
public class add_customer_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerlist = new ArrayList<>();
        customerlist.add(new  Customer("Mai Thế Vinh","1997-03-31","Đà Nẵng", "img/songoku.jpg"));
        customerlist.add(new  Customer("Hoàng Minh Quân","1992-07-15","Sài Gòn", "img/naruto.jpg"));

        request.setAttribute("customerList", customerlist);
        request.getRequestDispatcher("customer_list.jsp").forward(request,response);
    }
}
