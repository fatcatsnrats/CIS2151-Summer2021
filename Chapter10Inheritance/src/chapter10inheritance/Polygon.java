package chapter10inheritance;

import java.util.ArrayList;

public abstract class Polygon {

    private String name;
    private final int numberOfSides;
    private final ArrayList<Integer> sideLengths;

    public Polygon(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
        sideLengths = new ArrayList<>();
        for (int sideIndex = 0; sideIndex < numberOfSides; sideIndex++) {
            sideLengths.add(0);
        }
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setSideLength(int sideIndex, int sideLength) {
        sideLengths.set(sideIndex, sideLength);
    }

    public int getSideLength(int sideIndex) {
        return sideLengths.get(sideIndex);
    }

    public int getPerimeter() {
        int perimeter = 0;

        for (int sideLength : sideLengths) {
            perimeter += sideLength;
        }

        return perimeter;
    }
    
    public String getName(){
        return name;
    }

    public abstract int getArea();

}
