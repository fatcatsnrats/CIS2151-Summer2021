
package chapter10inheritance;


public class Rectangle extends Polygon {
    public Rectangle(String name, int length, int width){
        super(name, 4); // calls the polygon constructor
        setLength(length);
        setWidth(width);
    }
    
    @Override
    public void setSideLength(int sideIndex, int sideLength){
        if ( sideIndex == 0 || sideIndex == 2){
            setLength(sideLength);
        }
        else if( sideIndex == 1 || sideIndex == 3 ){
            setWidth(sideLength);
        }
    }
    
    public void setLength(int length){
        super.setSideLength(0, length);
        super.setSideLength(2, length);
    }
    
    public void setWidth(int width){
        super.setSideLength(1, width);
        super.setSideLength(3, width);
    }
    
    @Override
    public int getArea(){
        return getSideLength(0) * getSideLength(1);
    }
}
