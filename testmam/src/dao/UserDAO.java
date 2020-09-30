package dao;

import model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    void create(Integer id, String name, String email, String country);
}
