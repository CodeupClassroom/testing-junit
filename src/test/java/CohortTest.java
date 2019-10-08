import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void beginning(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        cohortWithOne.addStudent(new Student(1, "Fer"));
    }

    @Test
    public void testIfStudentCanBeAdded(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
    }

    @Test
    public void testIfListOfStudentsIsReturned(){
//        assertNotEquals("Fer", emptyCohort.getStudents().get(0));
        // the best approach for this is an exception test

        assertEquals("Fer", cohortWithOne.getStudents().get(0).getName());
    }

    @Test
    public void testIfAvgIsCorrect(){
        cohortWithOne.getStudents().get(0).addGrade(80);
        cohortWithOne.getStudents().get(0).addGrade(90);
        assertEquals(85, cohortWithOne.getCohortAverage() , 0);
        cohortWithOne.getStudents().get(0).addGrade(100);
        assertEquals(90, cohortWithOne.getCohortAverage() , 0);
    }

}
