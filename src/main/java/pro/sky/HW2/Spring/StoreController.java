package pro.sky.HW2.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreServiceImpl storeServiceImpl;

  @Autowired
    public StoreController(StoreServiceImpl storeServiceImpl) {
        this.storeServiceImpl = storeServiceImpl;
    }




///store/order/add
    //
    ///store/order/get
}
