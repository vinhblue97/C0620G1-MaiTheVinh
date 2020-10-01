package bo;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserBOImpl implements UserBO {

    UserDAO userDAO = new UserDAOImpl();
    Map<Integer, User> userMap;

    @Override
    public List<User> findAll() {
        return this.userDAO.findAll();
    }

    @Override
    public User getUserById(int id) {
        User existingUser = userDAO.getUserById(id);
        return existingUser;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userDAO.insertUserStore(user);
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        this.userDAO.addUserTransaction(user,permision);
    }

}
