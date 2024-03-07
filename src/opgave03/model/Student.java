package opgave03.model;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name) {
        StudentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public String toString() {
        return this.name + ", studentNo: " + this.StudentNo;
    }

    public double calcAverage() {
        double sum = 0;
        int count = 0;
        for (Integer i : grades) {
            count++;
            sum += i;
        }
        return sum / count;
    }

    @Override
    public int compareTo(Student o) {
        return this.StudentNo - o.getStudentNo();
    }
}
