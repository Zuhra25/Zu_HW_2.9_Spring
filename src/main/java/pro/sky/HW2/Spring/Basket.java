package pro.sky.HW2.Spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Basket {
    private final Map<Integer, String> products = new HashMap<>();
    private final List<String> fruits = new ArrayList<>(Arrays.asList("яблоко", "банан", "манго", "груша", "апельсин"));

    public Map<Integer, String> getBasket() {
        return products;
    }

    public String addBasket(List<Integer> ids) {
        for (Integer i : ids) {
            if (i > fruits.size() - 1) {
                throw new IndexOutOfBoundsException("такого фрукта нет в нашем магазине");
            }
            products.put(i, new String(fruits.get(i)));
        }
        return "выбранные фрукты добавлены";
    }
}
