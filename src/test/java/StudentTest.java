import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student studentWithTwoGrades;
    Student studentWithOneGrade;

    @Before
    public void setUp(){
        studentWithTwoGrades = new Student(1, "Fer");
        studentWithOneGrade = new Student(2, "Justin");
    }

    @Test
    public void testIfStudentCanBeCreated(){
        Student justin = null;
        assertNotNull(studentWithTwoGrades);
        assertNull(justin);
    }

    @Test
    public void testFieldsIfSetOrGet(){
        assertEquals(1, studentWithTwoGrades.getId());
        assertEquals("Fer", studentWithTwoGrades.getName());
        assertNotNull(studentWithTwoGrades.getGrades());
    }

    @Test
    public void testIfAddGradeWorks(){
        studentWithTwoGrades.addGrade(80);
        assertSame(80, studentWithTwoGrades.getGrades().get(0));
        assertSame(1, studentWithTwoGrades.getGrades().size());
        studentWithTwoGrades.addGrade(90);
        assertSame(2, studentWithTwoGrades.getGrades().size());
    }

    @Test
    public void testIfGradeAvgIsCorrect(){
        studentWithTwoGrades.addGrade(80);
        studentWithTwoGrades.addGrade(90);

        assertEquals(85, studentWithTwoGrades.getAverageGrade(), 0);

        studentWithOneGrade.addGrade(100);

        assertEquals(100, studentWithOneGrade.getAverageGrade(), 0);

    }

}
