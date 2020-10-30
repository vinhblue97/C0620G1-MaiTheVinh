package dao.contrac_detail.extra_service;

import common.BaseDAO;
import model.contract_detail.ExtraService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExtraServiceDAOImpl implements ExtraServiceDAO {
    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<ExtraService> findAll() {
        List<ExtraService> extraServiceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =connection.prepareStatement("select id, `name`, cost, unit from extra_service;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String cost = resultSet.getString("cost");
                String unit = resultSet.getString("unit");
                ExtraService extraService = new ExtraService(id, name, cost, unit);
                extraServiceList.add(extraService);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return extraServiceList;
    }
}
