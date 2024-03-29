import database.Database;
import entity.*;
import java.awt.*;


public class Task_6 {
    public static void main(String[] args) {
        Database database = new Database(5);

        Person person1 = new Person("John",  "Bratislava 1");
        Person person2 = new Person("Jane",  "Bratislava 2");
        Person person3 = new Person("Jack",  "Bratislava 3");
        Person person4 = new Person("Jill",  "Bratislava 4");
        Person person5 = new Person("James", "Bratislava 5");

        Vehicle vehicle1 = new Car(person1, "Toyota", 5, Color.RED);
        Vehicle vehicle2 = new Car(person2, "Ford", 5, Color.BLUE);
        Vehicle vehicle3 = new Motorcycle(person3, "Harley-Davidson", 2, MotorcycleType.CRUISER);
        Vehicle vehicle4 = new Truck(person4, "Yamaha", 5, 2500);
        Vehicle vehicle5 = new Truck(person5, "Toyota", 2, 1000);

        database.register(vehicle1);
        database.register(vehicle2);
        database.register(vehicle3);
        database.register(vehicle4);
        database.register(vehicle5);

        String databaseInfo = database.toString();
        System.out.println(databaseInfo);


    }
}
