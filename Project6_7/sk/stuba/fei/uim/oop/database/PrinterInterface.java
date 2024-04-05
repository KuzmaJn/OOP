package sk.stuba.fei.uim.oop.database;

import sk.stuba.fei.uim.oop.entity.*;

public interface PrinterInterface {
    default String toStringVehicle(Vehicle vehicle) {
        return "";
    }

    default String toStringVehicle(Car car) {
        return car.toString();
    }

}
