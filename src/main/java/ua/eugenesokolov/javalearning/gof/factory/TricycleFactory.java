package ua.eugenesokolov.javalearning.gof.factory;

public class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
