package product;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<String,Product> productList;

    static {
        productList = new HashMap<>();
        productList.put("1",new Product("1","Laptop Apple MacBook Air 13\" 2019 MVFM2SA/A","31.990.000đ","Core i5/8GB/128GB SSD/UHD 617/macOS/1.3 kg","APPLE"));
        productList.put("2",new Product("2","Laptop Acer Swift 3 SF314-41-R4J1","12.990.000đ","14\" FHD/R3-3200U/4GB/256GB SSD/Radeon Vega 3/Win10/1.5 kg","ACER"));
        productList.put("3",new Product("3","Laptop HP14s-dk0097AU7VH92PA","9.090.000đ","14\"HD/AMD Ryzen 3 3200U/4GB/1TBHDD/Windows 10 Home 64-bit/1.5kg","HP"));
        productList.put("4",new Product("4","Laptop Acer Aspire 5 A514-52-54L3","12.090.000đ","14\" FHD/i5-8265U/4GB/1TB HDD/UHD 620/Win10/1.7 kg","ACER"));
        productList.put("5",new Product("5","Laptop ASUS ROG Strix G G531GT-AL017T","27.990.000đ","15\" FHD/i7-9750H/8GB/512GB SSD/GTX 1650/Win10/2.3 kg","ASUS"));
        productList.put("6",new Product("6","Laptop Dell G3 15 3590-N5I5517W","23.490.000đ","15\" FHD/i5-9300H/8GB/256GB SSD/GTX 1050/Win10/2.3kg","DELL"));

    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);

    }

    @Override
    public Product findById(String id) {
        return productList.get(id);
    }

    @Override
    public void findByName(String name) {

    }

    @Override
    public void productDetail(String id) {

    }

    @Override
    public void update(String id, Product product) {
        productList.put(id,product);
    }

    @Override
    public void remove(String id) {
        productList.remove(id);
    }
}
