package sk.stuba.fei.uim.oop.entity;

public class Person {
    String name;
    String address;

    public Person(String name, String address) throws IllegalArgumentException {
        if (name == null || address == null || name.isEmpty() || address.isEmpty()){
            throw new IllegalArgumentException("Name and address must be filled");
        }
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address;
    }
}
