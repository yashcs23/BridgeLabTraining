package Q4;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;
    private boolean loanApplied;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
        this.loanApplied = false;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        loanApplied = true;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}
