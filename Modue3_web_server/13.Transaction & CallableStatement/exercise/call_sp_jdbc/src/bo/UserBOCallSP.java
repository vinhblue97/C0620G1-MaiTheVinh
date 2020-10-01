package bo;

import dao.UserDaoCallSP;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class UserBOCallSP implements UserBO {
    UserDaoCallSP userDaoCallSP = new UserDaoCallSP();
    @Override
    public List<User> findAll() {
        return this.userDaoCallSP.findAll();
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
