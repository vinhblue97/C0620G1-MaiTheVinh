package controller;

import bo.employee.EmployeeBO;
import bo.employee.EmployeeBOImpl;
import bo.employee.level.LevelBO;
import bo.employee.level.LevelBOImpl;
import bo.employee.office.OfficeBO;
import bo.employee.office.OfficeBOImpl;
import bo.employee.position.PositionBO;
import bo.employee.position.PositionBOImpl;
import model.employee.Employee;
import model.employee.Level;
import model.employee.Office;
import model.employee.Position;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {

    EmployeeBO employeeBO = new EmployeeBOImpl();
    PositionBO positionBO = new PositionBOImpl();
    LevelBO levelBO = new LevelBOImpl();
    OfficeBO officeBO = new OfficeBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
            case "list":
                employeeList(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "delete":
                delete(request, response);
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
                employeeList(request, response);
                break;
            case "update":
                updateForm(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
        }
    }

    // Function create new Employee
    private void createForm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Position> positionList = this.positionBO.findAll();
        List<Level> levelList = this.levelBO.findAll();
        List<Office> officeList = this.officeBO.findAll();
        request.setAttribute("positionList", positionList);
        request.setAttribute("levelList", levelList);
        request.setAttribute("officeList", officeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/add_new_employee.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.employeeBO.findAll();
        String id = String.valueOf(Employee.getCounter());
        String last_name = request.getParameter("last_name");
        String middle_name = request.getParameter("middle_name");
        String first_name = request.getParameter("first_name");
        String position_id = request.getParameter("position_id");
        String level_id = request.getParameter("level_id");
        String office_id = request.getParameter("office_id");
        String birth_day = request.getParameter("birth_day");
        String identify_card = request.getParameter("identify_card");
        String salary = request.getParameter("salary");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Employee employee = new Employee(id, last_name, middle_name, first_name, position_id, level_id, office_id, birth_day,
                identify_card, salary, phone_number, email, address);
        this.employeeBO.createEmployee(employee);
        response.sendRedirect("/employee?action=list");
    }

    //Function list employee
    private void employeeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Employee> employeeList = this.employeeBO.findAll();
        List<Position> positionList = this.positionBO.findAll();
        List<Level> levelList = this.levelBO.findAll();
        List<Office> officeList = this.officeBO.findAll();
        String checkUpdate = "KH";
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("levelList", levelList);
        request.setAttribute("officeList", officeList);
        request.setAttribute("checkUpdate", checkUpdate);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/employee_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    // Function update
    private void updateForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        List<Employee> employeeList = this.employeeBO.findAll();
        List<Position> positionList = this.positionBO.findAll();
        List<Level> levelList = this.levelBO.findAll();
        List<Office> officeList = this.officeBO.findAll();
        request.setAttribute("id", id);
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("levelList", levelList);
        request.setAttribute("officeList", officeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/employee_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Employee> employeeList = this.employeeBO.findAll();
        List<Position> positionList = this.positionBO.findAll();
        List<Level> levelList = this.levelBO.findAll();
        List<Office> officeList = this.officeBO.findAll();
        String checkUpdate = "";
        String id = request.getParameter("id");
        String last_name = request.getParameter("last_name");
        String middle_name = request.getParameter("middle_name");
        String first_name = request.getParameter("first_name");
        String position = request.getParameter("position_id");
        String level = request.getParameter("level_id");
        String office = request.getParameter("office_id");
        String birth_day = request.getParameter("birth_day");
        String identify_card = request.getParameter("identify_card");
        String salary = request.getParameter("salary");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Employee employee = new Employee(id, last_name, middle_name, first_name, position, level, office, birth_day,
                identify_card, salary, phone_number, email, address);
        checkUpdate = this.employeeBO.update(employee);
        request.setAttribute("checkUpdate", checkUpdate);
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("levelList", levelList);
        request.setAttribute("officeList", officeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/employee_list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function delete Employee
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        this.employeeBO.delete(id);
        response.sendRedirect("/employee?action=list");
    }

    private void findById(String id) {

    }

}
