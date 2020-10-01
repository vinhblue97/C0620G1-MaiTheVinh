package bo;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserBO {

    List<User> findAll();

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);

    void editUser(User user);
}

