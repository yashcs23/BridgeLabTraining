package Q5;

public class FixedDepositAccount extends BankAccount {
    private int depositPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

        public void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Deposit Period: " + depositPeriod + " months");
        }
}
