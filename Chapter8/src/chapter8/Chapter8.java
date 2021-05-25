
package chapter8;

import java.util.Scanner;

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
        
        askForDeposit(checking);
        savings = askForDeposit(savings);
        
        System.out.println(savings);
        System.out.println(checking);
        
        System.out.println("Area of a circle with a radius of 4: " + MathFun.getArea(4));
    }
    
    public static BankAccount askForDeposit(BankAccount account){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How much did you want to depost to your " + account.getName() + "?");
        double deposit = Double.parseDouble(keyboard.nextLine());
        
        account.deposit(deposit);
        
        account = new BankAccount("I stole your money!");
        
        return account;
    }
    
}
