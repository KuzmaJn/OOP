package sk.stuba.fei.uim.oop.entity;

public class LightVehicle extends Vehicle{
    private final int maxPassengerCapacity;

    public LightVehicle(Person owner, String make, int maxPassengerCapacity) throws IllegalArgumentException {
        super(owner, make);
        if(maxPassengerCapacity <= 0) {
            throw new IllegalArgumentException("There can't be a vehicle with 0 or less passenger capacity!");
        }
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Max number of Passengers: " + getMaxPassengerCapacity();
    }
}
