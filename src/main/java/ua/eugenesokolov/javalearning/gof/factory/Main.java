package ua.eugenesokolov.javalearning.gof.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CycleFactory> factories = new ArrayList<CycleFactory>();
        factories.add(new UnicycleFactory());
        factories.add(new BicycleFactory());
        factories.add(new TricycleFactory());

        for (CycleFactory factory: factories) {
            Cycle cycle = factory.getCycle();
            System.out.println("Number of wheels: " + cycle.getWheelsCount());
        }
    }
}
