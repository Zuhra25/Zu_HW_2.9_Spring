package pro.sky.HW2.Spring;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {
//    private final Basket basket;
//
//    public StoreServiceImpl(Basket basket) {
//        this.basket = basket;
//    }




    private final List<String> fruits = new ArrayList<>(Arrays.asList("яблоко", "банан", "манго", "груша", "апельсин"));

    private final Map<Integer, String> products = new HashMap<>();

    public StoreServiceImpl() {
        products.put(0, new String(fruits.get(0)));
    }

    public Map<Integer, String> get() {
        return products;
    }

    public String add(List<Integer> ids) {
        for (Integer i : ids) {
            products.put(i, new String(fruits.get(i)));
        }
        return "выбранные фрукты добавлены";
    }

//
//    public void get() {
//        basket.getBasket();
//    }
//
//    public void add(List<Integer> ids) {
//        basket.addBasket(ids);
//    }


}
