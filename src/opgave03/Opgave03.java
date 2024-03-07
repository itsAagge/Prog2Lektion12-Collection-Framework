package opgave03;

import opgave03.model.College;
import opgave03.model.Student;

public class Opgave03 {
    public static void main(String[] args) {
        College college = new College("Stanford");
        Student student1 = new Student(1, "Bill");
        Student student2 = new Student(2, "Mark");
        college.addStudent(student1);
        college.addStudent(student2);
        student1.addGrade(7);
        student1.addGrade(12);
        student2.addGrade(7);
        student2.addGrade(4);
        System.out.println(college.findStudent(1));
        System.out.println(college.calcAverage());
    }
}
