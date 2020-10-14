package bo.catefory;

import dao.category.CategoryDAO;
import dao.category.CategoryDAOImpl;
import model.Category;

import java.util.List;

public class CategoryBOImpl implements CategoryBO {
    CategoryDAO categoryDAO = new CategoryDAOImpl();
    @Override
    public List<Category> findAll() {
        return this.categoryDAO.findAll();
    }
}
