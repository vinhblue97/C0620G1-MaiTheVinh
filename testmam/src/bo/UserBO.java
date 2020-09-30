package bo;

import model.User;

import java.util.List;

public interface UserBO {

    List<User> findAll();

    String create(Integer id, String name, String email, String country);
}
