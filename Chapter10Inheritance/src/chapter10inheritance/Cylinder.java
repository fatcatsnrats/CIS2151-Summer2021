package chapter10inheritance;

public class Cylinder extends Circle implements HasVolumeInterface {

    private int height;

    public Cylinder(String name, int radius, int height) {
        super(radius, name);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

}
