package dao;

import common.BaseDAO;
import jdk.nashorn.internal.codegen.CompilerConstants;
import model.Customer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    private BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall("call display_customer_list()");
            ResultSet resultSet = callableStatement.executeQuery();
            Customer.index = 1;
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                String gender = resultSet.getString("gender");
                String identify_card = resultSet.getString("identify_card");
                String phone_number = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String type_of_customer_id = resultSet.getString("type_of_customer_id");
                String address = resultSet.getString("address");
                Customer customer = new Customer(name, birthday, Integer.valueOf(gender), identify_card, phone_number, email, Integer.valueOf(type_of_customer_id), address);
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
            CallableStatement callableStatement = connection.prepareCall("call set_foreign_key_off()");
            ResultSet resultSet = callableStatement.executeQuery();
            callableStatement = connection.prepareCall("call create_customer(?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, customer.getName());
            callableStatement.setString(2, customer.getBirthday());
            callableStatement.setInt(3, customer.getGender());
            callableStatement.setString(4, customer.getIdentify_card());
            callableStatement.setString(5, customer.getPhone_number());
            callableStatement.setString(6, customer.getEmail());
            callableStatement.setInt(7, customer.getType_of_customer_id());
            callableStatement.setString(8, customer.getAddress());
            int resutlSet = callableStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(Customer customer) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call set_foreign_key_off()");
            ResultSet resultSet = callableStatement.executeQuery();
            callableStatement = connection.prepareCall("call edit_customer(?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, customer.getName());
            callableStatement.setString(2, customer.getBirthday());
            callableStatement.setInt(3, customer.getGender());
            callableStatement.setString(4, customer.getIdentify_card());
            callableStatement.setString(5, customer.getPhone_number());
            callableStatement.setString(6, customer.getEmail());
            callableStatement.setInt(7, customer.getType_of_customer_id());
            callableStatement.setString(8, customer.getAddress());
            int resutlSet = callableStatement.executeUpdate();
            callableStatement = connection.prepareCall("call set_foreign_key_on()");
            resultSet = callableStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String customer_id_card) {
        try {
            CallableStatement callableStatement = connection.prepareCall("call set_foreign_key_off()");
            ResultSet resultSet = callableStatement.executeQuery();
            callableStatement = connection.prepareCall("call delete_customer(?)");
            callableStatement.setString(1, customer_id_card);
            int resutlSet = callableStatement.executeUpdate();
            callableStatement = connection.prepareCall("call set_foreign_key_on()");
            resultSet = callableStatement.executeQuery();
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
