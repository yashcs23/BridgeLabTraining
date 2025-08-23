package controlflowpracticelevel1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Is the first number the largest? " + (i > j && i > n));
        System.out.println("Is the second number the largest? " + (j > i && j > n));
        System.out.println("Is the third number the largest? " + (n > i && n > j));
    }
}
