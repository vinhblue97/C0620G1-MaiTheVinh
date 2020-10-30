package dao.employee.office;

import common.BaseDAO;
import model.employee.Office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficeDAOImpl implements OfficeDAO{
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<Office> findAll() {
        List<Office> officeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from offices");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                Office office = new Office(id, name);
                officeList.add(office);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return officeList;
    }
}
