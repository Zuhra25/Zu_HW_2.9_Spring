package pro.sky.HW2.Spring.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.HW2.Spring.Basket;
import pro.sky.HW2.Spring.services.StoreService;

import java.util.*;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public String add(List<Integer> ids) {
        return basket.addBasket(ids);
    }

    public Map<Integer, String> get() {
        return basket.getBasket();
    }
}
