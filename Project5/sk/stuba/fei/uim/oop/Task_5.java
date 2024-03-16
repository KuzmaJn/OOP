package Project5.sk.stuba.fei.uim.oop;

import Project5.sk.stuba.fei.uim.oop.entity.Student;
import Project5.sk.stuba.fei.uim.oop.entity.Course;

public class Task_5 {
    public static void main(String[] args) {
        String[] tree = {"Július", "Eugen", "Vladislav", "Tamara", "Sabina", "Tomáš", "Matej", "Daniela", "Igor"};
        Course oop = new Course("OOP", "Julius Siska", 10);
        Course vsa = new Course("VSA", "Igor Kossaczky", 7);

        for (String name : tree) {
            Student student = new Student();
            student.setName(name);
            student.setId(2000 + (int)(Math.random() * 8000));
            student.registerToCourse(oop);
            student.registerToCourse(vsa);
        }

        oop.printRegisteredStudents();
        vsa.printRegisteredStudents();
    }
}
