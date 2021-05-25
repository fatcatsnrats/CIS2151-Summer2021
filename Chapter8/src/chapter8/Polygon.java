package chapter8;

import java.util.ArrayList;

public class Polygon {

    private final int numberOfSides;
    private ArrayList<Integer> sideLengths;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        sideLengths = new ArrayList<>(numberOfSides);
        for ( int sideIndex = 0; sideIndex < numberOfSides; sideIndex++ ){
            sideLengths.add(0);
        }
    }
    
    public void setSideLength(int sideIndex, int sideLength){
        sideLengths.set(sideIndex, sideLength);
    }
    
    public int getSideLength(int sideIndex){
        return sideLengths.get(sideIndex);
    }
    
    public int getPerimeter(){
        int perimeter = 0;
        for ( int side : sideLengths ){
            perimeter += side;
        }
        return perimeter;
    }
}
