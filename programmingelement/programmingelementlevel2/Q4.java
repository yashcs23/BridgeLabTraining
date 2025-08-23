package programmingelementlevel2;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int i = input.nextInt();

        double j = i / 3.0; // yards
        double n = j / 1760; // miles

        System.out.println("The distance in yards is " + j + " while the distance in miles is " + n);
    }
}
