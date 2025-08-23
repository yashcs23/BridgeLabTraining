package controlflowpracticelevel1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
    }
}
