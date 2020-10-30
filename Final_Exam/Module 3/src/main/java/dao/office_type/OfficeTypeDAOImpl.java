package dao.office_type;

import common.BaseDAO;
import model.OfficeType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficeTypeDAOImpl implements OfficeTypeDAO {
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<OfficeType> findAll() {
        List<OfficeType> officeTypeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from office_type;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                OfficeType officeType = new OfficeType(id, name);
                officeTypeList.add(officeType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return officeTypeList;
    }
}
