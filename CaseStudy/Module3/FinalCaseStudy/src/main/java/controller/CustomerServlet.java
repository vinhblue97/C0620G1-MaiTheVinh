package controller;

import bo.customer.CustomerBO;
import bo.customer.CustomerBOImpl;
import bo.customer.type_of_customers.TypeOfCustomerBO;
import bo.customer.type_of_customers.TypeOfCustomerBOImpl;
import model.customer.Customer;
import model.customer.TypeOfCustomer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    CustomerBO customerBO = new CustomerBOImpl();
    TypeOfCustomerBO typeOfCustomerBO = new TypeOfCustomerBOImpl();

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
                listCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
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
                listCustomer(request, response);
                break;
            case "edit":
                editFormCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
        }
    }

    // function create customer
    private void createForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<TypeOfCustomer> typeOfCustomerList = this.typeOfCustomerBO.findAll();
        request.setAttribute("typeOfCustomerList", typeOfCustomerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/add_new_customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void creatCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<TypeOfCustomer> typeOfCustomerList = this.typeOfCustomerBO.findAll();
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
        Map<Integer, String> msg = this.customerBO.create(customer);

        if (msg.get(1).equals("Customer Name is not correct form") ||
                msg.get(2).equals("Customer Phone is not correct form") ||
                msg.get(3).equals("Customer Identify is not correct form") ||
                msg.get(4).equals("Customer Email is not correct form")) {
            request.setAttribute("typeOfCustomerList", typeOfCustomerList);
            request.setAttribute("correct_id", msg.get(10));
            request.setAttribute("correct_phone", msg.get(11));
            request.setAttribute("correct_id_card", msg.get(12));
            request.setAttribute("correct_email", msg.get(13));
            msg.remove(10);
            msg.remove(11);
            msg.remove(12);
            msg.remove(13);
            List<String> msgList = new ArrayList<>(msg.values());
            request.setAttribute("msgList", msgList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer/add_new_customer.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("/customer?action=list");
        }
    }

    // Fucntion list Customer
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerBO.findAll();
        List<TypeOfCustomer> typeOfCustomerList = this.typeOfCustomerBO.findAll();
        request.setAttribute("customerList", customerList);
        request.setAttribute("typeOfCustomerList", typeOfCustomerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/customer_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    Function edit customer

    private void editFormCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        List<TypeOfCustomer> typeOfCustomerList = this.typeOfCustomerBO.findAll();
        request.setAttribute("id", id);
        request.setAttribute("typeOfCustomerList", typeOfCustomerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/editForm.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String identify_card = request.getParameter("identify_card");
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        String gender = request.getParameter("gender");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String type_of_customer_id = request.getParameter("type_of_customer_id");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, identify_card, name, birthDay, gender, phone_number, email, type_of_customer_id, address);
        this.customerBO.edit(customer);
        response.sendRedirect("/customer?action=list");
    }

    // Function delete Customer
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        this.customerBO.delete(id);
        response.sendRedirect("/customer?action=list");
    }
}
