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
            System.out.println(shape);

        }

        ArrayList<HasVolumeInterface> threeDimensionalShapes = new ArrayList<>();

        Cube cube = new Cube("cubey", 10);
        threeDimensionalShapes.add(cube);
        threeDimensionalShapes.add(new Cylinder("axle", 2, 20));

        shapes.add(cube);

        for (Polygon shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("actual class: " + shape.getClass());
            
            if ( HasVolumeInterface.class.isAssignableFrom(shape.getClass() )){
                System.out.println("Volume: " + ((HasVolumeInterface)shape).getVolume());
            }
        }
        
        Class[] interfacesImplementedByCube = cube.getClass().getInterfaces();
        
        System.out.println("Interfaces implemented by Cube:");
        for ( Class interfaceImplemnted : interfacesImplementedByCube){
            System.out.println(interfaceImplemnted);
        }
        
        if ( HasVolumeInterface.class.isAssignableFrom(cube.getClass())){
            System.out.println("Cube has a volume");
        }
        
        

    }

}
