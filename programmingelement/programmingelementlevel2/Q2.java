package programmingelementlevel2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double i = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double j = input.nextDouble();

        double areaCm2 = 0.5 * i * j;
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq inches is " + areaIn2 + " and sq cm is " + areaCm2);
    }
}
