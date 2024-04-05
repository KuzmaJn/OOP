package sk.stuba.fei.uim.oop.entity;

public class Truck extends HeavyVehicle{
    private final int maxLoadWeight;

    public Truck(Person owner, String make, int height, int maxLoadWeight) throws IllegalArgumentException {
        super(owner, make, height);
        if (maxLoadWeight < 0) {
            throw new IllegalArgumentException("Max load weight can't be negative!");
        }
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Max load weight: " + getMaxLoadWeight();
    }
}
