package controller;

import bo.customer.CustomerBO;
import bo.customer.CustomerBOImpl;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    CustomerBO customerBO = new CustomerBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "list":
                listCustomer(request, response);
                break;
            case "create":
                createNewCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "list":
                listCustomer(request, response);
                break;
            case "create":
                createNewCustomerForm(request, response);
                break;
            case "edit":
                editCustomerForm(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "find":
                findCustomer(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    private void homePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("home_page.jsp");
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerBO.findAll();
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

    private void createNewCustomerForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("customer/add_new_customer.jsp");
    }

    private void createNewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        String customer_gender = request.getParameter("customer_gender");
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_type = request.getParameter("customer_type");
        String customer_address = request.getParameter("customer_address");
        this.customerBO.create(new Customer(customer_name, customer_birthday, Integer.parseInt(customer_gender), customer_id_card, customer_phone, customer_email, Integer.parseInt(customer_type), customer_address));
        response.sendRedirect("/customer?action=list");
    }

    private void editCustomerForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String customer_id_card = request.getParameter("customer_id_card");
        request.setAttribute("customer_id_card", customer_id_card);
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
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = request.getParameter("customer_birthday");
        String customer_gender = request.getParameter("customer_gender");
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_type = request.getParameter("customer_type");
        String customer_address = request.getParameter("customer_address");
        this.customerBO.edit(new Customer(customer_name, customer_birthday, Integer.parseInt(customer_gender), customer_id_card, customer_phone, customer_email, Integer.parseInt(customer_type), customer_address));
        response.sendRedirect("/customer?action=list");
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String customer_id_card = request.getParameter("customer_id_card");
        this.customerBO.delete(customer_id_card);
        response.sendRedirect("/customer?action=list");
    }

    private void findCustomer(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        List<Customer> customerList = this.customerBO.find(search);
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/find.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
