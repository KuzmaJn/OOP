package entity;

public class Truck extends HeavyVehicle{
    private final int maxLoadWeight;

    public Truck(Person owner, String make, int height, int maxLoadWeight) {
        super(owner, make, height);
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
