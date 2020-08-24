package org.launchcode.techjobs_oo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    private Job job1;
    private Job job2;
    private Job job3;
    private Job jobTest1;

    @BeforeEach
    void createJobObj() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest1 = new Job("Java developer", new Employer("Hynewspro"), new Location("Amsterdam"), new PositionType("Development"), new CoreCompetency("Programing"));

    }

    @Test
    void testSettingJobId() {
        int id = job1.getId();
        assertEquals(1, id);
        assertTrue(job2.getId() == 2);

    }

    @Test
    void testJobConstructorSetsAllFields() {
        assertTrue(job3.getName() == "Product tester");
        assertTrue(job3.getCoreCompetency().getValue() == "Persistence");
        assertTrue(job3.getLocation().getValue() == "Desert");

        assertTrue(job3 instanceof Job);


    }

    @Test
    void testJobsForEquality() {
        Job jobTest1 = new Job("Java developer", new Employer("Hynewspro"), new Location("Amsterdam"), new PositionType("Development"), new CoreCompetency("Programing"));
        Job jobTest2 = new Job("Java developer", new Employer("Hynewspro"), new Location("Amsterdam"), new PositionType("Development"), new CoreCompetency("Programing"));
        assertFalse(jobTest1.equals(jobTest2));
    }

    @Test
    void testToStringMethods() {
        Job jobTest = new Job();
        String excepted = "OOPS! This job does not seem to exist.";
        assertEquals(excepted, jobTest.toString());

    }
    @Test
    void testToStringMethodsWithParameters(){
        assertTrue(jobTest1.toString().contains("Java developer"));
        assertTrue(jobTest1.toString().contains("Amsterdam"));
    }

    @Test
    void testToStringMethodsWithEmptyParameters(){
        Job jobTest1 = new Job("Java developer", new Employer(null), new Location(""), new PositionType("Development"), new CoreCompetency("Programing"));
        String excepted = "Data not available";
      assertEquals(excepted, jobTest1.toString());

    }
}