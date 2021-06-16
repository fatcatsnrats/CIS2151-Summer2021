package chapter10inheritance;

public class Square extends Rectangle {

    public Square(String name, int length) {
        super(name, length, length);
    }

    @Override
    public void setSideLength(int sideIndex, int sideLength) {
        setLength(sideLength);
    }
    
    @Override
    public void setLength(int length){
        super.setLength(length);
        super.setWidth(length);
    }
    
    @Override
    public void setWidth(int length){
        super.setLength(length);
        super.setWidth(length);
    }
}
