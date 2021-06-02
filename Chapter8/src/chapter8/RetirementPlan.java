
package chapter8;


public class RetirementPlan {
    private BankAccount savings;
    private BankAccount checking;

    // this is gererally bad form to return a reference to a private data member
    public BankAccount getSavings() {
        return savings;
    }

    // this is gererally bad form to return a reference to a private data member
    public BankAccount getChecking() {
        return checking;
    }
    
    
}
