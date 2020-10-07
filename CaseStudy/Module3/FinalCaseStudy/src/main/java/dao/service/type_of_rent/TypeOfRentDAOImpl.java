package dao.service.type_of_service;

import bo.customer.type_of_customers.TypeOfCustomerBO;
import common.BaseDAO;
import model.customer.TypeOfCustomer;
import model.service.type_of_service.TypeOfService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeOfServiceDAOImpl implements TypeOfServiceDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<TypeOfService> findAll() {
        List<TypeOfService> typeOfServiceList = new ArrayList<>();
        TypeOfService typeOfService;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from type_of_service");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                typeOfService = new TypeOfService(id, name);
                typeOfServiceList.add(typeOfService);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeOfServiceList;
    }
}
