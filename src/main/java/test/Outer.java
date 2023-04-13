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

    private int[] data;

    public Outer(int size) {
        this.data = new int[size];
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

            while (true) {
                list.add(new Outer(100000).createInner());
                System.out.println(counter++);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
