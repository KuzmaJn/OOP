package sk.stuba.fei.uim.oop.database;

import sk.stuba.fei.uim.oop.entity.Vehicle;

public class Printer implements PrinterInterface {
    private final Database database;

    public Printer(Database database) {
        this.database = database;
    }

    public String toStringCarsOnly() {
        StringBuilder carsSB = new StringBuilder();
        Vehicle[] vehicles = database.getRegisteredVehicles();
        for (int i = 0; i < database.getRegisteredVehiclesCount(); i++) {
            carsSB.append(vehicles[i].accept(this));
            carsSB.append("\n");
        }
        return carsSB.toString();
    }
}
