package database;

import entity.*;

public class Database {
    private Vehicle[] registeredVehicles;
    private int registeredVehiclesCount;

    public Database(int capacity) {
        registeredVehicles = new Vehicle[capacity];
        registeredVehiclesCount = 0;
    }
    public int getRegisteredVehiclesCount() {
        return registeredVehiclesCount;
    }

    public boolean register(Vehicle vehicle) {
        if(registeredVehiclesCount >= registeredVehicles.length) {
            return false;
        }
        registeredVehicles[registeredVehiclesCount] = vehicle;
        registeredVehiclesCount++;
        return true;
    }

    public String toString() {
        StringBuilder vehiclesSB = new StringBuilder();
        for (int i = 0; i < registeredVehiclesCount; i++) {
            vehiclesSB.append("Vehicle ").append(i + 1).append(":\n");
            vehiclesSB.append(registeredVehicles[i].toString());
            vehiclesSB.append("\n \n");
        }
        return vehiclesSB.toString();
    }
}
