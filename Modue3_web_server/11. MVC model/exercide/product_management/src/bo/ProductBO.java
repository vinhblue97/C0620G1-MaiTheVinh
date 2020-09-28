package bo;

import model.Product;

import java.util.List;

public interface ProductBO {

    List<Product> findAll();        // hiển thị danh sách

    void save(Product product);

    Product search(String search);

    Product findById(Integer id);

    Product findByName(String name);

    void update(Integer id, Product product);

    void remove(String id);

}
