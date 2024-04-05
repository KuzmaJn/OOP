package sk.stuba.fei.uim.oop.entity;

import sk.stuba.fei.uim.oop.database.*;

public class Vehicle {
    private Person owner;
    private final String make;

    public Vehicle(Person owner, String make) throws IllegalArgumentException {
        if(owner == null) {
            throw new IllegalArgumentException("Owner must be real person");
        }
        this.owner = owner;
        this.make = make;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) throws IllegalArgumentException {
        if(owner == null) {
            throw new IllegalArgumentException("Owner must be real person");
        }
        this.owner = owner;
    }
    public String getMake() {
        if(make == null) {
            return "Unknown";
        }
        return make;
    }

    @Override
    public String toString() {
        return "Owner: " + "\n" + getOwner().toString() +  "\n" +
                "Producer: " + getMake();
    }

    public String accept(Printer printer) {
        return printer.toStringVehicle(this);
    }

}
