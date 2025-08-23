package controlflowpracticelevel2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0 && i < 100) {
            int j = 100;
            while (j >= 1) {
                if (j % i == 0) System.out.println(j);
                j--;
            }
        } else {
            System.out.println("Not valid");
        }
    }
}
