package programmingelementlevel2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int i = input.nextInt();
        System.out.print("Enter second number: ");
        int j = input.nextInt();

        int n = i / j; 
        int r = i % j;

        System.out.println("The Quotient is " + n + " and Reminder is " + r + " of two number " + i + " and " + j);
    }
}
