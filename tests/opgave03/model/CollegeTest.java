package opgave03.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollegeTest {

    private College college;
    private Student student1;
    private Student student2;

    @BeforeEach
    void SetUp() {
        college = new College("Stanford");
        student1 = new Student(1, "Bill");
        Student student2 = new Student(2, "Mark");
        college.addStudent(student1);
        college.addStudent(student2);
        student1.addGrade(7);
        student1.addGrade(12);
        student2.addGrade(7);
        student2.addGrade(4);
    }

    @Test
    void calcAverage() {
        double expected = 7.5;

        double actual = college.calcAverage();

        assertEquals(expected, actual);
    }

    @Test
    void findStudent() {
        Student expected = student1;

        Student actual = college.findStudent(1);

        assertEquals(expected, actual);
    }
}