package dao;

import common.BaseDAO;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select id, name, email, country " +
                    "from user ");
            ResultSet resultSet = preparedStatement.executeQuery();

            User user;
            while (resultSet.next()) {
                Integer id = Integer.valueOf(resultSet.getString("id"));
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void create(Integer id, String name, String email, String country) {

        String values ="insert into user(id, `name`, email, country) value (1,'Mai The Vinh', 'vinhblue97@gmail.com','Quang Tri');";

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("insert into user(id, name, email, country) values (?,?,?,?);");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, country);
            int resultSet = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
