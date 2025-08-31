package methodpracticelevel2;

import java.util.Scanner;

class Q9 {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return (a > b) ? 1 : (a == b ? 0 : -1); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) System.out.println(arr[i] + " is " + (isEven(arr[i]) ? "Even" : "Odd"));
            else System.out.println(arr[i] + " is Negative");
        }
        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and last equal");
        else if (cmp == 1) System.out.println("First greater than last");
        else System.out.println("First less than last");
    }
}
