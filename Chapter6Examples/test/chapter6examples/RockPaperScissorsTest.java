
package chapter6examples;

import org.junit.Test;
import static org.junit.Assert.*;


public class RockPaperScissorsTest {
    
    public RockPaperScissorsTest() {
    }

    @Test
    public void testFightRockBeatsScissors() {
        // Arrange
        RockPaperScissors mine = new RockPaperScissors("rock");
        RockPaperScissors theirs = new RockPaperScissors("scissors");
        String expectedResult = "You Win!";
        
        // Act
        String actualResult = mine.fight(theirs);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
}
