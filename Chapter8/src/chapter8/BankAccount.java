package chapter8;

public class BankAccount implements Comparable<BankAccount> {

    @Override
    public int compareTo(BankAccount other) {
        // returning a negative value means this account is less than the other account
        // return 0 means they are equivalent
        // returning a positive value means this account is greater than the other account
        return (int)(balance - other.balance);
    }

    public enum AccountType { CHECKING, SAVINGS, MONEYMARKET, CERTIFICATE_OF_DEPOSIT };
    
    private static int nextAccountNumber = 1;

    
    private double balance;
    private String name;
    private int accountNumber;
    private AccountType accountType;

    public BankAccount() {
        this("");// calls other constructor that takes a string argument
    }

    public BankAccount(String name) {
        setName(name);
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
        balance = 0;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }
    
    

    public void setName(String name) {
        this.name = name;
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

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Name: %s - Account Number: %d - Balance: $%.2f - Type: %s",
                name, accountNumber, balance, accountType);
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() != this.getClass()) {
            return false;
        }

        BankAccount otherAccount = (BankAccount) other;

        return accountNumber == otherAccount.accountNumber;
    }

}
