package programmingelementlevel2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double i = input.nextDouble();
        System.out.print("Enter quantity: ");
        int j = input.nextInt();

        double n = i * j;
        System.out.println("The total purchase price is INR " + n + " if the quantity " + j + " and unit price is INR " + i);
    }
}
