package controller;

import bo.contract.ContractBO;
import bo.contract.ContractBOImpl;
import bo.customer.CustomerBO;
import bo.customer.CustomerBOImpl;
import bo.employee.EmployeeBO;
import bo.employee.EmployeeBOImpl;
import bo.service.ServiceBO;
import bo.service.ServiceBOImpl;
import dao.contract.ContractDAO;
import dao.contract.ContractDAOImpl;
import model.contract.Contract;
import model.customer.Customer;
import model.employee.Employee;
import model.service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {

    EmployeeBO employeeBO = new EmployeeBOImpl();
    CustomerBO customerBO = new CustomerBOImpl();
    ServiceBO serviceBO = new ServiceBOImpl();
    ContractBO contractBO = new ContractBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "list":
                listContract(request, response);
                break;
            case "create":
                createContract(request, response);
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
                listContract(request, response);
                break;
            case "create":
                createForm(request, response);
                break;
        }
    }

    //Function create contract
    private void createForm(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = this.employeeBO.findAll();
        List<Customer> customerList = this.customerBO.findAll();
        List<Service> serviceList = this.serviceBO.findAll();
        request.setAttribute("employeeList",employeeList);
        request.setAttribute("customerList",customerList);
        request.setAttribute("serviceList",serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create_contract.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        String employee = request.getParameter("employee");
        String customer = request.getParameter("customer");
        String service = request.getParameter("service");
        String begin_date = request.getParameter("begin_date");
        String end_date = request.getParameter("end_date");
        String deposists = request.getParameter("deposists");
        String total_cost = request.getParameter("total_cost");
        Contract contract = new Contract(id, employee, customer, service, begin_date, end_date, deposists, total_cost);
        this.contractBO.create(contract);
        response.sendRedirect("/contract?action=list");
    }

    //Function list contract

    private void listContract(HttpServletRequest request, HttpServletResponse response) {
        List<Contract> contractList = this.contractBO.findAll();
        request.setAttribute("contractList", contractList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/list_contract.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
