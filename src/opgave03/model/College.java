package opgave03.model;

import java.util.*;

public class College {
    private String name;
    private Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        double sum = 0;
        int count = 0;
        for (Student student : students.values()) {
            count++;
            sum += student.calcAverage();
        }
        return sum / count;
    }

    public Student findStudent(int studentNo) {
        return students.get(studentNo);
    }

    public String toString() {
        return this.name;
    }
}
