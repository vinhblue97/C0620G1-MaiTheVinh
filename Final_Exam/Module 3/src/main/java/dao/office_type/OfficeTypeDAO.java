package dao.category;

import model.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> findAll();
}
