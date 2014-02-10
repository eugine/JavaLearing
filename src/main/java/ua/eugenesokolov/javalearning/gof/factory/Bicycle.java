package ua.eugenesokolov.javalearning.gof.factory;

public class Bicycle implements Cycle {
    @Override
    public int getWheelsCount() {
        return 2;
    }
}
