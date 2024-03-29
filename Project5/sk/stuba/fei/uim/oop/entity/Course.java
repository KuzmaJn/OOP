package sk.stuba.fei.uim.oop.entity;
public class Course {
    // fields
    private String courseName;
    private int duration;
    private String teacher;
    private int capacity;
    private int registeredStudentsCount;
    private Student[] students;

    // constructor declarations of a class
    public Course(String courseName, String teacher, int capacity) {
        this.courseName = courseName;
        this.duration = 12;
        this.teacher = teacher;
        this.capacity = capacity;
        this.registeredStudentsCount = 0;
        this.students = new Student[capacity];
    }

    // getters, setters for variables declarations
    public String getCourseName() {
        return this.courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getDuration() {
        return this.duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getTeacher() {
        return this.teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getRegisteredStudentsCount() {
        return this.registeredStudentsCount;
    }

    // methods

    @Override
    public String toString() {
        return " course name: '" + getCourseName() + "'" +
            ", duration: '" + getDuration() + "'" +
            ", teacher: '" + getTeacher() + "'" +
            ", room for " + (getCapacity() - getRegisteredStudentsCount()) + " students";
    }

    public void printRegisteredStudents() {
        System.out.println("Registered students for " + this.courseName + " course:");
        for (int i = 0; i < this.registeredStudentsCount; i++) {
            System.out.println(this.students[i].toString());
        }
    }

    public boolean registerStudent(Student student) {
        if (this.registeredStudentsCount < this.capacity) {
            this.students[this.registeredStudentsCount] = student;
            this.registeredStudentsCount++;
            return true;
        }
        return false;
    }
}
