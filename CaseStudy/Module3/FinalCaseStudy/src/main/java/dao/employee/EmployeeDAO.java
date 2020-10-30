package dao.employee;

import model.employee.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    void createEmployee(Employee employee);

    void update(Employee employee);

    void delete(String id);
}
