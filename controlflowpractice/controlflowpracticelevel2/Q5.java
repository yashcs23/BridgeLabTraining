package controlflowpracticelevel2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            int j = 1;
            while (j <= i) {
                if (j % 3 == 0 && j % 5 == 0) System.out.println("FizzBuzz");
                else if (j % 3 == 0) System.out.println("Fizz");
                else if (j % 5 == 0) System.out.println("Buzz");
                else System.out.println(j);
                j++;
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
