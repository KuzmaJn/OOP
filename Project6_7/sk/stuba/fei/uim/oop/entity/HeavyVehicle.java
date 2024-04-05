package sk.stuba.fei.uim.oop.entity;

public class HeavyVehicle extends Vehicle {
    private final int height;

    public HeavyVehicle(Person owner, String make, int height) throws IllegalArgumentException {
        super(owner, make);
        if(height <= 0) {
            throw new IllegalArgumentException("There can't be a vehicle with 0 or less height!");
        }
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Height: " + getHeight();
    }
}
