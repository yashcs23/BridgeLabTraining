package controlflowpracticelevel2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            int j = 1;
            while (j <= i) {
                if (i % j == 0) System.out.println(j);
                j++;
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
