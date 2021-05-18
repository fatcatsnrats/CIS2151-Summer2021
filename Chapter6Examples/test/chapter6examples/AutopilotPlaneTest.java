package chapter6examples;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutopilotPlaneTest {

    public AutopilotPlaneTest() {
    }

    @Test
    public void testConstructor() {
        // AAA format

        // Arrange - set up all the variables we need to test
        String expectedName = "747";
        int expectedMaxAltitudeInMeters = 13746;
        int expectedCurrentAltitudeInMeters = 0;

        // Act - we call the code being testing
        AutopilotPlane plane = new AutopilotPlane(
                expectedMaxAltitudeInMeters, expectedName);
        String actualName = plane.getName();
        int actualMaxAltitudeInMeters = plane.getMaxAltitudeInMeters();
        int actualCurrentAltitudeInMeters = plane.getCurrentAltitudeInMeters();
        boolean actualLandingGearEnabled = plane.isLandingGearEnabled();

        // Assert - did we get what we expected
        assertEquals(expectedName, actualName);
        assertEquals(expectedMaxAltitudeInMeters, actualMaxAltitudeInMeters);
        assertEquals(expectedCurrentAltitudeInMeters, actualCurrentAltitudeInMeters);
        assertTrue(actualLandingGearEnabled);

    }

    @Test
    public void testChangeAltitudeBelowZero() {
        // AAA format

        // Arrange - set up all the variables we need to test
        String expectedName = "747";
        int expectedMaxAltitudeInMeters = 13746;
        AutopilotPlane plane = new AutopilotPlane(
                expectedMaxAltitudeInMeters, expectedName);

        // Act - we call the code being testing
        boolean actualChangeAltitudeResult = plane.changeAltitude(-10);
        
        // Assert - did we get what we expected
        assertFalse(actualChangeAltitudeResult);
        
    }

    @Test
    public void testChangeAltitudeAboveMax() {
 // AAA format

        // Arrange - set up all the variables we need to test
        String expectedName = "747";
        int expectedMaxAltitudeInMeters = 13746;
        AutopilotPlane plane = new AutopilotPlane(
                expectedMaxAltitudeInMeters, expectedName);

        // Act - we call the code being testing
        boolean actualChangeAltitudeResult = plane.changeAltitude(expectedMaxAltitudeInMeters*2);
        int actualAltitudeInMeters = plane.getCurrentAltitudeInMeters();
        
        // Assert - did we get what we expected
        assertEquals(expectedMaxAltitudeInMeters, actualAltitudeInMeters);
        assertTrue(actualChangeAltitudeResult);
    }

    @Test
    public void testChangeAltitudeEnablesLandingGear() {
        // AAA format

        // Arrange - set up all the variables we need to test
        String expectedName = "747";
        int expectedMaxAltitudeInMeters = 13746;
        AutopilotPlane plane = new AutopilotPlane(
                expectedMaxAltitudeInMeters, expectedName);

        // Act - we call the code being testing
        plane.changeAltitude(1500);
        boolean actualChangeAltitudeResult = plane.changeAltitude(-1000);
        boolean actualLandingGearStatus = plane.isLandingGearEnabled();
        
        // Assert - did we get what we expected
        assertTrue(actualChangeAltitudeResult);
        assertTrue(actualLandingGearStatus);

    }

    @Test
    public void testChangeAltitudeDisablesLandingGear() {
// AAA format

        // Arrange - set up all the variables we need to test
        String expectedName = "747";
        int expectedMaxAltitudeInMeters = 13746;
        AutopilotPlane plane = new AutopilotPlane(
                expectedMaxAltitudeInMeters, expectedName);

        // Act - we call the code being testing
        boolean actualChangeAltitudeResult = plane.changeAltitude(1500);
        boolean actualLandingGearStatus = plane.isLandingGearEnabled();
        
        // Assert - did we get what we expected
        assertTrue(actualChangeAltitudeResult);
        assertFalse(actualLandingGearStatus);
    }

}
