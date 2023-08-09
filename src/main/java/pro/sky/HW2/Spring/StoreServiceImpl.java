package pro.sky.HW2.Spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImpl implements StoreService {
         private final Map<Integer, Product> products = new HashMap<>();

    public StoreServiceImpl() {


        products.put(1, new Product("apple"));
        products.put(2, new Product("banana"));
        products.put(3, new Product("cherry"));
    }

    public Map<Integer, Product> basket() {
        return products;
    }

//    public String add(Integer id) {
//        return products.put(id, "pineapple");
//    }
}
