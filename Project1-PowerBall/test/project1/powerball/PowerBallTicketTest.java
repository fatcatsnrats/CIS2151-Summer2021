
package project1.powerball;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class PowerBallTicketTest {
    
    public PowerBallTicketTest() {
    }
    
    @Test
    public void PowerBallTicketGetWinningsJackpot(){
        // Arrange
        int expectedWinnings = 1_000_000_000;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(4);
        myWhiteNumbers.add(5);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings1000000(){
        // Arrange
        int expectedWinnings = 1_000_000;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(4);
        myWhiteNumbers.add(5);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 2);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings500000(){
        // Arrange
        int expectedWinnings = 50_000;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(4);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings100WhiteOnly(){
        // Arrange
        int expectedWinnings = 100;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(4);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 2);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings100WhiteAndRed(){
        // Arrange
        int expectedWinnings = 100;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings7WhiteOnly(){
        // Arrange
        int expectedWinnings = 7;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(3);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 2);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings7WhiteAndRed(){
        // Arrange
        int expectedWinnings = 7;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(2);
        myWhiteNumbers.add(8);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings4WhiteAndRed(){
        // Arrange
        int expectedWinnings = 4;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(1);
        myWhiteNumbers.add(9);
        myWhiteNumbers.add(8);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings4Red(){
        // Arrange
        int expectedWinnings = 4;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(10);
        myWhiteNumbers.add(9);
        myWhiteNumbers.add(8);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 1);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
    @Test
    public void PowerBallTicketGetWinnings0(){
        // Arrange
        int expectedWinnings = 0;
        
        ArrayList<Integer> myWhiteNumbers = new ArrayList<>(5);
        myWhiteNumbers.add(10);
        myWhiteNumbers.add(9);
        myWhiteNumbers.add(8);
        myWhiteNumbers.add(7);
        myWhiteNumbers.add(6);
        PowerBallTicket myTicket = new PowerBallTicket(myWhiteNumbers, 2);
        
        ArrayList<Integer> winningWhiteNumbers = new ArrayList<>(5);
        winningWhiteNumbers.add(5);
        winningWhiteNumbers.add(4);
        winningWhiteNumbers.add(3);
        winningWhiteNumbers.add(2);
        winningWhiteNumbers.add(1);
        PowerBallTicket winningTicket = new PowerBallTicket(winningWhiteNumbers, 1);
        
        // Act
        int actualWinnings = myTicket.getWinnings(winningTicket);
        
        // Assert
        assertEquals(expectedWinnings, actualWinnings);
    }
    
}
