package dao.customer.type_of_customers;

import bo.customer.type_of_customers.TypeOfCustomerBO;
import common.BaseDAO;
import model.customer.TypeOfCustomer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TypeOfCustomerDAOImpl implements TypeOfCustomerDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<TypeOfCustomer> findAll() {
        List<TypeOfCustomer> typeOfCustomerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from type_of_customers");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                TypeOfCustomer typeOfCustomer = new TypeOfCustomer(id, name);
                typeOfCustomerList.add(typeOfCustomer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeOfCustomerList;
    }
}
