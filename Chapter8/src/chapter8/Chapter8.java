
package chapter8;

public class Chapter8 {

    public static void main(String[] args) {
        Polygon firstShape = new Polygon(5);
        firstShape.setSideLength(0, 2);
        firstShape.setSideLength(1, 3);
        firstShape.setSideLength(2, 4);
        firstShape.setSideLength(3, 5);
        firstShape.setSideLength(4, 6);
        
        System.out.println(firstShape.getPerimeter());
        
        
        BankAccount savings = new BankAccount("savings");
        BankAccount checking = new BankAccount("checking");
        
        System.out.println(savings);
        System.out.println(checking);
    }
    
}
