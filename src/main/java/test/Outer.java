package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Dooby Kim
 * @Date 2023/4/13 10:17 下午
 * @Version 1.0
 */
public class Outer {

    private byte[] data;

    public Outer() {
        this.data = new byte[1024 * 1024];
    }

    static class Inner {

    }

    Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        int counter = 0;
        List<Object> list = new ArrayList<>();
        try {

            while (counter < 10000) {
                list.add(new Outer().createInner());
                System.out.println(counter++);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
