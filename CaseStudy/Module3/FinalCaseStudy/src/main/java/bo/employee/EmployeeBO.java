package bo.employee;

import model.employee.Employee;

import java.util.List;

public interface EmployeeBO {
    List<Employee> findAll();

    void createEmployee(Employee employee);

    String update(Employee update);

    void delete(String id);
}
