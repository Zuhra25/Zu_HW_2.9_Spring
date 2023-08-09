package pro.sky.HW2.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreServiceImpl storeServiceImpl;

    public StoreController(StoreServiceImpl storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }

        @GetMapping("/get")
    public Map<Integer, Product> basket(){
      return storeServiceImpl.basket();
    }
//    @GetMapping("/add")
//    public String add(@RequestParam Integer id) {
//        return storeServiceImpl.add(id);
//    }

///store/order/add
    //
    ///store/order/get
}
