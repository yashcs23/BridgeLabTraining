package controlflowpracticelevel2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 6; j <= 9; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
}
