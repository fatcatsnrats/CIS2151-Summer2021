package chapter10inheritance;

public class Circle {

    private int radius;
    private String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

}
