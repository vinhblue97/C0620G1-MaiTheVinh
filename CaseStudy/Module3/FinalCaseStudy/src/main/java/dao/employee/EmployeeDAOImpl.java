package dao.employee;

import bo.employee.EmployeeBO;
import common.BaseDAO;
import model.employee.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            Employee.counter = 1;
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String last_name = resultSet.getString("last_name");
                String middle_name = resultSet.getString("middle_name");
                String first_name = resultSet.getString("first_name");
                String position_id = resultSet.getString("position_id");
                String level_id = resultSet.getString("level_id");
                String office_id = resultSet.getString("office_id");
                String birth_day = resultSet.getString("birth_day");
                String identify_card = resultSet.getString("identify_card");
                String salary = resultSet.getString("salary");
                String phone_number = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Employee employee = new Employee(id, last_name, middle_name, first_name, position_id, level_id, office_id,
                        birth_day, identify_card, salary, phone_number, email, address);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void createEmployee(Employee employee) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call set_foreign_key_off()");
            callableStatement.executeQuery();
            callableStatement = connection.prepareCall("call create_employee(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, employee.getId());
            callableStatement.setString(2, employee.getLast_name());
            callableStatement.setString(3, employee.getMiddle_name());
            callableStatement.setString(4, employee.getFirst_name());
            callableStatement.setString(5, employee.getPosition_id());
            callableStatement.setString(6, employee.getLevel_id());
            callableStatement.setString(7, employee.getOffice_id());
            callableStatement.setString(8, employee.getBirth_day());
            callableStatement.setString(9, employee.getIdentify_card());
            callableStatement.setString(10, employee.getSalary());
            callableStatement.setString(11, employee.getPhone_number());
            callableStatement.setString(12, employee.getEmail());
            callableStatement.setString(13, employee.getAddress());
            callableStatement.executeUpdate();
            callableStatement = connection.prepareCall("call set_foreign_key_on()");
            callableStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Employee employee) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call update_employee(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, employee.getId());
            callableStatement.setString(2, employee.getLast_name());
            callableStatement.setString(3, employee.getMiddle_name());
            callableStatement.setString(4, employee.getFirst_name());
            callableStatement.setString(5, employee.getPosition_id());
            callableStatement.setString(6, employee.getLevel_id());
            callableStatement.setString(7, employee.getOffice_id());
            callableStatement.setString(8, employee.getBirth_day());
            callableStatement.setString(9, employee.getIdentify_card());
            callableStatement.setString(10, employee.getSalary());
            callableStatement.setString(11, employee.getPhone_number());
            callableStatement.setString(12, employee.getEmail());
            callableStatement.setString(13, employee.getAddress());
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call set_foreign_key_off()");
            callableStatement.executeQuery();
            callableStatement = connection.prepareCall("delete from employees where id = ?");
            callableStatement.setString(1, id);
            callableStatement.executeUpdate();
            callableStatement = connection.prepareCall("call set_foreign_key_on()");
            callableStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
