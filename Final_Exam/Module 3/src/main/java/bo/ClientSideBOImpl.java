package bo;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import model.ClientSide;

import java.util.List;

public class ProductBOImpl implements ProductBO {
    ProductDAO productDao = new ProductDAOImpl();

    @Override
    public void create(ClientSide clientSide) {
        this.productDao.create(clientSide);
    }

    @Override
    public List<ClientSide> findAll() {
        return this.productDao.findAll();
    }

    @Override
    public List<ClientSide> find(String name, String price) {
        return this.productDao.find(name, price);
    }


    @Override
    public String delete(String id) {
        this.productDao.delete(id);
        return "null";
    }
}
