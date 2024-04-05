package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.database.*;
import sk.stuba.fei.uim.oop.entity.*;
import java.awt.*;


public class Task_6 {
    public static void main(String[] args) {
        Database db = new Database(10);
        try {
            Person person = new Person("Jan", "New York");
            System.out.println(person.toString());

            Vehicle car = new Vehicle(person, null);
            Car car1 = new Car(person, "BMW", 5, Color.BLACK);
            Motorcycle motorcycle = new Motorcycle(person, "Yamaha", 2, MotorcycleType.SPORT);
            Car car2 = new Car(person, "Audi", 5, Color.RED);
            Truck truck = new Truck(person, "Tatra", 3, 1000);

            db.register(car);
            db.register(car1);
            db.register(motorcycle);
            db.register(car2);
            db.register(truck);

            Printer printer = new Printer(db);

            System.out.println(printer.toStringCarsOnly());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
