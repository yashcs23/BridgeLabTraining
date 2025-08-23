package programmingelementlevel2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        int i = input.nextInt();

        int side = i / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + i);
    }
}
