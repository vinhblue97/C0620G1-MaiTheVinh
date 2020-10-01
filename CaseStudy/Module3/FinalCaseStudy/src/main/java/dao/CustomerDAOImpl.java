package dao;

import common.BaseDAO;
import model.customer.Customer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<>();
        try {
            Customer.counter = 1;
            CallableStatement callableStatement = connection.prepareCall("call display_customer_list()");
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String identify_card = resultSet.getString("identify_card");
                String name = resultSet.getString("name");
                String birthDay = resultSet.getString("birthDay");
                String gender = resultSet.getString("gender");
                String phone_number = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String type_of_customer_id = resultSet.getString("type_of_customer_id");
                String address = resultSet.getString("address");

                Customer customer = new Customer(id, identify_card, name, birthDay, gender, phone_number, email,
                        type_of_customer_id, address);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }

    @Override
    public void create(Customer customer) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call create_customer(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, customer.getId());
            callableStatement.setString(2, customer.getIdentify_card());
            callableStatement.setString(3, customer.getName());
            callableStatement.setString(4, customer.getBirthDay());
            callableStatement.setString(5, customer.getGender());
            callableStatement.setString(6, customer.getPhone_number());
            callableStatement.setString(7, customer.getEmail());
            callableStatement.setString(8, customer.getType_of_customer_id());
            callableStatement.setString(9, customer.getAddress());
            int resultSet = callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void edit(Customer customer) {

    }

    @Override
    public void delete(String id) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call delete_customer(?)");
            callableStatement.setString(1, id);
            int resultSet = callableStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> find(String search) {
        return null;
    }

    @Override
    public List<Customer> findById(String id) {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }
}
