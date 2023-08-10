package pro.sky.HW2.Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Map;

@RestController
//@SessionScope
@RequestMapping("/order")
public class StoreController {
    private final StoreServiceImpl storeServiceImpl;

    public StoreController(StoreServiceImpl storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }

    @GetMapping("/get")
    public Map<Integer, String> get() {
        return storeServiceImpl.get();
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Integer> ids) {
        return storeServiceImpl.add(ids);
    }

    // /store/order/add?ids=1
    //add?ids=1,2,3
    // /store/order/get
    // add?id=


    //        if (id > fruits.size() - 1) {
//            throw new ArrayIndexOutOfBoundsException("такого фрукта нет в нашем магазине");
//        }
}
