package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dooby Kim
 * @Date 2023/4/13 8:51 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.initMap());
    }

    public Map<String, String> initMap() {
        Map<String, String> map = new HashMap<>() {{
            put("foo", "foo");
            put("bar", "bar");
        }};
        return map;
    }
}
