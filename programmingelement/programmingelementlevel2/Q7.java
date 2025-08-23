package programmingelementlevel2;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int i = input.nextInt();
        System.out.print("Enter b: ");
        int j = input.nextInt();
        System.out.print("Enter c: ");
        int n = input.nextInt();

        int res1 = i + j * n;
        int res2 = i * j + n;
        int res3 = n + i / j;
        int res4 = i % j + n;

        System.out.println("The results of Int Operations are " + res1 + ", " + res2 + ", " + res3 + ", and " + res4);
    }
}
