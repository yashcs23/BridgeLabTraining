package methodpracticelevel1;

import java.util.Scanner;

class Q3 {
    public static int calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return (5000 / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Rounds needed: " + calculateRounds(a, b, c));
    }
}
