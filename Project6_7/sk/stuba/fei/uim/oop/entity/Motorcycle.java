package sk.stuba.fei.uim.oop.entity;

public class Motorcycle extends LightVehicle{
    private final MotorcycleType type;

    public Motorcycle(Person owner, String make, int maxPassengerCapacity, MotorcycleType type) {
        super(owner, make, maxPassengerCapacity);
        this.type = type;
    }

    public MotorcycleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Motorcycle type: " + getType();
    }
}
