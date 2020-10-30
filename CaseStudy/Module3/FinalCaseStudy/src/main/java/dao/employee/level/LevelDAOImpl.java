package dao.employee.level;

import bo.employee.level.LevelBO;
import common.BaseDAO;
import model.employee.Level;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LevelDAOImpl implements LevelDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<Level> findAll() {
        List<Level> levelList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from employee_level");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                Level level = new Level(id, name);
                levelList.add(level);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return levelList;
    }
}
