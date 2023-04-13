package test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Dooby Kim
 * @Date 2023/4/13 8:51 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new Test().initMap();
        Field this$0 = map.getClass().getDeclaredField("this$0");
        this$0.setAccessible(true);
        // 匿名内部类持有外部类的引用
        System.out.println(this$0.get(map).getClass());
    }

    public Map<String, String> initMap() {
        Map<String, String> map = new HashMap<String, String>() {{
            put("foo", "foo");
            put("bar", "bar");
        }};
        return map;
    }
}
