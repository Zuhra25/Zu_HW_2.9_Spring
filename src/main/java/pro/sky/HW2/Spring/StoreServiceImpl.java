package pro.sky.HW2.Spring;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoreServiceImpl implements StoreService {
     private final Map<Integer, String> products = new HashMap<>();

    public StoreServiceImpl() {
        products.put(1, "apple");
        products.put(2, "banana");
        products.put(3, "cherry");
    }

    public Map<Integer, String> basket(){
        return products;
    }

    public String add(){
        return "hi";
    }
}
