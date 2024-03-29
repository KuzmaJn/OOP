package entity;

public class Person {
    String name;
    String address;

    public Person(){
        System.out.println("Default constructor");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address;
    }
}
