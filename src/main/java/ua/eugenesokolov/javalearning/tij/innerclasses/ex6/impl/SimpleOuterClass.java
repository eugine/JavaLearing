package ua.eugenesokolov.javalearning.tij.innerclasses.ex6.impl;

import ua.eugenesokolov.javalearning.tij.innerclasses.ex6.inter.SimpleInterface;

public class SimpleOuterClass {

    protected class SimpleInnerClass implements SimpleInterface {

        public SimpleInnerClass () {

        }

        @Override
        public void someMethod() {
            System.out.println("Do something..");
        }


    }
}
