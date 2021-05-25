
package chapter8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EricC
 */
public class PolygonTest {
    
    public PolygonTest() {
    }

    @Test
    public void testGetSideLength() {
        // AAA
        
        // Arrange
        int expectedSideLength = 10;
        Polygon polygon = new Polygon(1);
        
        // Act
        polygon.setSideLength(0, expectedSideLength);
        int actualSideLength = polygon.getSideLength(0);
        
        // Assert
        assertEquals(expectedSideLength, actualSideLength);
    }

    @Test
    public void testGetPerimeter() {
        // AAA
        
        // Arrange
        int expectedPerimeter = 20;
        Polygon polygon = new Polygon(5);
        
        // Act
        polygon.setSideLength(0, 2);
        polygon.setSideLength(1, 3);
        polygon.setSideLength(2, 4);
        polygon.setSideLength(3, 5);
        polygon.setSideLength(4, 6);
        int actualPerimeter = polygon.getPerimeter();
        
        // Assert
        assertEquals(expectedPerimeter, actualPerimeter);
    }
    
}
