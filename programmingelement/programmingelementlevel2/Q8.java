package programmingelementlevel2;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double i = input.nextDouble();
        System.out.print("Enter b: ");
        double j = input.nextDouble();
        System.out.print("Enter c: ");
        double n = input.nextDouble();

        double res1 = i + j * n;
        double res2 = i * j + n;
        double res3 = n + i / j;
        double res4 = i % j + n;

        System.out.println("The results of Double Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }
}
