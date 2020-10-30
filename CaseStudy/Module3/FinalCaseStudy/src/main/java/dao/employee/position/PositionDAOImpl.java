package dao.employee.position;

import bo.employee.position.PositionBO;
import common.BaseDAO;
import model.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionDAOImpl implements PositionDAO {

    BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();
    @Override
    public List<Position> findAll() {
        List<Position> positionList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select id, `name` from employee_position");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                Position position = new Position(id,name);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionList;
    }
}
