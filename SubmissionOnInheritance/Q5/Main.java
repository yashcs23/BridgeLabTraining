package Q5;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("789", 25000, 12);
        sa.displayAccountType();
        sa.display();
        System.out.println();
        ca.displayAccountType();
        ca.display();
        System.out.println();
        fda.displayAccountType();
        fda.display();
    }
}
