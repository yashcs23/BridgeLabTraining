package Q4;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private boolean loanApplied;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
        this.loanApplied = false;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.03;
    }

    @Override
    public void applyForLoan(double amount) {
        loanApplied = true;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit > 10000;
    }
}
