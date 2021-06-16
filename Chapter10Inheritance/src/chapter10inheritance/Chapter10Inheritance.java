package chapter10inheritance;

import java.util.ArrayList;

public class Chapter10Inheritance {

    public static void main(String[] args) {

        //Polygon polygon = new Polygon(5);
        Rectangle rectangle = new Rectangle("rectangle 1", 4, 2);

        Square square = new Square("big square", 10);

        ArrayList<Polygon> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(square);

        for (Polygon shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            
        }

        
        ArrayList<HasVolumeInterface> threeDimensionalShapes = new ArrayList<>();
        
        threeDimensionalShapes.add(new Cube("cubey", 10));
        threeDimensionalShapes.add(new Cylinder("axle", 2, 20));
    }

}
