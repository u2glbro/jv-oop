package core.basesyntax;

public class Truck extends Machin {
    @Override
    public void doWork() {
        System.out.println("Truck started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stop work");
    }
}
