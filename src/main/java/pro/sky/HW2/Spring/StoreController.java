package pro.sky.HW2.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW2.Spring.services.StoreService;
import pro.sky.HW2.Spring.services.StoreServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreServiceImpl storeServiceImpl;

    public StoreController(StoreServiceImpl storeServiceImpl)  {
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
}
