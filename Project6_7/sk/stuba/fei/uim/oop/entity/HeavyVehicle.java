package entity;

public class HeavyVehicle extends Vehicle {
    private final int height;

    public HeavyVehicle(Person owner, String make, int height) {
        super(owner, make);
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
