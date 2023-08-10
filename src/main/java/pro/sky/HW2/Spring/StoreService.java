package pro.sky.HW2.Spring;

import java.util.List;
import java.util.Map;

public interface StoreService {

    public Map<Integer, String> get();
    public String add(List<Integer> ids);
}
