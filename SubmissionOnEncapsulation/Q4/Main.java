package Q4;

public class Main {
    public static void processAccounts(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            String type = account instanceof SavingsAccount ? "Savings" : "Current";
            System.out.println(type + " Account | Number: " + account.getAccountNumber() + " | Holder: " + account.getHolderName() + " | Balance: " + account.getBalance() + " | Interest: " + interest);
            if (account instanceof Loanable) {
                boolean eligible = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
            }
        }
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("SA1001", "Alice", 12000, 4.5),
            new CurrentAccount("CA2002", "Bob", 8000, 5000)
        };
        processAccounts(accounts);
    }
}
