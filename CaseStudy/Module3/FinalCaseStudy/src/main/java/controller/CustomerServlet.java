package controller;

import bo.customer.CustomerBO;
import bo.customer.CustomerBOImpl;
import model.customer.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    CustomerBO customerBO = new CustomerBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                creatCustomer(request, response);
                break;
            case "list":
                listCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createForm(request, response);
                break;
            case "list":
                listCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
        }
    }

    // function create customer
    private void createForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("customer/add_new_customer.jsp");
    }

    private void creatCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String identify_card = request.getParameter("identify_card");
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        String gender = request.getParameter("gender");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String type_of_customer_id = request.getParameter("type_of_customer_id");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, identify_card, name, birthDay, gender, phone_number, email,
                type_of_customer_id, address);
        this.customerBO.create(customer);
        response.sendRedirect("/customer?action=list");
    }

    // Fucntion list Customer
    private void listCustomer(HttpServletRequest request, HttpServletResponse response){
        List<Customer> customerList= this.customerBO.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/customer_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function delete Customer
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        this.customerBO.delete(id);
        response.sendRedirect("/customer?action=list");
    }
}
