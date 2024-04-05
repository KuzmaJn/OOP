package sk.stuba.fei.uim.oop.entity;

import sk.stuba.fei.uim.oop.database.*;

import java.awt.*;

public class Car extends LightVehicle{
    private final Color color;

    public Car(Person owner, String make, int maxPassengerCapacity, Color color) {
        super(owner, make, maxPassengerCapacity);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Color: " + getColor();
    }
    @Override
    public String accept(Printer db) {
        return db.toStringVehicle(this);
    }
}
