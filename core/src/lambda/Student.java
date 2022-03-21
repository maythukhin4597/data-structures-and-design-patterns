package lambda;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    Long id;

    static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "may"));
        students.add(new Student(2L, "thu"));
        students.add(new Student(3L, "khin"));
        students.add(new Student(4L, "yato"));
        students.add(new Student(5L, "nani"));
        students.add(new Student(6L, "gojo"));

    }

    public Student(Long id, String name) {
        this.name = name;
        this.id = id;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static List<Student> getStudents() {
        return students;
    }
}
