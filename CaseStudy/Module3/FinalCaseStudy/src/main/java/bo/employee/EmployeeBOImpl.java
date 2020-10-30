package bo.employee;

import common.Validate;
import dao.employee.EmployeeDAO;
import dao.employee.EmployeeDAOImpl;
import model.employee.Employee;

import java.util.List;

public class EmployeeBOImpl implements EmployeeBO {

    EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @Override
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();

    }

    @Override
    public void createEmployee(Employee employee) {
        this.employeeDAO.createEmployee(employee);
    }

    @Override
    public String update(Employee employee) {
        String msg = "Not OK";
        if (Validate.validateEmployeeName(employee.getLast_name()).equals("OK")) {
            msg = "OK";
            this.employeeDAO.update(employee);
        }
        return msg;
    }


    @Override
    public void delete(String id) {
        this.employeeDAO.delete(id);
    }

}
