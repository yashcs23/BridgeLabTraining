package arraypracticelevel1;

import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (a[i] % 2 == 0) System.out.println(a[i] + " is positive even");
                else System.out.println(a[i] + " is positive odd");
            } else if (a[i] < 0) {
                System.out.println(a[i] + " is negative");
            } else {
                System.out.println(a[i] + " is zero");
            }
        }
        if (a[0] == a[a.length - 1]) System.out.println("First and last are equal");
        else if (a[0] > a[a.length - 1]) System.out.println("First is greater");
        else System.out.println("Last is greater");
    }
}
