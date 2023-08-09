package pro.sky.HW2.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class StoreController {
//    private final StoreService storeService;
//
//    @Autowired
//    public StoreController(StoreService storeService) {
//        this.storeService = storeService;
//    }
    private final StoreServiceImpl storeServiceImpl;

    public StoreController(StoreServiceImpl storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }

    //    @GetMapping("/get")
//    public Map<Integer, String> basket(){
//      return StoreServiceImpl.basket
//    }
    @GetMapping("/add")
    public String add() {
        return StoreServiceImpl.add
    }

///store/order/add
    //
    ///store/order/get
}
