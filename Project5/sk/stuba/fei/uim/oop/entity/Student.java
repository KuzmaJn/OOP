package sk.stuba.fei.uim.oop.entity;

public class Student {
    // fields

    private String name;
    private int id;
    // constructors

    public Student() {
        this.name = "name";
        this.id = 0;
    }
    // methods

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }

    public void registerToCourse(Course course) {
        if(course.registerStudent(this)) {
            System.out.println("Student " + this.name + " registered to course " + course.getCourseName());
        } else {
            System.out.println("Student " + this.name + " could not register to course " + course.getCourseName());
        }
    }
}
