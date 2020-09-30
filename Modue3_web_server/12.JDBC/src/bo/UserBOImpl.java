package bo;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;

import java.util.ArrayList;
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
    public String create(Integer id, String name, String email, String country) {
        String message = "OK";
//        List<User> userList = this.userDAO.findAll();
//        if (userList != null) {
//            for (User user : userList) {
//                if (user.getId() == id) {
//                    message = "Id is existed";
//                }
//            }
//        }
        if (message.equals("OK")) {
            this.userDAO.create(id, name, email, country);
        }
        return message;
    }

}
