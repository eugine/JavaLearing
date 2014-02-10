package ua.eugenesokolov.javalearning.gof.factory;

public class Unicycle implements Cycle {
    @Override
    public int getWheelsCount() {
        return 1;
    }
}
