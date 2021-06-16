
package chapter10inheritance;


public class Cube extends Square implements HasVolumeInterface{
    public Cube(String name, int length){
        super(name, length);
    }

    @Override
    public double getVolume() {
        return getSideLength(0) * getSideLength(0) * getSideLength(0);
    }
}
