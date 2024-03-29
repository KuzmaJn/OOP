package entity;

public class LightVehicle extends Vehicle{
    private final int maxPassengerCapacity;

    public LightVehicle(Person owner, String make, int maxPassengerCapacity) {
        super(owner, make);
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
