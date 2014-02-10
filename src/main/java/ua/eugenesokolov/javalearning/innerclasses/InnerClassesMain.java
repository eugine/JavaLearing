package ua.eugenesokolov.javalearning.innerclasses;

import java.util.Map;

public class InnerClassesMain {

    static OuterClass.InnerClass inner;
    static Map<String, Integer> map;


    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                OuterClass outer = new OuterClass();
                map = outer.getMap();
//                inner = outer.getInner();
//                System.out.println("value before: " + inner.getValue());
            }
        });

        t.start();
        t.join();
        System.gc();
        Thread.sleep(1000);
        System.gc();
        for (String key: map.keySet()) {
            System.out.println("Key [" + key + "] = Value [" + map.get(key) + "]");
        }
    }
}
