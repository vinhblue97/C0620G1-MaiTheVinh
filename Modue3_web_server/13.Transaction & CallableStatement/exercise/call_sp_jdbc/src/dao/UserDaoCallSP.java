package dao;

import common.BaseDAO;
import model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoCallSP implements UserDAO {

    private BaseDAO baseDAO = new BaseDAO();
    Connection connection = this.baseDAO.getConnection();

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall("call display_list_user()");
            ResultSet resultSet = callableStatement.executeQuery();
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
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {

    }

    @Override
    public void addUserTransaction(User user, int[] permision) {

    }

    @Override
    public void editUser(User user) {

    }
}
