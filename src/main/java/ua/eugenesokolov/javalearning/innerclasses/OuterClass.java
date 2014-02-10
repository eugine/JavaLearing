package ua.eugenesokolov.javalearning.innerclasses;

import java.util.HashMap;
import java.util.Map;

public class OuterClass {

    private int value = 0;
    private InnerClass inner;
    private Map<String, Integer> map = new HashMap<String, Integer>() {
        { put("xxx", getValue()); }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Map finalize");
        }
    };


    public OuterClass() {
        this.value = 10;
        this.inner = new InnerClass();
    }

    public class InnerClass {
        public int getValue() {
            return OuterClass.this.getValue();
        }
    }

    public InnerClass getInner() {
        return inner;
    }

    private int getValue() {
        return value;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Outer finalize!!!");
    }
}
