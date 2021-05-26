
package chapter8;


public class BankAccount {
    private static int nextAccountNumber = 1;
    
    private double balance;
    private String name;
    private int accountNumber;

    public BankAccount(String name) {
        this.name = name;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    
    
    public boolean deposit(double amount){
        if ( amount <  0) {
            return false;
        }
        
        balance += amount;
        return true;
    }
    
    public boolean withdraw(double amount){
        if ( amount <  0 || amount > balance ) {
            return false;
        }
        
        balance -= amount;
        return true;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s - Account Number: %d - Balance: $%.2f", 
                name, accountNumber, balance);
    }
    
    public boolean equals(BankAccount other){
        return accountNumber == other.accountNumber;
    }
    
    
}
