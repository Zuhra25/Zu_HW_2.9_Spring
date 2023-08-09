package pro.sky.HW2.Spring;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface StoreService {
    public Map<Integer, Product> basket();
//    public String add(Integer id);
}
