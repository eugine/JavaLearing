package ua.eugenesokolov.javalearning.tij.innerclasses.ex6;

import ua.eugenesokolov.javalearning.tij.innerclasses.ex6.impl.SimpleOuterClass;
import ua.eugenesokolov.javalearning.tij.innerclasses.ex6.inter.SimpleInterface;

public class Ex6Main extends SimpleOuterClass {

    public SimpleInterface getInterface() {
        return  new SimpleInnerClass();
    }

    public static void main(String[] args) {
        new Ex6Main();
    }

}
