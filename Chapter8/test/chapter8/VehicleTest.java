package chapter8;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    public VehicleTest() {
    }
    
    @Test
    public void testConstructor()
    {
        // Arrange
        String expectedName = "Blue Jean";
        double expectedKilometersPerLiter = 10;
        double expectedGasTankCapacityInLiters = 90.8;
        double expectedGasInTankInLiters = 0;
        
        // Act
        Vehicle vehicle = new Vehicle(expectedName , 
                expectedKilometersPerLiter, expectedGasTankCapacityInLiters);
        String actualName = vehicle.getName();
        double actualKilometersPerLiter = vehicle.getKilometersPerLiter();
        double actualGasTankCapacityInLiters = vehicle.getGasTankCapacityInLiters();
        double actualGasInTankInLiters = vehicle.getGasInTankInLiters();
        
        // Assert
        assertEquals(expectedName, actualName);
        assertEquals(expectedKilometersPerLiter, actualKilometersPerLiter, .000001);
        assertEquals(expectedGasTankCapacityInLiters, actualGasTankCapacityInLiters, .000001);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .000001);
        
    }

    @Test
    public void testAddGasReturnsTrue() {
        // Arrange
        double expectedGasInLiters = 10.0;
        Vehicle vehicle = new Vehicle("", 0, expectedGasInLiters);

        // Act
        boolean result = vehicle.addGas(expectedGasInLiters);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertTrue(result);
    }
    
    @Test
    public void testAddGasReturnsFalse() {
        // Arrange
        double expectedGasInLiters = 10.0;
        Vehicle vehicle = new Vehicle("", 0, expectedGasInLiters);

        // Act
        boolean result = vehicle.addGas(20);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertFalse(result);
    }
    
    @Test
    public void testAddGasNegativeValueReturnsFalse() {
        // Arrange
        double expectedGasInLiters = 0.0;
        Vehicle vehicle = new Vehicle("", 0, expectedGasInLiters);

        // Act
        boolean result = vehicle.addGas(-20);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertFalse(result);
    }
    
    @Test
    public void testDriveReturnsTrue() {
        // Arrange
        double expectedGasInLiters = 10.0;
        Vehicle vehicle = new Vehicle("", 1, 20);
        vehicle.addGas(20);

        // Act
        boolean result = vehicle.drive(10);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertTrue(result);
    }
    
    @Test
    public void testDriveReturnsFalse() {
        // Arrange
        double expectedGasInLiters = 0.0;
        Vehicle vehicle = new Vehicle("", 1, 20);
        vehicle.addGas(20);

        // Act
        boolean result = vehicle.drive(30);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertFalse(result);
    }
    
    @Test
    public void testDriveNegativeReturnsFalse() {
        // Arrange
        double expectedGasInLiters = 20.0;
        Vehicle vehicle = new Vehicle("", 1, 20);
        vehicle.addGas(20);

        // Act
        boolean result = vehicle.drive(-30);
        double actualGasInLiters = vehicle.getGasInTankInLiters();

        // Assert - comparing doubles requres a delta or how close is close enough
        assertEquals(expectedGasInLiters, actualGasInLiters, .00001);
        assertFalse(result);
    }

}
