package servlet;

import customer.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "add_new_customer_servlet", urlPatterns = "/add_customer")
public class add_new_customer_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        String customer_gender = request.getParameter("customer_gender");
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_type = request.getParameter("customer_type");
        String customer_address = request.getParameter("customer_address");
        Customer new_customer = new Customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_type,customer_address);
        Customer.customerList.add(new_customer);
        request.setAttribute("customer_list", Customer.customerList);
        request.getRequestDispatcher("customer_list.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
