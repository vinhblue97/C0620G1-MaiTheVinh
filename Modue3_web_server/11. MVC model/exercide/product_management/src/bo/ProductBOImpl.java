package bo;

import model.Product;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductBOImpl implements ProductBO {
    private static Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Laptop Apple MacBook Air 13\" 2019 MVFM2SA/A", "31.990.000đ", "Core i5/8GB/128GB SSD/UHD 617/macOS/1.3 kg", "APPLE"));
        productList.put(2, new Product(2, "Laptop Acer Swift 3 SF314-41-R4J1", "12.990.000đ", "14\" FHD/R3-3200U/4GB/256GB SSD/Radeon Vega 3/Win10/1.5 kg", "ACER"));
        productList.put(3, new Product(3, "Laptop HP14s-dk0097AU7VH92PA", "9.090.000đ", "14\"HD/AMD Ryzen 3 3200U/4GB/1TBHDD/Windows 10 Home 64-bit/1.5kg", "HP"));
        productList.put(4, new Product(4, "Laptop Acer Aspire 5 A514-52-54L3", "12.090.000đ", "14\" FHD/i5-8265U/4GB/1TB HDD/UHD 620/Win10/1.7 kg", "ACER"));
        productList.put(5, new Product(5, "Laptop ASUS ROG Strix G G531GT-AL017T", "27.990.000đ", "15\" FHD/i7-9750H/8GB/512GB SSD/GTX 1650/Win10/2.3 kg", "ASUS"));
        productList.put(6, new Product(6, "Laptop Dell G3 15 3590-N5I5517W", "23.490.000đ", "15\" FHD/i5-9300H/8GB/256GB SSD/GTX 1050/Win10/2.3kg", "DELL"));

    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product search(String search) {
        Product product = new Product();
        Pattern patternId = Pattern.compile("^[0-9]*$");
        if (patternId.matcher(search).matches()) {
            product = findById(Integer.parseInt(search));
        } else {
            product = findByName(search);
        }
        return product;
    }

    @Override
    public Product findById(Integer id) {
        productList.get(id).getName();
        return productList.get(id);
    }


    @Override
    public Product findByName(String name) {
        Product product = new Product();
        for (Integer key : productList.keySet()) {
            if (productList.get(key).getName().equals(name)) {
                productList.get(key).getName();
                product = productList.get(key);
                break;
            }
        }
        return product;
    }

    @Override
    public void update(Integer id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void remove(String id) {
        productList.remove(Integer.parseInt(id));
    }
}
