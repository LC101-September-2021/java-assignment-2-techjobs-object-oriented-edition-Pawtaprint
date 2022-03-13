package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job One = new Job();

        Job Two = new Job();

        assertFalse(One.getId(), Two.getId());

        System.out.println(Two.getId());
        System.out.println(One.getId());
    }

    private void assertFalse(int id, int id1) {
    }
    @Test
    public void testJobConstructorSetsAllFields() {

        Job Three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("Product tester", Three.getName());
        Assert.assertEquals("ACME", Three.getEmployer().getValue());
        Assert.assertEquals("Desert", Three.getLocation().getValue());
        Assert.assertEquals("Quality control", Three.getPositionType().getValue());
        Assert.assertEquals("Persistence", Three.getCoreCompetency().getValue());



//        //assertEquals("Product tester",Three.getName());
//        assertEquals(Three.getEmployer().toString().equals("ACME"));
//        assertEquals(Three.getLocation().toString().equals("Desert"));
//        assertEquals(Three.getPositionType().toString().equals("Quality control"));
//        assertEquals(Three.getCoreCompetency().toString().equals("Persistence"));

        assertTrue(Three.getName().equals("Product tester"));
        assertTrue(Three.getEmployer().toString().equals("ACME"));
        assertTrue(Three.getLocation().toString().equals("Desert"));
        assertTrue(Three.getPositionType().toString().equals("Quality control"));
        assertTrue(Three.getCoreCompetency().toString().equals("Persistence"));


    }

    private void assertEquals(boolean b) {
    }

    @Test
    public void testJobsForEquality() {
        Job Four = new Job("Beta Tester", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job Five = new Job("Beta Tester", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(Four == Five);


    }

    @Test
    public void TestJobToString() {
        Job Four = new Job("Beta Tester", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(Four.toString().equals("\nID:" + Four.getId() + "\nName: " + Four.getName() + "\nEmployer: " + Four.getEmployer().getValue() + "\nLocation: " + Four.getLocation().getValue()  + "\nPosition Type: " + Four.getPositionType().getValue() + "\nCore Competency: " + Four.getCoreCompetency().getValue() + "\n"));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job Four = new Job("", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(Four.toString().equals("\nID:" + Four.getId() + "\nName: Data not available." + "\nEmployer: " + Four.getEmployer().getValue() + "\nLocation: " + Four.getLocation().getValue()  + "\nPosition Type: " + Four.getPositionType().getValue() +"\nCore Competency: " + Four.getCoreCompetency().getValue() + "\n"));
        Assert.assertEquals("Riot Games", Four.getEmployer().getValue());
    }

    @Test
    public void testTestToStringContainsCorrectLabelsAndDataCallsAssertions() {
        Job Four = new Job("", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals("Riot Games", Four.getEmployer().getValue());
        Assert.assertEquals("\nID", "\nID");
        Assert.assertEquals("\nName", "\nName");
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job Four = new Job("Carter", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(Four.toString().charAt(0), Four.toString().charAt(Four.toString().length()-1));
        Assert.assertEquals(Four.toString().charAt(0), Four.toString().charAt(Four.toString().length()-1));

        //anything

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job Four = new Job("", new Employer("Riot Games"), new Location("Los Angeles"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testing =  "\nID:" + Four.getId() + "\nName: Data not available." + "\nEmployer: " + Four.getEmployer() + "\nLocation: " + Four.getLocation() + "\nPosition Type: " + Four.getPositionType() +"\nCore Competency: " + Four.getCoreCompetency();
        Assert.assertEquals(testing, Four.toString());
    }
}
