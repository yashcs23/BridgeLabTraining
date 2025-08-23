package controlflowpracticelevel1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i >= 18) {
            System.out.println("The person's age is " + i + " and can vote.");
        } else {
            System.out.println("The person's age is " + i + " and cannot vote.");
        }
    }
}
