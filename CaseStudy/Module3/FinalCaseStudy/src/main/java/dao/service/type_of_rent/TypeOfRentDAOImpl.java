package dao.service.type_of_rent;

import common.BaseDAO;
import model.service.type_of_rent.TypeOfRent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeOfRentDAOImpl implements TypeOfRentDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<TypeOfRent> findAll() {
        List<TypeOfRent> typeOfRentList = new ArrayList<>();
        TypeOfRent typeOfRent;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name`, cost from type_rent;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String cost = resultSet.getString("cost");
                typeOfRent = new TypeOfRent(id, name, cost);
                typeOfRentList.add(typeOfRent);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeOfRentList;
    }
}
