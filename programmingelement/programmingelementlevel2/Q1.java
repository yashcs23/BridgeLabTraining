package programmingelementlevel2;
import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double i = input.nextDouble();
        System.out.print("Enter second number: ");
        double j = input.nextDouble();

        double add = i + j;
        double sub = i - j;
        double mul = i * j;
        double div = i / j;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + i + " and " + j +
                " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}
